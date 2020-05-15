package p000;

/* renamed from: bcym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcym extends bcyz {

    /* renamed from: a */
    private final int f105125a;

    /* renamed from: b */
    private final String f105126b;

    /* renamed from: c */
    private final bngx f105127c;

    public bcym(int i, String str, bngx bngx) {
        this.f105125a = i;
        this.f105126b = str;
        this.f105127c = bngx;
    }

    /* renamed from: a */
    public final int mo57693a() {
        return this.f105125a;
    }

    /* renamed from: b */
    public final String mo57694b() {
        return this.f105126b;
    }

    /* renamed from: c */
    public final bngx mo57695c() {
        return this.f105127c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcyz) {
            bcyz bcyz = (bcyz) obj;
            return this.f105125a == bcyz.mo57693a() && this.f105126b.equals(bcyz.mo57694b()) && bnkn.m109669a(this.f105127c, bcyz.mo57695c());
        }
    }

    public final int hashCode() {
        return ((((this.f105125a ^ 1000003) * 1000003) ^ this.f105126b.hashCode()) * 1000003) ^ this.f105127c.hashCode();
    }

    public final String toString() {
        int i = this.f105125a;
        String str = this.f105126b;
        String valueOf = String.valueOf(this.f105127c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(valueOf).length());
        sb.append("CardCarousel{cardWidth=");
        sb.append(i);
        sb.append(", jsonSource=");
        sb.append(str);
        sb.append(", cards=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
