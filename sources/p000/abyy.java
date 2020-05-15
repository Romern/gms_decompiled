package p000;

/* renamed from: abyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyy {

    /* renamed from: a */
    public final int f58775a;

    /* renamed from: b */
    public final boolean f58776b;

    /* renamed from: c */
    public final boolean f58777c;

    /* renamed from: d */
    public final boolean f58778d;

    /* renamed from: e */
    public final boolean f58779e;

    /* renamed from: f */
    public final String f58780f;

    /* renamed from: g */
    public final String f58781g;

    /* renamed from: h */
    private final int f58782h;

    public abyy(int i, boolean z, boolean z2, boolean z3, boolean z4, String str, int i2, String str2) {
        this.f58775a = i;
        this.f58776b = z;
        this.f58777c = z2;
        this.f58778d = z3;
        this.f58779e = z4;
        sdo.m34959a((Object) str);
        this.f58780f = str;
        this.f58781g = str2;
        this.f58782h = i2;
    }

    /* renamed from: a */
    public final boolean mo32512a() {
        return this.f58776b || this.f58777c;
    }

    /* renamed from: b */
    public final int mo32513b() {
        sdo.m34970a(this.f58782h != -1);
        return this.f58782h;
    }

    public final String toString() {
        int i = this.f58775a;
        boolean z = this.f58776b;
        boolean z2 = this.f58777c;
        String str = this.f58780f;
        StringBuilder sb = new StringBuilder(str.length() + 95);
        sb.append("ClientRequest[callingUid=");
        sb.append(i);
        sb.append(", isSuperUser=");
        sb.append(z);
        sb.append(", isGoogleSearchApp=");
        sb.append(z2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
