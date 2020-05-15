package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjgw extends bjil implements bjgu, bjhd {

    /* renamed from: a */
    public bjgv f122698a;

    /* renamed from: b */
    public bwyz f122699b;

    /* renamed from: c */
    public bjxv f122700c;

    /* renamed from: d */
    public C1230nw f122701d;

    /* renamed from: e */
    public C1230nw f122702e;

    /* renamed from: f */
    public final ArrayList f122703f = new ArrayList();

    /* renamed from: g */
    public boolean f122704g;

    /* renamed from: h */
    long f122705h;

    /* renamed from: i */
    int f122706i;

    /* renamed from: j */
    private final bjhc f122707j;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean
     arg types: [android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig]
     candidates:
      bjhf.a(android.content.ContextWrapper, com.google.android.wallet.bender3.framework.client.WidgetConfig):void
      bjhf.a(android.content.Context, com.google.android.wallet.bender3.framework.client.WidgetConfig):boolean */
    public bjgw(bjhi bjhi, CoordinatorLayout coordinatorLayout, Bundle bundle) {
        int length;
        this.f122704g = false;
        this.f122705h = -1;
        this.f122706i = -1;
        this.f122707j = new bjhc(coordinatorLayout);
        bjgy bjgy = new bjgy(bjhi, this.f122707j);
        bjgj bjgj = new bjgj();
        bngs bngs = new bngs();
        if (bjhf.m103484a((Context) bjhi.f122732i, bjhi.f122724a)) {
            bxvd da = bwww.f161292d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwww bwww = (bwww) da.f164949b;
            bwww.f161295b = 2;
            bwww.f161294a |= 1;
            bngs.mo67668c((bwww) da.mo74062i());
        }
        bjgv bjgv = new bjgv(bjhi, bjgy, bjgj, new bjkb(bngs.mo67664a()), this);
        this.f122698a = bjgv;
        mo65286a(1, bjgv.f122693b);
        if (bundle != null) {
            this.f122700c = bjxv.m104860b(bundle.getBundle("idGenerator"));
            long[] longArray = bundle.getLongArray("uiReferences");
            Parcelable[] parcelableArray = bundle.getParcelableArray("idGeneratorStates");
            if (!(longArray == null || parcelableArray == null || (length = longArray.length) != parcelableArray.length)) {
                this.f122702e = new C1230nw(length);
                for (int i = 0; i < length; i++) {
                    this.f122702e.mo15540b(longArray[i], bjxv.m104860b((Bundle) parcelableArray[i]));
                }
            }
            bwyz bwyz = (bwyz) bjhq.m103511a(bundle, "page", bwyz.f161561h);
            if (bwyz != null) {
                mo65199a(bwyz, bundle);
            }
            this.f122705h = bundle.getLong("tokenizationCallbackDataReference", -1);
        }
    }

    /* renamed from: a */
    public final int mo65197a() {
        int i = this.f122706i;
        this.f122706i = i - 1;
        return i;
    }

    /* renamed from: c */
    public final void mo65200c() {
        bjgv bjgv = this.f122698a;
        bjgy bjgy = bjgv.f122694c;
        bwxl bwxl = this.f122699b.f161564b;
        if (bwxl == null) {
            bwxl = bwxl.f161383i;
        }
        bxwc bxwc = this.f122699b.f161565c;
        bjhc bjhc = bjgy.f122710c;
        bjgt bjgt = bjhc.f122719c;
        if (bjgt != null) {
            bjgt.mo65178k();
            bjhc.mo65219a();
        }
        ArrayList arrayList = bjhc.f122720d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjgt) arrayList.get(i)).mo65178k();
        }
        bjhc.mo65220b();
        for (int b = bjgy.f122708a.mo15537b() - 1; b >= 0; b--) {
            bjgt bjgt2 = (bjgt) bjgy.f122708a.mo15538b(b);
            int i2 = bjgt2.f122677b.f161390f;
            ArrayDeque arrayDeque = (ArrayDeque) bjgy.f122709b.mo15646f(i2);
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                bjgy.f122709b.mo15637a(i2, arrayDeque);
            }
            arrayDeque.push(bjgt2);
        }
        bjgy.f122708a.mo15542c();
        bjgt a = bjgy.mo65206a(bjgv, bwxl);
        ArrayList arrayList2 = new ArrayList(bxwc.size());
        int size2 = bxwc.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(bjgy.mo65206a(bjgv, (bwxl) bxwc.get(i3)));
        }
        bjhc bjhc2 = bjgy.f122710c;
        if (bjhc2.f122719c != a) {
            bjhc2.mo65219a();
            bjhc2.f122719c = a;
            if (a != null) {
                a.mo65161a(bjhc2);
                bjhc2.f122717a.mo65215a(0, a.f122679d);
            }
        }
        bjhc bjhc3 = bjgy.f122710c;
        bjhc3.mo65220b();
        bjhc3.f122720d.ensureCapacity(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bjgt bjgt3 = (bjgt) arrayList2.get(i4);
            bjgt3.mo65161a(bjhc3);
            bjhc3.f122720d.add(bjgt3);
        }
        for (int i5 = 0; i5 < bjgy.f122709b.mo15640c(); i5++) {
            ArrayDeque arrayDeque2 = (ArrayDeque) bjgy.f122709b.mo15641c(i5);
            if (arrayDeque2 != null) {
                while (!arrayDeque2.isEmpty()) {
                    ((bjgt) arrayDeque2.pop()).mo65180m();
                }
            }
        }
        bjgy.f122709b.mo15644d();
        bjhc bjhc4 = bjgy.f122710c;
        bjgt bjgt4 = bjhc4.f122719c;
        if (bjgt4 != null) {
            bjgt4.mo65176j();
        }
        ArrayList arrayList3 = bjhc4.f122720d;
        int size4 = arrayList3.size();
        for (int i6 = 0; i6 < size4; i6++) {
            ((bjgt) arrayList3.get(i6)).mo65176j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cC */
    public final void mo65201cC() {
        bjhc bjhc = this.f122698a.f122694c.f122710c;
        bjhc.f122719c = null;
        bjhc.f122720d.clear();
    }

    /* renamed from: d */
    public final void mo65202d() {
        bxay bxay;
        this.f122704g = false;
        this.f122698a.f122695d.f122660c.clear();
        bxwc bxwc = this.f122699b.f161569g;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bxaz bxaz = (bxaz) bxwc.get(i);
            bpsg bpsg = bpsg.EVENT_TYPE_UNKNOWN;
            bpsg a = bpsg.m112232a(bxaz.f161769c);
            if (a == null) {
                a = bpsg.EVENT_TYPE_UNKNOWN;
            }
            int ordinal = a.ordinal();
            if (ordinal == 6) {
                this.f122704g = true;
            } else if (ordinal == 7) {
                bjgj bjgj = this.f122698a.f122695d;
                if (bxaz.f161767a == 2) {
                    bxay = (bxay) bxaz.f161768b;
                } else {
                    bxay = bxay.f161761b;
                }
                bjgj.f122660c.add(Long.valueOf(bxay.f161763a));
            }
        }
    }

    /* renamed from: e */
    public final void mo65203e() {
        bxvd da = bpsk.f138966h.mo74144da();
        long j = this.f122698a.f122692a.f122725b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk = (bpsk) da.f164949b;
        bpsk.f138968a |= 1;
        bpsk.f138971d = j;
        bpsg bpsg = bpsg.EVENT_TYPE_PAGE_INTERACTABLE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk2 = (bpsk) da.f164949b;
        bpsk2.f138972e = bpsg.f138957l;
        bpsk2.f138968a |= 2;
        bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), this.f122698a.f122692a.f122724a.mo71762a());
    }

    /* renamed from: f */
    public final void mo65204f() {
        ArrayList arrayList = this.f122703f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjhd) arrayList.get(i)).mo65204f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        if (this.f122700c != null) {
            Bundle bundle2 = new Bundle();
            this.f122700c.mo65615a(bundle2);
            bundle.putBundle("idGenerator", bundle2);
        }
        C1230nw nwVar = this.f122702e;
        if (nwVar != null) {
            int b = nwVar.mo15537b();
            long[] jArr = new long[b];
            Bundle[] bundleArr = new Bundle[b];
            for (int i = 0; i < b; i++) {
                long a = this.f122702e.mo15533a(i);
                jArr[i] = a;
                bjxv bjxv = (bjxv) this.f122702e.mo15534a(a);
                bmxy.m108582a(bjxv, String.format(Locale.US, "Unable to retrieve idGenerator associated with uiReference %s.", Long.valueOf(a)));
                Bundle bundle3 = new Bundle();
                bjxv.mo65615a(bundle3);
                bundleArr[i] = bundle3;
            }
            bundle.putLongArray("uiReferences", jArr);
            bundle.putParcelableArray("idGeneratorStates", bundleArr);
        }
        bwyz bwyz = this.f122699b;
        if (bwyz != null) {
            bjhq.m103514b(bundle, "page", bwyz);
        }
        bundle.putLong("tokenizationCallbackDataReference", this.f122705h);
    }

    /* renamed from: a */
    public final void mo65198a(bwyz bwyz) {
        mo65199a(bwyz, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65199a(bwyz bwyz, Bundle bundle) {
        boolean z = false;
        if (this.f122699b != null) {
            if (this.f122702e != null) {
                this.f122702e = null;
            }
            bjkb bjkb = this.f122698a.f122697f;
            bjkb.f122849a.mo15644d();
            bjkb.f122851c.clear();
            bjkb.f122850b.mo15644d();
            bjge bjge = this.f122698a.f122693b;
            bjge.f122651a.mo15542c();
            if (bjge.f122793o != null) {
                int F = bjge.mo65285F();
                for (int i = 0; i < F; i++) {
                    bjge.mo65290c(bjge.f122793o.mo15533a(i));
                }
                bjge.f122793o.mo15542c();
            }
        }
        if (this.f122792n == 3) {
            mo65281B();
            z = true;
        }
        this.f122699b = bwyz;
        mo65202d();
        this.f122698a.f122695d.mo65147a(this.f122699b.f161566d);
        bjkb bjkb2 = this.f122698a.f122697f;
        bwzd bwzd = bwyz.f161567e;
        if (bwzd == null) {
            bwzd = bwzd.f161575b;
        }
        bjkb2.mo65335a(bwzd);
        this.f122698a.f122693b.mo65132a(bngx.m109376e(), this.f122699b.f161566d, bngx.m109376e(), bjil.m103603a(1, bundle));
        mo65200c();
        if (z) {
            mo65280A();
        }
        if (bundle == null) {
            this.f122707j.f122718b.requestFocus();
            bwyz bwyz2 = this.f122699b;
            if ((bwyz2.f161563a & 4) != 0) {
                bjho.m103508a(this.f122698a.f122692a.f122732i, bwyz2.f161568f);
            }
            if (this.f122704g) {
                mo65203e();
            }
        }
    }
}
