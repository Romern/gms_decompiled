package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrx extends avrk {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        int i2;
        String str;
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a() && i == 3) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            avsf.mo51566e(false);
            avsf.mo51564d(false);
            avsf.mo51562c(false);
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            boolean m = avrl.mo51546m();
            Activity activity = (Activity) avrl;
            avry.m79125a(activity, avsf, systemUpdateStatus, m);
            TextView i3 = avsf.mo51570i();
            if (!systemUpdateStatus.f109479u) {
                i2 = C0126R.string.system_update_update_available_title_text;
            } else {
                i2 = C0126R.string.system_update_security_update_available_title_text;
            }
            i3.setText(i2);
            TextView j = avsf.mo51571j();
            int i4 = systemUpdateStatus.f109461c;
            if (i4 == 275 || i4 == 1040) {
                str = activity.getString(C0126R.string.system_update_low_battery_text);
            } else {
                str = activity.getString(C0126R.string.system_update_activity_attempt_install_later_text);
            }
            j.setText(str);
            avsf.mo51574m();
            avsf.mo51569h().setVisibility(0);
            avsf.mo51568g().setVisibility(0);
            avsf.mo51567f().setVisibility(0);
            avsf.mo51570i().setVisibility(0);
            avsf.mo51571j().setVisibility(0);
            avsf.mo51557a(false);
            avsf.mo51575n();
            avsf.mo51559b(false);
        }
    }
}
