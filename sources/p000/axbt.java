package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: axbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbt extends bkdx {

    /* renamed from: a */
    InfoMessageView f95733a;

    /* renamed from: b */
    public bmjf f95734b;

    /* renamed from: c */
    public final bjes f95735c = new bjes(1631);

    /* renamed from: d */
    private String f95736d;

    /* renamed from: a */
    public static axbt m82230a(bmjh bmjh, int i, LogContext logContext) {
        axbt axbt = new axbt();
        axbt.setArguments(bkdx.m105383a(i, bmjh, logContext));
        return axbt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* renamed from: m */
    private final bmjf m82231m() {
        bmjf bmjf;
        bxxc bxxc = this.f124069w;
        if (bxxc == null) {
            return null;
        }
        String str = this.f95736d;
        if (((bmjh) bxxc).f129704c.size() > 0 && !TextUtils.isEmpty(str)) {
            bxwc bxwc = ((bmjh) this.f124069w).f129704c;
            int size = bxwc.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                bmjg bmjg = (bmjg) bxwc.get(i);
                if (bmjg != null && str.equalsIgnoreCase(bmjg.f129697a)) {
                    bmjf = bmjg.f129698b;
                    if (bmjf == null) {
                        bmjf = bmjf.f129685i;
                    }
                } else {
                    i++;
                }
            }
            if (bmjf == null) {
                return bmjf;
            }
            bmjh bmjh = (bmjh) this.f124069w;
            if ((bmjh.f129702a & 1) == 0) {
                return null;
            }
            bmjf bmjf2 = bmjh.f129703b;
            return bmjf2 == null ? bmjf.f129685i : bmjf2;
        }
        bmjf = null;
        if (bmjf == null) {
        }
    }

    /* renamed from: t */
    private final bmnr m82232t() {
        bmjf bmjf = this.f95734b;
        if (bmjf == null || (bmjf.f129687a & 2) == 0) {
            return null;
        }
        bmnr bmnr = bmjf.f129689c;
        return bmnr == null ? bmnr.f130153o : bmnr;
    }

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bmjh) this.f124069w).f129705d;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.emptyList();
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: bZ */
    public final void mo52779bZ() {
        throw new UnsupportedOperationException("UiNode doesn't support custom parents.");
    }

    /* renamed from: c */
    public final void mo52997c(String str) {
        this.f95736d = str;
        this.f95734b = m82231m();
        InfoMessageView infoMessageView = this.f95733a;
        if (infoMessageView != null) {
            infoMessageView.mo72006b(m82232t());
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95735c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        InfoMessageView infoMessageView = this.f95733a;
        if (infoMessageView != null) {
            infoMessageView.setEnabled(this.f124195aJ);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            mo52997c(bundle.getString("legalMessageRegionCode"));
        } else {
            this.f95734b = m82231m();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("legalMessageRegionCode", this.f95736d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmjh.f129700e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(android.content.Context, com.google.android.wallet.ui.common.InfoMessageView, int):void
     arg types: [com.google.android.chimera.Activity, com.google.android.wallet.ui.common.InfoMessageView, ?]
     candidates:
      awia.a(android.content.Context, android.view.View, int):void
      awia.a(android.content.Context, android.widget.TextView, int):void
      awia.a(com.google.android.chimera.Activity, boolean, awhz):void
      awia.a(android.content.Context, com.google.android.wallet.ui.common.InfoMessageView, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_legal_message_set, (ViewGroup) null, false);
        InfoMessageView infoMessageView = (InfoMessageView) inflate.findViewById(C0126R.C0129id.info_message);
        this.f95733a = infoMessageView;
        infoMessageView.mo72006b(m82232t());
        awia.m79977a((Context) getActivity(), this.f95733a, (int) C0126R.style.UicWalletLegalMessageText);
        return inflate;
    }
}
