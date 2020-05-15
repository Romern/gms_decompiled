package p000;

import java.util.HashMap;

/* renamed from: bccj */
final /* synthetic */ class bccj implements bmxj {

    /* renamed from: a */
    static final bmxj f103953a = new bccj();

    private bccj() {
    }

    public final Object apply(Object obj) {
        bcud bcud = (bcud) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("START_INDEX", Integer.valueOf(bcud.mo57045a()));
        hashMap.put("END_INDEX", Integer.valueOf(bcud.mo57046b()));
        hashMap.put("TEXT_STYLES", bbow.m88302b(bcud.mo57047c(), bcck.f103954a));
        return hashMap;
    }
}
