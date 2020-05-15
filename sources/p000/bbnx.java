package p000;

/* renamed from: bbnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbnx extends bboc {

    /* renamed from: a */
    private final Class f102991a;

    /* renamed from: b */
    private final bxvq f102992b;

    /* renamed from: c */
    private final beju f102993c;

    /* renamed from: d */
    private final ayte f102994d;

    /* renamed from: e */
    private final bnsn f102995e;

    public bbnx(Class cls, bxvq bxvq, beju beju, ayte ayte, bnsn bnsn) {
        this.f102991a = cls;
        this.f102992b = bxvq;
        this.f102993c = beju;
        this.f102994d = ayte;
        this.f102995e = bnsn;
    }

    /* renamed from: a */
    public final Class mo56256a() {
        return this.f102991a;
    }

    /* renamed from: b */
    public final bxvq mo56257b() {
        return this.f102992b;
    }

    /* renamed from: c */
    public final beju mo56258c() {
        return this.f102993c;
    }

    /* renamed from: d */
    public final ayte mo56259d() {
        return this.f102994d;
    }

    /* renamed from: e */
    public final bnsn mo56260e() {
        return this.f102995e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bboc)) {
            return false;
        }
        bboc bboc = (bboc) obj;
        Class cls = this.f102991a;
        if (cls == null ? bboc.mo56256a() == null : cls.equals(bboc.mo56256a())) {
            bxvq bxvq = this.f102992b;
            if (bxvq == null ? bboc.mo56257b() == null : bxvq.equals(bboc.mo56257b())) {
                return this.f102993c.equals(bboc.mo56258c()) && this.f102994d.equals(bboc.mo56259d()) && this.f102995e.equals(bboc.mo56260e());
            }
        }
    }

    public final int hashCode() {
        int i;
        Class cls = this.f102991a;
        int i2 = 0;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i ^ 1000003) * 1000003;
        bxvq bxvq = this.f102992b;
        if (bxvq != null) {
            i2 = bxvq.hashCode();
        }
        return ((((((i3 ^ i2) * 1000003) ^ this.f102993c.hashCode()) * 1000003) ^ this.f102994d.hashCode()) * 1000003) ^ this.f102995e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102991a);
        String valueOf2 = String.valueOf(this.f102992b);
        String valueOf3 = String.valueOf(this.f102993c);
        String valueOf4 = String.valueOf(this.f102994d);
        String valueOf5 = String.valueOf(this.f102995e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 81 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PdsSyncMetadataManagerFactory{eventType=");
        sb.append(valueOf);
        sb.append(", enumMap=");
        sb.append(valueOf2);
        sb.append(", pdsFactory=");
        sb.append(valueOf3);
        sb.append(", clock=");
        sb.append(valueOf4);
        sb.append(", logger=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
