package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* renamed from: eol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eol implements bqfp {

    /* renamed from: a */
    final /* synthetic */ eoq f15414a;

    public eol(eoq eoq) {
        this.f15414a = eoq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        alky alky = (alky) obj;
        amey b = alky.mo12459b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                alzr alzr = (alzr) it.next();
                eoq eoq = this.f15414a;
                String c = alzr.mo41063c();
                String d = alzr.mo41064d();
                if (!TextUtils.isEmpty(d)) {
                    eon eon = (eon) eoq.f15425b.get(c);
                    if (eon == null) {
                        eon = new eon();
                    }
                    eon.f15417a = d;
                    eoq.f15425b.put(c, eon);
                }
            }
            b.mo12460c();
        }
        alky.mo12460c();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Log.e("AccountChipArrayAdapter", "Failed to load owner", th);
    }
}
