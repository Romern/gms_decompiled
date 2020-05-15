package p000;

import com.google.android.gms.audiomodem.Encoding;
import java.util.Arrays;

/* renamed from: gel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gel {

    /* renamed from: a */
    public final gcx f18048a;

    /* renamed from: b */
    public final Encoding f18049b;

    public gel(gcx gcx, Encoding encoding) {
        this.f18048a = gcx;
        this.f18049b = encoding;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof gel)) {
            gel gel = (gel) obj;
            if (!sdg.m34949a(this.f18048a, gel.f18048a) || !sdg.m34949a(this.f18049b, gel.f18049b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18048a, this.f18049b});
    }
}
