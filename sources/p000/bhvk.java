package p000;

import java.util.Calendar;
import java.util.List;

/* renamed from: bhvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvk implements bhve {

    /* renamed from: a */
    private final bhva f119685a;

    public bhvk(bhva bhva) {
        this.f119685a = bhva;
    }

    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        bhuj.m101555a();
        List a = bhvc.m101600a(list.size());
        Calendar a2 = this.f119685a.mo64341a();
        a2.setTimeInMillis(System.currentTimeMillis());
        int i = (((a2.get(7) + 5) % 7) * 86400) + (a2.get(11) * 3600) + (a2.get(12) * 60) + a2.get(13);
        float f = ((float) i) / 86400.0f;
        float f2 = ((float) ((72000 + i) % 86400)) / 3600.0f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            bhue bhue = (bhue) a.get(i2);
            bhue.mo64306a(35, Float.valueOf(0.0417f * f2));
            bhue.mo64306a(36, Float.valueOf(0.1429f * f));
            bxwc bxwc = ((bhsu) list.get(i2)).f119498a.f157003h;
            if (!bxwc.isEmpty()) {
                int size = bxwc.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        bhue.mo64306a(12, Float.valueOf(-1.0f));
                        break;
                    }
                    bvnz bvnz = (bvnz) bxwc.get(i3);
                    int i4 = bvnz.f156991a;
                    if ((i4 & 1) != 0 && (i4 & 2) != 0 && bvnz.f156992b <= i && i <= bvnz.f156993c) {
                        break;
                    }
                    i3++;
                }
            }
            bhue.mo64306a(12, Float.valueOf(0.0f));
        }
        return new bhvi(list, a);
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "TimeBased";
    }
}
