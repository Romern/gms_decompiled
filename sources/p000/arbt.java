package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class arbt {

    /* renamed from: a */
    public static final sek f87315a = ascp.m73787a("D2D", arbt.class.getSimpleName());

    /* renamed from: b */
    protected final arai f87316b;

    /* renamed from: c */
    public final armh f87317c;

    /* renamed from: d */
    public final ascx f87318d;

    /* renamed from: e */
    public final argz f87319e;

    /* renamed from: f */
    public final arbb f87320f;

    /* renamed from: g */
    protected arin f87321g;

    /* renamed from: h */
    protected ariq f87322h;

    /* renamed from: i */
    public ardt f87323i;

    /* renamed from: j */
    public D2DDevice f87324j;

    /* renamed from: k */
    public boolean f87325k;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    protected arbt(arai arai, arbb arbb, ascx ascx, argz argz) {
        this.f87316b = arai;
        this.f87317c = (armh) arai.f87199c;
        this.f87318d = ascx;
        this.f87320f = arbb;
        this.f87319e = argz;
    }

    /* renamed from: a */
    public static void m72420a(arit arit, Status status) {
        try {
            arit.mo48574a(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: b */
    public static void m72421b(arit arit, Status status) {
        try {
            arit.mo48576b(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: c */
    public static void m72422c(arit arit, Status status) {
        try {
            arit.mo48577c(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: d */
    public static void m72423d(arit arit, Status status) {
        try {
            arit.mo48578d(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: e */
    public static void m72424e(arit arit, Status status) {
        try {
            arit.mo48582h(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: f */
    public static void m72425f(arit arit, Status status) {
        try {
            arit.mo48579e(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: g */
    public static void m72426g(arit arit, Status status) {
        try {
            arit.mo48580f(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: h */
    public static void m72427h(arit arit, Status status) {
        try {
            arit.mo48581g(status);
        } catch (RemoteException e) {
            f87315a.mo25410a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract armu mo48376a(ariq ariq);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48377a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48378a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48379a(BootstrapConfigurations bootstrapConfigurations);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48380a(BootstrapConfigurations bootstrapConfigurations, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo48381b();

    /* renamed from: f */
    public final void mo48385f() {
        this.f87323i = null;
    }

    /* renamed from: c */
    public final void mo48382c() {
        f87315a.mo25409a("cleanup()", new Object[0]);
        arbb arbb = this.f87320f;
        aras aras = (aras) arbb;
        int i = aras.f87233c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 ? ((arbj) aras.f87231a).f87280f != null : i2 == 2 && aras.f87232b.f87304g != null) {
                arbb.mo48353a();
            }
            mo48383d();
            aras aras2 = (aras) this.f87320f;
            aras2.f87233c = 1;
            aras2.f87232b.f87304g = null;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo48383d() {
        f87315a.mo25409a("resetState()", new Object[0]);
        this.f87321g = null;
        mo48385f();
        f87315a.mo25409a("resetTargetDevice()", new Object[0]);
        this.f87324j = null;
        mo48384e();
        mo48377a();
    }

    /* renamed from: e */
    public final void mo48384e() {
        f87315a.mo25409a("resetBluetoothController()", new Object[0]);
        this.f87318d.mo49052b();
    }
}
