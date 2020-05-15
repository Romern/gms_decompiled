package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: aakv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakv {

    /* renamed from: a */
    private final List f28389a = new ArrayList();

    /* renamed from: a */
    private static final boolean m21409a(blmp blmp, aamh aamh) {
        return aamh.m21512a(blmp).equals(aamh);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        return r2;
     */
    /* renamed from: a */
    public final synchronized List mo16950a() {
        if (this.f28389a.isEmpty()) {
            return Collections.emptyList();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - cecz.f182285a.mo6606a().mo78817ai();
        ArrayList arrayList = new ArrayList();
        while (this.f28389a.size() > 0 && ((aaku) this.f28389a.get(0)).f28387a < elapsedRealtime) {
            blmp blmp = ((aaku) this.f28389a.get(0)).f28388b;
            aamh a = aamh.m21512a(blmp);
            arrayList.add(blmp);
            this.f28389a.remove(0);
            Iterator it = this.f28389a.iterator();
            while (it.hasNext()) {
                if (m21409a(((aaku) it.next()).f28388b, a)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized List mo16951a(aamh aamh) {
        if (this.f28389a.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f28389a.iterator();
        while (it.hasNext()) {
            blmp blmp = ((aaku) it.next()).f28388b;
            if (m21409a(blmp, aamh)) {
                arrayList.add(blmp);
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo16952a(blmp blmp) {
        int aa = (int) cecz.f182285a.mo6606a().mo78809aa();
        while (this.f28389a.size() >= aa) {
            aaku aaku = (aaku) this.f28389a.remove(0);
        }
        this.f28389a.add(new aaku(blmp));
    }
}
