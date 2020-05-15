package p000;

import java.util.Map;

/* renamed from: aslb */
final /* synthetic */ class aslb implements C0038ax {

    /* renamed from: a */
    private final aslc f89150a;

    /* renamed from: b */
    private final C0034at f89151b;

    /* renamed from: c */
    private final Map.Entry f89152c;

    public aslb(aslc aslc, C0034at atVar, Map.Entry entry) {
        this.f89150a = aslc;
        this.f89151b = atVar;
        this.f89152c = entry;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        aslc aslc = this.f89150a;
        C0034at atVar = this.f89151b;
        Map.Entry entry = this.f89152c;
        if (((aslx) obj) != aslx.LOADING) {
            aslc.mo2666a(atVar);
            aslc.f89153a.remove(entry.getKey());
            aslc.mo2450b(Boolean.valueOf(!aslc.f89153a.isEmpty()));
        }
    }
}
