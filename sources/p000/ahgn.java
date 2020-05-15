package p000;

import android.app.Notification;

/* renamed from: ahgn */
final /* synthetic */ class ahgn implements Runnable {

    /* renamed from: a */
    private final ahgp f67168a;

    /* renamed from: b */
    private final String f67169b;

    /* renamed from: c */
    private final int f67170c;

    /* renamed from: d */
    private final Notification f67171d;

    public ahgn(ahgp ahgp, String str, int i, Notification notification) {
        this.f67168a = ahgp;
        this.f67169b = str;
        this.f67170c = i;
        this.f67171d = notification;
    }

    public final void run() {
        this.f67168a.mo36454a(this.f67169b, this.f67170c, this.f67171d);
    }
}
