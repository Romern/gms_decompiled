package p000;

import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: acbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbd {

    /* renamed from: a */
    public final acbc[] f59419a;

    /* renamed from: b */
    public final GlobalSearchQuerySpecification f59420b;

    /* renamed from: c */
    public final acrk f59421c;

    /* renamed from: d */
    public final int f59422d;

    public acbd(List list, GlobalSearchQuerySpecification globalSearchQuerySpecification, acrk acrk) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean z = 0;
            int i = 1;
            if (it.hasNext()) {
                absr absr = (absr) it.next();
                String str = absr.f58140e;
                synchronized (acrk.f60617a.f60625g) {
                    if (!cemw.m137399g() || !acrk.f60617a.f60623e.isEmpty()) {
                        acqm acqm = (acqm) acrk.f60617a.f60623e.get(str);
                        if (acqm != null && acqm.f60499b) {
                            z = 1;
                        }
                    } else {
                        z = !acrl.m49741b(acrk.f60617a.f60619a, str);
                    }
                }
                if (z == 0) {
                    arrayList.add(new acbc(absr));
                } else {
                    absg.m48185a("Blacklisted %s", absr.f58140e);
                }
            } else {
                acbc[] acbcArr = (acbc[]) arrayList.toArray(new acbc[0]);
                this.f59419a = acbcArr;
                this.f59420b = globalSearchQuerySpecification;
                this.f59421c = acrk;
                if (globalSearchQuerySpecification != null) {
                    int length = acbcArr.length;
                    while (z < length) {
                        absr absr2 = acbcArr[z].f59418a;
                        CorpusScoringInfo a = globalSearchQuerySpecification.mo7197a(absr2.f58140e, absr2.f58138c);
                        if (a != null) {
                            i = Math.max(i, a.f9521b);
                        }
                        z++;
                    }
                }
                this.f59422d = i;
                return;
            }
        }
        while (true) {
        }
    }
}
