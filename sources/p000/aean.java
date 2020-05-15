package p000;

import java.util.Map;

/* renamed from: aean */
final /* synthetic */ class aean implements aeas {

    /* renamed from: a */
    private final aeat f62997a;

    /* renamed from: b */
    private final aeca f62998b;

    public aean(aeat aeat, aeca aeca) {
        this.f62997a = aeat;
        this.f62998b = aeca;
    }

    /* renamed from: a */
    public final void mo33981a(aebs aebs) {
        Map map;
        aeat aeat = this.f62997a;
        aeca aeca = this.f62998b;
        synchronized (aeat) {
            if (aebs.mo34022b(aeca) && (map = (Map) aeat.f63012d.get(aeca.f63112e)) != null && map.containsKey(aeca.f63114g)) {
                map.put(aeca.f63114g, true);
            }
        }
    }
}
