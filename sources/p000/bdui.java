package p000;

/* renamed from: bdui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdui extends bdva {

    /* renamed from: a */
    public final bxpe f106468a;

    public bdui(bxpe bxpe) {
        if (bxpe != null) {
            this.f106468a = bxpe;
            return;
        }
        throw new NullPointerException("Null response");
    }

    /* renamed from: a */
    public final bxpe mo58378a() {
        return this.f106468a;
    }

    /* renamed from: b */
    public final long mo58379b() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdva) {
            bdva bdva = (bdva) obj;
            return this.f106468a.equals(bdva.mo58378a()) && bdva.mo58379b() == -1;
        }
    }

    public final int hashCode() {
        bxpe bxpe = this.f106468a;
        int i = bxpe.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bxpe).mo74216a(bxpe);
            bxpe.f164758ag = i;
        }
        return ((int) -4294967296L) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106468a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
        sb.append("CachedGetActivityControlsSettingsResponse{response=");
        sb.append(valueOf);
        sb.append(", timestamp=-1}");
        return sb.toString();
    }
}
