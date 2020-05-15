package p000;

import com.google.android.gms.location.DetectedActivity;

/* renamed from: bgew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgew {

    /* renamed from: a */
    public final long f116312a;

    /* renamed from: b */
    public final long f116313b;

    /* renamed from: c */
    public final int[] f116314c;

    public bgew(int[] iArr, long j, long j2) {
        this.f116314c = iArr;
        this.f116312a = j;
        this.f116313b = j2;
    }

    /* renamed from: a */
    public final int mo62722a() {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < 23) {
            int i4 = this.f116314c[i];
            int i5 = i4 > i2 ? i4 : i2;
            if (i4 > i2) {
                i3 = i;
            }
            i++;
            i2 = i5;
        }
        return i3;
    }

    /* renamed from: b */
    public final boolean mo62724b(int i) {
        return mo62723a(i) >= 50;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityRecognitionResult");
        sb.append(" [probableActivities=<");
        String str = "";
        for (int i = 0; i < 23; i++) {
            int i2 = this.f116314c[i];
            if (i2 > 0) {
                sb.append(str);
                sb.append("DetectedActivity [type=");
                sb.append(DetectedActivity.m66831a(i));
                sb.append(", confidence=");
                sb.append(i2);
                sb.append(']');
                str = ", ";
            }
        }
        sb.append(">, utcTimeMillis=");
        sb.append(this.f116312a);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(this.f116313b);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo62723a(int i) {
        if (i < 23) {
            return this.f116314c[i];
        }
        return 0;
    }
}
