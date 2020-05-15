package p000;

/* renamed from: bdla */
final /* synthetic */ class bdla implements Runnable {

    /* renamed from: a */
    private final bdld f105865a;

    public bdla(bdld bdld) {
        this.f105865a = bdld;
    }

    public final void run() {
        bdld bdld = this.f105865a;
        if (bdld.f105871c.getAndSet(false)) {
            cioo cioo = cioo.PRIMES_CRASH_MONITORING_INITIALIZED;
            ciof ciof = bdld.f105872d;
            bdld.mo58142a(cioo);
            bdld.mo58142a(cioo.PRIMES_FIRST_ACTIVITY_LAUNCHED);
        }
    }
}
