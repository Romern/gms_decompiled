package p000;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: mmy */
final /* synthetic */ class mmy implements View.OnClickListener {

    /* renamed from: a */
    private final mna f34026a;

    public mmy(mna mna) {
        this.f34026a = mna;
    }

    public void onClick(View view) {
        mna mna = this.f34026a;
        mna.f34027a.mo25412b("preparing to lock device", new Object[0]);
        mna.f34028b.mo17234k();
        int i = Build.VERSION.SDK_INT;
        mna.f34027a.mo25412b("locking screen on L+ device", new Object[0]);
        int i2 = Build.VERSION.SDK_INT;
        KeyguardManager keyguardManager = (KeyguardManager) mna.getActivity().getSystemService("keyguard");
        if (keyguardManager != null) {
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(null, mna.getString(C0126R.string.lockscreen_smartdevice_d2d_lockscreen_description));
            if (createConfirmDeviceCredentialIntent != null) {
                mna.startActivityForResult(createConfirmDeviceCredentialIntent, 2);
                return;
            }
            mna.f34027a.mo25418e("Received null intent from KeyguardManager.", new Object[0]);
            mna.f34028b.mo17233j();
            return;
        }
        mna.f34027a.mo25418e("Keyguard manager was null.", new Object[0]);
        mna.f34028b.mo17233j();
    }
}
