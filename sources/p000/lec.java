package p000;

import com.google.android.gms.autofill.metrics.MetricsContext;
import java.util.Collection;

/* renamed from: lec */
final /* synthetic */ class lec implements bmzi {

    /* renamed from: a */
    private final MetricsContext f25860a;

    /* renamed from: b */
    private final lbf f25861b;

    /* renamed from: c */
    private final lba f25862c;

    /* renamed from: d */
    private final Collection f25863d;

    public lec(MetricsContext metricsContext, lbf lbf, lba lba, Collection collection) {
        this.f25860a = metricsContext;
        this.f25861b = lbf;
        this.f25862c = lba;
        this.f25863d = collection;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        MetricsContext metricsContext = this.f25860a;
        lbf lbf = this.f25861b;
        lba lba = this.f25862c;
        Collection collection = this.f25863d;
        int i = lee.f25864a;
        bxvd da = lah.f25539e.mo74144da();
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
        lah lah = (lah) da.f164949b;
        kzz.getClass();
        lah.f25541a = kzz;
        lbf.getClass();
        lah.f25542b = lbf;
        lba.getClass();
        lah.f25543c = lba;
        if (!lah.f25544d.mo73666a()) {
            lah.f25544d = GeneratedMessageLite.m124021a(lah.f25544d);
        }
        bxsy.m123078a(collection, lah.f25544d);
        return (lah) da.mo74062i();
    }
}
