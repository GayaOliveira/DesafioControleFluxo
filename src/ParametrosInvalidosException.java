public class ParametrosInvalidosException extends RuntimeException{

    ParametrosInvalidosException(String msg){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

}
