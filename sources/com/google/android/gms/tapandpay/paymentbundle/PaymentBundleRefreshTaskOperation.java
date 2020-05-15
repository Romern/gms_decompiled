package com.google.android.gms.tapandpay.paymentbundle;

import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentBundleRefreshTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108619a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        if (!"Oneoff".equals(aecc.f63128a) && !"Periodic".equals(aecc.f63128a)) {
            bnsl bnsl = (bnsl) f108619a.mo68387b();
            bnsl.mo68432a("com.google.android.gms.tapandpay.paymentbundle.PaymentBundleRefreshTaskOperation", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unknown tag '%s', skipping", aecc.f63128a);
            return 0;
        } else if (!ssk.m36235a(context)) {
            return 1;
        } else {
            try {
                new atbq().mo49783a(context, askc.m74272b());
                return 0;
            } catch (asks e) {
                bnsl bnsl2 = (bnsl) f108619a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("com.google.android.gms.tapandpay.paymentbundle.PaymentBundleRefreshTaskOperation", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Error refreshing payment bundles");
                return 2;
            }
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebl.f63099k = "Periodic";
        int i = 0;
        aebl.mo34028b(0, cdny.m134341f() ? 1 : 0);
        aebl.mo34024a(0, cdny.m134340e() ? 1 : 0);
        if (cdny.m134337b()) {
            i = 2;
        }
        aebl.mo34027b(i);
        long h = cgxi.f187963a.mo6606a().mo84677h();
        long g = cgxi.f187963a.mo6606a().mo84676g();
        if (!cdny.m134352q()) {
            aebl.f63070a = h;
            aebl.f63071b = g;
        } else {
            aebl.mo34009a(aebh.m51568a(h));
        }
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }
}
