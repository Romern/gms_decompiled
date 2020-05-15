package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: ayye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayye implements ayyd {

    /* renamed from: a */
    public final List f98732a;

    /* renamed from: b */
    public final int f98733b;

    /* renamed from: c */
    private final int f98734c;

    public ayye(int i, List list, int i2) {
        this.f98733b = i;
        this.f98732a = Collections.unmodifiableList(list);
        this.f98734c = i2;
        boolean z = true;
        if (i != 3) {
            bmxy.m108588a(i2 == -1 ? false : z);
        } else {
            bmxy.m108588a(i2 != -1 ? false : z);
        }
    }

    /* renamed from: a */
    public final List mo54525a() {
        return this.f98732a;
    }

    /* renamed from: b */
    public final aywu mo54526b() {
        return ayyc.m85065b(this);
    }

    /* renamed from: c */
    public final int mo54527c() {
        int i = this.f98733b;
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        bmxy.m108600b(z);
        return this.f98734c;
    }
}
