package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkiv extends bkdx {

    /* renamed from: a */
    private final bjes f124331a = new bjes(1637);

    /* renamed from: b */
    public View[] f124332b;

    /* renamed from: c */
    final ArrayList f124333c = new ArrayList();

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bmji) this.f124069w).f129710c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = new LinearLayout(this.f123962aG);
        int size = ((bmji) this.f124069w).f129712e.size();
        if (size > 3) {
            linearLayout.setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        }
        this.f124332b = new View[size];
        for (int i = 0; i < size; i++) {
            this.f124332b[i] = mo52998a((bmqf) ((bmji) this.f124069w).f129712e.get(i), linearLayout);
            linearLayout.addView(this.f124332b[i], layoutParams);
            bkde bkde = new bkde(((bmqf) ((bmji) this.f124069w).f129712e.get(i)).f130376e, this.f124332b[i], bkft.m105642b((bmqf) ((bmji) this.f124069w).f129712e.get(i)));
            this.f124333c.add(bkde);
            if (mo52776bU() != null) {
                mo52776bU().mo66027a(bkde);
            }
        }
        if (mo52776bU() != null) {
            mo52776bU().mo66038c();
        }
        return linearLayout;
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        String str2 = null;
        if (!mo52806b((List) null)) {
            return "";
        }
        String string = getResources().getString(C0126R.string.wallet_uic_name_list_append_to_end);
        int length = this.f124332b.length;
        for (int i = 0; i < length; i++) {
            String a = bkft.m105634a((Object) this.f124332b[i]);
            if (!TextUtils.isEmpty(a)) {
                if (str2 != null) {
                    str2 = String.format(string, str2, a);
                } else {
                    str2 = a;
                }
            }
        }
        return str2;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return this.f124332b != null;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124333c;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124331a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        View[] viewArr = this.f124332b;
        if (viewArr != null) {
            boolean z = this.f124195aJ;
            for (View view : viewArr) {
                view.setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmji.f129706f.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo52998a(bmqf bmqf, ViewGroup viewGroup) {
        bkfu bkfu = new bkfu(bmqf, this.f123963aH, mo65818aq(), viewGroup);
        bkfu.f124162a = getActivity();
        bkfu.f124164c = mo65980at();
        bkfu.f124165d = this;
        bkfu.f124167f = this;
        return bkfu.mo65971a();
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (!bmaf.f128438a.equals(((bmji) this.f124069w).f129709b)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        if (bmaf2.f128439b != 1) {
            Object[] objArr = new Object[1];
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            objArr[0] = Integer.valueOf(bmaf3.f128439b);
            throw new IllegalArgumentException(String.format("Unknown FormFieldReference fieldId: %d", objArr));
        }
        View[] viewArr = this.f124332b;
        bmaf bmaf4 = bmas.f128496a;
        if (bmaf4 == null) {
            bmaf4 = bmaf.f128436d;
        }
        bkft.m105635a(viewArr[bmaf4.f128440c], bmas.f128497b);
        return true;
    }
}
