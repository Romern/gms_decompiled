package p000;

import android.os.IBinder;

/* renamed from: ahjl */
final /* synthetic */ class ahjl implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final ahjo f67275a;

    public ahjl(ahjo ahjo) {
        this.f67275a = ahjo;
    }

    public final void binderDied() {
        this.f67275a.mo36604a(true);
    }
}
