package p000;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;

/* renamed from: pfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pfu extends pts {

    /* renamed from: a */
    final /* synthetic */ pfv f39047a;

    public pfu(pfv pfv) {
        this.f39047a = pfv;
    }

    /* renamed from: a */
    public final void mo23001a(int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39053c.post(new pfn(this));
    }

    /* renamed from: b */
    public final void mo23010b(int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39053c.post(new pfo(this, i));
    }

    /* renamed from: c */
    public final void mo23011c(int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39053c.post(new pfp(this));
    }

    /* renamed from: d */
    public final void mo23012d(int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.mo23016a(i);
    }

    /* renamed from: e */
    public final void mo23013e(int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.mo23021b(i);
    }

    /* renamed from: f */
    public final void mo23014f(int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.mo23021b(i);
    }

    /* renamed from: g */
    public final void mo23015g(int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.mo23021b(i);
        pfv pfv2 = this.f39047a;
        if (pfv2.f39070t != null) {
            pfv2.f39053c.post(new pfq(this));
        }
    }

    /* renamed from: a */
    public final void mo23002a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39060j = applicationMetadata;
        pfv.f39061k = str;
        ptc ptc = new ptc(new Status(0), applicationMetadata, str2);
        synchronized (pfv.f39059i) {
            aucf aucf = pfv.f39056f;
            if (aucf != null) {
                aucf.mo50391a(ptc);
            }
            pfv.f39056f = null;
        }
    }

    /* renamed from: a */
    public final void mo23003a(ApplicationStatus applicationStatus) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39053c.post(new pfs(this, applicationStatus));
    }

    /* renamed from: a */
    public final void mo23004a(DeviceStatus deviceStatus) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.f39053c.post(new pfr(this, deviceStatus));
    }

    /* renamed from: a */
    public final void mo23005a(String str, double d, boolean z) {
        pfv.f39050a.mo23670a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    /* renamed from: a */
    public final void mo23006a(String str, long j) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.mo23017a(j, 0);
    }

    /* renamed from: a */
    public final void mo23007a(String str, long j, int i) {
        pfv pfv = this.f39047a;
        ptx ptx = pfv.f39050a;
        pfv.mo23017a(j, i);
    }

    /* renamed from: a */
    public final void mo23008a(String str, String str2) {
        pfv.f39050a.mo23670a("Receive (type=text, ns=%s) %s", str, str2);
        this.f39047a.f39053c.post(new pft(this, str, str2));
    }

    /* renamed from: a */
    public final void mo23009a(String str, byte[] bArr) {
        pfv.f39050a.mo23670a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }
}
