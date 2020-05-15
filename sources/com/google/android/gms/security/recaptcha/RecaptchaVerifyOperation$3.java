package com.google.android.gms.security.recaptcha;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecaptchaVerifyOperation$3 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ apvn f107511a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecaptchaVerifyOperation$3(apvn apvn) {
        super(null);
        this.f107511a = apvn;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != 0) {
            try {
                this.f107511a.mo6503a(new Status(bundle.getInt("errorCode", 13), bundle.getString("error", "")));
            } catch (RemoteException e) {
            }
        } else {
            this.f107511a.mo47659a(new Status(0), bundle.getString("token"));
        }
    }
}
