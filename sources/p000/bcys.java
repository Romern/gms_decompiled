package p000;

/* renamed from: bcys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcys extends bczn {

    /* renamed from: a */
    private final String f105143a;

    /* renamed from: b */
    private final bmxv f105144b;

    /* renamed from: c */
    private final bcov f105145c;

    /* renamed from: d */
    private final int f105146d;

    /* renamed from: e */
    private final int f105147e;

    /* renamed from: f */
    private final int f105148f;

    /* renamed from: g */
    private final boolean f105149g;

    public bcys(String str, bmxv bmxv, bcov bcov, int i, int i2, int i3, boolean z) {
        this.f105143a = str;
        this.f105144b = bmxv;
        this.f105145c = bcov;
        this.f105146d = i;
        this.f105147e = i2;
        this.f105148f = i3;
        this.f105149g = z;
    }

    /* renamed from: a */
    public final String mo57729a() {
        return this.f105143a;
    }

    /* renamed from: b */
    public final bmxv mo57730b() {
        return this.f105144b;
    }

    /* renamed from: c */
    public final bcov mo57731c() {
        return this.f105145c;
    }

    /* renamed from: d */
    public final int mo57732d() {
        return this.f105146d;
    }

    /* renamed from: e */
    public final int mo57733e() {
        return this.f105147e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczn) {
            bczn bczn = (bczn) obj;
            return this.f105143a.equals(bczn.mo57729a()) && this.f105144b.equals(bczn.mo57730b()) && this.f105145c.equals(bczn.mo57731c()) && this.f105146d == bczn.mo57732d() && this.f105147e == bczn.mo57733e() && this.f105148f == bczn.mo57735f() && this.f105149g == bczn.mo57736g();
        }
    }

    /* renamed from: f */
    public final int mo57735f() {
        return this.f105148f;
    }

    /* renamed from: g */
    public final boolean mo57736g() {
        return this.f105149g;
    }

    public final int hashCode() {
        return ((((((((((((this.f105143a.hashCode() ^ 1000003) * 1000003) ^ this.f105144b.hashCode()) * 1000003) ^ this.f105145c.hashCode()) * 1000003) ^ this.f105146d) * 1000003) ^ this.f105147e) * 1000003) ^ this.f105148f) * 1000003) ^ (!this.f105149g ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f105143a;
        String valueOf = String.valueOf(this.f105144b);
        String valueOf2 = String.valueOf(this.f105145c);
        int i = this.f105146d;
        int i2 = this.f105147e;
        int i3 = this.f105148f;
        boolean z = this.f105149g;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 136 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RichCardButton{text=");
        sb.append(str);
        sb.append(", lighterIcon=");
        sb.append(valueOf);
        sb.append(", action=");
        sb.append(valueOf2);
        sb.append(", textColor=");
        sb.append(i);
        sb.append(", backgroundColor=");
        sb.append(i2);
        sb.append(", borderColor=");
        sb.append(i3);
        sb.append(", enabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
