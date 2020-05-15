package p000;

import java.util.TimerTask;
import org.webrtc.Logging;

/* renamed from: ciuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciuw extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ ciux f191508a;

    /* renamed from: b */
    private final int f191509b;

    /* renamed from: c */
    private final int f191510c;

    public ciuw(ciux ciux, int i, int i2) {
        this.f191508a = ciux;
        this.f191509b = i;
        this.f191510c = i2;
    }

    public final void run() {
        int mode = this.f191508a.f191511a.getMode();
        if (mode == 1) {
            int streamVolume = this.f191508a.f191511a.getStreamVolume(2);
            int i = this.f191509b;
            StringBuilder sb = new StringBuilder(56);
            sb.append("STREAM_RING stream volume: ");
            sb.append(streamVolume);
            sb.append(" (max=");
            sb.append(i);
            sb.append(")");
            Logging.m151178a("VolumeLogger", sb.toString());
        } else if (mode == 3) {
            int streamVolume2 = this.f191508a.f191511a.getStreamVolume(0);
            int i2 = this.f191510c;
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("VOICE_CALL stream volume: ");
            sb2.append(streamVolume2);
            sb2.append(" (max=");
            sb2.append(i2);
            sb2.append(")");
            Logging.m151178a("VolumeLogger", sb2.toString());
        }
    }
}
