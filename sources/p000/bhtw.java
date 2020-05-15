package p000;

import java.util.Arrays;

/* renamed from: bhtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtw {

    /* renamed from: a */
    public final int f119578a;

    /* renamed from: b */
    public final float f119579b;

    public bhtw(int i, float f) {
        this.f119578a = i;
        this.f119579b = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhtw) {
            bhtw bhtw = (bhtw) obj;
            return this.f119578a == bhtw.f119578a && this.f119579b == bhtw.f119579b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f119578a), Float.valueOf(this.f119579b)});
    }

    public final String toString() {
        int i = this.f119578a;
        float f = this.f119579b;
        StringBuilder sb = new StringBuilder(70);
        sb.append("DetectedActivity{activityType=");
        sb.append(i);
        sb.append(" probability=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
