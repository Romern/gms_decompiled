package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.checkin.CheckinChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: qdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdl extends sji {

    /* renamed from: a */
    private final Context f40986a;

    /* renamed from: d */
    private final rnt f40987d;

    /* renamed from: e */
    private final Account f40988e;

    public qdl(Context context, rnt rnt, Account account) {
        super(130, "HasAccountCheckin");
        this.f40986a = context;
        this.f40987d = rnt;
        this.f40988e = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        int i;
        if (!CheckinChimeraService.m22354a(this.f40986a, this.f40988e)) {
            i = 21040;
        } else {
            i = 21020;
        }
        this.f40987d.mo11797a(new Status(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("HasAccountCheckinOperation onFailure status : ");
        sb.append(valueOf);
        Log.e("HasAccountCheckin", sb.toString());
    }
}
