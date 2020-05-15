package p000;

import android.util.Printer;
import java.io.PrintWriter;
import java.io.Writer;

/* renamed from: ssb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssb extends PrintWriter implements Printer {

    /* renamed from: a */
    private final String f45071a;

    /* renamed from: b */
    private final StringBuilder f45072b = new StringBuilder();

    /* renamed from: c */
    private char[] f45073c;

    /* renamed from: d */
    private int f45074d;

    /* renamed from: e */
    private boolean f45075e = true;

    /* renamed from: c */
    private final void m36193c() {
        if (this.f45075e) {
            this.f45075e = false;
            if (this.f45072b.length() != 0) {
                if (this.f45073c == null) {
                    this.f45073c = this.f45072b.toString().toCharArray();
                }
                char[] cArr = this.f45073c;
                super.write(cArr, 0, cArr.length);
            }
        }
    }

    /* renamed from: a */
    public final void mo26034a() {
        this.f45072b.append(this.f45071a);
        this.f45073c = null;
    }

    /* renamed from: b */
    public final void mo26035b() {
        this.f45072b.delete(0, this.f45071a.length());
        this.f45073c = null;
    }

    public final void println() {
        super.println();
        this.f45075e = true;
    }

    public final void write(String str, int i, int i2) {
        write(str.toCharArray(), i, i2);
    }

    public ssb(Writer writer, String str) {
        super(writer);
        this.f45071a = str;
    }

    public final void write(char[] cArr, int i, int i2) {
        this.f45072b.length();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int i5 = i + 1;
            char c = cArr[i];
            this.f45074d++;
            if (c == 10) {
                m36193c();
                super.write(cArr, i4, i5 - i4);
                this.f45075e = true;
                this.f45074d = 0;
                i4 = i5;
            }
            i = i5;
        }
        if (i4 != i) {
            m36193c();
            super.write(cArr, i4, i - i4);
        }
    }
}
