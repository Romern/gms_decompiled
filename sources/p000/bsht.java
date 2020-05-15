package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: bsht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsht implements Closeable, Flushable {

    /* renamed from: e */
    private static final String[] f144623e = new String[128];

    /* renamed from: f */
    private static final String[] f144624f;

    /* renamed from: a */
    public final Writer f144625a;

    /* renamed from: b */
    public int f144626b = 0;

    /* renamed from: c */
    public boolean f144627c;

    /* renamed from: d */
    public String f144628d;

    /* renamed from: g */
    private int[] f144629g = new int[32];

    /* renamed from: h */
    private final String f144630h;

    static {
        for (int i = 0; i <= 31; i++) {
            f144623e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f144623e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f144624f = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public bsht(Writer writer) {
        m115809a(6);
        this.f144630h = ":";
        this.f144625a = writer;
    }

    /* renamed from: a */
    private final void m115809a(int i) {
        int i2 = this.f144626b;
        int[] iArr = this.f144629g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 + i2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f144629g = iArr2;
        }
        int[] iArr3 = this.f144629g;
        int i3 = this.f144626b;
        this.f144626b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b */
    private final void m115810b(int i) {
        this.f144629g[this.f144626b - 1] = i;
    }

    /* renamed from: d */
    private final int m115811d() {
        int i = this.f144626b;
        if (i != 0) {
            return this.f144629g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: c */
    public final void mo70621c() {
        if (this.f144628d != null) {
            mo70616a();
        }
        mo70620b();
        this.f144625a.write("null");
    }

    public final void close() {
        this.f144625a.close();
        int i = this.f144626b;
        if (i > 1 || (i == 1 && this.f144629g[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f144626b = 0;
    }

    public final void flush() {
        if (this.f144626b != 0) {
            this.f144625a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: b */
    public final void mo70620b() {
        int d = m115811d();
        if (d == 1) {
            m115810b(2);
        } else if (d == 2) {
            this.f144625a.append(',');
        } else if (d != 4) {
            if (d != 6) {
                if (d != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f144627c) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m115810b(7);
        } else {
            this.f144625a.append((CharSequence) this.f144630h);
            m115810b(5);
        }
    }

    /* renamed from: a */
    public final void mo70616a() {
        if (this.f144628d != null) {
            int d = m115811d();
            if (d == 5) {
                this.f144625a.write(44);
            } else if (d != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m115810b(4);
            mo70619a(this.f144628d);
            this.f144628d = null;
        }
    }

    /* renamed from: a */
    public final void mo70617a(int i, int i2, String str) {
        int d = m115811d();
        if (d != i2 && d != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f144628d == null) {
            this.f144626b--;
            this.f144625a.write(str);
        } else {
            throw new IllegalStateException("Dangling name: " + this.f144628d);
        }
    }

    /* renamed from: a */
    public final void mo70618a(int i, String str) {
        mo70620b();
        m115809a(i);
        this.f144625a.write(str);
    }

    /* renamed from: a */
    public final void mo70619a(String str) {
        String str2;
        String[] strArr = f144623e;
        this.f144625a.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f144625a.write(str, i, i2 - i);
            }
            this.f144625a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f144625a.write(str, i, length - i);
        }
        this.f144625a.write("\"");
    }
}
