package p000;

import com.android.volley.Response;

/* renamed from: shg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class shg implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ String f44466a;

    /* renamed from: b */
    final /* synthetic */ Response.Listener f44467b;

    /* renamed from: c */
    final /* synthetic */ shj f44468c;

    public shg(shj shj, String str, Response.Listener listener) {
        this.f44468c = shj;
        this.f44466a = str;
        this.f44467b = listener;
    }

    public final void onResponse(Object obj) {
        this.f44468c.f44475l.mo25566a(this.f44466a, 0);
        this.f44468c.f44475l.mo25564a();
        this.f44467b.onResponse(obj);
    }
}
