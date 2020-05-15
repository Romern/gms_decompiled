package p000;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RetryPolicy;

/* renamed from: aqzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqzk extends aqzf {

    /* renamed from: b */
    public static final sek f87154b = ascp.m73787a("D2D", "D2DClientImpl");

    /* renamed from: c */
    public final RetryPolicy f87155c;

    /* renamed from: d */
    public final int f87156d;

    /* renamed from: e */
    public final int f87157e;

    /* renamed from: f */
    public final float f87158f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final arob mo48299a() {
        RetryPolicy retryPolicy = this.f87155c;
        rpr b = rpr.m34216b();
        return new arof(b, b.getRequestQueue(), retryPolicy);
    }

    public aqzk() {
        int intValue = Integer.valueOf((int) cgqs.f187523a.mo6606a().mo84327m()).intValue();
        int intValue2 = Integer.valueOf((int) cgqs.f187523a.mo6606a().mo84326l()).intValue();
        float floatValue = Float.valueOf((float) cgqs.f187523a.mo6606a().mo84325k()).floatValue();
        this.f87156d = intValue;
        this.f87157e = intValue2;
        this.f87158f = floatValue;
        this.f87155c = new DefaultRetryPolicy(intValue, intValue2, floatValue);
    }
}
