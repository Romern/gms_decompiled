package p000;

import java.io.IOException;
import org.webrtc.DataChannel;

/* renamed from: ailx */
final /* synthetic */ class ailx implements bmxj {

    /* renamed from: a */
    private final aimk f69155a;

    public ailx(aimk aimk) {
        this.f69155a = aimk;
    }

    public final Object apply(Object obj) {
        aimk aimk = this.f69155a;
        DataChannel dataChannel = (DataChannel) obj;
        if (dataChannel == null) {
            return null;
        }
        try {
            aisv aisv = new aisv("WebRtcSocket", dataChannel);
            aily aily = new aily(aimk);
            aisv.f69127b.clear();
            aisv.mo37637a(aily);
            return aisv;
        } catch (IOException e) {
            return null;
        }
    }
}
