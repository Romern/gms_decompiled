package p000;

import android.content.pm.VersionedPackage;

/* renamed from: anja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anja extends anji {

    /* renamed from: a */
    public final int f76987a;

    /* renamed from: b */
    public final VersionedPackage f76988b;

    public anja(int i, VersionedPackage versionedPackage) {
        this.f76987a = i;
        this.f76988b = versionedPackage;
    }

    /* renamed from: a */
    public final int mo41860a() {
        return this.f76987a;
    }

    /* renamed from: b */
    public final VersionedPackage mo41861b() {
        return this.f76988b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anji) {
            anji anji = (anji) obj;
            return this.f76987a == anji.mo41860a() && this.f76988b.equals(anji.mo41861b());
        }
    }

    public final int hashCode() {
        return ((this.f76987a ^ 1000003) * 1000003) ^ this.f76988b.hashCode();
    }

    public final String toString() {
        int i = this.f76987a;
        String valueOf = String.valueOf(this.f76988b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
        sb.append("RolledBackFromInfo{rollbackId=");
        sb.append(i);
        sb.append(", versionRolledBackFrom=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
