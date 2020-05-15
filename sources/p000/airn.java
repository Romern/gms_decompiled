package p000;

/* renamed from: airn */
final /* synthetic */ class airn implements ahfj {

    /* renamed from: a */
    private final airo f69566a;

    /* renamed from: b */
    private final Thread f69567b;

    public airn(airo airo, Thread thread) {
        this.f69566a = airo;
        this.f69567b = thread;
    }

    /* renamed from: a */
    public final void mo36397a() {
        airo airo = this.f69566a;
        Thread thread = this.f69567b;
        airo.f69572h = true;
        thread.interrupt();
    }
}
