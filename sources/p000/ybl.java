package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.p045ui.AuthenticateChimeraActivity;

/* renamed from: ybl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybl extends sji {

    /* renamed from: a */
    private final RegisterRequestParams f53549a;

    /* renamed from: d */
    private final yba f53550d;

    public ybl(yba yba, RegisterRequestParams registerRequestParams) {
        super(117, "RegisterApp");
        this.f53550d = yba;
        this.f53549a = registerRequestParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        this.f53550d.mo30337a(Status.f30107a, spn.m35844a(context, AuthenticateChimeraActivity.m23656a(context, xwi.U2F_API, this.f53549a), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f53550d.mo30337a(status, (PendingIntent) null);
    }
}
