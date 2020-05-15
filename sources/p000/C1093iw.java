package p000;

import java.io.Writer;

/* renamed from: iw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1093iw extends Writer {

    /* renamed from: a */
    private final StringBuilder f21899a = new StringBuilder(128);

    /* renamed from: a */
    private final void m16233a() {
        if (this.f21899a.length() > 0) {
            this.f21899a.toString();
            StringBuilder sb = this.f21899a;
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        m16233a();
    }

    public final void flush() {
        m16233a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m16233a();
            } else {
                this.f21899a.append(c);
            }
        }
    }
}
