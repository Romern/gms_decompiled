package p000;

import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: osh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class osh implements ohq {

    /* renamed from: a */
    final /* synthetic */ CarSetupServiceImpl f38316a;

    /* renamed from: b */
    private String f38317b;

    public osh(CarSetupServiceImpl carSetupServiceImpl) {
        this.f38316a = carSetupServiceImpl;
    }

    /* renamed from: Z */
    public final void mo21263Z() {
        nuu.m27792a(new osg(this));
    }

    /* renamed from: a */
    public final void mo21267a(int i, int i2, bivd bivd) {
        String str = this.f38317b;
        CarSetupServiceImpl carSetupServiceImpl = this.f38316a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        CarInfoInternal a = CarInfoInternal.m22107a(bivd, i, i2, str, carSetupServiceImpl.f29601r, carSetupServiceImpl.f29602s, carSetupServiceImpl.f29603t);
        this.f38316a.f29592i.mo22544a(i, i2, bivd);
        this.f38316a.mo17413a(a, bivd.f121962n);
    }

    /* renamed from: aa */
    public final void mo21296aa() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38316a;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        carSetupServiceImpl.f29600q = true;
    }

    /* renamed from: ay */
    public final void mo21319ay() {
    }

    /* renamed from: b */
    public final void mo21328b(bpdn bpdn, bpdo bpdo, String str) {
        nuu.m27792a(new osf(this, bpdn, bpdo, str));
    }

    /* renamed from: a */
    public final void mo21285a(ohb ohb, String str, String str2, String str3) {
        this.f38317b = str;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        if (!ccui.m131662b() || !this.f38316a.f29564C.mo21399j() || !ovr.m29886a(this.f38316a)) {
            orn orn = this.f38316a.f29592i;
            synchronized (orn) {
                if (orn.f38282c == 0) {
                    orn.mo22542a();
                }
                orn.f38280a.mo22541a(orn.f38282c, orn.f38281b);
            }
            bxvd b = orn.mo22550b();
            bxvd da = bpdw.f136410e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdw bpdw = (bpdw) da.f164949b;
            str.getClass();
            int i = bpdw.f136412a | 1;
            bpdw.f136412a = i;
            bpdw.f136413b = str;
            str2.getClass();
            int i2 = i | 2;
            bpdw.f136412a = i2;
            bpdw.f136414c = str2;
            str3.getClass();
            bpdw.f136412a = i2 | 4;
            bpdw.f136415d = str3;
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpcl bpcl = (bpcl) b.f164949b;
            bpdw bpdw2 = (bpdw) da.mo74062i();
            bpcl bpcl2 = bpcl.f135759L;
            bpdw2.getClass();
            bpcl.f135780h = bpdw2;
            bpcl.f135773a |= 32;
            orn.mo22547a(b, 21);
            ohb.mo22143b();
            return;
        }
        bnsi c = CarSetupServiceImpl.f29560a.mo68388c();
        c.mo68432a("osh", "a", 1304, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Device has been flagged as never supporting Android Auto, sending ByeBye to head unit");
        ojq ojq = this.f38316a.f29589f;
        if (ojq != null) {
            ojq.mo22215a(ojq.mo22224e() ? bipi.NOT_CURRENTLY_SUPPORTED : bipi.USER_SELECTION);
        }
    }
}
