package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.common.moduleapicalltasks.ModuleApiCallTaskLoaderRequest;
import com.google.android.wallet.common.moduleapicalltasks.ModuleApiCallTaskLoaderResponse;
import com.google.android.wallet.common.moduleapicalltasks.PaySeFetchCardAsyncTaskLoaderRequest;
import com.google.android.wallet.common.moduleapicalltasks.PaySeFetchCardAsyncTaskLoaderResponse;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderRequest;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderResponse;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.LegalMessageContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkhs extends bkdx implements bjug, bjem {

    /* renamed from: a */
    public boolean f124234a;

    /* renamed from: b */
    public boolean f124235b;

    /* renamed from: c */
    public bjuh f124236c;

    /* renamed from: d */
    View f124237d;

    /* renamed from: e */
    public LegalMessageContainer f124238e;

    /* renamed from: f */
    protected bjyg f124239f;

    /* renamed from: g */
    private final ArrayList f124240g = new ArrayList();

    /* renamed from: h */
    private final bkip f124241h = new bkip();

    /* renamed from: i */
    private final bjes f124242i = new bjes(33);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_device_stored_value_card, viewGroup, false);
        this.f124237d = inflate;
        FormHeaderView formHeaderView = (FormHeaderView) inflate.findViewById(C0126R.C0129id.header);
        bmdn bmdn = ((bmio) this.f124069w).f129611c;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn, layoutInflater, mo65982av(), this.f124240g);
        LegalMessageContainer legalMessageContainer = (LegalMessageContainer) this.f124237d.findViewById(C0126R.C0129id.legal_message_container);
        this.f124238e = legalMessageContainer;
        legalMessageContainer.f152112b = this;
        legalMessageContainer.mo72027a(((bmio) this.f124069w).f129612d, mo65820k(legalMessageContainer.getId()));
        this.f124238e.mo72026a(this);
        return this.f124237d;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return this.f124234a;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f124241h;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f124240g;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124242i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        LegalMessageContainer legalMessageContainer = this.f124238e;
        if (legalMessageContainer != null) {
            legalMessageContainer.setEnabled(z);
        }
    }

    /* renamed from: m */
    public void mo52982m() {
        throw null;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Context context = getContext();
        int i2 = ((bmio) this.f124069w).f129609a;
        if (i2 == 4) {
            i = 0;
        } else if (i2 == 5) {
            i = 1;
        } else {
            throw new IllegalStateException("unsupported user flow form");
        }
        this.f124236c = new bjul(context, i, getLoaderManager(), this, this.f124239f);
        if (bundle != null) {
            this.f124234a = bundle.getBoolean("isPaySeCallComplete");
            this.f124235b = bundle.getBoolean("submitAfterPaySeCallComplete");
            if (bundle.containsKey("moduleCallLoaderManagerState")) {
                bjuh bjuh = this.f124236c;
                Bundle bundle2 = bundle.getBundle("moduleCallLoaderManagerState");
                bjuh.f123349e = (ModuleApiCallTaskLoaderRequest) bundle2.getParcelable("moduleCallRequest");
                bjuh.f123348d = (ModuleApiCallTaskLoaderResponse) bundle2.getParcelable("moduleCallResponse");
                int a = bjuh.mo65536a();
                if (bjuh.f123347c.getLoader(a) != null) {
                    bjuh.f123347c.initLoader(a, Bundle.EMPTY, bjuh);
                }
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isPaySeCallComplete", this.f124234a);
        bundle.putBoolean("submitAfterPaySeCallComplete", this.f124235b);
        bjuh bjuh = this.f124236c;
        bjuh.f123350f = null;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("moduleCallResponse", bjuh.f123348d);
        bundle2.putParcelable("moduleCallRequest", bjuh.f123349e);
        bundle.putBundle("moduleCallLoaderManagerState", bundle2);
    }

    public final void onStart() {
        super.onStart();
        if (!this.f124234a && ((bmio) this.f124069w).f129609a == 4) {
            mo66006v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmio.f129607e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmio) this.f124069w).f129611c;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: t */
    public final bmis mo66004t() {
        ArrayList arrayList;
        bxvd da = bmis.f129626h.mo74144da();
        bmdn bmdn = ((bmio) this.f124069w).f129611c;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        String str = bmdn.f128834b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmis bmis = (bmis) da.f164949b;
        str.getClass();
        int i = 1;
        bmis.f129628a |= 1;
        bmis.f129629b = str;
        bmdn bmdn2 = ((bmio) this.f124069w).f129611c;
        if (bmdn2 == null) {
            bmdn2 = bmdn.f128831k;
        }
        bxtx bxtx = bmdn2.f128836d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmis bmis2 = (bmis) da.f164949b;
        bxtx.getClass();
        bmis2.f129628a |= 4;
        bmis2.f129631d = bxtx;
        int size = ((bmio) this.f124069w).f129612d.size();
        for (int i2 = 0; i2 < size; i2++) {
            bmjf bmjf = (bmjf) ((bmio) this.f124069w).f129612d.get(i2);
            bxvd da2 = bmir.f129621d.mo74144da();
            String str2 = bmjf.f129693g;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmir bmir = (bmir) da2.f164949b;
            str2.getClass();
            bmir.f129623a = 2 | bmir.f129623a;
            bmir.f129625c = str2;
            int a = bmje.m108083a(bmjf.f129694h);
            if (a == 0) {
                a = 1;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmir bmir2 = (bmir) da2.f164949b;
            bmir2.f129624b = a - 1;
            bmir2.f129623a |= 1;
            bmir bmir3 = (bmir) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmis bmis3 = (bmis) da.f164949b;
            bmir3.getClass();
            if (!bmis3.f129632e.mo73666a()) {
                bmis3.f129632e = bxvk.m124021a(bmis3.f129632e);
            }
            bmis3.f129632e.add(bmir3);
        }
        bmio bmio = (bmio) this.f124069w;
        int i3 = bmio.f129609a;
        if (i3 == 4) {
            PaySeFetchCardAsyncTaskLoaderResponse paySeFetchCardAsyncTaskLoaderResponse = (PaySeFetchCardAsyncTaskLoaderResponse) this.f124236c.f123348d;
            if (!(((bmin) bmio.f129610b).f129605a == 0 || paySeFetchCardAsyncTaskLoaderResponse == null || (arrayList = paySeFetchCardAsyncTaskLoaderResponse.f151811a) == null || arrayList.size() != 1)) {
                bmit bmit = (bmit) paySeFetchCardAsyncTaskLoaderResponse.f151811a.get(0);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmis bmis4 = (bmis) da.f164949b;
                bmit.getClass();
                bmis4.f129630c = bmit;
                bmis4.f129628a |= 2;
            }
        } else if (i3 == 5) {
            PaySePerformSdkOperationAsyncTaskLoaderResponse paySePerformSdkOperationAsyncTaskLoaderResponse = (PaySePerformSdkOperationAsyncTaskLoaderResponse) this.f124236c.f123348d;
            bmix bmix = (bmix) bmio.f129610b;
            int a2 = bmiv.m108074a(bmix.f129651c);
            if (a2 == 0 || a2 != 2) {
                int a3 = bmiv.m108074a(bmix.f129651c);
                if (a3 == 0 || a3 != 3) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a4 = bmiv.m108074a(bmix.f129651c);
                    if (a4 != 0) {
                        i = a4;
                    }
                    objArr[0] = Integer.valueOf(i - 1);
                    throw new IllegalStateException(String.format(locale, "Unsupported DeviceCaptureAction: %d", objArr));
                } else if (paySePerformSdkOperationAsyncTaskLoaderResponse == null || !TextUtils.isEmpty(paySePerformSdkOperationAsyncTaskLoaderResponse.f151818a)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmis bmis5 = (bmis) da.f164949b;
                    bmis5.f129633f = 4;
                    bmis5.f129628a |= 8;
                } else {
                    bmit bmit2 = paySePerformSdkOperationAsyncTaskLoaderResponse.f151822e;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmis bmis6 = (bmis) da.f164949b;
                    bmit2.getClass();
                    bmis6.f129630c = bmit2;
                    int i4 = bmis6.f129628a | 2;
                    bmis6.f129628a = i4;
                    bmis6.f129633f = 3;
                    bmis6.f129628a = i4 | 8;
                }
            } else if (paySePerformSdkOperationAsyncTaskLoaderResponse == null || !TextUtils.isEmpty(paySePerformSdkOperationAsyncTaskLoaderResponse.f151818a)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmis bmis7 = (bmis) da.f164949b;
                bmis7.f129633f = 2;
                bmis7.f129628a |= 8;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmis bmis8 = (bmis) da.f164949b;
                bmis8.f129633f = 1;
                int i5 = bmis8.f129628a | 8;
                bmis8.f129628a = i5;
                bmit bmit3 = paySePerformSdkOperationAsyncTaskLoaderResponse.f151822e;
                bmit3.getClass();
                bmis8.f129630c = bmit3;
                bmis8.f129628a = i5 | 2;
                bxvd da3 = bmiq.f129615e.mo74144da();
                String str3 = paySePerformSdkOperationAsyncTaskLoaderResponse.f151821d;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bmiq bmiq = (bmiq) da3.f164949b;
                str3.getClass();
                int i6 = 1 | bmiq.f129617a;
                bmiq.f129617a = i6;
                bmiq.f129618b = str3;
                String str4 = paySePerformSdkOperationAsyncTaskLoaderResponse.f151820c;
                str4.getClass();
                bmiq.f129617a = 2 | i6;
                bmiq.f129619c = str4;
                if (!TextUtils.isEmpty(paySePerformSdkOperationAsyncTaskLoaderResponse.f151819b)) {
                    String str5 = paySePerformSdkOperationAsyncTaskLoaderResponse.f151819b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmiq bmiq2 = (bmiq) da3.f164949b;
                    str5.getClass();
                    bmiq2.f129617a |= 4;
                    bmiq2.f129620d = str5;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmis bmis9 = (bmis) da.f164949b;
                bmiq bmiq3 = (bmiq) da3.mo74062i();
                bmiq3.getClass();
                bmis9.f129634g = bmiq3;
                bmis9.f129628a |= 16;
            }
        }
        return (bmis) da.mo74062i();
    }

    /* renamed from: u */
    public final void mo66005u() {
        this.f124235b = true;
        mo66006v();
    }

    /* renamed from: v */
    public final void mo66006v() {
        ModuleApiCallTaskLoaderRequest moduleApiCallTaskLoaderRequest;
        bmin bmin;
        if (!this.f124234a) {
            bmio bmio = (bmio) this.f124069w;
            int i = bmio.f129609a;
            if (i == 4) {
                Account cn = mo51878cn();
                bmio bmio2 = (bmio) this.f124069w;
                if (bmio2.f129609a == 4) {
                    bmin = (bmin) bmio2.f129610b;
                } else {
                    bmin = bmin.f129603b;
                }
                moduleApiCallTaskLoaderRequest = new PaySeFetchCardAsyncTaskLoaderRequest(cn, bmin.f129605a);
            } else if (i == 5) {
                bmix bmix = (bmix) bmio.f129610b;
                int a = bmiv.m108074a(bmix.f129651c);
                if (a == 0) {
                    a = 1;
                }
                if (a == 2) {
                    moduleApiCallTaskLoaderRequest = new PaySePerformSdkOperationAsyncTaskLoaderRequest(0, mo51878cn(), bmix.f129649a, bmix.f129650b, null, -1);
                } else if (a == 3) {
                    bmiw bmiw = bmix.f129652d;
                    if (bmiw == null) {
                        bmiw = bmiw.f129642c;
                    }
                    Account cn2 = mo51878cn();
                    int i2 = bmix.f129649a;
                    String str = bmix.f129650b;
                    String str2 = bmiw.f129644a;
                    blwj blwj = bmiw.f129645b;
                    if (blwj == null) {
                        blwj = blwj.f127945d;
                    }
                    moduleApiCallTaskLoaderRequest = new PaySePerformSdkOperationAsyncTaskLoaderRequest(1, cn2, i2, str, str2, blwj.f127948b);
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "Unsupported DeviceCaptureAction: %d", Integer.valueOf(a - 1)));
                }
            } else {
                throw new IllegalStateException("Unsupported user flow form");
            }
            bjuh bjuh = this.f124236c;
            bjuh.f123349e = moduleApiCallTaskLoaderRequest;
            int a2 = bjuh.mo65536a();
            if (bjuh.f123348d != null || bjuh.f123347c.getLoader(a2) == null || !bjuh.f123347c.getLoader(a2).isStarted()) {
                bjuh.f123347c.initLoader(a2, Bundle.EMPTY, bjuh);
                return;
            }
            return;
        }
        mo52982m();
    }
}
