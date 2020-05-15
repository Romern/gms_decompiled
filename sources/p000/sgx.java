package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.ArrayList;

/* renamed from: sgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sgx implements Response.ErrorListener {

    /* renamed from: a */
    private final ArrayList f44454a;

    public sgx(ArrayList arrayList) {
        this.f44454a = arrayList;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        for (int i = 0; i < this.f44454a.size(); i++) {
            ((she) this.f44454a.get(i)).deliverError(volleyError);
        }
    }
}
