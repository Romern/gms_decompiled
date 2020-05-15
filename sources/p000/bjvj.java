package p000;

import java.util.Locale;

/* renamed from: bjvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjvj {

    /* renamed from: a */
    public final Locale f123384a;

    /* renamed from: b */
    private final String f123385b;

    public bjvj(Locale locale, String str) {
        this.f123384a = locale;
        this.f123385b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bjvj bjvj = (bjvj) obj;
            return bmxi.m108538a(this.f123385b, bjvj.f123385b) && bmxi.m108538a(this.f123384a, bjvj.f123384a);
        }
    }

    public final int hashCode() {
        int i;
        String str = this.f123385b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (((i + 31) * 31) + 1231) * 31;
        Locale locale = this.f123384a;
        if (locale != null) {
            i2 = locale.hashCode();
        }
        return (((i3 + i2) * 31) + 1231) * 31;
    }
}
