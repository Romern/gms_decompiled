package p000;

import java.util.Map;

/* renamed from: asld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asld {

    /* renamed from: a */
    public final C0034at f89154a;

    /* renamed from: b */
    public final C0034at f89155b;

    /* renamed from: c */
    public final C0034at f89156c;

    /* renamed from: d */
    public final bnhe f89157d;

    public asld(bnhe bnhe) {
        this.f89157d = bnhe;
        this.f89154a = new aslc(bnhe);
        this.f89155b = new asla(bnhe);
        C0036av avVar = new C0036av();
        bnrd a = bnhe.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            avVar.mo2667a(C0052bk.m3243a((C0034at) entry.getValue()), new asky(avVar, entry));
        }
        this.f89156c = avVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bnhe mo49220a() {
        bnha h = bnhe.m109414h();
        bnrd a = this.f89157d.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            h.mo67695b((asly) entry.getKey(), (aslx) ((C0034at) entry.getValue()).mo2448b());
        }
        return h.mo67618b();
    }
}
