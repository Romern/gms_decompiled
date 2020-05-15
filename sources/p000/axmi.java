package p000;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;

/* renamed from: axmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axmi implements RetryPolicy {

    /* renamed from: a */
    final /* synthetic */ axmj f96184a;

    /* renamed from: b */
    private int f96185b;

    public axmi(axmj axmj) {
        this.f96184a = axmj;
    }

    public final int getCurrentRetryCount() {
        return this.f96185b;
    }

    public final int getCurrentTimeout() {
        return 0;
    }

    public final void retry(VolleyError volleyError) {
        NetworkResponse networkResponse;
        if (this.f96185b > 0 || (networkResponse = volleyError.networkResponse) == null || networkResponse.statusCode != 401) {
            throw volleyError;
        }
        axmj axmj = this.f96184a;
        Context context = axmj.f96186d;
        String str = axmj.f96187e;
        if (!TextUtils.isEmpty(str)) {
            try {
                gie.m13196b(context, str);
            } catch (Exception e) {
            }
        }
        this.f96185b++;
    }
}
