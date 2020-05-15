package p000;

import com.android.volley.AuthFailureError;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.IOException;

/* renamed from: atki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class atki extends atkk {

    /* renamed from: b */
    protected final SafeParcelable f90410b;

    public atki(String str, SafeParcelable safeParcelable, String str2, aswm aswm) {
        super(str, str2, aswm);
        this.f90410b = safeParcelable;
    }

    /* renamed from: a */
    protected static final void m76116a(IOException iOException) {
        if (iOException.getCause() instanceof AuthFailureError) {
            throw new aaaj(4, "Auth error", null, iOException);
        }
        throw new RuntimeException(iOException);
    }
}
