package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: qty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qty {

    /* renamed from: a */
    public final String f42132a;

    /* renamed from: b */
    public final Object f42133b;

    protected qty(String str, Object obj) {
        sdo.m34977c(str);
        this.f42132a = str;
        this.f42133b = obj;
    }

    /* renamed from: a */
    public abstract bmxv mo24278a(Object obj);

    /* renamed from: a */
    public abstract Object mo24279a(byte[] bArr);

    public final boolean equals(Object obj) {
        if (obj instanceof qty) {
            qty qty = (qty) obj;
            return TextUtils.equals(this.f42132a, qty.f42132a) && sdg.m34949a(this.f42133b, qty.f42133b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42132a, this.f42133b});
    }
}
