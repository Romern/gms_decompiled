package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bcco */
final /* synthetic */ class bcco implements bmxj {

    /* renamed from: a */
    static final bmxj f103958a = new bcco();

    private bcco() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            bcuc e = bcud.m90006e();
            e.mo57567b(((Integer) hashMap.get("START_INDEX")).intValue());
            e.mo57565a(((Integer) hashMap.get("END_INDEX")).intValue());
            bngx c = bbow.m88303c((ArrayList) hashMap.get("TEXT_STYLES"), bccp.f103959a);
            if (c.isEmpty()) {
                return bmvz.f131120a;
            }
            e.mo57566a(c);
            return bmxv.m108566b(e.mo57564a());
        } catch (Exception e2) {
            bbos.m88294d("RichTextConverters", "failed to convert HashMap to FormattedTextSpan");
            return bmvz.f131120a;
        }
    }
}
