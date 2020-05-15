package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: asrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asrm implements caou {

    /* renamed from: a */
    final /* synthetic */ JSONObject f89527a;

    /* renamed from: b */
    final /* synthetic */ boolean f89528b;

    public asrm(JSONObject jSONObject, boolean z) {
        this.f89527a = jSONObject;
        this.f89528b = z;
    }

    /* renamed from: a */
    private static final byte[] m74573a(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString(str);
            srn srn = asrs.f89540a;
            return asti.m74762a(string);
        } catch (JSONException e) {
            return new byte[0];
        }
    }

    /* renamed from: b */
    public final byte[] mo49409b() {
        return m74573a(this.f89527a, "idn");
    }

    /* renamed from: c */
    public final byte[] mo49410c() {
        return m74573a(this.f89527a, "atc");
    }

    /* renamed from: d */
    public final byte[] mo49411d() {
        return m74573a(this.f89527a, !this.f89528b ? "sk_rp_umd" : "sk_cl_umd");
    }

    /* renamed from: e */
    public final void mo49412e() {
    }

    /* renamed from: a */
    public final byte[] mo49408a() {
        return m74573a(this.f89527a, !this.f89528b ? "sk_rp_md" : "sk_cl_md");
    }
}
