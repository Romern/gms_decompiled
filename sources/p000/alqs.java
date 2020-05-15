package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: alqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alqs {

    /* renamed from: a */
    public final Set f74115a;

    /* renamed from: b */
    public final Long f74116b;

    /* renamed from: c */
    public final Long f74117c;

    /* renamed from: d */
    public final boolean f74118d;

    public alqs(Long l, Long l2) {
        this(l, l2, 0);
    }

    /* renamed from: a */
    public final void mo40661a(Long l) {
        this.f74115a.add(l);
    }

    public alqs(Long l, Long l2, int i) {
        this.f74115a = new LinkedHashSet();
        this.f74116b = l;
        this.f74117c = l2;
        this.f74118d = i != 1 ? false : true;
    }
}
