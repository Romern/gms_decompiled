package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avme {

    /* renamed from: a */
    public static final Long f93379a = 3L;

    /* renamed from: b */
    public static final Long f93380b = 4L;

    /* renamed from: c */
    public static final Long f93381c = 6L;

    /* renamed from: d */
    public static final Long f93382d = 2L;

    /* renamed from: e */
    public static final avlv f93383e = f93384f.mo51362a("urgency", (Long) 2L, cfsi.f185600ab);

    /* renamed from: f */
    private static final avlu f93384f = new avlu("config.flag.");

    /* renamed from: a */
    private static boolean m78789a(Context context) {
        if (((Long) f93383e.mo51364a()).longValue() != f93379a.longValue() || TextUtils.isEmpty((CharSequence) avma.f93361g.mo51364a())) {
            return false;
        }
        avls.m78743i(context);
        avls.m78745k(context);
        avls.m78744j(context);
        return true;
    }

    /* renamed from: a */
    private static boolean m78792a(SystemUpdateStatus systemUpdateStatus) {
        return systemUpdateStatus.f109473o == 0;
    }

    /* renamed from: b */
    public static boolean m78793b(Context context, SystemUpdateStatus systemUpdateStatus) {
        if (avls.m78732a()) {
            int i = Build.VERSION.SDK_INT;
            if (Settings.Global.getInt(context.getContentResolver(), "ota_disable_automatic_update", 0) != 0) {
                return false;
            }
            if (!cfsg.f185570a.mo6606a().mo82654z() || ((Long) f93383e.mo51364a()).longValue() == f93380b.longValue() || systemUpdateStatus.f109466h.f109450c) {
                return true;
            }
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        avls.m78745k(context);
        return cfsg.f185570a.mo6606a().mo82617A();
    }

    /* renamed from: a */
    public static boolean m78790a(Context context, SystemUpdateStatus systemUpdateStatus) {
        if (avmb.m78775a(context, systemUpdateStatus.f109472n).f93369a == 0) {
            if (((Long) f93383e.mo51364a()).longValue() == f93379a.longValue()) {
                int i = Build.VERSION.SDK_INT;
                int i2 = Build.VERSION.SDK_INT;
                return false;
            } else if (((Long) f93383e.mo51364a()).longValue() == f93382d.longValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m78791a(Context context, SystemUpdateStatus systemUpdateStatus, boolean z) {
        if (avmb.m78775a(context, systemUpdateStatus.f109472n).f93369a != 0 || !m78793b(context, systemUpdateStatus) || (m78792a(systemUpdateStatus) && m78789a(context))) {
            return false;
        }
        if (avls.m78732a()) {
            if (((Long) f93383e.mo51364a()).longValue() == f93382d.longValue() || ((Long) f93383e.mo51364a()).longValue() == f93379a.longValue() || cfsv.f185664a.mo6606a().mo82687a()) {
                return true;
            }
            return false;
        } else if (!z || !cfsg.f185570a.mo6606a().mo82629a() || ((Long) f93383e.mo51364a()).longValue() != f93379a.longValue()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m78794b(Context context, SystemUpdateStatus systemUpdateStatus, boolean z) {
        if (avmb.m78775a(context, systemUpdateStatus.f109472n).f93369a != 0 || ((m78792a(systemUpdateStatus) && m78789a(context)) || m78791a(context, systemUpdateStatus, z))) {
            return false;
        }
        if (((Long) f93383e.mo51364a()).longValue() == f93382d.longValue() || ((Long) f93383e.mo51364a()).longValue() == f93379a.longValue()) {
            return true;
        }
        return false;
    }
}
