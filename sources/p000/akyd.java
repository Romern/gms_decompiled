package p000;

import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: akyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akyd implements bqfp {

    /* renamed from: a */
    final /* synthetic */ int[] f73100a;

    /* renamed from: b */
    final /* synthetic */ int f73101b;

    /* renamed from: c */
    final /* synthetic */ akyf f73102c;

    public akyd(akyf akyf, int[] iArr, int i) {
        this.f73102c = akyf;
        this.f73100a = iArr;
        this.f73101b = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bxok bxok = (bxok) obj;
        try {
            int[] iArr = this.f73100a;
            sek sek = akyf.f73106d;
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                if (i == 9) {
                    jSONArray.put(akyf.m60675a(9, bxok.f164165c));
                } else if (i == 10) {
                    jSONArray.put(akyf.m60675a(10, bxok.f164164b));
                }
            }
            akyf.m60678a(this.f73102c.f73109b, jSONArray.toString(), this.f73101b);
        } catch (JSONException e) {
            akyf.f73106d.mo25417e("converting to JSON failed", e, new Object[0]);
            akyf.m60676a(this.f73102c.f73109b, this.f73101b);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        akyf.f73106d.mo25417e("call to getDeviceLevelSettings failed", th, new Object[0]);
        akyf.m60676a(this.f73102c.f73109b, this.f73101b);
    }
}
