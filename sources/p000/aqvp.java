package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: aqvp */
public final /* synthetic */ class aqvp implements aqwu {

    /* renamed from: a */
    private final aqvs f86930a;

    public aqvp(aqvs aqvs) {
        this.f86930a = aqvs;
    }

    /* renamed from: a */
    public final void mo48117a(List list) {
        aqvs aqvs = this.f86930a;
        aqvs.f86934c = list == null ? new aqqw(Collections.emptyList()) : new aqqw(list);
        List list2 = aqvs.f86933b;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((aqvr) list2.get(i)).mo48038a(aqvs.f86934c);
        }
    }
}
