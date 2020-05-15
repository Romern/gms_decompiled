package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: qcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qcp extends sji {

    /* renamed from: a */
    private final rnt f40930a;

    /* renamed from: d */
    private final int f40931d;

    protected qcp(rnt rnt, int i) {
        super(130, "CheckinResult");
        this.f40931d = i;
        this.f40930a = rnt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        rnt rnt = this.f40930a;
        if (rnt != null) {
            qdg.m31918a("CheckinApi:end", Integer.valueOf(rnt.hashCode()), Long.valueOf(SystemClock.elapsedRealtime()));
            this.f40930a.mo11797a(new Status(this.f40931d));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("AsyncStatusDispatchOperation onFailure status : ");
        sb.append(valueOf);
        Log.e("CheckinApiRequest", sb.toString());
    }
}
