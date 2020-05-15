package p000;

import android.util.Log;
import com.google.firebase.appindexing.internal.CallStatus;

/* renamed from: brik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brik extends rpa {

    /* renamed from: a */
    final /* synthetic */ bril f142870a;

    public brik(bril bril) {
        this.f142870a = bril;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        int i;
        CallStatus a = ((brix) ((brig) rjd).mo25289B()).mo69574a(new brij(this, aucf), this.f142870a.f142871a);
        if (a != null) {
            i = a.f152357d;
        } else {
            i = 2;
        }
        boolean z = false;
        boolean z2 = true;
        bril bril = null;
        if (i == 3) {
            if (briy.m114098a(4)) {
                Log.i("FirebaseAppIndex", "Queue was full. API call will be retried.");
            }
            if (aucf.mo50393b((Object) null)) {
                synchronized (this.f142870a.f142873c.f142875b) {
                    brim brim = this.f142870a.f142873c;
                    if (brim.f142876c == 0) {
                        bril bril2 = (bril) brim.f142875b.peek();
                        if (bril2 == this.f142870a) {
                            z = true;
                        }
                        sdo.m34970a(z);
                        bril = bril2;
                    } else {
                        brim.f142876c = 2;
                    }
                }
            }
        } else {
            if (i != 1) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("API call failed. Status code: ");
                sb.append(i);
                briy.m114099b(sb.toString());
                if (aucf.mo50393b((Object) null)) {
                    this.f142870a.f142872b.mo50390a((Exception) new brhm("Indexing error."));
                }
            }
            synchronized (this.f142870a.f142873c.f142875b) {
                if (((bril) this.f142870a.f142873c.f142875b.poll()) != this.f142870a) {
                    z2 = false;
                }
                sdo.m34970a(z2);
                bril = (bril) this.f142870a.f142873c.f142875b.peek();
                this.f142870a.f142873c.f142876c = 0;
            }
        }
        if (bril != null) {
            bril.mo69564a();
        }
    }
}
