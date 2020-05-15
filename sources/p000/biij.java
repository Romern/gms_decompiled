package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: biij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biij {

    /* renamed from: q */
    public static final /* synthetic */ int f120652q = 0;

    /* renamed from: t */
    private static final PlaceFilter f120653t;

    /* renamed from: a */
    public final rkb f120654a;

    /* renamed from: b */
    public final PlaceFilter f120655b;

    /* renamed from: c */
    public final AutocompleteFilter f120656c;

    /* renamed from: d */
    public biig f120657d;

    /* renamed from: e */
    public biie f120658e;

    /* renamed from: f */
    public biic f120659f;

    /* renamed from: g */
    public biid f120660g;

    /* renamed from: h */
    public biia f120661h;

    /* renamed from: i */
    public rke f120662i;

    /* renamed from: j */
    public rke f120663j;

    /* renamed from: k */
    public rke f120664k;

    /* renamed from: l */
    public rke f120665l;

    /* renamed from: m */
    public rke f120666m;

    /* renamed from: n */
    public rke f120667n;

    /* renamed from: o */
    public rke f120668o;

    /* renamed from: p */
    public String f120669p;

    /* renamed from: r */
    private final Context f120670r;

    /* renamed from: s */
    private rke f120671s;

    static {
        aeln d = PlaceFilter.m66912d();
        d.f63494a = Arrays.asList(1007);
        f120653t = d.mo34303a();
    }

    public biij(Context context, String str, String str2, PlaceFilter placeFilter, String str3) {
        sdo.m34959a(context);
        this.f120670r = context;
        rjy rjy = new rjy(this.f120670r);
        rjo rjo = aema.f63501a;
        aemh aemh = new aemh();
        aemh.f63515a = str;
        aemh.f63516b = str3;
        aemh.f63517c = 2;
        rjy.mo24780a(rjo, aemh.mo34328a());
        rjo rjo2 = aema.f63502b;
        aemh aemh2 = new aemh();
        aemh2.f63515a = str;
        aemh2.f63516b = str3;
        aemh2.f63517c = 2;
        rjy.mo24780a(rjo2, aemh2.mo34328a());
        if (!TextUtils.isEmpty(str2)) {
            rjy.mo24778a(str2);
        }
        this.f120654a = rjy.mo24784b();
        this.f120655b = placeFilter;
        boolean b = rfz.m33557a(context).mo24610b(str);
        aeku aeku = new aeku();
        aeku.f63476a = b;
        this.f120656c = aeku.mo34275a();
    }

    /* renamed from: a */
    public static aelh[] m102440a(aeli aeli) {
        if (aeli == null) {
            return new aelh[0];
        }
        aelh[] aelhArr = new aelh[aeli.mo24660a()];
        for (int i = 0; i < aeli.mo24660a(); i++) {
            aelhArr[i] = ((aeoj) aeli.mo24661a(i)).mo7556bF();
        }
        return aelhArr;
    }

    /* renamed from: b */
    public static String m102441b(aeli aeli) {
        String str;
        if (aeli == null || (str = aeli.f63491c) == null) {
            return null;
        }
        return str.toString();
    }

    /* renamed from: b */
    public final void mo64649b() {
        rke rke = this.f120667n;
        if (rke != null) {
            rke.mo9460b();
        }
        rke rke2 = this.f120668o;
        if (rke2 != null) {
            rke2.mo9460b();
        }
        rjo rjo = aema.f63501a;
        rke a = aenc.m52182a(this.f120654a);
        this.f120667n = a;
        a.mo9459a(new bihw(this), cggj.m145237d(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo64646a() {
        rke rke = this.f120663j;
        if (rke != null) {
            rke.mo9460b();
        }
        rke rke2 = this.f120662i;
        if (rke2 != null) {
            rke2.mo9460b();
        }
        rke rke3 = this.f120671s;
        if (rke3 != null) {
            rke3.mo9460b();
        }
        rke rke4 = this.f120664k;
        if (rke4 != null) {
            rke4.mo9460b();
        }
        rke rke5 = this.f120665l;
        if (rke5 != null) {
            rke5.mo9460b();
        }
        rke rke6 = this.f120666m;
        if (rke6 != null) {
            rke6.mo9460b();
        }
        rke rke7 = this.f120667n;
        if (rke7 != null) {
            rke7.mo9460b();
        }
        rke rke8 = this.f120668o;
        if (rke8 != null) {
            rke8.mo9460b();
        }
    }

    /* renamed from: a */
    public final void mo64647a(LatLng latLng) {
        rke rke = this.f120671s;
        if (rke != null) {
            rke.mo9460b();
        }
        rjo rjo = aema.f63501a;
        rke a = aenc.m52183a(this.f120654a, new LatLngBounds(latLng, latLng), 1, null, f120653t);
        this.f120671s = a;
        a.mo9459a(new biif(this), cggj.m145237d(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo64648a(String[] strArr) {
        rke rke = this.f120663j;
        if (rke != null) {
            rke.mo9460b();
        }
        rke rke2 = this.f120662i;
        if (rke2 != null) {
            rke2.mo9460b();
        }
        rke rke3 = this.f120664k;
        if (rke3 != null) {
            rke3.mo9460b();
        }
        rjo rjo = aema.f63501a;
        rke a = aenc.m52185a(this.f120654a, strArr);
        this.f120664k = a;
        a.mo9459a(new biib(this), cggj.m145237d(), TimeUnit.MILLISECONDS);
    }
}
