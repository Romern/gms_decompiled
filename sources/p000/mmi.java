package p000;

import java.util.List;
import java.util.concurrent.Future;

/* renamed from: mmi */
public final /* synthetic */ class mmi implements mmk {

    /* renamed from: a */
    private final Future f34009a;

    public mmi(Future future) {
        this.f34009a = future;
    }

    /* renamed from: a */
    public final List mo20166a() {
        return ((mhl) this.f34009a.get()).mo20020b("image");
    }
}
