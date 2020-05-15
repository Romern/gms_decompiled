package p000;

import android.content.Context;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.RegistrationInfo;

/* renamed from: aney */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aney extends rjx {
    protected aney(Context context) {
        super(context, anef.f76706a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: b */
    private static aucb m64109b() {
        return aucu.m76777a((Exception) new rjp(new Status(16)));
    }

    /* renamed from: c */
    private final boolean m64110c() {
        return rfj.f42872d.mo24590b(this.f43168w) == 0;
    }

    /* renamed from: a */
    public final aucb mo41757a() {
        roz b = rpa.m34196b();
        b.f43472a = aneq.f76737a;
        b.f43473b = new Feature[]{andy.f76702b};
        b.mo24979b();
        return mo24701a(b.mo24977a());
    }

    @Deprecated
    /* renamed from: n */
    public aucb mo25239n(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new aneh(str);
        return mo24701a(b.mo24977a());
    }

    @Deprecated
    /* renamed from: o */
    public final aucb mo41765o(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new anej(str);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: p */
    public final aucb mo41766p(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new anel(str);
        return mo24701a(b.mo24977a());
    }

    public aney(Activity activity) {
        super(activity, anef.f76706a, rjw.f43159a);
    }

    /* renamed from: b */
    public final aucb mo41763b(String str, String str2) {
        return mo41764c(str, str2, this.f43168w.getPackageName());
    }

    /* renamed from: c */
    public final aucb mo41764c(String str, String str2, String str3) {
        roz b = rpa.m34196b();
        b.f43472a = new anek(str, str2, str3);
        b.f43473b = new Feature[]{andy.f76703c};
        b.mo24979b();
        return mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public aucb mo25238b(String str, String str2, String str3) {
        if (!m64110c()) {
            return m64109b();
        }
        roz b = rpa.m34196b();
        b.f43472a = new aneo(str, str2, str3);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public aucb mo25233a(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new anew(str);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public aucb mo25234a(String str, int i, String[] strArr, byte[] bArr) {
        roz b = rpa.m34196b();
        b.f43472a = new aneg(str, i, strArr, bArr);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo41758a(String str, int i, String[] strArr, byte[] bArr, String str2) {
        roz b = rpa.m34196b();
        b.f43472a = new anem(str, i, strArr, bArr, str2);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public aucb mo25235a(String str, int i, String[] strArr, int[] iArr) {
        roz b = rpa.m34196b();
        b.f43472a = new aner(str, i, strArr, iArr);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo41759a(String str, String str2) {
        if (!m64110c()) {
            return m64109b();
        }
        roz b = rpa.m34196b();
        b.f43472a = new anex(str, str2);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public aucb mo25236a(String str, String str2, String str3) {
        roz b = rpa.m34196b();
        b.f43472a = new anev(str, str2, str3);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo41760a(String str, String str2, String str3, String str4) {
        if (!m64110c()) {
            return m64109b();
        }
        roz b = rpa.m34196b();
        b.f43472a = new anep(str, str2, str3, str4);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public aucb mo25237a(String str, String str2, Flag[] flagArr) {
        if (!m64110c()) {
            return m64109b();
        }
        roz b = rpa.m34196b();
        b.f43472a = new anen(str, str2, flagArr);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo41761a(String str, byte[] bArr) {
        if (!m64110c()) {
            return m64109b();
        }
        roz b = rpa.m34196b();
        b.f43472a = new anet(str, bArr);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo41762a(RegistrationInfo[] registrationInfoArr) {
        if (!m64110c()) {
            return m64109b();
        }
        roz b = rpa.m34196b();
        b.f43472a = new anes(registrationInfoArr);
        return mo24701a(b.mo24977a());
    }
}
