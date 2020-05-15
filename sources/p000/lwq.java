package p000;

import javax.crypto.SecretKey;

/* renamed from: lwq */
final /* synthetic */ class lwq implements bmxj {

    /* renamed from: a */
    private final String f33125a;

    public lwq(String str) {
        this.f33125a = str;
    }

    public final Object apply(Object obj) {
        return new lwp(this.f33125a, (SecretKey) obj);
    }
}
