package p000;

import java.util.Map;

/* renamed from: askz */
final /* synthetic */ class askz implements C0038ax {

    /* renamed from: a */
    private final asla f89147a;

    /* renamed from: b */
    private final Map.Entry f89148b;

    public askz(asla asla, Map.Entry entry) {
        this.f89147a = asla;
        this.f89148b = entry;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        asla asla = this.f89147a;
        Map.Entry entry = this.f89148b;
        if (((aslx) obj) == aslx.CORRECT) {
            asla.f89149a.remove(entry.getKey());
        } else {
            asla.f89149a.add((asly) entry.getKey());
        }
        asla.mo2450b(Boolean.valueOf(asla.f89149a.isEmpty()));
    }
}
