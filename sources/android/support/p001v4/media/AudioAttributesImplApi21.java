package android.support.p001v4.media;

import android.media.AudioAttributes;

/* renamed from: android.support.v4.media.AudioAttributesImplApi21 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f1041a;

    /* renamed from: b */
    public int f1042b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1041a.equals(((AudioAttributesImplApi21) obj).f1041a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1041a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1041a;
    }
}
