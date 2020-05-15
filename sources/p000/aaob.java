package p000;

/* renamed from: aaob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaob {

    /* renamed from: a */
    public static final bnic f28671a = bnic.m109493a("INSTALL_ASSET", "REMOVE_ASSET", "DECLINE_ASSET", "UPDATES_AVAILABLE", "SERVER_NOTIFICATION");

    /* renamed from: d */
    private static final bnhe f28672d;

    /* renamed from: b */
    public final String f28673b;

    /* renamed from: c */
    public final aamh f28674c;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b("android.intent.category.MASTER_CLEAR", "android");
        bnha.mo67695b("android.server.checkin.CHECKIN", "com.google.android.gms");
        bnha.mo67695b("com.google.android.gsf.subscribedfeeds", "com.google.android.gsf");
        bnha.mo67695b("INSTALL_ASSET", "com.android.vending");
        bnha.mo67695b("REMOVE_ASSET", "com.android.vending");
        bnha.mo67695b("SERVER_NOTIFICATION", "com.android.vending");
        bnha.mo67695b("DECLINE_ASSET", "com.android.vending");
        bnha.mo67695b("com.google.android.gsf", "com.google.android.gsf");
        bnha.mo67695b("com.google.android.apps.googlevoice.INBOX_NOTIFICATION", "com.google.android.apps.googlevoice");
        f28672d = bnha.mo67618b();
    }

    private aaob(String str, int i) {
        sdo.m34959a((Object) str);
        this.f28673b = str;
        this.f28674c = aamh.m21513a(mo17169a(), i);
    }

    /* renamed from: a */
    public static aaob m21739a(blmp blmp) {
        return new aaob(blmp.f126870e, (int) blmp.f126876k);
    }

    /* renamed from: b */
    public final boolean mo17170b() {
        return f28672d.containsKey(this.f28673b);
    }

    /* renamed from: c */
    public final boolean mo17171c() {
        return "GSYNC_TICKLE".equals(this.f28673b);
    }

    /* renamed from: a */
    public final String mo17169a() {
        if (mo17170b()) {
            return (String) f28672d.get(this.f28673b);
        }
        return !mo17171c() ? this.f28673b : "com.google.android.gsf";
    }
}
