package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.encryption.HtmlSnippetView;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkig extends bkdx {

    /* renamed from: g */
    private static final Charset f124276g = Charset.forName("UTF-8");

    /* renamed from: a */
    public FormHeaderView f124277a;

    /* renamed from: b */
    public bkjj f124278b;

    /* renamed from: c */
    public HtmlSnippetView f124279c;

    /* renamed from: d */
    bjyc f124280d;

    /* renamed from: e */
    public boolean f124281e = true;

    /* renamed from: f */
    public int f124282f = 0;

    /* renamed from: h */
    private final ArrayList f124283h = new ArrayList();

    /* renamed from: i */
    private final ArrayList f124284i = new ArrayList();

    /* renamed from: a */
    private final bmdm m105770a(int i, String str) {
        bxvd da = bmdm.f128825e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdm bmdm = (bmdm) da.f164949b;
        bmdm.f128830d = i - 1;
        bmdm.f128827a |= 1;
        if (!((bmdj) this.f124069w).f128815k) {
            str.getClass();
            bmdm.f128828b = 2;
            bmdm.f128829c = str;
        } else {
            str.getClass();
            bmdm.f128828b = 3;
            bmdm.f128829c = str;
        }
        return (bmdm) da.mo74062i();
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        bkjj bkjj = this.f124278b;
        if (bkjj != null) {
            return bkjj.mo52775bR();
        }
        return true;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f124283h;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124284i;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return new bjes(1761);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        FormHeaderView formHeaderView = this.f124277a;
        if (formHeaderView != null) {
            formHeaderView.setEnabled(z);
        }
        bkjj bkjj = this.f124278b;
        if (bkjj != null) {
            bkjj.mo52808n(z);
        }
        HtmlSnippetView htmlSnippetView = this.f124279c;
        if (htmlSnippetView != null) {
            htmlSnippetView.setEnabled(z);
        }
    }

    /* renamed from: m */
    public final bmdk mo66019m() {
        String str;
        bxvd da = bmdk.f128817f.mo74144da();
        bmdn r = mo52789r();
        String str2 = r.f128834b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdk bmdk = (bmdk) da.f164949b;
        str2.getClass();
        int i = 1;
        int i2 = bmdk.f128819a | 1;
        bmdk.f128819a = i2;
        bmdk.f128820b = str2;
        bxtx bxtx = r.f128836d;
        bxtx.getClass();
        bmdk.f128819a = i2 | 2;
        bmdk.f128821c = bxtx;
        if (this.f124281e) {
            int a = bmdh.m107918a(((bmdj) this.f124069w).f128809e);
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 == 1) {
                bjyc bjyc = this.f124280d;
                bjxy a2 = bjxx.m104869a();
                bjyc.mo51873b(a2.f123616a);
                bmdm a3 = m105770a(2, a2.f123617b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmdk bmdk2 = (bmdk) da.f164949b;
                a3.getClass();
                bmdk2.f128822d = a3;
                bmdk2.f128819a |= 4;
            } else if (i3 == 2) {
                bmdi bmdi = ((bmdj) this.f124069w).f128813i;
                if (bmdi == null) {
                    bmdi = bmdi.f128798c;
                }
                bmdm bmdm = bmdi.f128800a;
                if (bmdm == null) {
                    bmdm = bmdm.f128825e;
                }
                if (bmdm.f128828b == 2) {
                    str = (String) bmdm.f128829c;
                } else {
                    str = "";
                }
                bmdi bmdi2 = ((bmdj) this.f124069w).f128813i;
                if (bmdi2 == null) {
                    bmdi2 = bmdi.f128798c;
                }
                bmdm a4 = m105770a(3, bjxx.m104871a(str, bmdi2.f128801b, this.f124280d));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmdk bmdk3 = (bmdk) da.f164949b;
                a4.getClass();
                bmdk3.f128822d = a4;
                bmdk3.f128819a |= 4;
                m105771a(da);
            } else if (i3 != 3) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a5 = bmdh.m107918a(((bmdj) this.f124069w).f128809e);
                if (a5 != 0) {
                    i = a5;
                }
                objArr[0] = Integer.valueOf(i - 1);
                throw new IllegalArgumentException(String.format(locale, "Unsupported EncryptionForm action type %s.", objArr));
            } else {
                m105771a(da);
            }
        }
        return (bmdk) da.mo74062i();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (getActivity() instanceof bjyc) {
            this.f124280d = (bjyc) getActivity();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isActive", this.f124281e);
        bundle.putInt("returnValueTemplateIndex", this.f124282f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmdj.f128803l.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmdj) this.f124069w).f128808d;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjvh.a(bkdw, bkeo, boolean):void
     arg types: [bkjj, bkeo, int]
     candidates:
      bjvh.a(bmfs, int, com.google.android.wallet.clientlog.LogContext):bkdx
      bjvh.a(bkdw, bkeo, boolean):void */
    /* renamed from: a */
    private final void m105771a(bxvd bxvd) {
        bkeo bkeo = new bkeo((bmnw) ((bmdj) this.f124069w).f128810f.get(this.f124282f));
        bkjj bkjj = this.f124278b;
        if (bkjj != null) {
            bjvh.m104701a((bkdw) bkjj, bkeo, false);
        } else {
            bmdj bmdj = (bmdj) this.f124069w;
            if (bmdj.f128806b == 11) {
                bkeo.mo65910a(((bmdp) bmdj.f128807c).f128848a, this.f124279c.f152302b);
            }
        }
        byte[] bytes = bkeo.mo65913b().getBytes(f124276g);
        bmdf bmdf = ((bmdj) this.f124069w).f128814j;
        if (bmdf == null) {
            bmdf = bmdf.f128792c;
        }
        String str = bmdf.f128794a;
        bmdf bmdf2 = ((bmdj) this.f124069w).f128814j;
        if (bmdf2 == null) {
            bmdf2 = bmdf.f128792c;
        }
        String a = bjxx.m104873a(bytes, str, bmdf2.f128795b, this.f124280d);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmdk bmdk = (bmdk) bxvd.f164949b;
        bmdk bmdk2 = bmdk.f128817f;
        a.getClass();
        bmdk.f128819a |= 8;
        bmdk.f128823e = a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmdp bmdp;
        if (bundle != null) {
            this.f124281e = bundle.getBoolean("isActive");
            this.f124282f = bundle.getInt("returnValueTemplateIndex");
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate((int) C0126R.C0128layout.fragment_encryption, viewGroup, false);
        FormHeaderView formHeaderView = (FormHeaderView) viewGroup2.findViewById(C0126R.C0129id.encryption_form_header);
        this.f124277a = formHeaderView;
        formHeaderView.mo71963a(mo52789r(), layoutInflater, mo65982av(), this.f124283h);
        this.f124284i.add(new bkde(0, this.f124277a, null));
        this.f124278b = (bkjj) getChildFragmentManager().findFragmentByTag("SimpleFragmentTag");
        bmdj bmdj = (bmdj) this.f124069w;
        if (bmdj.f128806b == 6) {
            if (this.f124278b == null) {
                this.f124278b = mo53017a((bmeb) bmdj.f128807c, this.f123961aF, mo65980at());
                getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.encryption_form_simple_form, this.f124278b, "SimpleFragmentTag").commit();
            }
            bkjj bkjj = this.f124278b;
            bkjj.f124196aK = this.f124196aK;
            this.f124283h.add(bkjj);
            this.f124284i.add(new bkde(this.f124278b));
        } else if (this.f124278b != null) {
            getChildFragmentManager().beginTransaction().remove(this.f124278b).commit();
            this.f124278b = null;
        }
        this.f124279c = (HtmlSnippetView) viewGroup2.findViewById(C0126R.C0129id.encryption_form_web_view);
        if (((bmdj) this.f124069w).f128806b == 11) {
            this.f124279c.setVisibility(0);
            HtmlSnippetView htmlSnippetView = this.f124279c;
            bmdj bmdj2 = (bmdj) this.f124069w;
            if (bmdj2.f128806b == 11) {
                bmdp = (bmdp) bmdj2.f128807c;
            } else {
                bmdp = bmdp.f128846c;
            }
            htmlSnippetView.mo72152a(bmdp, this.f124196aK, this);
        } else {
            this.f124279c.setVisibility(8);
        }
        bmdj bmdj3 = (bmdj) this.f124069w;
        if ((8 & bmdj3.f128805a) != 0) {
            bwio bwio = bmdj3.f128812h;
            if (bwio == null) {
                bwio = bwio.f159659d;
            }
            bjwl.m104784a(this, bwio.f159662b, this.f124196aK);
            bwio bwio2 = ((bmdj) this.f124069w).f128812h;
            if (bwio2 == null) {
                bwio2 = bwio.f159659d;
            }
            bwip bwip = bwio2.f159663c;
            if (bwip == null) {
                bwip = bwip.f159664e;
            }
            this.f124281e = bwip.f159667b;
        }
        bmdj bmdj4 = (bmdj) this.f124069w;
        if ((bmdj4.f128805a & 4) != 0) {
            bwio bwio3 = bmdj4.f128811g;
            if (bwio3 == null) {
                bwio3 = bwio.f159659d;
            }
            bjwl.m104784a(this, bwio3.f159662b, this.f124196aK);
            bwio bwio4 = ((bmdj) this.f124069w).f128811g;
            if (bwio4 == null) {
                bwio4 = bwio.f159659d;
            }
            bwip bwip2 = bwio4.f159663c;
            if (bwip2 == null) {
                bwip2 = bwip.f159664e;
            }
            this.f124282f = bwip2.f159669d;
        }
        return viewGroup2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bkjj mo53017a(bmeb bmeb, int i, LogContext logContext) {
        return bkjj.m105965a(bmeb, this.f123961aF, mo65980at());
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmu bmmu;
        bmmu bmmu2;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 14) {
            super.mo51910a(bmmv, list);
            return;
        }
        long j = bmmv.f130059e;
        bmdj bmdj = (bmdj) this.f124069w;
        if ((bmdj.f128805a & 8) != 0) {
            bwio bwio = bmdj.f128812h;
            if (bwio == null) {
                bwio = bwio.f159659d;
            }
            if (j == bwio.f159662b) {
                if (bmmv.f130056b == 10) {
                    bmmu2 = (bmmu) bmmv.f130057c;
                } else {
                    bmmu2 = bmmu.f130049b;
                }
                bwip bwip = bmmu2.f130051a;
                if (bwip == null) {
                    bwip = bwip.f159664e;
                }
                this.f124281e = bwip.f159667b;
                return;
            }
        }
        bmdj bmdj2 = (bmdj) this.f124069w;
        if ((bmdj2.f128805a & 4) != 0) {
            bwio bwio2 = bmdj2.f128811g;
            if (bwio2 == null) {
                bwio2 = bwio.f159659d;
            }
            if (j == bwio2.f159662b) {
                if (bmmv.f130056b == 10) {
                    bmmu = (bmmu) bmmv.f130057c;
                } else {
                    bmmu = bmmu.f130049b;
                }
                bwip bwip2 = bmmu.f130051a;
                if (bwip2 == null) {
                    bwip2 = bwip.f159664e;
                }
                this.f124282f = bwip2.f159669d;
            }
        }
    }
}
