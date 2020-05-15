package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: idw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idw {
    /* renamed from: a */
    public static bqhh m15304a(rjp rjp) {
        return new bqhh(rjp);
    }

    /* renamed from: b */
    public static Status m15306b(rjp rjp) {
        if (rjp instanceof rki) {
            return new Status(rjp.mo24655a(), rjp.getMessage(), ((rki) rjp).mo24809c());
        }
        return new Status(rjp.mo24655a(), rjp.getMessage());
    }

    /* renamed from: a */
    public static rjp m15305a(Throwable th) {
        if ((th instanceof ExecutionException) || (th instanceof bqhh)) {
            Throwable cause = th.getCause();
            return cause == null ? new rjp(Status.f30109c) : m15305a(cause);
        } else if (th instanceof rjp) {
            return (rjp) th;
        } else {
            return new rjp(Status.f30109c);
        }
    }
}
