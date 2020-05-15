package androidx.media;

import android.support.p001v4.media.AudioAttributesImplBase;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(avb avb) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1043a = avb.mo2686b(audioAttributesImplBase.f1043a, 1);
        audioAttributesImplBase.f1044b = avb.mo2686b(audioAttributesImplBase.f1044b, 2);
        audioAttributesImplBase.f1045c = avb.mo2686b(audioAttributesImplBase.f1045c, 3);
        audioAttributesImplBase.f1046d = avb.mo2686b(audioAttributesImplBase.f1046d, 4);
        return audioAttributesImplBase;
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
    public static void write(AudioAttributesImplBase audioAttributesImplBase, avb avb) {
        avb.mo2682a(false, false);
        avb.mo2669a(audioAttributesImplBase.f1043a, 1);
        avb.mo2669a(audioAttributesImplBase.f1044b, 2);
        avb.mo2669a(audioAttributesImplBase.f1045c, 3);
        avb.mo2669a(audioAttributesImplBase.f1046d, 4);
    }
}
