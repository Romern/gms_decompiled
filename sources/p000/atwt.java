package p000;

import java.util.concurrent.Executor;

/* renamed from: atwt */
public final /* synthetic */ class atwt implements Executor {

    /* renamed from: a */
    private final adzt f91060a;

    public atwt(adzt adzt) {
        this.f91060a = adzt;
    }

    public final void execute(Runnable runnable) {
        this.f91060a.post(runnable);
    }
}
