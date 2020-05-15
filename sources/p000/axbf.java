package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.wallet.clientlog.LogContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbf extends bkdx {

    /* renamed from: a */
    public axba f95676a;

    /* renamed from: b */
    bjzo f95677b;

    /* renamed from: c */
    axaz f95678c;

    /* renamed from: d */
    axbt f95679d;

    /* renamed from: e */
    public final bjes f95680e = new bjes(6);

    /* renamed from: f */
    private final ArrayList f95681f = new ArrayList(2);

    /* renamed from: g */
    private final bkip f95682g = new bkip();

    /* renamed from: h */
    private boolean f95683h;

    /* renamed from: i */
    private boolean f95684i;

    /* renamed from: a */
    public static axbf m82146a(bmie bmie, int i, LogContext logContext) {
        axbf axbf = new axbf();
        axbf.setArguments(bkdx.m105383a(i, bmie, logContext));
        return axbf;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        axba axba = this.f95676a;
        if (axba != null && !axba.mo52775bR()) {
            return false;
        }
        axaz axaz = this.f95678c;
        if (axaz != null && !axaz.mo52775bR()) {
            return false;
        }
        if (this.f95677b == null) {
        }
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95682g;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        ArrayList arrayList = new ArrayList(2);
        axba axba = this.f95676a;
        if (axba != null) {
            arrayList.add(axba);
        }
        axaz axaz = this.f95678c;
        if (axaz != null) {
            arrayList.add(axaz);
        }
        bjzo bjzo = this.f95677b;
        if (bjzo != null) {
            arrayList.add(bjzo);
        }
        return arrayList;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95681f;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        axba axba = this.f95676a;
        if (axba != null) {
            axba.mo52947bY();
        }
        axaz axaz = this.f95678c;
        if (axaz != null) {
            axaz.mo52947bY();
        }
        bjzo bjzo = this.f95677b;
        if (bjzo != null) {
            bjzo.mo52947bY();
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95680e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        axba axba = this.f95676a;
        if (axba != null) {
            axba.mo52808n(z);
        }
        axaz axaz = this.f95678c;
        if (axaz != null) {
            axaz.mo52808n(z);
        }
        bjzo bjzo = this.f95677b;
        if (bjzo != null) {
            bjzo.mo52808n(z);
        }
        axbt axbt = this.f95679d;
        if (axbt != null) {
            axbt.mo52808n(z);
        }
    }

    /* renamed from: m */
    public final bmif mo52980m() {
        bjzo bjzo;
        axaz axaz;
        axba axba;
        bxvd da = bmif.f129564j.mo74144da();
        bmdn bmdn = ((bmie) this.f124069w).f129549b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!bmdn.f128834b.isEmpty()) {
            bmdn bmdn2 = ((bmie) this.f124069w).f129549b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            String str = bmdn2.f128834b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmif bmif = (bmif) da.f164949b;
            str.getClass();
            bmif.f129566a |= 1;
            bmif.f129567b = str;
        }
        bmdn bmdn3 = ((bmie) this.f124069w).f129549b;
        if (bmdn3 == null) {
            bmdn3 = bmdn.f128831k;
        }
        if (!bmdn3.f128836d.mo73779j()) {
            bmdn bmdn4 = ((bmie) this.f124069w).f129549b;
            if (bmdn4 == null) {
                bmdn4 = bmdn.f128831k;
            }
            bxtx bxtx = bmdn4.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmif bmif2 = (bmif) da.f164949b;
            bxtx.getClass();
            bmif2.f129566a |= 2;
            bmif2.f129568c = bxtx;
        }
        if (this.f95683h && (axba = this.f95676a) != null) {
            if (axba.mo52968m()) {
                int h = axba.f95603b.mo66002h();
                int i = axba.f95603b.mo66003i();
                if (h > 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmif bmif3 = (bmif) da.f164949b;
                    bmif3.f129566a |= 4;
                    bmif3.f129569d = h;
                }
                if (i > 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmif bmif4 = (bmif) da.f164949b;
                    bmif4.f129566a |= 8;
                    bmif4.f129570e = i;
                }
            }
            if (axba.mo52970t() && !TextUtils.isEmpty(axba.f95604c.getText().toString())) {
                String obj = axba.f95604c.getText().toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmif bmif5 = (bmif) da.f164949b;
                obj.getClass();
                bmif5.f129566a |= 16;
                bmif5.f129571f = obj;
            }
        }
        if (this.f95684i && (axaz = this.f95678c) != null && !TextUtils.isEmpty(axaz.mo52967m())) {
            String m = this.f95678c.mo52967m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmif bmif6 = (bmif) da.f164949b;
            m.getClass();
            bmif6.f129566a |= 64;
            bmif6.f129573h = m;
        }
        if (!((((bmie) this.f124069w).f129548a & 4096) == 0 || (bjzo = this.f95677b) == null)) {
            bmbs a = bjzo.mo52928a(Bundle.EMPTY);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmif bmif7 = (bmif) da.f164949b;
            a.getClass();
            bmif7.f129572g = a;
            bmif7.f129566a |= 32;
        }
        axbt axbt = this.f95679d;
        if (axbt != null) {
            String str2 = axbt.f95734b.f129693g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmif bmif8 = (bmif) da.f164949b;
            str2.getClass();
            bmif8.f129566a |= 128;
            bmif8.f129574i = str2;
        }
        return (bmif) da.mo74062i();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(bmid.CVC) || !new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(bmid.EXPIRATION_MONTH) || !new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(bmid.EXPIRATION_YEAR)) {
            z = true;
        } else {
            z = false;
        }
        this.f95683h = z;
        this.f95684i = !new bxvv(((bmie) this.f124069w).f129562o, bmie.f129545p).contains(bmid.CARDHOLDER_NAME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmie.f129546r.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmie) this.f124069w).f129549b;
        return bmdn == null ? bmdn.f128831k : bmdn;
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
        String str;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_credit_card_update, viewGroup, false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (this.f95683h) {
            axba axba = (axba) childFragmentManager.findFragmentByTag("creditCardExpirationDateFragment");
            this.f95676a = axba;
            if (axba == null) {
                int i = this.f123961aF;
                LogContext at = mo65980at();
                axba axba2 = new axba();
                axba2.setArguments(bkdx.m105383a(i, (bmie) this.f124069w, at));
                this.f95676a = axba2;
                childFragmentManager.beginTransaction().replace(C0126R.C0129id.expiration_date_form_holder, this.f95676a, "creditCardExpirationDateFragment").commit();
            }
            this.f95681f.add(new bkde(this.f95676a));
            this.f95682g.mo66032a(this.f95676a);
        }
        if (this.f95684i) {
            axaz axaz = (axaz) childFragmentManager.findFragmentByTag("cardHolderNameFragment");
            this.f95678c = axaz;
            if (axaz == null) {
                bmie bmie = (bmie) this.f124069w;
                if ((bmie.f129548a & 8192) != 0) {
                    bmif bmif = bmie.f129561n;
                    if (bmif == null) {
                        bmif = bmif.f129564j;
                    }
                    str = bmif.f129573h;
                } else {
                    str = null;
                }
                bxxc bxxc = this.f124069w;
                bmie bmie2 = (bmie) bxxc;
                String str2 = bmie2.f129550c;
                bmdn bmdn = bmie2.f129549b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                this.f95678c = axaz.m82058a(bxxc, str2, bmdn.f128835c, 4, str, this.f123961aF, mo65980at());
                childFragmentManager.beginTransaction().replace(C0126R.C0129id.card_holder_name_fragment_holder, this.f95678c, "cardHolderNameFragment").commit();
            }
            this.f95681f.add(new bkde(this.f95678c));
            this.f95682g.mo66032a(this.f95678c);
        }
        bmie bmie3 = (bmie) this.f124069w;
        if ((bmie3.f129548a & 4096) != 0) {
            bmbr bmbr = bmie3.f129560m;
            if (bmbr == null) {
                bmbr = bmbr.f128572L;
            }
            bjzo bjzo = (bjzo) childFragmentManager.findFragmentByTag(bmbr.f128586c);
            this.f95677b = bjzo;
            if (bjzo == null) {
                bmbr bmbr2 = ((bmie) this.f124069w).f129560m;
                if (bmbr2 == null) {
                    bmbr2 = bmbr.f128572L;
                }
                this.f95677b = bjzo.m105001a(bmbr2, this.f123961aF, mo65980at());
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                bjzo bjzo2 = this.f95677b;
                bmbr bmbr3 = ((bmie) this.f124069w).f129560m;
                if (bmbr3 == null) {
                    bmbr3 = bmbr.f128572L;
                }
                beginTransaction.replace(C0126R.C0129id.address_fragment_holder, bjzo2, bmbr3.f128586c).commit();
            }
            this.f95682g.mo66032a(this.f95677b);
            this.f95681f.add(new bkde(this.f95677b));
        }
        if ((((bmie) this.f124069w).f129548a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            inflate.findViewById(C0126R.C0129id.credit_card_legal_message_holder).setVisibility(0);
            axbt axbt = (axbt) getChildFragmentManager().findFragmentById(C0126R.C0129id.credit_card_legal_message_holder);
            this.f95679d = axbt;
            if (axbt == null) {
                bmjh bmjh = ((bmie) this.f124069w).f129563q;
                if (bmjh == null) {
                    bmjh = bmjh.f129700e;
                }
                this.f95679d = axbt.m82230a(bmjh, this.f123961aF, mo65980at());
                getChildFragmentManager().beginTransaction().add((int) C0126R.C0129id.credit_card_legal_message_holder, this.f95679d).commit();
            }
        }
        return inflate;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        axba axba = this.f95676a;
        if (axba != null && axba.mo52281a(bmas)) {
            return true;
        }
        axaz axaz = this.f95678c;
        if (axaz != null && axaz.mo52281a(bmas)) {
            return true;
        }
        bjzo bjzo = this.f95677b;
        if (bjzo != null && bjzo.mo52281a(bmas)) {
            return true;
        }
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (!bmaf.f128438a.equals(((bmie) this.f124069w).f129550c)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        int i = bmaf2.f128439b;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Unknown FormFieldMessage fieldId: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
