package p000;

import android.app.AlertDialog;
import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: llm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class llm implements lkz, bqfp {

    /* renamed from: e */
    private static final srn f26313e = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final lir f26314a;

    /* renamed from: b */
    public final Bundle f26315b;

    /* renamed from: c */
    public final lky f26316c;

    /* renamed from: d */
    public final FillForm f26317d;

    /* renamed from: f */
    private final CharSequence f26318f;

    /* renamed from: g */
    private final AssistStructure f26319g;

    /* renamed from: h */
    private final lrc f26320h;

    /* renamed from: i */
    private final kck f26321i;

    /* renamed from: j */
    private final kpk f26322j;

    /* renamed from: k */
    private final kwu f26323k;

    public llm(lir lir, Bundle bundle, lkx lkx, FillForm fillForm) {
        this.f26314a = lir;
        this.f26315b = bundle;
        this.f26316c = lkx;
        this.f26317d = fillForm;
        this.f26319g = (AssistStructure) bundle.getParcelable("android.view.autofill.extra.ASSIST_STRUCTURE");
        this.f26320h = lrc.m19570a(lir);
        bngx bngx = fillForm.f11641a;
        if (!bngx.isEmpty() && (((FillField) bngx.get(0)).mo7943a(kpb.USERNAME) || ((FillField) bngx.get(0)).mo7943a(kpb.PASSWORD))) {
            bundle.putParcelable("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicyselectedFillForm", fillForm);
        }
        kre a = krc.m18382a(lir);
        kuw a2 = a.mo14825a(lir);
        this.f26322j = a.mo14833h();
        this.f26323k = a2.mo14863a();
        try {
            kck b = this.f26322j.mo14765b(this.f26319g.getActivityComponent().getPackageName());
            this.f26321i = b;
            this.f26318f = this.f26322j.mo14764a(b).f24745a;
        } catch (kpi e) {
            lkx.mo15228a(lir);
            throw new lik(e);
        }
    }

    /* renamed from: a */
    public final CharSequence mo15232a() {
        return this.f26320h.mo15385a(C0126R.string.autofill_passwords_picker_title, this.f26318f);
    }

    /* renamed from: b */
    public final void mo15234b() {
        bmxv a = this.f26316c.mo15227a(this.f26315b.getString("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicypickedIdPasswordPicker"));
        if (a.mo66813a()) {
            kct kct = (kct) a.mo66814b();
            try {
                this.f26322j.mo14765b(this.f26319g.getActivityComponent().getPackageName());
                FillForm fillForm = (FillForm) this.f26315b.getParcelable("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicyselectedFillForm");
                if (fillForm == null) {
                    mo6481a((Throwable) new IllegalStateException("No FillForm recorded"));
                }
                ljk ljk = new ljk(kct, fillForm);
                liv liv = ((lkx) this.f26316c).f26278h;
                liv.mo15191b((lis) ljk);
                bqga.m112781a(liv.mo15186a((lis) ljk), this, bqfb.INSTANCE);
            } catch (kpi e) {
                bnsl bnsl = (bnsl) f26313e.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68448m();
            }
        }
        this.f26315b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicypickedIdPasswordPicker");
    }

    /* renamed from: c */
    public final void mo15235c() {
        this.f26315b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicypickedIdPasswordPicker");
    }

    /* renamed from: d */
    public final void mo15236d() {
        if (this.f26315b.getBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicytypeDialogShowing")) {
            bmxv a = this.f26316c.mo15227a(this.f26315b.getString("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicypickedIdPasswordPicker"));
            if (a.mo66813a()) {
                mo15250a((kct) a.mo66814b());
            }
        }
        CharSequence a2 = this.f26320h.mo15385a(C0126R.string.autofill_passwords_picker_password_warning_message, this.f26318f);
        FrameLayout frameLayout = (FrameLayout) this.f26314a.findViewById(C0126R.C0129id.footer);
        frameLayout.addView(bhnh.m101202a(frameLayout, a2, -2).f119110e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        bmxv a = this.f26316c.mo15227a(this.f26315b.getString("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicypickedIdPasswordPicker"));
        if (a.mo66813a()) {
            kcv kcv = ((Credential) ((kct) a.mo66814b()).mo14368a()).f11610c;
            bxvd da = lar.f25601c.mo74144da();
            String str = kcv.f23841b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lar lar = (lar) da.f164949b;
            str.getClass();
            lar.f25604b = str;
            String str2 = this.f26321i.f23841b;
            str2.getClass();
            lar.f25603a = str2;
            this.f26323k.mo14906g(bmzn.m108683a((lar) da.mo74062i()));
        }
        if (bmxv.mo66813a()) {
            this.f26316c.mo15231b(-1, (Intent) bmxv.mo66814b());
            return;
        }
        this.f26316c.mo15228a(this.f26314a);
        this.f26316c.mo15231b(0, null);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f26313e.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        this.f26316c.mo15228a(this.f26314a);
        this.f26316c.mo15231b(0, null);
    }

    /* renamed from: a */
    public final void mo15250a(kct kct) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f26314a);
        int i = this.f26315b.getInt("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicycheckedItemPlusOne", -1);
        AlertDialog show = builder.setTitle((int) C0126R.string.autofill_choose_title).setSingleChoiceItems((int) C0126R.array.login_choices, i, new lll(this)).setPositiveButton("Enter", new llk(this, kct)).setNegativeButton("Cancel", new llj(this)).setOnDismissListener(new lli(this)).show();
        if (i == -1) {
            show.getButton(-1).setEnabled(false);
        }
    }

    /* renamed from: a */
    public final void mo15233a(lqm lqm, String str, kct kct) {
        lqm.f201a.setOnClickListener(new llh(this, kct));
    }
}
