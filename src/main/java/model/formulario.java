package model;

import java.util.InputMismatchException;

public class formulario {
    private String nome, end, email, cpf, tel;

    public static boolean isCPF(String cpf) {
        if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
            (cpf.length() != 11))
            return(false);

        char d10, d11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                d10 = '0';
            else d10 = (char)(r + 48);

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 d11 = '0';
            else d11 = (char)(r + 48);

            if ((d10 == cpf.charAt(9)) && (d11 == cpf.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }


    public static String imprimeCPF(String cpf) {
        return(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
        cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
    }
    public static String imprimeTel(String tel) {
        return("("+tel.substring(0, 2) + ")" + tel.substring(3, 4) + "." +
        tel.substring(5, 8) + "." + tel.substring(8, 11));
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}