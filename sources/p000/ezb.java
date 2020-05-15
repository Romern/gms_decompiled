package p000;

import java.util.List;

/* renamed from: ezb */
final /* synthetic */ class ezb implements C0038ax {

    /* renamed from: a */
    private final ezm f16080a;

    public ezb(ezm ezm) {
        this.f16080a = ezm;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ezm ezm = this.f16080a;
        List list = (List) obj;
        eyu eyu = ezm.f16101b;
        boolean z = !list.isEmpty();
        eyu.f16060n = z;
        if (z && eyu.f16059m == eyt.COMPACT) {
            eyu.mo10593a(eyu.f16067u);
        }
        ezm.setHasOptionsMenu(!list.isEmpty());
        ezm.f16109j = list;
        ezm.getActivity().invalidateOptionsMenu();
    }
}
