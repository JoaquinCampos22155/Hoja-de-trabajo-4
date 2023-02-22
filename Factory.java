public class Factory {
    
    /** 
     * @param x
     * @return FunStack<T>
     */
    public static <T> FunStack<T> createStack(String x) {
        switch (x) {
            case "1":
            return new FormaVector<T>();
            case "2":
            return new FormaSLL<T>();  
            case "3":
                return new FormaDLL<T>();
            case "4":
            return new FormaArrayL<T>();
            default:
                throw new IllegalArgumentException("error intentelo de nuevo");
            }
        }
    }

