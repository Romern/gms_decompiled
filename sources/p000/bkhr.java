package p000;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: bkhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkhr extends bkdx {

    /* renamed from: a */
    public InfoMessageView f124228a;

    /* renamed from: b */
    public View[] f124229b;

    /* renamed from: c */
    private ViewGroup f124230c;

    /* renamed from: d */
    private final ArrayList f124231d = new ArrayList();

    /* renamed from: e */
    private final bkip f124232e = new bkip();

    /* renamed from: f */
    private final bjes f124233f = new bjes(1700);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmnr bmnr;
        int i;
        LayoutInflater layoutInflater2 = layoutInflater;
        boolean z = false;
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.internalUicVerifyAssociationRootLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater2.inflate(resourceId, viewGroup, false);
            this.f124230c = (ViewGroup) viewGroup2.findViewById(C0126R.C0129id.ui_fields_container);
            this.f124229b = new View[((bmil) this.f124069w).f129592c.size()];
            bxwc bxwc = ((bmil) this.f124069w).f129592c;
            ViewGroup viewGroup3 = this.f124230c;
            View[] viewArr = this.f124229b;
            ArrayList arrayList = this.f124231d;
            bjxv aq = mo65818aq();
            int i2 = 0;
            while (true) {
                bmnr = null;
                if (i2 >= bxwc.size()) {
                    break;
                }
                bmqf bmqf = (bmqf) bxwc.get(i2);
                if (bmqf.f130383l.size() > 0) {
                    int a = bmph.m108253a(bmqf.f130384m);
                    if (a == 0) {
                        i = 0;
                    } else if (a == 2) {
                        i = 0;
                    }
                    while (i < bmqf.f130383l.size()) {
                        ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) layoutInflater2.inflate((int) C0126R.C0128layout.view_ui_field_image_horizontally_centered, viewGroup3, z);
                        imageWithCaptionView.mo71991a((bmno) bmqf.f130383l.get(i));
                        viewGroup3.addView(imageWithCaptionView);
                        arrayList.add(new bkde(0, imageWithCaptionView, null));
                        i++;
                        viewArr = viewArr;
                        z = false;
                    }
                }
                View a2 = new bkfu(bmqf, layoutInflater2, aq, viewGroup3).mo65971a();
                viewArr[i2] = a2;
                viewGroup3.addView(a2);
                arrayList.add(new bkde(bmqf.f130376e, viewArr[i2], bkft.m105642b(bmqf)));
                i2++;
                viewArr = viewArr;
                z = false;
            }
            this.f124228a = (InfoMessageView) viewGroup2.findViewById(C0126R.C0129id.required_message_text);
            if ((((bmil) this.f124069w).f129590a & 512) != 0) {
                this.f124228a.setVisibility(0);
                this.f124228a.f152084h = mo65982av();
                InfoMessageView infoMessageView = this.f124228a;
                bmjf bmjf = ((bmil) this.f124069w).f129595f;
                if (bmjf == null) {
                    bmjf = bmjf.f129685i;
                }
                if ((bmjf.f129687a & 2) != 0) {
                    bmjf bmjf2 = ((bmil) this.f124069w).f129595f;
                    if (bmjf2 == null) {
                        bmjf2 = bmjf.f129685i;
                    }
                    bmnr = bmjf2.f129689c;
                    if (bmnr == null) {
                        bmnr = bmnr.f130153o;
                    }
                }
                infoMessageView.mo72003a(bmnr);
            }
            return viewGroup2;
        }
        throw new IllegalArgumentException("Attribute internalUicVerifyAssociationRootLayout must be defined.");
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f124232e;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        if (this.f124228a.getVisibility() == 0) {
            return Collections.singletonList(this.f124228a);
        }
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124231d;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124233f;
    }

    /* renamed from: f */
    public final void mo51922f() {
        InfoMessageView infoMessageView = this.f124228a;
        if (infoMessageView != null) {
            infoMessageView.setEnabled(this.f124195aJ);
            int childCount = this.f124230c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f124230c.getChildAt(i).setEnabled(this.f124195aJ);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmil.f129588g.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmil) this.f124069w).f129591b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmil) this.f124069w).f129591b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!str.equals(bmdn.f128834b)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        if (bmaf2.f128439b != 2) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            objArr[0] = Integer.valueOf(bmaf3.f128439b);
            throw new IllegalArgumentException(String.format(locale, "Unknown FormFieldMessage fieldId: %d", objArr));
        }
        View[] viewArr = this.f124229b;
        bmaf bmaf4 = bmas.f128496a;
        if (bmaf4 == null) {
            bmaf4 = bmaf.f128436d;
        }
        bkft.m105635a(viewArr[bmaf4.f128440c], bmas.f128497b);
        return true;
    }
}
