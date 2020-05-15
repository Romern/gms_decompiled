package p000;

import android.content.pm.PackageManager;
import android.os.Handler;

/* renamed from: ssu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssu extends sss implements PackageManager.OnPermissionsChangedListener {

    /* renamed from: a */
    private final PackageManager f45104a;

    /* renamed from: b */
    private final Object f45105b = new Object();

    /* renamed from: c */
    private ssr f45106c;

    /* renamed from: d */
    private Handler f45107d;

    public ssu(PackageManager packageManager) {
        this.f45104a = packageManager;
    }

    /* renamed from: a */
    public final void mo26059a(ssr ssr, Handler handler) {
        synchronized (this.f45105b) {
            if (this.f45106c == null) {
                this.f45104a.addOnPermissionsChangeListener(this);
            }
            this.f45106c = ssr;
            this.f45107d = handler;
        }
    }

    /* renamed from: a */
    public final boolean mo26060a() {
        return true;
    }

    /* renamed from: b */
    public final void mo26061b() {
        synchronized (this.f45105b) {
            if (this.f45106c != null) {
                this.f45104a.removeOnPermissionsChangeListener(this);
                this.f45106c = null;
                this.f45107d = null;
            }
        }
    }

    public final void onPermissionsChanged(int i) {
        ssr ssr;
        Handler handler;
        synchronized (this.f45105b) {
            ssr = this.f45106c;
            handler = this.f45107d;
        }
        if (ssr != null) {
            handler.post(new sst(ssr, i));
        }
    }
}
