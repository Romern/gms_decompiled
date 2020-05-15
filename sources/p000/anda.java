package p000;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: anda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anda {

    /* renamed from: a */
    private final qws f76652a;

    /* renamed from: b */
    private final Queue f76653b = new ArrayDeque();

    /* renamed from: c */
    private final int f76654c;

    public anda(Context context, String str) {
        this.f76652a = new qws(context, str, null);
        amig.m62939a();
        this.f76654c = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83246C()).intValue();
    }

    /* renamed from: a */
    public final synchronized void mo41717a(String str, byte[] bArr, int i) {
        amig.m62939a();
        if (((Boolean) amfm.f74863a.mo41191a()).booleanValue()) {
            while (this.f76653b.size() >= this.f76654c) {
                ((rke) this.f76653b.poll()).mo9455a();
            }
            qwo a = this.f76652a.mo24335a(bArr);
            a.mo24330c(str);
            a.f42322f = cagz.m126622a(i);
            this.f76653b.offer(a.mo24327b());
            return;
        }
        qwo a2 = this.f76652a.mo24335a(bArr);
        a2.mo24330c(str);
        a2.f42322f = cagz.m126622a(i);
        a2.mo24327b();
    }
}
