package p000;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: arap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arap implements armu {

    /* renamed from: a */
    private static final asco f87224a = ascp.m73787a("SourceConnectionCallbacks");

    /* renamed from: b */
    private final aray f87225b;

    /* renamed from: c */
    private final ariq f87226c;

    public arap(aray aray, ariq ariq) {
        this.f87225b = aray;
        this.f87226c = ariq;
    }

    /* renamed from: a */
    public void mo48347a() {
        try {
            this.f87226c.mo48569a();
        } catch (RemoteException e) {
            f87224a.mo25410a((Throwable) e);
        }
        this.f87225b.mo48239e();
    }

    /* renamed from: a */
    public void mo48348a(int i) {
        try {
            this.f87226c.mo48570a(i);
        } catch (RemoteException e) {
            f87224a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo48349a(aqzo aqzo, TargetConnectionArgs targetConnectionArgs) {
        Handler handler = this.f87225b.f87061b;
        aqxm.m72204e();
        aray aray = this.f87225b;
        aray.f87241d.mo25412b("Connected to target device.", new Object[0]);
        sdo.m34966a(aqzo, "deviceMessageSender cannot be null.");
        aray.f87243f = aqzo;
    }

    /* renamed from: a */
    public final void mo48350a(VerificationInfo verificationInfo) {
        try {
            this.f87226c.mo48572a(verificationInfo);
        } catch (RemoteException e) {
            f87224a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48351a(String str) {
        try {
            this.f87226c.mo48573a(str);
        } catch (RemoteException e) {
            f87224a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48352a(byte[] bArr) {
        this.f87225b.mo48230a(bArr);
    }
}
