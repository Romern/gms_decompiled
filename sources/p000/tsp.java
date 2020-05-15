package p000;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: tsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsp extends adcf {

    /* renamed from: a */
    public static final srn f46599a = srn.m36127a(sgj.CREDENTIAL_MANAGER);

    /* renamed from: b */
    public tsf f46600b;

    /* renamed from: c */
    public final C0034at f46601c = new C0034at();

    /* renamed from: a */
    public static tsp m37449a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("pwm.DataFieldNames.accountName", str);
        tsp tsp = new tsp();
        tsp.setArguments(bundle);
        return tsp;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            this.f46600b.mo26761e();
            this.f46601c.mo2450b((Object) true);
            return;
        }
        this.f46601c.mo2450b((Object) false);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f46600b = (tsf) adcj.m50162a(activity, tsi.m37432a(activity, getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsf.class);
    }

    /* renamed from: a */
    public final void mo26773a() {
        if (this.f46600b.mo26760d()) {
            this.f46601c.mo2450b((Object) true);
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) getContext().getSystemService("keyguard");
        if (keyguardManager == null) {
            bnsl bnsl = (bnsl) f46599a.mo68388c();
            bnsl.mo68432a("tsp", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get the KeyguardManager service.");
            return;
        }
        Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(null, null);
        if (createConfirmDeviceCredentialIntent != null) {
            startActivityForResult(createConfirmDeviceCredentialIntent, 1);
            return;
        }
        C1349sg sgVar = new C1349sg(getContext());
        sgVar.mo15912d(C0126R.string.pwm_reset_saved_password_description);
        sgVar.mo15906b((int) C0126R.string.common_settings, new tsn(this));
        sgVar.mo15892a((int) C0126R.string.common_cancel, new tso(this));
        sgVar.mo15910c();
    }
}
