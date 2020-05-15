package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ljq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ljq extends ljv implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: d */
    public static final srn f26202d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    public final kwu f26203e;

    /* renamed from: f */
    public final kck f26204f;

    /* renamed from: g */
    public final kcv f26205g;

    /* renamed from: h */
    public final AtomicBoolean f26206h = new AtomicBoolean(false);

    /* renamed from: i */
    public final kbs f26207i;

    /* renamed from: j */
    private final lrc f26208j;

    /* renamed from: k */
    private final kpk f26209k;

    /* renamed from: l */
    private boolean f26210l = false;

    public ljq(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        kre a = krc.m18382a(lir);
        kuw a2 = a.mo14825a(lir);
        this.f26209k = a.mo14833h();
        this.f26203e = a2.mo14863a();
        this.f26207i = a2.mo14872j();
        this.f26208j = lrc.m19570a(lir);
        Parcelable a3 = lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.STATE_ANDROID_DOMAIN"));
        if (a3 != null) {
            kcv kcv = ((DomainUtils$DomainParcel) a3).f11612a;
            bmxy.m108588a(kcv instanceof kck);
            this.f26204f = (kck) kcv;
            Parcelable a4 = lqx.m19548a(bundle.getBundle("com.google.android.gms.autofill.extra.STATE_DOMAIN"));
            if (a4 != null) {
                this.f26205g = ((DomainUtils$DomainParcel) a4).f11612a;
                return;
            }
            throw new lik("Domain from state Bundle cannot be null.");
        }
        throw new lik("AndroidDomain from state Bundle cannot be null.");
    }

    /* renamed from: b */
    private final void m19239b(int i) {
        if (this.f26206h.compareAndSet(false, true)) {
            bxvd da = lad.f25522f.mo74144da();
            String str = this.f26204f.f23841b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lad lad = (lad) da.f164949b;
            str.getClass();
            lad.f25524a = str;
            String str2 = this.f26205g.f23841b;
            str2.getClass();
            lad.f25525b = str2;
            lad.f25528e = false;
            if (i == -1) {
                lad.f25526c = lac.m18843a(3);
                boolean z = this.f26210l;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((lad) da.f164949b).f25527d = z;
            } else {
                lad.f25526c = lac.m18843a(4);
            }
            this.f26203e.mo14905f(new ljl(da));
        }
    }

    /* renamed from: j */
    private final void m19240j() {
        m19239b(0);
        mo15165a(0);
        this.f26159a.overridePendingTransition(0, 17432577);
    }

    /* renamed from: a */
    public final void mo15164a() {
        this.f26159a.setTheme(2132019640);
        bqga.m112781a(liw.m19221a(this.f26159a).mo15186a((lis) new ljn(this)), new ljo(this), bqfb.INSTANCE);
    }

    /* renamed from: h */
    public final void mo15204h() {
        int i;
        int i2;
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019641;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
        kpj a = this.f26209k.mo14764a(this.f26204f);
        kpj a2 = this.f26209k.mo14764a(this.f26205g);
        CharSequence a3 = this.f26208j.mo15385a(C0126R.string.autofill_dataset_password_warning_message, a2.f24745a, a.f24745a);
        if (!ccip.m129866f()) {
            i2 = C0126R.C0128layout.autofill_password_warning_content;
        } else {
            i2 = C0126R.C0128layout.autofill_password_warning_content_darkmode;
        }
        View inflate = this.f26159a.getLayoutInflater().inflate(i2, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.warning_message)).setText(a3);
        ((CheckBox) inflate.findViewById(C0126R.C0129id.opt_out_checkbox)).setOnCheckedChangeListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f26159a);
        builder.setView(inflate);
        builder.setPositiveButton(this.f26208j.mo15386b(C0126R.string.autofill_button_label), this);
        builder.setNegativeButton(17039360, this);
        builder.setOnCancelListener(this);
        builder.create().show();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m19240j();
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f26210l = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            if (this.f26210l) {
                kbs kbs = this.f26207i;
                kck kck = this.f26204f;
                bqga.m112781a(bqdx.m112674a(kbs.f23713b.mo15162a(kck.f23817a, kbs.f23712a), new kbq(kbs, kck), bqfb.INSTANCE), new ljp(), bqfb.INSTANCE);
            }
            m19239b(-1);
            mo15208i();
        } else if (i == -2) {
            m19240j();
        }
    }
}
