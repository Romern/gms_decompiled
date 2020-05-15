package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* renamed from: rgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rgh implements bqfp {

    /* renamed from: a */
    final /* synthetic */ rgn f42915a;

    public rgh(rgn rgn) {
        this.f42915a = rgn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        alky alky = (alky) obj;
        amey b = alky.mo12459b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                alzr alzr = (alzr) it.next();
                rgn rgn = this.f42915a;
                String c = alzr.mo41063c();
                String d = alzr.mo41064d();
                if (!TextUtils.isEmpty(d)) {
                    rgj rgj = (rgj) rgn.f42927b.get(c);
                    if (rgj == null) {
                        rgj = new rgj();
                    }
                    rgj.f42918a = d;
                    rgn.f42927b.put(c, rgj);
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
