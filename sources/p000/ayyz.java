package p000;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: ayyz */
final /* synthetic */ class ayyz implements Callable {

    /* renamed from: a */
    private final List f98787a;

    /* renamed from: b */
    private final bxvf[] f98788b;

    public ayyz(List list, bxvf[] bxvfArr) {
        this.f98787a = list;
        this.f98788b = bxvfArr;
    }

    public final Object call() {
        List list = this.f98787a;
        bxvf[] bxvfArr = this.f98788b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ayyk) bqga.m112780a((Future) ((bqgg) list.get(i)))).mo54528a(null);
        }
        return bxvfArr;
    }
}
