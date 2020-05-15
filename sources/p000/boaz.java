package p000;

import java.io.Closeable;
import java.lang.reflect.Method;

/* renamed from: boaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boaz implements boba {

    /* renamed from: a */
    static final boaz f132483a = new boaz();

    /* renamed from: b */
    static final Method f132484b;

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (Throwable th) {
            method = null;
        }
        f132484b = method;
    }

    /* renamed from: a */
    public final void mo68840a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                f132484b.invoke(th, th2);
            } catch (Throwable th3) {
                boay.f132482a.mo68840a(closeable, th, th2);
            }
        }
    }
}
