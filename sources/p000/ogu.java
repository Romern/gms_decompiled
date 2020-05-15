package p000;

import com.google.android.gms.car.senderprotocol.ChannelMessage;

/* renamed from: ogu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ogu {

    /* renamed from: a */
    public final int f37603a;

    public ogu(int i) {
        this.f37603a = i;
    }

    /* renamed from: a */
    public final boolean mo22137a(ChannelMessage channelMessage) {
        return channelMessage.f29512e && channelMessage.f29511d > this.f37603a + -4;
    }
}
