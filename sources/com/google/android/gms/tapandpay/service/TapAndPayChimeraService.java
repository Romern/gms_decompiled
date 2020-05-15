package com.google.android.gms.tapandpay.service;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayChimeraService extends zzx {

    /* renamed from: a */
    public static final srn f108661a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public TapAndPayChimeraService() {
        super(79, "com.google.android.gms.tapandpay.service.BIND", bnic.m109491a("android.permission-group.CONTACTS", "android.permission-group.PHONE", "android.permission-group.SMS"), 3, 9);
    }

    /* renamed from: a */
    public static boolean m93110a(Context context) {
        return atcx.m75568a(context, askc.m74272b());
    }

    /* renamed from: b */
    public static boolean m93111b(Context context) {
        if (!asjk.m74228b(context)) {
            return false;
        }
        atah.m75278c();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        if (soz.m35810g(this)) {
            asjw.m74254a(this, 5);
        } else {
            if (asjw.m74257b(this)) {
                if (!cgwn.f187872a.mo6606a().mo84588C()) {
                    asjw.m74254a(this, 8);
                } else {
                    asjw.m74254a(this, 7);
                }
            }
            aaac.mo16652a(new atke(this, new aaag(this, this.f56354e, this.f56355f), getServiceRequest.f30230d, getServiceRequest.f30233g));
            return;
        }
        aaac.mo16651a(16, null, null);
    }
}
