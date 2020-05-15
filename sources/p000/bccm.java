package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bccm */
final /* synthetic */ class bccm implements bmxj {

    /* renamed from: a */
    static final bmxj f103956a = new bccm();

    private bccm() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            bcua f = bcub.m89996f();
            f.mo57562a((String) hashMap.get("RAW_TEXT"));
            if (hashMap.containsKey("PREDEFINED_STYLE")) {
                f.mo57560a(bcui.m90016a(((Integer) hashMap.get("PREDEFINED_STYLE")).intValue()));
            }
            if (hashMap.containsKey("LINE_STYLES")) {
                bngx c = bbow.m88303c((ArrayList) hashMap.get("LINE_STYLES"), bccn.f103957a);
                if (!c.isEmpty()) {
                    f.mo57563b(c);
                }
            }
            if (hashMap.containsKey("FORMATTED_TEXT_SPANS")) {
                bngx c2 = bbow.m88303c((ArrayList) hashMap.get("FORMATTED_TEXT_SPANS"), bcco.f103958a);
                if (!c2.isEmpty()) {
                    f.mo57561a(c2);
                }
            }
            return bmxv.m108566b(f.mo57559a());
        } catch (Exception e) {
            bbos.m88292b("RichTextConverters", "failed to convert HashMap to FormattedLine", e);
            return bmvz.f131120a;
        }
    }
}
