package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.checkin.CheckinChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: qdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdk extends sji {

    /* renamed from: a */
    private final Context f40984a;

    /* renamed from: d */
    private final qfi f40985d;

    protected qdk(Context context, qfi qfi) {
        super(130, "GetAndroidId");
        this.f40984a = context;
        this.f40985d = qfi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        this.f40985d.mo24012a(Status.f30107a, CheckinChimeraService.m22361d(this.f40984a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("GetAndroidIdOperation onFailure status : ");
        sb.append(valueOf);
        Log.e("GetAndroidId", sb.toString());
        this.f40985d.mo24012a(status, null);
    }
}
