package p000;

import android.content.Intent;

/* renamed from: azem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azem implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f99168a;

    /* renamed from: b */
    final /* synthetic */ azet f99169b;

    public azem(azet azet, Intent intent) {
        this.f99169b = azet;
        this.f99168a = intent;
    }

    public final void run() {
        azcs a = azcv.m85357a(this.f99169b.f99187c).mo54689a(this.f99169b.f99207w);
        if (a == null) {
            return;
        }
        if (!a.mo54687a()) {
            azet azet = this.f99169b;
            Intent intent = this.f99168a;
            if (azcv.m85357a(azet.f99187c).mo54698b(azet.f99207w)) {
                azet.f99189e.mo54876a(a, azet.f99207w);
            } else if (cfeo.m138885p() || !azet.f99186b.mo54794p()) {
                synchronized (azet.f99185a) {
                    if (azet.f99201q == null) {
                        azet.mo54846b(intent, a);
                    }
                }
            }
        } else {
            azet azet2 = this.f99169b;
            Intent intent2 = this.f99168a;
            if (cfeo.m138885p() || !azet2.f99186b.mo54794p()) {
                synchronized (azet2.f99185a) {
                    if (azet2.f99201q == null) {
                        azet2.mo54846b(intent2, a);
                    }
                }
            }
        }
    }
}
