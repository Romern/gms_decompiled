package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahhf {
    /* renamed from: a */
    public static int m55770a(String str, Future future) {
        try {
            return ((Integer) future.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the status.", str);
            if (!(e instanceof InterruptedException)) {
                return 13;
            }
            Thread.currentThread().interrupt();
            return 13;
        }
    }

    /* renamed from: b */
    public static int m55776b(String str, aucb aucb, long j) {
        try {
            aucu.m76783a(aucb, j, TimeUnit.MILLISECONDS);
            return 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the task.", str);
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Exception e2 = aucb.mo50387e();
            if (e2 instanceof rjp) {
                return ((rjp) e2).mo24655a();
            }
            return 13;
        }
    }

    /* renamed from: c */
    public static Object m55778c(String str, Future future, long j) {
        try {
            return future.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the result.", str);
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* renamed from: a */
    public static int m55771a(String str, Future future, long j) {
        try {
            return ((Integer) future.get(j, TimeUnit.MILLISECONDS)).intValue();
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the status.", str);
            if (!(e instanceof InterruptedException)) {
                return 13;
            }
            Thread.currentThread().interrupt();
            return 13;
        }
    }

    /* renamed from: a */
    public static aucb m55772a(bqgg bqgg, long j) {
        return aucu.m76780a(ahhr.m55806b(), new ahhe(bqgg, j));
    }

    /* renamed from: b */
    public static boolean m55777b(String str, Future future, long j) {
        try {
            future.get(j, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the result.", str);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* renamed from: a */
    public static Object m55773a(String str, aucb aucb, long j) {
        try {
            aucu.m76783a(aucb, j, TimeUnit.MILLISECONDS);
            return aucb.mo50386d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the task.", str);
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* renamed from: a */
    public static void m55774a(String str, CountDownLatch countDownLatch) {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the latch.", str);
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    public static void m55775a(String str, CountDownLatch countDownLatch, long j) {
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed %s while waiting for the latch.", str);
            Thread.currentThread().interrupt();
        }
    }
}
