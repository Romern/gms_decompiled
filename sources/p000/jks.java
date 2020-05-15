package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jks {

    /* renamed from: a */
    public final jik f22717a = new jik();

    /* renamed from: a */
    public static int m16854a(List list) {
        if (list == null || list.isEmpty()) {
            return 1;
        }
        if (list.size() < 4) {
            return 2;
        }
        if (list.size() > 4) {
            return 3;
        }
        for (int i = 1; i < 4; i++) {
            if (((jto) list.get(i - 1)).f23190c != ((jto) list.get(i)).f23189b) {
                return 4;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static List m16855a(List list, boolean z, jtq jtq) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            jto jto = (jto) list.get(i);
            if (i == list.size() - 1 && z) {
                arrayList.add(jto);
                break;
            }
            byte[] a = jtq.mo14080a(jto.f23189b);
            if (a != null) {
                bxvd a2 = jto.f23186d.mo74141a(jto);
                ByteString a3 = ByteString.m123261a(a);
                if (a2.f164950c) {
                    a2.mo74035c();
                    a2.f164950c = false;
                }
                a3.getClass();
                ((jto) a2.f164949b).f23188a = a3;
                jto = (jto) a2.mo74062i();
            }
            arrayList.add(jto);
            i++;
        }
        return arrayList;
    }
}
