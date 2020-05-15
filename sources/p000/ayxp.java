package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ayxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayxp implements ayxh {

    /* renamed from: a */
    final /* synthetic */ ayxq f98685a;

    public ayxp(ayxq ayxq) {
        this.f98685a = ayxq;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo54509b(Object obj) {
        aywp aywp = (aywp) obj;
        bxvf bxvf = aywp.f98639e;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        aywu aywu = (aywu) bxvf.f164949b;
        aywu aywu2 = aywu.f98650f;
        aywu.f98652a |= 4;
        aywu.f98656e = elapsedRealtime;
        ayxt ayxt = this.f98685a.f98687b;
        if (ayxt.f98708g) {
            Collection collection = (Collection) ayxt.f98706e.remove(obj);
            if (collection != null) {
                collection.clear();
                ayxt.f98707f = collection;
            }
            if (aywp.mo54486c()) {
                aywp aywp2 = (aywp) aywp.f98637b.mo54498h();
                if (aywp.f98637b.mo54491a() || (aywp2 != null && aywp2.mo54486c())) {
                    Collection collection2 = (Collection) ayxt.f98706e.get(aywp2);
                    if (collection2 != null) {
                        collection2.add(aywp.mo54483a());
                    } else {
                        Collection collection3 = ayxt.f98707f;
                        if (collection3 == null) {
                            collection3 = new ArrayList();
                        } else {
                            ayxt.f98707f = null;
                        }
                        collection3.add(aywp.mo54483a());
                        ayxt.f98706e.put(aywp2, collection3);
                    }
                }
            }
        }
        ayxt.f98702a.remove(obj);
        ayxt.f98703b.remove(obj);
        bxvf bxvf2 = aywp.f98639e;
        bptu bptu = ((aywu) bxvf2.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        bxvd bxvd = (bxvd) bptu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bptu);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bptu bptu2 = (bptu) bxvd.f164949b;
        bptu2.f139184d = null;
        int i = bptu2.f139181a & -2049;
        bptu2.f139181a = i;
        bptu2.f139181a = i & -2;
        bptu2.f139182b = -1;
        bptu bptu3 = (bptu) bxvd.mo74062i();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        aywu aywu3 = (aywu) bxvf2.f164949b;
        bptu3.getClass();
        aywu3.f98654c = bptu3;
        aywu3.f98652a |= 1;
        if (!ayxt.f98706e.isEmpty()) {
            this.f98685a.mo54516a();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54506a() {
        beel.m91855b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo54510c(Object obj) {
        beel.m91855b();
        ayxq ayxq = this.f98685a;
        if (ayxq.f98690e == null) {
            return;
        }
        if (ayxq.f98689d > 0 || ((aywp) obj).f98637b.mo54491a()) {
            beel.m91857d().removeCallbacks(this.f98685a.f98690e);
            this.f98685a.mo54517b();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54507a(Object obj) {
        boolean z;
        aywp aywp = (aywp) obj;
        bxvf bxvf = aywp.f98639e;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z2 = false;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        aywu aywu = (aywu) bxvf.f164949b;
        aywu aywu2 = aywu.f98650f;
        aywu.f98652a |= 4;
        aywu.f98656e = elapsedRealtime;
        ayxt ayxt = this.f98685a.f98687b;
        ayxi ayxi = aywp.f98637b;
        bxvf bxvf2 = aywp.f98639e;
        bptu bptu = ((aywu) bxvf2.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        int i = 1;
        if ((bptu.f139181a & 2048) != 0) {
            int i2 = ((ayww) ayxi).mo54499i();
            int a = bpca.m111766a(((aywu) bxvf2.f164949b).f98655d);
            if (a != 0) {
                i = a;
            }
            if (i != i2) {
                aywu aywu3 = (aywu) bxvf2.f164949b;
                if (!ayxt.mo54524a(aywp, i2)) {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (ayxi instanceof ayww) {
                boolean a2 = aywp.f98639e.mo74131a(azag.f98830a);
                if (ayxi.mo54491a()) {
                    z = false;
                } else {
                    z = a2;
                }
                ayww ayww = (ayww) ayxi;
                if (ayww.f98666h != z) {
                    bmxy.m108600b(ayww.f98662d == null);
                    if (!z || !ayww.m85002b(ayww.f98659a)) {
                        z2 = true;
                    }
                    bmxy.m108588a(z2);
                    if (ayww.f98664f) {
                        ayww.mo54497g();
                    }
                    ayww.f98666h = z;
                    if (ayww.f98664f) {
                        ayww.mo54496f();
                    }
                }
            }
            ayxt.f98702a.add(obj);
        }
        this.f98685a.mo54516a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54508a(Object obj, int i) {
        aywp aywp = (aywp) obj;
        bxvf bxvf = aywp.f98639e;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        aywu aywu = (aywu) bxvf.f164949b;
        aywu aywu2 = aywu.f98650f;
        aywu.f98652a |= 4;
        aywu.f98656e = elapsedRealtime;
        if (this.f98685a.f98687b.mo54524a(aywp, i)) {
            this.f98685a.mo54516a();
        }
    }
}
