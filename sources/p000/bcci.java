package p000;

import java.util.HashMap;

/* renamed from: bcci */
final /* synthetic */ class bcci implements bmxj {

    /* renamed from: a */
    static final bmxj f103952a = new bcci();

    private bcci() {
    }

    public final Object apply(Object obj) {
        bcue bcue = (bcue) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("LINE_STYLE_TYPE", Integer.valueOf(bcue.mo57214a().f104917d));
        if (bcue.mo57214a() == bcug.INDENTATION) {
            hashMap.put("INDENTATION", Integer.valueOf(bcue.mo57218b()));
        }
        return hashMap;
    }
}
