package p000;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: ayvm */
final /* synthetic */ class ayvm implements Callable {

    /* renamed from: a */
    private final List f98568a;

    public ayvm(List list) {
        this.f98568a = list;
    }

    public final Object call() {
        boolean z;
        List list = this.f98568a;
        int size = list.size();
        ayvk ayvk = null;
        for (int i = 0; i < size; i++) {
            ayvk ayvk2 = (ayvk) bqga.m112780a((Future) ((bqgg) list.get(i)));
            if (ayvk2 != null) {
                if (ayvk == null) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108601b(z, "More than one auth provider provided result.");
                ayvk = ayvk2;
            }
        }
        if (ayvk != null) {
            return ayvk;
        }
        throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
    }
}
