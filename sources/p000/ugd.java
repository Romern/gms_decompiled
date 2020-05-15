package p000;

import android.util.LruCache;

/* renamed from: ugd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ugd extends LruCache {
    public ugd(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ukk ukk = (ukk) obj;
        uge uge = (uge) obj2;
        uge uge2 = (uge) obj3;
        if (uge != null) {
            uge.f47511a.mo27297c();
        }
    }
}
