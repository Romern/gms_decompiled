package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aopt */
final /* synthetic */ class aopt implements bmxj {

    /* renamed from: a */
    private final AtomicReference f78665a;

    /* renamed from: b */
    private final aorw f78666b;

    /* renamed from: c */
    private final String f78667c;

    /* renamed from: d */
    private final String f78668d;

    public aopt(AtomicReference atomicReference, aorw aorw, String str, String str2) {
        this.f78665a = atomicReference;
        this.f78666b = aorw;
        this.f78667c = str;
        this.f78668d = str2;
    }

    public final Object apply(Object obj) {
        AtomicReference atomicReference = this.f78665a;
        aorw aorw = this.f78666b;
        String str = this.f78667c;
        String str2 = this.f78668d;
        aorx aorx = (aorx) obj;
        atomicReference.set(aorx);
        bxvd bxvd = (bxvd) aorw.mo74142c(5);
        bxvd.mo73625a((bxvk) aorw);
        String b = aopu.m66279b(str, str2);
        b.getClass();
        aorx.getClass();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aorw aorw2 = (aorw) bxvd.f164949b;
        aorw aorw3 = aorw.f78742b;
        bxww bxww = aorw2.f78744a;
        if (!bxww.f165014a) {
            aorw2.f78744a = bxww.mo74203a();
        }
        aorw2.f78744a.put(b, aorx);
        return (aorw) bxvd.mo74062i();
    }
}
