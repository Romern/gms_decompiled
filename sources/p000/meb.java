package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;

/* renamed from: meb */
public final /* synthetic */ class meb implements Runnable {

    /* renamed from: a */
    private final D2dSourceChimeraService.C15581 f33502a;

    /* renamed from: b */
    private final int f33503b;

    public meb(D2dSourceChimeraService.C15581 r1, int i) {
        this.f33502a = r1;
        this.f33503b = i;
    }

    public final void run() {
        D2dSourceChimeraService.C15581 r0 = this.f33502a;
        int i = this.f33503b;
        if (mce.m24861b()) {
            D2dSourceChimeraService d2dSourceChimeraService = D2dSourceChimeraService.this;
            lvn lvn = D2dSourceChimeraService.f29027a;
            d2dSourceChimeraService.f29029c.mo19983a(new mec(i));
            return;
        }
        throw new RuntimeException();
    }
}
