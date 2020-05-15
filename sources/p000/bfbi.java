package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bfbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbi {

    /* renamed from: a */
    public final Map f113305a = new HashMap();

    /* renamed from: a */
    public static int m96300a(int i, int i2) {
        boolean z = false;
        if (i < 1000 && i2 < 10000) {
            z = true;
        }
        bmxy.m108588a(z);
        return i2 + (i * 10000);
    }

    /* renamed from: a */
    public final int mo61362a() {
        return this.f113305a.size();
    }
}
