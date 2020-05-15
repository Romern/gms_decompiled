package p000;

import java.io.Writer;

/* renamed from: alnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alnr extends Writer {

    /* renamed from: a */
    final StringBuilder f73860a = new StringBuilder();

    public final void close() {
    }

    public final void flush() {
    }

    public final void write(char[] cArr, int i, int i2) {
        this.f73860a.append(new String(cArr, i, i2));
    }
}
