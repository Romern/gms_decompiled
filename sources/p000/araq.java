package p000;

import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: araq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class araq implements armu {

    /* renamed from: a */
    private static final asco f87227a = ascp.m73787a(araq.class.getSimpleName());

    /* renamed from: b */
    private final ards f87228b;

    /* renamed from: c */
    private final ariq f87229c;

    public araq(ards ards, ariq ariq) {
        this.f87228b = ards;
        this.f87229c = ariq;
    }

    /* renamed from: a */
    public void mo48347a() {
        try {
            this.f87229c.mo48569a();
        } catch (RemoteException e) {
            f87227a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo48348a(int i) {
        try {
            this.f87229c.mo48570a(i);
        } catch (RemoteException e) {
            f87227a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo48349a(aqzo aqzo, TargetConnectionArgs targetConnectionArgs) {
        f87227a.mo25412b("onConnected", new Object[0]);
        this.f87228b.mo48267a(aqzo);
    }

    /* renamed from: a */
    public final void mo48350a(VerificationInfo verificationInfo) {
        try {
            this.f87229c.mo48572a(verificationInfo);
        } catch (RemoteException e) {
            f87227a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48351a(String str) {
        try {
            this.f87229c.mo48573a(str);
        } catch (RemoteException e) {
            f87227a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48352a(byte[] bArr) {
        this.f87228b.mo48271a(bArr);
    }
}
