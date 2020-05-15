package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: grb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grb extends aaab {

    /* renamed from: a */
    private static final long f18878a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    private final rnt f18879b;

    /* renamed from: c */
    private final Account f18880c;

    /* renamed from: d */
    private final boolean f18881d;

    public grb(rnt rnt, Account account, boolean z) {
        super(MfiClientException.TYPE_MFICLIENT_STARTED, "UpdateHideDmNotifications");
        this.f18879b = rnt;
        this.f18880c = account;
        this.f18881d = z;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (spn.m35869b()) {
            if (this.f18881d) {
                ((goa) goa.f18759a.mo13145b()).mo12095b(this.f18880c, gqd.f18821o, Long.valueOf(System.currentTimeMillis() + f18878a));
            } else {
                ((goa) goa.f18759a.mo13145b()).mo12095b(this.f18880c, gqd.f18821o, null);
            }
            this.f18879b.mo11797a(Status.f30107a);
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(40);
        sb.append("Caller is not zeroparty. UID=");
        sb.append(callingUid);
        throw new SecurityException(sb.toString());
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18879b.mo11797a(status);
    }
}
