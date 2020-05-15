package p000;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: nmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nmi extends nsk {

    /* renamed from: a */
    public final Object f36034a = new Object();

    /* renamed from: b */
    public final List f36035b = new ArrayList();

    /* renamed from: c */
    public boolean f36036c;

    /* renamed from: d */
    private final npd f36037d;

    /* renamed from: e */
    private boolean f36038e;

    static {
        odk.m28481a("CAR.RETAIL");
    }

    public nmi(npd npd) {
        this.f36037d = npd;
    }

    /* renamed from: a */
    public final void mo21147a(PrintWriter printWriter) {
        boolean z = this.f36038e;
        StringBuilder sb = new StringBuilder(25);
        sb.append("isRetailModeEnabled=");
        sb.append(z);
        printWriter.println(sb.toString());
        boolean z2 = this.f36036c;
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("isShowcaseActivated=");
        sb2.append(z2);
        printWriter.println(sb2.toString());
        printWriter.println("clients");
        try {
            for (nmh nmh : this.f36035b) {
                if (nmh != null) {
                    try {
                        String valueOf = String.valueOf(nmh.f36032b);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 7);
                        sb3.append("binder:");
                        sb3.append(valueOf);
                        printWriter.println(sb3.toString());
                    } catch (ConcurrentModificationException e) {
                        printWriter.println("concurrent modification happened");
                    }
                } else {
                    printWriter.println("null client");
                }
            }
        } catch (ConcurrentModificationException e2) {
            printWriter.println("concurrent modification happened");
        }
    }

    /* renamed from: a */
    public final boolean mo21149a() {
        return this.f36038e && this.f36036c;
    }

    /* renamed from: b */
    public final void mo21150b(nsm nsm) {
        nmh nmh;
        synchronized (this.f36034a) {
            IBinder iBinder = nsm.f12819a;
            Iterator it = this.f36035b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    nmh = null;
                    break;
                }
                nmh = (nmh) it.next();
                if (nmh.f36032b.f12819a == iBinder) {
                    break;
                }
            }
            if (nmh != null) {
                nmh.mo21143a();
                this.f36035b.remove(nmh);
                this.f36035b.size();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo21151b() {
        boolean z = true;
        if (!"Retail".equals(this.f36037d.mo21379a("car_app_mode", "Release"))) {
            z = ccuf.f179931a.mo6606a().mo76815z();
        }
        this.f36038e = z;
        return z;
    }

    /* renamed from: a */
    public final void mo21148a(nsm nsm) {
        synchronized (this.f36034a) {
            try {
                nmh nmh = new nmh(this, nsm);
                nsm.f12819a.linkToDeath(nmh, 0);
                this.f36035b.add(nmh);
                this.f36035b.size();
            } catch (RemoteException e) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
