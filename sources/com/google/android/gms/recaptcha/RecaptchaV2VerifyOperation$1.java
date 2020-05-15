package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecaptchaV2VerifyOperation$1 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ aoqv f83502a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecaptchaV2VerifyOperation$1(aoqv aoqv) {
        super(null);
        this.f83502a = aoqv;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != 0) {
            try {
                this.f83502a.mo6503a(new Status(bundle.getInt("errorCode", 13), bundle.getString("error", "")));
            } catch (RemoteException e) {
            }
        } else {
            aoqv aoqv = this.f83502a;
            aoqv.f78710a.mo43191a(new Status(0), new RecaptchaResultData(bundle.getString("token")));
        }
    }
}
