package p000;

import android.os.Build;
import android.os.Trace;
import java.io.Closeable;

/* renamed from: aech */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aech implements Closeable {

    /* renamed from: a */
    private final boolean f63133a;

    public aech(String str) {
        int i = Build.VERSION.SDK_INT;
        boolean b = cecb.f182244a.mo6606a().mo78750b();
        this.f63133a = b;
        if (b) {
            Trace.beginSection(str.length() > 127 ? str.substring(0, 127) : str);
        }
    }

    public final void close() {
        if (this.f63133a) {
            Trace.endSection();
        }
    }
}
