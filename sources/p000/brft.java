package p000;

import com.felicanetworks.mfc.AppInfo;

/* renamed from: brft */
final /* synthetic */ class brft implements Runnable {

    /* renamed from: a */
    private final brgn f142777a;

    /* renamed from: b */
    private final int f142778b;

    /* renamed from: c */
    private final String f142779c;

    /* renamed from: d */
    private final AppInfo f142780d;

    public brft(brgn brgn, int i, String str, AppInfo appInfo) {
        this.f142777a = brgn;
        this.f142778b = i;
        this.f142779c = str;
        this.f142780d = appInfo;
    }

    public final void run() {
        this.f142777a.mo69524a(bret.m113948a(this.f142778b, this.f142779c, this.f142780d));
    }
}
