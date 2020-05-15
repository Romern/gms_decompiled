package p000;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: apho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apho extends aaab {

    /* renamed from: a */
    private final Intent f84394a;

    /* renamed from: b */
    private final aphi f84395b;

    public apho(Intent intent, aphi aphi) {
        super(BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, "HandleSchedulerIntent");
        this.f84394a = intent;
        this.f84395b = aphi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        new aphu(context, this.f84394a).run();
        this.f84395b.mo47215a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84395b.mo47215a(status);
    }
}
