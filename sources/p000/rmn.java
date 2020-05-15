package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: rmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmn extends rmr {

    /* renamed from: a */
    final /* synthetic */ rms f43289a;

    /* renamed from: c */
    private final ArrayList f43290c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rmn(rms rms, ArrayList arrayList) {
        super(rms);
        this.f43289a = rms;
        this.f43290c = arrayList;
    }

    /* renamed from: a */
    public final void mo24902a() {
        Set set;
        rms rms = this.f43289a;
        rmx rmx = rms.f43296a.f43358l;
        sat sat = rms.f43306k;
        if (sat != null) {
            set = new HashSet(sat.f43964b);
            Map map = rms.f43306k.f43966d;
            for (rjo rjo : map.keySet()) {
                if (!rms.f43296a.f43353g.containsKey(rjo.mo24653a())) {
                    Set set2 = ((sas) map.get(rjo)).f43962a;
                    set.addAll(null);
                }
            }
        } else {
            set = Collections.emptySet();
        }
        rmx.f43328h = set;
        ArrayList arrayList = this.f43290c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rms rms2 = this.f43289a;
            ((rjm) arrayList.get(i)).mo24647a(rms2.f43303h, rms2.f43296a.f43358l.f43328h);
        }
    }
}
