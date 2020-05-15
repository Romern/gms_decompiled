package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ayiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayiu extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97702c;

    /* renamed from: d */
    final /* synthetic */ axrs f97703d;

    /* renamed from: e */
    final /* synthetic */ ayja f97704e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayiu(ayja ayja, String str, String str2, axrs axrs) {
        super(str);
        this.f97704e = ayja;
        this.f97702c = str2;
        this.f97703d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            aydn aydn = this.f97704e.f97730i;
            String str = this.f97702c;
            ConnectionConfiguration a = aydn.f97221b.mo53979a(str);
            if (a != null) {
                String b = aydn.f97221b.mo53982b(str);
                if (aydn.f97221b.mo53983c(str) > 0) {
                    String valueOf = String.valueOf(a.f110870g);
                    Log.d("Wear_ConnectionMgr", valueOf.length() == 0 ? new String("removed connection to node, revoking: ") : "removed connection to node, revoking: ".concat(valueOf));
                    if (!TextUtils.isEmpty(b)) {
                        aydn.f97222c.mo53679a(b);
                    }
                }
                if (a.f110866c != 4) {
                    if (aydn.mo53957c(a)) {
                        aydn.f97223d.post(new ayde(aydn, a));
                    } else if (aydn.mo53958d(a)) {
                        aydn.f97223d.post(new aydf(aydn, a));
                    } else if (aydn.mo53959e(a)) {
                        aydn.f97223d.post(new aydg(aydn));
                    } else if (aydn.mo53960f(a)) {
                        aydn.f97223d.post(new aydh(aydn));
                    }
                }
            } else if (Log.isLoggable("Wear_ConnectionMgr", 3)) {
                Log.d("Wear_ConnectionMgr", "removeConnection didn't remove any connections, skipping update");
            }
            this.f97703d.mo53437a(new Status(0));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(this.f97702c);
            Log.e("WearableService", valueOf2.length() == 0 ? new String("removeConfig: exception during processing: ") : "removeConfig: exception during processing: ".concat(valueOf2), e);
            this.f97703d.mo53437a(new Status(8));
        }
    }
}
