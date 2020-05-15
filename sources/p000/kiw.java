package p000;

import java.util.List;
import java.util.stream.Collectors;

/* renamed from: kiw */
final /* synthetic */ class kiw implements bmxj {

    /* renamed from: a */
    static final bmxj f24227a = new kiw();

    private kiw() {
    }

    public final Object apply(Object obj) {
        int i = kjg.f24238c;
        return (bnic) ((List) obj).stream().map(kis.f24222a).collect(Collectors.collectingAndThen(Collectors.toList(), kit.f24223a));
    }
}
