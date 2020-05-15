package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: adds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adds implements ServiceConnection {

    /* renamed from: a */
    int f61447a = 0;

    /* renamed from: b */
    final Messenger f61448b = new Messenger(new adzt(Looper.getMainLooper(), new addo(this)));

    /* renamed from: c */
    addt f61449c;

    /* renamed from: d */
    final Queue f61450d = new ArrayDeque();

    /* renamed from: e */
    final SparseArray f61451e = new SparseArray();

    /* renamed from: f */
    final /* synthetic */ addw f61452f;

    public adds(addw addw) {
        this.f61452f = addw;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33360a() {
        this.f61452f.f61460b.execute(new addq(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo33364b() {
        if (this.f61447a == 2 && this.f61450d.isEmpty() && this.f61451e.size() == 0) {
            this.f61447a = 3;
            skh.m35531a().mo25689a(this.f61452f.f61459a, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo33365c() {
        if (this.f61447a == 1) {
            mo33362a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.f61449c = new addt(iBinder);
                this.f61447a = 2;
                mo33360a();
            } catch (RemoteException e) {
                mo33362a(0, e.getMessage());
            }
        } else {
            mo33362a(0, "Null service connection");
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        mo33362a(2, "Service disconnected");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo33361a(int i) {
        addu addu = (addu) this.f61451e.get(i);
        if (addu != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f61451e.remove(i);
            addu.mo33368a(new addv(3, "Timed out waiting for response"));
            mo33364b();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0014, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo33362a(int i, String str) {
        int i2 = this.f61447a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            this.f61447a = 4;
            skh.m35531a().mo25689a(this.f61452f.f61459a, this);
            addv addv = new addv(i, str);
            for (addu addu : this.f61450d) {
                addu.mo33368a(addv);
            }
            this.f61450d.clear();
            for (int i3 = 0; i3 < this.f61451e.size(); i3++) {
                ((addu) this.f61451e.valueAt(i3)).mo33368a(addv);
            }
            this.f61451e.clear();
        } else if (i2 == 3) {
            this.f61447a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        return true;
     */
    /* renamed from: a */
    public final synchronized boolean mo33363a(addu addu) {
        boolean z;
        int i = this.f61447a;
        if (i == 0) {
            this.f61450d.add(addu);
            if (this.f61447a == 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            this.f61447a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!skh.m35531a().mo25690a(this.f61452f.f61459a, intent, this, 1)) {
                mo33362a(0, "Unable to bind to service");
            } else {
                this.f61452f.f61460b.schedule(new addp(this), 30, TimeUnit.SECONDS);
            }
        } else if (i == 1) {
            this.f61450d.add(addu);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f61450d.add(addu);
            mo33360a();
            return true;
        }
    }
}
