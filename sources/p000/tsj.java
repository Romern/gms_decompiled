package p000;

/* renamed from: tsj */
public final /* synthetic */ class tsj implements C0038ax {

    /* renamed from: a */
    private final tsk f46589a;

    public tsj(tsk tsk) {
        this.f46589a = tsk;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tsk tsk = this.f46589a;
        Boolean bool = (Boolean) obj;
        if (bool != null && tsk.f46594e != null && tsk.f46595f != null) {
            if (tsk.f46596g && !bool.booleanValue()) {
                tsk.mo26768a(true);
            } else if (!tsk.f46596g && bool.booleanValue()) {
                tsk.mo26767a(tsk.f46594e, tsk.f46595f, false);
            }
            tsk.f46596g = false;
        }
    }
}
