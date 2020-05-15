package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;

/* renamed from: ajrz */
final /* synthetic */ class ajrz implements aubw {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71214a;

    /* renamed from: b */
    private final Account f71215b;

    public ajrz(ShareSheetChimeraActivity shareSheetChimeraActivity, Account account) {
        this.f71214a = shareSheetChimeraActivity;
        this.f71215b = account;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71214a;
        Account account = this.f71215b;
        GoogleAccountAvatar googleAccountAvatar = shareSheetChimeraActivity.f81011k;
        bddn g = bddo.m90606g();
        g.mo57907a(account.name);
        g.f105375a = ((akht) obj).mo39461a();
        googleAccountAvatar.mo60577a(g.mo57906a());
        shareSheetChimeraActivity.f81011k.mo44652a();
        shareSheetChimeraActivity.mo38632a(false);
    }
}
