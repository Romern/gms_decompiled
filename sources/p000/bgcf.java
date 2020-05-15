package p000;

/* renamed from: bgcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgcf extends bgbt {

    /* renamed from: a */
    private final boolean f116028a;

    /* renamed from: b */
    private final boolean f116029b;

    public bgcf(bhcv bhcv, String str, boolean z, boolean z2) {
        super(bhcv, str);
        this.f116028a = z;
        this.f116029b = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bgcf) || !super.equals(obj) || this.f116028a != ((bgcf) obj).f116028a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((super.hashCode() * 31) + (this.f116028a ? 1 : 0)) * 31) + (this.f116029b ? 1 : 0);
    }

    public final String toString() {
        String bgbt = super.toString();
        boolean z = this.f116028a;
        boolean z2 = this.f116029b;
        StringBuilder sb = new StringBuilder(String.valueOf(bgbt).length() + 47);
        sb.append(bgbt);
        sb.append(" LowPower: ");
        sb.append(z);
        sb.append(" LocationSettingsIgnored: ");
        sb.append(z2);
        return sb.toString();
    }
}
