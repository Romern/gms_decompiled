package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: abrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abrl {

    /* renamed from: a */
    public final /* synthetic */ abrv f58043a;

    public abrl(abrv abrv) {
        this.f58043a = abrv;
    }

    /* renamed from: a */
    public final Set mo32293a(abyy abyy) {
        bngx b = this.f58043a.mo32298a().mo32536b(abyy, 2);
        HashSet hashSet = new HashSet(b.size());
        for (int i = 0; i < b.size(); i++) {
            absr absr = ((abss) b.get(i)).f58157b;
            if (absr == null) {
                absr = absr.f58134s;
            }
            hashSet.add(absr.f58138c);
        }
        return hashSet;
    }
}
