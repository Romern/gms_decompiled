package p000;

import java.util.Comparator;

/* renamed from: fpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fpd implements Comparator {

    /* renamed from: a */
    final /* synthetic */ fpe f17071a;

    public fpd(fpe fpe) {
        this.f17071a = fpe;
    }

    /* renamed from: a */
    public final int compare(Integer num, Integer num2) {
        fpc fpc = (fpc) this.f17071a.f17072a.get(num);
        fpc fpc2 = (fpc) this.f17071a.f17072a.get(num2);
        sdo.m34959a(fpc);
        sdo.m34959a(fpc2);
        return fpc.compareTo(fpc2);
    }
}
