package com.google.android.gms.feedback;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SuggestionsChimeraActivity extends deu implements aasf {

    /* renamed from: b */
    private ErrorReport f31620b;

    /* renamed from: c */
    private aazn f31621c = null;

    /* renamed from: d */
    private abcr f31622d = null;

    /* renamed from: e */
    public final void mo18625e() {
        mo18624a(45, this.f31620b.f31546b, 1);
        setResult(-1);
        finish();
    }

    /* renamed from: g */
    public final HelpConfig mo18626g() {
        return FeedbackChimeraActivity.f31577k;
    }

    /* renamed from: h */
    public final abcr mo18627h() {
        if (this.f31622d == null) {
            this.f31622d = new abcr(this);
        }
        return this.f31622d;
    }

    /* renamed from: i */
    public final aaxx mo18628i() {
        throw null;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        throw null;
    }

    /* renamed from: k */
    public final Context mo18630k() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final aazn mo18631l() {
        if (this.f31621c == null) {
            this.f31621c = new aazn();
        }
        return this.f31621c;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        abcr abcr = this.f31622d;
        if (abcr != null) {
            abcr.close();
        }
        super.onDestroy();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo18625e();
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            mo18625e();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18624a(int i, String str, int i2) {
        Account account;
        String str2;
        ApplicationErrorReport applicationErrorReport;
        if (!aaya.m47229b(cdug.f181769a.mo6606a().mo78343a()) || ((((applicationErrorReport = this.f31620b.f31536a) != null && !TextUtils.isEmpty(applicationErrorReport.packageName)) || !TextUtils.isEmpty(this.f31620b.f31527R)) && !TextUtils.isEmpty(this.f31620b.f31543ag))) {
            if (FeedbackChimeraActivity.f31577k != null) {
                account = FeedbackChimeraActivity.f31577k.f78829d;
            } else {
                account = null;
            }
            ErrorReport errorReport = this.f31620b;
            if (FeedbackChimeraActivity.f31578l != null) {
                str2 = FeedbackChimeraActivity.f31578l.f56497g;
            } else {
                str2 = null;
            }
            wyu.m42479a(this, errorReport, i, account, str2, str, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        ErrorReport j = FeedbackChimeraActivity.m23367j();
        this.f31620b = j;
        if (j == null || j.f31514E) {
            mo18625e();
            return;
        }
        boolean a = aayi.m47267a();
        int i3 = C0126R.style.gf_DarkActivityStyle;
        if (a) {
            aayi.m47264a(this, this.f31620b, (int) C0126R.style.gf_LightActivityStyle, (int) C0126R.style.gf_DarkActivityStyle, (int) C0126R.style.gf_DayNightActivityStyle);
        } else if (aayi.m47270b()) {
            if (!aayi.m47268a(this.f31620b)) {
                i3 = C0126R.style.gf_LightActivityStyle;
            }
            setTheme(i3);
        } else {
            ThemeSettings themeSettings = this.f31620b.f31534Y;
            if (themeSettings != null) {
                if (themeSettings.f31623a == 0) {
                    i2 = 2132017357;
                } else {
                    i2 = 2132017358;
                }
                setTheme(i2);
            }
        }
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.gf_suggestions_ui);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add((int) C0126R.C0129id.gf_suggestions_parent, mo18631l());
        beginTransaction.commit();
        C1341rz aW = mo8628aW();
        if (aW != null) {
            if (aayi.m47270b()) {
                aW.mo15858c(true);
            } else {
                ThemeSettings themeSettings2 = this.f31620b.f31534Y;
                if (!(themeSettings2 == null || (i = themeSettings2.f31624b) == 0)) {
                    aW.mo15851b(new ColorDrawable(i));
                }
            }
            String string = getResources().getString(C0126R.string.gf_report_feedback);
            String str = this.f31620b.f31536a.packageName;
            FeedbackChimeraActivity.m23370p();
            FeedbackChimeraActivity.m23365a(aW, string);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        mo18631l().mo31947a(true);
        aasg a = aasg.m46857a(FeedbackChimeraActivity.f31578l, 44, 0, this.f31620b.f31546b, -1.0f);
        mo18624a(44, a.f56428c, a.f56427b + 1);
        mo18631l().mo31945a(a, false);
        ((WebView) mo18631l().getView().findViewById(C0126R.C0129id.gh_answer_content)).setWebViewClient(new wye(this, this));
    }
}
