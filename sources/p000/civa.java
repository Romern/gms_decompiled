package p000;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: civa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civa extends Thread {

    /* renamed from: a */
    public volatile boolean f191521a = true;

    /* renamed from: b */
    final /* synthetic */ WebRtcAudioRecord f191522b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public civa(WebRtcAudioRecord webRtcAudioRecord, String str) {
        super(str);
        this.f191522b = webRtcAudioRecord;
    }

    public final void run() {
        Process.setThreadPriority(-19);
        String valueOf = String.valueOf(civc.m151037a());
        Logging.m151178a("WebRtcAudioRecordExternal", valueOf.length() == 0 ? new String("AudioRecordThread") : "AudioRecordThread".concat(valueOf));
        WebRtcAudioRecord.m151205b(this.f191522b.f192105e.getRecordingState() == 3);
        WebRtcAudioRecord.m151202a(0);
        System.nanoTime();
        while (this.f191521a) {
            WebRtcAudioRecord webRtcAudioRecord = this.f191522b;
            AudioRecord audioRecord = webRtcAudioRecord.f192105e;
            ByteBuffer byteBuffer = webRtcAudioRecord.f192104d;
            int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
            if (read != this.f191522b.f192104d.capacity()) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("AudioRecord.read failed: ");
                sb.append(read);
                String sb2 = sb.toString();
                Logging.m151180b("WebRtcAudioRecordExternal", sb2);
                if (read == -3) {
                    this.f191521a = false;
                    WebRtcAudioRecord webRtcAudioRecord2 = this.f191522b;
                    String valueOf2 = String.valueOf(sb2);
                    Logging.m151180b("WebRtcAudioRecordExternal", valueOf2.length() == 0 ? new String("Run-time recording error: ") : "Run-time recording error: ".concat(valueOf2));
                    civc.m151039a("WebRtcAudioRecordExternal", webRtcAudioRecord2.f192101a, webRtcAudioRecord2.f192102b);
                }
            } else {
                boolean z = this.f191522b.f192106f;
                if (this.f191521a) {
                    WebRtcAudioRecord webRtcAudioRecord3 = this.f191522b;
                    webRtcAudioRecord3.nativeDataIsRecorded(webRtcAudioRecord3.f192103c, read);
                }
                ciuv ciuv = this.f191522b.f192107g;
            }
        }
        try {
            AudioRecord audioRecord2 = this.f191522b.f192105e;
            if (audioRecord2 != null) {
                audioRecord2.stop();
                WebRtcAudioRecord.m151202a(1);
            }
        } catch (IllegalStateException e) {
            String valueOf3 = String.valueOf(e.getMessage());
            Logging.m151180b("WebRtcAudioRecordExternal", valueOf3.length() == 0 ? new String("AudioRecord.stop failed: ") : "AudioRecord.stop failed: ".concat(valueOf3));
        }
    }
}
