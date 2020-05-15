package p000;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.UUID;
import org.webrtc.Logging;

/* renamed from: ciuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciuy {

    /* renamed from: e */
    private static final UUID f191513e = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");

    /* renamed from: f */
    private static final UUID f191514f = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    /* renamed from: g */
    private static AudioEffect.Descriptor[] f191515g;

    /* renamed from: a */
    public AcousticEchoCanceler f191516a;

    /* renamed from: b */
    public NoiseSuppressor f191517b;

    /* renamed from: c */
    public boolean f191518c;

    /* renamed from: d */
    public boolean f191519d;

    public ciuy() {
        String valueOf = String.valueOf(civc.m151037a());
        Logging.m151178a("WebRtcAudioEffectsExternal", valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
    }

    /* renamed from: a */
    public static void m151033a(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    /* renamed from: b */
    public static boolean m151036b() {
        int i = Build.VERSION.SDK_INT;
        return m151035a(AudioEffect.EFFECT_TYPE_NS, f191514f);
    }

    /* renamed from: a */
    public static boolean m151034a() {
        int i = Build.VERSION.SDK_INT;
        return m151035a(AudioEffect.EFFECT_TYPE_AEC, f191513e);
    }

    /* renamed from: a */
    private static boolean m151035a(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] descriptorArr = f191515g;
        if (descriptorArr == null) {
            descriptorArr = AudioEffect.queryEffects();
            f191515g = descriptorArr;
        }
        if (descriptorArr != null) {
            int length = descriptorArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AudioEffect.Descriptor descriptor = descriptorArr[i];
                if (!descriptor.type.equals(uuid)) {
                    i++;
                } else if (!descriptor.uuid.equals(uuid2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
