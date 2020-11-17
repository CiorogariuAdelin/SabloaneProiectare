package Lab6;

public class StatisticsCommand implements command{
    @Override
    public void execute() {
        Book book1= DocumentManager.getInstance().getBook();
        if(book1 != null)
        { BookStatistics stats = new BookStatistics();
        book1.accept(stats);
        stats.printStatistics();
    }
}}
