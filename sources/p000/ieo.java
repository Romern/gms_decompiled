package p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: ieo */
public final /* synthetic */ class ieo implements bmxj {

    /* renamed from: a */
    private final String f20812a;

    /* renamed from: b */
    private final String f20813b;

    /* renamed from: c */
    private final String f20814c;

    /* renamed from: d */
    private final ieu f20815d;

    public ieo(String str, String str2, String str3, ieu ieu) {
        this.f20812a = str;
        this.f20813b = str2;
        this.f20814c = str3;
        this.f20815d = ieu;
    }

    public final Object apply(Object obj) {
        String str = this.f20812a;
        String str2 = this.f20813b;
        String str3 = this.f20814c;
        ieu ieu = this.f20815d;
        iew iew = (iew) obj;
        imn imn = ieq.f20816a;
        iey iey = iey.f20835b;
        str.getClass();
        bxww bxww = iew.f20833a;
        if (bxww.containsKey(str)) {
            iey = (iey) bxww.get(str);
        }
        bxvd bxvd = (bxvd) iey.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) iey);
        ifb ifb = ifb.f20840b;
        str2.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((iey) bxvd.f164949b).f20837a);
        if (unmodifiableMap.containsKey(str2)) {
            ifb = (ifb) unmodifiableMap.get(str2);
        }
        bxvd bxvd2 = (bxvd) ifb.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) ifb);
        str3.getClass();
        ieu.getClass();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ifb ifb2 = (ifb) bxvd2.f164949b;
        bxww bxww2 = ifb2.f20842a;
        if (!bxww2.f165014a) {
            ifb2.f20842a = bxww2.mo74203a();
        }
        ifb2.f20842a.put(str3, ieu);
        ifb ifb3 = (ifb) bxvd2.mo74062i();
        str2.getClass();
        ifb3.getClass();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        iey iey2 = (iey) bxvd.f164949b;
        bxww bxww3 = iey2.f20837a;
        if (!bxww3.f165014a) {
            iey2.f20837a = bxww3.mo74203a();
        }
        iey2.f20837a.put(str2, ifb3);
        bxvd bxvd3 = (bxvd) iew.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) iew);
        iey iey3 = (iey) bxvd.mo74062i();
        str.getClass();
        iey3.getClass();
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        iew iew2 = (iew) bxvd3.f164949b;
        iew iew3 = iew.f20831b;
        bxww bxww4 = iew2.f20833a;
        if (!bxww4.f165014a) {
            iew2.f20833a = bxww4.mo74203a();
        }
        iew2.f20833a.put(str, iey3);
        return (iew) bxvd3.mo74062i();
    }
}
