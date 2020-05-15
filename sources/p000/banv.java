package p000;

import java.io.IOException;

/* renamed from: banv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class banv extends IOException {
    public banv(String str) {
        super(str);
    }

    /* renamed from: a */
    public static banv m87235a(IOException iOException) {
        if (iOException instanceof banv) {
            throw ((banv) iOException);
        }
        throw new banv("Generic IOException encountered", iOException);
    }

    public banv(String str, Throwable th) {
        super(str, th);
    }
}
