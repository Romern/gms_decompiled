package android.support.p001v4.media;

import java.util.Arrays;

/* renamed from: android.support.v4.media.AudioAttributesImplBase */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f1043a = 0;

    /* renamed from: b */
    public int f1044b = 0;

    /* renamed from: c */
    public int f1045c = 0;

    /* renamed from: d */
    public int f1046d = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            if (this.f1044b == audioAttributesImplBase.f1044b) {
                int i = this.f1045c;
                int i2 = audioAttributesImplBase.f1045c;
                int i3 = audioAttributesImplBase.f1046d;
                if (i3 == -1) {
                    i3 = AudioAttributesCompat.m1189a(i2, audioAttributesImplBase.f1043a);
                }
                if (i3 == 6) {
                    i2 |= 4;
                } else if (i3 == 7) {
                    i2 |= 1;
                }
                if (i == (i2 & 273) && this.f1043a == audioAttributesImplBase.f1043a && this.f1046d == audioAttributesImplBase.f1046d) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1044b), Integer.valueOf(this.f1045c), Integer.valueOf(this.f1043a), Integer.valueOf(this.f1046d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1046d != -1) {
            sb.append(" stream=");
            sb.append(this.f1046d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m1190a(this.f1043a));
        sb.append(" content=");
        sb.append(this.f1044b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1045c).toUpperCase());
        return sb.toString();
    }
}
