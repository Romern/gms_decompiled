package p000;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: becs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becs {

    /* renamed from: a */
    final long f106915a;

    /* renamed from: b */
    final long f106916b;

    /* renamed from: c */
    final boolean f106917c;

    public becs(long j, long j2, boolean z) {
        this.f106915a = j;
        this.f106916b = j2;
        this.f106917c = z;
    }

    /* renamed from: a */
    public static Object m91795a(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
