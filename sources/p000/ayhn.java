package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ayhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhn extends ayfu {

    /* renamed from: c */
    final /* synthetic */ ConnectionConfiguration f97604c;

    /* renamed from: d */
    final /* synthetic */ axrs f97605d;

    /* renamed from: e */
    final /* synthetic */ ayja f97606e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhn(ayja ayja, String str, ConnectionConfiguration connectionConfiguration, axrs axrs) {
        super(str);
        this.f97606e = ayja;
        this.f97604c = connectionConfiguration;
        this.f97605d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            aydn aydn = this.f97606e.f97730i;
            ConnectionConfiguration g = aydn.mo53961g(this.f97604c);
            if (g.f110864a != null) {
                List<ConnectionConfiguration> a = aydn.f97221b.mo53980a();
                ArrayList<ConnectionConfiguration> arrayList = new ArrayList();
                ConnectionConfiguration connectionConfiguration = null;
                for (ConnectionConfiguration connectionConfiguration2 : a) {
                    ConnectionConfiguration g2 = aydn.mo53961g(connectionConfiguration2);
                    if (!g2.f110864a.equals(g.f110864a)) {
                        arrayList.add(g2);
                    } else {
                        connectionConfiguration = g2;
                    }
                }
                for (ConnectionConfiguration connectionConfiguration3 : arrayList) {
                    aydn.f97221b.mo53983c(connectionConfiguration3.f110864a);
                }
                if (connectionConfiguration != null) {
                    if (g.equals(connectionConfiguration)) {
                        if (Log.isLoggable("Wear_ConnectionMgr", 3)) {
                            Log.d("Wear_ConnectionMgr", "putConnection resulted in no connection change, skipping update");
                        }
                        this.f97605d.mo53437a(new Status(0));
                        return;
                    }
                }
                aydn.f97221b.mo53981a(g);
                synchronized (aydn.f97224e) {
                    aydn.mo53956c();
                }
                this.f97605d.mo53437a(new Status(0));
                return;
            }
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("setConnection: ");
            sb.append(valueOf);
            sb.append(", name is null");
            Log.e("Wear_ConnectionMgr", sb.toString());
            throw new IllegalArgumentException("setConnection: the name must not be null");
        } catch (Exception e) {
            String valueOf2 = String.valueOf(this.f97604c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 40);
            sb2.append("setConfig: exception during processing: ");
            sb2.append(valueOf2);
            Log.e("WearableService", sb2.toString(), e);
            this.f97605d.mo53437a(new Status(8));
        }
    }
}
