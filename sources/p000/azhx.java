package p000;

import android.content.Intent;

/* renamed from: azhx */
final /* synthetic */ class azhx implements Runnable {

    /* renamed from: a */
    private final azhy f99450a;

    /* renamed from: b */
    private final Intent f99451b;

    public azhx(azhy azhy, Intent intent) {
        this.f99450a = azhy;
        this.f99451b = intent;
    }

    public final void run() {
        cipc cipc;
        azhy azhy = this.f99450a;
        try {
            azhy.f99457f = this.f99451b.getIntExtra("command_source_in_int", 1) != 2 ? 3 : 4;
            azhy.f99458g = 3;
            if (cfeo.f183719a.mo6606a().mo80977ak() && azhy.f99457f == 3) {
                azhy.mo54940a(azhy.mo54937a(false, null));
            }
            azhy.f99456e = azhy.mo54941b();
        } catch (Exception e) {
            Object[] objArr = new Object[2];
            ciow a = ciow.m150679a(azhy.f99454c.f191162a);
            if (a == null) {
                a = ciow.UNRECOGNIZED;
            }
            objArr[0] = a;
            objArr[1] = e.getMessage();
            azhy.f99456e = azou.m85977a(azhy.f99455d, e.getMessage());
        }
        if (azhy.f99456e != null) {
            azhy.f99458g = 5;
        } else {
            azhy.f99458g = 4;
        }
        if (cfeo.f183719a.mo6606a().mo80976aj()) {
            try {
                cipc = azhy.mo54937a(true, azhy.f99456e);
            } catch (Exception e2) {
                azhy.f99456e = azou.m85977a(azhy.f99455d, e2.getMessage());
                try {
                    cipc = azhy.mo54937a(false, azhy.f99456e);
                } catch (Exception e3) {
                    new Object[1][0] = e3.getMessage();
                    return;
                }
            }
            azhy.mo54940a(cipc);
        }
    }
}
