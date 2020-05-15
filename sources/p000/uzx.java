package p000;

import java.util.Locale;

/* renamed from: uzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uzx {

    /* renamed from: c */
    public final uzz f48787c;

    protected uzx(uzz uzz) {
        sdo.m34959a(uzz);
        this.f48787c = uzz;
    }

    /* renamed from: a */
    public abstract String mo28138a();

    public final String toString() {
        return String.format(Locale.US, "Feed[%s:%s]", this.f48787c, mo28138a());
    }
}
