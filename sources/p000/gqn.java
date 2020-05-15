package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: gqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqn extends aaab {

    /* renamed from: a */
    private final rnt f18829a;

    /* renamed from: b */
    private final ClearTokenRequest f18830b;

    public gqn(rnt rnt, ClearTokenRequest clearTokenRequest) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "ClearTokenGoogleAuthOperation");
        this.f18829a = rnt;
        this.f18830b = clearTokenRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        adyd a = adyd.m51363a(context);
        a.mo33921b("com.google", this.f18830b.f10609b);
        a.mo33921b("cn.google", this.f18830b.f10609b);
        this.f18829a.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18829a.mo11797a(status);
    }
}
