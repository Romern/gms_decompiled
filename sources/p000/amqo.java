package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;

/* renamed from: amqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqo extends amqn {
    public amqo(String str, int i, alzm alzm, Account account, String str2, alsj alsj) {
        super(str, i, alzm, account, str2, alsj, "RequestSyncWithStatus");
    }

    /* renamed from: a */
    public final void mo41262a(Account account, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("expedited", true);
        amig.m62939a();
        if (((Boolean) amfy.f74875a.mo41191a()).booleanValue()) {
            bundle.putString("REQUESTER", "REQUEST_SYNC_WITH_STATUS_API");
        }
        ContentResolver.requestSync(account, str, bundle);
    }
}
