package p000;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: ayys */
final /* synthetic */ class ayys implements Callable {

    /* renamed from: a */
    private final List f98764a;

    /* renamed from: b */
    private final bxvf[] f98765b;

    public ayys(List list, bxvf[] bxvfArr) {
        this.f98764a = list;
        this.f98765b = bxvfArr;
    }

    public final Object call() {
        List list = this.f98764a;
        bxvf[] bxvfArr = this.f98765b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ayyk) bqga.m112780a((Future) ((bqgg) list.get(i)))).mo54528a(null);
        }
        return bxvfArr;
    }
}
