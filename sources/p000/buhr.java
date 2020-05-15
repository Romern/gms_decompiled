package p000;

import java.util.Locale;

/* renamed from: buhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhr {

    /* renamed from: a */
    public final int f153881a;

    /* renamed from: b */
    public final int f153882b;

    public buhr(int i, int i2) {
        this.f153881a = i;
        this.f153882b = i2;
    }

    public final String toString() {
        return String.format(Locale.US, "Type=%d(0x%X), Version=%d(0x%X)", Integer.valueOf(this.f153881a), Integer.valueOf(this.f153881a), Integer.valueOf(this.f153882b), Integer.valueOf(this.f153882b));
    }
}
