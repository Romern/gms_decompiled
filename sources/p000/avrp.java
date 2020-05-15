package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrp extends avrk {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        if (avrl.mo51542i().mo66813a() && avrl.mo51541h().mo66813a()) {
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            if (i == 8) {
                avrl.mo51536b("ota");
            } else if (i == 3) {
                avry.m79125a((Activity) avrl, avsf, systemUpdateStatus, avrl.mo51546m());
                avsf.mo51574m();
                avsf.mo51570i().setText((int) C0126R.string.system_update_security_update_available_title_text);
                avsf.mo51569h().setVisibility(0);
                avsf.mo51570i().setVisibility(0);
                avsf.mo51571j().setText((int) C0126R.string.system_update_clearn_up_error_status_text);
                avsf.mo51571j().setVisibility(0);
                avsf.mo51555a((int) C0126R.string.system_update_restart_now);
                avsf.mo51557a(true);
                avsf.mo51575n();
                avsf.mo51562c(false);
                avsf.mo51559b(false);
                avsf.mo51564d(false);
                avsf.mo51566e(false);
                avsf.mo51572k().setVisibility(8);
            }
        }
    }
}
