package p000;

/* renamed from: amwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amwd extends amwe {

    /* renamed from: a */
    public final int f76166a;

    /* renamed from: b */
    public final boolean f76167b;

    public amwd(int i, boolean z) {
        this.f76166a = i;
        this.f76167b = z;
    }

    /* renamed from: a */
    public final int mo41474a() {
        return this.f76166a;
    }

    /* renamed from: b */
    public final boolean mo41475b() {
        return this.f76167b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amwe) {
            amwe amwe = (amwe) obj;
            return this.f76166a == amwe.mo41474a() && this.f76167b == amwe.mo41475b();
        }
    }

    public final int hashCode() {
        return ((this.f76166a ^ 1000003) * 1000003) ^ (!this.f76167b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f76166a;
        boolean z = this.f76167b;
        StringBuilder sb = new StringBuilder(63);
        sb.append("MigrateState{numContactsMigrated=");
        sb.append(i);
        sb.append(", isComplete=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
