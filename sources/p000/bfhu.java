package p000;

import android.media.AudioRecord;
import android.os.SystemClock;
import java.util.Locale;

/* renamed from: bfhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f113973a;

    /* renamed from: b */
    final /* synthetic */ bfhw f113974b;

    public bfhu(bfhw bfhw, int i) {
        this.f113974b = bfhw;
        this.f113973a = i;
    }

    public final void run() {
        bfhw bfhw = this.f113974b;
        int i = this.f113973a;
        while (bfhw.f113975a) {
            if (bfhw.f113975a && bfhw.f113975a) {
                try {
                    bfhw.f113976b = new AudioRecord.Builder().setAudioSource(bfhw.mo61649g()).setAudioFormat(bfhw.mo61645c()).setBufferSizeInBytes(i).build();
                    if (bfhw.f113976b.getState() != 0) {
                        bfhw.f113976b.startRecording();
                        if (bfhw.f113976b.getRecordingState() != 1) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            int channelCount = bfhw.f113976b.getChannelCount();
                            int bufferSizeInFrames = bfhw.f113976b.getBufferSizeInFrames();
                            bfev bfev = bfhw.f113805h;
                            bfev.post(new bfet(bfev, bfhw.mo61649g(), bfhw.mo61646d(), channelCount));
                            if (bfhw.f113976b.getRoutedDevice() != null) {
                                Locale.getDefault();
                                Object[] objArr = {bfhw.f113976b.getRoutedDevice().getProductName(), Integer.valueOf(bfhw.f113976b.getRoutedDevice().getType())};
                            }
                            boolean a = bfhw.mo61644a(bufferSizeInFrames, channelCount, elapsedRealtime);
                            if (a) {
                                try {
                                    bfhw.f113976b.stop();
                                } catch (IllegalArgumentException e) {
                                }
                            }
                            bfhw.f113976b.release();
                            bfhw.f113976b = null;
                            if (a) {
                            }
                        } else {
                            bfhw.f113976b.release();
                        }
                    }
                } catch (IllegalStateException e2) {
                    bfhw.f113976b.release();
                }
                Locale.getDefault();
                new Object[1][0] = 1000;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e3) {
                }
            }
        }
    }
}
