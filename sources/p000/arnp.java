package p000;

import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: arnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arnp implements armu {

    /* renamed from: a */
    private static final asco f87980a = ascp.m73787a(arnp.class.getSimpleName());

    /* renamed from: b */
    private final argv f87981b;

    /* renamed from: c */
    private final arec f87982c;

    /* renamed from: d */
    private final argu f87983d;

    public arnp(argv argv, arec arec, argu argu) {
        this.f87981b = argv;
        this.f87982c = arec;
        this.f87983d = argu;
    }

    /* renamed from: a */
    public final void mo48347a() {
        this.f87982c.mo48462a();
    }

    /* renamed from: a */
    public final void mo48348a(int i) {
        this.f87981b.mo48402a(i);
        this.f87982c.mo48463a(i);
    }

    /* renamed from: a */
    public final void mo48349a(aqzo aqzo, TargetConnectionArgs targetConnectionArgs) {
        f87980a.mo25412b("onConnected", new Object[0]);
        this.f87982c.mo48465a(targetConnectionArgs);
        this.f87983d.mo48267a(aqzo);
    }

    /* renamed from: a */
    public final void mo48350a(VerificationInfo verificationInfo) {
        this.f87982c.mo48466a(verificationInfo.f107953a);
    }

    /* renamed from: a */
    public final void mo48351a(String str) {
        this.f87982c.mo48466a(str);
    }

    /* renamed from: a */
    public final void mo48352a(byte[] bArr) {
        this.f87983d.mo48271a(bArr);
    }
}
