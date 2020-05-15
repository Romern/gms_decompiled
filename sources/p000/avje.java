package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: avje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avje {
    /* renamed from: a */
    public static Object m78606a(bqgg bqgg) {
        try {
            return bqgg.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new aaaj(14, "Operation thread interrupted!", null, e);
        } catch (ExecutionException e2) {
            throw new aaaj(13, "Operation failed with an execution exception!", null, e2);
        }
    }
}
