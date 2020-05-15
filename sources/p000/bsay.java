package p000;

/* renamed from: bsay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bsay {

    /* renamed from: a */
    public final int f143917a;

    /* renamed from: b */
    public final Object f143918b;

    public bsay(int i, Object obj) {
        this.f143917a = i;
        this.f143918b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bsay)) {
            return false;
        }
        bsay bsay = (bsay) obj;
        if (this.f143917a == bsay.f143917a) {
            Object obj2 = this.f143918b;
            Object obj3 = bsay.f143918b;
            if (obj2 == obj3) {
                return true;
            }
            if (obj2 == null || !obj2.equals(obj3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f143917a;
    }

    public final String toString() {
        int i = this.f143917a;
        String valueOf = String.valueOf(this.f143918b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("TypeInfo{type=");
        sb.append(i);
        sb.append(", data=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
