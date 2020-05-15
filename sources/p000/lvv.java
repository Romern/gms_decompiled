package p000;

/* renamed from: lvv */
final /* synthetic */ class lvv implements Runnable {

    /* renamed from: a */
    private final lvw f33081a;

    public lvv(lvw lvw) {
        this.f33081a = lvw;
    }

    public final void run() {
        lvw lvw = this.f33081a;
        if (System.currentTimeMillis() - lvw.f33083b.getLong("lastKvBackupPassTimeMs", -1) < lvw.f33084c) {
            lvw.f33082a.mo25412b("Backup still in progress, still polling", new Object[0]);
            return;
        }
        lvw.f33082a.mo25412b("Confirmed backup is not running", new Object[0]);
        bqgy bqgy = lvw.f33085d;
        if (bqgy != null) {
            bqgy.mo69138b((Object) null);
        }
        lvw.mo19686b();
    }
}
