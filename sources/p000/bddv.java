package p000;

/* renamed from: bddv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddv extends bdeo {

    /* renamed from: a */
    private final Class f105390a;

    /* renamed from: b */
    private final String f105391b;

    public bddv(Class cls, String str) {
        this.f105390a = cls;
        this.f105391b = str;
    }

    /* renamed from: a */
    public final Class mo57922a() {
        return this.f105390a;
    }

    /* renamed from: b */
    public final String mo57923b() {
        return this.f105391b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdeo) {
            bdeo bdeo = (bdeo) obj;
            return this.f105390a.equals(bdeo.mo57922a()) && this.f105391b.equals(bdeo.mo57923b());
        }
    }

    public final int hashCode() {
        return ((this.f105390a.hashCode() ^ 1000003) * 1000003) ^ this.f105391b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105390a);
        String str = this.f105391b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + str.length());
        sb.append("ImageModelType{modelClass=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
