package p000;

/* renamed from: aviy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aviy {

    /* renamed from: a */
    final String f93258a;

    /* renamed from: b */
    final String f93259b;

    /* renamed from: c */
    final String f93260c;

    public aviy(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append(str);
        sb.append(":UdcConsistencyTokenPrefsHas");
        this.f93258a = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30);
        sb2.append(str);
        sb2.append(":UdcConsistencyTokenPrefsToken");
        this.f93259b = sb2.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 28);
        sb3.append(str);
        sb3.append(":UdcConsistencyTokenPrefsAge");
        this.f93260c = sb3.toString();
    }
}
