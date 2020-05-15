package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.p045ui.AuthenticateChimeraActivity;

/* renamed from: ybp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybp extends sji {

    /* renamed from: a */
    private final SignRequestParams f53560a;

    /* renamed from: d */
    private final yba f53561d;

    public ybp(yba yba, SignRequestParams signRequestParams) {
        super(117, "SignApp");
        this.f53561d = yba;
        this.f53560a = signRequestParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        this.f53561d.mo30337a(Status.f30107a, spn.m35844a(context, AuthenticateChimeraActivity.m23656a(context, xwi.U2F_API, this.f53560a), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f53561d.mo30337a(status, (PendingIntent) null);
    }
}
