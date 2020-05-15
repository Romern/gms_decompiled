package p000;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Map;

/* renamed from: abwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abwg extends acpn {

    /* renamed from: a */
    final /* synthetic */ sbj f58623a;

    /* renamed from: b */
    final /* synthetic */ String f58624b;

    /* renamed from: c */
    final /* synthetic */ int f58625c;

    /* renamed from: d */
    final /* synthetic */ int f58626d;

    /* renamed from: e */
    final /* synthetic */ abwh f58627e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abwg(abwh abwh, bqbd bqbd, String str, sbj sbj, String str2, int i, int i2) {
        super(bqbd, 1, str);
        this.f58627e = abwh;
        this.f58623a = sbj;
        this.f58624b = str2;
        this.f58625c = i;
        this.f58626d = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abwp abwp;
        abwh abwh = this.f58627e;
        Map map = abwh.f58628b;
        abrv b = abwh.f58629a.mo33016b();
        if (!b.mo32320d()) {
            try {
                absg.m48205e("IndexManager failed to initialize. AppIndex.API is unavailable.");
                this.f58623a.mo16678a(16, (IBinder) null, new Bundle());
            } catch (Throwable th) {
                absg.m48189a(th, "Service broker callback failed");
                b.f58083s.mo32447a("postinit_failed");
            }
        } else {
            if (cemz.m137436b()) {
                if (b.f58071g.f60620b.getBoolean("predefined-typeconfigs-update-in-progress", false)) {
                    b.f58083s.mo32453b(6014);
                    absg.m48205e("Running maintenance to deploy predefined typeconfig schema changes again");
                    abwy.m48422a(b);
                }
            }
            String str = this.f58624b;
            acpl acpl = this.f58627e.f58629a.f60610c;
            boolean z = b.f58081q == null;
            synchronized (abwh.f58628b) {
                abwp abwp2 = (abwp) abwh.f58628b.get(str);
                if (abwp2 == null) {
                    abwp abwp3 = new abwp(acpl, str, z);
                    abwh.f58628b.put(str, abwp3);
                    abwp = abwp3;
                } else {
                    abwp = abwp2;
                }
            }
            sbj sbj = this.f58623a;
            acri acri = this.f58627e.f58629a;
            String str2 = this.f58624b;
            int i = this.f58625c;
            sbj.mo16678a(0, new briw(acri, acri.mo33016b().f58083s, new abyp(acri.f60609b), abxp.m48475a(acri.f60609b), str2, i, abwp, acri.mo33016b().f58077m.mo32496a(this.f58626d, str2, i)), (Bundle) null);
        }
        return null;
    }
}
