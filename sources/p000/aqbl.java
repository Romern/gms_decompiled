package p000;

import android.util.SparseArray;
import java.util.List;

/* renamed from: aqbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqbo f85570a;

    public aqbl(aqbo aqbo) {
        this.f85570a = aqbo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        if (r10 != false) goto L_0x008e;
     */
    public final void run() {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        aqbw aqbw = new aqbw();
        aqby aqby = new aqby(this.f85570a.f85586m);
        aqbp aqbp = new aqbp(this.f85570a.f85586m);
        aqbp.mo47739a(aqbw);
        for (Integer num : this.f85570a.f85587n.mo47759a()) {
            int intValue = num.intValue();
            aqbo aqbo = this.f85570a;
            aqbk aqbk = new aqbk(aqbo.f85580f, intValue, aqbo.f85586m);
            List c = aqbk.mo47731c();
            if (c != null && !c.isEmpty()) {
                aqbt aqbt = new aqbt(intValue);
                aqbx a = aqby.mo47750a(intValue);
                if (a != null) {
                    bnic bnic = aqbo.f85575b;
                    Integer valueOf = Integer.valueOf(intValue);
                    if (!bnic.contains(valueOf)) {
                        boolean a2 = aqbt.mo47746a(c, null, a.f85618a, a.f85619b, true);
                        if (aqbo.f85574a.contains(valueOf)) {
                            aqbt.mo47748b();
                        }
                    }
                    sparseArray.put(intValue, aqbt);
                    sparseArray2.put(intValue, aqbk);
                }
            }
            aqbk.mo47728a();
        }
        aqbo aqbo2 = this.f85570a;
        aqbo2.f85581g = aqby;
        aqbo2.f85583i = aqbw;
        aqbo2.f85582h = aqbp;
        aqbo2.f85584j = sparseArray;
        aqbo2.f85585k = sparseArray2;
        apyk apyk = new apyk(aqbo2.f85580f);
        this.f85570a.f85589p = apyk.f85143a.getLong("snet_safe_browsing_last_cache_write_ms", 0);
        this.f85570a.f85590q = Math.max(apyk.mo47705c(), apyk.mo47704b() + aqbo.f85576c);
        if (aqbj.f85560d != null) {
            aqbj.f85560d.countDown();
        }
    }
}
