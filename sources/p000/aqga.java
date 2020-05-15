package p000;

import com.android.volley.Response;

/* renamed from: aqga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqga implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ aqgd f86021a;

    public aqga(aqgd aqgd) {
        this.f86021a = aqgd;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        aqgd aqgd = this.f86021a;
        aqgd.f86032h = (String) obj;
        aqgd.mo47859b();
    }
}
