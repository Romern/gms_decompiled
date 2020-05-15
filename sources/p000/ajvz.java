package p000;

import java.util.List;

/* renamed from: ajvz */
final /* synthetic */ class ajvz implements aubw {

    /* renamed from: a */
    private final ajwd f71388a;

    /* renamed from: b */
    private final C0082ck f71389b;

    /* renamed from: c */
    private final C0081cj f71390c;

    public ajvz(ajwd ajwd, C0082ck ckVar, C0081cj cjVar) {
        this.f71388a = ajwd;
        this.f71389b = ckVar;
        this.f71390c = cjVar;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ajwd ajwd = this.f71388a;
        C0082ck ckVar = this.f71389b;
        C0081cj cjVar = this.f71390c;
        List list = (List) obj;
        ajwd.f71400g.mo38981a(list, true);
        int max = Math.max(0, ckVar.f6971a - list.size());
        ajwd.f71399f.mo38895a(0, max, ajwd.f71401h).mo50373a(new ajwa(ajwd, list, cjVar, max));
    }
}
