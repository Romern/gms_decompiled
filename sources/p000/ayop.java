package p000;

import javax.crypto.KeyAgreement;

/* renamed from: ayop */
final /* synthetic */ class ayop implements ayor {

    /* renamed from: a */
    static final ayor f98126a = new ayop();

    private ayop() {
    }

    /* renamed from: a */
    public final Object mo54170a(String str) {
        int i = ayos.f98128c;
        return KeyAgreement.getInstance("ECDH", str);
    }
}
