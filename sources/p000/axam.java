package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axam extends bkdx implements bkeb {

    /* renamed from: a */
    final ArrayList f95530a = new ArrayList(2);

    /* renamed from: b */
    final ArrayList f95531b = new ArrayList(2);

    /* renamed from: c */
    final ArrayList f95532c = new ArrayList(2);

    /* renamed from: d */
    final ArrayList f95533d = new ArrayList(2);

    /* renamed from: e */
    final ArrayList f95534e = new ArrayList(2);

    /* renamed from: f */
    private final SparseArray f95535f = new SparseArray(2);

    /* renamed from: g */
    private final SparseArray f95536g = new SparseArray(2);

    /* renamed from: h */
    private final bjes f95537h = new bjes(32);

    /* renamed from: i */
    private final bkip f95538i = new bkip();

    /* renamed from: j */
    private String f95539j;

    /* renamed from: T */
    public final ArrayList mo52820T() {
        ArrayList T = super.mo52820T();
        T.addAll(this.f95530a);
        int size = this.f95532c.size();
        for (int i = 0; i < size; i++) {
            T.add(((bkbn) this.f95532c.get(i)).mo52710b());
        }
        T.addAll(this.f95533d);
        return T;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        int size = this.f95531b.size();
        for (int i = 0; i < size; i++) {
            if (!((awzs) this.f95531b.get(i)).mo52775bR()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95538i;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95534e;
    }

    /* renamed from: ck */
    public final View mo52945ck() {
        View ck = super.mo52945ck();
        return (ck != null || this.f95532c.isEmpty()) ? ck : (View) this.f95532c.get(0);
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95537h;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        int size = mo52820T().size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) mo52820T().get(i2)).setVisibility(i);
        }
    }

    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        int size = this.f95531b.size();
        for (int i = 0; i < size; i++) {
            ((awzs) this.f95531b.get(i)).mo52808n(z);
        }
        int size2 = this.f95532c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bkbn) this.f95532c.get(i2)).mo52710b().setEnabled(z);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95539j = getArguments().getString("flowAnalyticsId");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmfd.f129071d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmfd) this.f124069w).f129073a;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    private final awzs m81949a(bmeb bmeb, ViewGroup viewGroup) {
        bmqf bmqf;
        bmdx bmdx;
        bxvd bxvd = (bxvd) bmeb.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmeb);
        bmdz bmdz = (bmdz) bxvd;
        bmdn bmdn = ((bmeb) bmdz.f164949b).f128905b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        bxvd bxvd2 = (bxvd) bmdn.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bmdn);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bmdn bmdn2 = (bmdn) bxvd2.f164949b;
        bmdn2.f128839g = 1;
        bmdn2.f128833a |= 16;
        if (bmdz.f164950c) {
            bmdz.mo74035c();
            bmdz.f164950c = false;
        }
        bmeb bmeb2 = (bmeb) bmdz.f164949b;
        bmdn bmdn3 = (bmdn) bxvd2.mo74062i();
        bmeb bmeb3 = bmeb.f128902g;
        bmdn3.getClass();
        bmeb2.f128905b = bmdn3;
        bmeb2.f128904a |= 1;
        for (int i = 0; i < ((bmeb) bmdz.f164949b).f128906c.size(); i++) {
            bmea bmea = (bmea) ((bmeb) bmdz.f164949b).f128906c.get(i);
            if (bmea.f128899a == 2) {
                bmdx bmdx2 = (bmdx) bmea.f128900b;
                if (bmdx2.f128888a == 1) {
                    bmqf = (bmqf) bmdx2.f128889b;
                } else {
                    bmqf = bmqf.f130370r;
                }
                if (!bmxi.m108538a(bmqf, bmqf.f130370r)) {
                    bxvd bxvd3 = (bxvd) bmqf.mo74142c(5);
                    bxvd3.mo73625a((GeneratedMessageLite) bmqf);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bmqf bmqf2 = (bmqf) bxvd3.f164949b;
                    "".getClass();
                    bmqf2.f130372a |= 32;
                    bmqf2.f130380i = "";
                    bmqf = (bmqf) bxvd3.mo74062i();
                }
                bxvd bxvd4 = (bxvd) bmea.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) bmea);
                if (bmea.f128899a == 2) {
                    bmdx = (bmdx) bmea.f128900b;
                } else {
                    bmdx = bmdx.f128886d;
                }
                bxvd bxvd5 = (bxvd) bmdx.mo74142c(5);
                bxvd5.mo73625a((GeneratedMessageLite) bmdx);
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bmdx bmdx3 = (bmdx) bxvd5.f164949b;
                bmdx bmdx4 = bmdx.f128886d;
                bmqf.getClass();
                bmdx3.f128889b = bmqf;
                bmdx3.f128888a = 1;
                bmdx bmdx5 = (bmdx) bxvd5.mo74062i();
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bmea bmea2 = (bmea) bxvd4.f164949b;
                bmea bmea3 = bmea.f128897c;
                bmdx5.getClass();
                bmea2.f128900b = bmdx5;
                bmea2.f128899a = 2;
                bmdz.mo66782a(i, bxvd4);
            }
        }
        bmeb bmeb4 = (bmeb) bmdz.mo74062i();
        FragmentManager childFragmentManager = getChildFragmentManager();
        bmdn bmdn4 = bmeb4.f128905b;
        if (bmdn4 == null) {
            bmdn4 = bmdn.f128831k;
        }
        awzs awzs = (awzs) childFragmentManager.findFragmentByTag(bmdn4.f128834b);
        if (awzs == null) {
            awzs = awzs.m81799a(bmeb4, this.f123961aF, this.f95539j, true, this.f123964aI);
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            int id = viewGroup.getId();
            bmdn bmdn5 = bmeb4.f128905b;
            if (bmdn5 == null) {
                bmdn5 = bmdn.f128831k;
            }
            beginTransaction.add(id, awzs, bmdn5.f128834b).commit();
        }
        awzs.f124196aK = this.f124196aK;
        this.f95531b.add(awzs);
        this.f95534e.add(new bkde(awzs));
        return awzs;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater2.inflate((int) C0126R.C0128layout.wallet_fragment_dynamic_list, viewGroup, false);
        bxwc bxwc = ((bmfd) this.f124069w).f129074b;
        int size = bxwc.size();
        int i = 0;
        while (true) {
            int i2 = C0126R.C0128layout.wallet_view_separator;
            if (i < size) {
                bmff bmff = (bmff) bxwc.get(i);
                ViewGroup viewGroup3 = (ViewGroup) layoutInflater2.inflate((int) C0126R.C0128layout.wallet_view_existing_item, viewGroup2, false);
                viewGroup3.setId(mo65818aq().mo65614a());
                this.f95530a.add(viewGroup3);
                viewGroup2.addView(viewGroup3);
                ArrayList arrayList = new ArrayList();
                bxwc bxwc2 = bmff.f129089c;
                int size2 = bxwc2.size();
                int i3 = 0;
                while (i3 < size2) {
                    bmfi bmfi = (bmfi) bxwc2.get(i3);
                    if (bmfi.f129101a == 1) {
                        arrayList.add(m81949a((bmeb) bmfi.f129102b, viewGroup3));
                        i3++;
                        i2 = C0126R.C0128layout.wallet_view_separator;
                    } else {
                        throw new IllegalArgumentException("Received empty SubItem in DynamicList.");
                    }
                }
                this.f95536g.put(viewGroup3.getId(), arrayList);
                if ((1 & bmff.f129087a) != 0) {
                    bmeb bmeb = bmff.f129088b;
                    if (bmeb == null) {
                        bmeb = bmeb.f128902g;
                    }
                    this.f95535f.put(viewGroup3.getId(), m81949a(bmeb, viewGroup3));
                }
                View inflate = layoutInflater2.inflate(i2, viewGroup2, false);
                this.f95533d.add(inflate);
                viewGroup2.addView(inflate);
                i++;
            } else {
                bxwc bxwc3 = ((bmfd) this.f124069w).f129075c;
                int size3 = bxwc3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    bmfh bmfh = (bmfh) bxwc3.get(i4);
                    if (!TextUtils.isEmpty(bmfh.f129098b)) {
                        bxvd da = bmdb.f128767k.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmdb bmdb = (bmdb) da.f164949b;
                        bmdb.f128777i = 7;
                        int i5 = bmdb.f128769a | 128;
                        bmdb.f128769a = i5;
                        int i6 = i5 | 2;
                        bmdb.f128769a = i6;
                        bmdb.f128771c = false;
                        if ((bmfh.f129097a & 1) != 0) {
                            String str = bmfh.f129098b;
                            str.getClass();
                            bmdb.f128769a = i6 | 8;
                            bmdb.f128773e = str;
                        }
                        bkbn bkbn = (bkbn) layoutInflater2.inflate((int) C0126R.C0128layout.view_link_button, viewGroup2, false);
                        bkbn.mo52703a().setTextColor(bkfr.m105600c(this.f123962aG));
                        bkbn.mo52707a((bmdb) da.mo74062i());
                        int dimension = (int) getResources().getDimension(C0126R.dimen.wallet_dynamic_list_item_margin_top_bottom);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bkbn.mo52710b().getLayoutParams();
                        marginLayoutParams.topMargin = dimension;
                        marginLayoutParams.bottomMargin = dimension;
                        bkbn.mo52710b().setLayoutParams(marginLayoutParams);
                        this.f95532c.add(bkbn);
                        viewGroup2.addView(bkbn.mo52710b());
                        View inflate2 = layoutInflater2.inflate((int) C0126R.C0128layout.wallet_view_separator, viewGroup2, false);
                        this.f95533d.add(inflate2);
                        viewGroup2.addView(inflate2);
                    }
                }
                this.f95538i.mo66038c();
                return viewGroup2;
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52944a(Bundle bundle) {
        bxvd da = bmfe.f129078f.mo74144da();
        bmdn bmdn = ((bmfd) this.f124069w).f129073a;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        long j = bmdn.f128835c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmfe bmfe = (bmfe) da.f164949b;
        bmfe.f129080a |= 1;
        bmfe.f129081b = j;
        bmdn bmdn2 = ((bmfd) this.f124069w).f129073a;
        if (bmdn2 == null) {
            bmdn2 = bmdn.f128831k;
        }
        ByteString bxtx = bmdn2.f128836d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmfe bmfe2 = (bmfe) da.f164949b;
        bxtx.getClass();
        bmfe2.f129080a |= 2;
        bmfe2.f129082c = bxtx;
        int size = ((bmfd) this.f124069w).f129074b.size();
        for (int i = 0; i < size; i++) {
            bmff bmff = (bmff) ((bmfd) this.f124069w).f129074b.get(i);
            if (bmff.f129090d) {
                ViewGroup viewGroup = (ViewGroup) this.f95530a.get(i);
                if (bmff.f129089c.size() > 0) {
                    bxvd da2 = bmfg.f129092b.mo74144da();
                    ArrayList arrayList = (ArrayList) this.f95536g.get(viewGroup.getId());
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bmed c = ((awzs) arrayList.get(i2)).mo52944a(bundle);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bmfg bmfg = (bmfg) da2.f164949b;
                        c.getClass();
                        if (!bmfg.f129094a.mo73666a()) {
                            bmfg.f129094a = GeneratedMessageLite.m124021a(bmfg.f129094a);
                        }
                        bmfg.f129094a.add(c);
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmfe bmfe3 = (bmfe) da.f164949b;
                    bmfg bmfg2 = (bmfg) da2.mo74062i();
                    bmfg2.getClass();
                    if (!bmfe3.f129084e.mo73666a()) {
                        bmfe3.f129084e = GeneratedMessageLite.m124021a(bmfe3.f129084e);
                    }
                    bmfe3.f129084e.add(bmfg2);
                }
                if ((bmff.f129087a & 1) != 0) {
                    bmed c2 = ((awzs) this.f95535f.get(viewGroup.getId())).mo52944a(bundle);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmfe bmfe4 = (bmfe) da.f164949b;
                    c2.getClass();
                    if (!bmfe4.f129083d.mo73666a()) {
                        bmfe4.f129083d = GeneratedMessageLite.m124021a(bmfe4.f129083d);
                    }
                    bmfe4.f129083d.add(c2);
                }
            }
        }
        return (bmfe) da.mo74062i();
    }
}
