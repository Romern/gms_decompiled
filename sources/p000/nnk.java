package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ noj f36096a;

    public nnk(noj noj) {
        this.f36096a = noj;
    }

    public final void run() {
        noj noj = this.f36096a;
        synchronized (noj.f36239z) {
            if (!noj.f36239z.isEmpty()) {
                Context context = noj.f36160E;
                Intent intent = new Intent("com.google.android.gms.car.VENDOR_CHANNEL_READY");
                intent.setFlags(32);
                CarInfo p = noj.mo21346p();
                CarUiInfo s = noj.mo21349s();
                Set a = noj.f36220g.mo21380a("vec_dont_auto_launch", new HashSet());
                for (npj npj : noj.f36239z.values()) {
                    intent.putExtra("com.google.android.gms.car.extra.VENDOR_CHANNEL_NAME", npj.f36310a);
                    String[] strArr = npj.f36311b;
                    for (String str : strArr) {
                        if (!a.contains(str)) {
                            if (noj.f36171P.mo22059a(p, s, str, nhg.SERVICE)) {
                                intent.setPackage(str);
                                context.sendBroadcast(intent);
                            }
                        }
                    }
                }
            }
        }
    }
}
