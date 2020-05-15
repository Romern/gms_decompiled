package p000;

import com.google.android.gms.audiomodem.DecodedToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aizg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aizg extends buqn {

    /* renamed from: a */
    final /* synthetic */ List f70132a;

    /* renamed from: b */
    final /* synthetic */ aizh f70133b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aizg(aizh aizh, String str, List list) {
        super(str);
        this.f70133b = aizh;
        this.f70132a = list;
    }

    public final void run() {
        aizl aizl = this.f70133b.f70134a.f70142h;
        if (aizl != null) {
            List list = this.f70132a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ahfv ahfv = new ahfv(((DecodedToken) list.get(i2)).f9857a);
                aizm aizm = aizl.f70154a;
                if (aizm.f70157c && !aizm.f70158d.contains(ahfv.mo36407a())) {
                    aizl.f70154a.f70158d.add(ahfv.mo36407a());
                    srn srn = ahfq.f67120a;
                    ajgs.m58685a(aizl.f70154a.f70155a);
                    ahfv.mo36407a();
                }
                byzx byzx = (byzx) byzy.f169191d.mo74144da();
                String a = ahfv.mo36407a();
                if (byzx.f164950c) {
                    byzx.mo74035c();
                    byzx.f164950c = false;
                }
                byzy byzy = (byzy) byzx.f164949b;
                a.getClass();
                byzy.f169193a |= 1;
                byzy.f169194b = a;
                bxvd da = byzz.f169196e.mo74144da();
                bzbu bzbu = aizl.f70154a.f70155a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byzz byzz = (byzz) da.f164949b;
                byzz.f169199b = bzbu.f169275k;
                byzz.f169198a |= 1;
                byzx.mo74515a((byzz) da.mo74062i());
                arrayList.add(ahfv);
                arrayList2.add((byzy) byzx.mo74062i());
            }
            ajgp ajgp = aizl.f70154a.f70156b;
            if (ajgp != null) {
                aiyw aiyw = (aiyw) ajgp;
                aiyw.f70111d.mo72984b();
                int size2 = arrayList.size();
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    ajgu ajgu = aiyw.f70108a;
                    ahfv ahfv2 = (ahfv) arrayList.get(i3);
                    ajgu.f70594c.mo72984b();
                    ajgu.mo38618a();
                    if (ajgu.f70592a.containsKey(ahfv2) && ((ajgv) ajgu.f70592a.get(ahfv2)).f70603f == 3) {
                        arrayList3.add(Integer.valueOf(i3));
                        break;
                    }
                    i3++;
                }
                int size3 = arrayList3.size();
                if (size3 == 0) {
                    while (i < size2) {
                        aiyw.mo38311a((ahfv) arrayList.get(i), (byzy) arrayList2.get(i));
                        i++;
                    }
                    return;
                }
                while (i < size3) {
                    int intValue = ((Integer) arrayList3.get(i)).intValue();
                    aiyw.mo38311a((ahfv) arrayList.get(intValue), (byzy) arrayList2.get(intValue));
                    i++;
                }
            }
        }
    }
}
