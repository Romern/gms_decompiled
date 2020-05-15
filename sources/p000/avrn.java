package p000;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrn extends avrk {

    /* renamed from: a */
    private static final bnic f93825a = bnic.m109491a(1043, 787, 531);

    /* renamed from: a */
    private static boolean m79080a(SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.f109461c != 529 || cfsj.m142902b();
    }

    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        bmxv bmxv;
        int i2;
        int i3;
        int i4 = i;
        if (avrl.mo51542i().mo66813a() && avrl.mo51541h().mo66813a()) {
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            if (i4 != 4) {
                boolean z = true;
                if (i4 == 8) {
                    if (!m79080a(systemUpdateStatus)) {
                        return;
                    }
                    if (f93825a.contains(Integer.valueOf(systemUpdateStatus.f109461c))) {
                        avrl.mo51540g().mo51347b(new InstallationOptions(true, true, false, false));
                    } else {
                        avrl.mo51540g().mo51349d();
                    }
                } else if (i4 == 3) {
                    Activity activity = (Activity) avrl;
                    avry.m79125a(activity, avsf, systemUpdateStatus, avrl.mo51546m());
                    avsf.mo51569h().setVisibility(0);
                    avsf.mo51567f().setVisibility(0);
                    avsf.mo51568g().setVisibility(0);
                    ProgressBar l = avsf.mo51573l();
                    if (f93825a.contains(Integer.valueOf(systemUpdateStatus.f109461c))) {
                        l.setIndeterminate(false);
                        l.setMax(100);
                        l.setProgress((int) (systemUpdateStatus.f109464f * 100.0d));
                        avsf.mo51570i().setText((int) C0126R.string.system_update_installation_paused_title_text);
                        avsf.mo51555a((int) C0126R.string.system_update_resume_button_text);
                        l.getProgressDrawable().setAlpha(31);
                        l.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                    } else {
                        if (systemUpdateStatus.f109464f > 0.0d) {
                            z = false;
                        }
                        l.setIndeterminate(z);
                        l.setMax(100);
                        l.setProgress((int) (systemUpdateStatus.f109464f * 100.0d));
                        l.getProgressDrawable().setAlpha(255);
                        l.getProgressDrawable().setColorFilter(null);
                        TextView i5 = avsf.mo51570i();
                        if (!systemUpdateStatus.f109479u) {
                            i3 = C0126R.string.system_update_installing_title_text;
                        } else {
                            i3 = C0126R.string.system_update_security_update_installing_title_text;
                        }
                        i5.setText(i3);
                        avsf.mo51555a((int) C0126R.string.common_pause);
                        avsf.mo51572k().setVisibility(0);
                    }
                    int i6 = systemUpdateStatus.f109461c;
                    if (i6 != 273) {
                        if (i6 == 529) {
                            bmxv = bmxv.m108566b(activity.getText(C0126R.string.optimizing_apps_step_text));
                        } else if (i6 != 1043) {
                            bmxv = bmvz.f131120a;
                        } else {
                            bmxv = bmxv.m108566b(activity.getString(C0126R.string.system_update_installation_paused_not_idle_status_text));
                        }
                    } else if (!systemUpdateStatus.f109471m) {
                        bmxv = bmxv.m108566b(activity.getText(C0126R.string.apply_update_step_text));
                    } else {
                        bmxv = bmxv.m108566b(activity.getText(C0126R.string.download_install_update_step_text));
                    }
                    if (bmxv.mo66813a()) {
                        avsf.mo51572k().setText((CharSequence) bmxv.mo66814b());
                        avsf.mo51572k().setVisibility(0);
                        TextView k = avsf.mo51572k();
                        if (systemUpdateStatus.f109461c == 1043) {
                            int i7 = Build.VERSION.SDK_INT;
                            i2 = C0126R.style.systemUpdateButtonQualifier;
                        } else {
                            i2 = C0126R.style.systemUpdateInstallSteps;
                        }
                        k.setTextAppearance((Context) avrl, i2);
                    } else {
                        avsf.mo51572k().setVisibility(8);
                    }
                    avsf.mo51557a(m79080a(systemUpdateStatus));
                    avsf.mo51575n();
                    avsf.mo51570i().setVisibility(0);
                    avsf.mo51571j().setVisibility(8);
                }
            } else {
                avry.m79124a(systemUpdateStatus.f109464f, avsf);
            }
        }
    }
}
