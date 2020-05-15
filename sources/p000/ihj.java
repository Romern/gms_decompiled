package p000;

import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ihj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ihj {

    /* renamed from: a */
    private long f21023a;

    /* renamed from: b */
    private String f21024b;

    /* renamed from: c */
    private long f21025c;

    /* renamed from: d */
    private String f21026d;

    /* renamed from: e */
    private final Set f21027e = new HashSet();

    /* renamed from: a */
    public final ihk mo13013a() {
        return new DeviceClassifierEntity(this.f21027e, this.f21023a, this.f21024b, this.f21025c, this.f21026d);
    }

    /* renamed from: b */
    public final void mo13016b() {
        this.f21025c = 201515033;
        this.f21027e.add(4);
    }

    /* renamed from: a */
    public final void mo13014a(long j) {
        this.f21023a = j;
        this.f21027e.add(2);
    }

    /* renamed from: b */
    public final void mo13017b(String str) {
        this.f21026d = str;
        this.f21027e.add(5);
    }

    /* renamed from: a */
    public final void mo13015a(String str) {
        this.f21024b = str;
        this.f21027e.add(3);
    }
}
