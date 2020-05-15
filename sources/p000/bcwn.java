package p000;

/* renamed from: bcwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcwn extends bcwr {

    /* renamed from: a */
    public final bcwp f105070a;

    /* renamed from: b */
    public final String f105071b;

    /* renamed from: c */
    public final bmxv f105072c;

    /* renamed from: d */
    public final int f105073d;

    /* renamed from: e */
    public final int f105074e;

    /* renamed from: f */
    public final int f105075f;

    /* renamed from: g */
    public final int f105076g;

    public bcwn(bcwp bcwp, String str, bmxv bmxv, int i, int i2, int i3, int i4) {
        this.f105070a = bcwp;
        this.f105071b = str;
        this.f105072c = bmxv;
        this.f105073d = i;
        this.f105074e = i2;
        this.f105075f = i3;
        this.f105076g = i4;
    }

    /* renamed from: a */
    public final bcwp mo57622a() {
        return this.f105070a;
    }

    /* renamed from: b */
    public final String mo57623b() {
        return this.f105071b;
    }

    /* renamed from: c */
    public final bmxv mo57624c() {
        return this.f105072c;
    }

    /* renamed from: d */
    public final int mo57625d() {
        return this.f105073d;
    }

    /* renamed from: e */
    public final int mo57626e() {
        return this.f105074e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcwr)) {
            return false;
        }
        bcwr bcwr = (bcwr) obj;
        bcwp bcwp = this.f105070a;
        if (bcwp == null ? bcwr.mo57622a() == null : bcwp.equals(bcwr.mo57622a())) {
            String str = this.f105071b;
            if (str == null ? bcwr.mo57623b() == null : str.equals(bcwr.mo57623b())) {
                return this.f105072c.equals(bcwr.mo57624c()) && this.f105073d == bcwr.mo57625d() && this.f105074e == bcwr.mo57626e() && this.f105075f == bcwr.mo57628f() && this.f105076g == bcwr.mo57629g();
            }
        }
    }

    /* renamed from: f */
    public final int mo57628f() {
        return this.f105075f;
    }

    /* renamed from: g */
    public final int mo57629g() {
        return this.f105076g;
    }

    /* renamed from: h */
    public final bcwq mo57630h() {
        return new bcwq(this);
    }

    public final int hashCode() {
        int i;
        bcwp bcwp = this.f105070a;
        int i2 = 0;
        if (bcwp != null) {
            i = bcwp.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str = this.f105071b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((((((((i3 ^ i2) * 1000003) ^ this.f105072c.hashCode()) * 1000003) ^ this.f105073d) * 1000003) ^ this.f105074e) * 1000003) ^ this.f105075f) * 1000003) ^ this.f105076g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105070a);
        String str = this.f105071b;
        String valueOf2 = String.valueOf(this.f105072c);
        int i = this.f105073d;
        int i2 = this.f105074e;
        int i3 = this.f105075f;
        int i4 = this.f105076g;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 127 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("PhotoData{mediaId=");
        sb.append(valueOf);
        sb.append(", localURI=");
        sb.append(str);
        sb.append(", thumbnail=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", size=");
        sb.append(i3);
        sb.append(", downloadStatus=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
