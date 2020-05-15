package p000;

import com.android.volley.Request;

/* renamed from: bnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f5200a;

    /* renamed from: b */
    final /* synthetic */ long f5201b;

    /* renamed from: c */
    final /* synthetic */ Request f5202c;

    public bnq(Request request, String str, long j) {
        this.f5202c = request;
        this.f5200a = str;
        this.f5201b = j;
    }

    public final void run() {
        this.f5202c.f7289a.mo3308a(this.f5200a, this.f5201b);
        Request request = this.f5202c;
        request.f7289a.mo3307a(request.toString());
    }
}
