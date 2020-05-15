package p000;

import java.util.concurrent.Callable;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: ciuz */
public final /* synthetic */ class ciuz implements Callable {

    /* renamed from: a */
    private final WebRtcAudioRecord f191520a;

    public ciuz(WebRtcAudioRecord webRtcAudioRecord) {
        this.f191520a = webRtcAudioRecord;
    }

    public final Object call() {
        this.f191520a.mo86973a(true);
        return "Scheduled task is done";
    }
}
