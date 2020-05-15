package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: vhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhf implements bkna {

    /* renamed from: a */
    private final vhe f49260a;

    public vhf(vhe vhe) {
        this.f49260a = vhe;
    }

    /* renamed from: a */
    private final void m40426a(Status status) {
        vhg.f49261a.mo25374b("RealtimeLoader", "%s", status);
        this.f49260a.mo27246a(status);
    }

    /* renamed from: b */
    public final void mo28450b(String str) {
        m40426a(new Status(1502, str, null));
    }

    /* renamed from: c */
    public final void mo28451c(String str) {
        m40426a(new Status(1503, str, null));
    }

    /* renamed from: d */
    public final void mo28452d(String str) {
        m40426a(new Status(7, str, null));
    }

    /* renamed from: e */
    public final void mo28453e(String str) {
        m40426a(new Status(3004, str, null));
    }

    /* renamed from: a */
    public final void mo28449a(String str) {
        m40426a(new Status(1504, str, null));
    }
}
