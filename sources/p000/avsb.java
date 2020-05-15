package p000;

import android.os.Build;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsb extends avrk {

    /* renamed from: a */
    private static final bnic f93831a = bnic.m109490a((Object) 3, (Object) 8);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        int i2;
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a() && f93831a.contains(Integer.valueOf(i))) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            if (i == 8) {
                avrl.mo51540g().mo51344a(new InstallationOptions(true, true, true, false));
                avsf.mo51572k().setVisibility(8);
            } else if (i == 3) {
                SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
                boolean m = avrl.mo51546m();
                Activity activity = (Activity) avrl;
                avry.m79125a(activity, avsf, systemUpdateStatus, m);
                TextView i3 = avsf.mo51570i();
                int i4 = Build.VERSION.SDK_INT;
                if (!systemUpdateStatus.f109479u) {
                    i2 = C0126R.string.system_update_update_available_title_text;
                } else {
                    i2 = C0126R.string.system_update_security_update_available_title_text;
                }
                i3.setText(activity.getString(i2));
                avsf.mo51574m();
                avsf.mo51569h().setVisibility(0);
                avsf.mo51567f().setVisibility(0);
                avsf.mo51568g().setVisibility(0);
                avsf.mo51570i().setVisibility(0);
                avsf.mo51571j().setVisibility(8);
                avsf.mo51575n();
                avsf.mo51555a((int) C0126R.string.system_update_restart_now);
                avsf.mo51557a(true);
                avsf.mo51572k().setVisibility(8);
            }
        }
    }
}
