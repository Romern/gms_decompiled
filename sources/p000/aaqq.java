package p000;

/* renamed from: aaqq */
final /* synthetic */ class aaqq implements Runnable {

    /* renamed from: a */
    private final aaqs f28937a;

    /* renamed from: b */
    private final aaqx f28938b;

    public aaqq(aaqs aaqs, aaqx aaqx) {
        this.f28937a = aaqs;
        this.f28938b = aaqx;
    }

    public final void run() {
        aaqs aaqs = this.f28937a;
        aaqx aaqx = this.f28938b;
        bngx a = aaqs.f28943b.mo17023a();
        if (!a.isEmpty()) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                aaqs.mo17189a(aaqx, (aamh) a.get(i));
            }
        }
    }
}
