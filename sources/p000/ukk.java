package p000;

import java.util.Locale;

/* renamed from: ukk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ukk {

    /* renamed from: a */
    public final long f47941a;

    private ukk(long j) {
        boolean z;
        this.f47941a = j;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
    }

    /* renamed from: a */
    public static ukk m38862a(long j) {
        return new ukk(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && obj.getClass() == getClass() && this.f47941a == ((ukk) obj).f47941a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f47941a;
        return ((int) (j ^ (j >>> 32))) + 31;
    }

    public final String toString() {
        return String.format(Locale.US, "EntrySpec[%s]", Long.valueOf(this.f47941a));
    }
}
