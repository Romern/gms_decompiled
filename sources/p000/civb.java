package p000;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioTrack;

/* renamed from: civb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civb extends Thread {

    /* renamed from: a */
    public volatile boolean f191523a = true;

    /* renamed from: b */
    final /* synthetic */ WebRtcAudioTrack f191524b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public civb(WebRtcAudioTrack webRtcAudioTrack, String str) {
        super(str);
        this.f191524b = webRtcAudioTrack;
    }

    public final void run() {
        boolean z;
        boolean z2;
        Process.setThreadPriority(-19);
        String valueOf = String.valueOf(civc.m151037a());
        Logging.m151178a("WebRtcAudioTrackExternal", valueOf.length() == 0 ? new String("AudioTrackThread") : "AudioTrackThread".concat(valueOf));
        WebRtcAudioTrack webRtcAudioTrack = this.f191524b;
        int i = WebRtcAudioTrack.f192118g;
        if (webRtcAudioTrack.f192123e.getPlayState() == 3) {
            z = true;
        } else {
            z = false;
        }
        WebRtcAudioTrack.m151210a(z);
        this.f191524b.mo86980a(0);
        int capacity = this.f191524b.f192122d.capacity();
        while (this.f191523a) {
            WebRtcAudioTrack.nativeGetPlayoutData(this.f191524b.f192119a, capacity);
            if (capacity <= this.f191524b.f192122d.remaining()) {
                z2 = true;
            } else {
                z2 = false;
            }
            WebRtcAudioTrack.m151210a(z2);
            boolean z3 = this.f191524b.f192124f;
            WebRtcAudioTrack webRtcAudioTrack2 = this.f191524b;
            AudioTrack audioTrack = webRtcAudioTrack2.f192123e;
            ByteBuffer byteBuffer = webRtcAudioTrack2.f192122d;
            int i2 = Build.VERSION.SDK_INT;
            int write = audioTrack.write(byteBuffer, capacity, 0);
            if (write != capacity) {
                StringBuilder sb = new StringBuilder(60);
                sb.append("AudioTrack.write played invalid number of bytes: ");
                sb.append(write);
                Logging.m151180b("WebRtcAudioTrackExternal", sb.toString());
                if (write < 0) {
                    this.f191523a = false;
                    WebRtcAudioTrack webRtcAudioTrack3 = this.f191524b;
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("AudioTrack.write failed: ");
                    sb2.append(write);
                    String valueOf2 = String.valueOf(sb2.toString());
                    Logging.m151180b("WebRtcAudioTrackExternal", valueOf2.length() == 0 ? new String("Run-time playback error: ") : "Run-time playback error: ".concat(valueOf2));
                    civc.m151039a("WebRtcAudioTrackExternal", webRtcAudioTrack3.f192120b, webRtcAudioTrack3.f192121c);
                }
            }
            this.f191524b.f192122d.rewind();
        }
    }
}
