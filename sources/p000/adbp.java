package p000;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* renamed from: adbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbp implements aaak {

    /* renamed from: a */
    private final bmyl f61344a;

    /* renamed from: b */
    private final HashMap f61345b = new HashMap();

    private adbp(bmyl bmyl) {
        this.f61344a = bmyl;
    }

    /* renamed from: a */
    public static void m50129a(aaag aaag, bmyl bmyl) {
        adbp adbp = new adbp(bmyl);
        aaag.f27835f = bngx.m109356a(adbp);
        aaag.f27836g = bngx.m109356a(adbp);
    }

    /* renamed from: a */
    public final void mo16662a() {
        this.f61345b.clear();
    }

    /* renamed from: a */
    public final void mo33307a(aaab aaab) {
        this.f61345b.put(aaab, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo16663a(aaab aaab, Status status) {
        if (this.f61345b.containsKey(aaab)) {
            Long l = (Long) this.f61345b.get(aaab);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            this.f61344a.mo12292a(new adbq(l.longValue(), valueOf.longValue(), valueOf.longValue() - l.longValue(), status, aaab));
            this.f61345b.remove(aaab);
        }
    }
}
