package p000;

import com.google.android.chimera.config.InvalidConfigException;

/* renamed from: ardb */
final /* synthetic */ class ardb implements Runnable {

    /* renamed from: a */
    private final ardc f87411a;

    public ardb(ardc ardc) {
        this.f87411a = ardc;
    }

    public final void run() {
        armh armh = this.f87411a.f87413b;
        armh.f87898d.mo48676b();
        try {
            armg.m73111a(armh.f87896b, armh.f87901g);
        } catch (InvalidConfigException e) {
            armh.f87895a.mo25410a((Throwable) e);
        }
    }
}
