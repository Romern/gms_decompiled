package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.places.Subscription;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bhrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhrg implements Callable {

    /* renamed from: a */
    final /* synthetic */ bhri f119374a;

    /* renamed from: b */
    private final Subscription f119375b;

    public bhrg(bhri bhri, Subscription subscription) {
        this.f119374a = bhri;
        this.f119375b = subscription;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Subscription subscription;
        bhrc bhrc = this.f119374a.f119382h;
        if (bhrc.f119368b) {
            Subscription subscription2 = this.f119375b;
            String a = subscription2.mo70891a();
            List e = bhrc.f119367a.mo25074e();
            int size = e.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Subscription subscription3 = (Subscription) e.get(i2);
                String a2 = subscription3.mo70891a();
                if (subscription2.getClass() == subscription3.getClass() && a.equals(a2)) {
                    i++;
                }
            }
            Status a3 = this.f119375b.mo70890a(i);
            if (!a3.mo17710c()) {
                return a3;
            }
            bhrc bhrc2 = this.f119374a.f119382h;
            Subscription subscription4 = this.f119375b;
            List e2 = bhrc2.f119367a.mo25074e();
            int size2 = e2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    subscription = null;
                    break;
                }
                subscription = (Subscription) e2.get(i3);
                i3++;
                if (subscription.equals(subscription4)) {
                    break;
                }
            }
            bhrc2.f119367a.mo25062a(subscription4);
            if (!this.f119375b.mo70892a(subscription)) {
                if (this.f119374a.f119383i.isEmpty()) {
                    bhri bhri = this.f119374a;
                    bhri.f119381g.mo64176a(bhri.f119382h.mo64178b());
                }
                this.f119374a.mo64185b(this.f119375b);
            }
            return aemj.m52157b(0);
        }
        throw new IllegalStateException("Tried to add a subscription before we were ready");
    }
}
