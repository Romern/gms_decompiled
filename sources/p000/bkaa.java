package p000;

import com.android.volley.Response;
import org.json.JSONObject;

/* renamed from: bkaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkaa implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ bkac f123719a;

    /* renamed from: b */
    final /* synthetic */ bkaf f123720b;

    public bkaa(bkaf bkaf, bkac bkac) {
        this.f123720b = bkaf;
        this.f123719a = bkac;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        this.f123719a.f123727f = jSONObject;
        bkaf bkaf = this.f123720b;
        bkaf.f123747K = jSONObject;
        bkaf.mo65717k();
        this.f123720b.f123763af = null;
    }
}
