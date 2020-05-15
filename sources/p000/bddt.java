package p000;

/* renamed from: bddt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddt extends bdek {

    /* renamed from: a */
    public final bdeo f105383a;

    /* renamed from: b */
    public final Object f105384b;

    public bddt(bdeo bdeo, Object obj) {
        this.f105383a = bdeo;
        this.f105384b = obj;
    }

    /* renamed from: a */
    public final bdeo mo57909a() {
        return this.f105383a;
    }

    /* renamed from: b */
    public final Object mo57910b() {
        return this.f105384b;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdek) {
            bdek bdek = (bdek) obj;
            return this.f105383a.equals(bdek.mo57909a()) && ((obj2 = this.f105384b) == null ? bdek.mo57910b() == null : obj2.equals(bdek.mo57910b()));
        }
    }

    public final int hashCode() {
        int hashCode = (this.f105383a.hashCode() ^ 1000003) * 1000003;
        Object obj = this.f105384b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105383a);
        String valueOf2 = String.valueOf(this.f105384b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(valueOf2).length());
        sb.append("ImageModel{modelType=");
        sb.append(valueOf);
        sb.append(", data=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
