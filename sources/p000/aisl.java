package p000;

import org.webrtc.DataChannel;

/* renamed from: aisl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aisl extends aiso {

    /* renamed from: a */
    final /* synthetic */ aisn f69634a;

    /* renamed from: b */
    private final DataChannel f69635b;

    public aisl(aisn aisn, DataChannel dataChannel) {
        this.f69634a = aisn;
        this.f69635b = dataChannel;
    }

    public final void onBufferedAmountChange(long j) {
        aimf aimf = this.f69634a.f69649d;
        aimf.f69166a.mo37672a(new aime(aimf));
    }

    public final void onMessage(DataChannel.Buffer buffer) {
        aimf aimf = this.f69634a.f69649d;
        byte[] bArr = new byte[buffer.f191798a.remaining()];
        buffer.f191798a.get(bArr);
        aimf.f69166a.mo37672a(new aimd(aimf, bArr));
    }

    public final void onStateChange() {
        if (this.f69635b.mo86768a() == DataChannel.State.OPEN) {
            this.f69634a.f69647b.mo69138b(this.f69635b);
            this.f69634a.mo37950a(new aisj(this));
        } else if (this.f69635b.mo86768a() == DataChannel.State.CLOSED) {
            this.f69634a.mo37950a(new aisk(this));
        }
    }
}
