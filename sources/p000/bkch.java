package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: bkch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkch extends bkbk implements DialogInterface.OnShowListener, DialogInterface.OnClickListener, bkdw {

    /* renamed from: b */
    protected bmde f123990b;

    /* renamed from: c */
    protected C1374te f123991c;

    /* renamed from: d */
    public bkcg f123992d;

    /* renamed from: e */
    public bkdw f123993e;

    /* renamed from: f */
    protected bjxv f123994f;

    /* renamed from: U */
    public final bkdw mo52821U() {
        return this.f123993e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Dialog mo9306a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo52906a(LinearLayout linearLayout, LayoutInflater layoutInflater, bmnr bmnr) {
        throw null;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo52907b() {
        throw null;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f123990b = (bmde) bjvp.m104730a(getArguments(), "argDialogProto", (bxxk) bmde.f128780k.mo74142c(7));
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bkcg bkcg = this.f123992d;
        if (bkcg != null) {
            bkcg.mo52062c(i == -1 ? 1 : 2);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bjxv b = bjxv.m104860b(bundle);
        this.f123994f = b;
        if (b == null) {
            this.f123994f = bjxv.m104861c();
        }
        return mo9306a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f123994f.mo65615a(bundle);
    }

    public final void onShow(DialogInterface dialogInterface) {
        if ((dialogInterface instanceof C1350sh) && getActivity() != null) {
            int a = bkfr.m105542a(getActivity(), (int) C0126R.attr.uicColorMaterialAccent);
            C1350sh shVar = (C1350sh) dialogInterface;
            shVar.mo15913a(-1).setTextColor(a);
            shVar.mo15913a(-2).setTextColor(a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65835a(LinearLayout linearLayout, LayoutInflater layoutInflater) {
        bxwc bxwc = this.f123990b.f128787f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmnr bmnr = (bmnr) bxwc.get(i);
            if (bmnr.f130157c.size() <= 0) {
                InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate(mo52907b(), (ViewGroup) linearLayout, false);
                infoMessageView.mo72002a((bkdw) this);
                infoMessageView.mo72003a(bmnr);
                infoMessageView.setId(this.f123994f.mo65614a());
                linearLayout.addView(infoMessageView);
            } else {
                linearLayout.addView(mo52906a(linearLayout, layoutInflater, bmnr));
            }
        }
        if ((this.f123990b.f128782a & 16) != 0) {
            InfoMessageView infoMessageView2 = (InfoMessageView) layoutInflater.inflate((int) C0126R.C0128layout.view_info_message_text, (ViewGroup) linearLayout, false);
            infoMessageView2.mo72002a((bkdw) this);
            bmnr bmnr2 = this.f123990b.f128788g;
            if (bmnr2 == null) {
                bmnr2 = bmnr.f130153o;
            }
            infoMessageView2.mo72003a(bmnr2);
            infoMessageView2.setId(this.f123994f.mo65614a());
            linearLayout.addView(infoMessageView2);
        }
    }
}
