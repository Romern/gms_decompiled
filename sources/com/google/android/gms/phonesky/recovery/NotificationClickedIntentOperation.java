package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NotificationClickedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private anjd f82156a;

    /* renamed from: b */
    private anje f82157b;

    /* renamed from: c */
    private anjg f82158c;

    /* renamed from: a */
    private final void m68267a(int i) {
        anje anje = this.f82157b;
        if (anje != null) {
            anje.mo41867a(3, i);
        }
    }

    public final void onCreate() {
        anje anje = new anje(this);
        anjd anjd = new anjd(new svq(this));
        anjg anjg = new anjg(this, anje);
        this.f82156a = anjd;
        this.f82157b = anje;
        this.f82158c = anjg;
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.phonesky.recovery.CLICK".equals(intent.getAction())) {
            if (this.f82158c == null || this.f82156a == null) {
                anjb.m64557b("Invalid state", new Object[0]);
                m68267a(3);
                return;
            }
            anjb.m64556a("Recovery notification clicked", new Object[0]);
            m68267a(2);
            this.f82158c.mo41870a();
            if (this.f82156a.mo41865a(cgez.m144971c())) {
                Intent intent2 = new Intent("android.intent.action.UNINSTALL_PACKAGE", Uri.parse("package:com.android.vending"));
                intent2.setFlags(268468224);
                startActivity(intent2);
            }
        }
    }
}
