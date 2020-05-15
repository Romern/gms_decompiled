package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Set;

/* renamed from: bmzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmzf {

    /* renamed from: a */
    final boolean[] f131259a = new boolean[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    final Set f131260b;

    public bmzf(Set set) {
        this.f131260b = set;
        int i = 0;
        while (true) {
            boolean[] zArr = this.f131259a;
            if (i < zArr.length) {
                zArr[i] = this.f131260b.contains(Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
