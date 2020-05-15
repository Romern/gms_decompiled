package p000;

/* renamed from: casq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casq implements caso {

    /* renamed from: a */
    private final cass f175780a = cass.CONTACTLESS_EMV;

    /* renamed from: b */
    private final casn f175781b;

    /* renamed from: c */
    private final caon f175782c;

    /* renamed from: d */
    private final caon f175783d;

    /* renamed from: e */
    private final boolean f175784e;

    /* renamed from: f */
    private final int f175785f;

    /* renamed from: g */
    private final int f175786g;

    public casq(caoo caoo, caon caon, caon caon2) {
        int i;
        casl a = casl.m127098a(caon.mo74730a("9F1D"));
        casj a2 = casj.m127094a(caon);
        casi a3 = casi.m127086a(caoo.f175477m, a2);
        this.f175785f = C1708cast.m127114a(caoo.f175474j);
        this.f175781b = casn.m127101a(a2);
        boolean d = a3.mo74816d();
        if (a != null) {
            if (!a.mo74822a()) {
                i = d ? 1 : 2;
                this.f175786g = i;
                this.f175782c = caon;
                this.f175783d = caon2;
                this.f175784e = !a2.mo74820b();
            }
        } else if (!d) {
            i = 3;
            this.f175786g = i;
            this.f175782c = caon;
            this.f175783d = caon2;
            this.f175784e = !a2.mo74820b();
        }
        i = 1;
        this.f175786g = i;
        this.f175782c = caon;
        this.f175783d = caon2;
        this.f175784e = !a2.mo74820b();
    }

    /* renamed from: a */
    public final cass mo74823a() {
        return this.f175780a;
    }

    /* renamed from: b */
    public final boolean mo74825b() {
        return this.f175784e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(casn.class.toString());
        sb.append("\n  Terminal Type: ");
        sb.append((Object) C1708cast.m127115a(this.f175785f));
        sb.append("\n  Terminal Technology: ");
        sb.append(this.f175780a);
        sb.append("\n  Persistent Transaction Context: ");
        sb.append(this.f175781b);
        sb.append("\n  CD-CVM Support: ");
        sb.append((Object) casm.m127100a(this.f175786g));
        sb.append("\n  Discretionary Data [TAG|VALUE] HEX: \n");
        caon caon = this.f175782c;
        if (caon != null) {
            sb.append(caon.toString());
        }
        sb.append(this.f175783d.toString());
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo74824a(String str) {
        byte[] a = this.f175783d.mo74730a(str);
        if (a != null) {
            return a;
        }
        caon caon = this.f175782c;
        if (caon != null) {
            return caon.mo74730a(str);
        }
        return null;
    }
}
