package p000;

import android.app.Notification;

/* renamed from: ahgm */
final /* synthetic */ class ahgm implements Runnable {

    /* renamed from: a */
    private final ahgp f67165a;

    /* renamed from: b */
    private final int f67166b;

    /* renamed from: c */
    private final Notification f67167c;

    public ahgm(ahgp ahgp, int i, Notification notification) {
        this.f67165a = ahgp;
        this.f67166b = i;
        this.f67167c = notification;
    }

    public final void run() {
        this.f67165a.mo36450a(this.f67166b, this.f67167c);
    }
}
