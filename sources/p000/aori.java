package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: aori */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aori extends dck implements aorj {

    /* renamed from: a */
    final /* synthetic */ aucf f78739a;

    public aori() {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    /* renamed from: a */
    public final void mo43191a(Status status, RecaptchaResultData recaptchaResultData) {
        rpc.m34202a(status, recaptchaResultData, this.f78739a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aori(aucf aucf) {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
        this.f78739a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo43191a((Status) dcl.m8163a(parcel, Status.CREATOR), (RecaptchaResultData) dcl.m8163a(parcel, RecaptchaResultData.CREATOR));
        return true;
    }
}
