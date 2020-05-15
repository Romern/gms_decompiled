package p000;

/* renamed from: tqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tqf extends tqj {

    /* renamed from: a */
    private final String f46486a;

    /* renamed from: b */
    private final bmxv f46487b;

    /* renamed from: c */
    private final bmxv f46488c;

    /* renamed from: d */
    private final bmxv f46489d;

    /* renamed from: e */
    private final qun f46490e;

    public tqf(String str, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, qun qun) {
        this.f46486a = str;
        this.f46487b = bmxv;
        this.f46488c = bmxv2;
        this.f46489d = bmxv3;
        this.f46490e = qun;
    }

    /* renamed from: a */
    public final String mo26718a() {
        return this.f46486a;
    }

    /* renamed from: b */
    public final bmxv mo26719b() {
        return this.f46487b;
    }

    /* renamed from: c */
    public final bmxv mo26720c() {
        return this.f46488c;
    }

    /* renamed from: d */
    public final bmxv mo26721d() {
        return this.f46489d;
    }

    /* renamed from: e */
    public final qun mo26722e() {
        return this.f46490e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqj) {
            tqj tqj = (tqj) obj;
            return this.f46486a.equals(tqj.mo26718a()) && this.f46487b.equals(tqj.mo26719b()) && this.f46488c.equals(tqj.mo26720c()) && this.f46489d.equals(tqj.mo26721d()) && this.f46490e.equals(tqj.mo26722e());
        }
    }

    public final int hashCode() {
        int hashCode = (((((((this.f46486a.hashCode() ^ 1000003) * 1000003) ^ this.f46487b.hashCode()) * 1000003) ^ this.f46488c.hashCode()) * 1000003) ^ this.f46489d.hashCode()) * 1000003;
        qun qun = this.f46490e;
        int i = qun.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(qun).mo74216a(qun);
            qun.f164758ag = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f46486a;
        String valueOf = String.valueOf(this.f46487b);
        String valueOf2 = String.valueOf(this.f46488c);
        String valueOf3 = String.valueOf(this.f46489d);
        String valueOf4 = String.valueOf(this.f46490e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("BlacklistEntry{signOnRealm=");
        sb.append(str);
        sb.append(", displayName=");
        sb.append(valueOf);
        sb.append(", iconUrl=");
        sb.append(valueOf2);
        sb.append(", truncateAt=");
        sb.append(valueOf3);
        sb.append(", passwordSpecificsData=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
