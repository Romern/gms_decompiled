package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: nur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nur {

    /* renamed from: a */
    public static final bnsn f36554a = odk.m28481a("CAR.SERVICE.PLSC");

    /* renamed from: b */
    public final nuq f36555b;

    /* renamed from: c */
    public final olt f36556c;

    /* renamed from: d */
    public final nqu f36557d;

    /* renamed from: e */
    public final Context f36558e;

    /* renamed from: f */
    public final nth f36559f = new nup(this);

    /* renamed from: g */
    public Intent f36560g;

    /* renamed from: h */
    public boolean f36561h;

    /* renamed from: i */
    public ServiceConnection f36562i;

    /* renamed from: j */
    public boolean f36563j;

    /* renamed from: k */
    public ntf f36564k;

    public nur(nuq nuq, olt olt, nqu nqu, Context context) {
        this.f36555b = nuq;
        this.f36556c = olt;
        this.f36557d = nqu;
        this.f36558e = context;
    }

    /* renamed from: a */
    public static oez m27785a(int i) {
        if (i == 1) {
            return oez.USB;
        }
        if (i != 2) {
            return oez.UNKNOWN;
        }
        return oez.WIFI;
    }

    /* renamed from: b */
    public final void mo21618b() {
        int i;
        if (this.f36560g != null) {
            this.f36562i = new nun(this);
            skh a = skh.m35531a();
            Context context = this.f36558e;
            Intent intent = this.f36560g;
            ServiceConnection serviceConnection = this.f36562i;
            if (ccsq.m131458c()) {
                int i2 = Build.VERSION.SDK_INT;
                i = 4161;
            } else {
                i = 65;
            }
            boolean a2 = a.mo25690a(context, intent, serviceConnection, i);
            this.f36561h = a2;
            if (!a2) {
                bnsi c = f36554a.mo68388c();
                c.mo68432a("nur", "b", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Failed to bind to projection lifecycle service");
            }
        }
    }

    /* renamed from: a */
    public final void mo21617a() {
        boolean z;
        String b = npe.m27161b(this.f36558e);
        boolean a = sre.m36079a();
        int u = this.f36556c.mo21351u();
        boolean z2 = false;
        if (!(!a)) {
            z = false;
        } else {
            z = u == 0;
        }
        if (TextUtils.isEmpty(b)) {
            if (z) {
                bnsi d = f36554a.mo68390d();
                d.mo68432a("nur", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Using emulator configuration");
                b = "com.google.android.gms.apitest.car";
            } else {
                bnsi c = f36554a.mo68388c();
                c.mo68432a("nur", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("No projection lifecycle services installed");
                return;
            }
        }
        Intent intent = new Intent();
        this.f36560g = intent;
        intent.addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFECYCLE_SERVICE");
        this.f36560g.setPackage(b);
        if (this.f36558e.getPackageManager().resolveService(this.f36560g, 0) != null) {
            z2 = true;
        } else if (!z) {
            this.f36560g = new Intent().setComponent(new ComponentName(b, "com.google.android.projection.gearhead.service.GearHeadService"));
        } else {
            this.f36560g = null;
            bnsi d2 = f36554a.mo68390d();
            d2.mo68432a("nur", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("No appropriate service found");
        }
        mo21618b();
        if (!z2 || !this.f36561h) {
            this.f36563j = true;
            this.f36555b.mo21271a(new Bundle());
        }
        ofd.m28611a(this.f36558e, "com.google.android.gms.car.PROJECTION_STARTED", m27785a(u));
    }
}
