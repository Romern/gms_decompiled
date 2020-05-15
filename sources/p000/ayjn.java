package p000;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: ayjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjn {
    /* renamed from: a */
    public static void m84115a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
