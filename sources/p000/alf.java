package p000;

import android.os.IBinder;
import android.os.Messenger;
import android.util.SparseArray;

/* renamed from: alf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alf implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final Messenger f821a;

    /* renamed from: b */
    public final int f822b;

    /* renamed from: c */
    public akp f823c;

    /* renamed from: d */
    public final SparseArray f824d = new SparseArray();

    /* renamed from: e */
    final aku f825e = new ale(this);

    /* renamed from: f */
    final /* synthetic */ alj f826f;

    public alf(alj alj, Messenger messenger, int i) {
        this.f826f = alj;
        this.f821a = messenger;
        this.f822b = i;
    }

    /* renamed from: a */
    public final aky mo959a(int i) {
        return (aky) this.f824d.get(i);
    }

    public final void binderDied() {
        this.f826f.f831b.obtainMessage(1, this.f821a).sendToTarget();
    }

    public final String toString() {
        return alj.m1009c(this.f821a);
    }

    /* renamed from: a */
    public final void mo960a() {
        int size = this.f824d.size();
        for (int i = 0; i < size; i++) {
            ((aky) this.f824d.valueAt(i)).mo941c();
        }
        this.f824d.clear();
        this.f821a.getBinder().unlinkToDeath(this, 0);
        mo961a((akp) null);
    }

    /* renamed from: a */
    public final void mo961a(akp akp) {
        if (!C1239oe.m19757a(this.f823c, akp)) {
            this.f823c = akp;
            alj alj = this.f826f;
            int size = alj.f830a.size();
            alk alk = null;
            boolean z = false;
            akp akp2 = null;
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                akp akp3 = ((alf) alj.f830a.get(i)).f823c;
                if (akp3 != null && (!akp3.mo919a().mo976c() || akp3.mo920b())) {
                    z2 |= akp3.mo920b();
                    if (akp2 == null) {
                        akp2 = akp3;
                    } else {
                        if (alk == null) {
                            alk = new alk(akp2.mo919a());
                        }
                        alk.mo972a(akp3.mo919a());
                    }
                }
            }
            if (alk != null) {
                all a = alk.mo971a();
                if (z2) {
                    z = true;
                }
                akp2 = new akp(a, z);
            }
            if (!C1239oe.m19757a(alj.f833d, akp2)) {
                alj.f833d = akp2;
                alj.f832c.mo947a(akp2);
            }
        }
    }
}
