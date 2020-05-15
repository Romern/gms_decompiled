package com.google.android.gms.tapandpay.security;

import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FetchStorageKeyTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108657a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        try {
            int a = new athq().mo49998a(context, askc.m74272b());
            atcj.m75548a(context);
            if (a == 2) {
                return 1;
            }
            if (a != 3) {
                return 0;
            }
            return 2;
        } catch (asks e) {
            bnsl bnsl = (bnsl) f108657a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.security.FetchStorageKeyTaskOperation", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error fetching storage key");
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
    }
}
