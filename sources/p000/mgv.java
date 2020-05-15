package p000;

/* renamed from: mgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mgv {

    /* renamed from: a */
    final long f33660a = System.currentTimeMillis();

    /* renamed from: b */
    final String f33661b;

    /* renamed from: c */
    final String f33662c;

    public mgv(String str, String str2) {
        this.f33661b = str;
        this.f33662c = str2;
    }

    public final String toString() {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        C1248on.m19794a(this.f33660a - currentTimeMillis, sb);
        sb.append("\t");
        sb.append(this.f33661b);
        sb.append("\t");
        sb.append(this.f33662c);
        return sb.toString();
    }
}
