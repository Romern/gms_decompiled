package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.checkin.CheckinChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: qdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdm extends sji {

    /* renamed from: a */
    private final Context f40989a;

    /* renamed from: d */
    private final rnt f40990d;

    protected qdm(Context context, rnt rnt) {
        super(130, "HasFirstAccountCheckin");
        this.f40989a = context;
        this.f40990d = rnt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        int i;
        if (!CheckinChimeraService.m22360c(this.f40989a)) {
            i = 21040;
        } else {
            i = 21020;
        }
        this.f40990d.mo11797a(new Status(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("HasFirstAccountCheckinOperation onFailure status : ");
        sb.append(valueOf);
        Log.e("HasFirstAccountCheckin", sb.toString());
    }
}
