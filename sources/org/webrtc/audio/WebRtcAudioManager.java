package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebRtcAudioManager {
    WebRtcAudioManager() {
    }

    /* renamed from: a */
    private static int m151199a(AudioManager audioManager) {
        int i = Build.VERSION.SDK_INT;
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        return property != null ? Integer.parseInt(property) : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        int i3;
        if (m151200a(context)) {
            return m151199a(audioManager);
        }
        int i4 = i2 + i2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (m151200a(context)) {
            return m151199a(audioManager);
        }
        int i5 = i2 + i2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i5;
    }

    public static int getSampleRate(AudioManager audioManager) {
        int i;
        if (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic_")) {
            int i2 = Build.VERSION.SDK_INT;
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property != null) {
                i = Integer.parseInt(property);
            } else {
                i = 16000;
            }
            StringBuilder sb = new StringBuilder(36);
            sb.append("Sample rate is set to ");
            sb.append(i);
            sb.append(" Hz");
            Logging.m151178a("WebRtcAudioManagerExternal", sb.toString());
            return i;
        }
        Logging.m151178a("WebRtcAudioManagerExternal", "Running emulator, overriding sample rate to 8 kHz.");
        return 8000;
    }

    /* renamed from: a */
    private static boolean m151200a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
