package p000;

/* renamed from: bfpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfpc {

    /* renamed from: a */
    public final rjx f114755a;

    /* renamed from: b */
    private final bhbf f114756b;

    public bfpc(bhbf bhbf) {
        this.f114756b = bhbf;
        this.f114755a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62081a(bplu bplu, bpkr bpkr) {
        bxvd da = bpmc.f138211m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpmc bpmc = (bpmc) da.f164949b;
        bpmc.f138219g = 4;
        int i = bpmc.f138213a | 16;
        bpmc.f138213a = i;
        if (bplu != null) {
            bplu.getClass();
            bpmc.f138220h = bplu;
            i |= 32;
            bpmc.f138213a = i;
        }
        if (bpkr != null) {
            bpkr.getClass();
            bpmc.f138218f = bpkr;
            bpmc.f138213a = i | 8;
        }
        mo62082a((bpmc) da.mo74062i());
    }

    public bfpc(bhbf bhbf, rjx rjx) {
        this.f114756b = bhbf;
        this.f114755a = rjx;
    }

    /* renamed from: a */
    public final void mo62082a(bpmc bpmc) {
        bxvd da = bonq.f133833p.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bonq bonq = (bonq) da.f164949b;
        bonq.f133836b = 5;
        int i = bonq.f133835a | 1;
        bonq.f133835a = i;
        bpmc.getClass();
        bonq.f133841g = bpmc;
        bonq.f133835a = i | 32;
        this.f114756b.mo63517a(da.mo74062i()).mo24327b();
    }
}
