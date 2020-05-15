package p000;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: aslj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aslj implements C1504y {

    /* renamed from: a */
    final /* synthetic */ Context f89168a;

    /* renamed from: b */
    final /* synthetic */ aslk f89169b;

    public aslj(aslk aslk, Context context) {
        this.f89169b = aslk;
        this.f89168a = context;
    }

    /* renamed from: a */
    public final void mo2a() {
    }

    /* renamed from: b */
    public final void mo4b() {
    }

    /* renamed from: c */
    public final void mo5c() {
    }

    /* renamed from: d */
    public final void mo6d() {
    }

    /* renamed from: e */
    public final void mo7e() {
    }

    /* renamed from: a */
    public final void mo3a(C0013ak akVar) {
        bxvd da = bpay.f135565j.mo74144da();
        long currentTimeMillis = System.currentTimeMillis() - this.f89169b.f89170a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpay bpay = (bpay) da.f164949b;
        bpay.f135567a |= 4;
        bpay.f135575i = currentTimeMillis;
        Boolean bool = this.f89169b.f89172c;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpay bpay2 = (bpay) da.f164949b;
            bpay2.f135567a |= 1;
            bpay2.f135568b = booleanValue;
        }
        List list = this.f89169b.f89176g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bpax a = aslk.m74327a((asly) list.get(i));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpay bpay3 = (bpay) da.f164949b;
            a.getClass();
            if (!bpay3.f135572f.mo73666a()) {
                bpay3.f135572f = bxvk.m124019a(bpay3.f135572f);
            }
            bpay3.f135572f.mo74153d(a.f135564h);
        }
        Long l = this.f89169b.f89173d;
        if (l != null) {
            long longValue = l.longValue() - this.f89169b.f89170a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpay bpay4 = (bpay) da.f164949b;
            bpay4.f135567a |= 2;
            bpay4.f135569c = longValue;
        }
        Map map = this.f89169b.f89174e;
        if (map != null) {
            bngx a2 = aslk.m74326a(map, aslx.CORRECT);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpay bpay5 = (bpay) da.f164949b;
            if (!bpay5.f135571e.mo73666a()) {
                bpay5.f135571e = bxvk.m124019a(bpay5.f135571e);
            }
            int size2 = a2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bpay5.f135571e.mo74153d(((bpax) a2.get(i2)).f135564h);
            }
            bngx a3 = aslk.m74326a(this.f89169b.f89174e, aslx.INCORRECT);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpay bpay6 = (bpay) da.f164949b;
            if (!bpay6.f135570d.mo73666a()) {
                bpay6.f135570d = bxvk.m124019a(bpay6.f135570d);
            }
            int size3 = a3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                bpay6.f135570d.mo74153d(((bpax) a3.get(i3)).f135564h);
            }
        }
        Map map2 = this.f89169b.f89175f;
        if (map2 != null) {
            bngx a4 = aslk.m74326a(map2, aslx.CORRECT);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpay bpay7 = (bpay) da.f164949b;
            if (!bpay7.f135574h.mo73666a()) {
                bpay7.f135574h = bxvk.m124019a(bpay7.f135574h);
            }
            int size4 = a4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                bpay7.f135574h.mo74153d(((bpax) a4.get(i4)).f135564h);
            }
            bngx a5 = aslk.m74326a(this.f89169b.f89175f, aslx.INCORRECT);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpay bpay8 = (bpay) da.f164949b;
            if (!bpay8.f135573g.mo73666a()) {
                bpay8.f135573g = bxvk.m124019a(bpay8.f135573g);
            }
            int size5 = a5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                bpay8.f135573g.mo74153d(((bpax) a5.get(i5)).f135564h);
            }
        }
        atam a6 = atam.m75294a(this.f89168a, this.f89169b.f89171b);
        bpay bpay9 = (bpay) da.mo74062i();
        bxvd g = a6.mo49765g(146);
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        bpay9.getClass();
        bpbx.f135650N = bpay9;
        bpbx.f135656b |= 2048;
        a6.mo49741a((bpbx) g.mo74062i());
    }
}
