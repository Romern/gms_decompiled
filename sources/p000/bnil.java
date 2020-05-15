package p000;

import java.util.Comparator;

/* renamed from: bnil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnil extends bnhd {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Comparator f131667a;

    public bnil(bnim bnim) {
        super(bnim);
        this.f131667a = bnim.comparator();
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return mo67699a(new bnik(this.f131667a));
    }
}
