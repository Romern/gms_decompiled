package p000;

/* renamed from: agsk */
public final /* synthetic */ class agsk implements Runnable {

    /* renamed from: a */
    private final agsl f66359a;

    /* renamed from: b */
    private final Integer f66360b;

    public agsk(agsl agsl, Integer num) {
        this.f66359a = agsl;
        this.f66360b = num;
    }

    public final void run() {
        agsl agsl = this.f66359a;
        Integer num = this.f66360b;
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: newConsentStatus", "BgTaskManager");
        int c = num == null ? agrl.m54949c() : num.intValue();
        agsl.mo36054a(bxzv.TASK_SET_CONSENT_STATUS, bxzu.EVENT_CONSENT_STATUS_CHANGED, c);
        agsl.mo36054a(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_CONSENT_STATUS_CHANGED, c);
        if (agsl.mo36058b(c)) {
            agsy agsy = new agsy();
            agsy.f66411a = agsl.f66365c;
            agsy.f66412b = Integer.valueOf(c);
            if (agsy.mo36072a().mo36073a()) {
                agsl.mo36057b(bxzv.TASK_SET_CONSENT_STATUS, bxzu.EVENT_CONSENT_STATUS_PROPAGATED, c);
            }
        }
        if (agsl.mo36055a(c)) {
            agsp agsp = new agsp();
            agsp.f66377a = agsl.f66365c;
            agsp.f66378b = Integer.valueOf(c);
            if (agsp.mo36062a().mo36063a()) {
                agsl.mo36057b(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_GCORE_REGISTER_PERFORMED, c);
            }
        }
    }
}
