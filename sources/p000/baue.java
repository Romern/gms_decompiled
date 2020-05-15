package p000;

/* renamed from: baue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baue extends baws {

    /* renamed from: a */
    public final String f101760a;

    /* renamed from: b */
    public final bmxv f101761b;

    public baue(String str, bmxv bmxv) {
        this.f101760a = str;
        this.f101761b = bmxv;
    }

    /* renamed from: a */
    public final String mo55981a() {
        return this.f101760a;
    }

    /* renamed from: b */
    public final bmxv mo55982b() {
        return this.f101761b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baws) {
            baws baws = (baws) obj;
            return this.f101760a.equals(baws.mo55981a()) && this.f101761b.equals(baws.mo55982b());
        }
    }

    public final int hashCode() {
        return ((this.f101760a.hashCode() ^ 1000003) * 1000003) ^ this.f101761b.hashCode();
    }

    public final String toString() {
        String str = this.f101760a;
        String valueOf = String.valueOf(this.f101761b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(valueOf).length());
        sb.append("RemoveFileGroupRequest{groupName=");
        sb.append(str);
        sb.append(", accountOptional=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
