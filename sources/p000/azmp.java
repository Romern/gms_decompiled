package p000;

/* renamed from: azmp */
final /* synthetic */ class azmp implements Runnable {

    /* renamed from: a */
    private final azmx f99655a;

    /* renamed from: b */
    private final String f99656b;

    public azmp(azmx azmx, String str) {
        this.f99655a = azmx;
        this.f99656b = str;
    }

    public final void run() {
        azmx azmx = this.f99655a;
        azmx.f99669c.getMessagesForConversation(this.f99656b, 1);
    }
}
