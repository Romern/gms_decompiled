package p000;

import android.content.Intent;

/* renamed from: lpe */
final /* synthetic */ class lpe implements Runnable {

    /* renamed from: a */
    private final lpk f26531a;

    public lpe(lpk lpk) {
        this.f26531a = lpk;
    }

    public final void run() {
        lpk lpk = this.f26531a;
        lpk.f26159a.startActivityForResult(new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage("com.google.android.gms").putExtra("extra.screenId", 413).putExtra("extra.accountName", (String) lpk.f26555l.mo14871i().mo14344a().mo66810a(lpj.f26539a).mo66815c()), 1001);
    }
}
