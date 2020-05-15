package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

/* renamed from: iqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqh {

    /* renamed from: a */
    private final Context f21561a;

    public iqh(Context context) {
        this.f21561a = context;
    }

    /* renamed from: a */
    public final void mo13259a(Account account) {
        aebo a = ipj.m15813a(new ipx(this.f21561a, account).mo13239a());
        Bundle bundle = new Bundle();
        bundle.putString("account_name", account.name);
        Context context = this.f21561a;
        int hashCode = account.name.hashCode();
        StringBuilder sb = new StringBuilder(32);
        sb.append("cryptauth_devicesync_");
        sb.append(hashCode);
        ipk.m15815a(context, "com.google.android.gms.auth.cryptauth.devicesync.DeviceSyncService", sb.toString(), a, 0, ((Long) ipl.f21504n.mo58455c()).longValue(), bundle, true);
    }
}
