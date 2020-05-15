package p000;

import android.content.Intent;

/* renamed from: azen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azen implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f99170a;

    /* renamed from: b */
    final /* synthetic */ azet f99171b;

    public azen(azet azet, Intent intent) {
        this.f99171b = azet;
        this.f99170a = intent;
    }

    public final void run() {
        azcs a = azcv.m85357a(this.f99171b.f99187c).mo54689a(this.f99171b.f99207w);
        if (a == null) {
            return;
        }
        if (!a.mo54687a()) {
            azet azet = this.f99171b;
            Intent intent = this.f99170a;
            azet.f99186b.mo54755c(System.currentTimeMillis());
            if (azcv.m85357a(azet.f99187c).mo54698b(azet.f99207w)) {
                azet.f99189e.mo54876a(a, azet.f99207w);
                return;
            }
            synchronized (azet.f99185a) {
                azet.f99202r = true;
            }
            azet.mo54841a(intent, a);
            return;
        }
        azet azet2 = this.f99171b;
        Intent intent2 = this.f99170a;
        azet2.f99186b.mo54755c(System.currentTimeMillis());
        synchronized (azet2.f99185a) {
            azet2.f99202r = true;
        }
        azet2.mo54841a(intent2, a);
    }
}
