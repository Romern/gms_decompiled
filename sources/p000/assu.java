package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: assu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class assu {

    /* renamed from: b */
    public final int f89619b;

    protected assu(int i) {
        int c = m74717c(i);
        if (c != 1) {
            if (((i >> ((c - 1) * 8)) & 31) != 31) {
                throw new assx(i);
            }
        } else if ((i & 31) == 31) {
            throw new assx(i);
        }
        this.f89619b = i;
    }

    /* renamed from: a */
    public static assu m74713a(byte[] bArr) {
        return m74715b(bArr, 0);
    }

    /* renamed from: b */
    protected static assu m74715b(byte[] bArr, int i) {
        asst asst = new asst(bArr, i);
        int a = asst.mo49444a();
        int b = asst.mo49445b();
        int i2 = asst.f89618b;
        if (!m74716b(a)) {
            return asss.m74706a(a, b, bArr, i2);
        }
        assr assr = new assr(a);
        int i3 = i2 + b;
        int i4 = i2;
        while (i4 < i3) {
            assu b2 = m74715b(bArr, i4);
            assr.f89614a.add(b2);
            i4 += b2.mo49451f();
        }
        if (i4 == i3) {
            return assr;
        }
        throw new assw(b, i4 - i2);
    }

    /* renamed from: c */
    public static int m74717c(int i) {
        int d = m74718d(i);
        if (d != -1) {
            return d;
        }
        throw new assx(i);
    }

    /* renamed from: d */
    private static int m74718d(int i) {
        if ((i & -256) == 0) {
            return 1;
        }
        if ((-65536 & i) != 0) {
            return (i & -16777216) != 0 ? -1 : 3;
        }
        return 2;
    }

    /* renamed from: e */
    private static int m74719e(int i) {
        if (i < 0) {
            return -1;
        }
        if (i <= 127) {
            return 1;
        }
        if (i > 255) {
            return i <= 65535 ? 3 : -1;
        }
        return 2;
    }

    /* renamed from: g */
    private final int m74720g() {
        int d = m74718d(this.f89619b);
        if (d != -1) {
            return d;
        }
        String valueOf = String.valueOf(mo49450e());
        throw new assz(valueOf.length() == 0 ? new String("Invalid tag: ") : "Invalid tag: ".concat(valueOf));
    }

    /* renamed from: a */
    public abstract int mo49436a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo49437a(byte[] bArr, int i);

    /* renamed from: f */
    public final int mo49451f() {
        int g = m74720g();
        int a = mo49436a();
        int e = m74719e(a);
        if (e != -1) {
            return g + e + mo49436a();
        }
        String valueOf = String.valueOf(Integer.toHexString(a));
        throw new assz(valueOf.length() == 0 ? new String("Invalid length: ") : "Invalid length: ".concat(valueOf));
    }

    /* renamed from: h */
    public byte[] mo49442h() {
        byte[] bArr = new byte[mo49436a()];
        mo49437a(bArr, 0);
        return bArr;
    }

    /* renamed from: a */
    public static String m74714a(int i) {
        int i2;
        try {
            i2 = 4 - m74717c(i);
        } catch (assx e) {
            i2 = 0;
        }
        return asti.m74760a(Arrays.copyOfRange(bqcn.m112583a(i), i2, 4)).toUpperCase(Locale.US);
    }

    /* renamed from: d */
    public final byte[] mo49449d() {
        int f = mo49451f();
        byte[] bArr = new byte[f];
        int c = mo49447c(bArr, 0);
        if (f == c) {
            return bArr;
        }
        throw new assw(f, c);
    }

    /* renamed from: e */
    public final String mo49450e() {
        return m74714a(this.f89619b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo49447c(byte[] bArr, int i) {
        int g = (m74720g() - 1) * 8;
        while (g >= 0) {
            bArr[i] = (byte) ((this.f89619b >> g) & 255);
            g -= 8;
            i++;
        }
        int a = mo49436a();
        int e = m74719e(a);
        if (e != -1) {
            if (e > 1) {
                e--;
                bArr[i] = (byte) (e | 128);
                i++;
            }
            int i2 = (e - 1) * 8;
            while (i2 >= 0) {
                bArr[i] = (byte) ((a >> i2) & 255);
                i2 -= 8;
                i++;
            }
            return mo49437a(bArr, i);
        }
        throw new assw(a);
    }

    /* renamed from: a */
    public final assu mo49446a(SparseArray sparseArray, assu assu) {
        int i = assu.f89619b;
        if (!m74716b(i)) {
            srl srl = (srl) sparseArray.get(i);
            return asta.m74733a(i, srl != null ? (byte[]) srl.mo21850a(assu.mo49442h()) : assu.mo49442h());
        }
        ArrayList arrayList = new ArrayList();
        for (assu assu2 : assu.mo49448c().mo49440b()) {
            arrayList.add(mo49446a(sparseArray, assu2));
        }
        return asta.m74730a(i, arrayList);
    }

    /* renamed from: b */
    static boolean m74716b(int i) {
        int c = m74717c(i);
        if (c == 1) {
            return (i & 32) != 0;
        }
        if (c == 2) {
            return (i & 8192) != 0;
        }
        if (c == 3) {
            return (i & 2097152) != 0;
        }
        throw new assx(i);
    }

    /* renamed from: c */
    public final assr mo49448c() {
        if (m74716b(this.f89619b)) {
            return (assr) this;
        }
        String valueOf = String.valueOf(mo49450e());
        throw new assx(valueOf.length() == 0 ? new String("Not constructed: ") : "Not constructed: ".concat(valueOf));
    }
}
