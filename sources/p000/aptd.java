package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall$Request;

/* renamed from: aptd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptd extends rjx implements apsn {

    /* renamed from: a */
    private static final rjo f84842a = new rjo("SearchIndex.QUERIES_API", f84844c, f84843b);

    /* renamed from: b */
    private static final rje f84843b = new rje();

    /* renamed from: c */
    private static final rjl f84844c = new aptc();

    public aptd(Context context, aplz aplz) {
        super(context, f84842a, aplz, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo47578a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
        QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.f107483g = new Bundle();
        queryCall$Request.f107483g.putLong("request_timestamp_ms", System.currentTimeMillis());
        queryCall$Request.f107477a = str;
        queryCall$Request.f107478b = str2;
        queryCall$Request.f107479c = strArr;
        queryCall$Request.f107480d = i;
        queryCall$Request.f107481e = i2;
        queryCall$Request.f107482f = querySpecification;
        roz b = rpa.m34196b();
        b.f43472a = new aptb(queryCall$Request);
        return mo24701a(b.mo24977a());
    }
}
