package p000;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bapd */
final /* synthetic */ class bapd implements Callable {

    /* renamed from: a */
    private final bapl f101467a;

    /* renamed from: b */
    private final List f101468b;

    public bapd(bapl bapl, List list) {
        this.f101467a = bapl;
        this.f101468b = list;
    }

    public final Object call() {
        bapl bapl = this.f101467a;
        List list = this.f101468b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((bqgg) list.get(i)).get();
            } catch (Exception e) {
                ((acdc) bapl.f101506h.mo16713a()).mo32707a("MDH sync failure", e);
            }
        }
        return null;
    }
}
