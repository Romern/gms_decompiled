package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.UserHandle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: arly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arly {

    /* renamed from: a */
    public final SharedPreferences f87870a;

    /* renamed from: b */
    public final arls f87871b;

    /* renamed from: c */
    public final Context f87872c;

    /* renamed from: d */
    private final arlz f87873d;

    public arly(Context context, Handler handler) {
        arls arls = new arls(context, handler);
        this.f87873d = arlz.m73092a(context);
        this.f87870a = context.getSharedPreferences("SmartDevice.WorkProfile", 0);
        this.f87871b = arls;
        this.f87872c = context;
    }

    /* renamed from: a */
    public final aucb mo48620a() {
        UserHandle a;
        auck auck;
        int b = this.f87873d.mo48625b();
        aucb a2 = aucu.m76778a("");
        if (b == 4 && (a = this.f87873d.mo48624a()) != null) {
            arls arls = this.f87871b;
            aucf aucf = arls.f87861f;
            if (aucf == null) {
                aucf aucf2 = new aucf();
                arls.f87861f = aucf2;
                arlo arlo = new arlo(arls, "smartdevice", aucf2);
                Context context = arls.f87857b;
                Intent intent = new Intent("com.google.android.gms.smartdevice.setup.accounts.AccountsService.START");
                intent.setPackage("com.google.android.gms");
                if (!context.bindServiceAsUser(intent, arlo, 1, a)) {
                    arls.f87856a.mo25416d("Failed to bind to %s", a);
                    aucf2.mo50390a((Exception) new rjp(new Status(10553)));
                }
                auck = aucf2.f91388a;
            } else {
                auck = aucf.f91388a;
            }
            a2 = auck.mo50364a((auca) new arlu(this)).mo50364a(new arlw());
            if (!cgps.m146491c() && cgps.m146492d()) {
                a2 = a2.mo50364a(new arlx());
            }
        }
        return a2.mo50363a(new arlv(this, b));
    }

    /* renamed from: b */
    public final aucb mo48622b() {
        String string = this.f87870a.getString("name", null);
        int i = 0;
        int a = bouo.m111561a(this.f87870a.getInt("managementMode", 0));
        String string2 = this.f87870a.getString("sourceId", null);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 == 1) {
                i = 1;
            } else if (i2 == 2) {
                i = 2;
            } else if (i2 == 3) {
                i = 3;
            } else if (i2 == 4) {
                i = 4;
            }
            return aucu.m76778a(new ManagedAccountSetupInfo(string, i, string2));
        }
        throw null;
    }

    /* renamed from: c */
    public final int mo48623c() {
        return this.f87873d.mo48625b();
    }

    /* renamed from: a */
    public final void mo48621a(WorkProfilePayload workProfilePayload) {
        this.f87870a.edit().putString("name", workProfilePayload.f107996b).putInt("managementMode", workProfilePayload.f107997c).putString("sourceId", workProfilePayload.f107999e).apply();
    }
}
