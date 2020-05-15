package com.google.android.gms.tapandpay.notifications;

import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocalNotificationTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108612a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        byte[] byteArray = aecc.f63129b.getByteArray("localNotification");
        try {
            new atau(context).mo49771a((btqg) GeneratedMessageLite.m124016a(btqg.f149933q, byteArray, bxus.m123744c()));
            return 0;
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f108612a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.LocalNotificationTaskOperation", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse local notification");
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
    }
}
