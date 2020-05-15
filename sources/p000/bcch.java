package p000;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: bcch */
final /* synthetic */ class bcch implements bmxj {

    /* renamed from: a */
    static final bmxj f103951a = new bcch();

    private bcch() {
    }

    public final Object apply(Object obj) {
        bcub bcub = (bcub) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("RAW_TEXT", bcub.mo57038a());
        if (bcub.mo57039b().mo66813a()) {
            hashMap.put("PREDEFINED_STYLE", Integer.valueOf(((bcui) bcub.mo57039b().mo66814b()).f104926g));
        }
        if (bcub.mo57040c().mo66813a()) {
            hashMap.put("LINE_STYLES", bbow.m88302b((Collection) bcub.mo57040c().mo66814b(), bcci.f103952a));
        }
        if (bcub.mo57041d().mo66813a()) {
            hashMap.put("FORMATTED_TEXT_SPANS", bbow.m88302b((Collection) bcub.mo57041d().mo66814b(), bccj.f103953a));
        }
        return hashMap;
    }
}
