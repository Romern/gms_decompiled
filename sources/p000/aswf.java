package p000;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskChimeraService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aswf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswf {

    /* renamed from: a */
    static final AtomicBoolean f89864a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final srn f89865b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static void m74926a(Context context) {
        try {
            if (asjw.m74258c(context)) {
                if (m74928c(context)) {
                    m74930e(context);
                    return;
                }
            }
            if (!m74929d(context)) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.gms.tapandpay.hce.service.TpHceService"), 2, 1);
                return;
            }
            m74931f(context);
            if (asjk.m74232f(context)) {
                ((DevicePolicyManager) context.getSystemService("device_policy")).setPasswordQuality(asjk.m74226a(context), 0);
            }
            new atkm(context).f90420c.edit().putBoolean("tap_and_pay_enabled", true).apply();
            m74930e(context);
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) f89865b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aswf", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error initializing Google Pay");
        }
    }

    /* renamed from: b */
    public static void m74927b(Context context) {
        try {
            if (m74928c(context) || m74929d(context)) {
                new atkm(context).f90420c.edit().putLong("last_unlock", -1).apply();
                atds.m75667a(context);
            }
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) f89865b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aswf", "b", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error initializing Google Pay");
        }
    }

    /* renamed from: c */
    private static boolean m74928c(Context context) {
        return new atkm(context).mo50021g();
    }

    /* renamed from: d */
    private static boolean m74929d(Context context) {
        if (asjw.m74258c(context)) {
            if (((Boolean) askd.f89111c.mo58455c()).booleanValue()) {
                return true;
            }
            int i = spn.f44932a;
            if (!atdz.m75703a(context)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static void m74930e(Context context) {
        if (f89864a.compareAndSet(false, true)) {
            m74931f(context);
            context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.account.AndroidIdValidationIntentOperation", "com.google.android.gms.tapandpay.account.ANDROID_ID_VALIDATION_ACTION"));
            athr.m75911a(context);
            asjg.m74218d(context);
            aszy.m75268a(context);
            assl.m74675i();
            asul.m74850a(context);
            asjk.m74228b(context);
            TapAndPayGcmTaskChimeraService.m93027a(context);
            asuc.getInstance().mo49500a(context, "init gcore");
        }
    }

    /* renamed from: f */
    private static void m74931f(Context context) {
        if (asjw.m74256a(context)) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.gms.tapandpay.hce.service.TpHceService"), 1, 1);
            if (cgwd.m147195c() || !cgwd.m147196d().f165797a.isEmpty()) {
                asuu.m74874a(context, 2, false);
            }
        }
    }
}
