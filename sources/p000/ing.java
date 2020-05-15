package p000;

/* renamed from: ing */
final /* synthetic */ class ing implements auca {

    /* renamed from: a */
    private final ini f21381a;

    /* renamed from: b */
    private final int f21382b;

    public ing(ini ini, int i) {
        this.f21381a = ini;
        this.f21382b = i;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        ini ini = this.f21381a;
        int i = this.f21382b;
        Void voidR = (Void) obj;
        ini.f21384a.mo25412b("bulkRegister was successful, trying registerSync", new Object[0]);
        return ini.f21386b.mo41758a("com.google.android.gms.auth_account", i, new String[]{"ANDROID_AUTH"}, null, "").mo50382b(new inh(ini));
    }
}
