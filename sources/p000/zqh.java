package p000;

import android.content.Context;

/* renamed from: zqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zqh extends zqj {

    /* renamed from: a */
    private final int f55695a;

    /* renamed from: a */
    public final String mo31324a(Context context) {
        return context.getResources().getString(this.f55695a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zqh) || this.f55695a != ((zqh) obj).f55695a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f55695a;
    }

    public final String toString() {
        return String.format("public[%s]", Integer.valueOf(this.f55695a));
    }

    public zqh(int i) {
        this.f55695a = i;
    }
}
