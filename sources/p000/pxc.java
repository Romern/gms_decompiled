package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxc extends pwz {

    /* renamed from: c */
    private final String f40550c;

    /* renamed from: d */
    private final String f40551d;

    /* renamed from: e */
    private final Bundle f40552e;

    /* renamed from: f */
    private final PendingIntent f40553f;

    /* renamed from: g */
    private final pwy f40554g;

    public pxc(pvd pvd, pwv pwv, pwy pwy, PendingIntent pendingIntent, String str, String str2, Bundle bundle) {
        super("StartRemoteDisplayOperation", pvd, pwv);
        this.f40550c = str;
        this.f40551d = str2;
        this.f40552e = bundle;
        this.f40554g = pwy;
        this.f40553f = pendingIntent;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pwd pwd;
        boolean z;
        pvd pvd = this.f40546a;
        pwv pwv = this.f40547b;
        pwy pwy = this.f40554g;
        PendingIntent pendingIntent = this.f40553f;
        String str = this.f40550c;
        String str2 = this.f40551d;
        Bundle bundle = this.f40552e;
        pvd.f40336a.mo23670a("startRemoteDisplay routeId: %s appId:%s configPreset:%s", str, str2, bundle);
        pvj pvj = pvd.f40342g;
        if (pvj != null) {
            pvj.mo944e();
        }
        pvd.f40345j = pwv;
        pvd.f40340e = str;
        pvd.f40341f = str2;
        pvd.f40348m = pwy;
        pvd.f40343h = pendingIntent;
        qav qav = pvd.f40336a;
        String str3 = pvd.f40340e;
        String str4 = pvd.f40341f;
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 54 + String.valueOf(str4).length() + String.valueOf(valueOf).length());
        sb.append("initiateRemoteDisplay routeId: ");
        sb.append(str3);
        sb.append(" appId: ");
        sb.append(str4);
        sb.append(" configPreset: ");
        sb.append(valueOf);
        qav.mo23670a(sb.toString(), new Object[0]);
        pwd pwd2 = (pwd) pvd.f40344i.get(pvd.f40341f);
        if (pwd2 != null) {
            pwd = pwd2;
        } else {
            if (bundle != null) {
                pwd2 = pwd.m31503a(bundle.getInt("configuration") & 255);
            }
            if (pwd2 == null) {
                pwd = pwd.m31503a(pwd.f40437a);
            } else {
                pwd = pwd2;
            }
        }
        if (bundle != null) {
            z = (bundle.getInt("configuration") & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0;
        } else {
            z = true;
        }
        CastDevice a = pvd.f40338c.mo23451a(pvd.f40340e);
        if (a != null) {
            pvh pvh = pvd.f40339d;
            String str5 = pvd.f40341f;
            Context context2 = pvh.f40357a;
            ScheduledExecutorService scheduledExecutorService = pvh.f40358b;
            pvv pvv = pvh.f40359c;
            pmx pmx = pvh.f40360d;
            qbw qbw = pvh.f40361e;
            qbv qbv = pvh.f40362f;
            pvd.f40342g = new pvj(context2, a, scheduledExecutorService, pvv, pmx, str5, pwd, z);
            pvj pvj2 = pvd.f40342g;
            pvj2.f40384s.execute(new pve(pvj2, pvd));
            pvd.f40342g.mo943d();
        }
    }
}
