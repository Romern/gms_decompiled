package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: lnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class lnb extends lim implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /* renamed from: d */
    public static final srn f26430d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    protected final Executor f26431e;

    /* renamed from: f */
    public final int f26432f;

    /* renamed from: g */
    protected View f26433g;

    /* renamed from: h */
    private final eoq f26434h;

    /* renamed from: i */
    private final Account[] f26435i;

    /* renamed from: j */
    private Account f26436j;

    /* renamed from: k */
    private final bmxv f26437k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lnb(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        bmxv bmxv;
        if (ccjf.m130038h()) {
            bmxv = bmxv.m108566b(new ljj());
        } else {
            bmxv = bmvz.f131120a;
        }
        this.f26431e = new lqw(new adzt());
        this.f26432f = kwv.m18696a();
        Account[] a = lqo.m19535a(adyd.m51362a((AccountManager) lir.getSystemService(AccountManager.class)));
        this.f26435i = a;
        if (a.length != 0) {
            Account account = (Account) bundle.getParcelable("com.google.android.gms.autofill.extra.DEFAULT_OPT_IN_ACCOUNT");
            account = account == null ? this.f26435i[0] : account;
            this.f26434h = new eoq(lir, C0126R.C0128layout.autofill_two_line_list_item, new lna(), Arrays.asList(this.f26435i));
            Account account2 = (Account) bundle.getParcelable("selected_index");
            this.f26436j = account2 != null ? account2 : account;
            this.f26437k = bmxv;
            return;
        }
        throw new lik();
    }

    /* renamed from: a */
    private final void m19410a(Account account) {
        this.f26436j = account;
        this.f26160b.putParcelable("selected_index", account);
    }

    /* renamed from: b */
    public final void mo15171b() {
    }

    /* renamed from: e */
    public final void mo15174e() {
    }

    /* renamed from: h */
    public final void mo15284h() {
        kre a = krc.m18382a(this.f26159a);
        lho e = a.mo14830e();
        e.mo15101a(kdi.m17668a(this.f26436j));
        if (this.f26437k.mo66813a()) {
            ((ljj) this.f26437k.mo66814b()).mo15203a(a.mo14825a(this.f26159a).mo14868f(), a.mo14833h(), e);
        }
        mo15285i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo15285i() {
        mo15167a(-1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo15286j() {
        return this.f26432f;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0126R.C0129id.negative_button) {
            mo15165a(0);
        } else if (id == C0126R.C0129id.positive_button) {
            m19411a(liw.m19221a(this.f26159a).mo15186a((lis) new lmz(kdi.m17668a(this.f26436j))));
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Account account = (Account) this.f26434h.getItem(i);
        if (!this.f26436j.equals(account)) {
            krc.m18382a(this.f26159a).mo14837l().mo14914o(new lmv(this, i, this.f26435i.length));
        }
        m19410a(account);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* renamed from: a */
    private void m19411a(bqgg bqgg) {
        this.f26433g.setVisibility(0);
        if (!this.f26160b.getBoolean("api_resolution_started")) {
            bqga.m112781a(bqgg, new lmx(this), this.f26431e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder}
     arg types: [int, int]
     candidates:
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.Editable}
      ClspMth{android.text.SpannableStringBuilder.delete(int, int):android.text.SpannableStringBuilder} */
    /* renamed from: a */
    public void mo15164a() {
        int i;
        this.f26159a.overridePendingTransition(0, 0);
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019641;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
        this.f26159a.setContentView((int) C0126R.C0128layout.autofill_setup_activity);
        View findViewById = this.f26159a.findViewById(16908290);
        TextView textView = (TextView) findViewById.findViewById(C0126R.C0129id.points_textview);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(this.f26159a.getString(C0126R.string.autofill_setup_points), 63));
        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, this.f26159a.getResources().getDisplayMetrics());
        BulletSpan[] bulletSpanArr = (BulletSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), BulletSpan.class);
        if (bulletSpanArr != null) {
            for (BulletSpan bulletSpan : bulletSpanArr) {
                int spanStart = spannableStringBuilder.getSpanStart(bulletSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(bulletSpan);
                int spanFlags = spannableStringBuilder.getSpanFlags(bulletSpan);
                spannableStringBuilder.removeSpan(bulletSpan);
                spannableStringBuilder.setSpan(new BulletSpan(applyDimension), spanStart, spanEnd, spanFlags);
            }
        }
        int length = spannableStringBuilder.length();
        int length2 = spannableStringBuilder.length() - 1;
        while (length2 >= 0 && Character.isWhitespace(spannableStringBuilder.charAt(length2))) {
            length = length2;
            length2--;
        }
        spannableStringBuilder.delete(length, spannableStringBuilder.length());
        textView.setText(spannableStringBuilder);
        this.f26433g = findViewById.findViewById(16908301);
        findViewById.findViewById(C0126R.C0129id.positive_button).setOnClickListener(this);
        findViewById.findViewById(C0126R.C0129id.negative_button).setOnClickListener(this);
        Spinner spinner = (Spinner) findViewById.findViewById(C0126R.C0129id.account_spinner);
        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter((SpinnerAdapter) this.f26434h);
        if (this.f26434h.getCount() == 1) {
            spinner.setEnabled(false);
            spinner.setBackground(null);
        } else {
            int i2 = 0;
            while (true) {
                if (i2 < this.f26434h.getCount()) {
                    if (this.f26436j.equals(this.f26434h.getItem(i2))) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                m19410a((Account) this.f26434h.getItem(0));
                i2 = 0;
            }
            spinner.setSelection(i2);
        }
        findViewById.startAnimation(AnimationUtils.loadAnimation(this.f26159a, C0126R.anim.autofill_slide_in_bottom));
        Window window = this.f26159a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 81;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        liu b = liw.m19221a(this.f26159a).mo15189b("passphrase_resolution");
        if (b != null) {
            m19411a(b);
        }
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 != -1) {
            liw.m19221a(this.f26159a).mo15188a("passphrase_resolution");
            this.f26160b.remove("api_resolution_started");
            this.f26433g.setVisibility(8);
            return;
        }
        mo15284h();
    }

    /* renamed from: a */
    public final void mo15168a(int i, Intent intent, int i2) {
        liu b = liw.m19221a(this.f26159a).mo15189b("passphrase_resolution");
        if (b == null || b.isDone()) {
            View findViewById = this.f26159a.findViewById(16908290);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f26159a, C0126R.anim.autofill_slide_out_bottom);
            loadAnimation.setAnimationListener(new lmw(this, findViewById, i, intent, i2));
            findViewById.startAnimation(loadAnimation);
        }
    }
}
