package p000;

import com.google.android.libraries.messaging.lighter.model.Notification;

/* renamed from: bbwu */
final /* synthetic */ class bbwu implements Runnable {

    /* renamed from: a */
    private final bbwv f103632a;

    /* renamed from: b */
    private final bcoh f103633b;

    /* renamed from: c */
    private final Notification f103634c;

    public bbwu(bbwv bbwv, bcoh bcoh, Notification notification) {
        this.f103632a = bbwv;
        this.f103633b = bcoh;
        this.f103634c = notification;
    }

    public final void run() {
        bbwv bbwv = this.f103632a;
        bcoh bcoh = this.f103633b;
        bbwv.mo56478b(bcoh).mo56632a(this.f103634c);
    }
}
