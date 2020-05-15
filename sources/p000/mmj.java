package p000;

import java.util.List;
import java.util.concurrent.Future;

/* renamed from: mmj */
public final /* synthetic */ class mmj implements mmk {

    /* renamed from: a */
    private final Future f34010a;

    public mmj(Future future) {
        this.f34010a = future;
    }

    /* renamed from: a */
    public final List mo20166a() {
        return ((mhl) this.f34010a.get()).mo20020b("audio");
    }
}
