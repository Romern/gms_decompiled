package p000;

import java.util.Arrays;

/* renamed from: casp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casp implements caso {

    /* renamed from: a */
    public final casn f175773a;

    /* renamed from: b */
    public final int f175774b;

    /* renamed from: c */
    private final cass f175775c = cass.CONTACTLESS_MAGSTRIPE;

    /* renamed from: d */
    private final caon f175776d;

    /* renamed from: e */
    private final caon f175777e;

    /* renamed from: f */
    private final boolean f175778f;

    /* renamed from: g */
    private final int f175779g;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        if (r6 == false) goto L_0x0042;
     */
    public casp(caok caok, caon caon, caon caon2) {
        casj a = casj.m127093a(caok.f175451c);
        casl a2 = casl.m127098a(caok.f175459k);
        this.f175779g = C1708cast.m127114a(caok.f175455g);
        this.f175773a = casn.m127101a(a);
        boolean a3 = a.mo74819a();
        int i = 2;
        if (a2 != null) {
            if (a2.mo74822a()) {
                i = 1;
            } else if (!a3) {
                Arrays.equals(a2.f175768a, new byte[8]);
            }
            this.f175774b = i;
            this.f175776d = caon;
            this.f175777e = caon2;
            this.f175778f = !a.mo74820b();
        }
        i = 1;
        this.f175774b = i;
        this.f175776d = caon;
        this.f175777e = caon2;
        this.f175778f = !a.mo74820b();
    }

    /* renamed from: a */
    public final cass mo74823a() {
        return this.f175775c;
    }

    /* renamed from: b */
    public final boolean mo74825b() {
        return this.f175778f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(casn.class.toString());
        sb.append("\n  Terminal Type: ");
        sb.append((Object) C1708cast.m127115a(this.f175779g));
        sb.append("\n  Terminal Technology: ");
        sb.append(this.f175775c);
        sb.append("\n  Persistent Transaction Context: ");
        sb.append(this.f175773a);
        sb.append("\n  CD-CVM Support: ");
        sb.append((Object) casm.m127100a(this.f175774b));
        sb.append("\n  Discretionary Data [TAG|VALUE] HEX: \n");
        caon caon = this.f175776d;
        if (caon != null) {
            sb.append(caon.toString());
        }
        caon caon2 = this.f175777e;
        if (caon2 != null) {
            sb.append(caon2.toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo74824a(String str) {
        byte[] a;
        caon caon = this.f175777e;
        if (caon != null && (a = caon.mo74730a(str)) != null) {
            return a;
        }
        caon caon2 = this.f175776d;
        if (caon2 != null) {
            return caon2.mo74730a(str);
        }
        return null;
    }
}
