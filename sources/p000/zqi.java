package p000;

import android.content.Context;

/* renamed from: zqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zqi extends zqj {

    /* renamed from: a */
    public final String f55696a;

    /* renamed from: a */
    public final String mo31324a(Context context) {
        return this.f55696a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zqi) {
            return this.f55696a.equals(((zqi) obj).f55696a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55696a.hashCode();
    }

    public final String toString() {
        return String.format("private[%s]", this.f55696a);
    }

    public zqi(String str) {
        this.f55696a = str;
    }
}
