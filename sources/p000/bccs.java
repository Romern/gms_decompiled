package p000;

import java.util.HashMap;

/* renamed from: bccs */
final /* synthetic */ class bccs implements bmxj {

    /* renamed from: a */
    static final bmxj f103961a = new bccs();

    private bccs() {
    }

    public final Object apply(Object obj) {
        bcus bcus = (bcus) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("ID", Integer.valueOf(bcus.mo57408a()));
        hashMap.put("TEXT", bcus.mo57409b());
        hashMap.put("SECONDARY_TEXT", bcus.mo57412e());
        bbot.m88296a(bcus.mo57410c(), new bccu(hashMap));
        hashMap.put("ACTION", bcbk.m88754a(bcus.mo57411d()));
        return hashMap;
    }
}
