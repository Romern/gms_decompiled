package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.ArrayList;

/* renamed from: akhp */
final /* synthetic */ class akhp implements aubw {

    /* renamed from: a */
    private final Account f72020a;

    /* renamed from: b */
    private final Activity f72021b;

    public akhp(Account account, Activity activity) {
        this.f72020a = account;
        this.f72021b = activity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        int i;
        Account account = this.f72020a;
        Activity activity = this.f72021b;
        ArrayList arrayList = (ArrayList) obj;
        String[] strArr = {"com.google"};
        int i2 = Build.VERSION.SDK_INT;
        if ((activity.getResources().getConfiguration().uiMode & 48) != 32) {
            i = 1;
        } else {
            i = 0;
        }
        Intent a = rew.m33486a(account, arrayList, strArr, true, null, false, i, 2, null, true);
        a.addFlags(536870912);
        Bundle bundle = new Bundle();
        bundle.putString("title", activity.getString(C0126R.string.common_choose_account_label));
        a.putExtra("first_party_options_bundle", bundle);
        activity.startActivityForResult(a, 1001);
    }
}
