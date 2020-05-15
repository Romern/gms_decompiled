package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: alqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alqo {

    /* renamed from: a */
    public final String f74104a;

    /* renamed from: b */
    public final String f74105b;

    /* renamed from: c */
    private final long f74106c = 0;

    /* renamed from: d */
    private final String f74107d = null;

    public alqo(String str, String str2) {
        this.f74104a = str;
        this.f74105b = str2;
    }

    /* renamed from: a */
    public final boolean mo40656a() {
        return !TextUtils.isEmpty(this.f74105b);
    }

    /* renamed from: b */
    public final boolean mo40657b() {
        return !TextUtils.isEmpty(this.f74104a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alqo) {
            alqo alqo = (alqo) obj;
            long j = alqo.f74106c;
            String str = alqo.f74107d;
            if (!TextUtils.equals(null, null) || !TextUtils.equals(this.f74104a, alqo.f74104a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f74104a});
    }
}
