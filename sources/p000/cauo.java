package p000;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: cauo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cauo implements Closeable {
    /* renamed from: a */
    public final InputStream mo74923a() {
        return mo74924b().mo86298c();
    }

    /* renamed from: b */
    public abstract cipw mo74924b();

    public final void close() {
        mo74924b().close();
    }
}
