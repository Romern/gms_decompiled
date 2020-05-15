package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: amaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amaj extends alzl {

    /* renamed from: a */
    private final alxm f74573a;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        alxm alxm = this.f74573a;
        bundle2.setClassLoader(alxm.getClass().getClassLoader());
        alxm.f74528a.f74532m = new Status(i);
        alxm.f74528a.f74534o = bundle2.getBundle("get.server_blob");
        alxm.f74528a.f74533n = bundle2.getBoolean("response_complete");
        String[] d = alxm.f74528a.mo23598d();
        alxn alxn = alxm.f74528a;
        if (alxn.f74529a.f74405d && !alxn.f74535p && d != null) {
            if (d.length != 0) {
                amaz amaz = alxn.f74531c;
                alxl alxl = new alxl(alxn);
                alvm alvm = new alvm();
                alvm.mo40813a(alxm.f74528a.f74529a.f74402a);
                alvm.f74390b = false;
                alvm.mo40814b();
                amaz.mo41081a(alxl, alvm.mo40812a(), d);
                return;
            }
            alxn.f74535p = true;
            alxm.f74528a.mo40841a((DataHolder) null);
        }
    }

    public amaj(alxm alxm) {
        this.f74573a = alxm;
    }
}
