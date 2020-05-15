package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: arfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class arfh {

    /* renamed from: a */
    public static final Logger f87583a = ascp.m73787a("D2D", arfh.class.getSimpleName());

    /* renamed from: b */
    protected final arai f87584b;

    /* renamed from: c */
    public final Context f87585c;

    /* renamed from: d */
    public final armn f87586d;

    /* renamed from: e */
    public final ascx f87587e;

    /* renamed from: f */
    public final int f87588f;

    /* renamed from: g */
    protected arfa f87589g;

    /* renamed from: h */
    protected arec f87590h;

    /* renamed from: i */
    protected boolean f87591i = false;

    /* renamed from: j */
    public String f87592j;

    /* renamed from: k */
    public boolean f87593k = false;

    protected arfh(arai arai, ascx ascx, int i) {
        this.f87584b = arai;
        this.f87587e = ascx;
        this.f87588f = i;
        this.f87585c = arai.f87197a;
        this.f87586d = (armn) arai.f87199c;
    }

    /* renamed from: a */
    public static void m72641a(arjf arjf, Status status) {
        try {
            arjf.mo48598a(status, (AdvertisingInfo) null);
        } catch (RemoteException e) {
            f87583a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: b */
    public static void m72643b(arjf arjf, Status status) {
        try {
            arjf.mo48597a(status);
        } catch (RemoteException e) {
            f87583a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: c */
    public static void m72644c(arjf arjf, Status status) {
        try {
            arjf.mo48602b(status);
        } catch (RemoteException e) {
            f87583a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: d */
    public static void m72645d(arjf arjf, Status status) {
        try {
            arjf.mo48603c(status);
        } catch (RemoteException e) {
            f87583a.mo25410a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract armu mo48480a(BootstrapOptions bootstrapOptions, arec arec);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48481a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo48482b();

    /* renamed from: a */
    public static void m72642a(arjf arjf, Status status, String str) {
        try {
            arjf.mo48600a(status, str);
        } catch (RemoteException e) {
            f87583a.mo25410a((Throwable) e);
        }
    }
}
