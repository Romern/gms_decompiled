package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ahfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahfc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ahdp f67095a;

    /* renamed from: b */
    final /* synthetic */ ahfe f67096b;

    public ahfc(ahfe ahfe, ahdp ahdp) {
        this.f67096b = ahfe;
        this.f67095a = ahdp;
    }

    public final void run() {
        ahct b = this.f67096b.mo36391b();
        if (b != null) {
            ahdp ahdp = this.f67095a;
            ahcy d = b.mo36322d();
            if (d == null) {
                b.mo36316a(ahdp, 2982);
                return;
            }
            b.f67018j.mo72973a(10, d);
            if (d.f67024f != null) {
                bxvd da = bvaq.f155504d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvaq bvaq = (bvaq) da.f164949b;
                bvaq.f155507b = 1;
                int i = 1 | bvaq.f155506a;
                bvaq.f155506a = i;
                String str = d.f67024f.f155451b;
                str.getClass();
                bvaq.f155506a = i | 2;
                bvaq.f155508c = str;
                d.f67021c.mo73258a((bvaq) da.mo74062i());
            } else {
                bnsl bnsl = (bnsl) ahcy.f67020b.mo68388c();
                bnsl.mo68432a("ahcy", "l", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("SocketDevice: unable to confirm before connect");
            }
            b.mo36319b(ahdp);
        }
    }
}
