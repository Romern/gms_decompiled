package p000;

import android.os.SystemClock;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: abnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abnn extends tjc {

    /* renamed from: a */
    final /* synthetic */ abno f57738a;

    public abnn(abno abno) {
        this.f57738a = abno;
    }

    /* renamed from: a */
    public final void mo9499a(ContextData contextData) {
        bxkr bxkr = (bxkr) contextData.mo18009a(bxkr.f163787f);
        if (bxkr == null) {
            eoa.m10824a("Herrevad", "IndoorOutdoor proto header is NULL", new Object[0]);
            return;
        }
        String valueOf = String.valueOf(bxkr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Received IndoorOutdoor update: ");
        sb.append(valueOf);
        sb.toString();
        int i = eoa.f15378a;
        abno abno = this.f57738a;
        synchronized (abno.f57739a) {
            abno.f57740b = bxkr.f163790b;
            int a = bxkt.m122817a(bxkr.f163791c);
            if (a == 0) {
                a = 1;
            }
            abno.f57742d = a;
            abno.f57741c = SystemClock.elapsedRealtime();
        }
    }
}
