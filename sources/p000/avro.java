package p000;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ContextThemeWrapper;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avro extends avrk {

    /* renamed from: a */
    private static final bnic f93826a = bnic.m109491a(1043, 787, 531);

    /* renamed from: a */
    private static void m79082a(avsf avsf, SystemUpdateStatus systemUpdateStatus, avrl avrl) {
        bmxv bmxv;
        int i;
        boolean z;
        avsf avsf2 = avsf;
        SystemUpdateStatus systemUpdateStatus2 = systemUpdateStatus;
        boolean z2 = avrl.mo51549p().getBoolean("PostinstallSkipConfirmationState");
        boolean z3 = avrl.mo51549p().getBoolean("InstallationInSecondaryStep");
        boolean b = m79084b(systemUpdateStatus);
        Activity activity = (Activity) avrl;
        avry.m79125a(activity, avsf2, systemUpdateStatus2, avrl.mo51546m());
        boolean z4 = true;
        if (!m79083a(systemUpdateStatus)) {
            avsf.mo51570i().setText(!systemUpdateStatus2.f109479u ? C0126R.string.system_update_installing_title_text_glifv3 : C0126R.string.system_update_security_update_installing_title_text_glifv3);
            avsf.mo51568g().setVisibility(0);
            avsf2.mo51557a(false);
            avsf2.mo51556a(activity.getText(C0126R.string.common_pause));
            avsf2.mo51562c(b);
        } else if (z2) {
            avsf.mo51570i().setText((int) C0126R.string.system_update_skip_postinatall_confirmation_title_text);
            avsf.mo51568g().setVisibility(8);
            avsf2.mo51555a((int) C0126R.string.common_skip);
            avsf2.mo51556a(activity.getText(C0126R.string.common_back));
            avsf2.mo51557a(true);
            avsf2.mo51562c(true);
        } else {
            avsf.mo51570i().setText((int) C0126R.string.system_update_installation_paused_title_text);
            avsf.mo51568g().setVisibility(0);
            avsf2.mo51555a((int) C0126R.string.system_update_resume_button_text);
            avsf2.mo51556a(activity.getText(C0126R.string.common_skip));
            avsf2.mo51557a(b);
            if (!b) {
                z = false;
            } else {
                z = z3 && cfth.f185682a.mo82700b().mo82701a();
            }
            avsf2.mo51562c(z);
        }
        avsf.mo51567f().setVisibility(0);
        avsf.mo51569h().setVisibility(0);
        ProgressBar l = avsf.mo51573l();
        avsf2.mo51566e(false);
        avsf2.mo51564d(false);
        if (m79083a(systemUpdateStatus)) {
            l.setIndeterminate(false);
            l.setMax(100);
            l.setProgress((int) (systemUpdateStatus2.f109464f * 100.0d));
            l.getProgressDrawable().setAlpha(31);
            l.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(activity.getResources().getColor(C0126R.color.paused_progress_bar_tint_color, ((ContextThemeWrapper) avrl).getTheme()), PorterDuff.Mode.MULTIPLY));
        } else {
            if (systemUpdateStatus2.f109464f > 0.0d) {
                z4 = false;
            }
            l.setIndeterminate(z4);
            l.setMax(100);
            l.setProgress((int) (systemUpdateStatus2.f109464f * 100.0d));
            l.getProgressDrawable().setAlpha(255);
            l.getProgressDrawable().setColorFilter(null);
        }
        avsf2.mo51559b(false);
        if (m79083a(systemUpdateStatus) && z2) {
            bmxv = bmxv.m108566b(activity.getString(C0126R.string.system_update_skip_postinstall_warning));
        } else {
            int i2 = systemUpdateStatus2.f109461c;
            if (i2 != 273) {
                if (i2 == 529) {
                    bmxv = bmxv.m108566b(activity.getText(C0126R.string.optimizing_apps_step_text));
                } else if (i2 != 1043) {
                    bmxv = bmvz.f131120a;
                } else {
                    bmxv = bmxv.m108566b(activity.getString(C0126R.string.system_update_installation_paused_not_idle_status_text));
                }
            } else if (!systemUpdateStatus2.f109471m) {
                bmxv = bmxv.m108566b(activity.getText(C0126R.string.apply_update_step_text));
            } else {
                bmxv = bmxv.m108566b(activity.getText(C0126R.string.download_install_update_step_text));
            }
        }
        if (bmxv.mo66813a()) {
            avsf.mo51572k().setText((CharSequence) bmxv.mo66814b());
            avsf.mo51572k().setVisibility(0);
            TextView k = avsf.mo51572k();
            if (systemUpdateStatus2.f109461c == 1043) {
                int i3 = Build.VERSION.SDK_INT;
                i = C0126R.style.systemUpdateButtonQualifier;
            } else {
                i = C0126R.style.systemUpdateInstallSteps;
            }
            k.setTextAppearance((Context) avrl, i);
        } else {
            avsf.mo51572k().setVisibility(8);
        }
        avsf.mo51575n();
        avsf.mo51570i().setVisibility(0);
        avsf.mo51571j().setVisibility(8);
    }

    /* renamed from: b */
    private static boolean m79084b(SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.f109461c != 529 || cfsj.m142902b();
    }

    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        if (avrl.mo51542i().mo66813a() && avrl.mo51541h().mo66813a()) {
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            boolean z = false;
            if (i == 4) {
                avry.m79124a(systemUpdateStatus.f109464f, avsf);
                avsf.mo51566e(false);
            } else if (i == 8) {
                if (m79084b(systemUpdateStatus)) {
                    avrl.mo51540g().mo51347b(new InstallationOptions(true, true, false, avrl.mo51549p().getBoolean("PostinstallSkipConfirmationState")));
                }
            } else if (i == 14) {
                if (!m79084b(systemUpdateStatus)) {
                    return;
                }
                if (!m79083a(systemUpdateStatus)) {
                    Bundle p = avrl.mo51549p();
                    if (systemUpdateStatus.f109461c == 529) {
                        z = true;
                    }
                    p.putBoolean("InstallationInSecondaryStep", z);
                    avrl.mo51540g().mo51349d();
                    return;
                }
                avrl.mo51549p().putBoolean("PostinstallSkipConfirmationState", !avrl.mo51549p().getBoolean("PostinstallSkipConfirmationState"));
                m79082a(avsf, systemUpdateStatus, avrl);
            } else if (i == 3) {
                m79082a(avsf, systemUpdateStatus, avrl);
            }
        }
    }

    /* renamed from: a */
    private static boolean m79083a(SystemUpdateStatus systemUpdateStatus) {
        return f93826a.contains(Integer.valueOf(systemUpdateStatus.f109461c));
    }
}
