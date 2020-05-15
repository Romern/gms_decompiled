package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: apag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apag {

    /* renamed from: a */
    public final Set f83990a;

    /* renamed from: b */
    public final Long f83991b;

    /* renamed from: c */
    public final Long f83992c;

    /* renamed from: d */
    public final boolean f83993d;

    public apag(Long l, Long l2) {
        this(l, l2, 0);
    }

    /* renamed from: a */
    public final void mo47054a(Long l) {
        this.f83990a.add(l);
    }

    public apag(Long l, Long l2, int i) {
        this.f83990a = new LinkedHashSet();
        this.f83991b = l;
        this.f83992c = l2;
        this.f83993d = i != 1 ? false : true;
    }
}
