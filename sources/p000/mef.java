package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;

/* renamed from: mef */
public final /* synthetic */ class mef implements Runnable {

    /* renamed from: a */
    private final mgb f33506a;

    /* renamed from: b */
    private final String f33507b;

    /* renamed from: c */
    private final mfx f33508c;

    public mef(mfx mfx, mgb mgb, String str) {
        this.f33508c = mfx;
        this.f33506a = mgb;
        this.f33507b = str;
    }

    public final void run() {
        mfx mfx = this.f33508c;
        mgb mgb = this.f33506a;
        String str = this.f33507b;
        D2dSourceChimeraService d2dSourceChimeraService = mfx.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        mgj mgj = d2dSourceChimeraService.f29029c;
        mgj.f33623a.mo25409a("Registering callbacks.", new Object[0]);
        mgj.f33638p.mo19908a(mgb, str);
        mgj.mo19985b();
    }
}
