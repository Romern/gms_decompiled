package p000;

/* renamed from: bauc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bauc extends baus {

    /* renamed from: a */
    public final String f101749a;

    /* renamed from: b */
    public final bmxv f101750b;

    /* renamed from: c */
    public final bmxv f101751c;

    /* renamed from: d */
    public final bmxv f101752d;

    /* renamed from: e */
    private final bmxv f101753e;

    /* renamed from: f */
    private final bmxv f101754f;

    /* renamed from: g */
    private final int f101755g;

    public bauc(String str, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, bmxv bmxv5, int i) {
        this.f101749a = str;
        this.f101750b = bmxv;
        this.f101753e = bmxv2;
        this.f101754f = bmxv3;
        this.f101751c = bmxv4;
        this.f101752d = bmxv5;
        this.f101755g = i;
    }

    /* renamed from: a */
    public final String mo55964a() {
        return this.f101749a;
    }

    /* renamed from: b */
    public final bmxv mo55965b() {
        return this.f101750b;
    }

    /* renamed from: c */
    public final bmxv mo55966c() {
        return this.f101753e;
    }

    /* renamed from: d */
    public final bmxv mo55967d() {
        return this.f101754f;
    }

    /* renamed from: e */
    public final bmxv mo55968e() {
        return this.f101751c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baus) {
            baus baus = (baus) obj;
            return this.f101749a.equals(baus.mo55964a()) && this.f101750b.equals(baus.mo55965b()) && this.f101753e.equals(baus.mo55966c()) && this.f101754f.equals(baus.mo55967d()) && this.f101751c.equals(baus.mo55968e()) && this.f101752d.equals(baus.mo55970f()) && this.f101755g == baus.mo55971g();
        }
    }

    /* renamed from: f */
    public final bmxv mo55970f() {
        return this.f101752d;
    }

    /* renamed from: g */
    public final int mo55971g() {
        return this.f101755g;
    }

    public final int hashCode() {
        return ((((((((((((this.f101749a.hashCode() ^ 1000003) * 1000003) ^ this.f101750b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f101751c.hashCode()) * 1000003) ^ this.f101752d.hashCode()) * 1000003) ^ this.f101755g;
    }

    public final String toString() {
        String str = this.f101749a;
        String valueOf = String.valueOf(this.f101750b);
        String valueOf2 = String.valueOf(this.f101753e);
        String valueOf3 = String.valueOf(this.f101754f);
        String valueOf4 = String.valueOf(this.f101751c);
        String valueOf5 = String.valueOf(this.f101752d);
        int i = this.f101755g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 175 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("DownloadFileGroupRequest{groupName=");
        sb.append(str);
        sb.append(", accountOptional=");
        sb.append(valueOf);
        sb.append(", contentTitleOptional=");
        sb.append(valueOf2);
        sb.append(", contentTextOptional=");
        sb.append(valueOf3);
        sb.append(", downloadConditionsOptional=");
        sb.append(valueOf4);
        sb.append(", listenerOptional=");
        sb.append(valueOf5);
        sb.append(", groupSizeBytes=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
