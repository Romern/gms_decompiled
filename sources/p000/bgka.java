package p000;

import java.util.ArrayList;

/* renamed from: bgka */
final /* synthetic */ class bgka implements Runnable {

    /* renamed from: a */
    private final bfnz[] f116677a;

    /* renamed from: b */
    private final bges f116678b;

    public bgka(bges bges, bfnz[] bfnzArr) {
        this.f116678b = bges;
        this.f116677a = bfnzArr;
    }

    public final void run() {
        int i;
        bges bges = this.f116678b;
        bfnz[] bfnzArr = this.f116677a;
        int i2 = bgkb.f116679c;
        bgeo bgeo = bges.f116291a.f116279a;
        if (bgeo.f116282c == 3) {
            bgeq bgeq = bgeo.f116284e;
            bfns a = bgdz.m98685a(bgeq.f116289a.f116297d).mo62700a(bfnzArr);
            bfor o = bgeq.f116289a.f116294a.mo62760o();
            if (a == null || a.f114450d != bfmy.OK) {
                i = 0;
            } else {
                i = 1;
            }
            o.mo62047a(new bfop(bfos.RTT_LOCATION_RESULT, o.mo62055b(), "status=%2$d apCount=%3$d", null, i, bfnzArr.length, 0));
            if (a == null || a.f114450d != bfmy.OK) {
                bger bger = bgeo.f116285f;
                bgeo bgeo2 = bger.f116290a.f116295b;
                if (bgeo2 != null) {
                    bgeo2.mo62717a();
                    bger.f116290a.f116295b = null;
                }
                bgeo.f116282c = 4;
                return;
            }
            bger bger2 = bgeo.f116285f;
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("postNewLocation: ");
            sb.append(valueOf);
            sb.toString();
            bfnb bfnb = new bfnb(a, a);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(bfnb);
            bger2.f116290a.f116294a.mo62754i().mo62679b(arrayList);
            bgeo.mo62719b(bgeo.f116280a);
        }
    }
}
