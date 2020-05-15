package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;

/* renamed from: abno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abno {

    /* renamed from: a */
    public final Object f57739a = new Object();

    /* renamed from: b */
    public int f57740b;

    /* renamed from: c */
    public long f57741c = -1;

    /* renamed from: d */
    public int f57742d = 1;

    /* renamed from: e */
    private final abnn f57743e = new abnn(this);

    /* renamed from: f */
    private rjx f57744f;

    /* renamed from: a */
    public final void mo32223a(Context context) {
        synchronized (this.f57739a) {
            if (this.f57744f != null) {
                if (!cekz.m137120c() || !abme.m47898a()) {
                    int i = eoa.f15378a;
                    this.f57744f.mo24704a((tjc) this.f57743e);
                    this.f57744f = null;
                    this.f57741c = -1;
                }
            }
            if (this.f57744f == null && cekz.m137120c() && abme.m47898a()) {
                int i2 = eoa.f15378a;
                lri a = lri.m19582a("com.google.android.gms.herrevad", null);
                tkb tkb = new tkb();
                tkb.mo26624b();
                TimeFilterImpl a2 = tkb.mo26620a();
                tit tit = new tit();
                tit.mo26580a(57, a2);
                tiu a3 = tit.mo26578a();
                rjx c = lrh.m19579c(context, a);
                this.f57744f = c;
                aucb a4 = c.mo24703a(a3, this.f57743e);
                a4.mo50373a(abnk.f57735a);
                a4.mo50372a(abnl.f57736a);
            }
        }
    }
}
