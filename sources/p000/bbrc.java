package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: bbrc */
final /* synthetic */ class bbrc implements Runnable {

    /* renamed from: a */
    private final bbrr f103198a;

    /* renamed from: b */
    private final bqgg f103199b;

    /* renamed from: c */
    private final bcoh f103200c;

    public bbrc(bbrr bbrr, bqgg bqgg, bcoh bcoh) {
        this.f103198a = bbrr;
        this.f103199b = bqgg;
        this.f103200c = bcoh;
    }

    public final void run() {
        bbrr bbrr = this.f103198a;
        bqgg bqgg = this.f103199b;
        bcoh bcoh = this.f103200c;
        try {
            bqga.m112783b(bqgg).mo69216a(new bbrf(bqgg), bqfb.INSTANCE).get();
        } catch (InterruptedException | ExecutionException e) {
            bbos.m88292b("LitBlockController", "Failed to store block list", e);
        }
        bbrr.f103237e.remove(bcoh);
    }
}
