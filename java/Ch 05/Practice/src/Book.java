public class Book {
    public String  title   = "";
    public int     price   = 0;
    public String  company = "";
    public String  author  = "";
    public int     page    = 0;
    public String  isbn    = "";

    public String getInformation()
    {
        return title+"\t" +price+"\t"+company+"\t"+author+"\t"+page+"\t"+isbn;
    }
}
