package p000;

import android.os.SystemClock;

/* renamed from: bfur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfur {

    /* renamed from: a */
    final bfus f115365a;

    /* renamed from: b */
    final bfus f115366b;

    /* renamed from: c */
    public int f115367c;

    public bfur(btvl btvl) {
        this.f115365a = new bfus(btvl);
        this.f115366b = new bfus(btvl);
        mo62291a(1, false);
    }

    /* renamed from: a */
    public final void mo62290a(int i) {
        mo62291a(i, true);
    }

    /* renamed from: b */
    public final btvl mo62292b(int i) {
        return i != 2 ? this.f115366b : this.f115365a;
    }

    /* renamed from: a */
    public final void mo62291a(int i, boolean z) {
        if (this.f115367c != i) {
            this.f115367c = i;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000000;
            if (this.f115367c == 2) {
                bfus bfus = this.f115365a;
                bfus.f115368a = true;
                this.f115366b.f115368a = false;
                if (z) {
                    bfus.mo62283a(elapsedRealtime);
                    return;
                }
                return;
            }
            this.f115365a.f115368a = false;
            bfus bfus2 = this.f115366b;
            bfus2.f115368a = true;
            if (z) {
                bfus2.mo62283a(elapsedRealtime);
            }
        }
    }
}
