package p000;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.Arrays;

/* renamed from: hkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hkg {

    /* renamed from: a */
    private final String f19934a;

    /* renamed from: b */
    private final BeginSignInRequest f19935b;

    public hkg(String str, BeginSignInRequest beginSignInRequest) {
        sdo.m34977c(str);
        this.f19934a = str;
        sdo.m34959a(beginSignInRequest);
        this.f19935b = beginSignInRequest;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hkg) {
            hkg hkg = (hkg) obj;
            if (!bmxi.m108538a(this.f19934a, hkg.f19934a) || !bmxi.m108538a(this.f19935b, hkg.f19935b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19934a, this.f19935b});
    }
}
