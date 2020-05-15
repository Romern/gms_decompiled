package p000;

/* renamed from: axg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axg {

    /* renamed from: a */
    public final /* synthetic */ String f2484a;

    /* renamed from: b */
    final /* synthetic */ String f2485b;

    /* renamed from: c */
    public final /* synthetic */ String f2486c;

    /* renamed from: d */
    public final /* synthetic */ axm f2487d;

    public axg(String str, String str2, String str3, axm axm) {
        this.f2484a = str;
        this.f2485b = str2;
        this.f2486c = str3;
        this.f2487d = axm;
    }

    public final String toString() {
        String str = this.f2485b;
        String str2 = this.f2486c;
        String str3 = this.f2484a;
        String valueOf = String.valueOf(this.f2487d);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 14 + length2 + str3.length() + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(str2);
        sb.append(" NS(");
        sb.append(str3);
        sb.append("), FORM (");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
