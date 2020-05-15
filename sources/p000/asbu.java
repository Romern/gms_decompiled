package p000;

import android.content.Context;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: asbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbu {

    /* renamed from: a */
    private static final asco f88681a = ascp.m73787a("AccountTransferUtils");

    /* renamed from: a */
    public static boolean m73760a(Context context) {
        if (!cgqs.f187523a.mo6606a().mo84340z()) {
            return false;
        }
        sre.m36087g(context);
        sre.m36088h(context);
        sre.m36089i(context);
        return true;
    }

    /* renamed from: a */
    public static boolean m73761a(BootstrapOptions bootstrapOptions) {
        f88681a.logVerbose("3pmfm supported by target device %s", Boolean.valueOf(bootstrapOptions.f107841n));
        f88681a.logVerbose("3pmfm allowed by target client %s", Boolean.valueOf(bootstrapOptions.f107842o));
        f88681a.logVerbose("3pmfm export allowed by smartsetup %s", Boolean.valueOf(cgqs.m146596b()));
        f88681a.logVerbose("3pmfm forced %s", Boolean.valueOf(cgqs.m146599e()));
        aqxm.m72204e();
        if (!bootstrapOptions.f107841n) {
            return false;
        }
        if (!cgqs.m146599e()) {
            return bootstrapOptions.f107842o && cgqs.m146596b();
        }
        return true;
    }
}
