package p000;

/* renamed from: pjn */
final /* synthetic */ class pjn implements aubt {

    /* renamed from: a */
    private final pjs f39368a;

    public pjn(pjs pjs) {
        this.f39368a = pjs;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        pjs pjs = this.f39368a;
        pjs.f39373a.mo23860a(exc, "Joining application failed. ");
        pjs.f39374b.mo23777a(bpfi.REMOTE_CONTROL_NOTIFICATION_FAILED_TO_JOIN_APPLICATION);
        pjs.mo23279a(false);
    }
}
