package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: apir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apir extends aeaa implements apim {

    /* renamed from: a */
    final /* synthetic */ apis f84490a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apir(apis apis) {
        super("scheduler");
        this.f84490a = apis;
    }

    /* renamed from: a */
    public final void mo47312a() {
        if (((Boolean) this.f84490a.f84495e.mo6606a()).booleanValue()) {
            this.f84490a.mo47316a();
        }
        skh.m35531a().mo25693b(this.f84490a.f84491a, this);
        synchronized (this) {
        }
    }

    /* renamed from: b */
    public final void mo47313b(ComponentName componentName) {
        try {
            this.f84490a.f84492b.mo16971a(componentName);
        } catch (RemoteException e) {
            Log.e("GcmBinderProxy", "Error conveying null binder to primary user", e);
        }
        mo47312a();
    }

    public final void close() {
        if (cedr.m136295c()) {
            this.f84490a.f84494d.execute(new apiq(this));
        } else {
            mo47312a();
        }
    }

    public final void onNullBinding(ComponentName componentName) {
        if (cedr.m136295c()) {
            this.f84490a.f84494d.execute(new apio(this, componentName));
        } else {
            mo47313b(componentName);
        }
    }

    /* renamed from: b */
    public final void mo47314b(ComponentName componentName, IBinder iBinder) {
        boolean z;
        if (componentName != null) {
            z = componentName.equals(this.f84490a.f84493c.getComponent());
        } else {
            z = false;
        }
        if (componentName != null && z && apil.m70420a(iBinder)) {
            try {
                this.f84490a.f84492b.mo16972a(componentName, new aalh(iBinder, this));
            } catch (RemoteException e) {
                Log.e("GcmBinderProxy", "Error connecting primary user binder", e);
                close();
            }
        } else {
            try {
                this.f84490a.f84492b.mo16974d();
            } catch (RemoteException e2) {
                Log.e("GcmBinderProxy", "Error conveying binder error to primary user", e2);
            }
            close();
        }
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        close();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        if (cedr.m136295c()) {
            this.f84490a.f84494d.execute(new apip(this, componentName, iBinder));
        } else {
            mo47314b(componentName, iBinder);
        }
    }
}
