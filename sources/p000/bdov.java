package p000;

/* renamed from: bdov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdov extends bdpb {

    /* renamed from: a */
    public final int f106169a;

    /* renamed from: b */
    private final boolean f106170b;

    /* renamed from: c */
    private final bdqa f106171c;

    /* renamed from: d */
    private final bmxv f106172d;

    public bdov(boolean z, bdqa bdqa, int i, bmxv bmxv) {
        this.f106170b = z;
        this.f106171c = bdqa;
        this.f106169a = i;
        this.f106172d = bmxv;
    }

    /* renamed from: a */
    public final boolean mo58248a() {
        return this.f106170b;
    }

    /* renamed from: b */
    public final bdqa mo58249b() {
        return this.f106171c;
    }

    /* renamed from: c */
    public final int mo58250c() {
        return this.f106169a;
    }

    /* renamed from: d */
    public final bmxv mo58251d() {
        return this.f106172d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdpb) {
            bdpb bdpb = (bdpb) obj;
            return this.f106170b == bdpb.mo58248a() && this.f106171c.equals(bdpb.mo58249b()) && this.f106169a == bdpb.mo58250c() && this.f106172d.equals(bdpb.mo58251d());
        }
    }

    public final int hashCode() {
        return (((((((!this.f106170b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f106171c.hashCode()) * 1000003) ^ this.f106169a) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.f106170b;
        String valueOf = String.valueOf(this.f106171c);
        int i = this.f106169a;
        String valueOf2 = String.valueOf(this.f106172d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 117 + String.valueOf(valueOf2).length());
        sb.append("TimerConfigurations{enabled=");
        sb.append(z);
        sb.append(", probabilitySampler=");
        sb.append(valueOf);
        sb.append(", sampleRatePerSecond=");
        sb.append(i);
        sb.append(", perEventConfigurationFlags=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
