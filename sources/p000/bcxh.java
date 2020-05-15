package p000;

import java.util.HashMap;

/* renamed from: bcxh */
public final /* synthetic */ class bcxh implements bmxj {

    /* renamed from: a */
    public static final bmxj f105100a = new bcxh();

    private bcxh() {
    }

    public final Object apply(Object obj) {
        bczy bczy = (bczy) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("TYPE", bczy.mo57657b());
        bczv bczv = bczv.STACK_COMPONENT;
        int ordinal = bczy.mo57657b().ordinal();
        if (ordinal == 0) {
            bczx a = bczy.mo57656a();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ELEMENTS", bbow.m88302b(a.mo57754a(), bcxj.f105101a));
            hashMap.put("STACK_COMPONENT", hashMap2);
        } else if (ordinal == 1) {
            hashMap.put("UI_ELEMENT", bcxl.m90210a(bczy.mo57661c()));
        }
        return hashMap;
    }
}
