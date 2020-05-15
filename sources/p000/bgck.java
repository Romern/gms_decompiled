package p000;

import android.app.PendingIntent;

/* renamed from: bgck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bgck extends bgcc {

    /* renamed from: q */
    long f116051q;

    public bgck(PendingIntent pendingIntent, long j, long j2, bgns bgns, bhcv bhcv, boolean z, boolean z2, String str) {
        super(pendingIntent, j2, bgns, bhcv, z, z2, str);
        this.f116051q = j;
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.f116017h.hashCode());
        String str = this.f116019j;
        String str2 = this.f116022m;
        long j = this.f116051q;
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 86 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("IntentReceiver [pendingIntent=");
        sb.append(hexString);
        sb.append(", packageName=");
        sb.append(str);
        sb.append(", tag=");
        sb.append(str2);
        sb.append(", periodMillis=");
        sb.append(j);
        sb.append("]");
        return sb.toString();
    }
}
