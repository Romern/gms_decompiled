package p000;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aopp */
final /* synthetic */ class aopp implements bqeh {

    /* renamed from: a */
    private final aopu f78657a;

    /* renamed from: b */
    private final String f78658b;

    /* renamed from: c */
    private final String f78659c;

    /* renamed from: d */
    private final AtomicReference f78660d;

    public aopp(aopu aopu, String str, String str2, AtomicReference atomicReference) {
        this.f78657a = aopu;
        this.f78658b = str;
        this.f78659c = str2;
        this.f78660d = atomicReference;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        aopu aopu = this.f78657a;
        String str = this.f78658b;
        String str2 = this.f78659c;
        AtomicReference atomicReference = this.f78660d;
        aorw aorw = (aorw) obj;
        String b = aopu.m66279b(str, str2);
        b.getClass();
        aorx aorx = null;
        if (aorw.f78744a.containsKey(b)) {
            b.getClass();
            bxww bxww = aorw.f78744a;
            if (bxww.containsKey(b)) {
                bxyk bxyk = ((aorx) bxww.get(b)).f78748b;
                if (bxyk == null) {
                    bxyk = bxyk.f165095c;
                }
                if (bxzt.m124579a(bxyk, aopu.f78669a.mo43193a()).f164863a <= cghx.f186975a.mo6606a().mo83824d()) {
                    aorx = (aorx) Collections.unmodifiableMap(aorw.f78744a).get(b);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (aorx == null) {
            return bqdx.m112673a(bqdx.m112673a(snp.m35702a(9).mo25819b(new aopr(str, str2)), new aops(aopu), bqfb.INSTANCE), bljx.m107264a(new aopt(atomicReference, aorw, str, str2)), bqfb.INSTANCE);
        }
        atomicReference.set(aorx);
        return bqga.m112775a(aorw);
    }
}
