package p000;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

/* renamed from: kja */
final /* synthetic */ class kja implements Callable {

    /* renamed from: a */
    private final List f24233a;

    public kja(List list) {
        this.f24233a = list;
    }

    public final Object call() {
        List list = this.f24233a;
        int i = kjg.f24238c;
        return (List) list.stream().map(kiq.f24220a).filter(kir.f24221a).collect(Collectors.toList());
    }
}
