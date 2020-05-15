package androidx.media;

import android.media.AudioAttributes;
import android.support.p001v4.media.AudioAttributesImplApi26;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(avb avb) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1041a = (AudioAttributes) avb.mo2687b(audioAttributesImplApi26.f1041a, 1);
        audioAttributesImplApi26.f1042b = avb.mo2686b(audioAttributesImplApi26.f1042b, 2);
        return audioAttributesImplApi26;
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
    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, avb avb) {
        avb.mo2682a(false, false);
        avb.mo2673a(audioAttributesImplApi26.f1041a, 1);
        avb.mo2669a(audioAttributesImplApi26.f1042b, 2);
    }
}
