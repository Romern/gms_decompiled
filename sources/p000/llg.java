package p000;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.Credential;

/* renamed from: llg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class llg implements lkz, bqfp {

    /* renamed from: d */
    private static final srn f26299d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final lir f26300a;

    /* renamed from: b */
    public final Bundle f26301b;

    /* renamed from: c */
    public final lky f26302c;

    /* renamed from: e */
    private final kpk f26303e;

    /* renamed from: f */
    private final lrc f26304f;

    /* renamed from: g */
    private final lkb f26305g;

    public llg(lir lir, Bundle bundle, lkx lkx, lkb lkb, kpk kpk) {
        this.f26300a = lir;
        this.f26301b = bundle;
        this.f26302c = lkx;
        this.f26305g = lkb;
        this.f26303e = kpk;
        this.f26304f = lrc.m19570a(lir);
    }

    /* renamed from: b */
    private final void m19321b(kct kct) {
        kcs b = kct.mo14369b();
        String valueOf = String.valueOf(b.mo14375b());
        String valueOf2 = String.valueOf(b.mo14374a());
        String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        this.f26301b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicypasswordViewDialogShowing", str);
        Credential credential = (Credential) kct.mo14368a();
        new AlertDialog.Builder(this.f26300a).setTitle(this.f26303e.mo14764a(credential.f11610c).f24745a).setMessage(this.f26304f.mo15385a(C0126R.string.autofill_settings_username_password_message, credential.f11608a, credential.f11609b.f23889a)).setPositiveButton(this.f26304f.mo15386b(C0126R.string.common_done), (DialogInterface.OnClickListener) null).setNegativeButton(this.f26304f.mo15386b(C0126R.string.autofill_copy), new llf(this, kct)).setNeutralButton(this.f26304f.mo15386b(C0126R.string.common_ui_confirm_deleting_button), new lle(this, str)).setOnDismissListener(new lld(this)).show();
    }

    /* renamed from: f */
    private final void m19322f() {
        this.f26301b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationAction");
        this.f26301b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationDataEntryId");
    }

    /* renamed from: a */
    public final CharSequence mo15232a() {
        return this.f26300a.getText(C0126R.string.common_passwords);
    }

    /* renamed from: c */
    public final void mo15235c() {
        m19322f();
    }

    /* renamed from: d */
    public final void mo15236d() {
        String string = this.f26301b.getString("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicypasswordViewDialogShowing");
        if (string != null) {
            bmxv a = this.f26302c.mo15227a(string);
            if (a.mo66813a()) {
                m19321b((kct) a.mo66814b());
            }
        }
    }

    /* renamed from: e */
    public final CharSequence mo15244e() {
        if (this.f26301b.getInt("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationAction") == C0126R.C0129id.password_delete) {
            return this.f26304f.mo15386b(C0126R.string.autofill_delete_password);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        this.f26302c.mo15229a(true);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) f26299d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        this.f26302c.mo15228a(this.f26300a);
        this.f26302c.mo15229a(true);
    }

    /* renamed from: a */
    public final void mo15243a(kct kct) {
        Credential credential = (Credential) kct.mo14368a();
        ((ClipboardManager) this.f26300a.getSystemService(ClipboardManager.class)).setPrimaryClip(ClipData.newPlainText(this.f26304f.mo15386b(C0126R.string.common_password), credential.f11609b.f23889a));
        CharSequence charSequence = this.f26303e.mo14764a(credential.f11610c).f24745a;
        Toast.makeText(this.f26300a, this.f26304f.mo15385a(C0126R.string.autofill_passwords_copied_message, charSequence), 1).show();
    }

    /* renamed from: a */
    public final void mo15233a(lqm lqm, String str, kct kct) {
        lqm.f26602t.setImageResource(C0126R.C0127drawable.quantum_ic_more_vert_black_24);
        lqm.f26602t.setOnClickListener(new llb(this, str));
    }

    /* renamed from: b */
    public final void mo15234b() {
        int i = this.f26301b.getInt("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationAction");
        String string = this.f26301b.getString("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationDataEntryId");
        bmxv a = this.f26302c.mo15227a(string);
        if (a.mo66813a()) {
            kct kct = (kct) a.mo66814b();
            if (i == C0126R.C0129id.password_view) {
                this.f26301b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicypasswordViewDialogShowing", string);
                m19321b(kct);
            } else if (i == C0126R.C0129id.password_delete) {
                lkb lkb = this.f26305g;
                lka lka = new lka(lkb.f26241a, lkb.f26242b, (Credential) kct.mo14368a());
                lkx lkx = (lkx) this.f26302c;
                lkw lkw = lkx.f26274d;
                int indexOf = lkw.f26605d.indexOf(kct);
                if (indexOf >= 0) {
                    lkw.f26605d.remove(indexOf);
                    lkw.mo160O(indexOf);
                }
                lkx.f26277g.remove(kct);
                liv liv = ((lkx) this.f26302c).f26278h;
                liv.mo15191b((lis) lka);
                bqga.m112781a(liv.mo15186a((lis) lka), this, bqfb.INSTANCE);
            } else if (i == C0126R.C0129id.password_copy) {
                mo15243a(kct);
            }
        }
        m19322f();
    }
}
