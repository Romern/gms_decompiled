package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;

/* renamed from: gla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gla extends smx {

    /* renamed from: a */
    private static final sek f18452a = ght.m13171a("CredentialStateSyncAdapter");

    /* renamed from: b */
    private final glv f18453b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gla(Context context) {
        super(context, "auth_account");
        context.getString(C0126R.string.auth_confirm_creds_authority);
        glv glv = new glv(new ilq(context));
        new rtg(context);
        this.f18453b = glv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 1037;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (ccar.m129160c()) {
            return false;
        }
        bxvd da = bofx.f132950d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bofx bofx = (bofx) da.f164949b;
        bofx.f132953b = 6;
        bofx.f132952a |= 1;
        new glf(getContext()).mo12006a(f18452a, (bofx) da.mo74062i());
        if (bundle != null && bundle.getBoolean("initialize", false)) {
            sek sek = f18452a;
            String valueOf = String.valueOf(account.name);
            sek.mo25412b(valueOf.length() == 0 ? new String("Initializing CredentialStateSyncAdapter for account ") : "Initializing CredentialStateSyncAdapter for account ".concat(valueOf), new Object[0]);
            ContentResolver.setIsSyncable(account, str, 1);
            ContentResolver.setSyncAutomatically(account, str, true);
        }
        Context context = getContext();
        rtg.m34396a(account, str, new Bundle(), gnv.m13514X());
        ashr.m74143a(context.getContentResolver(), account, str, "credential-state", "credential-state");
        this.f18453b.mo12041a(new ReauthSettingsRequest(3, account.name, true, null, null));
        return true;
    }
}
