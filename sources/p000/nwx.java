package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

/* renamed from: nwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwx extends aeaa {

    /* renamed from: a */
    private static final bnsn f36847a = odk.m28481a("CAR.CAM");

    /* renamed from: b */
    private final Context f36848b;

    /* renamed from: c */
    private boolean f36849c;

    /* renamed from: d */
    private ComponentName f36850d;

    public nwx(Context context) {
        super("car");
        this.f36848b = context;
    }

    /* renamed from: a */
    public final synchronized void mo21770a() {
        if (this.f36849c) {
            skh.m35531a().mo25689a(this.f36848b, this);
            this.f36849c = false;
            this.f36850d = null;
        }
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
    }

    /* renamed from: b */
    public final synchronized void mo21771b(ComponentName componentName) {
        int i;
        if (this.f36849c) {
            bmxy.m108581a(this.f36850d);
            if (!this.f36850d.equals(componentName)) {
                mo21770a();
            }
        }
        if (ccsq.m131457b()) {
            int i2 = Build.VERSION.SDK_INT;
            i = 4160;
        } else {
            i = 64;
        }
        Intent component = new Intent().setComponent(componentName);
        boolean a = skh.m35531a().mo25690a(this.f36848b, component, this, i);
        this.f36849c = a;
        if (!a) {
            bnsi c = f36847a.mo68388c();
            c.mo68432a("nwx", "b", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("makeForeground failed due to bindService failure %s", componentName);
        } else {
            this.f36850d = componentName;
        }
    }
}
