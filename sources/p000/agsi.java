package p000;

/* renamed from: agsi */
public final /* synthetic */ class agsi implements Runnable {

    /* renamed from: a */
    private final agsl f66356a;

    public agsi(agsl agsl) {
        this.f66356a = agsl;
    }

    public final void run() {
        agsl agsl = this.f66356a;
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: localeChanged", "BgTaskManager");
        int c = agrl.m54949c();
        agsl.mo36054a(bxzv.TASK_GET_CONSENT_INFO, bxzu.EVENT_LOCALE_CHANGED, c);
        agsl.mo36054a(bxzv.TASK_HTTP_CPID_FETCH, bxzu.EVENT_LOCALE_CHANGED, c);
        agsl.mo36054a(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_LOCALE_CHANGED, c);
    }
}
