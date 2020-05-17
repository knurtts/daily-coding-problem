interface jobInterface {
    String message = "The job is running!";
    String doJob();
}

public class Job implements jobInterface {

    static void task() {
        Job job = new Job();
        job.doJob();
    }

    @Override
    public String doJob() {
        return message;
    }
}