package p000;

import android.os.IBinder;

/* renamed from: aibe */
public final /* synthetic */ class aibe implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final burz f68596a;

    public aibe(burz burz) {
        this.f68596a = burz;
    }

    public final void binderDied() {
        burz burz = this.f68596a;
        srn srn = ahsd.f67925a;
        burz.mo73077c();
    }
}
