package p000;

import android.util.LruCache;

/* renamed from: bfbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfbt extends LruCache {

    /* renamed from: a */
    final /* synthetic */ bfbv f113341a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfbt(bfbv bfbv, int i) {
        super(i);
        this.f113341a = bfbv;
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        bnzb bnzb = (bnzb) obj;
        Integer num = (Integer) obj2;
        if (((Integer) obj3) == null) {
            bfbv bfbv = this.f113341a;
            int intValue = num.intValue();
            String str = bfbv.f113342a;
            bfbv.mo61374a(bnzb, (long) intValue);
        }
    }
}
