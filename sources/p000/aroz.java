package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;
import java.util.List;

/* renamed from: aroz */
public final /* synthetic */ class aroz implements Runnable {

    /* renamed from: a */
    private final TargetChimeraActivity f88048a;

    /* renamed from: b */
    private final List f88049b;

    /* renamed from: c */
    private final Bundle f88050c;

    public aroz(TargetChimeraActivity targetChimeraActivity, List list, Bundle bundle) {
        this.f88048a = targetChimeraActivity;
        this.f88049b = list;
        this.f88050c = bundle;
    }

    public final void run() {
        ManagedAuthOptions managedAuthOptions;
        int i;
        TargetChimeraActivity targetChimeraActivity = this.f88048a;
        List<Account> list = this.f88049b;
        Bundle bundle = this.f88050c;
        Bundle bundle2 = new Bundle();
        bundle2.putString("theme", targetChimeraActivity.f108029c);
        for (Account account : list) {
            if (targetChimeraActivity.f108035i.mo48619a(account)) {
                arlt arlt = targetChimeraActivity.f108035i;
                if (cgps.m146490b()) {
                    int i2 = targetChimeraActivity.f108033g;
                    BootstrapCompletionResult bootstrapCompletionResult = targetChimeraActivity.f108037k;
                    if (bootstrapCompletionResult != null) {
                        i = bootstrapCompletionResult.f107806f;
                    } else {
                        i = 0;
                    }
                    if (i == 3) {
                        i2 = 2;
                    } else if (i == 4) {
                        i2 = 1;
                    }
                    managedAuthOptions = new ManagedAuthOptions(i2, 3);
                } else {
                    managedAuthOptions = new ManagedAuthOptions();
                }
                Intent a = arlt.mo48617a(account, bundle2, managedAuthOptions);
                if (a != null) {
                    targetChimeraActivity.f108031e.add(a);
                }
            }
        }
        targetChimeraActivity.runOnUiThread(new arpa(targetChimeraActivity, bundle));
        targetChimeraActivity.f108034h = null;
    }
}
