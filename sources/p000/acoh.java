package p000;

/* renamed from: acoh */
final /* synthetic */ class acoh implements Runnable {

    /* renamed from: a */
    private final acok f60332a;

    public acoh(acok acok) {
        this.f60332a = acok;
    }

    public final void run() {
        acok acok = this.f60332a;
        if (!acok.f60345g) {
            int i = acok.m49605e(acok.f60342d).getInt("db_version", -1);
            acnv.m49555d("Current SMS db vesion = %d", Integer.valueOf(i));
            String[] strArr = acom.f60348d;
            if (i < 3) {
                acok.m49605e(acok.f60342d).edit().clear().apply();
            }
            acok.m49605e(acok.f60342d).edit().putInt("db_version", 4).apply();
            acnv.m49555d("Set SMS db vesion = %d", 4);
            acok.m49605e(acok.f60342d).edit().putBoolean("enable_sms_corpus_with_appdatasearchhelper", true).apply();
            acok.mo32952a(false);
            acof.m49593a(acok.f60342d);
            acok.f60345g = true;
        }
    }
}
