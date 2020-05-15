package p000;

import java.util.Locale;

/* renamed from: bjwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwj {

    /* renamed from: a */
    public final bmne f123509a;

    /* renamed from: b */
    private final int f123510b;

    public bjwj(bmne bmne, int i) {
        this.f123509a = bmne;
        this.f123510b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bjwj) {
            bjwj bjwj = (bjwj) obj;
            return this.f123510b == bjwj.f123510b && bjwl.m104787a(this.f123509a, bjwj.f123509a);
        }
    }

    public final int hashCode() {
        int hashCode = (Integer.valueOf(this.f123510b).hashCode() * 29) + (bqcr.m112590a(this.f123509a.f130093c) * 31);
        int a = bmna.m108191a(this.f123509a.f130094d);
        if (a == 0) {
            a = 1;
        }
        int i = hashCode + ((a - 1) * 37);
        bmmw c = bjwl.m104792c(this.f123509a);
        if (c == null) {
            return i + 41;
        }
        if (c.f130062a.size() != 0) {
            return i + c.f130062a.hashCode();
        }
        if (!c.f130063b.isEmpty()) {
            return i + c.f130063b.hashCode();
        }
        throw new IllegalArgumentException(String.format(Locale.US, "TriggerValueReference for component %d does not have a known value for newValue component value", Long.valueOf(this.f123509a.f130093c)));
    }
}
