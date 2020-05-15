package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.TimeUnit;

/* renamed from: bilk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bilk {

    /* renamed from: a */
    public static final long f120830a = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: b */
    public final bine f120831b;

    /* renamed from: c */
    public final rkb f120832c;

    /* renamed from: d */
    public final binc f120833d;

    /* renamed from: e */
    public final Handler f120834e = new adzt(Looper.getMainLooper());

    /* renamed from: f */
    public bilh f120835f;

    /* renamed from: g */
    public aelh f120836g;

    /* renamed from: h */
    public LatLng f120837h;

    /* renamed from: i */
    public aelh f120838i;

    /* renamed from: j */
    public Bitmap f120839j;

    /* renamed from: k */
    public rke f120840k;

    /* renamed from: l */
    public Runnable f120841l;

    /* renamed from: m */
    private rke f120842m;

    public bilk(bine bine, bils bils, binc binc) {
        rjo rjo = aema.f63501a;
        this.f120831b = bine;
        this.f120832c = bils.f120857a;
        this.f120833d = binc;
    }

    /* renamed from: a */
    private final void m102523a(aelh aelh) {
        this.f120835f.mo64735a(false);
        this.f120835f.mo64734a(aelh.mo8024q());
        this.f120835f.mo64736b(aelh.mo8025r());
        this.f120835f.mo64733a(aelh.mo8010d());
        this.f120835f.mo64732a(this.f120839j);
    }

    /* renamed from: b */
    public final void mo64740b() {
        rke rke = this.f120840k;
        if (rke != null) {
            rke.mo9460b();
            this.f120840k = null;
        }
        rke rke2 = this.f120842m;
        if (rke2 != null) {
            rke2.mo9460b();
            this.f120842m = null;
        }
        Runnable runnable = this.f120841l;
        if (runnable != null) {
            this.f120834e.removeCallbacks(runnable);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo64737a() {
        bilh bilh = this.f120835f;
        if (bilh == null) {
            return;
        }
        if (this.f120836g != null) {
            bilh.mo64731a((int) C0126R.string.place_picker_use_this_place);
            m102523a(this.f120836g);
            if (this.f120839j == null) {
                rke rke = this.f120840k;
                if (rke != null) {
                    rke.mo9460b();
                    this.f120840k = null;
                }
                rkb rkb = this.f120832c;
                String a = this.f120836g.mo8007a();
                sdo.checkIfNull((Object) a, (Object) "placeId == null");
                sdo.m34975b(true ^ a.isEmpty(), "placeId is empty");
                rle a2 = rkb.mo24787a((rle) new aelg(aema.f63501a, rkb, a));
                a2.mo9458a((rkl) new bilj(this, new bili(this), ((bilq) this.f120835f).getResources().getDimensionPixelSize(C0126R.dimen.place_picker_photo_width), ((bilq) this.f120835f).getResources().getDimensionPixelSize(C0126R.dimen.place_picker_confirm_map_height)));
                this.f120840k = a2;
            }
        } else if (this.f120838i != null) {
            bilh.mo64731a((int) C0126R.string.place_picker_use_this_location);
            m102523a(this.f120838i);
        } else if (this.f120837h != null) {
            bilh.mo64731a((int) C0126R.string.place_picker_use_this_location);
            this.f120835f.mo64734a("");
            this.f120835f.mo64736b("");
            this.f120835f.mo64733a(this.f120837h);
            this.f120835f.mo64735a(true);
        }
    }

    /* renamed from: a */
    public final void mo64738a(bilh bilh) {
        this.f120835f = bilh;
        mo64737a();
    }

    /* renamed from: a */
    public final void mo64739a(String str, int i) {
        rke a = aenc.m52185a(this.f120832c, str);
        this.f120842m = a;
        a.mo9458a(new bilg(this, i, str));
    }
}
