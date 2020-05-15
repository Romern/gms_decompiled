package p000;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

/* renamed from: kiv */
final /* synthetic */ class kiv implements bqeh {

    /* renamed from: a */
    private final kjg f24225a;

    /* renamed from: b */
    private final Executor f24226b;

    public kiv(kjg kjg, Executor executor) {
        this.f24225a = kjg;
        this.f24226b = executor;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kjg kjg = this.f24225a;
        Executor executor = this.f24226b;
        List list = (List) ((bnhe) obj).entrySet().stream().map(new kiy(kjg)).collect(Collectors.toList());
        return bqga.m112782b((List) list.stream().map(kiz.f24230a).collect(Collectors.toList())).mo69216a(new kja(list), executor);
    }
}
