package com.google.android.gms.googlehelp.helpactivities;

import android.accounts.Account;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.SearchView;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.webkit.URLUtil;
import android.webkit.WebBackForwardList;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.WebView;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.gms.googlehelp.fragments.AccountPickerContainer;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HelpChimeraActivity extends abbi implements aarn, aate, aasf {

    /* renamed from: C */
    private static final Set f78942C = sqw.m36045b();

    /* renamed from: D */
    private static int f78943D;

    /* renamed from: b */
    public static final String f78944b;

    /* renamed from: c */
    static final String f78945c;

    /* renamed from: B */
    private final Handler f78946B = new adzt(Looper.getMainLooper());

    /* renamed from: E */
    private aazn f78947E;

    /* renamed from: F */
    private aayy f78948F;

    /* renamed from: G */
    private aatd f78949G;

    /* renamed from: H */
    private aasi f78950H = new aasi();

    /* renamed from: I */
    private final aasi f78951I = new aasi();

    /* renamed from: J */
    private boolean f78952J = false;

    /* renamed from: K */
    private boolean f78953K = false;

    /* renamed from: L */
    private boolean f78954L;

    /* renamed from: M */
    private final Set f78955M = sqw.m36045b();

    /* renamed from: N */
    private SparseArray f78956N;

    /* renamed from: d */
    public final bqgj f78957d = snp.m35702a(10);

    /* renamed from: e */
    public final bqgj f78958e = snp.m35702a(9);

    /* renamed from: f */
    public final aavc f78959f = new aavc(this.f78958e);

    /* renamed from: g */
    public final wzh f78960g = new wzh();

    /* renamed from: h */
    public View f78961h;

    /* renamed from: i */
    public View f78962i;

    /* renamed from: j */
    public aazc f78963j;

    /* renamed from: k */
    public abfy f78964k;

    /* renamed from: l */
    public aaxx f78965l;

    /* renamed from: m */
    public aatc f78966m;

    /* renamed from: n */
    public aarp f78967n;

    /* renamed from: o */
    public boolean f78968o = false;

    /* renamed from: p */
    public boolean f78969p = false;

    /* renamed from: q */
    public boolean f78970q = false;

    /* renamed from: r */
    public abfz f78971r;

    /* renamed from: s */
    public MenuItem f78972s;

    /* renamed from: t */
    public OpenSearchView f78973t;

    /* renamed from: u */
    public abfv f78974u;

    /* renamed from: v */
    public final List f78975v = sqw.m36031a();

    /* renamed from: w */
    public Deque f78976w;

    /* renamed from: x */
    public abfx f78977x;

    static {
        String valueOf = String.valueOf(aazn.class.getSimpleName());
        f78944b = valueOf.length() == 0 ? new String("gH_HelpActivity-") : "gH_HelpActivity-".concat(valueOf);
        String valueOf2 = String.valueOf(aayy.class.getSimpleName());
        f78945c = valueOf2.length() == 0 ? new String("gH_HelpActivity-") : "gH_HelpActivity-".concat(valueOf2);
    }

    /* renamed from: P */
    public static final boolean m66525P() {
        return aaya.m47228a(cegf.m136774b()) && aaya.m47228a(cegr.m136796b());
    }

    /* renamed from: Q */
    private final boolean m66526Q() {
        return aaya.m47227a(this.f56986y.f78827b, cefq.f182610a.mo6606a().mo79084a(), cefq.f182610a.mo6606a().mo79086c(), cefq.f182610a.mo6606a().mo79085b());
    }

    /* renamed from: R */
    private final void m66527R() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.googlehelp.helpactivities.ClickToCallActivity");
        HelpConfig helpConfig = this.f56986y;
        HelpConfig a = helpConfig.mo43215a();
        bxvd da = bzqp.f171047j.mo74144da();
        bzqn bzqn = helpConfig.f78835j.f171053e;
        if (bzqn == null) {
            bzqn = bzqn.f171035c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzqp bzqp = (bzqp) da.f164949b;
        bzqn.getClass();
        bzqp.f171053e = bzqn;
        bzqp.f171049a |= 8;
        a.f78835j = (bzqp) da.mo74062i();
        a.f78805E = helpConfig.f78805E;
        a.f78807G = helpConfig.f78807G;
        startActivity(className.putExtra("EXTRA_HELP_CONFIG", a).putExtra("EXTRA_START_TICK", this.f56986y.f78819S));
    }

    /* renamed from: S */
    private final void m66528S() {
        this.f56986y.f78849x = 0;
    }

    /* renamed from: a */
    public static abeh m66529a(HelpChimeraActivity helpChimeraActivity) {
        bxvd da = abeh.f57196I.mo74144da();
        int i = helpChimeraActivity.mo43321G().f170966e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh = (abeh) da.f164949b;
        int i2 = abeh.f57206a | 2097152;
        abeh.f57206a = i2;
        abeh.f57223r = i;
        abeh.f57206a = i2 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        abeh.f57220o = -1;
        if (i != 2 || helpChimeraActivity.mo43322H() == null) {
            return (abeh) da.mo74062i();
        }
        aasg H = helpChimeraActivity.mo43322H();
        int i3 = H.f56427b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh2 = (abeh) da.f164949b;
        int i4 = abeh2.f57206a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        abeh2.f57206a = i4;
        abeh2.f57220o = i3;
        String str = H.f56428c;
        str.getClass();
        int i5 = i4 | 4096;
        abeh2.f57206a = i5;
        abeh2.f57218m = str;
        aasm aasm = H.f56426a;
        if (aasm != null) {
            String str2 = aasm.f56497g;
            str2.getClass();
            abeh2.f57206a = i5 | 8192;
            abeh2.f57219n = str2;
        }
        return (abeh) da.mo74062i();
    }

    /* renamed from: f */
    private final void m66531f(String str) {
        Log.e("gH_HelpActivity", str);
        setResult(0);
        finish();
    }

    /* renamed from: g */
    private final void m66532g(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String valueOf = String.valueOf(ceeg.m136415t());
            String valueOf2 = String.valueOf(str);
            intent.setData(Uri.parse(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)));
            intent.addFlags(268435456);
            intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            String valueOf3 = String.valueOf(ceeg.f182447a.mo6606a().mo78996ap());
            String valueOf4 = String.valueOf(str);
            intent2.setData(Uri.parse(valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4)));
            try {
                startActivity(intent2);
            } catch (ActivityNotFoundException e2) {
                Log.w("gH_HelpActivity", "Can't view GmsCore in Play Store", e2);
            }
        }
    }

    /* renamed from: A */
    public final void mo43315A() {
        bhdy bhdy;
        View findViewById = findViewById(C0126R.C0129id.gh_help_toolbar);
        if ((!aaya.m47229b(cehp.m136860c()) || findViewById != null) && (bhdy = (bhdy) findViewById.getLayoutParams()) != null) {
            bhdy.f118355a = 21;
        }
    }

    /* renamed from: B */
    public final void mo43316B() {
        abcx.m47527j(this);
        mo43320F();
    }

    /* renamed from: C */
    public final void mo43317C() {
        if (!this.f56986y.mo43237l()) {
            startActivity(new Intent().setClassName(this, "com.google.android.gms.googlehelp.contact.chat.ChatSupportRequestFormActivity").putExtra("EXTRA_HELP_CONFIG", this.f56986y).putExtra("EXTRA_START_TICK", this.f56986y.f78819S));
            return;
        }
        ChatRequestAndConversationChimeraService.m66446a(this, this.f56986y);
        startActivity(ChatConversationChimeraActivity.m66400a(this, this.f56986y));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: D */
    public final void mo43318D() {
        if (cefz.f182622a.mo6606a().mo79095c() || aayh.m47254a(this.f56986y.f78827b, cefz.f182622a.mo6606a().mo79096d())) {
            String e = this.f56986y.mo43230e();
            if (TextUtils.isEmpty(e)) {
                m66527R();
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            String w = ceeg.m136418w();
            if (cegr.m136797c() && this.f56986y.mo43231f() != null) {
                w = this.f56986y.mo43231f();
            }
            String z = ceeg.m136421z();
            int length = String.valueOf(z).length();
            StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(e).length() + String.valueOf(w).length());
            sb.append(z);
            sb.append("/");
            sb.append(e);
            sb.append("/contact/");
            sb.append(w);
            Intent data = intent.setData(Uri.parse(sb.toString()));
            data.putExtra("requireGcmToken", true);
            abht.m47730a(this, data, this.f56986y, 4);
            return;
        }
        m66527R();
    }

    /* renamed from: E */
    public final void mo43319E() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.googlehelp.helpactivities.EmailActivity");
        HelpConfig helpConfig = this.f56986y;
        HelpConfig a = helpConfig.mo43215a();
        bzqp bzqp = helpConfig.f78835j;
        if (!(bzqp == null || (bzqp.f171049a & 1) == 0)) {
            bxvd da = bzqp.f171047j.mo74144da();
            bzqo bzqo = helpConfig.f78835j.f171050b;
            if (bzqo == null) {
                bzqo = bzqo.f171040e;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzqp bzqp2 = (bzqp) da.f164949b;
            bzqo.getClass();
            bzqp2.f171050b = bzqo;
            bzqp2.f171049a |= 1;
            a.f78835j = (bzqp) da.mo74062i();
        }
        a.f78805E = helpConfig.f78805E;
        a.f78807G = helpConfig.f78807G;
        startActivity(className.putExtra("EXTRA_HELP_CONFIG", a).putExtra("EXTRA_START_TICK", this.f56986y.f78819S));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abcx.a(aasf, boolean):void
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, int]
     candidates:
      abcx.a(aasf, int):void
      abcx.a(aasf, long):void
      abcx.a(aasf, aasm):void
      abcx.a(aasf, android.accounts.Account):void
      abcx.a(aasf, bzps):void
      abcx.a(aasf, java.lang.CharSequence):void
      abcx.a(aasf, java.lang.String):void
      abcx.a(bxvd, android.content.Context):void
      abcx.a(bxvd, com.google.android.gms.googlehelp.common.HelpConfig):void
      abcx.a(qws, bxvd):void
      abcx.a(aasf, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo43320F() {
        Screenshot screenshot;
        HelpConfig helpConfig = this.f56986y;
        if (helpConfig.f78802B != null && aayh.m47254a(helpConfig.f78827b, ceeg.f182447a.mo6606a().mo79029x())) {
            try {
                this.f56986y.f78802B.send();
                abcx.m47487a((aasf) this, true);
                return;
            } catch (Exception e) {
                Log.w("gH_HelpActivity", "Could not launch custom Feedback, falling back to default case.", e);
                abcx.m47487a((aasf) this, false);
            }
        }
        ErrorReport errorReport = this.f56986y.f78851z;
        if (errorReport == null) {
            errorReport = new ErrorReport();
        }
        if (TextUtils.isEmpty(errorReport.f31536a.packageName)) {
            String str = this.f56986y.f78827b;
            String installerPackageName = getPackageManager().getInstallerPackageName(this.f56986y.f78827b);
            errorReport.f31536a.packageName = str;
            errorReport.f31536a.type = 11;
            errorReport.f31536a.installerPackageName = installerPackageName;
        }
        if (this.f56986y.mo43232g()) {
            errorReport.f31511B = this.f56986y.f78829d.name;
        }
        Bundle bundle = this.f56986y.f78838m;
        if (bundle != null && bundle.size() > 0) {
            errorReport.f31513D = this.f56986y.f78838m;
        }
        errorReport.f31534Y = this.f56986y.f78801A;
        if (TextUtils.isEmpty(errorReport.f31529T)) {
            HelpConfig helpConfig2 = this.f56986y;
            byte[] bArr = helpConfig2.f78840o;
            if (bArr != null) {
                screenshot = Screenshot.m66504a(bArr, helpConfig2.f78841p, helpConfig2.f78842q);
            } else {
                Bitmap bitmap = helpConfig2.f78839n;
                screenshot = bitmap != null ? Screenshot.m66502a(bitmap) : null;
            }
            if (screenshot != null) {
                Screenshot.m66506a(errorReport, screenshot);
            }
        }
        errorReport.f31543ag = this.f56986y.f78830e;
        Intent intent = new Intent("android.intent.action.APP_ERROR");
        intent.setPackage(getPackageName());
        intent.addFlags(268435456);
        intent.putExtra("com.android.feedback.SAFEPARCELABLE_REPORT", errorReport);
        HelpConfig helpConfig3 = this.f56986y;
        if (helpConfig3.f78806F) {
            intent.putExtra("ASYNC_PSD_START_TICK_NANOS", helpConfig3.f78819S);
        }
        startActivity(intent);
    }

    /* renamed from: G */
    public final bzpv mo43321G() {
        return (bzpv) this.f78976w.peek();
    }

    /* renamed from: H */
    public final aasg mo43322H() {
        aazn y = mo43363y();
        if (!y.f56893b.isEmpty()) {
            return (aasg) y.f56893b.peek();
        }
        return null;
    }

    /* renamed from: I */
    public final void mo43323I() {
        this.f78952J = true;
        this.f78951I.mo31709a();
        aazc aazc = this.f78963j;
        if (PopularArticlesContainer.m66610b()) {
            aazc.mo31934g().mo43372a();
        } else {
            aazc.f56874g.mo31915a();
        }
        if (this.f78969p && this.f56986y.mo43242q()) {
            mo43327M();
        }
    }

    /* renamed from: J */
    public final void mo43324J() {
        int i = this.f56986y.f78837l;
        if (i == 1) {
            mo43331a(37, bzps.CHAT);
        } else if (i == 2) {
            mo43331a(42, bzps.CHAT);
        }
    }

    /* renamed from: K */
    public final void mo43325K() {
        aayy aayy = this.f78948F;
        aayy.f56859f = false;
        aayy.f56860g = true;
        aayy.f56862i.removeCallbacks(aayy.f56863j);
        aayy.f56861h = null;
        long currentTimeMillis = System.currentTimeMillis() - aayy.f56857d;
        long aH = (long) ((int) ceeg.f182447a.mo6606a().mo78967aH());
        if (currentTimeMillis >= aH || aayy.f56857d == -1) {
            aayy.mo31920a();
        } else if (!aayy.f56858e) {
            aayy.f56862i.postDelayed(aayy.f56864k, aH - currentTimeMillis);
            aayy.f56858e = true;
        }
    }

    /* renamed from: L */
    public final boolean mo43326L() {
        return this.f78948F.f56860g;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg
     arg types: [int, int, java.lang.String, int, int, int, wzh]
     candidates:
      aasg.a(int, int, java.lang.String, float, int, wzh, int):aasg
      aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg */
    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo43327M() {
        String str;
        int i;
        boolean L = mo43326L();
        int i2 = abgx.f57444e;
        HelpConfig helpConfig = this.f56986y;
        if (helpConfig.mo43242q()) {
            bzqs bzqs = helpConfig.f78835j.f171057i;
            if (bzqs == null) {
                bzqs = bzqs.f171063c;
            }
            if (!TextUtils.isEmpty(bzqs.f171065a)) {
                bzqs bzqs2 = helpConfig.f78835j.f171057i;
                if (bzqs2 == null) {
                    bzqs2 = bzqs.f171063c;
                }
                String str2 = bzqs2.f171066b;
                bzqs bzqs3 = helpConfig.f78835j.f171057i;
                if (bzqs3 == null) {
                    bzqs3 = bzqs.f171063c;
                }
                String str3 = bzqs3.f171065a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append("#");
                sb.append(str3);
                str = sb.toString();
            } else {
                bzqs bzqs4 = helpConfig.f78835j.f171057i;
                if (bzqs4 == null) {
                    bzqs4 = bzqs.f171063c;
                }
                str = bzqs4.f171066b;
            }
        } else {
            str = null;
        }
        if (str != null) {
            aasm a = aasm.m46882a(str, aasw.m46952a(), helpConfig);
            if (!helpConfig.mo43252z() || !TextUtils.equals(helpConfig.f78815O, a.f56497g)) {
                abcx.m47477a(this, a);
            }
            if (!helpConfig.f78820T) {
                i = 7;
            } else {
                i = 6;
            }
            new abgx(this, a, aasg.m46856a(24, 0, "", -1.0f, true, i, abgx.m47703a(helpConfig)), L, false, true, Calendar.getInstance()).executeOnExecutor(this.f78958e, new Void[0]);
        }
    }

    /* renamed from: N */
    public final void mo43328N() {
        int i;
        abeh a = m66529a(this);
        HelpConfig helpConfig = this.f56986y;
        if (!helpConfig.f78820T) {
            i = 3;
        } else {
            i = 2;
        }
        wzh wzh = new wzh(helpConfig.f78819S);
        wzh.mo29584c();
        abcx.m47468a(this, i, wzh.mo29582a(), bzpv.m126025a(a.f57223r), a.f57218m, a.f57219n, a.f57220o);
    }

    /* renamed from: O */
    public final boolean mo43329O() {
        HelpConfig helpConfig = this.f56986y;
        return helpConfig != null && helpConfig.f78808H;
    }

    /* renamed from: b */
    public final void mo31769b(aaru aaru) {
        synchronized (this.f78975v) {
            this.f78975v.remove(aaru);
        }
    }

    /* renamed from: c */
    public final void mo43344c(aaru aaru) {
        aayy aayy = this.f78948F;
        aayy.f56857d = -1;
        aayy.f56858e = false;
        aayy.f56860g = false;
        aayy.f56862i.removeCallbacks(aayy.f56864k);
        aayy.f56861h = aaru;
        if (!aayy.f56859f) {
            aayy.f56862i.postDelayed(aayy.f56863j, ceeg.f182447a.mo6606a().mo78966aG());
            aayy.f56859f = true;
        }
    }

    /* renamed from: d */
    public final void mo43347d(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        startActivity(intent);
    }

    /* renamed from: e */
    public final void mo43348e() {
        this.f78953K = true;
        Intent intent = getIntent();
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.removeExtra("EXTRA_GOOGLE_HELP");
        }
        this.f56986y.mo43218a((bzqp) null);
        intent.putExtra("EXTRA_HELP_CONFIG", this.f56986y);
        intent.putExtra("EXTRA_START_TICK", System.nanoTime());
        intent.addFlags(67108864);
        startActivity(intent);
    }

    /* renamed from: i */
    public final aaxx mo18628i() {
        return this.f78965l;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        return this.f78966m;
    }

    /* renamed from: k */
    public final Context mo18630k() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo43350l() {
        abfb.m47606a(null, this.f78958e, this, this.f56986y, this.f78965l, this.f56987z);
    }

    /* renamed from: m */
    public final void mo43351m() {
        bhdy bhdy;
        View findViewById = findViewById(C0126R.C0129id.gh_help_toolbar);
        if ((!aaya.m47229b(cehp.m136860c()) || findViewById != null) && (bhdy = (bhdy) findViewById.getLayoutParams()) != null) {
            bhdy.f118355a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo43352n() {
        aaxz.m47225a(this.f78957d, this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        if (i == 27 && i2 == -1 && (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) != null && !stringArrayListExtra.isEmpty()) {
            this.f78971r.mo32077a(stringArrayListExtra.get(0), true);
            this.f78977x.mo32071a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (((p000.aasg) r1.f56893b.peek()).mo31704a() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r8.f56986y.mo43207B() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        if (p000.aaya.m47228a(p000.cefz.m136755c()) != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (r8.f56986y.mo43209D() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0159, code lost:
        if (r8.f56986y.mo43207B() != false) goto L_0x01b9;
     */
    public final void onBackPressed() {
        WebView webView;
        aayy aayy = this.f78948F;
        aaru aaru = aayy.f56861h;
        if (aaru != null && !(aaru instanceof abgw) && !aaru.f56400b) {
            aayy.f56859f = false;
            aayy.f56860g = true;
            aayy.f56862i.removeCallbacks(aayy.f56863j);
            aayy.f56861h.mo31664c();
            aayy.f56861h = null;
            aayy.f56856c.setVisibility(0);
            aayy.f56855b.setVisibility(8);
        } else {
            bzpv G = mo43321G();
            bzps bzps = bzps.UNKNOWN_CONTACT_MODE;
            bzpv bzpv = bzpv.HELP_CONSOLE;
            int ordinal = G.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        aazn y = mo43363y();
                        if (y.f56893b.size() <= 1) {
                            aasm aasm = ((aasg) y.f56893b.peek()).f56426a;
                            if (aasm != null) {
                                if ((aasm.mo31727j() || aasm.mo31729l()) && (webView = y.f56892a) != null && webView.canGoBack()) {
                                    WebBackForwardList copyBackForwardList = y.f56892a.copyBackForwardList();
                                    int currentIndex = copyBackForwardList.getCurrentIndex() - 1;
                                    if (currentIndex >= 0 && !"about:blank".equals(copyBackForwardList.getItemAtIndex(currentIndex).getUrl())) {
                                        y.f56892a.goBack();
                                    }
                                }
                                if (!((aasg) y.f56893b.peek()).mo31704a()) {
                                    y.mo31944a();
                                }
                                aazn y2 = mo43363y();
                                if (!y2.f56893b.isEmpty()) {
                                }
                                if (!this.f56986y.mo43208C()) {
                                    if (!cego.m136787b()) {
                                    }
                                    if (cego.m136787b()) {
                                        if (this.f56986y.mo43207B()) {
                                        }
                                    }
                                    if (aaya.m47229b(cehp.m136861d())) {
                                        if (mo43363y().mo31949c()) {
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Cannot call goBack when there is no leafContent.");
                            }
                        } else {
                            aasf aasf = y.f56894c;
                            if (aasf instanceof HelpChimeraActivity) {
                                abeh a = m66529a((HelpChimeraActivity) aasf);
                                abcx.m47482a(y.f56894c, bzpv.HELP_ANSWER_FRAGMENT, a.f57220o, a.f57218m, a.f57219n);
                            }
                            y.f56893b.pop();
                            y.mo31945a((aasg) y.f56893b.peek(), true);
                        }
                        if (mo43363y().mo31948b()) {
                            supportInvalidateOptionsMenu();
                        }
                    }
                }
                abeh a2 = m66529a(this);
                abcx.m47482a(this, G, a2.f57220o, a2.f57218m, a2.f57219n);
                mo43337a((bzpv) this.f78976w.pop(), 8);
                mo43337a((bzpv) this.f78976w.peek(), 0);
                supportInvalidateOptionsMenu();
            } else if (m66525P() && this.f78973t.mo60449d()) {
                this.f78973t.mo60451f();
            }
            this.f56985A = 25;
            super.onBackPressed();
            return;
        }
        if (aaya.m47228a(cegf.m136774b()) && mo43321G() == bzpv.HELP_CONSOLE) {
            findViewById(C0126R.C0129id.gh_search_box).setVisibility(0);
            mo43315A();
            supportInvalidateOptionsMenu();
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        MenuInflater menuInflater = getMenuInflater();
        HelpConfig helpConfig = this.f56986y;
        boolean a = aarq.m46802a(helpConfig);
        int i2 = C0126R.C0130menu.gh_main_menu_dark;
        int i3 = 1;
        if (!a && helpConfig.f78801A.f31623a != 1) {
            i2 = C0126R.C0130menu.gh_main_menu_light;
        }
        menuInflater.inflate(i2, menu);
        if (m66526Q() && aaya.m47228a(cegf.m136774b())) {
            MenuItem findItem = menu.findItem(C0126R.C0129id.gh_menu_share_article);
            if (aayi.m47270b()) {
                i = aayi.m47263a(this, C0126R.attr.ghf_greyIconColor);
            } else {
                i = C1133kh.m17843b(this, C0126R.color.google_grey700);
            }
            aayh.m47248a(findItem, this, i);
        }
        if (!m66525P()) {
            this.f78972s = menu.findItem(C0126R.C0129id.gh_menu_search);
            bzpv bzpv = (bzpv) this.f78976w.peek();
            boolean z = mo43364z();
            if (z || bzpv == bzpv.HELP_CONSOLE || bzpv == bzpv.HELP_SUB_CONSOLE) {
                C1264pc.m19828a(this.f78972s, new abbe(this));
                SearchView searchView = (SearchView) C1264pc.m19826a(this.f78972s);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(C0126R.C0129id.search_src_text);
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    declaredField.set(autoCompleteTextView, 0);
                } catch (Exception e) {
                    Log.e("gH_HelpActivity", "Could not set mCursorDrawableRes on search view's EditText", e);
                }
                if (aaya.m47228a(cegf.m136774b())) {
                    searchView.mo1615a((CharSequence) getString(C0126R.string.gh_describe_your_issue));
                    autoCompleteTextView.setHintTextColor(C1133kh.m17843b(this, C0126R.color.google_grey600));
                } else {
                    searchView.mo1615a((CharSequence) getString(C0126R.string.gh_describe_your_issue));
                    HelpConfig helpConfig2 = this.f56986y;
                    int i4 = helpConfig2.f78801A.f31623a;
                    int i5 = C0126R.color.gh_text_white_opacity_70_percent;
                    if (i4 == 0 && !aarq.m46802a(helpConfig2)) {
                        i5 = C0126R.color.gh_black_opacity_70_percent;
                    }
                    autoCompleteTextView.setHintTextColor(C1133kh.m17843b(this, i5));
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) autoCompleteTextView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = getResources().getDimensionPixelSize(C0126R.dimen.gh_accessibility_required_min_width_and_height);
                }
                autoCompleteTextView.setPadding(0, autoCompleteTextView.getPaddingTop(), 0, autoCompleteTextView.getPaddingBottom());
                LinearLayout linearLayout = (LinearLayout) searchView.findViewById(C0126R.C0129id.search_edit_frame);
                if (!(linearLayout == null || (layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams()) == null)) {
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                }
                this.f78972s.setVisible(false);
                this.f78977x = new abfx(searchView);
                this.f78977x.f57374a.mo1614a(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
                if (z || (this.f56986y.mo43207B() && TextUtils.isEmpty(this.f78971r.f57383b))) {
                    this.f78972s.expandActionView();
                    this.f78971r.mo32077a(this.f56986y.f78821U, false);
                }
            } else {
                menu.removeItem(C0126R.C0129id.gh_menu_search);
                this.f78977x = null;
            }
        }
        this.f78956N = new SparseArray(this.f56986y.f78845t.size());
        List list = this.f56986y.f78845t;
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            OverflowMenuItem overflowMenuItem = (OverflowMenuItem) list.get(i6);
            menu.add(0, i3, 0, overflowMenuItem.f78986b);
            this.f78956N.put(i3, overflowMenuItem);
            i6++;
            i3++;
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        boolean z = false;
        mo43346c(false);
        aavc aavc = this.f78959f;
        if (aavc.mo31819a()) {
            aavc.removeCallbacks(aavc.f56640d);
            aavc.f56638b = null;
        }
        HelpConfig helpConfig = this.f56986y;
        if (helpConfig != null) {
            ErrorReport errorReport = helpConfig.f78851z;
            if (errorReport != null) {
                String[] strArr = errorReport.f31531V;
                if (strArr != null && strArr.length > 0) {
                    z = true;
                }
                if (z || !TextUtils.isEmpty(errorReport.f31529T)) {
                    new abbd(errorReport, this, z).start();
                }
            }
            int i = this.f56985A;
            if (i != 1) {
                abeh a = m66529a(this);
                abcx.m47471a(this, i, bzpv.m126025a(a.f57223r), a.f57220o, a.f57218m, a.f57219n);
            }
            if (!this.f78953K) {
                GoogleHelpChimeraService.m66615a(GoogleHelpChimeraService.m66618c(this.f56986y));
            }
        }
        aaxx aaxx = this.f78965l;
        if (aaxx != null) {
            aaxx.close();
        }
        aatc aatc = this.f78966m;
        if (aatc != null) {
            aatc.close();
        }
        super.onDestroy();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aazo.a(java.lang.String, java.util.List, boolean):java.lang.String
     arg types: [java.lang.String, java.util.List, int]
     candidates:
      aazo.a(aasf, java.lang.String, com.google.android.chimera.WebView):void
      aazo.a(aasf, java.lang.String, java.lang.String):void
      aazo.a(java.lang.String, java.util.List, boolean):java.lang.String */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Uri data;
        aasm aasm;
        aasm aasm2;
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.gh_menu_share_article) {
            aasg H = mo43322H();
            if (H == null) {
                Log.e("gH_HelpActivity", "Can't share Help article. Help element is null.");
            } else {
                aasm aasm3 = H.f56426a;
                if (aasm3 != null) {
                    C1120jw a = C1120jw.m17408a(getContainerActivity());
                    a.mo14163b("text/plain");
                    a.mo14161a((CharSequence) aasm3.f56497g);
                    a.mo14162a(aasm3.f56496f);
                    Intent a2 = a.mo14160a();
                    if (spn.m35860a(this, a2)) {
                        startActivity(Intent.createChooser(a2, getString(C0126R.string.gh_menu_share_article)));
                        abcx.m47513c(this, aasm3.f56497g);
                    }
                } else {
                    Log.e("gH_HelpActivity", "Can't share Help article. Leaf content is null.");
                }
            }
        } else if (itemId == C0126R.C0129id.gh_menu_feedback) {
            mo43320F();
            return true;
        } else if (itemId == C0126R.C0129id.gh_menu_play_store) {
            m66532g(this.f56986y.f78827b);
            return true;
        } else {
            int i = 0;
            if (itemId == C0126R.C0129id.gh_menu_print) {
                bzps bzps = bzps.UNKNOWN_CONTACT_MODE;
                bzpv bzpv = bzpv.HELP_CONSOLE;
                int ordinal = ((bzpv) this.f78976w.peek()).ordinal();
                if (ordinal == 0) {
                    aazc aazc = this.f78963j;
                    HelpChimeraActivity helpChimeraActivity = aazc.f56869b;
                    List list = aazc.mo31934g().f78996b;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    String a3 = aazo.m47329a(helpChimeraActivity, false);
                    sb.append(a3);
                    sb2.append(aazo.m47330a(a3, list, false));
                    aazo.m47332a(helpChimeraActivity, sb.toString(), sb2.toString());
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        aazn y = mo43363y();
                        y.mo31946a(new aazk(y));
                    }
                } else if (!m66525P()) {
                    abfy abfy = this.f78964k;
                    HelpChimeraActivity helpChimeraActivity2 = abfy.f57375a;
                    List list2 = abfy.f57381g.f56901b;
                    String a4 = aazo.m47329a(helpChimeraActivity2, true);
                    aazo.m47332a(helpChimeraActivity2, a4, aazo.m47330a(a4, list2, true));
                }
                return true;
            } else if (itemId == C0126R.C0129id.gh_menu_clear_history) {
                aatd aatd = this.f78949G;
                if (aatd != null) {
                    aatd.mo31767a();
                    this.f78949G = null;
                }
                new abgv(this).start();
                HelpConfig helpConfig = this.f56986y;
                aarp aarp = this.f78967n;
                String[] strArr = aatw.f56574a;
                aasa a5 = new aasc(this, helpConfig).mo31695a();
                a5.mo31686a("name");
                a5.mo31686a("display_country");
                a5.mo31686a("phone_number");
                a5.mo31686a("locale");
                a5.mo31685a();
                if (aarp != null) {
                    aarp.mo31700d("escalation_options");
                }
                aazc aazc2 = this.f78963j;
                PopularArticlesContainer g = aazc2.mo31934g();
                List list3 = g.f78996b;
                if (list3 != null) {
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((aasm) list3.get(i2)).mo31718c();
                    }
                }
                if (PopularArticlesContainer.m66610b() && (aasm2 = g.f78997c) != null) {
                    aasm2.f56509s = false;
                    aasm2.f56510t = false;
                    aasm2.f56504n = "";
                }
                if (!PopularArticlesContainer.m66610b() && (aasm = aazc2.f56874g.f56849c) != null) {
                    aasm.f56509s = false;
                    aasm.f56510t = false;
                    aasm.f56504n = "";
                }
                aazq.m47334a(aazc2.f56869b, aazc2.f56870c);
                abfy abfy2 = this.f78964k;
                if (abfy2.mo32075b()) {
                    abge abge = abfy2.f57378d;
                    if (abge.f57390a != null) {
                        while (i < abge.f57390a.size()) {
                            ((aasm) abge.f57390a.get(i)).mo31718c();
                            i++;
                        }
                    }
                } else {
                    List list4 = abfy2.f57381g.f56901b;
                    if (list4 != null) {
                        int size2 = list4.size();
                        while (i < size2) {
                            ((aasm) list4.get(i)).mo31718c();
                            i++;
                        }
                    }
                }
                String string = getString(C0126R.string.gh_clear_history_announcement);
                this.f78961h.announceForAccessibility(string);
                Toast.makeText(this, string, 1).show();
                return true;
            } else if (itemId == C0126R.C0129id.gh_menu_version_info) {
                abbj abbj = new abbj();
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.add(abbj, "version_dialog");
                beginTransaction.commitAllowingStateLoss();
                return true;
            } else {
                OverflowMenuItem overflowMenuItem = (OverflowMenuItem) this.f78956N.get(itemId);
                if (overflowMenuItem != null) {
                    Intent intent = overflowMenuItem.f78987c;
                    HelpConfig helpConfig2 = this.f56986y;
                    if (spn.m35860a(this, intent)) {
                        startActivity(intent);
                    } else if (intent.getAction().equals("android.intent.action.VIEW") && (data = intent.getData()) != null && "https".equals(data.getScheme())) {
                        abht.m47726a(this, new Intent(intent), helpConfig2);
                    }
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onPause() {
        aavc aavc = this.f78959f;
        if (aavc.mo31819a()) {
            aavc.removeCallbacks(aavc.f56640d);
        }
        super.onPause();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0178  */
    public final boolean onPrepareOptionsMenu(Menu menu) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        aasm aasm;
        super.onPrepareOptionsMenu(menu);
        int visibility = this.f78961h.getVisibility();
        bzpv bzpv = (bzpv) this.f78976w.peek();
        boolean z5 = false;
        if (visibility == 0) {
            if (bzpv == bzpv.HELP_SUB_CONSOLE) {
                z = true;
            } else if (bzpv == bzpv.HELP_ANSWER_FRAGMENT) {
                z = true;
            }
            if (visibility == 0) {
                HelpConfig helpConfig = this.f56986y;
                if (helpConfig.f78837l == 3 || helpConfig.mo43235j() || this.f56986y.mo43229d(this)) {
                    z2 = true;
                    if (!m66525P()) {
                        if (this.f78977x != null) {
                            abfz abfz = this.f78971r;
                            bzpv bzpv2 = bzpv.HELP_SUB_CONSOLE;
                            abfx a = abfz.mo32076a();
                            if (a != null) {
                                SearchView searchView = a.f57374a;
                                searchView.f1260m = abfz;
                                searchView.f1270w = abfz;
                                abgf abgf = new abgf(abfz.f57382a, abfz.mo32076a(), abfz.f57382a.f78958e);
                                SearchView searchView2 = a.f57374a;
                                searchView2.f1264q = abgf;
                                searchView2.f1251a.setAdapter(searchView2.f1264q);
                                if (bzpv == bzpv2) {
                                    a.mo32072a(abfz.f57383b, false);
                                }
                                a.mo32071a();
                            } else {
                                throw new IllegalStateException("initialize called before search view was set.");
                            }
                        }
                        if (bzpv == bzpv.HELP_SUB_CONSOLE) {
                            this.f78972s.expandActionView();
                            abfz abfz2 = this.f78971r;
                            abfz2.mo32077a(abfz2.f57383b, false);
                            this.f78972s.getActionView().clearFocus();
                        }
                    }
                    if (m66526Q()) {
                        MenuItem findItem = menu.findItem(C0126R.C0129id.gh_menu_share_article);
                        C1120jw a2 = C1120jw.m17408a(getContainerActivity());
                        a2.mo14163b("text/plain");
                        a2.mo14161a((CharSequence) "");
                        a2.mo14162a("");
                        Intent a3 = a2.mo14160a();
                        if (aaya.m47229b(cehp.m136861d())) {
                            aazn y = mo43363y();
                            z4 = (mo43321G() != bzpv.HELP_ANSWER_FRAGMENT || y.mo31948b() || y.mo31949c() || (!y.f56893b.isEmpty() && (aasm = ((aasg) y.f56893b.peek()).f56426a) != null && aasm.f56515y == 27)) ? false : spn.m35860a(this, a3);
                        } else {
                            z4 = mo43321G() == bzpv.HELP_ANSWER_FRAGMENT && !mo43363y().mo31948b() && spn.m35860a(this, a3);
                        }
                        findItem.setVisible(z4);
                    }
                    MenuItem findItem2 = menu.findItem(C0126R.C0129id.gh_menu_feedback);
                    if (z) {
                        z3 = false;
                    } else {
                        z3 = !z2;
                    }
                    findItem2.setVisible(z3);
                    menu.findItem(C0126R.C0129id.gh_menu_play_store).setVisible(!this.f78954L && abht.m47729a(this));
                    if (!aaya.m47228a(cehy.f182699a.mo6606a().mo79154b())) {
                        menu.findItem(C0126R.C0129id.gh_menu_print).setVisible(false);
                    } else {
                        MenuItem findItem3 = menu.findItem(C0126R.C0129id.gh_menu_print);
                        int i = Build.VERSION.SDK_INT;
                        if (abht.m47729a((Context) this) && this.f78961h.getVisibility() == 0) {
                            bzps bzps = bzps.UNKNOWN_CONTACT_MODE;
                            bzpv bzpv3 = bzpv.HELP_CONSOLE;
                            int ordinal = ((bzpv) this.f78976w.peek()).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2 && !mo43363y().f56893b.isEmpty()) {
                                        z5 = true;
                                    }
                                } else if (!m66525P() && this.f78964k.f57381g.f56901b != null) {
                                    z5 = true;
                                }
                            } else if (this.f78963j.mo31934g().f78996b != null) {
                                z5 = true;
                            }
                        }
                        findItem3.setVisible(z5);
                    }
                    return true;
                } else if (this.f56986y.mo43244s()) {
                    z2 = true;
                    if (!m66525P()) {
                    }
                    if (m66526Q()) {
                    }
                    MenuItem findItem22 = menu.findItem(C0126R.C0129id.gh_menu_feedback);
                    if (z) {
                    }
                    findItem22.setVisible(z3);
                    menu.findItem(C0126R.C0129id.gh_menu_play_store).setVisible(!this.f78954L && abht.m47729a(this));
                    if (!aaya.m47228a(cehy.f182699a.mo6606a().mo79154b())) {
                    }
                    return true;
                }
            }
            z2 = false;
            if (!m66525P()) {
            }
            if (m66526Q()) {
            }
            MenuItem findItem222 = menu.findItem(C0126R.C0129id.gh_menu_feedback);
            if (z) {
            }
            findItem222.setVisible(z3);
            menu.findItem(C0126R.C0129id.gh_menu_play_store).setVisible(!this.f78954L && abht.m47729a(this));
            if (!aaya.m47228a(cehy.f182699a.mo6606a().mo79154b())) {
            }
            return true;
        }
        z = false;
        if (visibility == 0) {
        }
        z2 = false;
        if (!m66525P()) {
        }
        if (m66526Q()) {
        }
        MenuItem findItem2222 = menu.findItem(C0126R.C0129id.gh_menu_feedback);
        if (z) {
        }
        findItem2222.setVisible(z3);
        menu.findItem(C0126R.C0129id.gh_menu_play_store).setVisible(!this.f78954L && abht.m47729a(this));
        if (!aaya.m47228a(cehy.f182699a.mo6606a().mo79154b())) {
        }
        return true;
    }

    public final void onResume() {
        aavc aavc = this.f78959f;
        if (aavc.mo31819a()) {
            aavc.postAtTime(aavc.f56640d, Math.min(SystemClock.uptimeMillis(), aavc.f56637a));
        }
        super.onResume();
        ArrayList arrayList = new ArrayList(this.f78975v);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aaru aaru = (aaru) arrayList.get(i);
            aaru.f56401c = false;
            Object obj = aaru.f56402d;
            if (obj != null) {
                aaru.mo31661a(obj);
                aaru.f56402d = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        int size = this.f78975v.size();
        for (int i = 0; i < size; i++) {
            ((aaru) this.f78975v.get(i)).f56401c = true;
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(android.content.Context, int, boolean):void
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, int, int]
     candidates:
      com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(android.content.Context, android.os.Bundle, int):void
      com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(com.google.android.gms.googlehelp.common.HelpConfig, java.util.Map, aast):int
      com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(android.content.Context, int, boolean):void */
    public final void onStop() {
        aasm aasm;
        super.onStop();
        aatd aatd = this.f78949G;
        if (aatd != null) {
            long currentTimeMillis = System.currentTimeMillis();
            aasa a = aatd.f56535c.mo31695a();
            a.mo31688a("ongoing_session_last_stopped_ms", currentTimeMillis);
            a.mo31689a("ongoing_session_id", aatd.f56534b.f78830e);
            String str = aatd.f56534b.f78828c;
            if (str != null) {
                a.mo31689a("ongoing_session_context", str);
            }
            if (aatd.f56533a.mo43321G() != bzpv.HELP_ANSWER_FRAGMENT) {
                HelpConfig helpConfig = aatd.f56534b;
                helpConfig.f78815O = "";
                helpConfig.f78825Y = 1;
                helpConfig.f78816P = -1;
                helpConfig.f78818R = -1.0f;
                helpConfig.f78817Q = "";
            } else {
                aasg H = aatd.f56533a.mo43322H();
                if (H != null && !H.mo31704a() && !H.mo31705b() && (aasm = H.f56426a) != null) {
                    a.mo31689a("ongoing_session_browse_url", aasm.f56497g);
                    int i = H.f56433h;
                    int i2 = i - 1;
                    if (i != 0) {
                        a.mo31687a("ongoing_session_user_action_type", i2);
                        a.mo31687a("ongoing_session_click_rank", H.f56427b);
                        a.f56419a.putFloat(a.f56420b.mo31656a("ongoing_session_scroll_pos_y"), aatd.f56533a.mo43363y().mo31950d());
                        if (!TextUtils.isEmpty(H.f56428c)) {
                            a.mo31689a("ongoing_session_query", H.f56428c);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            a.mo31685a();
        }
        if (ceeg.m136420y()) {
            ReportBatchedMetricsChimeraGcmTaskService.m66599a((Context) this, (int) ceeg.f182447a.mo6606a().mo78987ag(), false);
        }
    }

    /* renamed from: p */
    public final void mo43354p() {
        boolean r = mo43356r();
        boolean s = mo43357s();
        if (r || s) {
            mo43339a(r, s);
        }
        if (this.f78961h.getVisibility() != 0) {
            if (!s) {
                mo43343b(true);
            }
            this.f78961h.setVisibility(0);
        }
    }

    /* renamed from: q */
    public final void mo43355q() {
        if (this.f78961h.getVisibility() != 0) {
            if (mo43356r()) {
                mo43361w().executeOnExecutor(this.f78957d, new Void[0]);
            }
            if (!mo43357s() || !ssk.m36235a(this)) {
                mo43343b(false);
            } else {
                mo43332a(mo43330a(false));
            }
            this.f78961h.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo43356r() {
        return !mo43358t() && !this.f78970q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo43357s() {
        return !this.f56986y.mo43207B() && !this.f78969p;
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if ("android.speech.action.RECOGNIZE_SPEECH".equals(intent.getAction())) {
            startActivityForResult(new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form").putExtra("android.speech.extra.PROMPT", (String) null).putExtra("android.speech.extra.MAX_RESULTS", 1).putExtra("calling_package", getClass().getPackage().getName()), 27);
        } else {
            super.startActivity(intent, bundle);
        }
    }

    /* renamed from: t */
    public final boolean mo43358t() {
        return this.f56986y.f78849x != 0;
    }

    /* renamed from: u */
    public final boolean mo43359u() {
        return this.f56986y.f78849x == 3;
    }

    /* renamed from: w */
    public final AsyncTask mo43361w() {
        return new abex(this, this.f56986y.f78828c, this.f78963j);
    }

    /* renamed from: x */
    public final abha mo43362x() {
        return new abha(this);
    }

    /* renamed from: y */
    public final aazn mo43363y() {
        if (this.f78947E == null) {
            aazn aazn = (aazn) getSupportFragmentManager().findFragmentByTag(f78944b);
            if (aazn == null) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                aazn aazn2 = new aazn();
                this.f78947E = aazn2;
                beginTransaction.replace(C0126R.C0129id.gh_help_content, aazn2, f78944b);
                beginTransaction.commitAllowingStateLoss();
                getSupportFragmentManager().executePendingTransactions();
            } else {
                this.f78947E = aazn;
            }
        }
        return this.f78947E;
    }

    /* renamed from: z */
    public final boolean mo43364z() {
        return this.f78976w.peek() == bzpv.HELP_ANSWER_FRAGMENT && mo43363y().mo31948b();
    }

    /* renamed from: o */
    public final boolean mo43353o() {
        if (ssk.m36235a(this)) {
            if (!this.f56986y.f78814N) {
                return true;
            }
            aatd aatd = this.f78949G;
            return aatd != null && aatd.f56536d;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abcx.a(aasf, int):void
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, int]
     candidates:
      abcx.a(aasf, long):void
      abcx.a(aasf, aasm):void
      abcx.a(aasf, android.accounts.Account):void
      abcx.a(aasf, bzps):void
      abcx.a(aasf, java.lang.CharSequence):void
      abcx.a(aasf, java.lang.String):void
      abcx.a(aasf, boolean):void
      abcx.a(bxvd, android.content.Context):void
      abcx.a(bxvd, com.google.android.gms.googlehelp.common.HelpConfig):void
      abcx.a(qws, bxvd):void
      abcx.a(aasf, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
     arg types: [com.google.android.gms.googlehelp.common.HelpConfig, int]
     candidates:
      com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(sjj, com.google.android.gms.common.internal.GetServiceRequest):void
      sjh.a(sjj, com.google.android.gms.common.internal.GetServiceRequest):void
      com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(com.google.android.gms.googlehelp.common.HelpConfig, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        Drawable drawable;
        int i2;
        boolean z;
        byte[] bArr;
        int length;
        File file;
        HelpConfig helpConfig;
        super.onCreate(bundle);
        if ("android.intent.action.SEARCH".equals(getIntent().getAction())) {
            m66531f("GoogleHelp: unsupported: activity started with search intent.");
            return;
        }
        String a = spn.m35852a((Activity) this);
        if (!TextUtils.isEmpty(a)) {
            try {
                spn.m35870c((Activity) this);
            } catch (SecurityException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39 + String.valueOf(a).length());
                sb.append("SecurityException ");
                sb.append(message);
                sb.append(" in calling package: ");
                sb.append(a);
                m66531f(sb.toString());
                return;
            }
        }
        if (this.f56986y == null) {
            Log.e("gH_HelpActivity", "No HelpConfig provided!");
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && aaya.m47227a(this.f56986y.f78827b, cehj.f182671a.mo6606a().mo79132c(), cehj.f182671a.mo6606a().mo79131b(), cehj.f182671a.mo6606a().mo79130a())) {
            long longExtra = intent.hasExtra("EXTRA_START_TICK") ? intent.getLongExtra("EXTRA_START_TICK", -1) : System.nanoTime();
            if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                GoogleHelp googleHelp = (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
                long nanoTime = System.nanoTime();
                PackageManager packageManager = getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(cehj.m136838b(), 0);
                    int i3 = Build.VERSION.SDK_INT;
                    if (packageInfo.getLongVersionCode() >= cehj.f182671a.mo6606a().mo79134e()) {
                        String str = (aaya.m47229b(cefn.m136726b()) && (helpConfig = this.f56986y) != null) ? helpConfig.f78827b : "";
                        Intent component = new Intent().setComponent(new ComponentName(cehj.m136838b(), cehj.f182671a.mo6606a().mo79136g()));
                        component.putExtra("EXTRA_START_TICK", longExtra);
                        component.putExtra("OCARINA_REDIRECT_CHECK_START_TICK", nanoTime);
                        if (aaya.m47229b(cefn.m136726b()) && !TextUtils.isEmpty(str)) {
                            component.putExtra("OCARINA_APP_PACKAGE_NAME", str);
                        }
                        if (intent.hasExtra("EXTRA_OPEN_TO_CONTACT_OPTION")) {
                            component.putExtra("EXTRA_OPEN_TO_CONTACT_OPTION", intent.getIntExtra("EXTRA_OPEN_TO_CONTACT_OPTION", 0));
                        }
                        if (packageManager.resolveActivity(component, 0) != null) {
                            z = true;
                        } else if (packageManager.resolveService(component, 0) == null) {
                            abcx.m47517d(this, 189);
                        } else {
                            z = false;
                        }
                        long nanoTime2 = System.nanoTime();
                        if (googleHelp != null) {
                            Parcel obtain = Parcel.obtain();
                            try {
                                googleHelp.writeToParcel(obtain, 0);
                                bArr = obtain.marshall();
                                obtain.recycle();
                            } catch (RuntimeException e2) {
                                obtain.recycle();
                                bArr = null;
                            } catch (Throwable th) {
                                obtain.recycle();
                                throw th;
                            }
                        } else {
                            bArr = null;
                        }
                        if (bArr == null || (length = bArr.length) == 0) {
                            abcx.m47517d(this, 190);
                        } else {
                            abcx.m47476a(this, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime2));
                            abcx.m47464a((aasf) this, length);
                            if (((long) length) <= cehj.f182671a.mo6606a().mo79133d()) {
                                component.putExtra("OCARINA_GOOGLEHELP_BYTES", bArr);
                            } else {
                                File file2 = new File(getCacheDir(), "googlehelp");
                                if (file2.exists() || file2.mkdirs()) {
                                    file = new File(file2, "googlehelpbytes");
                                } else {
                                    file = null;
                                }
                                if (file != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                        try {
                                            bufferedOutputStream.write(bArr);
                                            bufferedOutputStream.flush();
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e3) {
                                            }
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (IOException e4) {
                                            }
                                        } catch (IOException e5) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e6) {
                                            }
                                            try {
                                                bufferedOutputStream.close();
                                                file = null;
                                            } catch (IOException e7) {
                                                file = null;
                                            }
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e8) {
                                            }
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (IOException e9) {
                                            }
                                            throw th3;
                                        }
                                    } catch (FileNotFoundException e10) {
                                        file = null;
                                    }
                                } else {
                                    file = null;
                                }
                                if (file != null) {
                                    abcx.m47519e(this);
                                    Uri a2 = C1136kk.m17966a(this, "com.google.android.gms.fileprovider", file);
                                    grantUriPermission(cehj.m136838b(), a2, 1);
                                    component.putExtra("OCARINA_GOOGLEHELP_FILE", a2);
                                } else {
                                    abcx.m47517d(this, 191);
                                }
                            }
                            File file3 = new File(getFilesDir(), "gH_async_psd");
                            if (file3.exists() || file3.mkdirs()) {
                                Uri a3 = C1136kk.m17966a(this, "com.google.android.gms.fileprovider", new File(file3, String.valueOf(Long.toString(longExtra)).concat("_gH_async_help_psd")));
                                grantUriPermission(cehj.m136838b(), a3, 1);
                                component.putExtra("OCARINA_HELP_ASYNC_PSD", a3);
                            }
                            abcx.m47505b(this, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
                            abcx.m47521f(this);
                            if (z) {
                                startActivityForResult(component, 99);
                            } else {
                                startService(component);
                            }
                            mo43352n();
                            this.f56985A = 1;
                            finish();
                            return;
                        }
                    } else {
                        abcx.m47517d(this, 187);
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    abcx.m47517d(this, 188);
                }
            }
        }
        if (mo43329O()) {
            aasd.m46848a(this, this.f56986y);
        }
        if (intent != null) {
            aarz aarz = new aarz(intent);
            HelpConfig helpConfig2 = this.f56986y;
            int intExtra = aarz.f56417a.getIntExtra("EXTRA_OPEN_TO_CONTACT_OPTION", 0);
            if (intExtra != 0) {
                if (aarz.f56418b == null) {
                    aarz.f56418b = new HashSet();
                    Collections.addAll(aarz.f56418b, aayh.m47256a(ceej.f182548a.mo6606a().mo79033a()));
                }
                if (!aarz.f56418b.contains(helpConfig2.f78827b)) {
                    Log.e("gH_InvocInterceptor", "App not permitted to use this feature.");
                    helpConfig2.mo43214I();
                } else {
                    helpConfig2.f78849x = intExtra;
                }
            }
        }
        if (ceev.f182568a.mo6606a().mo79058j()) {
            snp.m35702a(9).execute(new abax());
        }
        this.f78965l = new aaxx(this);
        aask d = GoogleHelpChimeraService.m66619d(this.f56986y);
        if (d == null || d.f56460c) {
            if (!mo43358t()) {
                mo43350l();
            }
            aatv.m46999a(this.f78958e, new abaz(this), this.f56986y, this.f56987z);
            GoogleHelpChimeraService.m66614a(this.f56986y, true);
        }
        if (!aaya.m47228a(cegf.m136774b())) {
            setContentView((int) C0126R.C0128layout.gh_help_activity);
        } else {
            if (aayi.m47267a()) {
                aayi.m47266a(this, this.f56986y, (int) C0126R.style.gh_NoActionBarLightActivityStyle, (int) C0126R.style.gh_NoActionBarDarkActivityStyle, (int) C0126R.style.gh_NoActionBarDayNightActivityStyle);
                abcx.m47514c(this, this.f56986y, this.f56987z);
            } else if (aayi.m47269a(this.f56986y)) {
                setTheme(C0126R.style.gh_NoActionBarDarkActivityStyle);
                abcx.m47514c(this, this.f56986y, this.f56987z);
            } else {
                setTheme(C0126R.style.gh_NoActionBarLightActivityStyle);
                if (aaya.m47228a(cegx.m136817b())) {
                    abcx.m47514c(this, this.f56986y, this.f56987z);
                }
            }
            if (!aaya.m47228a(cegr.m136796b())) {
                i = C0126R.C0128layout.gh_help_home_activity;
            } else {
                i = C0126R.C0128layout.gh_help_main_activity;
            }
            setContentView(i);
            Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.gh_help_toolbar);
            toolbar.mo1701k();
            ActionMenuView actionMenuView = toolbar.f1335a;
            actionMenuView.mo1296a();
            C1485xh xhVar = actionMenuView.f1165c;
            C1481xd xdVar = xhVar.f27564h;
            if (xdVar == null) {
                drawable = xhVar.f27566j ? xhVar.f27565i : null;
            } else {
                drawable = xdVar.getDrawable();
            }
            if (aayi.m47270b()) {
                i2 = aayi.m47263a(this, C0126R.attr.ghf_greyIconColor);
            } else {
                i2 = C1133kh.m17843b(this, C0126R.color.google_grey700);
            }
            Drawable b = aayh.m47257b(drawable, this, i2);
            toolbar.mo1701k();
            ActionMenuView actionMenuView2 = toolbar.f1335a;
            actionMenuView2.mo1296a();
            C1485xh xhVar2 = actionMenuView2.f1165c;
            C1481xd xdVar2 = xhVar2.f27564h;
            if (xdVar2 == null) {
                xhVar2.f27566j = true;
                xhVar2.f27565i = b;
            } else {
                xdVar2.setImageDrawable(b);
            }
            mo8626a(toolbar);
            aarq.m46801a(this, false);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        aayy aayy = (aayy) supportFragmentManager.findFragmentByTag(f78945c);
        this.f78948F = aayy;
        if (aayy == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            aayy aayy2 = new aayy();
            this.f78948F = aayy2;
            beginTransaction.add(C0126R.C0129id.gh_help_section, aayy2, f78945c);
            beginTransaction.commitAllowingStateLoss();
        }
        this.f78963j = new aazc(this);
        new abgw(this).executeOnExecutor(aaya.m47229b(ceha.f182661a.mo79122b().mo79123a()) ? this.f78958e : this.f78957d, new Void[0]);
        this.f78964k = new abfy(this);
        this.f78966m = new abgc(this, this.f56986y.f78827b);
        if (!m66525P()) {
            this.f78971r = new abfz(this);
        }
        this.f78961h = findViewById(C0126R.C0129id.gh_help_section);
        View findViewById = findViewById(C0126R.C0129id.gh_help_content);
        this.f78962i = findViewById;
        this.f78948F.f56856c = findViewById;
        String b2 = ceeg.f182447a.mo6606a().mo79007b();
        if (b2.hashCode() != f78943D) {
            f78942C.clear();
            Collections.addAll(f78942C, aayh.m47256a(b2));
            f78943D = b2.hashCode();
        }
        this.f78954L = !f78942C.contains(this.f56986y.f78827b);
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f78976w = arrayDeque;
        arrayDeque.push(bzpv.HELP_CONSOLE);
        aarp.m46797a(this.f78958e, this, this, this.f56986y);
        HelpConfig helpConfig3 = this.f56986y;
        helpConfig3.f78813M = aasb.m46832a(this, helpConfig3);
        if (!PopularArticlesContainer.m66610b()) {
            aazc aazc = this.f78963j;
            FragmentManager supportFragmentManager2 = aazc.f56869b.getSupportFragmentManager();
            FragmentTransaction beginTransaction2 = supportFragmentManager2.beginTransaction();
            aazc.f56874g = (aayu) supportFragmentManager2.findFragmentByTag(aazc.f56868a);
            aayu aayu = aazc.f56874g;
            if (aayu != null) {
                beginTransaction2.detach(aayu).attach(aazc.f56874g);
                beginTransaction2.commitAllowingStateLoss();
            } else {
                FragmentTransaction beginTransaction3 = supportFragmentManager2.beginTransaction();
                aazc.f56874g = new aayu();
                Bundle bundle2 = new Bundle(1);
                bundle2.putParcelable("EXTRA_HELP_CONFIG", aazc.f56870c);
                aazc.f56874g.setArguments(bundle2);
                beginTransaction3.add(C0126R.C0129id.gh_browse_all_articles_fragment, aazc.f56874g, aazc.f56868a);
                beginTransaction3.commitAllowingStateLoss();
            }
        }
        if (!aaya.m47228a(cegf.m136774b())) {
            ((ViewStub) findViewById(C0126R.C0129id.gh_search_card_section_divider_view_stub)).inflate();
            View inflate = ((ViewStub) findViewById(C0126R.C0129id.gh_search_card_view_stub)).inflate();
            CardView cardView = (CardView) inflate.findViewById(C0126R.C0129id.gh_search_box);
            cardView.setOnClickListener(new abaq(this));
            int i4 = this.f56986y.f78801A.f31624b;
            if (i4 == 0) {
                i4 = C1133kh.m17843b(this, C0126R.color.material_blue_grey_500);
            }
            Drawable a4 = aayh.m47231a(C1133kh.m17836a(this, (int) C0126R.C0127drawable.quantum_ic_arrow_forward_white_24), getResources());
            aayh.m47244a(a4, i4);
            ((ImageView) cardView.findViewById(C0126R.C0129id.gh_arrow_forward_icon)).setImageDrawable(a4);
            inflate.findViewById(C0126R.C0129id.gh_search_box_line).setBackgroundColor(i4);
            abcx.m47525h(this);
        } else if (aaya.m47228a(cegr.m136796b())) {
            OpenSearchView openSearchView = (OpenSearchView) findViewById(C0126R.C0129id.gh_open_search_view);
            this.f78973t = openSearchView;
            openSearchView.f111267f.mo1678a(new abal(this));
            EditText editText = this.f78973t.f111270i;
            editText.setOnEditorActionListener(new aban(this, editText));
            editText.addTextChangedListener(new abba(this, editText));
            findViewById(C0126R.C0129id.gh_search_box).setOnClickListener(new abao(this, editText));
            abcx.m47525h(this);
        } else {
            View findViewById2 = findViewById(C0126R.C0129id.gh_search_box);
            findViewById2.setOnClickListener(new abap(this, findViewById2));
            abcx.m47525h(this);
        }
        aazt.m47336a(this);
        mo43352n();
        new abaw(this, this).start();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg
     arg types: [int, int, java.lang.String, int, int, int, wzh]
     candidates:
      aasg.a(int, int, java.lang.String, float, int, wzh, int):aasg
      aasg.a(int, int, java.lang.String, float, boolean, int, wzh):aasg */
    public final void onStart() {
        bzps bzps;
        Drawable drawable;
        int i;
        Account account;
        super.onStart();
        if (mo43329O()) {
            Account account2 = this.f56986y.f78829d;
            int size = aasd.m46847a(this).size();
            String str = "";
            if (size != 0) {
                if (account2 == null) {
                    aasd.m46848a(this, this.f56986y);
                    mo43348e();
                    return;
                } else if (size <= 1) {
                    AccountPickerContainer accountPickerContainer = this.f78963j.f56872e;
                    if (accountPickerContainer != null) {
                        accountPickerContainer.setVisibility(8);
                    }
                } else {
                    aazc aazc = this.f78963j;
                    if (aazc.f56872e == null) {
                        aazc.f56872e = (AccountPickerContainer) ((ViewStub) aazc.f56869b.findViewById(C0126R.C0129id.gh_account_picker_view_stub)).inflate();
                    }
                    AccountPickerContainer accountPickerContainer2 = aazc.f56872e;
                    HelpChimeraActivity helpChimeraActivity = aazc.f56869b;
                    TextView textView = (TextView) accountPickerContainer2.findViewById(C0126R.C0129id.gh_account_picker_icon_and_label);
                    Drawable a = C1133kh.m17836a(accountPickerContainer2.getContext(), (int) C0126R.C0127drawable.quantum_ic_account_circle_googblue_24);
                    if (aayi.m47270b()) {
                        drawable = aayh.m47257b(a, accountPickerContainer2.getContext(), aayi.m47263a(accountPickerContainer2.getContext(), C0126R.attr.gh_primaryBlueColor));
                    } else {
                        drawable = aayh.m47231a(a, accountPickerContainer2.getResources());
                        aayh.m47245a(drawable, accountPickerContainer2.getContext(), (int) C0126R.color.google_blue600);
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    Spinner spinner = (Spinner) accountPickerContainer2.findViewById(C0126R.C0129id.gh_account_picker_spinner);
                    List a2 = aasd.m46847a(accountPickerContainer2.getContext());
                    ArrayList arrayList = new ArrayList(a2.size());
                    for (int i3 = 0; i3 < a2.size(); i3++) {
                        arrayList.add(((Account) a2.get(i3)).name);
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(helpChimeraActivity, (int) C0126R.C0128layout.gh_help_account_picker_selected_line_item, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    arrayAdapter.setDropDownViewResource(C0126R.C0128layout.gh_help_account_picker_dropdown_line_item);
                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                    if (arrayList.size() < 2) {
                        spinner.setEnabled(false);
                        spinner.setBackgroundColor(accountPickerContainer2.getDrawingCacheBackgroundColor());
                    } else {
                        spinner.setOnItemSelectedListener(new aayt(helpChimeraActivity, spinner));
                    }
                    Context context = accountPickerContainer2.getContext();
                    HelpConfig helpConfig = helpChimeraActivity.f56986y;
                    List a3 = aasd.m46847a(context);
                    if (!a3.isEmpty()) {
                        if (!(helpConfig == null || (account = helpConfig.f78829d) == null)) {
                            str = account.name;
                        }
                        if (str.isEmpty()) {
                            str = aasd.m46846a(context, helpConfig, a3);
                        }
                        i = 0;
                        while (true) {
                            if (i < a3.size()) {
                                if (((Account) a3.get(i)).name.equals(str)) {
                                    break;
                                }
                                i++;
                            } else {
                                i = 0;
                                break;
                            }
                        }
                    } else {
                        i = -1;
                    }
                    if (i >= 0) {
                        spinner.setSelection(i);
                    }
                }
            } else if (account2 != null) {
                mo43340a(str);
                mo43348e();
                return;
            } else {
                aazc aazc2 = this.f78963j;
                if (aazc2.f56873f == null) {
                    aazc2.f56873f = ((ViewStub) aazc2.f56869b.findViewById(C0126R.C0129id.gh_sign_in_banner_view_stub)).inflate();
                    aazc2.f56873f.findViewById(C0126R.C0129id.gh_sign_in_button).setOnClickListener(new aaza(aazc2));
                    abcx.m47530m(aazc2.f56869b);
                }
            }
        }
        if (!this.f56986y.mo43208C()) {
            if (this.f56986y.mo43207B()) {
                if (aaya.m47229b(cegu.f182654a.mo6606a().mo79119b())) {
                    if (this.f78961h.getVisibility() != 0) {
                        if (m66525P()) {
                            this.f78973t.mo60442a(this.f56986y.f78821U);
                        }
                        mo43342b(this.f56986y.f78821U);
                    }
                } else if (m66525P()) {
                    this.f78973t.mo60442a(this.f56986y.f78821U);
                }
                if (!aaya.m47228a(cefz.m136755c())) {
                    if (aaya.m47228a(cegf.m136774b())) {
                        findViewById(C0126R.C0129id.gh_search_box).setVisibility(8);
                        mo43351m();
                    }
                    mo43354p();
                } else if (this.f78961h.getVisibility() != 0) {
                    m66530a(new abas(this));
                }
            } else if (aaya.m47228a(cehg.m136833b()) && this.f56986y.mo43209D()) {
                m66530a(new abar(this));
                abcx.m47508b(this, this.f56986y, this.f56987z);
                if (!aaya.m47229b(ceih.m136917b())) {
                    return;
                }
                if (!TextUtils.isEmpty(this.f56986y.f78823W)) {
                    HelpConfig helpConfig2 = this.f56986y;
                    int i4 = helpConfig2.f78824X;
                    if (i4 == 2 || i4 == 1 || i4 == 3 || i4 == 4) {
                        abcr abcr = this.f56987z;
                        if (i4 == 1) {
                            bzps = bzps.CHAT;
                        } else if (i4 == 2) {
                            bzps = bzps.C2C;
                        } else if (i4 != 3) {
                            bzps = bzps.PHONE;
                        } else {
                            bzps = bzps.EMAIL;
                        }
                        abcx.m47492a(this, helpConfig2, abcr, bzps);
                        return;
                    }
                    abcx.m47509b(this, helpConfig2, this.f56987z, BaseMfiEventCallback.TYPE_EXPIRED_MFI);
                    return;
                }
                abcx.m47509b(this, this.f56986y, this.f56987z, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR);
            } else if (mo43353o()) {
                mo43354p();
            } else {
                mo43355q();
            }
        } else if (this.f78961h.getVisibility() != 0) {
            abcx.m47488a(this, this.f56986y, this.f56987z);
            aasm a4 = aasm.m46882a(this.f56986y.f78822V, aasw.m46952a(), this.f56986y);
            if (a4 == null) {
                mo43345c(this.f56986y.f78822V);
                finish();
                return;
            }
            if (!cefz.m136754b() || !aaya.m47229b(cehp.m136859b())) {
                int i5 = abgx.f57444e;
                wzh wzh = new wzh();
                wzh.mo29584c();
                new abgx(this, a4, aasg.m46856a(29, 0, "", -1.0f, false, 11, wzh), mo43326L(), Calendar.getInstance()).executeOnExecutor(this.f78958e, new Void[0]);
            } else if (!TextUtils.isEmpty(this.f56986y.mo43230e()) || !TextUtils.isEmpty(a4.f56513w)) {
                if (TextUtils.isEmpty(this.f56986y.mo43230e())) {
                    this.f56986y.f78811K = a4.f56513w;
                }
                abgx.m47704a(this, a4, 29, 0);
            } else {
                mo43345c(this.f56986y.f78822V);
                finish();
                return;
            }
            this.f78961h.setVisibility(0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
     arg types: [com.google.android.gms.googlehelp.common.HelpConfig, int]
     candidates:
      com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(sjj, com.google.android.gms.common.internal.GetServiceRequest):void
      sjh.a(sjj, com.google.android.gms.common.internal.GetServiceRequest):void
      com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(com.google.android.gms.googlehelp.common.HelpConfig, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(int, bzps):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(bzpv, int):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(boolean, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* renamed from: v */
    public final boolean mo43360v() {
        bzps bzps = bzps.UNKNOWN_CONTACT_MODE;
        int i = this.f56986y.f78849x;
        if (i == 1) {
            bzps bzps2 = bzps.EMAIL;
            mo43335a(bzps2);
            if (this.f56986y.mo43244s()) {
                mo43341b(bzps2);
                mo43319E();
                m66528S();
            }
            HelpConfig helpConfig = this.f56986y;
            helpConfig.f78849x = 0;
            helpConfig.mo43214I();
            abcx.m47463a(this);
            mo43350l();
            GoogleHelpChimeraService.m66614a(this.f56986y, true);
            if (mo43353o()) {
            }
            return false;
        } else if (i != 2) {
            if (i != 3) {
                mo43335a(bzps);
            } else {
                bzps bzps3 = bzps.CHAT;
                mo43335a(bzps3);
                if (this.f56986y.mo43236k()) {
                    mo43341b(bzps3);
                    mo43317C();
                    m66528S();
                }
            }
            HelpConfig helpConfig2 = this.f56986y;
            helpConfig2.f78849x = 0;
            helpConfig2.mo43214I();
            abcx.m47463a(this);
            mo43350l();
            GoogleHelpChimeraService.m66614a(this.f56986y, true);
            if (mo43353o()) {
                mo43339a(true, false);
            } else {
                mo43361w().executeOnExecutor(this.f78957d, new Void[0]);
            }
            return false;
        } else {
            bzps bzps4 = bzps.C2C;
            mo43335a(bzps4);
            if (this.f56986y.mo43235j()) {
                mo43341b(bzps4);
                mo43318D();
                m66528S();
            }
            HelpConfig helpConfig22 = this.f56986y;
            helpConfig22.f78849x = 0;
            helpConfig22.mo43214I();
            abcx.m47463a(this);
            mo43350l();
            GoogleHelpChimeraService.m66614a(this.f56986y, true);
            if (mo43353o()) {
            }
            return false;
        }
        finish();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43341b(bzps bzps) {
        mo43331a(60, bzps);
    }

    /* renamed from: b */
    public final void mo43342b(String str) {
        new abhe(this.f78966m, new abfo(str)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43345c(String str) {
        abht.m47727a(this, Uri.parse(str), this.f56986y, this.f56987z);
    }

    /* renamed from: b */
    public final void mo43343b(boolean z) {
        int i;
        if (getMainLooper().getThread() != Thread.currentThread()) {
            this.f78946B.post(new abbc(this, z));
        } else if (this.f56986y.mo43242q() && this.f78952J) {
            mo43327M();
        } else if (!mo43358t() || ((mo43359u() && this.f56986y.mo43232g()) || !mo43360v())) {
            supportInvalidateOptionsMenu();
            if (this.f78970q) {
                this.f78963j.mo31929c();
            }
            if (this.f56986y.mo43224b()) {
                mo43362x().executeOnExecutor(this.f78957d, new Void[0]);
            } else if (mo43359u()) {
                mo43360v();
            }
            if (this.f78970q) {
                mo43325K();
            }
            if (this.f78970q && this.f56986y.mo43206A()) {
                if (!z) {
                    abeh a = m66529a(this);
                    HelpConfig helpConfig = this.f56986y;
                    if (!helpConfig.f78820T) {
                        i = 5;
                    } else {
                        i = 4;
                    }
                    wzh wzh = new wzh(helpConfig.f78819S);
                    wzh.mo29584c();
                    abcx.m47468a(this, i, wzh.mo29582a(), bzpv.m126025a(a.f57223r), a.f57218m, a.f57219n, a.f57220o);
                } else {
                    mo43328N();
                }
            }
            this.f78969p = true;
        }
    }

    /* renamed from: c */
    public final void mo43346c(boolean z) {
        aaru.m46808a(z, this.f78975v);
    }

    /* renamed from: e */
    public final void mo43349e(String str) {
        abfv abfv;
        mo43346c(true);
        if (m66525P() && (abfv = this.f78974u) != null) {
            abfv.mo31664c();
        }
        if (!aaya.m47229b(ceiz.m136966c()) && !ssk.m36235a(this)) {
            Toast.makeText(this, (int) C0126R.string.gh_network_not_connected, 0).show();
        } else if (!cefz.m136755c() || TextUtils.isEmpty(this.f56986y.mo43230e())) {
            new abeu(this, new abbf(this), str).executeOnExecutor(this.f78958e, new Void[0]);
        } else {
            int i = abgx.f57444e;
            HelpConfig helpConfig = this.f56986y;
            if (helpConfig != null && !TextUtils.isEmpty(helpConfig.mo43230e())) {
                String format = String.format(ceeg.f182447a.mo6606a().mo78963aD(), ceeg.m136421z(), this.f56986y.mo43230e(), Uri.encode(str));
                aasl aasl = new aasl();
                aasl.f56468e = format;
                aasl.f56478o = false;
                aasm a = aasl.mo31714a();
                wzh wzh = new wzh();
                wzh.mo29584c();
                new abgx(this, a, aasg.m46855a(1, -1, "", -1.0f, 1, wzh, 3), mo43326L(), false, true, Calendar.getInstance()).executeOnExecutor(this.f78958e, new Void[0]);
            }
        }
    }

    /* renamed from: a */
    private final void m66530a(Runnable runnable) {
        if (!this.f78952J) {
            this.f78951I.addObserver(new abam(runnable));
        } else {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aarn mo43330a(boolean z) {
        return new abbb(this, z);
    }

    /* renamed from: a */
    public final void mo43331a(int i, bzps bzps) {
        if (i != 46 || this.f78955M.add(bzps)) {
            abcx.m47470a(this, i, bzps, -1);
        }
    }

    /* renamed from: a */
    public final void mo43332a(aarn aarn) {
        aarp aarp = this.f78967n;
        if (aarp == null) {
            aasi aasi = this.f78950H;
            if (aasi != null) {
                aasi.addObserver(new abav(this, aarn));
                return;
            }
            return;
        }
        aarn.mo31653a(aarp);
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        if (this.f78950H != null) {
            this.f78967n = aarp;
            aatd aatd = new aatd(this, this.f78967n);
            this.f78949G = aatd;
            aatd.f56536d = !TextUtils.equals(aatd.f56534b.f78828c, aatd.f56535c.mo31697a("ongoing_session_context", (String) null));
            if (aatd.m46970a(aatd.f56534b, aatd.f56535c)) {
                aatd.m46971b(aatd.f56534b, aatd.f56535c);
                abcx.m47528k(aatd.f56533a);
            }
            aatd.mo31767a();
            this.f78950H.mo31709a();
            this.f78950H = null;
        }
    }

    /* renamed from: a */
    public final void mo31768a(aaru aaru) {
        synchronized (this.f78975v) {
            this.f78975v.add(aaru);
        }
    }

    /* renamed from: a */
    public final void mo43333a(aasm aasm, aasg aasg, boolean z) {
        aasm aasm2 = aasg.f56426a;
        if (aasm2 != null) {
            if (aasm2.mo31729l()) {
                String str = aasg.f56426a.f56497g;
                String str2 = null;
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split("(\\?|&)id=");
                    if (split.length >= 2) {
                        String[] split2 = split[1].split("&");
                        if (split2.length > 0) {
                            str2 = split2[0];
                        }
                    }
                }
                if (str2 == null) {
                    Log.w("gH_HelpActivity", String.format("Could not extract package name from url: %s", str));
                    mo43345c(str);
                } else {
                    m66532g(str2);
                }
            } else if (aasg.f56426a.mo31727j()) {
                mo43345c(aasg.f56426a.f56497g);
                if (aasg.mo31704a()) {
                    finish();
                    return;
                }
            } else {
                mo43363y().mo31944a();
                if (m66525P() && this.f78973t.mo60449d()) {
                    this.f78973t.mo60443a(false);
                }
                mo43336a(bzpv.HELP_ANSWER_FRAGMENT);
                mo43363y().mo31945a(aasg, false);
            }
            this.f78962i.setVisibility(0);
            if (this.f56986y != null && aaya.m47228a(cegf.m136774b())) {
                mo43351m();
                View findViewById = findViewById(C0126R.C0129id.gh_search_box);
                if (!aaya.m47229b(cehp.m136860c()) || findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            if (!mo43326L()) {
                mo43325K();
            }
        } else {
            if (z) {
                if (aasg.mo31704a()) {
                    this.f78963j.mo31925a(abey.m47591b(aasg.f56433h, this));
                    this.f78963j.mo31929c();
                    this.f78963j.mo31924a();
                } else if (aasg.f56431f && aasm != null && URLUtil.isValidUrl(aasm.f56497g) && ssk.m36235a(this)) {
                    mo43345c(aasm.f56497g);
                } else {
                    Toast.makeText(this, getString(C0126R.string.gh_fetching_failed), 0).show();
                }
            }
            if (this.f56986y.mo43208C()) {
                finish();
                return;
            }
            this.f78962i.setVisibility(0);
            mo43325K();
            if (aasg.f56431f && aasm != null) {
                abcx.m47473a(this, 31, aasm.f56497g, aasg.f56427b, aasg.f56428c);
            }
        }
        supportInvalidateOptionsMenu();
    }

    /* renamed from: a */
    public final void mo43334a(abey abey, CharSequence charSequence, wzh wzh) {
        abfy abfy = this.f78964k;
        List a = abey.mo32056a(abfy.f57375a, abfy.f57376b);
        if (abfy.mo32075b()) {
            abfy.f57377c.setAdapter(abfy.f57378d);
            abfy.f57378d.mo32082a(charSequence.toString(), a);
        } else {
            aazr aazr = abfy.f57381g;
            aazr.f56900a = charSequence.toString();
            aazr.f56901b = a;
            aazr.notifyDataSetChanged();
        }
        abcx.m47475a(abfy.f57375a, 15, a, charSequence.toString());
        mo43336a(bzpv.HELP_SUB_CONSOLE);
        this.f78962i.setVisibility(0);
        mo43325K();
        abeh a2 = m66529a(this);
        abcx.m47468a(this, 10, wzh.mo29582a(), bzpv.m126025a(a2.f57223r), a2.f57218m, a2.f57219n, a2.f57220o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43335a(bzps bzps) {
        mo43331a(61, bzps);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43336a(bzpv bzpv) {
        bzps bzps = bzps.UNKNOWN_CONTACT_MODE;
        bzpv bzpv2 = bzpv.HELP_CONSOLE;
        int ordinal = ((bzpv) this.f78976w.peek()).ordinal();
        if (ordinal != 0) {
            if (!(ordinal == 1 && bzpv == bzpv.HELP_ANSWER_FRAGMENT)) {
                return;
            }
        } else if (!(bzpv == bzpv.HELP_SUB_CONSOLE || bzpv == bzpv.HELP_ANSWER_FRAGMENT)) {
            return;
        }
        mo43337a((bzpv) this.f78976w.peek(), 8);
        this.f78976w.push(bzpv);
        mo43337a(bzpv, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43337a(bzpv bzpv, int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        bzps bzps = bzps.UNKNOWN_CONTACT_MODE;
        bzpv bzpv2 = bzpv.HELP_CONSOLE;
        int ordinal = bzpv.ordinal();
        if (ordinal == 0) {
            this.f78963j.f56871d.setVisibility(i);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                mo43363y().mo31947a(z);
            }
        } else if (!m66525P()) {
            this.f78964k.f57380f.setVisibility(i);
        } else if (this.f78973t.mo60449d() ^ z) {
            this.f78973t.mo60443a(z);
        }
    }

    /* renamed from: a */
    public final void mo43338a(String str, aask aask, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (z && (aask == null || aask.f56461d)) {
            mo43361w().executeOnExecutor(this.f78957d, new Void[0]);
            z3 = false;
        } else {
            z3 = z;
        }
        if (z2 && (aask == null || aask.f56462e)) {
            mo43332a(mo43330a(true));
            z4 = false;
        } else {
            z4 = z2;
        }
        if (z3 || z4) {
            this.f78968o = true;
            abau abau = new abau(this, str, aask, z3, z4);
            aask.mo31711a();
            aask.f56463f.addObserver(abau);
        } else if (!this.f56986y.f78848w) {
            GoogleHelpChimeraService.m66615a(str);
            this.f78968o = false;
        }
    }

    /* renamed from: a */
    public final void mo43339a(boolean z, boolean z2) {
        m66530a(new abat(this, z, z2));
    }

    /* renamed from: a */
    public final boolean mo43340a(String str) {
        return aasd.m46849a(this, this.f56986y, str);
    }
}
