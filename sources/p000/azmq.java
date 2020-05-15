package p000;

/* renamed from: azmq */
final /* synthetic */ class azmq implements Runnable {

    /* renamed from: a */
    private final azmx f99657a;

    /* renamed from: b */
    private final String f99658b;

    public azmq(azmx azmx, String str) {
        this.f99657a = azmx;
        this.f99658b = str;
    }

    public final void run() {
        azmx azmx = this.f99657a;
        azmx.f99669c.getConversation(this.f99658b);
    }
}
