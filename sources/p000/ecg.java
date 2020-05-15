package p000;

import java.util.Arrays;

/* renamed from: ecg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecg {

    /* renamed from: a */
    public final long f14670a;

    /* renamed from: b */
    public final int[] f14671b = new int[eci.f14678a.length];

    /* renamed from: c */
    public final int[] f14672c = new int[eci.f14678a.length];

    public ecg(long j) {
        this.f14670a = j;
    }

    /* renamed from: a */
    public final boolean mo9950a(int i) {
        return this.f14671b[i] > 0;
    }

    /* renamed from: b */
    public final float mo9951b(int i) {
        if (mo9950a(i)) {
            return ((float) this.f14672c[i]) / ((float) this.f14671b[i]);
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append(valueOf);
        sb.append(" does not have frequency index ");
        sb.append(i);
        throw new IllegalArgumentException(String.valueOf(sb.toString()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final float mo9952c(int i) {
        if (mo9950a(i)) {
            return mo9951b(i);
        }
        return -120.0f;
    }

    public final String toString() {
        long j = this.f14670a;
        String arrays = Arrays.toString(this.f14671b);
        String arrays2 = Arrays.toString(this.f14672c);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 60 + String.valueOf(arrays2).length());
        sb.append("ApSample{address='");
        sb.append(j);
        sb.append("', counts=");
        sb.append(arrays);
        sb.append(", rssiSums=");
        sb.append(arrays2);
        sb.append("}");
        return sb.toString();
    }
}
