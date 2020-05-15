package p000;

import android.os.Bundle;

/* renamed from: agku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agku implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agkt f65825a;

    /* renamed from: b */
    final /* synthetic */ agkt f65826b;

    /* renamed from: c */
    final /* synthetic */ agkw f65827c;

    public agku(agkw agkw, agkt agkt, agkt agkt2) {
        this.f65827c = agkw;
        this.f65825a = agkt;
        this.f65826b = agkt2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (p000.agms.m54594b(r7.f65825a.f65821a, r7.f65826b.f65821a) != false) goto L_0x0087;
     */
    public final void run() {
        this.f65827c.mo35538v().mo35314a(aghn.f65459O);
        agkt agkt = this.f65825a;
        if (agkt != null) {
            long j = agkt.f65823c;
            agkt agkt2 = this.f65826b;
            if (j == agkt2.f65823c) {
                if (agms.m54594b(agkt.f65822b, agkt2.f65822b)) {
                }
            }
        }
        Bundle bundle = new Bundle();
        agkw.m54438a(this.f65826b, bundle, true);
        agkt agkt3 = this.f65825a;
        if (agkt3 != null) {
            String str = agkt3.f65821a;
            if (str != null) {
                bundle.putString("_pn", str);
            }
            String str2 = this.f65825a.f65822b;
            if (str2 != null) {
                bundle.putString("_pc", str2);
            }
            bundle.putLong("_pi", this.f65825a.f65823c);
        }
        this.f65827c.mo35538v().mo35314a(aghn.f65459O);
        agkm f = this.f65827c.mo35239f();
        f.mo35242i();
        f.mo35241h();
        f.mo35567a("auto", "_vs", f.mo35534A().mo20505a(), bundle);
        agkw agkw = this.f65827c;
        agkw.f65831b = this.f65826b;
        agkw.mo35237d().mo35618a(this.f65826b);
    }
}
