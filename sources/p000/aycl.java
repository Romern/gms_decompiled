package p000;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aycl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aycl {

    /* renamed from: A */
    public final String f97140A;

    /* renamed from: B */
    public ayck f97141B;

    /* renamed from: C */
    public HandlerThread f97142C;

    protected aycl(String str, Looper looper) {
        this.f97140A = str;
        this.f97141B = new ayck(looper, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo53864a(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo53868b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo53869b(Message message) {
        return true;
    }

    /* renamed from: c */
    public final void mo53898c(int i) {
        ayck ayck = this.f97141B;
        if (ayck != null) {
            ayck.removeMessages(i);
        }
    }

    /* renamed from: d */
    public final void mo53899d(int i) {
        ayck ayck = this.f97141B;
        if (ayck != null) {
            ayck.sendMessage(ayck.obtainMessage(2, i, 0));
        }
    }

    /* renamed from: a */
    public final void mo53891a() {
        ayck ayck = this.f97141B;
        if (ayck != null) {
            ayck.f97129a.mo53897b("quit");
            ayck.sendMessage(ayck.obtainMessage(-1, ayck.f97128f));
        }
    }

    /* renamed from: b */
    public final void mo53895b(int i) {
        ayck ayck = this.f97141B;
        if (ayck != null) {
            ayck.sendMessage(ayck.obtainMessage(i));
        }
    }

    /* renamed from: b */
    public final void mo53896b(aycg aycg) {
        this.f97141B.mo53889b(aycg);
    }

    /* renamed from: b */
    public final void mo53897b(String str) {
        if (Log.isLoggable(this.f97140A, 3)) {
            Log.d(this.f97140A, str);
        }
    }

    /* renamed from: a */
    public final void mo53892a(long j) {
        ayck ayck = this.f97141B;
        if (ayck != null) {
            ayck.sendMessageDelayed(Message.obtain(ayck, 22), j);
        }
    }

    /* renamed from: a */
    public final void mo53893a(aycg aycg) {
        this.f97141B.mo53888a(aycg);
    }

    /* renamed from: a */
    public final void mo53894a(aycg aycg, aycg aycg2) {
        ayck ayck = this.f97141B;
        List arrayList = ayck.f97130b.containsKey(aycg) ? (List) ayck.f97130b.get(aycg) : new ArrayList();
        if (!arrayList.contains(aycg2)) {
            arrayList.add(aycg2);
            ayck.f97130b.put(aycg, arrayList);
            return;
        }
        String str = ayck.f97129a.f97140A;
        String valueOf = String.valueOf(aycg);
        String valueOf2 = String.valueOf(aycg2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
        sb.append("Trying to add a transition that already exists! From ");
        sb.append(valueOf);
        sb.append(" to ");
        sb.append(valueOf2);
        Log.w(str, sb.toString());
    }
}
