package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

/* renamed from: arno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arno implements armu {

    /* renamed from: a */
    private final argv f87977a;

    /* renamed from: b */
    private final arec f87978b;

    /* renamed from: c */
    private final arem f87979c;

    public arno(argv argv, arec arec, arem arem) {
        this.f87977a = argv;
        this.f87978b = arec;
        this.f87979c = arem;
    }

    /* renamed from: a */
    public final void mo48347a() {
        this.f87978b.mo48462a();
    }

    /* renamed from: a */
    public final void mo48348a(int i) {
        this.f87977a.mo48402a(i);
        this.f87978b.mo48463a(i);
    }

    /* renamed from: a */
    public final void mo48349a(aqzo aqzo, TargetConnectionArgs targetConnectionArgs) {
        this.f87978b.mo48465a(targetConnectionArgs);
        aqxm.m72204e();
        arem arem = this.f87979c;
        arem.f87521h = aqzo;
        BootstrapOptions bootstrapOptions = arem.f87519f;
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.mo59095a(bootstrapOptions);
        arem.mo48233b(messagePayload);
    }

    /* renamed from: a */
    public final void mo48350a(VerificationInfo verificationInfo) {
        this.f87978b.mo48466a(verificationInfo.f107953a);
    }

    /* renamed from: a */
    public final void mo48351a(String str) {
        this.f87978b.mo48466a(str);
    }

    /* renamed from: a */
    public final void mo48352a(byte[] bArr) {
        this.f87979c.mo48230a(bArr);
    }
}
