package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: aras */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aras implements arbb {

    /* renamed from: d */
    private static final sek f87230d = ascp.m73787a("SourceConnectorCompat");

    /* renamed from: a */
    public final arbb f87231a;

    /* renamed from: b */
    public final arbr f87232b;

    /* renamed from: c */
    public int f87233c = 1;

    public aras(arbb arbb, arbr arbr) {
        this.f87231a = arbb;
        this.f87232b = arbr;
    }

    /* renamed from: a */
    public static arbb m72348a(arai arai) {
        return new aras(new arbj(arai.f87197a, arai.f87198b), new arbr(arqd.m73295a(arai.f87197a), arai));
    }

    /* renamed from: a */
    public final aucb mo48354a(D2DDevice d2DDevice, armu armu, String str) {
        throw null;
    }

    /* renamed from: a */
    public final aucb mo48353a() {
        int i = this.f87233c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            f87230d.mo25416d("disconnect called without a specified protocol", new Object[0]);
            return aucu.m76781a(this.f87231a.mo48353a(), this.f87232b.mo48353a());
        } else if (i2 == 1) {
            return this.f87231a.mo48353a();
        } else {
            if (i2 != 2) {
                return aucu.m76777a((Exception) new rjp(new Status(13)));
            }
            return this.f87232b.mo48353a();
        }
    }
}
