package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: chwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chwg implements Runnable {

    /* renamed from: a */
    final chwe f189349a;

    /* renamed from: b */
    final /* synthetic */ String f189350b;

    /* renamed from: c */
    final /* synthetic */ chtr f189351c;

    /* renamed from: d */
    final /* synthetic */ chtv f189352d;

    /* renamed from: e */
    final /* synthetic */ ciez f189353e;

    /* renamed from: f */
    final /* synthetic */ chqo f189354f;

    /* renamed from: g */
    final /* synthetic */ chwh f189355g;

    public chwg(chwh chwh, String str, chtr chtr, chtv chtv, ciez ciez, chqo chqo) {
        this.f189355g = chwh;
        this.f189350b = str;
        this.f189351c = chtr;
        this.f189352d = chtv;
        this.f189353e = ciez;
        this.f189354f = chqo;
        String str2 = this.f189350b;
        chwh chwh2 = this.f189355g;
        String str3 = chwh2.f189356a;
        Executor executor = chwh2.f189360e;
        chtr chtr2 = this.f189351c;
        Object obj = chwh2.f189358c;
        int i = chwh2.f189361f;
        boolean z = chwh2.f189362g;
        chtv chtv2 = this.f189352d;
        ciez ciez2 = this.f189353e;
        chqo chqo2 = this.f189354f;
        cifh cifh = chwh2.f189363h;
        boolean z2 = chwh2.f189364i;
        boolean z3 = chwh2.f189365j;
        this.f189349a = new chwe(str2, str3, executor, chtr2, chwh2, this, obj, chtv2, ciez2, chqo2, cifh);
    }

    public final void run() {
        synchronized (this.f189355g.f189358c) {
            chwh chwh = this.f189355g;
            if (chwh.f189366k) {
                this.f189349a.f189345o.mo85777b(chwh.f189367l, true, new chtr());
            } else if (chwh.f189368m) {
                chwe chwe = this.f189349a;
                chwh.f189359d.add(chwe);
                chwd chwd = chwe.f189345o;
                chvx chvx = chwh.f189369n;
                chwe chwe2 = chwd.f189327h;
                ByteBuffer byteBuffer = chwe.f189329a;
                chwe2.f189346p = chvx;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
