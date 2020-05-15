package p000;

import com.android.volley.Response;

/* renamed from: aqgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqgc implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ boolean f86023a;

    /* renamed from: b */
    final /* synthetic */ aqgd f86024b;

    public aqgc(aqgd aqgd, boolean z) {
        this.f86024b = aqgd;
        this.f86023a = z;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            this.f86024b.f86029e.add(1);
        } else if (num.intValue() != 0) {
            aqgy.m71600a("Unexpected result from uploading chunk: %s", num);
            String valueOf = String.valueOf(num);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Unexpected result from uploading chunk: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } else if (this.f86023a) {
            this.f86024b.f86029e.add(1);
        } else {
            this.f86024b.mo47859b();
        }
    }
}
