package p000;

import android.os.IBinder;

/* renamed from: ooh */
final /* synthetic */ class ooh implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final oop f38064a;

    public ooh(oop oop) {
        this.f38064a = oop;
    }

    public final void binderDied() {
        nuu.m27792a(new ooi(this.f38064a));
    }
}
