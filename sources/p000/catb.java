package p000;

import java.util.Currency;

/* renamed from: catb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catb implements casy {

    /* renamed from: a */
    private final Currency f175813a;

    /* renamed from: b */
    private final double f175814b;

    /* renamed from: c */
    private final double f175815c;

    /* renamed from: d */
    private final int f175816d;

    public catb(byte[] bArr, caro caro) {
        byte b = caro.f175686g[0];
        byte[] bArr2 = caro.f175680a;
        byte[] bArr3 = caro.f175681b;
        byte[] bArr4 = caro.f175684e;
        this.f175816d = catd.m127150a(b, null, bArr2);
        Currency a = catf.m127155a(bArr4);
        this.f175813a = a;
        this.f175814b = catf.m127153a(bArr2, a);
        this.f175815c = catf.m127156b(bArr3, this.f175813a);
        casu.m127116a(caro.f175682c, bArr);
    }

    /* renamed from: a */
    public final Currency mo74829a() {
        return this.f175813a;
    }

    /* renamed from: b */
    public final double mo74830b() {
        return this.f175814b;
    }

    /* renamed from: c */
    public final boolean mo74831c() {
        return false;
    }

    /* renamed from: d */
    public final int mo74832d() {
        return 3;
    }

    /* renamed from: e */
    public final int mo74833e() {
        return this.f175816d;
    }

    /* renamed from: f */
    public final int mo74834f() {
        return 1;
    }

    /* renamed from: g */
    public final int mo74835g() {
        return 1;
    }

    public final String toString() {
        Currency currency = this.f175813a;
        String currencyCode = currency != null ? currency.getCurrencyCode() : "null";
        String cls = catb.class.toString();
        String a = casw.m127119a(3);
        String a2 = casx.m127120a(1);
        String a3 = catc.m127149a(3);
        String a4 = catd.m127151a(this.f175816d);
        String a5 = casv.m127117a(1);
        double d = this.f175814b;
        double d2 = this.f175815c;
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
        sb.append(d2);
        sb.append("\n  Has Terminal Delegated CD CVM: false\n");
        return sb.toString();
    }
}
