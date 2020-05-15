package p000;

import com.google.android.gms.autofill.metrics.MetricsContext;
import java.util.Set;
import java.util.stream.Collectors;

/* renamed from: ldr */
final /* synthetic */ class ldr implements bmzi {

    /* renamed from: a */
    private final MetricsContext f25846a;

    /* renamed from: b */
    private final MetricsContext.FillContext f25847b;

    /* renamed from: c */
    private final lba f25848c;

    /* renamed from: d */
    private final int f25849d;

    public ldr(MetricsContext metricsContext, MetricsContext.FillContext fillContext, lba lba, int i) {
        this.f25846a = metricsContext;
        this.f25847b = fillContext;
        this.f25848c = lba;
        this.f25849d = i;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        MetricsContext metricsContext = this.f25846a;
        MetricsContext.FillContext fillContext = this.f25847b;
        lba lba = this.f25848c;
        int i = this.f25849d;
        int i2 = lee.f25864a;
        bxvd da = laj.f25551g.mo74144da();
        bxvd da2 = kzz.f25505d.mo74144da();
        int a = metricsContext.mo7953a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((kzz) da2.f164949b).f25507a = a;
        kzx b = metricsContext.mo7956b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        b.getClass();
        ((kzz) da2.f164949b).f25508b = b;
        lbh c = metricsContext.mo7957c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        c.getClass();
        ((kzz) da2.f164949b).f25509c = c;
        kzz kzz = (kzz) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzz.getClass();
        ((laj) da.f164949b).f25553a = kzz;
        lbf lbf = (lbf) fillContext.f11647a.mo66812a(lbf.f25715f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        laj laj = (laj) da.f164949b;
        lbf.getClass();
        laj.f25554b = lbf;
        bngx bngx = fillContext.f11648b;
        if (!laj.f25555c.mo73666a()) {
            laj.f25555c = GeneratedMessageLite.m124021a(laj.f25555c);
        }
        bxsy.m123078a(bngx, laj.f25555c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lba.getClass();
        ((laj) da.f164949b).f25556d = lba;
        Set set = (Set) lba.f25679c.stream().map(ldt.f25851a).collect(Collectors.toSet());
        bnre i3 = fillContext.f11648b.listIterator();
        int i4 = 1;
        while (true) {
            if (!i3.hasNext()) {
                i4 = 0;
                break;
            }
            lba lba2 = (lba) i3.next();
            if (bmxi.m108538a(lba2, lba)) {
                break;
            }
            bxwc bxwc = lba2.f25679c;
            int size = bxwc.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                int i6 = i5 + 1;
                if (set.contains(Integer.valueOf(((lbd) bxwc.get(i5)).f25700e))) {
                    i4++;
                    break;
                }
                i5 = i6;
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        laj laj2 = (laj) da.f164949b;
        laj2.f25557e = i4;
        laj2.f25558f = i;
        return (laj) da.mo74062i();
    }
}
