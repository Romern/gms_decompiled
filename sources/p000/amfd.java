package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: amfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amfd extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f74853a;

    /* renamed from: b */
    final /* synthetic */ Account f74854b;

    /* renamed from: c */
    final /* synthetic */ amff f74855c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amfd(Context context, Account account, amff amff) {
        super(10);
        this.f74853a = context;
        this.f74854b = account;
        this.f74855c = amff;
    }

    public final void run() {
        try {
            amfe.f74856a = gie.m13198c(this.f74853a, this.f74854b.name);
            amff amff = this.f74855c;
            String str = amfe.f74856a;
            String str2 = this.f74854b.name;
            alsj alsj = amff.f74857a;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = alsj.f74200a.edit();
            String valueOf = String.valueOf(str);
            edit.putString(valueOf.length() == 0 ? new String("tickle_sync_gaia_cache_account_name_") : "tickle_sync_gaia_cache_account_name_".concat(valueOf), str2).apply();
            SharedPreferences.Editor edit2 = alsj.f74200a.edit();
            String valueOf2 = String.valueOf(str);
            edit2.putLong(valueOf2.length() == 0 ? new String("tickle_sync_gaia_id_cache_last_update_timestamp_") : "tickle_sync_gaia_id_cache_last_update_timestamp_".concat(valueOf2), currentTimeMillis).apply();
        } catch (gid | IOException e) {
            amdk.m62659b("People_AccountUtil", "Failed to get account ID. %s", e.getMessage());
        }
    }
}
