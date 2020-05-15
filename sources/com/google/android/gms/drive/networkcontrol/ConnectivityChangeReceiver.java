package com.google.android.gms.drive.networkcontrol;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectivityChangeReceiver extends ChangeReceiver {

    /* renamed from: a */
    private static final sbw f31085a = new sbw("ConnectivityChangeRecei", "");

    /* renamed from: b */
    private final veg f31086b;

    public ConnectivityChangeReceiver(Context context, veg veg) {
        super(context, "android.net.conn.CONNECTIVITY_CHANGE");
        sdo.m34959a(veg);
        this.f31086b = veg;
        mo18282a(new vef(this.f31086b));
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            veg veg = this.f31086b;
            if (veg == null) {
                f31085a.mo25377c("ConnectivityChangeRecei", "Ignoring connectivity change");
            } else {
                mo18282a(new vef(veg));
            }
        } else {
            f31085a.mo25374b("ConnectivityChangeRecei", "Received unexpected action %s", action);
        }
    }
}
