package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: gkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkf {

    /* renamed from: a */
    public static final gkf f18388a = new gkf();

    /* renamed from: b */
    private static final imr f18389b = imr.m15727a("is_setup_wizard");

    /* renamed from: a */
    public final void mo11978a(jwz jwz) {
        jwz.setContentView(LayoutInflater.from(jwz).inflate((int) C0126R.C0128layout.auth_tv_suw_glif_activity, (ViewGroup) null));
    }

    /* renamed from: b */
    public final boolean mo11981b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") || context.getPackageManager().hasSystemFeature("android.software.leanback") || mo11980a(context);
    }

    /* renamed from: a */
    public final void mo11979a(jwz jwz, Intent intent) {
        if (((Boolean) jwz.mo14202g().mo13147a(f18389b, false)).booleanValue() || (intent != null && intent.getBooleanExtra("is_setup_wizard", false))) {
            int i = Build.VERSION.SDK_INT;
            rfi rfi = rfi.f42868a;
            if (rfy.m33553j(jwz) >= 12800000) {
                jwz.setTheme(C0126R.style.TvMinuteMaidOpaqueSuw);
                return;
            }
        }
        jwz.setTheme(C0126R.style.TvMinuteMaidOpaque);
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo11980a(Context context) {
        return context.getPackageManager().resolveService(new Intent("com.google.android.gsf.notouch.LAUNCH_AUTH_UI").setPackage("com.google.android.gsf.notouch"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null;
    }
}
