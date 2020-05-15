package p000;

import android.content.Context;

/* renamed from: bgjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjj implements bgmo {

    /* renamed from: a */
    private final bgij f116610a;

    public bgjj(Context context, bgmk bgmk, bgns bgns, bfct bfct, bgid bgid, bfor bfor) {
        bgij bgij;
        if (!ceze.f183524a.mo6606a().enableNewCollectionGlsClient()) {
            bgij = new bgiw(context, bgmk, bgns, bfct, bgid, bfor);
        } else {
            bgij = new bgin(context, bgmk, bgns, bfct, bgid, bfor);
        }
        this.f116610a = bgij;
    }

    /* renamed from: a */
    public final void mo62891a(bsax bsax) {
        this.f116610a.mo62864a(bsax);
    }

    /* renamed from: a */
    public final void mo62892a(bsax bsax, int i, bgmj bgmj, bgmn bgmn) {
        this.f116610a.mo62865a(bsax, i, bgmj, bgmn);
    }

    /* renamed from: a */
    public final void mo62893a(bsax bsax, bglz bglz) {
        this.f116610a.mo62866a(bsax, bglz);
    }
}
