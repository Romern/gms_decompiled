package p000;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: bhwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwa implements bhvs {

    /* renamed from: a */
    static final int f119714a = bxco.PERSONALIZED_PLACES.f162973bD;

    /* renamed from: b */
    public static final tiu f119715b;

    /* renamed from: c */
    final tjc f119716c = new bhvw(this);

    /* renamed from: d */
    public final rkb f119717d;

    /* renamed from: e */
    public volatile boolean f119718e;

    /* renamed from: f */
    public boolean f119719f;

    /* renamed from: g */
    public bhss f119720g;

    /* renamed from: h */
    private final rka f119721h;

    /* renamed from: i */
    private final bhuk f119722i;

    static {
        tit tit = new tit();
        tit.mo26579a(f119714a);
        tit.mo26582b(1);
        f119715b = tit.mo26578a();
    }

    public bhwa(Context context, Handler handler, String str, bhuk bhuk) {
        rjy rjy = new rjy(context);
        rjy.mo24780a(tjj.f46189a, new tji("com.google.android.places.inference.net.contextmanager.PersonalPlaceInfoSourceImpl"));
        rjy.mo24778a(str);
        rjy.mo24774a(handler);
        rkb b = rjy.mo24784b();
        bhvx bhvx = new bhvx(this);
        this.f119721h = bhvx;
        this.f119720g = null;
        this.f119719f = true;
        this.f119717d = b;
        this.f119722i = bhuk;
        b.mo24791a((rka) bhvx);
    }

    /* renamed from: a */
    public final void mo64343a() {
        if (this.f119718e) {
            this.f119717d.mo24801e();
            rkb rkb = this.f119717d;
            rkb.mo24790a((rjz) new bhvz(this, rkb, "Stop Context Manager updates"));
            this.f119720g = null;
            this.f119718e = false;
        }
    }

    /* renamed from: a */
    public final void mo64344a(bhss bhss) {
        if (!this.f119718e) {
            this.f119720g = bhss;
            this.f119717d.mo24801e();
            this.f119719f = true;
            rkb rkb = this.f119717d;
            rkb.mo24790a((rjz) new bhvy(this, rkb, "Start Context Manager updates"));
            this.f119718e = true;
        }
    }

    /* renamed from: a */
    public final void mo64349a(bvnw[] bvnwArr, bvoa[] bvoaArr, int i, int i2, boolean z, int i3) {
        int seconds;
        bvnw[] bvnwArr2 = bvnwArr;
        int i4 = 0;
        for (bvnw bvnw : bvnwArr2) {
            bxwc bxwc = bvnw.f156976d;
            int size = bxwc.size();
            for (int i5 = 0; i5 < size; i5++) {
                bvnn bvnn = (bvnn) bxwc.get(i5);
                if (bvnn.f156952d.size() > 0 && (seconds = (int) TimeUnit.MICROSECONDS.toSeconds(bvnn.f156952d.mo74160a(0))) > i4) {
                    i4 = seconds;
                }
            }
        }
        this.f119722i.mo64319a(bvnwArr2.length, bvoaArr.length, i2, i, i4, z, i3, 1);
    }
}
