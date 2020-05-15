package com.google.android.gms.tapandpay.admin;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TpDeviceAdminIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108317a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    static void m93013a(Context context, String str) {
        context.startService(IntentOperation.getStartIntent(context, TpDeviceAdminIntentOperation.class, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a A[Catch:{ asks | RuntimeException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c A[Catch:{ asks | RuntimeException -> 0x0077 }] */
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        try {
            String action = intent.getAction();
            int hashCode = action.hashCode();
            char c = 65535;
            if (hashCode != -732012332) {
                if (hashCode != 159167945) {
                    if (hashCode == 1027461960 && action.equals("com.google.android.gms.tapandpay.admin.DEVICE_ADMIN_PASSWORD_CHANGED")) {
                        c = 2;
                        if (c == 0) {
                            if (c != 1) {
                                if (c == 2) {
                                    if (!asjk.m74228b(this)) {
                                        if (atcx.m75568a(this, askc.m74272b())) {
                                            asjj.m74222b(this);
                                            return;
                                        }
                                    }
                                    if (asjk.m74232f(this)) {
                                        asjj.m74225e(this);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (atcx.m75568a(this, askc.m74272b())) {
                                asjj.m74219a(this);
                                return;
                            } else {
                                return;
                            }
                        } else if (asjk.m74228b(this)) {
                            asjj.m74225e(this);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (action.equals("com.google.android.gms.tapandpay.admin.DEVICE_ADMIN_ENABLED")) {
                    c = 0;
                    if (c == 0) {
                    }
                }
            } else if (action.equals("com.google.android.gms.tapandpay.admin.DEVICE_ADMIN_DISABLED")) {
                c = 1;
                if (c == 0) {
                }
            }
            if (c == 0) {
            }
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) f108317a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error handling intent");
        }
    }
}
