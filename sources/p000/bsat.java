package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: bsat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsat {
    /* renamed from: a */
    public static void m114959a(bsav bsav) {
        if (bsav != null) {
            try {
                bsav.f143908a.disconnect();
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: a */
    public static void m114960a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: a */
    public static void m114961a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable th) {
            }
        }
    }
}
