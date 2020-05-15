package p000;

import java.util.HashMap;

/* renamed from: bccn */
final /* synthetic */ class bccn implements bmxj {

    /* renamed from: a */
    static final bmxj f103957a = new bccn();

    private bccn() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            bcug a = bcug.m90014a(((Integer) hashMap.get("LINE_STYLE_TYPE")).intValue());
            bcul bcul = bcul.UNKNOWN;
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                return bmxv.m108566b(bcqk.f104677a);
            }
            if (ordinal == 1) {
                return bmxv.m108566b(bcqm.m89633a(((Integer) hashMap.get("INDENTATION")).intValue()));
            }
            if (ordinal != 2) {
                return bmvz.f131120a;
            }
            return bmxv.m108566b(bcqi.f104675a);
        } catch (Exception e) {
            bbos.m88294d("RichTextConverters", "failed to convert HashMap to LineStyle");
        }
    }
}
