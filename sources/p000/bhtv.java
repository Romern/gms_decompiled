package p000;

import java.util.Arrays;

/* renamed from: bhtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtv {

    /* renamed from: a */
    public final bhtt f119574a;

    /* renamed from: b */
    public final Integer f119575b;

    /* renamed from: c */
    public final Integer f119576c;

    /* renamed from: d */
    public final long f119577d;

    public bhtv(bhtt bhtt, Integer num, Integer num2, long j) {
        this.f119574a = bhtt;
        this.f119575b = num;
        this.f119576c = num2;
        this.f119577d = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bhtv)) {
            return false;
        }
        bhtv bhtv = (bhtv) obj;
        return bhxi.m101705a(bhtv.f119574a, this.f119574a) && bhxi.m101705a(bhtv.f119575b, this.f119575b) && bhxi.m101705a(bhtv.f119576c, this.f119576c) && bhtv.f119577d == this.f119577d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119574a, this.f119575b, this.f119576c, Long.valueOf(this.f119577d)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f119574a);
        String valueOf2 = String.valueOf(this.f119575b);
        String valueOf3 = String.valueOf(this.f119576c);
        long j = this.f119577d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 90 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("BeaconSighting{beaconId=");
        sb.append(valueOf);
        sb.append(", rssi=");
        sb.append(valueOf2);
        sb.append(", txPower=");
        sb.append(valueOf3);
        sb.append(", timestampMillisSinceEpoch=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
