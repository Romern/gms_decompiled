package p000;

/* renamed from: bgmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgmu {

    /* renamed from: a */
    public final int f116826a;

    /* renamed from: b */
    public final int f116827b;

    /* renamed from: c */
    public final long f116828c;

    /* renamed from: d */
    private final float f116829d;

    public bgmu(int i, int i2, float f, long j) {
        this.f116826a = i;
        this.f116827b = i2;
        this.f116829d = f;
        this.f116828c = j;
    }

    public final String toString() {
        float f = this.f116829d;
        long j = this.f116828c;
        int i = this.f116826a;
        int i2 = this.f116827b;
        StringBuilder sb = new StringBuilder(162);
        sb.append("HardwareAudioFusionModelResponse{confidence=");
        sb.append(f);
        sb.append(", elapsedRealTimeMillis=");
        sb.append(j);
        sb.append(", fusionActivity=");
        sb.append(i);
        sb.append(", fusionResultType=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }
}
