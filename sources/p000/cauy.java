package p000;

import java.io.Closeable;

/* renamed from: cauy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cauy implements Closeable {

    /* renamed from: a */
    public final ciqr[] f176093a;

    public cauy(ciqr[] ciqrArr) {
        this.f176093a = ciqrArr;
    }

    public final void close() {
        for (ciqr ciqr : this.f176093a) {
            cavk.m127310a(ciqr);
        }
    }
}
