package p000;

import java.io.FilterWriter;
import java.io.Writer;

/* renamed from: bfol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfol extends FilterWriter {

    /* renamed from: a */
    private final int f114553a = 1024;

    /* renamed from: b */
    private int f114554b = 0;

    public bfol(Writer writer) {
        super(writer);
    }

    public final void write(int i) {
        if (this.f114554b == this.f114553a) {
            this.out.write(10);
            this.f114554b = 0;
        }
        this.out.write(i);
        this.f114554b++;
    }

    public final void write(String str, int i, int i2) {
        while (true) {
            int i3 = this.f114554b;
            int i4 = this.f114553a;
            if (i3 + i2 > i4) {
                int i5 = i4 - i3;
                this.out.write(str, i, i5);
                this.out.write(10);
                i += i5;
                i2 -= i5;
                this.f114554b = 0;
            } else {
                this.out.write(str, i, i2);
                this.f114554b += i2;
                return;
            }
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        while (true) {
            int i3 = this.f114554b;
            int i4 = this.f114553a;
            if (i3 + i2 > i4) {
                int i5 = i4 - i3;
                this.out.write(cArr, i, i5);
                this.out.write(10);
                i += i5;
                i2 -= i5;
                this.f114554b = 0;
            } else {
                this.out.write(cArr, i, i2);
                this.f114554b += i2;
                return;
            }
        }
    }
}
