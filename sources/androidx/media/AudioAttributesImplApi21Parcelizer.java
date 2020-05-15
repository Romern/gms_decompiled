package androidx.media;

import android.media.AudioAttributes;
import android.support.p001v4.media.AudioAttributesImplApi21;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(avb avb) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1041a = (AudioAttributes) avb.mo2687b(audioAttributesImplApi21.f1041a, 1);
        audioAttributesImplApi21.f1042b = avb.mo2686b(audioAttributesImplApi21.f1042b, 2);
        return audioAttributesImplApi21;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      avb.a(int, int):void
      avb.a(android.os.Parcelable, int):void
      avb.a(avg, int):void
      avb.a(java.lang.CharSequence, int):void
      avb.a(java.lang.String, int):void
      avb.a(boolean, int):void
      avb.a(java.lang.Object[], int):void
      avb.a(boolean, boolean):void */
    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, avb avb) {
        avb.mo2682a(false, false);
        avb.mo2673a(audioAttributesImplApi21.f1041a, 1);
        avb.mo2669a(audioAttributesImplApi21.f1042b, 2);
    }
}
