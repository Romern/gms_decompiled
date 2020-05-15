package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Set;

/* renamed from: beiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beiz extends BroadcastReceiver {

    /* renamed from: a */
    public final bqgy f111624a = bqgy.m112818c();

    /* renamed from: b */
    public final Set f111625b;

    public beiz(Set set) {
        Set b = bnpf.m110056b();
        this.f111625b = b;
        b.addAll(set);
        m95158a();
    }

    /* renamed from: a */
    private final void m95158a() {
        if (this.f111625b.isEmpty()) {
            this.f111624a.mo69138b((Object) null);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f111625b.remove(bmxx.m108578b(intent.getPackage()));
        m95158a();
    }
}
