package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: afyg */
final /* synthetic */ class afyg implements Callable {

    /* renamed from: a */
    private final bngx f64964a;

    public afyg(bngx bngx) {
        this.f64964a = bngx;
    }

    public final Object call() {
        bnre i = this.f64964a.listIterator();
        while (i.hasNext()) {
            try {
                ((bqgg) i.next()).get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                bmxy.m108581a(cause);
                bmzo.m108686a(cause);
                bmzo.m108687a(cause, InterruptedException.class);
                throw new afya(cause);
            }
        }
        return null;
    }
}
