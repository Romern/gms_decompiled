package p000;

import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;

/* renamed from: kql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class kql {
    /* renamed from: a */
    public static kql m18340a(FillForm fillForm, kck kck, bnic bnic) {
        return m18341a(fillForm, kck, bnic, null);
    }

    /* renamed from: a */
    public abstract FillForm mo14782a();

    /* renamed from: b */
    public abstract kck mo14783b();

    /* renamed from: c */
    public abstract bnic mo14784c();

    /* renamed from: d */
    public abstract bmxv mo14785d();

    /* renamed from: e */
    public abstract bmxv mo14786e();

    /* renamed from: a */
    public static kql m18341a(FillForm fillForm, kck kck, bnic bnic, MetricsContext metricsContext) {
        return m18342a(fillForm, kck, bnic, metricsContext, bmvz.f131120a);
    }

    /* renamed from: a */
    public static kql m18342a(FillForm fillForm, kck kck, bnic bnic, MetricsContext metricsContext, bmxv bmxv) {
        return new kqa(fillForm, kck, bnic, bmxv.m108567c(metricsContext), bmxv);
    }
}
