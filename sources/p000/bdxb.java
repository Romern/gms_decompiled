package p000;

import java.util.List;

/* renamed from: bdxb */
final /* synthetic */ class bdxb implements bqeh {

    /* renamed from: a */
    private final bdxi f106565a;

    /* renamed from: b */
    private final List f106566b;

    /* renamed from: c */
    private final List f106567c;

    public bdxb(bdxi bdxi, List list, List list2) {
        this.f106565a = bdxi;
        this.f106566b = list;
        this.f106567c = list2;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bdxi bdxi = this.f106565a;
        List list = this.f106566b;
        List list2 = this.f106567c;
        Exception exc = (Exception) obj;
        if (bdvw.m91501a(exc)) {
            return bdrg.m91327a(bdxi.f106583g.f106586b.mo58420a(list), new bdwe(exc));
        }
        return bdrg.m91327a(bdxi.f106583g.f106586b.mo58420a(list2), new bdvy(exc));
    }
}
