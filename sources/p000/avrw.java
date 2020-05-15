package p000;

import android.os.Build;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrw extends avrk {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        bmxv bmxv;
        int i2;
        String str;
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a() && i == 3) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            boolean m = avrl.mo51546m();
            Activity activity = (Activity) avrl;
            avry.m79125a(activity, avsf, systemUpdateStatus, m);
            int i3 = Build.VERSION.SDK_INT;
            int i4 = systemUpdateStatus.f109461c;
            if (i4 == 779) {
                bmxv = bmxv.m108566b(activity.getString(C0126R.string.system_update_download_waiting_operator_mismatch_text));
            } else if (i4 != 1035) {
                bmxv = bmvz.f131120a;
            } else {
                bmxv = bmxv.m108566b(activity.getString(C0126R.string.system_update_download_waiting_charger_only_text));
            }
            if (bmxv.mo66813a()) {
                TextView f = avsf.mo51567f();
                String valueOf = String.valueOf((String) bmxv.mo66814b());
                f.append(valueOf.length() == 0 ? new String("\n\n") : "\n\n".concat(valueOf));
            }
            TextView i5 = avsf.mo51570i();
            if (!systemUpdateStatus.f109479u) {
                i2 = C0126R.string.system_update_update_available_title_text;
            } else {
                i2 = C0126R.string.system_update_security_update_available_title_text;
            }
            i5.setText(i2);
            TextView j = avsf.mo51571j();
            int i6 = systemUpdateStatus.f109461c;
            if (i6 == 1291) {
                str = activity.getString(C0126R.string.system_update_activity_attempt_download_later_text);
            } else if (i6 == 2315) {
                str = activity.getString(C0126R.string.system_update_low_battery_text);
            } else if (i6 != 2571) {
                str = activity.getString(C0126R.string.system_update_download_failed_status_text);
            } else {
                int i7 = Build.VERSION.SDK_INT;
                str = activity.getString(C0126R.string.system_update_activity_roaming_text_glif);
            }
            j.setText(str);
            avsf.mo51574m();
            avsf.mo51569h().setVisibility(0);
            avsf.mo51567f().setVisibility(0);
            avsf.mo51568g().setVisibility(0);
            avsf.mo51571j().setVisibility(0);
            avsf.mo51570i().setVisibility(0);
            avsf.mo51557a(false);
            avsf.mo51575n();
            avsf.mo51559b(false);
            avsf.mo51566e(false);
            avsf.mo51564d(false);
            avsf.mo51562c(false);
        }
    }
}
