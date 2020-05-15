package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;

/* renamed from: buxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxx extends buqn {

    /* renamed from: a */
    final /* synthetic */ buyc f155279a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxx(buyc buyc, String str) {
        super(str);
        this.f155279a = buyc;
    }

    public final void run() {
        Iterator it = this.f155279a.f155289b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f155279a.mo73250d() <= SystemClock.elapsedRealtime() - ((Long) entry.getValue()).longValue()) {
                it.remove();
                this.f155279a.f155290c.mo20523a((String) entry.getKey());
            }
        }
        this.f155279a.mo73248b();
    }
}
