package p000;

/* renamed from: agsj */
final /* synthetic */ class agsj implements Runnable {

    /* renamed from: a */
    private final agsl f66357a;

    /* renamed from: b */
    private final int f66358b;

    public agsj(agsl agsl, int i) {
        this.f66357a = agsl;
        this.f66358b = i;
    }

    public final void run() {
        agsl agsl = this.f66357a;
        int i = this.f66358b;
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: newCpidFetched", "BgTaskManager");
        agsl.mo36057b(bxzv.TASK_HTTP_CPID_FETCH, bxzu.EVENT_CPID_CHANGED, i);
        agsl.mo36054a(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_CPID_CHANGED, i);
        if (agsl.mo36055a(i)) {
            agsp agsp = new agsp();
            agsp.f66377a = agsl.f66365c;
            agsp.f66378b = Integer.valueOf(i);
            if (agsp.mo36062a().mo36063a()) {
                agsl.mo36057b(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_GCORE_REGISTER_PERFORMED, i);
            }
        }
    }
}
