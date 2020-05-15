package p000;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: ajjr */
public final /* synthetic */ class ajjr implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService.C16111 f70760a;

    /* renamed from: b */
    private final Intent f70761b;

    public ajjr(NearbySharingChimeraService.C16111 r1, Intent intent) {
        this.f70760a = r1;
        this.f70761b = intent;
    }

    public final void run() {
        NearbySharingChimeraService.C16111 r0 = this.f70760a;
        Intent intent = this.f70761b;
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
                List a = akhu.m59729a(intent.getParcelableArrayExtra("accountsAdded"));
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                Charset charset = NearbySharingChimeraService.f80888a;
                Account b = nearbySharingChimeraService.f80899k.mo39171b();
                if (!a.isEmpty() && b == null) {
                    nearbySharingChimeraService.mo44440e();
                }
            }
            if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
                List a2 = akhu.m59729a(intent.getParcelableArrayExtra("accountsRemoved"));
                NearbySharingChimeraService nearbySharingChimeraService2 = NearbySharingChimeraService.this;
                Charset charset2 = NearbySharingChimeraService.f80888a;
                Account b2 = nearbySharingChimeraService2.f80899k.mo39171b();
                if (!a2.isEmpty() && b2 != null) {
                    int size = a2.size();
                    int i = 0;
                    while (i < size) {
                        i++;
                        if (b2.name.equals(((Account) a2.get(i)).name)) {
                            nearbySharingChimeraService2.mo44440e();
                            return;
                        }
                    }
                }
            }
        }
    }
}
