package p000;

import java.util.concurrent.TimeoutException;

/* renamed from: yqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqh extends Exception {
    public yqh(String str) {
        super(str);
    }

    /* renamed from: a */
    public static yqh m44583a(Exception exc) {
        if (exc instanceof InterruptedException) {
            throw ((InterruptedException) exc);
        } else if (!(exc instanceof TimeoutException)) {
            return new yqh(exc);
        } else {
            throw ((TimeoutException) exc);
        }
    }

    public yqh(Throwable th) {
        super(th);
    }
}
