package p000;

/* renamed from: blkx */
final /* synthetic */ class blkx implements Runnable {

    /* renamed from: a */
    private final blky f126775a;

    /* renamed from: b */
    private final blkz f126776b;

    public blkx(blky blky, blkz blkz) {
        this.f126775a = blky;
        this.f126776b = blkz;
    }

    public final void run() {
        blky blky = this.f126775a;
        blky.f126777c.add(this.f126776b);
    }
}
