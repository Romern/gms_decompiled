package p000;

/* renamed from: bfnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnc {

    /* renamed from: a */
    public final int f114460a;

    /* renamed from: b */
    public final int f114461b;

    /* renamed from: c */
    public final long f114462c;

    /* renamed from: d */
    public final long f114463d;

    public bfnc(int i, int i2, long j, long j2) {
        this.f114460a = i;
        this.f114461b = i2;
        this.f114462c = j;
        this.f114463d = j2;
    }

    public final String toString() {
        int i = this.f114460a;
        int i2 = this.f114461b;
        long j = this.f114462c;
        long j2 = this.f114463d;
        StringBuilder sb = new StringBuilder(148);
        sb.append("NlpLocationstatus[wifiStatus = ");
        sb.append(i);
        sb.append(" cellStatus = ");
        sb.append(i2);
        sb.append(" timestampMillis = ");
        sb.append(j);
        sb.append(" elapsedRealtimeNs = ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
