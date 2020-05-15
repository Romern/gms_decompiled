package p000;

import android.net.Uri;
import java.util.HashSet;
import java.util.List;

/* renamed from: fiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fiz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ fiv f16696a;

    /* renamed from: b */
    final /* synthetic */ fje f16697b;

    public fiz(fje fje, fiv fiv) {
        this.f16697b = fje;
        this.f16696a = fiv;
    }

    public final void run() {
        fiv fiv = this.f16696a;
        fiv.f16682a.mo10850a(fiv);
        for (fjf fjf : this.f16697b.f16708c) {
            fjf.mo10887a();
        }
        fiv fiv2 = this.f16696a;
        sdo.m34973b("deliver should be called from worker thread");
        sdo.m34975b(fiv2.f16684c, "Measurement must be submitted");
        List list = fiv2.f16690i;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                fjg fjg = (fjg) list.get(i);
                Uri a = fjg.mo10851a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    fjg.mo10852a(fiv2);
                }
            }
        }
    }
}
