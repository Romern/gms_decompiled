package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: ajep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajep {

    /* renamed from: a */
    public final Map f70458a = new C1223np();

    /* renamed from: a */
    public static ajep m58611a(List list) {
        ajep ajep = new ajep();
        for (int i = 0; i < list.size(); i++) {
            byzs byzs = (byzs) list.get(i);
            String uuid = UUID.randomUUID().toString();
            ajep.f70458a.put(uuid, byzs.f169163b);
            bxvd bxvd = (bxvd) byzs.mo74142c(5);
            bxvd.mo73625a((bxvk) byzs);
            bxvf bxvf = (bxvf) bxvd;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            byzs byzs2 = (byzs) bxvf.f164949b;
            byzs byzs3 = byzs.f169160i;
            uuid.getClass();
            byzs2.f169162a |= 1;
            byzs2.f169163b = uuid;
            list.set(i, (byzs) bxvf.mo74062i());
        }
        return ajep;
    }

    /* renamed from: b */
    public final void mo38555b(List list) {
        if (!this.f70458a.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                byzs byzs = (byzs) it.next();
                String str = (String) this.f70458a.get(byzs.f169163b);
                if (str != null) {
                    int i2 = i + 1;
                    bxvd bxvd = (bxvd) byzs.mo74142c(5);
                    bxvd.mo73625a((bxvk) byzs);
                    bxvf bxvf = (bxvf) bxvd;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    byzs byzs2 = (byzs) bxvf.f164949b;
                    byzs byzs3 = byzs.f169160i;
                    str.getClass();
                    byzs2.f169162a |= 1;
                    byzs2.f169163b = str;
                    list.set(i, (byzs) bxvf.mo74062i());
                    i = i2;
                }
            }
        }
    }
}
