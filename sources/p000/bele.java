package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bele */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bele implements bqeg {

    /* renamed from: a */
    public List f111755a;

    /* renamed from: b */
    final /* synthetic */ belh f111756b;

    public bele(belh belh) {
        this.f111756b = belh;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        ArrayList arrayList;
        String valueOf = String.valueOf(this.f111756b.f111761a);
        bljb a = blkh.m107282a(valueOf.length() == 0 ? new String("Initialize ") : "Initialize ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            synchronized (this.f111756b.f111764d) {
                if (this.f111755a == null) {
                    belh belh = this.f111756b;
                    this.f111755a = belh.f111765e;
                    belh.f111765e = Collections.emptyList();
                }
            }
            arrayList = new ArrayList(this.f111755a.size());
            belg belg = new belg(this.f111756b);
            for (bqeh bqeh : this.f111755a) {
                arrayList.add(bqeh.mo6375a(belg));
            }
        } catch (Exception e) {
            arrayList.add(bqga.m112777a((Throwable) e));
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            throw th;
        }
        bqgg a2 = bqga.m112785c(arrayList).mo69216a(new beld(this), bqfb.INSTANCE);
        a.mo66586a(a2);
        if (a != null) {
            a.close();
        }
        return a2;
    }
}
