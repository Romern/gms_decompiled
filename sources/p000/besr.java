package p000;

/* renamed from: besr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class besr {

    /* renamed from: a */
    public final long f112319a;

    /* renamed from: b */
    public float f112320b;

    /* renamed from: c */
    public float f112321c;

    /* renamed from: d */
    public float f112322d;

    public besr(long j, float f, float f2, float f3) {
        this.f112319a = j;
        this.f112320b = f;
        this.f112321c = f2;
        this.f112322d = f3;
    }

    /* renamed from: a */
    public final float mo61103a(besr besr) {
        return (this.f112320b * besr.f112320b) + (this.f112321c * besr.f112321c) + (this.f112322d * besr.f112322d);
    }

    public final String toString() {
        long j = this.f112319a;
        StringBuilder sb = new StringBuilder(40);
        sb.append("timeMillisSinceBoot=");
        sb.append(j);
        String valueOf = String.valueOf(sb.toString());
        float f = this.f112320b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb2.append(valueOf);
        sb2.append(" | x=");
        sb2.append(f);
        String valueOf2 = String.valueOf(sb2.toString());
        float f2 = this.f112321c;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb3.append(valueOf2);
        sb3.append(", y=");
        sb3.append(f2);
        String valueOf3 = String.valueOf(sb3.toString());
        float f3 = this.f112322d;
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 19);
        sb4.append(valueOf3);
        sb4.append(", z=");
        sb4.append(f3);
        return sb4.toString();
    }

    /* renamed from: a */
    public final besr mo61104a(float f) {
        return new besr(this.f112319a, this.f112320b * f, this.f112321c * f, this.f112322d * f);
    }
}
