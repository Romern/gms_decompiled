package p000;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.credential.manager.util.DarkThemeManager;
import com.google.android.gms.credential.manager.util.FadeInImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Collection;

/* renamed from: ttp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ttp extends tuv implements tut {

    /* renamed from: f */
    public static final /* synthetic */ int f46646f = 0;

    /* renamed from: g */
    private static final srn f46647g = srn.m36127a(sgj.CREDENTIAL_MANAGER);

    /* renamed from: a */
    public TextInputEditText f46648a;

    /* renamed from: b */
    public TextInputEditText f46649b;

    /* renamed from: c */
    public tsc f46650c;

    /* renamed from: d */
    public C1350sh f46651d;

    /* renamed from: e */
    public tto f46652e = tto.NO_EDITS;

    /* renamed from: h */
    private View f46653h;

    /* renamed from: i */
    private tsf f46654i;

    /* renamed from: a */
    public static ttp m37464a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("pwm.DataFieldNames.accountName", str);
        ttp ttp = new ttp();
        ttp.setArguments(bundle);
        return ttp;
    }

    /* renamed from: b */
    public final void mo26793b() {
        C0034at atVar;
        String obj = this.f46648a.getText().toString();
        bskf bskf = this.f46650c.f46576d;
        bnre i = ((bngx) ((tql) this.f46654i.mo26759c().mo2448b()).mo26735a()).listIterator();
        loop0:
        while (true) {
            if (!i.hasNext()) {
                atVar = null;
                break;
            }
            atVar = (C0034at) i.next();
            bnre i2 = ((bsjx) atVar.mo2448b()).mo70638c().listIterator();
            while (true) {
                if (i2.hasNext()) {
                    if (((bskf) i2.next()).equals(bskf)) {
                        break loop0;
                    }
                }
            }
        }
        if (atVar != null) {
            if (bnfi.m109235a(((bsjx) atVar.mo2448b()).mo70638c()).mo67502a(new ttj(this.f46650c.f46576d)).mo67507c(new ttk(obj)).mo66813a()) {
                ((TextInputLayout) getView().findViewById(C0126R.C0129id.username_edit_textinputlayout)).mo71272c(TextUtils.expandTemplate(getResources().getText(C0126R.string.pwm_username_collission_error), this.f46650c.f46577e.f167739b));
                return;
            }
        }
        ((TextInputLayout) getView().findViewById(C0126R.C0129id.username_edit_textinputlayout)).mo71272c((CharSequence) null);
    }

    /* renamed from: c */
    public final void mo26794c() {
        C0034at atVar;
        tsc tsc = this.f46650c;
        String obj = this.f46648a.getText().toString();
        bsqg a = bsqg.m116088a(this.f46649b.getText().toString());
        bskf bskf = tsc.f46576d;
        if (bskf != null) {
            trs trs = tsc.f46575a;
            atVar = new C0034at();
            atVar.mo2450b(tql.m37366d());
            bngs j = bngx.m109377j();
            bngs j2 = bngx.m109377j();
            bnre i = bskf.mo70642a().listIterator();
            while (i.hasNext()) {
                qun f = ((tqk) i.next()).mo26732f();
                if (!f.f42170e.equals(obj)) {
                    j.mo67668c(f);
                }
                bxvd bxvd = (bxvd) f.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) f);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                qun qun = (qun) bxvd.f164949b;
                qun qun2 = qun.f42164n;
                obj.getClass();
                int i2 = qun.f42166a | 32;
                qun.f42166a = i2;
                qun.f42170e = obj;
                String str = ((bsqf) a).f146633a;
                str.getClass();
                qun.f42166a = i2 | 128;
                qun.f42172g = str;
                j2.mo67668c((qun) bxvd.mo74062i());
            }
            bngs j3 = bngx.m109377j();
            bnre i3 = j2.mo67664a().listIterator();
            while (i3.hasNext()) {
                j3.mo67668c(trs.f46556b.mo26696a((qun) i3.next()));
            }
            aucb a2 = aucu.m76779a((Collection) j3.mo67664a()).mo50364a(new trp(trs, j));
            a2.mo50373a(new trq(atVar));
            a2.mo50372a(new tqt(atVar));
            a2.mo50371a(new tqu(trs));
        } else {
            atVar = new C0034at();
            atVar.mo2450b(tql.m37364a((Exception) new IllegalStateException("A CredentialGroup must be set before calling this method.")));
        }
        mo26791a(tto.IS_SAVING);
        atVar.mo2445a(this, new ttm(this));
    }

    /* renamed from: d */
    public final void mo26795d() {
        this.f46652e = tto.NO_EDITS;
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getView().getWindowToken(), 0);
        }
        tsl.m37443a(getActivity()).mo26769b();
    }

    /* renamed from: e */
    public final void mo26796e() {
        if (this.f46652e != tto.WAS_EDITED || !TextUtils.isEmpty(((TextInputLayout) getView().findViewById(C0126R.C0129id.username_edit_textinputlayout)).mo71274d()) || !TextUtils.isEmpty(((TextInputLayout) getView().findViewById(C0126R.C0129id.password_edit_textinputlayout)).mo71274d())) {
            this.f46653h.setEnabled(false);
        } else {
            this.f46653h.setEnabled(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final SharedPreferences mo26797f() {
        return getActivity().getApplicationContext().getSharedPreferences("PWMCredEditScrnFrgmnt", 0);
    }

    public final void onCreate(Bundle bundle) {
        setHasOptionsMenu(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        ((deu) getActivity()).mo8628aW().mo15863e((int) C0126R.C0127drawable.quantum_gm_ic_close_vd_theme_24);
        getActivity().findViewById(C0126R.C0129id.google_account_title).setVisibility(8);
        this.f46653h.setVisibility(0);
        menu.clear();
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        getActivity().getWindow().setFlags(8192, 8192);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_credential_edit_screen, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.swipeRefreshLayout);
        swipeRefreshLayout.setEnabled(false);
        DarkThemeManager.m22911a(swipeRefreshLayout);
        this.f46653h = getActivity().findViewById(C0126R.C0129id.save_edits_button);
        if (cdqa.m134651d()) {
            this.f46653h.setOnClickListener(new tte(this));
        } else {
            this.f46653h.setOnClickListener(new ttf(this));
        }
        this.f46648a = (TextInputEditText) inflate.findViewById(C0126R.C0129id.username_edit_text);
        this.f46649b = (TextInputEditText) inflate.findViewById(C0126R.C0129id.password_edit_text);
        try {
            tvb.m37514a(getActivity(), this.f46649b);
        } catch (Resources.NotFoundException e) {
            bnsl bnsl = (bnsl) f46647g.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("The font R.font.roboto_mono could not be loaded.");
            this.f46649b.setTypeface(Typeface.MONOSPACE);
        }
        this.f46650c = (tsc) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsc.class);
        this.f46654i = (tsf) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsf.class);
        tsc tsc = this.f46650c;
        if (tsc.f46576d == null || tsc.f46577e == null) {
            tsl.m37443a(getActivity()).mo26769b();
            return inflate;
        }
        this.f46654i.mo26759c().mo2445a(this, new ttg(this));
        tsc tsc2 = this.f46650c;
        bskf bskf = tsc2.f46576d;
        bytz bytz = tsc2.f46577e;
        if (!(bskf == null || bytz == null)) {
            tog.m37287a((FadeInImageView) inflate.findViewById(C0126R.C0129id.signon_realm_icon), (TextView) inflate.findViewById(C0126R.C0129id.affiliated_group_title), bskf, bytz, getActivity());
            tog.m37286a((LinearLayout) inflate.findViewById(C0126R.C0129id.credential_group_signon_realm_list), true, bskf, bytz.f167739b, getContext(), "PWMCredEditScrnFrgmnt");
        }
        bskf bskf2 = this.f46650c.f46576d;
        String f = bskf2.mo70660f();
        if (((tqk) bskf2.mo70661g()).mo26727b().mo66813a()) {
            str = ((bsqg) ((tqk) bskf2.mo70661g()).mo26727b().mo66814b()).mo70699a();
        } else {
            str = "";
        }
        this.f46648a.setText(bskf2.mo70660f());
        if (((tqk) bskf2.mo70661g()).mo26727b().mo66813a()) {
            this.f46649b.setText(((bsqg) ((tqk) bskf2.mo70661g()).mo26727b().mo66814b()).mo70699a());
        }
        mo26796e();
        m37465a(this.f46648a, new tth(this, f));
        m37465a(this.f46649b, new tti(this, str));
        if (cdqa.m134651d()) {
            CharSequence expandTemplate = TextUtils.expandTemplate(getResources().getText(C0126R.string.pwm_save_edits_info_dialog), this.f46650c.f46577e.f167739b);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.edit_warning_text);
            textView.setVisibility(0);
            textView.setText(expandTemplate);
        }
        return inflate;
    }

    public final void onResume() {
        tsl.m37443a(getActivity()).mo26764a();
        super.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("PWMCredEditScrnFrgmnteditStatusKey", this.f46652e);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            this.f46648a.setOnFocusChangeListener(new ttc(this));
            this.f46648a.requestFocus();
        } else if (bundle.containsKey("PWMCredEditScrnFrgmnteditStatusKey")) {
            mo26791a((tto) bundle.get("PWMCredEditScrnFrgmnteditStatusKey"));
        }
    }

    /* renamed from: a */
    private static void m37465a(TextInputEditText textInputEditText, Runnable runnable) {
        textInputEditText.addTextChangedListener(new ttn(runnable));
    }

    /* renamed from: a */
    public final void mo26791a(tto tto) {
        boolean z;
        this.f46652e = tto;
        mo26796e();
        tto tto2 = tto.IS_SAVING;
        boolean z2 = false;
        if (tto == tto2) {
            z = false;
        } else {
            z = true;
        }
        if (tto == tto2) {
            z2 = true;
        }
        ((SwipeRefreshLayout) getView().findViewById(C0126R.C0129id.swipeRefreshLayout)).mo2090a(z2);
        getView().findViewById(C0126R.C0129id.username_edit_textinputlayout).setEnabled(z);
        getView().findViewById(C0126R.C0129id.password_edit_textinputlayout).setEnabled(z);
    }

    /* renamed from: a */
    public final boolean mo26792a() {
        if (this.f46652e == tto.WAS_EDITED) {
            bhia bhia = new bhia(getContext());
            bhia.mo63790e(C0126R.string.pwm_discard_changes_dialog);
            bhia.mo63786d((int) C0126R.string.pwm_discard_changes_dialog_discard, new ttd(this));
            bhia.mo63781c((int) C0126R.string.pwm_discard_changes_dialog_keep_editing, (DialogInterface.OnClickListener) null);
            bhia.mo15910c();
            return true;
        } else if (this.f46652e != tto.IS_SAVING) {
            return false;
        } else {
            return true;
        }
    }
}
