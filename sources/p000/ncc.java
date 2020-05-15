package p000;

import java.security.MessageDigest;
import java.util.HashSet;

/* renamed from: ncc */
public final /* synthetic */ class ncc {

    /* renamed from: a */
    private final MessageDigest f35228a;

    /* renamed from: b */
    private final naz f35229b;

    /* renamed from: c */
    private final HashSet f35230c;

    /* renamed from: d */
    private final bngs f35231d;

    /* renamed from: e */
    private final nay f35232e;

    /* renamed from: f */
    private final bngs f35233f;

    public ncc(MessageDigest messageDigest, naz naz, HashSet hashSet, bngs bngs, nay nay, bngs bngs2) {
        this.f35228a = messageDigest;
        this.f35229b = naz;
        this.f35230c = hashSet;
        this.f35231d = bngs;
        this.f35232e = nay;
        this.f35233f = bngs2;
    }

    /* renamed from: a */
    public final void mo20449a(byte[] bArr) {
        MessageDigest messageDigest = this.f35228a;
        naz naz = this.f35229b;
        HashSet hashSet = this.f35230c;
        bngs bngs = this.f35231d;
        nay nay = this.f35232e;
        bngs bngs2 = this.f35233f;
        int i = ncd.f35234a;
        messageDigest.update(bArr);
        nbw a = naz.mo20425a(bArr);
        if (!hashSet.contains(a)) {
            bngs.mo67668c(nay.mo20424a(a, bArr));
            hashSet.add(a);
        }
        bngs2.mo67668c(a);
    }
}
