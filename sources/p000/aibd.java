package p000;

import android.os.IBinder;

/* renamed from: aibd */
public final /* synthetic */ class aibd implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final busf f68595a;

    public aibd(busf busf) {
        this.f68595a = busf;
    }

    public final void binderDied() {
        busf busf = this.f68595a;
        srn srn = ahsd.f67925a;
        busf.mo73080a();
    }
}
