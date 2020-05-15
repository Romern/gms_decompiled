package p000;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: kkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kkh extends kkg {
    public kkh(bnzc bnzc) {
        super(bnzc);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* renamed from: a */
    public final void mo14572a(bnzd bnzd, kom kom) {
        char c;
        bnzd.mo68712a(kom.f24607f);
        bnzd.mo68712a(kom.f24604c);
        bnzd.mo68712a(kom.f24611j);
        bnic<String> bnic = kom.f24610i;
        if (!bnic.isEmpty()) {
            ArrayList arrayList = new ArrayList(bnic.size());
            for (String str : bnic) {
                arrayList.add(this.f24301a.mo68721a(str, StandardCharsets.UTF_8));
            }
            bnzd.mo68717b(bnzi.m110895a(arrayList).mo68740b());
        }
        kkg.m17979a(bnzd, kom.f24603b);
        kol kol = kom.f24623v;
        if (kol != null) {
            bnre i = ((koh) kol).f24573b.listIterator();
            String str2 = null;
            String str3 = null;
            while (i.hasNext()) {
                kok kok = (kok) i.next();
                String a = kok.mo14744a();
                int hashCode = a.hashCode();
                if (hashCode != 3355) {
                    if (hashCode == 3373707 && a.equals("name")) {
                        c = 1;
                        if (c == 0) {
                            str2 = kok.mo14745b();
                        } else if (c == 1) {
                            str3 = kok.mo14745b();
                        }
                    }
                } else if (a.equals("id")) {
                    c = 0;
                    if (c == 0) {
                    }
                }
                c = 65535;
                if (c == 0) {
                }
            }
            if (str2 != null) {
                bnzd.mo68725a(str2, StandardCharsets.UTF_8);
            }
            if (str3 != null) {
                bnzd.mo68725a(str3, StandardCharsets.UTF_8);
            }
        }
        kkg.m17979a(bnzd, kom.f24605d);
    }
}
