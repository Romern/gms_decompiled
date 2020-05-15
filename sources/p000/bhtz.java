package p000;

import java.util.Arrays;

/* renamed from: bhtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtz {

    /* renamed from: a */
    public final float f119601a;

    /* renamed from: b */
    public final boolean f119602b;

    static {
        new bhtz(0.0f, false);
    }

    public bhtz(float f, boolean z) {
        this.f119601a = f;
        this.f119602b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhtz) {
            bhtz bhtz = (bhtz) obj;
            return this.f119602b == bhtz.f119602b && this.f119601a == bhtz.f119601a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f119601a), Boolean.valueOf(this.f119602b)});
    }

    public final String toString() {
        return "OnTheGoResult { onTheGoProbability=" + this.f119601a + " isActivityUsed=" + this.f119602b + "}";
    }
}
