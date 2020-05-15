package p000;

import java.util.Arrays;

/* renamed from: cihr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihr {

    /* renamed from: a */
    public final cipu f190359a;

    /* renamed from: b */
    cihp[] f190360b;

    /* renamed from: c */
    int f190361c;

    /* renamed from: d */
    public int f190362d;

    /* renamed from: e */
    private int f190363e;

    public cihr(cipu cipu) {
        cihp[] cihpArr = new cihp[8];
        this.f190360b = cihpArr;
        this.f190362d = cihpArr.length - 1;
        this.f190359a = cipu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86123a(int i, int i2, int i3) {
        if (i >= i2) {
            this.f190359a.mo86316h(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f190359a.mo86316h(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f190359a.mo86316h(i4);
            return;
        }
        this.f190359a.mo86316h(i | i3);
    }

    /* renamed from: a */
    public final void mo86124a(cihp cihp) {
        int i;
        int i2 = cihp.f190350h;
        if (i2 > 4096) {
            Arrays.fill(this.f190360b, (Object) null);
            this.f190362d = this.f190360b.length - 1;
            this.f190361c = 0;
            this.f190363e = 0;
            return;
        }
        int i3 = (this.f190363e + i2) - 4096;
        if (i3 > 0) {
            int length = this.f190360b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.f190362d;
                if (length >= i && i3 > 0) {
                    int i5 = this.f190360b[length].f190350h;
                    i3 -= i5;
                    this.f190363e -= i5;
                    this.f190361c--;
                    i4++;
                    length--;
                }
            }
            cihp[] cihpArr = this.f190360b;
            int i6 = i + 1;
            System.arraycopy(cihpArr, i6, cihpArr, i6 + i4, this.f190361c);
            this.f190362d += i4;
        }
        int i7 = this.f190361c;
        cihp[] cihpArr2 = this.f190360b;
        int length2 = cihpArr2.length;
        if (i7 + 1 > length2) {
            cihp[] cihpArr3 = new cihp[(length2 + length2)];
            System.arraycopy(cihpArr2, 0, cihpArr3, length2, length2);
            this.f190362d = this.f190360b.length - 1;
            this.f190360b = cihpArr3;
        }
        int i8 = this.f190362d;
        this.f190362d = i8 - 1;
        this.f190360b[i8] = cihp;
        this.f190361c++;
        this.f190363e += i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86125a(cipx cipx) {
        mo86123a(cipx.mo86345e(), 127, 0);
        this.f190359a.mo86292b(cipx);
    }
}
