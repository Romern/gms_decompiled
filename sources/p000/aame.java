package p000;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: aame */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aame extends aakq {

    /* renamed from: a */
    private final Context f28447a;

    /* renamed from: b */
    private final aand f28448b;

    /* renamed from: c */
    private final aajt f28449c;

    /* renamed from: d */
    private final aamr f28450d;

    public aame(Context context, aand aand, aajt aajt, aamr aamr) {
        this.f28447a = context;
        this.f28448b = aand;
        this.f28449c = aajt;
        this.f28450d = aamr;
    }

    /* renamed from: b */
    public static boolean m21504b(Context context) {
        return m21503a(context) || aajg.m21346e();
    }

    /* renamed from: a */
    public static boolean m21503a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService(PowerManager.class)).isDeviceIdleMode();
    }

    /* renamed from: b */
    public final void mo16941b(int i) {
        if (i != 4) {
            if (i != 5) {
                return;
            }
        } else if (this.f28448b.mo17094b()) {
            int i2 = Build.VERSION.SDK_INT;
            if (cecz.f182285a.mo6606a().mo78843k()) {
                boolean a = m21503a(this.f28447a);
                blmo blmo = (blmo) blmp.f126864r.mo74144da();
                if (blmo.f164950c) {
                    blmo.mo74035c();
                    blmo.f164950c = false;
                }
                blmp blmp = (blmp) blmo.f164949b;
                "com.google.android.gsf.gtalkservice".getClass();
                blmp.f126866a |= 16;
                blmp.f126870e = "com.google.android.gsf.gtalkservice";
                aajt.m21356a(blmo, "DozeNotification", String.valueOf(a));
                this.f28448b.mo17091a(blmo);
                if (a) {
                    GcmChimeraService.m24303a("Entering doze", new Object[0]);
                } else {
                    GcmChimeraService.m24303a("Exiting doze", new Object[0]);
                }
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (aajt.m21358e() && !m21504b(this.f28447a)) {
            this.f28450d.mo17053b(this.f28449c);
        }
    }
}
