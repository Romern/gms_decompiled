package p000;

import android.util.Log;
import com.google.android.gms.beacon.BleSighting;
import java.util.List;

/* renamed from: bige */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bige extends nej {

    /* renamed from: a */
    final /* synthetic */ bigi f120502a;

    public bige(bigi bigi) {
        this.f120502a = bigi;
    }

    /* renamed from: a */
    public final void mo13773a(int i) {
        if (Log.isLoggable("Places", 5)) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("BLE failure while scanning - code ");
            sb.append(i);
            Log.w("Places", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo13774a(int i, BleSighting bleSighting) {
        this.f120502a.f120515h.post(new bigd(this, bleSighting));
    }

    /* renamed from: a */
    public final void mo20524a(List list) {
        this.f120502a.f120515h.post(new bigc(this, list));
    }
}
