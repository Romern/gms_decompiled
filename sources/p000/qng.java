package p000;

/* renamed from: qng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qng {

    /* renamed from: a */
    public String f41769a;

    /* renamed from: b */
    private long f41770b;

    /* renamed from: a */
    public static qng m32486a(djc djc) {
        qng qng = new qng();
        qng.mo24130b(djc);
        return qng;
    }

    /* renamed from: b */
    public final void mo24130b(djc djc) {
        this.f41769a = djc.f13310b;
        this.f41770b = djc.f13311c;
    }

    /* renamed from: b */
    public final void mo24131b(djd djd) {
        this.f41769a = djd.f13317b;
        this.f41770b = djd.f13318c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qng) {
            qng qng = (qng) obj;
            if (!this.f41769a.equals(qng.f41769a) || this.f41770b != qng.f41770b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f41769a.hashCode();
        long j = this.f41770b;
        return ((hashCode + 527) * 31) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: a */
    public static qng m32487a(djd djd) {
        qng qng = new qng();
        qng.mo24131b(djd);
        return qng;
    }
}
