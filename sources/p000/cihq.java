package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: cihq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihq {

    /* renamed from: a */
    public final List f190351a = new ArrayList();

    /* renamed from: b */
    public final cipw f190352b;

    /* renamed from: c */
    public int f190353c;

    /* renamed from: d */
    public int f190354d;

    /* renamed from: e */
    cihp[] f190355e;

    /* renamed from: f */
    int f190356f;

    /* renamed from: g */
    int f190357g;

    /* renamed from: h */
    int f190358h;

    public cihq(ciqr ciqr) {
        cihp[] cihpArr = new cihp[8];
        this.f190355e = cihpArr;
        this.f190356f = cihpArr.length - 1;
        this.f190357g = 0;
        this.f190358h = 0;
        this.f190353c = 4096;
        this.f190354d = 4096;
        this.f190352b = ciqh.m150828a(ciqr);
    }

    /* renamed from: c */
    private final void m150326c() {
        Arrays.fill(this.f190355e, (Object) null);
        this.f190356f = this.f190355e.length - 1;
        this.f190357g = 0;
        this.f190358h = 0;
    }

    /* renamed from: d */
    private final int m150328d() {
        return this.f190352b.mo86305e() & 255;
    }

    /* renamed from: a */
    public final int mo86117a(int i) {
        return this.f190356f + 1 + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final cipx mo86121b() {
        int d = m150328d();
        int a = mo86118a(d, 127);
        if ((d & 128) != 128) {
            return this.f190352b.mo86303d((long) a);
        }
        cihz cihz = cihz.f190389a;
        byte[] g = this.f190352b.mo86314g((long) a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cihy cihy = cihz.f190392b;
        int i = 0;
        byte b = 0;
        for (byte b2 : g) {
            b = (b << 8) | (b2 & 255);
            i += 8;
            while (i >= 8) {
                int i2 = i - 8;
                cihy = cihy.f190386a[(b >>> i2) & 255];
                if (cihy.f190386a == null) {
                    byteArrayOutputStream.write(cihy.f190387b);
                    i -= cihy.f190388c;
                    cihy = cihz.f190392b;
                } else {
                    i = i2;
                }
            }
        }
        while (i > 0) {
            cihy cihy2 = cihy.f190386a[(b << (8 - i)) & 255];
            if (cihy2.f190386a != null || cihy2.f190388c > i) {
                break;
            }
            byteArrayOutputStream.write(cihy2.f190387b);
            i -= cihy2.f190388c;
            cihy = cihz.f190392b;
        }
        return cipx.m150786a(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: c */
    public static final boolean m150327c(int i) {
        return i >= 0 && i <= cihs.f190365b.length + -1;
    }

    /* renamed from: d */
    private final void m150329d(int i) {
        int i2;
        if (i > 0) {
            int length = this.f190355e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f190356f;
                if (length >= i2 && i > 0) {
                    int i4 = this.f190355e[length].f190350h;
                    i -= i4;
                    this.f190358h -= i4;
                    this.f190357g--;
                    i3++;
                    length--;
                }
            }
            cihp[] cihpArr = this.f190355e;
            int i5 = i2 + 1;
            System.arraycopy(cihpArr, i5, cihpArr, i5 + i3, this.f190357g);
            this.f190356f += i3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo86118a(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int d = m150328d();
            if ((d & 128) == 0) {
                return i2 + (d << i4);
            }
            i2 += (d & 127) << i4;
            i4 += 7;
        }
    }

    /* renamed from: a */
    public final void mo86119a() {
        int i = this.f190354d;
        int i2 = this.f190358h;
        if (i >= i2) {
            return;
        }
        if (i != 0) {
            m150329d(i2 - i);
        } else {
            m150326c();
        }
    }

    /* renamed from: a */
    public final void mo86120a(cihp cihp) {
        this.f190351a.add(cihp);
        int i = cihp.f190350h;
        int i2 = this.f190354d;
        if (i > i2) {
            m150326c();
            return;
        }
        m150329d((this.f190358h + i) - i2);
        int i3 = this.f190357g;
        cihp[] cihpArr = this.f190355e;
        int length = cihpArr.length;
        if (i3 + 1 > length) {
            cihp[] cihpArr2 = new cihp[(length + length)];
            System.arraycopy(cihpArr, 0, cihpArr2, length, length);
            this.f190356f = this.f190355e.length - 1;
            this.f190355e = cihpArr2;
        }
        int i4 = this.f190356f;
        this.f190356f = i4 - 1;
        this.f190355e[i4] = cihp;
        this.f190357g++;
        this.f190358h += i;
    }

    /* renamed from: b */
    public final cipx mo86122b(int i) {
        if (m150327c(i)) {
            return cihs.f190365b[i].f190348f;
        }
        int a = mo86117a(i - cihs.f190365b.length);
        if (a >= 0) {
            cihp[] cihpArr = this.f190355e;
            if (a < cihpArr.length) {
                return cihpArr[a].f190348f;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Header index too large ");
        sb.append(i + 1);
        throw new IOException(sb.toString());
    }
}
