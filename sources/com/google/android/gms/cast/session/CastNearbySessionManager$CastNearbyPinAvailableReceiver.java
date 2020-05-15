package com.google.android.gms.cast.session;

import android.content.Context;
import android.content.Intent;
import com.android.volley.DefaultRetryPolicy;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CastNearbySessionManager$CastNearbyPinAvailableReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ pzd f29924a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CastNearbySessionManager$CastNearbyPinAvailableReceiver(pzd pzd) {
        super("cast");
        this.f29924a = pzd;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i;
        int i2;
        pzd pzd = this.f29924a;
        String str = pzd.f40716a;
        pzd.f40720e.mo23670a("onReceive", new Object[0]);
        this.f29924a.f40724i.unregisterReceiver(this);
        String string = intent.getExtras().getString("PIN");
        boolean z = intent.getExtras().getBoolean("MANUAL");
        boolean z2 = intent.getExtras().getBoolean("CANCELED");
        boolean z3 = intent.getExtras().getBoolean("DEVICE SETTINGS CLICKED");
        this.f29924a.f40720e.mo23859a("Received pin from dialog pin=%s, manual=%b, canceled=%b wasDeviceSettingsClicked=%b", string, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        if (!z2) {
            pzd pzd2 = this.f29924a;
            synchronized (pzd2.f40726k) {
                pzd2.f40720e.mo23856a("onReceivedCastNearbyPIN. # of pendingSessions: %d", Integer.valueOf(pzd2.f40726k.size()));
                Iterator it = pzd2.f40726k.iterator();
                while (it.hasNext()) {
                    pzc pzc = (pzc) it.next();
                    if (!z) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                    new pzb(pzd2, string, i2, pzc.f40713b, pzc.f40712a, pzc.f40715d, false, pzc.f40714c).start();
                }
            }
        } else {
            pzd pzd3 = this.f29924a;
            if (!z3) {
                i = DefaultRetryPolicy.DEFAULT_TIMEOUT_MS;
            } else {
                i = 2501;
            }
            synchronized (pzd3.f40726k) {
                Iterator it2 = pzd3.f40726k.iterator();
                while (it2.hasNext()) {
                    ((pzc) it2.next()).f40715d.mo23223a(i);
                }
            }
        }
        synchronized (this.f29924a.f40726k) {
            this.f29924a.f40726k.clear();
        }
    }
}
