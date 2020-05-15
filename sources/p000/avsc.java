package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsc extends avrk {

    /* renamed from: a */
    private static final sek f93832a = avpq.m79017d("PreRebootControllerGlifV3");

    /* renamed from: b */
    private static final bnic f93833b = bnic.m109494a(3, 8, 14, 21, 22, 23, 24, 25, 26);

    /* renamed from: a */
    private static bmxv m79138a(Activity activity, SystemUpdateStatus systemUpdateStatus) {
        try {
            avmc a = avmc.m78777a(systemUpdateStatus.f109481w);
            long currentTimeMillis = System.currentTimeMillis();
            if (a.mo51368a(currentTimeMillis)) {
                return bmxv.m108566b(DateUtils.formatDateRange(activity, currentTimeMillis, a.mo51371c(currentTimeMillis) + currentTimeMillis, 1));
            }
            return bmxv.m108566b(DateUtils.formatDateRange(activity, currentTimeMillis + a.mo51369b(currentTimeMillis), currentTimeMillis + a.mo51371c(currentTimeMillis), 1));
        } catch (avlq e) {
            f93832a.mo25418e("Unable to parse restart time window: %s.", systemUpdateStatus.f109481w);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    private static boolean m79142b(SystemUpdateStatus systemUpdateStatus) {
        return cfsy.f185667a.mo6606a().mo82692d() && m79143c(systemUpdateStatus) && systemUpdateStatus.f109458A;
    }

    /* renamed from: c */
    private static boolean m79143c(SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.f109483y && systemUpdateStatus.f109484z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        int i2;
        bmxv bmxv;
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a() && f93833b.contains(Integer.valueOf(i))) {
            avsf avsf = (avsf) avrl.mo51541h().mo66814b();
            SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
            if (i == 8) {
                if (m79141a(systemUpdateStatus)) {
                    avrl.mo51552s();
                } else if (!m79143c(systemUpdateStatus) || systemUpdateStatus.f109458A) {
                    m79140a(avrl, systemUpdateStatus);
                } else {
                    avrl.mo51548o();
                }
                avsf.mo51557a(false);
            } else if (i == 14) {
                if (!systemUpdateStatus.f109483y || m79143c(systemUpdateStatus)) {
                    m79140a(avrl, systemUpdateStatus);
                } else {
                    avrl.mo51551r();
                }
                avsf.mo51562c(false);
            } else if (i == 25) {
                m79139a(avrl);
            } else if (i == 22) {
                Activity activity = (Activity) avrl;
                bmxv a = m79138a(activity, (SystemUpdateStatus) avrl.mo51542i().mo66814b());
                avsf.mo51558b(TextUtils.expandTemplate(activity.getText(C0126R.string.system_update_restart_later_failed_warning), (CharSequence) a.mo66814b()));
                avsf.mo51564d(true);
                avsf.mo51562c(true);
            } else if (i == 3 || i == 26 || i == 24 || i == 23 || i == 21) {
                Activity activity2 = (Activity) avrl;
                avry.m79125a(activity2, avsf, systemUpdateStatus, avrl.mo51546m());
                TextView i3 = avsf.mo51570i();
                if (!systemUpdateStatus.f109479u) {
                    i2 = C0126R.string.system_update_update_available_title_text;
                } else {
                    i2 = C0126R.string.system_update_security_update_available_title_text;
                }
                i3.setText(activity2.getString(i2));
                avsf.mo51574m();
                if (systemUpdateStatus.f109479u) {
                    avsf.mo51566e(true);
                    avsf.mo51561c(TextUtils.expandTemplate(activity2.getText(C0126R.string.system_update_security_update_extra_message), Build.MODEL));
                } else {
                    avsf.mo51566e(false);
                }
                avsf.mo51569h().setVisibility(0);
                avsf.mo51567f().setVisibility(0);
                avsf.mo51568g().setVisibility(0);
                avsf.mo51570i().setVisibility(0);
                avsf.mo51571j().setVisibility(8);
                avsf.mo51575n();
                avsf.mo51559b(false);
                avsf.mo51572k().setVisibility(8);
                if (i == 21 && m79142b(systemUpdateStatus)) {
                    avrl.mo51552s();
                }
                if (m79141a(systemUpdateStatus)) {
                    if (m79138a(activity2, systemUpdateStatus).mo66813a()) {
                        avsf.mo51571j().setText((int) C0126R.string.system_update_confirm_device_credentials_warning);
                        avsf.mo51571j().setVisibility(0);
                        avsf.mo51564d(false);
                    }
                    avsf.mo51556a(activity2.getText(C0126R.string.system_update_restart_now));
                    avsf.mo51562c(true);
                    avsf.mo51555a((int) C0126R.string.common_confirm);
                    avsf.mo51557a(true);
                } else if (m79143c(systemUpdateStatus)) {
                    bmxv a2 = m79138a(activity2, systemUpdateStatus);
                    if (a2.mo66813a()) {
                        avsf.mo51558b(TextUtils.expandTemplate(activity2.getText(C0126R.string.system_update_restart_later_warning), (CharSequence) a2.mo66814b()));
                        avsf.mo51564d(true);
                    }
                    avsf.mo51562c(true);
                    avsf.mo51556a(activity2.getText(C0126R.string.system_update_restart_now));
                    avsf.mo51557a(true);
                    avsf.mo51555a((int) C0126R.string.common_done);
                } else if (systemUpdateStatus.f109483y) {
                    try {
                        bmxv = bmxv.m108566b(avmc.m78777a(systemUpdateStatus.f109481w).mo51366a((Context) avrl, System.currentTimeMillis()));
                    } catch (avlq e) {
                        f93832a.mo25418e("Unable to parse restart time window: %s.", systemUpdateStatus.f109481w);
                        bmxv = bmvz.f131120a;
                    }
                    avsf.mo51564d(false);
                    if (!bmxv.mo66813a() || !systemUpdateStatus.f109483y) {
                        avsf.mo51562c(false);
                    } else {
                        avsf.mo51562c(true);
                        avsf.mo51556a(TextUtils.expandTemplate(activity2.getText(C0126R.string.system_update_restart_after), (CharSequence) bmxv.mo66814b()));
                    }
                    avsf.mo51555a((int) C0126R.string.system_update_restart_now);
                    avsf.mo51557a(true);
                } else {
                    avsf.mo51555a((int) C0126R.string.system_update_restart_now);
                    avsf.mo51557a(true);
                    avsf.mo51562c(false);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m79139a(avrl avrl) {
        avrl.mo51540g().mo51344a(new InstallationOptions(true, true, true, false));
    }

    /* renamed from: a */
    private static void m79140a(avrl avrl, SystemUpdateStatus systemUpdateStatus) {
        if (!cfsy.f185667a.mo6606a().mo82693e() || !systemUpdateStatus.f109458A) {
            m79139a(avrl);
        } else {
            avrl.mo51553t();
        }
    }

    /* renamed from: a */
    private static boolean m79141a(SystemUpdateStatus systemUpdateStatus) {
        return cfsy.f185667a.mo6606a().mo82694f() && m79142b(systemUpdateStatus);
    }
}
