package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: ascs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascs {
    /* renamed from: a */
    public static Status m73792a(aucb aucb) {
        try {
            aucu.m76782a(aucb);
            return Status.f30107a;
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return m73793a(aucb.mo50387e());
        }
    }

    /* renamed from: a */
    public static Status m73793a(Exception exc) {
        if (exc instanceof rjp) {
            return m73794a((rjp) exc);
        }
        if (exc instanceof ExecutionException) {
            Throwable cause = exc.getCause();
            if (cause instanceof rjp) {
                return m73794a((rjp) cause);
            }
        }
        return Status.f30109c;
    }

    /* renamed from: a */
    private static Status m73794a(rjp rjp) {
        return new Status(rjp.mo24655a());
    }
}
