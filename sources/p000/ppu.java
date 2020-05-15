package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ppu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ppu {

    /* renamed from: a */
    public final String f40040a;

    /* renamed from: b */
    public final String f40041b;

    public ppu(String str, String str2) {
        this.f40040a = str;
        this.f40041b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppu) {
            ppu ppu = (ppu) obj;
            return TextUtils.equals(this.f40040a, ppu.f40040a) && TextUtils.equals(this.f40041b, ppu.f40041b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40040a, this.f40041b});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "GaiaDeviceLink { gaiaAccountName=%s, cloudDeviceId=%s }", this.f40040a, this.f40041b);
    }
}
