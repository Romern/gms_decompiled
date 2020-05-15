package p000;

import com.felicanetworks.mfc.AppInfo;

/* renamed from: brfo */
final /* synthetic */ class brfo implements Runnable {

    /* renamed from: a */
    private final brgm f142764a;

    /* renamed from: b */
    private final int f142765b;

    /* renamed from: c */
    private final String f142766c;

    /* renamed from: d */
    private final AppInfo f142767d;

    public brfo(brgm brgm, int i, String str, AppInfo appInfo) {
        this.f142764a = brgm;
        this.f142765b = i;
        this.f142766c = str;
        this.f142767d = appInfo;
    }

    public final void run() {
        this.f142764a.mo69521a(bret.m113948a(this.f142765b, this.f142766c, this.f142767d));
    }
}
