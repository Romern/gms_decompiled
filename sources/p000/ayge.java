package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.List;

/* renamed from: ayge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayge {
    /* renamed from: a */
    public static final boolean m83955a() {
        aydn c = ayha.m83997c();
        Boolean bool = c.f97229j;
        if (bool != null) {
            return bool.booleanValue();
        }
        List a = c.f97221b.mo53980a();
        if (a.size() != 1) {
            return false;
        }
        c.f97229j = Boolean.valueOf(((ConnectionConfiguration) a.get(0)).mo60245a());
        return c.f97229j.booleanValue();
    }
}
