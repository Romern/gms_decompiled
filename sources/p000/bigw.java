package p000;

import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Arrays;

/* renamed from: bigw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bigw {

    /* renamed from: a */
    public final int f120546a;

    /* renamed from: b */
    public final long f120547b;

    /* renamed from: c */
    public final ClientIdentity f120548c;

    public bigw(int i, long j, ClientIdentity clientIdentity) {
        this.f120546a = i;
        this.f120547b = j;
        this.f120548c = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof bigw)) {
            bigw bigw = (bigw) obj;
            return this.f120546a == bigw.f120546a && this.f120547b == bigw.f120547b && this.f120548c.equals(bigw.f120548c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f120546a), Long.valueOf(this.f120547b), this.f120548c});
    }

    public final String toString() {
        return "priority=" + this.f120546a + " updateIntervalMillis=" + this.f120547b + " clientIdentity=" + this.f120548c.toString();
    }
}
