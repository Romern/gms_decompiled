package p000;

import com.google.android.gms.accountsettings.p007mg.poc.model.repository.RepositoryDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: esc */
final /* synthetic */ class esc implements Runnable {

    /* renamed from: a */
    private final RepositoryDatabase f15598a;

    /* renamed from: b */
    private final ExecutorService f15599b;

    /* renamed from: c */
    private final bmzi f15600c;

    public esc(RepositoryDatabase repositoryDatabase, ExecutorService executorService, bmzi bmzi) {
        this.f15598a = repositoryDatabase;
        this.f15599b = executorService;
        this.f15600c = bmzi;
    }

    public final void run() {
        RepositoryDatabase repositoryDatabase = this.f15598a;
        ExecutorService executorService = this.f15599b;
        ((eor) this.f15600c.mo6606a()).f15434a.mo25561g();
        if (!executorService.isShutdown()) {
            executorService.shutdown();
            try {
                executorService.awaitTermination(2000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
            }
        }
        repositoryDatabase.mo9942d();
    }
}
