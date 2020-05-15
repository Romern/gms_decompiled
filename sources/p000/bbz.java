package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbz implements bbo {

    /* renamed from: a */
    public final String f2908a;

    /* renamed from: b */
    public final List f2909b;

    /* renamed from: c */
    public final boolean f2910c;

    public bbz(String str, List list, boolean z) {
        this.f2908a = str;
        this.f2909b = list;
        this.f2910c = z;
    }

    /* renamed from: a */
    public final azg mo2977a(ayo ayo, bcg bcg) {
        return new azh(ayo, bcg, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f2908a + "' Shapes: " + Arrays.toString(this.f2909b.toArray()) + '}';
    }
}
