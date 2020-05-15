package com.google.android.gms.tapandpay.wear;

import android.os.Bundle;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearProxyChimeraService extends axpp {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        char c;
        sre.m36089i(this);
        Bundle a = auai.m76640a(messageEventParcelable);
        String string = a.getString("type");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -713963455) {
                if (hashCode != 866988387) {
                    if (hashCode == 1236089475 && string.equals("proxyApiVersionRequest")) {
                        c = 2;
                        if (c != 0) {
                            startActivity(WearProxyCompanionChimeraActivity.m93327a(this, a));
                            return;
                        } else if (c == 1) {
                            startActivity(WearProxyCompanionChimeraActivity.m93326a(this));
                            return;
                        } else if (c == 2) {
                            axoz.m82854b(this).mo24694a(a.getString("nodeId"), "/tapandpay/proxy", auai.m76649a(auaa.m76636c(), false));
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (string.equals("stopProxyRequest")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
            } else if (string.equals("proxyRequest")) {
                c = 0;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }
}
