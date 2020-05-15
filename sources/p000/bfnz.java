package p000;

/* renamed from: bfnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnz {

    /* renamed from: a */
    public long f114529a;

    /* renamed from: b */
    public int f114530b;

    /* renamed from: c */
    public long f114531c;

    /* renamed from: d */
    public int f114532d;

    /* renamed from: e */
    public int f114533e;

    /* renamed from: f */
    public int f114534f;

    /* renamed from: g */
    public int f114535g;

    /* renamed from: h */
    public int f114536h;

    /* renamed from: i */
    public int f114537i;

    /* renamed from: j */
    public int f114538j;

    public final String toString() {
        long j = this.f114529a;
        int i = this.f114530b;
        long j2 = this.f114531c;
        int i2 = this.f114532d;
        int i3 = this.f114533e;
        int i4 = this.f114534f;
        int i5 = this.f114535g;
        int i6 = this.f114536h;
        int i7 = this.f114537i;
        StringBuilder sb = new StringBuilder(248);
        sb.append("WifiRttResult [bssid=");
        sb.append(j);
        sb.append(", status=");
        sb.append(i);
        sb.append(", ts=");
        sb.append(j2);
        sb.append(", rssi=");
        sb.append(i2);
        sb.append(", distanceCm=");
        sb.append(i3);
        sb.append(", distanceSdCm=");
        sb.append(i4);
        sb.append(", measurementtype=");
        sb.append(i5);
        sb.append(", numMeasurementFrames=");
        sb.append(i6);
        sb.append(", numSuccessFrames=");
        sb.append(i7);
        sb.append("]");
        return sb.toString();
    }
}
