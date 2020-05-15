package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ayit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayit extends ayfu {

    /* renamed from: c */
    final /* synthetic */ ConnectionConfiguration f97699c;

    /* renamed from: d */
    final /* synthetic */ axrs f97700d;

    /* renamed from: e */
    final /* synthetic */ ayja f97701e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayit(ayja ayja, String str, ConnectionConfiguration connectionConfiguration, axrs axrs) {
        super(str);
        this.f97701e = ayja;
        this.f97699c = connectionConfiguration;
        this.f97700d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            aydn aydn = this.f97701e.f97730i;
            ConnectionConfiguration g = aydn.mo53961g(this.f97699c);
            if (g.f110864a != null) {
                ConnectionConfiguration a = aydn.f97221b.mo53979a(g.f110865b);
                if (a == null) {
                    aydn.f97221b.mo53981a(g);
                    synchronized (aydn.f97224e) {
                        aydn.mo53952a(g);
                    }
                } else if (!g.equals(a)) {
                    if (Log.isLoggable("Wear_ConnectionMgr", 3)) {
                        String str = g.f110865b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
                        sb.append("putConnection: found config with same address");
                        sb.append(str);
                        sb.append(", removing old config");
                        Log.d("Wear_ConnectionMgr", sb.toString());
                    }
                    aydn.f97221b.mo53983c(a.f110864a);
                    aydn.f97221b.mo53981a(g);
                    synchronized (aydn.f97224e) {
                        aydn.mo53952a(g);
                    }
                } else if (Log.isLoggable("Wear_ConnectionMgr", 3)) {
                    Log.d("Wear_ConnectionMgr", "putConnection resulted in no connection change, skipping update");
                }
                this.f97700d.mo53437a(new Status(0));
                return;
            }
            String valueOf = String.valueOf(g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb2.append("putConnection: ");
            sb2.append(valueOf);
            sb2.append(", name is null");
            Log.e("Wear_ConnectionMgr", sb2.toString());
            throw new IllegalArgumentException("putConnection: the name must not be null");
        } catch (Exception e) {
            String valueOf2 = String.valueOf(this.f97699c);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 40);
            sb3.append("putConfig: exception during processing: ");
            sb3.append(valueOf2);
            Log.e("WearableService", sb3.toString(), e);
            this.f97700d.mo53437a(new Status(8));
        }
    }
}
