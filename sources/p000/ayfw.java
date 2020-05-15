package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ayfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfw implements ayjm {

    /* renamed from: a */
    public final Object f97503a = new Object();

    /* renamed from: b */
    public final HashMap f97504b = new HashMap();

    /* renamed from: c */
    public final bqgj f97505c = new soc(12, 9);

    /* renamed from: a */
    public final void mo53994a(Object obj, ayfu ayfu) {
        synchronized (this.f97503a) {
            ayfv ayfv = (ayfv) this.f97504b.get(obj);
            if (ayfv == null) {
                ayfv = new ayfv(this, obj);
                this.f97504b.put(obj, ayfv);
                this.f97505c.mo25812a(ayfv);
            }
            ayfv.f97500a.addLast(ayfu);
            if (Log.isLoggable("WearableService", 2)) {
                String valueOf = String.valueOf(ayfv);
                int size = ayfv.f97500a.size();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append(valueOf);
                sb.append(" adding a new task, ");
                sb.append(size);
                sb.append(" total");
                Log.v("WearableService", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        synchronized (this.f97503a) {
            ssb.println("Executor Status:");
            ssb.mo26034a();
            boolean isShutdown = this.f97505c.isShutdown();
            StringBuilder sb = new StringBuilder(17);
            sb.append("isShutdown: ");
            sb.append(isShutdown);
            ssb.println(sb.toString());
            boolean isTerminated = this.f97505c.isTerminated();
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("isTerminated: ");
            sb2.append(isTerminated);
            ssb.println(sb2.toString());
            ssb.mo26035b();
            ssb.println("Queued Tasks:");
            ssb.mo26034a();
            int size = this.f97504b.size();
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("numTaskQueues: ");
            sb3.append(size);
            ssb.println(sb3.toString());
            ssb.mo26034a();
            this.f97504b.entrySet();
            for (Map.Entry entry : this.f97504b.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                int size2 = ((ayfv) entry.getValue()).f97500a.size();
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb4.append(valueOf);
                sb4.append(": ");
                sb4.append(size2);
                sb4.append(" tasks");
                ssb.println(sb4.toString());
            }
            ssb.mo26035b();
            ssb.mo26035b();
        }
    }
}
