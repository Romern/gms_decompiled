package p000;

import android.util.LruCache;

/* renamed from: aabf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aabf extends LruCache {
    public aabf(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String nameForUid;
        Integer num = (Integer) obj;
        rpr b = rpr.m34216b();
        if (b == null || (nameForUid = b.getPackageManager().getNameForUid(num.intValue())) == null) {
            return null;
        }
        bxvd da = zzp.f56314g.mo74144da();
        if (rfz.m33557a(b).mo24608b(num.intValue())) {
            String a = aabg.m21049a(nameForUid);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            zzp zzp = (zzp) da.f164949b;
            a.getClass();
            int i = zzp.f56316a | 1;
            zzp.f56316a = i;
            zzp.f56317b = a;
            zzp.f56321f = 2;
            zzp.f56316a = i | 16;
            return (zzp) da.mo74062i();
        } else if (num.intValue() == spn.f44932a) {
            return aabg.f27881c;
        } else {
            return aabg.f27880b;
        }
    }
}
