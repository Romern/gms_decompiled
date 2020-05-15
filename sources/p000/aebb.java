package p000;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: aebb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aebb {

    /* renamed from: a */
    public final String f63025a;

    /* renamed from: b */
    public final Bundle f63026b;

    /* renamed from: c */
    public final List f63027c;

    /* renamed from: d */
    final /* synthetic */ aebc f63028d;

    /* renamed from: e */
    private final aeaf f63029e;

    /* renamed from: f */
    private final aebg f63030f;

    /* renamed from: g */
    private final aalo f63031g;

    /* renamed from: h */
    private final Messenger f63032h;

    public aebb(aebc aebc, String str, aalo aalo, Bundle bundle, List list, aeaf aeaf) {
        this.f63028d = aebc;
        this.f63025a = str;
        this.f63030f = null;
        this.f63031g = aalo;
        this.f63026b = bundle;
        this.f63027c = list;
        this.f63029e = aeaf;
        this.f63032h = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo33995a(int i) {
        aebc aebc;
        int i2;
        synchronized (this.f63028d.f63033a) {
            try {
                if (!this.f63029e.f62983a) {
                    aebc aebc2 = this.f63028d;
                    if (aebc2.f63039g.mo33991d(this.f63025a, aebc2.f63038f.getClassName())) {
                        aebc aebc3 = this.f63028d;
                        aebc3.f63039g.mo33989c(this.f63025a, aebc3.f63038f.getClassName());
                        if (this.f63032h == null) {
                            aebc aebc4 = this.f63028d;
                            if (!aebc4.f63039g.mo33990c(aebc4.f63038f.getClassName())) {
                                aebc aebc5 = this.f63028d;
                                aebc5.mo34002b(aebc5.f63034b);
                            }
                        }
                    }
                }
                Messenger messenger = this.f63032h;
                if (messenger != null) {
                    Message obtain = Message.obtain();
                    obtain.what = 3;
                    obtain.arg1 = i;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("component", this.f63028d.f63038f);
                    bundle.putString("tag", this.f63025a);
                    obtain.setData(bundle);
                    messenger.send(obtain);
                } else {
                    aebg aebg = this.f63030f;
                    if (aebg == null) {
                        aalo aalo = this.f63031g;
                        if (aalo == null) {
                            String str = this.f63025a;
                            Log.e("GmsTaskChimeraService", str.length() == 0 ? new String("No communication protocol defined (shouldn't be possible): ") : "No communication protocol defined (shouldn't be possible): ".concat(str));
                        } else {
                            aalo.mo16975a(i);
                        }
                    } else {
                        aebg.mo24458a(i);
                    }
                }
                aebc aebc6 = this.f63028d;
                aebc6.f63039g.mo33989c(this.f63025a, aebc6.f63038f.getClassName());
                if (this.f63032h == null) {
                    aebc aebc7 = this.f63028d;
                    if (!aebc7.f63039g.mo33990c(aebc7.f63038f.getClassName())) {
                        aebc = this.f63028d;
                        i2 = aebc.f63034b;
                        aebc.mo34002b(i2);
                    }
                }
            } catch (RemoteException e) {
                try {
                    String str2 = this.f63025a;
                    Log.e("GmsTaskChimeraService", str2.length() == 0 ? new String("Error reporting result of operation to scheduler for ") : "Error reporting result of operation to scheduler for ".concat(str2));
                    aebc aebc8 = this.f63028d;
                    aebc8.f63039g.mo33989c(this.f63025a, aebc8.f63038f.getClassName());
                    if (this.f63032h == null) {
                        aebc aebc9 = this.f63028d;
                        if (!aebc9.f63039g.mo33990c(aebc9.f63038f.getClassName())) {
                            aebc = this.f63028d;
                            i2 = aebc.f63034b;
                        }
                    }
                } catch (Throwable th) {
                    aebc aebc10 = this.f63028d;
                    aebc10.f63039g.mo33989c(this.f63025a, aebc10.f63038f.getClassName());
                    if (this.f63032h == null) {
                        aebc aebc11 = this.f63028d;
                        if (!aebc11.f63039g.mo33990c(aebc11.f63038f.getClassName())) {
                            aebc aebc12 = this.f63028d;
                            aebc12.mo34002b(aebc12.f63034b);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public aebb(aebc aebc, String str, aebg aebg, Bundle bundle, List list, aeaf aeaf) {
        this.f63028d = aebc;
        this.f63025a = str;
        this.f63030f = aebg;
        this.f63031g = null;
        this.f63026b = bundle;
        this.f63027c = list;
        this.f63029e = aeaf;
        this.f63032h = null;
    }

    public aebb(aebc aebc, String str, Messenger messenger, Bundle bundle, List list, aeaf aeaf) {
        this.f63028d = aebc;
        this.f63025a = str;
        this.f63032h = messenger;
        this.f63026b = bundle;
        this.f63027c = list;
        this.f63029e = aeaf;
        this.f63030f = null;
        this.f63031g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo33996a(bqgg bqgg) {
        synchronized (this.f63028d.f63043k) {
            this.f63028d.f63043k.remove(this.f63025a);
        }
        try {
            mo33995a(((Integer) bqga.m112780a((Future) bqgg)).intValue());
        } catch (CancellationException | ExecutionException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Exception when running the task: ");
            sb.append(valueOf);
            Log.e("GmsTaskChimeraService", sb.toString());
        }
    }
}
