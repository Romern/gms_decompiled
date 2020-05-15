package p000;

import java.time.DateTimeException;
import java.time.YearMonth;

/* renamed from: kgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kgv {
    /* renamed from: a */
    public static YearMonth m17827a(qus qus) {
        int i = qus.f42189a;
        if (!((i & 32) == 0 || (i & 64) == 0)) {
            try {
                return YearMonth.of(qus.f42195g, qus.f42194f);
            } catch (DateTimeException e) {
            }
        }
        return null;
    }
}
