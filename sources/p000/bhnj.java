package p000;

import java.lang.ref.WeakReference;

/* renamed from: bhnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhnj {

    /* renamed from: a */
    final WeakReference f119130a;

    /* renamed from: b */
    int f119131b;

    /* renamed from: c */
    boolean f119132c;

    public bhnj(int i, bhmt bhmt) {
        this.f119130a = new WeakReference(bhmt);
        this.f119131b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo64036a(bhmt bhmt) {
        return bhmt != null && this.f119130a.get() == bhmt;
    }
}
