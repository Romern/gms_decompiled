package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: aozm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aozm {

    /* renamed from: a */
    public final String f83945a;

    /* renamed from: b */
    public final String f83946b;

    /* renamed from: c */
    private final long f83947c = 0;

    /* renamed from: d */
    private final String f83948d = null;

    public aozm(String str, String str2) {
        this.f83945a = str;
        this.f83946b = str2;
    }

    /* renamed from: a */
    public final boolean mo47036a() {
        return !TextUtils.isEmpty(this.f83946b);
    }

    /* renamed from: b */
    public final boolean mo47037b() {
        return !TextUtils.isEmpty(this.f83945a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aozm) {
            aozm aozm = (aozm) obj;
            long j = aozm.f83947c;
            String str = aozm.f83948d;
            if (!TextUtils.equals(null, null) || !TextUtils.equals(this.f83945a, aozm.f83945a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f83945a});
    }
}
