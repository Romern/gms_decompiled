package p000;

/* renamed from: azmo */
final /* synthetic */ class azmo implements Runnable {

    /* renamed from: a */
    private final azmx f99652a;

    /* renamed from: b */
    private final String f99653b;

    /* renamed from: c */
    private final String f99654c;

    public azmo(azmx azmx, String str, String str2) {
        this.f99652a = azmx;
        this.f99653b = str;
        this.f99654c = str2;
    }

    public final void run() {
        azmx azmx = this.f99652a;
        azmx.f99670d.getMessagesForConversationByRenderingType(this.f99653b, this.f99654c, (int) cfeo.f183719a.mo6606a().mo81025bf(), azrm.f99948b.toString());
    }
}
