package p000;

import com.google.android.gms.audiomodem.Encoding;
import java.util.Arrays;

/* renamed from: gek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gek {

    /* renamed from: a */
    public final gcw f18046a;

    /* renamed from: b */
    public final Encoding f18047b;

    public gek(gcw gcw, Encoding encoding) {
        this.f18046a = gcw;
        this.f18047b = encoding;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof gek)) {
            gek gek = (gek) obj;
            if (!sdg.m34949a(this.f18046a, gek.f18046a) || !sdg.m34949a(this.f18047b, gek.f18047b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18046a, this.f18047b});
    }
}
