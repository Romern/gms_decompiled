package p000;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.LinkView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkjo extends bkdx implements bkeb {

    /* renamed from: a */
    public LinearLayout f124435a;

    /* renamed from: b */
    protected final ArrayList f124436b = new ArrayList();

    /* renamed from: c */
    public final bjes f124437c = new bjes(1666);

    /* renamed from: d */
    private boolean f124438d;

    /* renamed from: a */
    public final View mo66091a(int i) {
        return bkft.m105641b(this.f124435a.getChildAt(i));
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124436b;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124437c;
    }

    /* renamed from: f */
    public final void mo51922f() {
        LinearLayout linearLayout = this.f124435a;
        if (linearLayout != null) {
            boolean z = this.f124195aJ;
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo66091a(i).setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo53016m() {
        String str;
        bmqf[] bmqfArr = (bmqf[]) ((bmkt) this.f124069w).f129889e.toArray(new bmqf[0]);
        for (bmqf bmqf : bmqfArr) {
            bkfu bkfu = new bkfu(bmqf, this.f123963aH, mo65818aq(), this.f124435a);
            bkfu.f124162a = getActivity();
            bkfu.f124164c = mo65980at();
            bkfu.f124165d = this;
            bkfu.f124167f = this;
            View a = bkfu.mo65971a();
            if (this.f124438d) {
                a = bkem.m105437a(this.f123962aG, a, this.f124435a, mo65818aq().mo65614a());
                if ((bmqf.f130372a & 32) != 0) {
                    str = bmqf.f130380i;
                } else {
                    str = null;
                }
                bkem.m105439a(a, str);
            }
            this.f124435a.addView(a);
            this.f124436b.add(new bkde(bmqf.f130376e, a, bkft.m105642b(bmqf)));
            bjwl.m104784a(a, bmqf.f130376e, this.f124196aK);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmkt.f129883g.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmkt) this.f124069w).f129887c;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: t */
    public final bmkv mo66092t() {
        int size = ((bmkt) this.f124069w).f129889e.size();
        bmku bmku = (bmku) bmkv.f129891f.mo74144da();
        bmkt bmkt = (bmkt) this.f124069w;
        if ((bmkt.f129885a & 2) == 0) {
            String str = bmkt.f129886b;
            if (bmku.f164950c) {
                bmku.mo74035c();
                bmku.f164950c = false;
            }
            bmkv bmkv = (bmkv) bmku.f164949b;
            str.getClass();
            bmkv.f129893a |= 1;
            bmkv.f129894b = str;
        } else {
            bmdn bmdn = bmkt.f129887c;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            String str2 = bmdn.f128834b;
            if (bmku.f164950c) {
                bmku.mo74035c();
                bmku.f164950c = false;
            }
            bmkv bmkv2 = (bmkv) bmku.f164949b;
            str2.getClass();
            bmkv2.f129893a |= 1;
            bmkv2.f129894b = str2;
            bmdn bmdn2 = ((bmkt) this.f124069w).f129887c;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            long j = bmdn2.f128835c;
            if (bmku.f164950c) {
                bmku.mo74035c();
                bmku.f164950c = false;
            }
            bmkv bmkv3 = (bmkv) bmku.f164949b;
            bmkv3.f129893a |= 2;
            bmkv3.f129895c = j;
            bmdn bmdn3 = ((bmkt) this.f124069w).f129887c;
            if (bmdn3 == null) {
                bmdn3 = bmdn.f128831k;
            }
            ByteString bxtx = bmdn3.f128836d;
            if (bmku.f164950c) {
                bmku.mo74035c();
                bmku.f164950c = false;
            }
            bmkv bmkv4 = (bmkv) bmku.f164949b;
            bxtx.getClass();
            bmkv4.f129893a |= 4;
            bmkv4.f129896d = bxtx;
        }
        for (int i = 0; i < size; i++) {
            bmku.mo66800a(bkft.m105631a(mo66091a(i), (bmqf) ((bmkt) this.f124069w).f129889e.get(i)));
        }
        return (bmkv) bmku.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bwhm bwhm;
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.internalUicMaterialFieldLayoutEnabled});
        this.f124438d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_tax_info_entry, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.tax_info_fields_container);
        this.f124435a = linearLayout;
        linearLayout.removeAllViews();
        this.f124436b.clear();
        mo53016m();
        bmkt bmkt = (bmkt) this.f124069w;
        if ((bmkt.f129885a & 8) != 0) {
            bwhm bwhm2 = bmkt.f129890f;
            if (bwhm2 == null) {
                bwhm = bwhm.f159522h;
            } else {
                bwhm = bwhm2;
            }
            LinkView a = LinkView.m118644a(bwhm, this.f123962aG, this.f124435a, this.f123963aH, mo65818aq(), this);
            ArrayList arrayList = this.f124436b;
            bwhm bwhm3 = ((bmkt) this.f124069w).f129890f;
            if (bwhm3 == null) {
                bwhm3 = bwhm.f159522h;
            }
            arrayList.add(new bkde(bwhm3.f159525b, a, null));
            this.f124435a.addView(a);
        }
        return inflate;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52944a(Bundle bundle) {
        return mo66092t();
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        String str;
        bmkt bmkt = (bmkt) this.f124069w;
        if ((bmkt.f129885a & 2) == 0) {
            str = bmkt.f129886b;
        } else {
            bmdn bmdn = bmkt.f129887c;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            str = bmdn.f128834b;
        }
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (!bmaf.f128438a.equals(str)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        if (bmaf2.f128439b != 1) {
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            int i = bmaf3.f128439b;
            StringBuilder sb = new StringBuilder(55);
            sb.append("TaxInfoForm does not support field with id: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        bmaf bmaf4 = bmas.f128496a;
        if (bmaf4 == null) {
            bmaf4 = bmaf.f128436d;
        }
        int i2 = bmaf4.f128440c;
        if (i2 < 0 || i2 >= ((bmkt) this.f124069w).f129889e.size()) {
            int size = ((bmkt) this.f124069w).f129889e.size();
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("FormFieldMessage repeatedFieldIndex: ");
            sb2.append(i2);
            sb2.append(" is out of range [0,");
            sb2.append(size);
            sb2.append(")");
            throw new IllegalArgumentException(sb2.toString());
        }
        bkft.m105635a(mo66091a(i2), bmas.f128497b);
        return true;
    }
}
