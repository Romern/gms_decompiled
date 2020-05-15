package p000;

/* renamed from: ock */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ock extends ocm {

    /* renamed from: a */
    private final bmxv f37173a;

    /* renamed from: b */
    private final bmxv f37174b;

    /* renamed from: c */
    private final bmxv f37175c;

    /* renamed from: d */
    private final bmxv f37176d;

    public ock(bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4) {
        this.f37173a = bmxv;
        this.f37174b = bmxv2;
        this.f37175c = bmxv3;
        this.f37176d = bmxv4;
    }

    /* renamed from: a */
    public final bmxv mo21965a() {
        return this.f37173a;
    }

    /* renamed from: b */
    public final bmxv mo21966b() {
        return this.f37174b;
    }

    /* renamed from: c */
    public final bmxv mo21967c() {
        return this.f37175c;
    }

    /* renamed from: d */
    public final bmxv mo21968d() {
        return this.f37176d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ocm) {
            ocm ocm = (ocm) obj;
            return this.f37173a.equals(ocm.mo21965a()) && this.f37174b.equals(ocm.mo21966b()) && this.f37175c.equals(ocm.mo21967c()) && this.f37176d.equals(ocm.mo21968d());
        }
    }

    public final int hashCode() {
        return ((((((this.f37173a.hashCode() ^ 1000003) * 1000003) ^ this.f37174b.hashCode()) * 1000003) ^ this.f37175c.hashCode()) * 1000003) ^ this.f37176d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f37173a);
        String valueOf2 = String.valueOf(this.f37174b);
        String valueOf3 = String.valueOf(this.f37175c);
        String valueOf4 = String.valueOf(this.f37176d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 77 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("CarSensorInfo{speedMillimetersPerSec=");
        sb.append(valueOf);
        sb.append(", nightMode=");
        sb.append(valueOf2);
        sb.append(", drivingStatus=");
        sb.append(valueOf3);
        sb.append(", gearData=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
