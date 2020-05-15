package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bccp */
final /* synthetic */ class bccp implements bmxj {

    /* renamed from: a */
    static final bmxj f103959a = new bccp();

    private bccp() {
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            bcul a = bcul.m90038a(((Integer) hashMap.get("TEXT_STYLE_TYPE")).intValue());
            bcug bcug = bcug.UNKNOWN;
            switch (a.ordinal()) {
                case 0:
                    return bmxv.m108566b(bcuj.m90017n());
                case 1:
                    return bmxv.m108566b(bcuj.m90018o());
                case 2:
                    return bmxv.m108566b(bcuj.m90019p());
                case 3:
                    return bmxv.m108566b(bcuj.m90020q());
                case 4:
                    return bmxv.m108566b(bcuj.m90021r());
                case 5:
                    return bmxv.m108566b(bcuj.m90022s());
                case 6:
                    return bmxv.m108566b(bcuj.m90023t());
                case 7:
                    return bmxv.m108566b(bcra.m89670a(((Integer) hashMap.get("COLOR")).intValue()));
                case 8:
                    return bmxv.m108566b(bcra.m89672b(((Integer) hashMap.get("BACKGROUND_COLOR")).intValue()));
                case 9:
                    return bmxv.m108566b(bcra.m89673c(((Integer) hashMap.get("SIZE")).intValue()));
                case 10:
                    return bmxv.m108566b(bcra.m89671a(bbow.m88301a((ArrayList) hashMap.get("TYPEFACE_LIST"), bccq.f103960a)));
                case 11:
                    return bmxv.m108566b(bcra.m89674d(((Integer) hashMap.get("HORIZONTAL_ALIGNMENT")).intValue()));
            }
        } catch (Exception e) {
            bbos.m88294d("RichTextConverters", "failed to convert HashMap to TextStyle");
        }
        return bmvz.f131120a;
    }
}
