package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ajwa */
final /* synthetic */ class ajwa implements aubw {

    /* renamed from: a */
    private final ajwd f71391a;

    /* renamed from: b */
    private final List f71392b;

    /* renamed from: c */
    private final C0081cj f71393c;

    /* renamed from: d */
    private final int f71394d;

    public ajwa(ajwd ajwd, List list, C0081cj cjVar, int i) {
        this.f71391a = ajwd;
        this.f71392b = list;
        this.f71393c = cjVar;
        this.f71394d = i;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ajwd ajwd = this.f71391a;
        List list = this.f71392b;
        C0081cj cjVar = this.f71393c;
        int i = this.f71394d;
        List list2 = (List) obj;
        ajwd.f71400g.mo38981a(list2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        Integer valueOf = Integer.valueOf(i);
        if (!cjVar.f6921a.mo3776a()) {
            C0084cm cmVar = cjVar.f6922b;
            synchronized (cmVar.f7037b) {
                cmVar.f7039d = null;
                cmVar.f7038c = valueOf;
            }
            cjVar.f6921a.mo3775a(new C0086co(arrayList, null));
        }
    }
}
