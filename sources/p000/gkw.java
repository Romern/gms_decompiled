package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: gkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkw extends smx {

    /* renamed from: a */
    private final gky f18440a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gkw(Context context) {
        super(context, "auth_account");
        gky gky = new gky(context);
        context.getString(C0126R.string.auth_account_state_authority);
        this.f18440a = gky;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 1025;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        gky gky = this.f18440a;
        if (ccar.m129159b()) {
            return false;
        }
        bxvd da = bofx.f132950d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bofx bofx = (bofx) da.f164949b;
        bofx.f132953b = 5;
        bofx.f132952a |= 1;
        new glf(gky.f18443b).mo12006a(gky.f18442a, (bofx) da.mo74062i());
        gky.f18442a.mo25414c("performSync(account=%s)", sek.m35081a(account));
        ashr.m74143a(gky.f18443b.getContentResolver(), account, str, "gaia-change", "gaia-change");
        ContentResolver.setIsSyncable(account, str, 1);
        rtg.m34394a(account, str);
        long n = gnv.m13569n();
        if (n > 0) {
            rtg.m34396a(account, str, Bundle.EMPTY, n);
        } else {
            rtg.m34395a(account, str, Bundle.EMPTY);
        }
        if (bundle != null && bundle.getBoolean("initialize_only", false)) {
            return true;
        }
        if (gnv.m13568m()) {
            return gky.mo12003a(account);
        }
        gky.f18442a.mo25414c("Skipping sync because account state sync is not enabled.", new Object[0]);
        return true;
    }
}
