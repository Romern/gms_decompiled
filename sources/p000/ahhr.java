package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ahhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahhr {
    /* renamed from: b */
    public static bqgj m55806b() {
        return m55803a(snp.m35704b(9));
    }

    /* renamed from: c */
    public static bqgj m55807c() {
        return m55803a(snp.m35704b(10));
    }

    /* renamed from: a */
    public static bqgj m55802a(int i) {
        return m55803a(sne.m35694a(i, 9));
    }

    /* renamed from: a */
    private static bqgj m55803a(bqgj bqgj) {
        if (cfnv.f184625a.mo6606a().mo81757aP()) {
            return new ahhh(bqgj);
        }
        if (bqgj instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) bqgj).setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        }
        return bqgj;
    }

    /* renamed from: a */
    public static ScheduledExecutorService m55804a() {
        snf a = snp.m35703a(1, 9);
        return cfnv.f184625a.mo6606a().mo81769ab() ? new ahhj(a) : a;
    }

    /* renamed from: a */
    public static void m55805a(ExecutorService executorService, String str) {
        executorService.shutdown();
        try {
            if (executorService.awaitTermination(500, TimeUnit.MILLISECONDS)) {
                ((bnsl) ahfp.f67119a.mo68390d()).mo68420a("Successfully shutdown executor %s.", str);
            } else {
                ((bnsl) ahfp.f67119a.mo68390d()).mo68420a("Failed to shutdown executor %s.", str);
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Had to force shutdown of executor %s, expect crashes from NullPointerExceptions.", str);
            Thread.currentThread().interrupt();
        }
    }
}
