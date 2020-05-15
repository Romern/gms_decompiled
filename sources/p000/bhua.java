package p000;

import java.util.Arrays;

/* renamed from: bhua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhua {

    /* renamed from: a */
    public final bhue f119603a;

    /* renamed from: b */
    public final float f119604b;

    public bhua(bhue bhue, float f) {
        this.f119603a = bhue;
        this.f119604b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhua) {
            bhua bhua = (bhua) obj;
            return this.f119604b == bhua.f119604b && bhxi.m101705a(this.f119603a, bhua.f119603a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f119604b), this.f119603a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f119603a);
        float f = this.f119604b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
        sb.append("PlaceInferenceDebugData{featureValues=");
        sb.append(valueOf);
        sb.append(",rawScore=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
