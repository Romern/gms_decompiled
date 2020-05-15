package p000;

import java.util.List;

/* renamed from: bfpb */
final /* synthetic */ class bfpb implements aubw {

    /* renamed from: a */
    private final bfpc f114753a;

    /* renamed from: b */
    private final List f114754b;

    public bfpb(bfpc bfpc, List list) {
        this.f114753a = bfpc;
        this.f114754b = list;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bfpc bfpc = this.f114753a;
        List list = this.f114754b;
        if (((rkj) obj).mo24824r()) {
            bxvd da = bpmc.f138211m.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpmc bpmc = (bpmc) da.f164949b;
            bpmc.f138219g = 8;
            bpmc.f138213a |= 16;
            if (!bpmc.f138224l.mo73666a()) {
                bpmc.f138224l = bxvk.m124021a(bpmc.f138224l);
            }
            bxsy.m123078a(list, bpmc.f138224l);
            bfpc.mo62082a((bpmc) da.mo74062i());
        }
    }
}
