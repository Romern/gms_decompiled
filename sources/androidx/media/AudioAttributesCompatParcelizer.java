package androidx.media;

import android.support.p001v4.media.AudioAttributesCompat;
import android.support.p001v4.media.AudioAttributesImpl;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(avb avb) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f1040a = (AudioAttributesImpl) avb.mo2688b(audioAttributesCompat.f1040a, 1);
        return audioAttributesCompat;
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
    public static void write(AudioAttributesCompat audioAttributesCompat, avb avb) {
        avb.mo2682a(false, false);
        avb.mo2675a(audioAttributesCompat.f1040a, 1);
    }
}
