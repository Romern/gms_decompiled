package p000;

import java.util.List;

/* renamed from: ajwb */
final /* synthetic */ class ajwb implements aubw {

    /* renamed from: a */
    private final ajwd f71395a;

    /* renamed from: b */
    private final C0080ci f71396b;

    /* renamed from: c */
    private final C0083cl f71397c;

    public ajwb(ajwd ajwd, C0080ci ciVar, C0083cl clVar) {
        this.f71395a = ajwd;
        this.f71396b = ciVar;
        this.f71397c = clVar;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ajwd ajwd = this.f71395a;
        C0080ci ciVar = this.f71396b;
        C0083cl clVar = this.f71397c;
        List list = (List) obj;
        ajwd.f71400g.mo38981a(list, false);
        Integer valueOf = Integer.valueOf(((Integer) clVar.f6997a).intValue() + 5);
        if (!ciVar.f6895a.mo3776a()) {
            if (ciVar.f6895a.f6595a != 1) {
                C0084cm cmVar = ciVar.f6896b;
                synchronized (cmVar.f7037b) {
                    cmVar.f7039d = valueOf;
                }
            } else {
                C0084cm cmVar2 = ciVar.f6896b;
                synchronized (cmVar2.f7037b) {
                    cmVar2.f7038c = valueOf;
                }
            }
            ciVar.f6895a.mo3775a(new C0086co(list, null));
        }
    }
}
