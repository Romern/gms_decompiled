package p000;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: bbmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbmv {

    /* renamed from: a */
    public final bbnn f102934a;

    public bbmv(bbnn bbnn) {
        this.f102934a = bbnn;
    }

    /* renamed from: a */
    public static Object m88201a(bqgg bqgg) {
        try {
            return bqgg.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            bmxy.m108581a(cause);
            bmzo.m108687a(cause, IOException.class);
            throw new IllegalStateException(e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new IOException(e2);
        }
    }
}
