package p000;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.CheckBox;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: wwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwy {

    /* renamed from: a */
    public String[] f51514a;

    /* renamed from: b */
    public Screenshot f51515b;

    /* renamed from: c */
    public final FeedbackChimeraActivity f51516c;

    /* renamed from: d */
    boolean f51517d;

    /* renamed from: e */
    boolean f51518e;

    /* renamed from: f */
    public boolean f51519f;

    /* renamed from: g */
    public wvm f51520g;

    /* renamed from: h */
    private Handler f51521h;

    /* renamed from: i */
    private final Long f51522i;

    public wwy(FeedbackChimeraActivity feedbackChimeraActivity, Bundle bundle) {
        this(feedbackChimeraActivity, new ErrorReport(), null, null);
        mo29508a(bundle);
    }

    /* renamed from: a */
    public final void mo29507a() {
        boolean z;
        boolean z2;
        if (FeedbackChimeraActivity.m23366a(this)) {
            wvm wvm = this.f51520g;
            String n = this.f51516c.mo18613n();
            wwt wwt = this.f51516c.f31581c;
            boolean z3 = false;
            if (!aaya.m47229b(cdud.m135045b())) {
                z = ((CheckBox) ((wxu) wwt).mo29553a((int) C0126R.C0129id.gf_include_screenshot)).isChecked();
            } else {
                CheckBox checkBox = (CheckBox) ((wxu) wwt).mo29553a((int) C0126R.C0129id.gf_include_screenshot);
                z = (checkBox == null || checkBox.getVisibility() != 0) ? false : checkBox.isChecked();
            }
            boolean z4 = !z;
            wwt wwt2 = this.f51516c.f31581c;
            if (!aaya.m47229b(cdud.m135045b())) {
                z2 = ((CheckBox) ((wxu) wwt2).mo29553a((int) C0126R.C0129id.gf_include_logs)).isChecked();
            } else {
                CheckBox checkBox2 = (CheckBox) ((wxu) wwt2).mo29553a((int) C0126R.C0129id.gf_include_logs);
                z2 = (checkBox2 == null || checkBox2.getVisibility() != 0) ? false : checkBox2.isChecked();
            }
            boolean z5 = !z2;
            wvm.f51425d = z4;
            wvm.f51424c = z5;
            ErrorReport errorReport = wvm.f51422a;
            if (z4) {
                z3 = true;
            } else if (z5) {
                z3 = true;
            }
            errorReport.f31532W = z3;
            errorReport.f31546b = n;
            wvm.mo29463a();
        }
    }

    /* renamed from: b */
    public final void mo29512b() {
        String string = this.f51516c.getString(C0126R.string.gf_unspecified_email_account);
        ArrayList arrayList = new ArrayList();
        if (!soz.m35807f(this.f51516c) || cdtr.f181715a.mo6606a().mo78309h()) {
            try {
                FeedbackChimeraActivity feedbackChimeraActivity = this.f51516c;
                for (Account account : soz.m35798c(feedbackChimeraActivity, feedbackChimeraActivity.getPackageName(), "com.google")) {
                    arrayList.add(account.name);
                }
            } catch (Exception e) {
            }
        }
        String[] strArr = new String[(arrayList.size() + 1)];
        strArr[0] = string;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i++;
            strArr[i] = (String) arrayList.get(i2);
        }
        this.f51514a = strArr;
        if (!this.f51519f) {
            wym.m42470a();
            this.f51521h.postDelayed(new wwx(this), 4000);
        }
    }

    /* renamed from: c */
    public final void mo29513c() {
        mo29507a();
        wym.f51574f = null;
    }

    /* renamed from: d */
    public final boolean mo29514d() {
        Pair pair;
        Bundle bundle;
        if (!this.f51517d) {
            Long l = this.f51522i;
            if (l != null) {
                String a = aayh.m47237a(l.longValue());
                bundle = aayh.m47233a(this.f51516c, a, mo29515e());
                if (bundle != null) {
                    this.f51517d = true;
                    mo29510a(a);
                }
            } else {
                bundle = null;
            }
            this.f51520g.mo29464a(bundle);
        } else if (this.f51518e) {
            return true;
        }
        if (!this.f51518e) {
            if (this.f51522i != null) {
                GoogleHelp e = mo29515e();
                String c = aayh.m47261c(this.f51522i.longValue());
                String[] b = aayh.m47260b(this.f51516c, c, e);
                if (b != null) {
                    this.f51518e = true;
                    mo29510a(c);
                    String d = aayh.m47262d(this.f51522i.longValue());
                    Bundle a2 = aayh.m47233a(this.f51516c, d, e);
                    if (a2 != null) {
                        mo29510a(d);
                    }
                    pair = Pair.create(b, a2);
                } else {
                    pair = Pair.create(null, null);
                }
            } else {
                pair = Pair.create(null, null);
            }
            wvm wvm = this.f51520g;
            String[] strArr = (String[]) pair.first;
            if (!(strArr == null || strArr.length == 0)) {
                wvl wvl = wvm.f51423b;
                String[] strArr2 = wvl.f51420e;
                if (strArr2 == null || strArr2.length == 0) {
                    wvl.f51420e = strArr;
                } else {
                    wvl.f51420e = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr2, strArr});
                }
                ErrorReport errorReport = wvm.f51422a;
                errorReport.f31531V = wvm.f51423b.mo29461b(!errorReport.f31532W);
            }
            this.f51520g.mo29464a((Bundle) pair.second);
        }
        if (this.f51522i != null && System.nanoTime() - this.f51522i.longValue() <= cdtr.f181715a.mo6606a().mo78313l() * 1000000) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        if (!this.f51517d) {
            bundle2.putString("gms:feedback:async_feedback_psd_failure", "timeout");
            this.f51517d = true;
        }
        if (!this.f51518e) {
            bundle2.putString("gms:feedback:async_feedback_psbd_failure", "timeout");
            this.f51518e = true;
        }
        this.f51520g.mo29464a(bundle2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final GoogleHelp mo29515e() {
        String str;
        ApplicationErrorReport applicationErrorReport;
        GoogleHelp googleHelp = new GoogleHelp("feedbackSession");
        ErrorReport g = mo29517g();
        if (g != null) {
            str = g.f31511B;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            googleHelp.f78760c = new Account(str, "com.google");
        }
        if (g == null || (applicationErrorReport = g.f31536a) == null) {
            HelpConfig helpConfig = FeedbackChimeraActivity.f31577k;
            if (helpConfig != null) {
                googleHelp.f78762e = helpConfig.f78827b;
            }
        } else {
            googleHelp.f78762e = applicationErrorReport.packageName;
        }
        if (g != null) {
            new aare(googleHelp).mo31634a(g.f31543ag);
        }
        return googleHelp;
    }

    /* renamed from: f */
    public final boolean mo29516f() {
        return this.f51522i != null;
    }

    /* renamed from: g */
    public final ErrorReport mo29517g() {
        return this.f51520g.mo29466b();
    }

    public wwy(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, Screenshot screenshot, Long l) {
        this.f51517d = false;
        this.f51518e = false;
        this.f51516c = feedbackChimeraActivity;
        this.f51520g = new wvm(feedbackChimeraActivity, new ErrorReport(errorReport.f31536a, errorReport.f31546b, errorReport.f31547c, errorReport.f31548d, errorReport.f31549e, errorReport.f31550f, errorReport.f31551g, errorReport.f31552h, errorReport.f31553i, errorReport.f31554j, errorReport.f31555k, errorReport.f31556l, errorReport.f31557m, errorReport.f31558n, errorReport.f31559o, errorReport.f31560p, errorReport.f31561q, errorReport.f31562r, errorReport.f31563s, errorReport.f31564t, errorReport.f31565u, errorReport.f31566v, errorReport.f31567w, errorReport.f31568x, errorReport.f31569y, errorReport.f31570z, errorReport.f31510A, errorReport.f31511B, errorReport.f31512C, errorReport.f31513D, errorReport.f31514E, errorReport.f31515F, errorReport.f31516G, errorReport.f31517H, errorReport.f31518I, errorReport.f31519J, errorReport.f31520K, errorReport.f31521L, errorReport.f31522M, errorReport.f31523N, errorReport.f31524O, errorReport.f31525P, errorReport.f31526Q, errorReport.f31527R, errorReport.f31528S, errorReport.f31529T, errorReport.f31530U, errorReport.f31531V, errorReport.f31532W, errorReport.f31533X, errorReport.f31534Y, errorReport.f31535Z, errorReport.f31537aa, errorReport.f31538ab, errorReport.f31539ac, errorReport.f31540ad, errorReport.f31541ae, errorReport.f31542af, errorReport.f31543ag, errorReport.f31544ah, errorReport.f31545ai), screenshot);
        this.f51515b = screenshot;
        this.f51522i = l;
        this.f51521h = new adzt();
    }

    /* renamed from: a */
    public final void mo29508a(Bundle bundle) {
        wvm wvm = this.f51520g;
        wvm.f51422a = (ErrorReport) bundle.getParcelable("feedback.REPORT");
        if (wvm.f51422a == null) {
            wvm.f51422a = new ErrorReport();
        }
        wvm.f51423b = new wvl();
        wvm.f51423b.f51416a = bundle.getStringArray("feedback.RUNNING_APPS");
        wvm.f51423b.f51418c = (Screenshot) bundle.getParcelable("feedback.SCREENSHOT_KEY");
        wvm.f51423b.f51419d = bundle.getBundle("feedback.PSD_BUNDLE_KEY");
        wvm.f51423b.f51420e = bundle.getStringArray("feedback.PSBD_FILE_PATH_KEY");
        this.f51514a = bundle.getStringArray("feedback.FOUND_ACCOUNTS");
    }

    /* renamed from: a */
    public final void mo29509a(Screenshot screenshot) {
        this.f51515b = screenshot;
        wvm wvm = this.f51520g;
        wvm.f51423b.f51418c = screenshot;
        wvm.mo29463a();
        this.f51516c.mo18597a(this.f51515b, mo29517g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29510a(String str) {
        aayh.m47251a(this.f51516c.getFilesDir(), str);
    }

    /* renamed from: a */
    public final void mo29511a(Map map) {
        this.f51520g.mo29465a(map);
        this.f51519f = true;
        mo29507a();
        if (FeedbackChimeraActivity.m23366a(this)) {
            this.f51516c.mo18601a(false);
        }
    }
}
