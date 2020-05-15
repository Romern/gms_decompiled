package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;

/* renamed from: ajoo */
final /* synthetic */ class ajoo implements aubw {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71066a;

    /* renamed from: b */
    private final Account f71067b;

    public ajoo(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, Account account) {
        this.f71066a = receiveSurfaceChimeraActivity;
        this.f71067b = account;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71066a;
        Account account = this.f71067b;
        GoogleAccountAvatar googleAccountAvatar = receiveSurfaceChimeraActivity.f80939k;
        bddn g = bddo.m90606g();
        g.mo57907a(account.name);
        g.f105375a = ((akht) obj).mo39461a();
        googleAccountAvatar.mo60577a(g.mo57906a());
        receiveSurfaceChimeraActivity.f80939k.mo44652a();
        receiveSurfaceChimeraActivity.mo38632a(false);
    }
}
