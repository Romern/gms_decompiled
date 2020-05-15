package p000;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: rlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rlb extends rlj {

    /* renamed from: a */
    public final SparseArray f43208a = new SparseArray();

    public rlb(rnx rnx) {
        super(rnx);
        this.f30135e.mo24871a("AutoManageHelper", this);
    }

    /* renamed from: a */
    private final rla m33908a(int i) {
        if (this.f43208a.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f43208a;
        return (rla) sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: b */
    public final void mo17726b() {
        super.mo17726b();
        for (int i = 0; i < this.f43208a.size(); i++) {
            rla a = m33908a(i);
            if (a != null) {
                a.f43205b.mo24803g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo24844c() {
        for (int i = 0; i < this.f43208a.size(); i++) {
            rla a = m33908a(i);
            if (a != null) {
                a.f43205b.mo24801e();
            }
        }
    }

    /* renamed from: a */
    public final void mo17722a() {
        super.mo17722a();
        boolean z = this.f43228b;
        String valueOf = String.valueOf(this.f43208a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        if (this.f43229c.get() == null) {
            for (int i = 0; i < this.f43208a.size(); i++) {
                rla a = m33908a(i);
                if (a != null) {
                    a.f43205b.mo24801e();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24843a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        rla rla = (rla) this.f43208a.get(i);
        if (rla != null) {
            rla rla2 = (rla) this.f43208a.get(i);
            this.f43208a.remove(i);
            if (rla2 != null) {
                rla2.f43205b.mo24797b(rla2);
                rla2.f43205b.mo24803g();
            }
            rka rka = rla.f43206c;
            if (rka != null) {
                rka.mo7249a(connectionResult);
            }
        }
    }

    /* renamed from: a */
    public final void mo17725a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f43208a.size(); i++) {
            rla a = m33908a(i);
            if (a != null) {
                printWriter.append((CharSequence) str).append((CharSequence) "GoogleApiClient #").print(a.f43204a);
                printWriter.println(":");
                a.f43205b.mo24789a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }
}
