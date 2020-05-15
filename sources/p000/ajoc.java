package p000;

import android.accounts.Account;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajoc */
public final /* synthetic */ class ajoc implements aubw {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71050a;

    /* renamed from: b */
    private final MenuItem f71051b;

    public ajoc(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, MenuItem menuItem) {
        this.f71050a = receiveSurfaceChimeraActivity;
        this.f71051b = menuItem;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71050a;
        MenuItem menuItem = this.f71051b;
        Account account = (Account) obj;
        if (account == null) {
            receiveSurfaceChimeraActivity.mo38632a(false);
        } else if (cfov.m142046V()) {
            receiveSurfaceChimeraActivity.f80939k.mo60577a((Object) null);
            aucb b = akhu.m59733b(receiveSurfaceChimeraActivity, account);
            b.mo50373a(new ajoo(receiveSurfaceChimeraActivity, account));
            b.mo50372a(new ajop(receiveSurfaceChimeraActivity));
        } else {
            akhu.m59737c(receiveSurfaceChimeraActivity, account).mo50373a(new ajoq(receiveSurfaceChimeraActivity, menuItem));
        }
    }
}
