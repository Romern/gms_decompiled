package p000;

import com.android.volley.VolleyError;

/* renamed from: enz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class enz extends VolleyError {

    /* renamed from: b */
    private final VolleyError f15370b;

    public enz(VolleyError volleyError) {
        this.f15370b = volleyError;
    }

    /* renamed from: a */
    public final synchronized VolleyError getCause() {
        return this.f15370b;
    }
}
