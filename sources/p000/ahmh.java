package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ahmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahmh {

    /* renamed from: a */
    public final Map f67526a = new C1223np();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo36829a(String str) {
        int i = 1;
        for (ahmg ahmg : mo36830b(str)) {
            int i2 = ahmg.f67525f;
            if (i2 != 1 && (i == 1 || i2 < i)) {
                i = i2;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo36830b(String str) {
        if (!this.f67526a.containsKey(str)) {
            return new ArrayList();
        }
        return (List) this.f67526a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo36831c(String str) {
        return !mo36830b(str).isEmpty();
    }
}
