package p000;

/* renamed from: aikn */
final /* synthetic */ class aikn implements aubt {

    /* renamed from: a */
    private final aikr f69050a;

    /* renamed from: b */
    private final bqgy f69051b;

    public aikn(aikr aikr, bqgy bqgy) {
        this.f69050a = aikr;
        this.f69051b = bqgy;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        aikr aikr = this.f69050a;
        this.f69051b.mo69136a((Throwable) new RuntimeException(String.format("Failed to start BLE Legacy only scanning with settings: %s", aikr.f69055a), exc));
    }
}
