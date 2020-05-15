package p000;

import java.util.HashMap;

/* renamed from: bcck */
final /* synthetic */ class bcck implements bmxj {

    /* renamed from: a */
    static final bmxj f103954a = new bcck();

    private bcck() {
    }

    public final Object apply(Object obj) {
        bcuj bcuj = (bcuj) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("TEXT_STYLE_TYPE", Integer.valueOf(bcuj.mo57226b().f104941m));
        if (bcuj.mo57226b() == bcul.COLOR) {
            hashMap.put("COLOR", Integer.valueOf(bcuj.mo57234d()));
        }
        if (bcuj.mo57226b() == bcul.BACKGROUND_COLOR) {
            hashMap.put("BACKGROUND_COLOR", Integer.valueOf(bcuj.mo57225a()));
        }
        if (bcuj.mo57226b() == bcul.SIZE) {
            hashMap.put("SIZE", Integer.valueOf(bcuj.mo57247g()));
        }
        if (bcuj.mo57226b() == bcul.TYPEFACE_LIST) {
            hashMap.put("TYPEFACE_LIST", bbow.m88302b(bcuj.mo57264k(), bccl.f103955a));
        }
        if (bcuj.mo57226b() == bcul.HORIZONTAL_ALIGNMENT) {
            hashMap.put("HORIZONTAL_ALIGNMENT", Integer.valueOf(bcuj.mo57238e()));
        }
        return hashMap;
    }
}
