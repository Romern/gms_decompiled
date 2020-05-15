package p000;

import com.google.android.gms.mdns.MdnsSearchOptions;

/* renamed from: agay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agay extends roh {

    /* renamed from: c */
    final /* synthetic */ rod f65107c;

    /* renamed from: d */
    final /* synthetic */ MdnsSearchOptions f65108d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agay(rod rod, rod rod2, MdnsSearchOptions mdnsSearchOptions) {
        super(rod);
        this.f65107c = rod2;
        this.f65108d = mdnsSearchOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24970a(rjd rjd, aucf aucf) {
        agcl agcl = (agcl) rjd;
        rod rod = this.f65107c;
        MdnsSearchOptions mdnsSearchOptions = this.f65108d;
        rob rob = rod.f43429b;
        if (rob != null) {
            synchronized (agcl.f65215a) {
                agcb agcb = (agcb) agcl.f65215a.get(rob);
                if (agcb == null) {
                    agcb = new agcb(rod);
                    agcl.f65215a.put(rob, agcb);
                }
                ((agbz) agcl.mo25289B()).mo35187a(agcb, mdnsSearchOptions);
            }
        }
        aucf.mo50391a((Object) null);
    }
}
