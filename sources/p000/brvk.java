package p000;

import java.util.concurrent.Callable;

/* renamed from: brvk */
final /* synthetic */ class brvk implements Callable {

    /* renamed from: a */
    private final brvn f143453a;

    public brvk(brvn brvn) {
        this.f143453a = brvn;
    }

    public final Object call() {
        brvn brvn = this.f143453a;
        brtz brtz = brtz.DEFAULT_CACHE_OK_IF_VALID;
        int ordinal = brvn.f143466i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return bmvz.f131120a;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new IllegalStateException("Unrecognized directive");
                    }
                }
            }
            brvn.f143465h.mo70086a();
            return brvn.f143462e.mo70019a();
        }
        brvn.f143465h.mo70086a();
        return brvn.f143462e.mo70020b();
    }
}
