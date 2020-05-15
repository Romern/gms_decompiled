package p000;

import java.util.Currency;

/* renamed from: casz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casz implements casy {

    /* renamed from: a */
    public final int f175794a;

    /* renamed from: b */
    private final Currency f175795b;

    /* renamed from: c */
    private final double f175796c;

    /* renamed from: d */
    private final boolean f175797d;

    /* renamed from: e */
    private final int f175798e;

    /* renamed from: f */
    private final int f175799f;

    /* renamed from: g */
    private final int f175800g;

    /* renamed from: h */
    private final int f175801h;

    /* renamed from: i */
    private final int f175802i;

    public casz(byte[] bArr, byte[] bArr2, caok caok, caon caon) {
        cask cask;
        int i;
        byte[] a = caon.mo74730a("9F33");
        if (a != null) {
            cask = new cask(a);
        } else {
            cask = null;
        }
        byte[] bArr3 = caok.f175450b;
        byte b = caok.f175458j;
        casj a2 = casj.m127093a(caok.f175451c);
        byte[] bArr4 = caok.f175457i;
        byte[] bArr5 = caok.f175453e;
        this.f175798e = casw.m127118a(bArr);
        this.f175800g = catd.m127150a(b, bArr4, bArr3);
        int i2 = 2;
        int i3 = 3;
        if (cask == null || cask.f175767a[1] == 0) {
            i = !a2.mo74819a() ? 3 : 2;
        } else {
            i = !cask.mo74821a() ? (cask.f175767a[1] & 240) == 0 ? 3 : 2 : 1;
        }
        this.f175799f = i;
        if (cask == null) {
            i2 = !a2.mo74819a() ? 5 : 1;
        } else if (cask.mo74821a() || a2.mo74819a()) {
            i2 = 1;
        } else {
            byte b2 = cask.f175767a[1];
            if ((b2 & 96) != 96) {
                byte b3 = b2 & 248;
                if (b3 != 64) {
                    i2 = b3 != 32 ? 5 : 3;
                }
            } else {
                i2 = 4;
            }
        }
        this.f175801h = i2;
        Currency a3 = catf.m127155a(bArr5);
        this.f175795b = a3;
        this.f175796c = catf.m127153a(bArr3, a3);
        this.f175797d = a2.mo74819a();
        int a4 = C1708cast.m127114a(caok.f175455g);
        if (a4 == 3) {
            i3 = 1;
        } else if (a4 == 4) {
            i3 = 1;
        }
        this.f175802i = i3;
        this.f175794a = casu.m127116a(caok.f175452d, bArr2);
    }

    /* renamed from: a */
    public final Currency mo74829a() {
        return this.f175795b;
    }

    /* renamed from: b */
    public final double mo74830b() {
        return this.f175796c;
    }

    /* renamed from: c */
    public final boolean mo74831c() {
        return this.f175797d;
    }

    /* renamed from: d */
    public final int mo74832d() {
        return this.f175799f;
    }

    /* renamed from: e */
    public final int mo74833e() {
        return this.f175800g;
    }

    /* renamed from: f */
    public final int mo74834f() {
        return this.f175801h;
    }

    /* renamed from: g */
    public final int mo74835g() {
        return this.f175802i;
    }

    public final String toString() {
        Currency currency = this.f175795b;
        String currencyCode = currency != null ? currency.getCurrencyCode() : "null";
        String cls = casz.class.toString();
        String a = casw.m127119a(this.f175798e);
        String a2 = casx.m127120a(this.f175802i);
        String a3 = catc.m127149a(this.f175799f);
        String a4 = catd.m127151a(this.f175800g);
        String a5 = casv.m127117a(this.f175801h);
        double d = this.f175796c;
        boolean z = this.f175797d;
        int length = String.valueOf(cls).length();
        int length2 = a.length();
        int length3 = a2.length();
        int length4 = a3.length();
        StringBuilder sb = new StringBuilder(length + 249 + length2 + length3 + length4 + a4.length() + a5.length() + String.valueOf(currencyCode).length());
        sb.append(cls);
        sb.append("\n  Product Type: ");
        sb.append(a);
        sb.append("\n  Terminal Request: ");
        sb.append(a2);
        sb.append("\n  Transaction Range: ");
        sb.append(a3);
        sb.append("\n  Transaction Type: ");
        sb.append(a4);
        sb.append("\n  ExpectedUserActionOnPoi: ");
        sb.append(a5);
        sb.append("\n  Currency: ");
        sb.append(currencyCode);
        sb.append("\n  Authorized Amount: ");
        sb.append(d);
        sb.append("\n  Other Amount: ");
        sb.append(0.0d);
        sb.append("\n  Has Terminal Delegated CD CVM: ");
        sb.append(z);
        sb.append("\n");
        return sb.toString();
    }
}
