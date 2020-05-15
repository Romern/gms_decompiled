package p000;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: cawi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawi {

    /* renamed from: a */
    public final List f176246a = new ArrayList();

    /* renamed from: b */
    public final cipw f176247b;

    /* renamed from: c */
    public int f176248c;

    /* renamed from: d */
    public int f176249d;

    /* renamed from: e */
    cawh[] f176250e;

    /* renamed from: f */
    int f176251f;

    /* renamed from: g */
    int f176252g;

    /* renamed from: h */
    int f176253h;

    public cawi(ciqr ciqr) {
        cawh[] cawhArr = new cawh[8];
        this.f176250e = cawhArr;
        this.f176251f = cawhArr.length - 1;
        this.f176252g = 0;
        this.f176253h = 0;
        this.f176248c = 4096;
        this.f176249d = 4096;
        this.f176247b = ciqh.m150828a(ciqr);
    }

    /* renamed from: c */
    private final void m127392c() {
        this.f176246a.clear();
        Arrays.fill(this.f176250e, (Object) null);
        this.f176251f = this.f176250e.length - 1;
        this.f176252g = 0;
        this.f176253h = 0;
    }

    /* renamed from: d */
    private final int m127394d() {
        return this.f176247b.mo86305e() & 255;
    }

    /* renamed from: a */
    public final int mo75016a(int i) {
        return this.f176251f + 1 + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final cipx mo75020b() {
        int d = m127394d();
        int a = mo75017a(d, 127);
        if ((d & 128) != 128) {
            return this.f176247b.mo86303d((long) a);
        }
        cawr cawr = cawr.f176281a;
        byte[] g = this.f176247b.mo86314g((long) a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cawq cawq = cawr.f176284b;
        int i = 0;
        byte b = 0;
        for (byte b2 : g) {
            b = (b << 8) | (b2 & 255);
            i += 8;
            while (i >= 8) {
                int i2 = i - 8;
                cawq = cawq.f176278a[(b >>> i2) & 255];
                if (cawq.f176278a == null) {
                    byteArrayOutputStream.write(cawq.f176279b);
                    i -= cawq.f176280c;
                    cawq = cawr.f176284b;
                } else {
                    i = i2;
                }
            }
        }
        while (i > 0) {
            cawq cawq2 = cawq.f176278a[(b << (8 - i)) & 255];
            if (cawq2.f176278a != null || cawq2.f176280c > i) {
                break;
            }
            byteArrayOutputStream.write(cawq2.f176279b);
            i -= cawq2.f176280c;
            cawq = cawr.f176284b;
        }
        return cipx.m150786a(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: c */
    public static final boolean m127393c(int i) {
        return i >= 0 && i <= cawk.f176255a.length + -1;
    }

    /* renamed from: d */
    private final void m127395d(int i) {
        int i2;
        if (i > 0) {
            int length = this.f176250e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f176251f;
                if (length >= i2 && i > 0) {
                    int i4 = this.f176250e[length].f176245j;
                    i -= i4;
                    this.f176253h -= i4;
                    this.f176252g--;
                    i3++;
                    length--;
                }
            }
            cawh[] cawhArr = this.f176250e;
            int i5 = i2 + 1;
            System.arraycopy(cawhArr, i5, cawhArr, i5 + i3, this.f176252g);
            this.f176251f += i3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo75017a(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int d = m127394d();
            if ((d & 128) == 0) {
                return i2 + (d << i4);
            }
            i2 += (d & 127) << i4;
            i4 += 7;
        }
    }

    /* renamed from: a */
    public final void mo75018a() {
        int i = this.f176249d;
        int i2 = this.f176253h;
        if (i >= i2) {
            return;
        }
        if (i != 0) {
            m127395d(i2 - i);
        } else {
            m127392c();
        }
    }

    /* renamed from: a */
    public final void mo75019a(cawh cawh) {
        this.f176246a.add(cawh);
        int i = cawh.f176245j;
        int i2 = this.f176249d;
        if (i > i2) {
            m127392c();
            return;
        }
        m127395d((this.f176253h + i) - i2);
        int i3 = this.f176252g;
        cawh[] cawhArr = this.f176250e;
        int length = cawhArr.length;
        if (i3 + 1 > length) {
            cawh[] cawhArr2 = new cawh[(length + length)];
            System.arraycopy(cawhArr, 0, cawhArr2, length, length);
            this.f176251f = this.f176250e.length - 1;
            this.f176250e = cawhArr2;
        }
        int i4 = this.f176251f;
        this.f176251f = i4 - 1;
        this.f176250e[i4] = cawh;
        this.f176252g++;
        this.f176253h += i;
    }

    /* renamed from: b */
    public final cipx mo75021b(int i) {
        if (m127393c(i)) {
            return cawk.f176255a[i].f176243h;
        }
        return this.f176250e[mo75016a(i - cawk.f176255a.length)].f176243h;
    }
}
