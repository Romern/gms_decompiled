package p000;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity;

/* renamed from: atle */
public final /* synthetic */ class atle implements aubw {

    /* renamed from: a */
    private final TapAndPayHomeChimeraActivity f90439a;

    public atle(TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity) {
        this.f90439a = tapAndPayHomeChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        Fragment fragment;
        TapAndPayHomeChimeraActivity tapAndPayHomeChimeraActivity = this.f90439a;
        AccountInfo accountInfo = (AccountInfo) obj;
        if (tapAndPayHomeChimeraActivity.getIntent().hasExtra("authAccount")) {
            String stringExtra = tapAndPayHomeChimeraActivity.getIntent().getStringExtra("authAccount");
            if (accountInfo == null || !stringExtra.equals(accountInfo.f108326b)) {
                String[] a = soz.m35792a(soz.m35801d(tapAndPayHomeChimeraActivity, tapAndPayHomeChimeraActivity.getPackageName()));
                int i = 0;
                while (i < a.length) {
                    if (!a[i].equals(stringExtra)) {
                        i++;
                    } else {
                        tapAndPayHomeChimeraActivity.mo59409a(a[i]);
                        return;
                    }
                }
            }
        }
        if (accountInfo != null) {
            tapAndPayHomeChimeraActivity.f108676c = accountInfo;
            tapAndPayHomeChimeraActivity.f108677d = TapAndPayHomeChimeraActivity.m93124b(accountInfo);
            atlq atlq = tapAndPayHomeChimeraActivity.f108678e;
            Intent intent = tapAndPayHomeChimeraActivity.getIntent();
            if (intent == null || intent.getAction() == null) {
                fragment = aswe.m74918d();
            } else {
                atlx atlx = (atlx) atlq.f90454a.get(intent.getAction());
                if (atlx != null) {
                    fragment = atlx.mo50033a(intent);
                } else {
                    fragment = null;
                }
            }
            if (fragment == null) {
                bnsl bnsl = (bnsl) TapAndPayHomeChimeraActivity.f108675b.mo68387b();
                bnsl.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "c", 438, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("No fragment found.");
                tapAndPayHomeChimeraActivity.finishActivity(0);
                return;
            }
            tapAndPayHomeChimeraActivity.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.Root, fragment, "MAIN_VIEW").commitNowAllowingStateLoss();
            return;
        }
        String[] a2 = soz.m35792a(soz.m35801d(tapAndPayHomeChimeraActivity, tapAndPayHomeChimeraActivity.getPackageName()));
        if (a2.length == 0) {
            bnsl bnsl2 = (bnsl) TapAndPayHomeChimeraActivity.f108675b.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.tapandpay.settings.TapAndPayHomeChimeraActivity", "a", 418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("No accounts available");
            tapAndPayHomeChimeraActivity.finish();
        }
        tapAndPayHomeChimeraActivity.mo59409a(a2[0]);
    }
}
