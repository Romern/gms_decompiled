package p000;

/* renamed from: bduj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bduj extends bduk {

    /* renamed from: a */
    private final bxpe f106469a;

    /* renamed from: b */
    private final bxom f106470b;

    public bduj(bxpe bxpe, bxom bxom) {
        if (bxpe != null) {
            this.f106469a = bxpe;
            if (bxom != null) {
                this.f106470b = bxom;
                return;
            }
            throw new NullPointerException("Null origin");
        }
        throw new NullPointerException("Null response");
    }

    /* renamed from: a */
    public final bxpe mo58383a() {
        return this.f106469a;
    }

    /* renamed from: b */
    public final bxom mo58384b() {
        return this.f106470b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bduk) {
            bduk bduk = (bduk) obj;
            return this.f106469a.equals(bduk.mo58383a()) && this.f106470b.equals(bduk.mo58384b());
        }
    }

    public final int hashCode() {
        bxpe bxpe = this.f106469a;
        int i = bxpe.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bxpe).mo74216a(bxpe);
            bxpe.f164758ag = i;
        }
        return this.f106470b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106469a);
        String valueOf2 = String.valueOf(this.f106470b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("GetActivityControlsSettingsResponseWithOrigin{response=");
        sb.append(valueOf);
        sb.append(", origin=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
