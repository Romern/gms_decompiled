package p000;

import android.content.Context;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: gqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqp extends aaab {

    /* renamed from: a */
    private final gos f18834a;

    /* renamed from: b */
    private final AccountChangeEventsRequest f18835b;

    /* renamed from: c */
    private final imk f18836c;

    public gqp(gos gos, imk imk, AccountChangeEventsRequest accountChangeEventsRequest) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "GetAccountChangeEventsGoogleAuthOperation");
        this.f18834a = gos;
        this.f18835b = accountChangeEventsRequest;
        this.f18836c = imk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f18834a.mo12114a(Status.f30107a, ((ddx) this.f18836c.mo12005a(context)).mo8549a(this.f18835b));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18834a.mo12114a(status, null);
    }
}
