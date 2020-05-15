package p000;

import android.accounts.Account;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajre */
public final /* synthetic */ class ajre implements aubw {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71178a;

    /* renamed from: b */
    private final MenuItem f71179b;

    public ajre(ShareSheetChimeraActivity shareSheetChimeraActivity, MenuItem menuItem) {
        this.f71178a = shareSheetChimeraActivity;
        this.f71179b = menuItem;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71178a;
        MenuItem menuItem = this.f71179b;
        Account account = (Account) obj;
        if (account == null) {
            shareSheetChimeraActivity.mo38632a(false);
        } else if (cfov.m142046V()) {
            shareSheetChimeraActivity.f81011k.mo60577a((Object) null);
            aucb b = akhu.m59733b(shareSheetChimeraActivity, account);
            b.mo50373a(new ajrz(shareSheetChimeraActivity, account));
            b.mo50372a(new ajsa(shareSheetChimeraActivity));
        } else {
            akhu.m59737c(shareSheetChimeraActivity, account).mo50373a(new ajsb(shareSheetChimeraActivity, menuItem));
        }
    }
}
