package p000;

/* renamed from: bcnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcnu extends bcnw {

    /* renamed from: a */
    private final String f104588a;

    /* renamed from: b */
    private final bmxv f104589b;

    /* renamed from: c */
    private final bmxv f104590c;

    /* renamed from: d */
    private final int f104591d;

    /* renamed from: e */
    private final bmxv f104592e;

    public bcnu(String str, bmxv bmxv, bmxv bmxv2, int i, bmxv bmxv3) {
        this.f104588a = str;
        this.f104589b = bmxv;
        this.f104590c = bmxv2;
        this.f104591d = i;
        this.f104592e = bmxv3;
    }

    /* renamed from: a */
    public final String mo57017a() {
        return this.f104588a;
    }

    /* renamed from: b */
    public final bmxv mo57018b() {
        return this.f104589b;
    }

    /* renamed from: c */
    public final bmxv mo57019c() {
        return this.f104590c;
    }

    /* renamed from: d */
    public final int mo57020d() {
        return this.f104591d;
    }

    /* renamed from: e */
    public final bmxv mo57021e() {
        return this.f104592e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcnw) {
            bcnw bcnw = (bcnw) obj;
            return this.f104588a.equals(bcnw.mo57017a()) && this.f104589b.equals(bcnw.mo57018b()) && this.f104590c.equals(bcnw.mo57019c()) && this.f104591d == bcnw.mo57020d() && this.f104592e.equals(bcnw.mo57021e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f104588a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f104591d) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String str = this.f104588a;
        String valueOf = String.valueOf(this.f104589b);
        String valueOf2 = String.valueOf(this.f104590c);
        int i = this.f104591d;
        String valueOf3 = String.valueOf(this.f104592e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChipLog{chipsId=");
        sb.append(str);
        sb.append(", chipId=");
        sb.append(valueOf);
        sb.append(", chipPosition=");
        sb.append(valueOf2);
        sb.append(", renderStyle=");
        sb.append(i);
        sb.append(", actionType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
