package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bftf */
final /* synthetic */ class bftf implements aubw {

    /* renamed from: a */
    private final bftg f115198a;

    /* renamed from: b */
    private final bpkg f115199b;

    public bftf(bftg bftg, bpkg bpkg) {
        this.f115198a = bftg;
        this.f115199b = bpkg;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bftg bftg = this.f115198a;
        bpkg bpkg = this.f115199b;
        if (((rkj) obj).mo24824r()) {
            bxvd da = bonq.f133833p.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bonq bonq = (bonq) da.f164949b;
            bonq.f133836b = 14;
            int i = bonq.f133835a | 1;
            bonq.f133835a = i;
            bpkg.getClass();
            bonq.f133848n = bpkg;
            bonq.f133835a = i | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bftg.f115200a.mo24333a((bonq) da.mo74062i()).mo24327b();
        }
    }
}
