package p000;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pth extends pts {

    /* renamed from: a */
    private final AtomicReference f40187a;

    /* renamed from: b */
    private final Handler f40188b;

    public pth(pti pti) {
        this.f40187a = new AtomicReference(pti);
        this.f40188b = new adzt(pti.f43949s);
    }

    /* renamed from: a */
    public final pti mo23638a() {
        pti pti = (pti) this.f40187a.getAndSet(null);
        if (pti == null) {
            return null;
        }
        pti.mo23640l();
        return pti;
    }

    /* renamed from: b */
    public final void mo23010b(int i) {
    }

    /* renamed from: c */
    public final void mo23011c(int i) {
    }

    /* renamed from: d */
    public final void mo23012d(int i) {
        if (((pti) this.f40187a.get()) != null) {
            synchronized (pti.f40191p) {
            }
        }
    }

    /* renamed from: e */
    public final void mo23013e(int i) {
        if (((pti) this.f40187a.get()) != null) {
            pti.m31207o();
        }
    }

    /* renamed from: f */
    public final void mo23014f(int i) {
        if (((pti) this.f40187a.get()) != null) {
            pti.m31207o();
        }
    }

    /* renamed from: g */
    public final void mo23015g(int i) {
        pti pti = (pti) this.f40187a.get();
        if (pti != null) {
            pti.f40207n = null;
            pti.f40208o = null;
            pti.m31207o();
            if (pti.f40197d != null) {
                this.f40188b.post(new ptd(pti));
            }
        }
    }

    /* renamed from: a */
    public final void mo23001a(int i) {
        pti a = mo23638a();
        if (a != null) {
            pti.f40190a.mo23670a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                a.mo25300b(2);
            }
        }
    }

    /* renamed from: a */
    public final void mo23002a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        pti pti = (pti) this.f40187a.get();
        if (pti != null) {
            pti.f40195b = applicationMetadata;
            pti.f40207n = applicationMetadata.f29706a;
            pti.f40208o = str2;
            pti.f40199f = str;
            synchronized (pti.f40191p) {
            }
        }
    }

    /* renamed from: a */
    public final void mo23003a(ApplicationStatus applicationStatus) {
        pti pti = (pti) this.f40187a.get();
        if (pti != null) {
            pti.f40190a.mo23670a("onApplicationStatusChanged", new Object[0]);
            this.f40188b.post(new ptf(pti, applicationStatus));
        }
    }

    /* renamed from: a */
    public final void mo23004a(DeviceStatus deviceStatus) {
        pti pti = (pti) this.f40187a.get();
        if (pti != null) {
            pti.f40190a.mo23670a("onDeviceStatusChanged", new Object[0]);
            this.f40188b.post(new pte(pti, deviceStatus));
        }
    }

    /* renamed from: a */
    public final void mo23005a(String str, double d, boolean z) {
        pti.f40190a.mo23670a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    /* renamed from: a */
    public final void mo23006a(String str, long j) {
        pti pti = (pti) this.f40187a.get();
        if (pti != null) {
            pti.mo23639a(j, 0);
        }
    }

    /* renamed from: a */
    public final void mo23007a(String str, long j, int i) {
        pti pti = (pti) this.f40187a.get();
        if (pti != null) {
            pti.mo23639a(j, i);
        }
    }

    /* renamed from: a */
    public final void mo23008a(String str, String str2) {
        pti pti = (pti) this.f40187a.get();
        if (pti != null) {
            pti.f40190a.mo23670a("Receive (type=text, ns=%s) %s", str, str2);
            this.f40188b.post(new ptg(pti, str, str2));
        }
    }

    /* renamed from: a */
    public final void mo23009a(String str, byte[] bArr) {
        if (((pti) this.f40187a.get()) != null) {
            pti.f40190a.mo23670a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }
}
