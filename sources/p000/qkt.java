package p000;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: qkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qkt extends BoundService {

    /* renamed from: a */
    public final BoundService f41621a;

    /* renamed from: b */
    private aabl f41622b;

    public qkt(BoundService boundService) {
        this.f41621a = boundService;
    }

    public final IBinder onBind(Intent intent) {
        blji a = this.f41622b.mo16694a("onBind", adzz.I_HAVE_PRIVILEGE_TO_CALL_THIS_API);
        try {
            IBinder onBind = this.f41621a.onBind(intent);
            if (onBind == null || !cdoz.f181455a.mo6606a().mo78114g()) {
                if (a != null) {
                    a.close();
                }
                return onBind;
            }
            BoundService boundService = this.f41621a;
            if (boundService != null && aacg.m21082a(onBind)) {
                onBind = new aacg(boundService, (Binder) onBind);
            }
            if (a != null) {
                a.close();
            }
            return onBind;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        blji b = this.f41622b.mo16696b("onConfigurationChanged");
        try {
            this.f41621a.onConfigurationChanged(configuration);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        BoundService boundService = this.f41621a;
        aabl aabl = new aabl(boundService, boundService.getClass(), 7);
        this.f41622b = aabl;
        blji b = aabl.mo16696b("onCreate");
        try {
            this.f41621a.onCreate();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        blji b = this.f41622b.mo16696b("onDestroy");
        try {
            this.f41621a.onDestroy();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onLowMemory() {
        blji b = this.f41622b.mo16696b("onLowMemory");
        try {
            this.f41621a.onLowMemory();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onRebind(Intent intent) {
        blji a = this.f41622b.mo16694a("onRebind", adzz.I_HAVE_PRIVILEGE_TO_CALL_THIS_API);
        try {
            this.f41621a.onRebind(intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onTrimMemory(int i) {
        blji b = this.f41622b.mo16696b("onTrimMemory");
        try {
            this.f41621a.onTrimMemory(i);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onUnbind(Intent intent) {
        blji a = this.f41622b.mo16694a("onUnbind", adzz.I_HAVE_PRIVILEGE_TO_CALL_THIS_API);
        try {
            boolean onUnbind = this.f41621a.onUnbind(intent);
            if (a != null) {
                a.close();
            }
            return onUnbind;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void publicDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        blji b = this.f41622b.mo16696b("onUnbind");
        try {
            this.f41621a.publicDump(fileDescriptor, printWriter, strArr);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
