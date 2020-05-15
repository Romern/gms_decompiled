package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.p045ui.AuthenticateChimeraActivity;

/* renamed from: ybm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybm extends sji {

    /* renamed from: a */
    private final BrowserRegisterRequestParams f53551a;

    /* renamed from: d */
    private final yax f53552d;

    public ybm(yax yax, BrowserRegisterRequestParams browserRegisterRequestParams) {
        super(118, "RegisterPrivileged");
        this.f53552d = yax;
        this.f53551a = browserRegisterRequestParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        this.f53552d.mo30334a(Status.f30107a, spn.m35844a(context, AuthenticateChimeraActivity.m23656a(context, xwi.U2F_PRIVILEGED_API, this.f53551a), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f53552d.mo30334a(status, (PendingIntent) null);
    }
}
