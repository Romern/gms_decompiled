package p000;

import java.util.concurrent.CancellationException;

/* renamed from: bbkf */
final /* synthetic */ class bbkf implements bqeh {

    /* renamed from: a */
    private final bbkg f102805a;

    public bbkf(bbkg bbkg) {
        this.f102805a = bbkg;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        bbkg bbkg = this.f102805a;
        CancellationException cancellationException = (CancellationException) obj;
        synchronized (bbkg.f102806a) {
            bmxy.m108581a(bbkg.f102808c);
            if (bbkg.f102807b) {
                bqgg = bqga.m112777a((Throwable) new bbkm("Connectivity lost while downloading photos."));
            } else {
                bqgg = bbkg.f102808c;
            }
        }
        return bqgg;
    }
}
