package com.google.android.gms.autofill.events;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PackageEventBroadcastReceiver extends aacn {

    /* renamed from: a */
    private final kpn f11630a;

    public PackageEventBroadcastReceiver(kpn kpn) {
        super("autofill");
        this.f11630a = kpn;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (action != null && data != null) {
                String uri = data.toString();
                if (uri.length() > 8 && uri.startsWith("package:")) {
                    String substring = uri.substring(8);
                    if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                        kpn kpn = this.f11630a;
                        if (ccip.m129867g() && ccip.m129868h()) {
                            kpt kpt = (kpt) kpn;
                            ((aeeh) kpt.f24762c.mo6445a()).mo34089g(kbb.SYNC_ID_PREDICTIONS_DOWNLOAD).mo34066a(new kpp(kpt, substring), 1, (Executor) kpt.f24763d.mo6445a());
                            return;
                        }
                        bnre i = ((kpt) kpn).f24760a.listIterator();
                        while (i.hasNext()) {
                            ((kzn) i.next()).mo14950a(bngx.m109356a(substring), false);
                        }
                    } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        kpn kpn2 = this.f11630a;
                        if (ccip.m129865e()) {
                            ((kpt) kpn2).f24761b.mo15104b(substring);
                        }
                    } else if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
                        kpn kpn3 = this.f11630a;
                        if (ccip.m129867g() && ccip.m129868h()) {
                            kpt kpt2 = (kpt) kpn3;
                            ((aeeh) kpt2.f24762c.mo6445a()).mo34089g(kbb.SYNC_ID_PREDICTIONS_DOWNLOAD).mo34066a(new kpq(kpt2, substring), 1, (Executor) kpt2.f24763d.mo6445a());
                            return;
                        }
                        bnre i2 = ((kpt) kpn3).f24760a.listIterator();
                        while (i2.hasNext()) {
                            ((kzn) i2.next()).mo14950a(bngx.m109356a(substring), false);
                        }
                    }
                }
            }
        }
    }
}
