package p000;

import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: cayc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayc extends Exception {

    /* renamed from: a */
    public static final Method f176376a;

    /* renamed from: b */
    public IOException f176377b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception e) {
            method = null;
        }
        f176376a = method;
    }

    public cayc(IOException iOException) {
        super(iOException);
        this.f176377b = iOException;
    }
}
