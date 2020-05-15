package p000;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: aozk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aozk {

    /* renamed from: a */
    private final qws f83941a;

    /* renamed from: b */
    private final Queue f83942b = new ArrayDeque();

    /* renamed from: c */
    private final int f83943c = ((int) cgij.f186992a.mo6606a().mo83870f());

    static {
        aoyh.m69805a("ClearcutLoggerProxy");
    }

    public aozk(Context context, String str) {
        this.f83941a = new qws(context, str, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47035a(String str, byte[] bArr, int i) {
        new Object[1][0] = str;
        if (cgij.m145548f()) {
            while (this.f83942b.size() >= this.f83943c) {
                ((rke) this.f83942b.poll()).mo9455a();
            }
            qwo a = this.f83941a.mo24335a(bArr);
            a.mo24330c(str);
            a.f42322f = cagz.m126622a(i);
            this.f83942b.offer(a.mo24327b());
            return;
        }
        qwo a2 = this.f83941a.mo24335a(bArr);
        a2.mo24330c(str);
        a2.f42322f = cagz.m126622a(i);
        a2.mo24327b();
    }
}
