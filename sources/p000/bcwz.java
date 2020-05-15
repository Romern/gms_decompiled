package p000;

import java.util.HashMap;

/* renamed from: bcwz */
final /* synthetic */ class bcwz implements bmxj {

    /* renamed from: a */
    static final bmxj f105092a = new bcwz();

    private bcwz() {
    }

    public final Object apply(Object obj) {
        bczn bczn = (bczn) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("TEXT", bczn.mo57729a());
        bbot.m88296a(bczn.mo57730b(), new bcxa(hashMap));
        hashMap.put("ACTION", bcbk.m88754a(bczn.mo57731c()));
        hashMap.put("TEXT_COLOR", Integer.valueOf(bczn.mo57732d()));
        hashMap.put("BACKGROUND_COLOR", Integer.valueOf(bczn.mo57733e()));
        hashMap.put("BORDER_COLOR", Integer.valueOf(bczn.mo57735f()));
        hashMap.put("ENABLED", Boolean.valueOf(bczn.mo57736g()));
        return hashMap;
    }
}
