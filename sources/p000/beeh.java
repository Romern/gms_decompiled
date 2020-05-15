package p000;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: beeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beeh {

    /* renamed from: a */
    public static final Set f107027a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static final int f107028b = -1;

    /* renamed from: a */
    static void m91848a(beef beef) {
        if (beel.m91854a()) {
            f107027a.add(beef);
            if (f107028b != -1) {
                beef.mo58598b();
                return;
            }
            return;
        }
        beel.m91852a(new beeg(beef));
    }
}
