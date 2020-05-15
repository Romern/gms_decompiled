package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bbcy */
final /* synthetic */ class bbcy implements bqeh {

    /* renamed from: a */
    private final bbda f102388a;

    public bbcy(bbda bbda) {
        this.f102388a = bbda;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102388a;
        List<bavt> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        try {
            for (bavt bavt : list) {
                arrayList.add(bbda.mo56076c(bavt));
            }
        } catch (Exception e) {
            bbda.f102392b.mo55999a("Failed to cancel all downloads during clear", e);
        }
        return bqga.m112782b(arrayList).mo69214a(new bbcm(bbda), bbda.f102401k);
    }
}
