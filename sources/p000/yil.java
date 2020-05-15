package p000;

import java.util.List;
import java.util.Map;

/* renamed from: yil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yil implements yif {

    /* renamed from: a */
    private final yfy f53866a;

    /* renamed from: b */
    private final Map f53867b;

    public yil(yfy yfy, Map map) {
        this.f53866a = yfy;
        this.f53867b = map;
    }

    /* renamed from: a */
    public final void mo30538a(yid yid) {
        caae caae = yid.f53853a;
        if (this.f53867b.containsKey(caae)) {
            this.f53866a.mo30453a(caae, yid.f53854b);
        }
    }

    /* renamed from: a */
    public final void mo30539a(yie yie) {
        List list = yie.f53858d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((yig) list.get(i)).mo30534a(this);
        }
    }
}
