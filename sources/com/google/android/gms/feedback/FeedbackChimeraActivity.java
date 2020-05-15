package com.google.android.gms.feedback;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.material.card.MaterialCardView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeedbackChimeraActivity extends deu implements MenuItem.OnMenuItemClickListener, wyl, wws, aaye {

    /* renamed from: e */
    public static wwy f31574e;

    /* renamed from: f */
    public static Bitmap f31575f;

    /* renamed from: h */
    public static List f31576h;

    /* renamed from: k */
    public static HelpConfig f31577k;

    /* renamed from: l */
    public static aasm f31578l;

    /* renamed from: m */
    public static boolean f31579m = false;

    /* renamed from: b */
    public final bqgj f31580b = snp.m35702a(10);

    /* renamed from: c */
    public wwt f31581c;

    /* renamed from: d */
    public boolean f31582d = false;

    /* renamed from: g */
    public Bitmap f31583g;

    /* renamed from: i */
    public String f31584i;

    /* renamed from: j */
    public boolean f31585j = false;

    /* renamed from: n */
    public wzb f31586n;

    /* renamed from: o */
    public String f31587o;

    /* renamed from: p */
    private ServiceConnection f31588p;

    /* renamed from: q */
    private String f31589q;

    /* renamed from: a */
    public static void m23364a(Bitmap bitmap) {
        wwy wwy = f31574e;
        if (wwy != null) {
            f31575f = bitmap;
            wwy.mo29509a(Screenshot.m66502a(bitmap));
            return;
        }
        Log.w("gf_FeedbackActivity", "Session is null, not setting screenshot.");
    }

    /* renamed from: a */
    public static boolean m23366a(wwy wwy) {
        return f31574e == wwy;
    }

    /* renamed from: j */
    public static ErrorReport m23367j() {
        wwy wwy = f31574e;
        if (wwy != null) {
            return wwy.mo29517g();
        }
        return null;
    }

    /* renamed from: l */
    public static boolean m23368l() {
        return f31575f.getHeight() > f31575f.getWidth();
    }

    /* renamed from: m */
    public static boolean m23369m() {
        return f31575f != null;
    }

    /* renamed from: b */
    public final void mo18602b(int i) {
        if (m23367j() != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (m23367j().f31539ac == null) {
                m23367j().f31539ac = new Bundle();
            }
            long j = (long) i;
            if (m23367j().f31539ac.getLong("max_char_count_delta") < j) {
                m23367j().f31539ac.putLong("max_char_count_delta", j);
            }
            if (m23367j().f31539ac.getLong("input_start_time") == 0) {
                m23367j().f31539ac.putLong("input_start_time", currentTimeMillis);
                m23367j().f31539ac.putLong("input_end_time", currentTimeMillis);
            }
            if (m23367j().f31539ac.getLong("input_end_time") != 0) {
                m23367j().f31539ac.putLong("input_end_time", currentTimeMillis);
            }
        }
    }

    /* renamed from: c */
    public final void mo18605c(Intent intent) {
        String str;
        int i;
        boolean z;
        int i2;
        Intent intent2 = intent;
        if (intent2 != null) {
            String stringExtra = intent2.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID");
            if (!(!TextUtils.isEmpty(stringExtra))) {
                if (f31574e == null) {
                    f31574e = mo18591a(intent2.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), mo18606d(intent), intent2.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent2.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1)) : null);
                }
                wwy wwy = f31574e;
                if (wwy == null) {
                    Log.e("gf_FeedbackActivity", "onFragmentResume failed to create a session.");
                } else if (this.f31582d) {
                    ErrorReport g = wwy.mo29517g();
                    Screenshot screenshot = f31574e.f51515b;
                    wwt wwt = this.f31581c;
                    wxu wxu = (wxu) wwt;
                    ImageView imageView = (ImageView) wxu.mo29553a((int) C0126R.C0129id.gf_screenshot_icon);
                    ProgressBar progressBar = (ProgressBar) wxu.mo29553a((int) C0126R.C0129id.gf_progress_spinner);
                    TextView textView = (TextView) wxu.mo29553a((int) C0126R.C0129id.gf_edit_screenshot);
                    EditText editText = (EditText) wxu.mo29553a((int) C0126R.C0129id.gf_issue_description);
                    TextView textView2 = (TextView) wxu.mo29553a((int) C0126R.C0129id.gf_view_logs);
                    CheckBox checkBox = (CheckBox) wxu.mo29553a((int) C0126R.C0129id.gf_include_screenshot);
                    CheckBox checkBox2 = (CheckBox) wxu.mo29553a((int) C0126R.C0129id.gf_include_logs);
                    editText.setText(g.f31546b);
                    editText.setSelection(editText.getText().length());
                    String string = wwt.getString(C0126R.string.common_view);
                    textView2.setLinksClickable(true);
                    textView2.setText(string);
                    checkBox.setChecked(!g.f31532W);
                    checkBox.setOnCheckedChangeListener(new wxl(wxu));
                    if (aaya.m47229b(cdua.m135036b())) {
                        wxb.m42441a(checkBox);
                    }
                    checkBox2.setChecked(!g.f31532W);
                    checkBox2.setOnCheckedChangeListener(new wxm(wxu));
                    if (aaya.m47229b(cdua.m135036b())) {
                        wxb.m42441a(checkBox2);
                    }
                    wxu.mo29553a((int) C0126R.C0129id.gf_system_info_card).setOnClickListener(new wxn(wxu));
                    wxu.mo29553a((int) C0126R.C0129id.gf_screenshot_card).setOnClickListener(new wxo(wxu));
                    if (screenshot == null) {
                        imageView.setVisibility(8);
                        textView.setVisibility(8);
                    } else {
                        imageView.setMaxHeight(wwt.getResources().getDimensionPixelSize(C0126R.dimen.gf_screenshot_preview_height));
                        imageView.setScaleType(ImageView.ScaleType.MATRIX);
                        progressBar.setVisibility(0);
                    }
                    Resources resources = wwt.getResources();
                    TextView textView3 = (TextView) wxu.mo29553a((int) C0126R.C0129id.gf_preview_text);
                    String string2 = resources.getString(C0126R.string.gf_legal_request);
                    String string3 = resources.getString(C0126R.string.common_system_info_composed_string);
                    String string4 = resources.getString(C0126R.string.common_privacy_policy_composed_string);
                    String string5 = resources.getString(C0126R.string.common_terms_of_service_composed_string);
                    Spannable a = URLSpanNoUnderline.m22736a(Html.fromHtml(resources.getString(C0126R.string.gf_policy, string2, string3, string4, string5)));
                    aayh.m47247a(a, string2, wxu.mo29552a(cdtr.f181715a.mo6606a().mo78317p()));
                    aayh.m47247a(a, string3, new wxq(wxu));
                    aayh.m47247a(a, string4, new wxs(wxu));
                    aayh.m47247a(a, string5, wxu.mo29552a(cdtr.f181715a.mo6606a().mo78298E()));
                    textView3.setLinksClickable(true);
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                    textView3.setText(a);
                    if (f31574e != null) {
                        if (!aaya.m47229b(cdug.f181769a.mo6606a().mo78344b()) || (str = this.f31589q) == null) {
                            str = this.f31584i;
                        }
                        int length = f31574e.f51514a.length;
                        String[] strArr = new String[length];
                        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.ENGLISH).equals("anonymous")) {
                            z = false;
                            i = 1;
                        } else {
                            z = true;
                            i = 0;
                        }
                        String[] strArr2 = f31574e.f51514a;
                        int i3 = 0;
                        for (String str2 : strArr2) {
                            String string6 = getString(C0126R.string.common_from);
                            StringBuilder sb = new StringBuilder(String.valueOf(string6).length() + 2 + String.valueOf(str2).length());
                            sb.append(string6);
                            sb.append("  ");
                            sb.append(str2);
                            strArr[i3] = sb.toString();
                            if (!z) {
                                if (str2.contains("google.com")) {
                                    i = i3;
                                }
                                if (!TextUtils.isEmpty(str) && TextUtils.equals(str2, str)) {
                                    i = i3;
                                    z = true;
                                }
                            }
                            i3++;
                        }
                        wwt wwt2 = this.f31581c;
                        wxu wxu2 = (wxu) wwt2;
                        Spinner spinner = (Spinner) wxu2.mo29553a((int) C0126R.C0129id.gf_account_spinner);
                        ArrayAdapter arrayAdapter = new ArrayAdapter(wwt2.getActivity(), (int) C0126R.C0128layout.gf_material_2_spinner, strArr);
                        if (!aayi.m47270b()) {
                            i2 = 17367049;
                        } else {
                            i2 = C0126R.C0128layout.gf_account_spinner_dropdown_item;
                        }
                        arrayAdapter.setDropDownViewResource(i2);
                        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                        spinner.setOnItemSelectedListener(new wxt(wxu2));
                        if (length > 1) {
                            spinner.setSelection(i);
                        }
                    }
                    if (TextUtils.isEmpty(g.f31529T)) {
                        mo18597a(screenshot, g);
                    }
                    Bitmap bitmap = this.f31583g;
                    if (bitmap != null) {
                        this.f31581c.mo29489a(bitmap, mo18612k());
                    }
                    C1341rz aW = mo8628aW();
                    String string7 = getString(C0126R.string.gf_send_feedback);
                    String str3 = g.f31536a.packageName;
                    m23370p();
                    m23365a(aW, string7);
                    mo18601a(!f31574e.f51519f);
                    this.f31582d = false;
                }
            } else {
                try {
                    Bitmap b = this.f31586n.mo29581b(stringExtra);
                    mo18601a(false);
                    this.f31581c.mo29489a(b, true);
                    this.f31582d = false;
                } catch (RemoteException e) {
                    Log.e("gf_FeedbackActivity", e.getMessage());
                }
            }
        } else {
            Log.e("gf_FeedbackActivity", "onFragmentResume called with null intent.");
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ErrorReport mo18606d(Intent intent) {
        ErrorReport errorReport = new ErrorReport();
        if (intent.hasExtra("android.intent.extra.BUG_REPORT")) {
            errorReport.f31536a = (ApplicationErrorReport) intent.getParcelableExtra("android.intent.extra.BUG_REPORT");
        }
        if (intent.hasExtra("com.android.feedback.SAFEPARCELABLE_REPORT")) {
            errorReport = (ErrorReport) intent.getParcelableExtra("com.android.feedback.SAFEPARCELABLE_REPORT");
            if (!TextUtils.isEmpty(errorReport.f31511B)) {
                this.f31584i = errorReport.f31511B;
                if (!errorReport.f31514E) {
                    errorReport.f31511B = "";
                }
            }
        }
        wym.f51577i = errorReport.f31535Z;
        if (TextUtils.isEmpty(errorReport.f31543ag)) {
            errorReport.f31543ag = wzg.m42522b();
        }
        return errorReport;
    }

    public void dismiss(View view) {
        String str;
        ErrorReport j = m23367j();
        if (j != null) {
            str = j.f31546b;
        } else {
            str = null;
        }
        mo18594a(45, j, str, f31578l.f56497g);
        setResult(-1);
        finish();
    }

    /* renamed from: e */
    public final FrameLayout mo18608e() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(C0126R.C0129id.feedback_content);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: g */
    public final void mo18609g() {
        ThemeSettings themeSettings;
        int i;
        Intent intent = new Intent();
        if (mo18612k()) {
            intent.setClassName(this, "com.google.android.gms.feedback.AnnotateScreenshotActivity");
            ErrorReport j = m23367j();
            if (!(j == null || (themeSettings = j.f31534Y) == null || (i = themeSettings.f31624b) == 0)) {
                if (themeSettings.f31623a == 0 && i != 0) {
                    i = -1;
                }
                intent.putExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", i);
            }
        } else {
            intent.setClassName(this, "com.google.android.gms.feedback.PreviewScreenshotActivity");
        }
        startActivity(intent);
    }

    /* renamed from: h */
    public final void mo18610h() {
        startActivity(new Intent().setClassName(this, "com.google.android.gms.feedback.PreviewActivity"));
    }

    /* renamed from: i */
    public final void mo18611i() {
        wwy wwy = f31574e;
        if (wwy != null) {
            wwy.mo29513c();
        }
        finish();
    }

    /* renamed from: k */
    public final boolean mo18612k() {
        if (((AccessibilityManager) getSystemService("accessibility")).isEnabled() || !this.f31585j || !cdtr.f181715a.mo6606a().mo78302a()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final String mo18613n() {
        wwt wwt = this.f31581c;
        return wwt != null ? ((EditText) ((wxu) wwt).mo29553a((int) C0126R.C0129id.gf_issue_description)).getText().toString().trim() : "";
    }

    /* renamed from: o */
    public final void mo18614o() {
        wwy wwy = f31574e;
        if (wwy != null) {
            wwy.mo29507a();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            finish();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        supportInvalidateOptionsMenu();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.menu_action_bar, menu);
        menu.findItem(C0126R.C0129id.common_send).setIcon(aayh.m47232a(this, TextUtils.isEmpty(mo18613n()) ? aayi.m47270b() ? aayi.m47263a(this, C0126R.attr.gf_disabledIconColor) : C1133kh.m17843b(this, C0126R.color.google_grey500) : aayi.m47270b() ? aayi.m47263a(this, C0126R.attr.gf_primaryBlueColor) : C1133kh.m17843b(this, C0126R.color.google_blue600)));
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        wym.f51575g = null;
        f31575f = null;
        f31579m = false;
        f31576h = null;
        f31574e = null;
        if (this.f31586n != null) {
            skh.m35531a().mo25689a(this, this.f31588p);
        }
        super.onDestroy();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo18611i();
        return true;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (!wxb.m42443a(m23367j())) {
            return false;
        }
        C1349sg sgVar = new C1349sg(this);
        sgVar.mo15906b((int) C0126R.string.common_ok, (DialogInterface.OnClickListener) null);
        sgVar.mo15912d(C0126R.string.gf_invalid_description_text);
        sgVar.mo15904b().show();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        if (!(f31574e == null || intent == null)) {
            ErrorReport d = mo18606d(intent);
            ErrorReport g = f31574e.mo29517g();
            if (d != null && g != null && !TextUtils.isEmpty(d.f31527R) && !TextUtils.isEmpty(g.f31527R) && TextUtils.equals(d.f31527R, g.f31527R)) {
                return;
            }
        }
        Long l = null;
        f31574e = null;
        f31575f = null;
        f31579m = false;
        this.f31583g = null;
        f31576h = null;
        ErrorReport d2 = mo18606d(intent);
        super.onNewIntent(intent);
        if (d2.f31514E) {
            if (intent.hasExtra("ASYNC_PSD_START_TICK_NANOS")) {
                l = Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1));
            }
            f31574e = mo18591a(intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA"), d2, l);
            return;
        }
        mo18603b(intent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.feedback.FeedbackChimeraActivity.a(com.google.android.gms.feedback.ErrorReport, boolean):void
     arg types: [com.google.android.gms.feedback.ErrorReport, int]
     candidates:
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(rz, java.lang.String):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(int, com.google.android.gms.feedback.ErrorReport):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(com.google.android.gms.googlehelp.feedback.Screenshot, com.google.android.gms.feedback.ErrorReport):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(wwy, boolean):void
      com.google.android.gms.feedback.FeedbackChimeraActivity.a(com.google.android.gms.feedback.ErrorReport, boolean):void */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        wxc wxc;
        if (!(!TextUtils.isEmpty(this.f31587o))) {
            if (f31574e != null) {
                int itemId = menuItem.getItemId();
                if (itemId == C0126R.C0129id.common_send) {
                    View findViewById = findViewById(C0126R.C0129id.gf_issue_description);
                    if (findViewById != null) {
                        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
                    }
                    wwy wwy = f31574e;
                    wwy.mo29507a();
                    FeedbackChimeraActivity feedbackChimeraActivity = wwy.f51516c;
                    ErrorReport g = wwy.mo29517g();
                    if (cdtr.f181715a.mo6606a().mo78310i() && !g.f31514E) {
                        String str = g.f31536a.packageName;
                        String C = cdtr.f181715a.mo6606a().mo78296C();
                        int i = g.f31536a.type;
                        String H = cdtr.f181715a.mo6606a().mo78301H();
                        if (str != null && C != null && H != null) {
                            String[] a = aayh.m47256a(C);
                            int length = a.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                String str2 = a[i2];
                                if (!str.startsWith(str2) || TextUtils.isEmpty(str2)) {
                                    i2++;
                                } else if (aayh.m47254a(Integer.toString(i), H) && ssk.m36235a(feedbackChimeraActivity)) {
                                    f31577k = wxb.m42440a(g, feedbackChimeraActivity);
                                    int i3 = wxc.f51529a;
                                    try {
                                        wxc = new wxc(feedbackChimeraActivity, g);
                                    } catch (Exception e) {
                                        wxc = null;
                                    }
                                    if (wxc != null) {
                                        spn.m35857a(wxc, f31577k);
                                    }
                                }
                            }
                        }
                    }
                    wyb.m42459a(g, feedbackChimeraActivity);
                    feedbackChimeraActivity.mo18596a(g, true);
                    return true;
                } else if (itemId != 16908332) {
                    return super.onOptionsItemSelected(menuItem);
                } else {
                    mo18611i();
                }
            }
            return true;
        }
        if (menuItem.getItemId() == C0126R.C0129id.common_send) {
            this.f31580b.execute(new wwj(this));
        }
        return true;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item = menu.getItem(0);
        if (!wxb.m42443a(m23367j()) || !TextUtils.isEmpty(mo18613n())) {
            return true;
        }
        item.setOnMenuItemClickListener(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        wwy wwy = f31574e;
        if (wwy == null) {
            wwy wwy2 = new wwy(this, bundle);
            f31574e = wwy2;
            this.f31582d = true;
            wwy2.mo29512b();
            return;
        }
        wwy.mo29508a(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        wwy wwy = f31574e;
        if (wwy != null) {
            wwy.mo29507a();
            wvm wvm = wwy.f51520g;
            int i = Build.VERSION.SDK_INT;
            bundle.putStringArray("feedback.RUNNING_APPS", wvm.f51423b.f51416a);
            bundle.putBundle("feedback.PSD_BUNDLE_KEY", wvm.f51423b.f51419d);
            bundle.putStringArray("feedback.PSBD_FILE_PATH_KEY", wvm.f51423b.f51420e);
            bundle.putStringArray("feedback.FOUND_ACCOUNTS", wwy.f51514a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        wwy wwy = f31574e;
        if (wwy != null) {
            wwy.mo29513c();
        }
    }

    public void readMore(View view) {
        startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.feedback.SuggestionsActivity"), 0);
    }

    /* renamed from: p */
    public static void m23370p() {
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        if ((r5 - r6) <= 0) goto L_0x0109;
     */
    public final void onCreate(Bundle bundle) {
        Account account;
        super.onCreate(bundle);
        getWindow().setSoftInputMode(34);
        Intent intent = getIntent();
        ErrorReport d = mo18606d(intent);
        String str = null;
        if (aayi.m47267a()) {
            aayi.m47264a(this, d, (int) C0126R.style.gf_LightActivityStyle, (int) C0126R.style.gf_DarkActivityStyle, (int) C0126R.style.gf_DayNightActivityStyle);
            if (!TextUtils.isEmpty(this.f31584i)) {
                account = new Account(this.f31584i, "com.google");
            } else {
                account = null;
            }
            wyu.m42480a(this, d, account);
        } else if (aayi.m47270b()) {
            if (aayi.m47268a(d)) {
                setTheme(C0126R.style.gf_DarkActivityStyle);
            } else {
                setTheme(C0126R.style.gf_LightActivityStyle);
            }
            wyu.m42480a(this, d, !TextUtils.isEmpty(this.f31584i) ? new Account(this.f31584i, "com.google") : null);
        } else {
            setTheme(C0126R.style.gf_LightActivityStyle);
        }
        aarq.m46801a(this, true);
        wym.f51575g = this;
        if (d.f31514E) {
            Log.e("gf_FeedbackActivity", "Invalid request for feedback invocation. This action is not permitted");
            finish();
            return;
        }
        setContentView(mo18608e());
        if (d != null) {
            String str2 = d.f31536a.packageName;
            String G = cdtr.f181715a.mo6606a().mo78300G();
            String concat = String.valueOf(str2).concat(":");
            String[] a = aayh.m47256a(G);
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = a[i];
                if (str3.startsWith(concat)) {
                    str = str3.substring(concat.length());
                    break;
                }
                i++;
            }
            if (str != null) {
                try {
                    String replaceAll = getPackageManager().getPackageInfo(str2, 0).versionName.replaceAll("[^0-9\\.]", "");
                    String replaceAll2 = str.replaceAll("[^0-9\\.]", "");
                    String[] split = replaceAll.split("\\.");
                    String[] split2 = replaceAll2.split("\\.");
                    int i2 = 0;
                    while (true) {
                        int length2 = split.length;
                        int length3 = split2.length;
                        if (i2 >= Math.max(length2, length3)) {
                            break;
                        }
                        int a2 = i2 < length2 ? wyv.m42482a(split[i2]) : 0;
                        int a3 = i2 < length3 ? wyv.m42482a(split2[i2]) : 0;
                        if (a2 == a3) {
                            i2++;
                        }
                    }
                    mo18593a(119, d);
                    ErrorReport d2 = mo18606d(intent);
                    new wys(new wwk(this, d2, intent), d2).show(getSupportFragmentManager(), "UpgradeDialog");
                } catch (PackageManager.NameNotFoundException e) {
                }
                aaxz.m47225a(this.f31580b, this);
            }
        }
        mo18593a(8, d);
        String stringExtra = intent.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID");
        this.f31587o = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f31588p = new wwl(this, "feedback", intent);
            skh.m35531a().mo25690a(this, new Intent().setClassName(this, "com.google.android.gms.feedback.FeedbackAsyncService"), this.f31588p, 1);
        } else {
            mo18603b(intent);
        }
        aaxz.m47225a(this.f31580b, this);
    }

    /* renamed from: a */
    public static void m23365a(C1341rz rzVar, String str) {
        rzVar.mo15845a(str);
        rzVar.mo15853b(true);
        rzVar.mo15842a((Drawable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final wwy mo18591a(Parcelable parcelable, ErrorReport errorReport, Long l) {
        Screenshot screenshot;
        Screenshot screenshot2 = null;
        if (wxb.m42443a(errorReport)) {
            try {
                ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(errorReport.f31536a.packageName, 0);
                Bitmap bitmap = errorReport.f31542af;
                if (bitmap != null) {
                    screenshot = Screenshot.m66502a(bitmap);
                } else if (parcelable == null) {
                    byte[] bArr = errorReport.f31566v;
                    if (bArr != null) {
                        screenshot = Screenshot.m66504a(bArr, errorReport.f31568x, errorReport.f31567w);
                    } else if (!TextUtils.isEmpty(errorReport.f31529T)) {
                        screenshot = new Screenshot();
                        Screenshot.m66501a(getFilesDir(), errorReport.f31529T, screenshot, false, this);
                    } else {
                        screenshot = !TextUtils.isEmpty(errorReport.f31565u) ? Screenshot.m66503a(errorReport.f31565u, errorReport.f31568x, errorReport.f31567w) : null;
                    }
                } else {
                    screenshot = (Screenshot) parcelable;
                }
                errorReport.f31536a.processName = applicationInfo.processName;
                screenshot2 = screenshot;
            } catch (PackageManager.NameNotFoundException e) {
                bqye.m113758a(e);
                finish();
                return null;
            }
        }
        wwy wwy = new wwy(this, errorReport, screenshot2, l);
        wwy.mo29512b();
        return wwy;
    }

    /* renamed from: b */
    public final void mo18603b(Intent intent) {
        this.f31582d = true;
        wxu wxu = new wxu();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_intent", intent);
        wxu.setArguments(bundle);
        this.f31581c = wxu;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (getSupportFragmentManager().findFragmentByTag("feedback_fragment") != null) {
            beginTransaction.replace(C0126R.C0129id.feedback_content, this.f31581c, "feedback_fragment");
        } else {
            beginTransaction.add(C0126R.C0129id.feedback_content, this.f31581c, "feedback_fragment");
        }
        beginTransaction.commit();
    }

    /* renamed from: b */
    public final void mo18604b(ErrorReport errorReport, boolean z) {
        if (aaya.m47229b(cdum.m135064b()) && ssk.m36235a(this) && wxb.m42443a(errorReport)) {
            FeedbackAsyncChimeraService.m23358b(this, errorReport);
        } else if (aaya.m47229b(cdum.m135064b()) || !ssk.m36235a(this) || TextUtils.isEmpty(errorReport.f31511B)) {
            new wyb(this, errorReport).start();
        } else {
            FeedbackAsyncChimeraService.m23358b(this, errorReport);
        }
        if (z) {
            mo18611i();
        }
    }

    /* renamed from: a */
    public final void mo18592a(int i) {
        String str;
        if (f31574e != null) {
            String concat = String.valueOf(getString(C0126R.string.gf_selection_accessibility_prompt)).concat(" ");
            if (i == 0) {
                this.f31589q = "anonymous";
                f31574e.mo29517g().f31511B = "";
                String valueOf = String.valueOf(concat);
                String valueOf2 = String.valueOf(getString(C0126R.string.gf_unspecified_email_account));
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            } else {
                String str2 = f31574e.f51514a[i];
                this.f31589q = str2;
                f31574e.mo29517g().f31511B = str2;
                String valueOf3 = String.valueOf(concat);
                String valueOf4 = String.valueOf(str2);
                str = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                obtain.setPackageName(obtain.getPackageName());
                obtain.setClassName(obtain.getClassName());
                obtain.getText().add(str);
                obtain.setEnabled(true);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    /* renamed from: a */
    public final void mo18593a(int i, ErrorReport errorReport) {
        mo18594a(i, errorReport, null, null);
    }

    /* renamed from: a */
    public final void mo18594a(int i, ErrorReport errorReport, String str, String str2) {
        Account account;
        if (errorReport == null) {
            Log.e("gf_FeedbackActivity", "ErrorReport is required to populate MetricsData.");
            return;
        }
        if (!TextUtils.isEmpty(this.f31584i)) {
            account = new Account(this.f31584i, "com.google");
        } else {
            account = null;
        }
        wyu.m42479a(this, errorReport, i, account, str2, str, -1);
    }

    /* renamed from: a */
    public final void mo18595a(Parcelable parcelable) {
        wwy wwy = f31574e;
        if (wwy == null) {
            Log.w("gf_FeedbackActivity", "Session is null, not updating screenshot.");
        } else {
            wwy.mo29509a((Screenshot) parcelable);
        }
    }

    /* renamed from: a */
    public final void mo18596a(ErrorReport errorReport, boolean z) {
        if (!aaya.m47228a(cdtx.m135029b())) {
            wwy wwy = f31574e;
            if (wwy == null || !wwy.mo29516f()) {
                mo18604b(errorReport, z);
            } else {
                mo18600a(wwy, z);
            }
        } else {
            this.f31580b.execute(new wwn(this, errorReport, z));
        }
    }

    /* renamed from: a */
    public final void mo18597a(Screenshot screenshot, ErrorReport errorReport) {
        int i;
        int i2;
        if (screenshot != null && !TextUtils.isEmpty(screenshot.f78924c)) {
            if (errorReport.f31566v == null) {
                i2 = screenshot.f78922a;
                i = screenshot.f78923b;
            } else {
                i2 = errorReport.f31568x;
                i = errorReport.f31567w;
            }
            Rect rect = new Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            Pair a = wxb.m42439a(getResources(), rect, i2, i, true);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            spn.m35857a(new wwm(this, errorReport, Pair.create(Integer.valueOf(point.x), Integer.valueOf(point.y)), screenshot, a), new Void[0]);
            return;
        }
        wxu wxu = (wxu) this.f31581c;
        ((ImageView) wxu.mo29553a((int) C0126R.C0129id.gf_screenshot_icon)).setVisibility(8);
        ((MaterialCardView) wxu.mo29553a((int) C0126R.C0129id.gf_include_screenshot_card)).setVisibility(8);
        ((TextView) wxu.mo29553a((int) C0126R.C0129id.gf_edit_screenshot)).setVisibility(8);
    }

    /* renamed from: a */
    public final void mo18598a(CharSequence charSequence) {
        if (f31574e != null) {
            if (wxb.m42443a(m23367j())) {
                supportInvalidateOptionsMenu();
            }
            f31574e.mo29517g().f31546b = charSequence.toString();
        }
    }

    /* renamed from: a */
    public final void mo18599a(Map map) {
        wwy wwy = f31574e;
        if (wwy != null) {
            wwy.mo29511a(map);
        }
    }

    /* renamed from: a */
    public final void mo18600a(wwy wwy, boolean z) {
        if (wwy.mo29514d()) {
            mo18604b(wwy.mo29517g(), z);
        } else {
            new adzt(Looper.getMainLooper()).postDelayed(new wwo(this, wwy, z), cdtr.m134943e());
        }
    }

    /* renamed from: a */
    public final void mo18601a(boolean z) {
        wxu wxu = (wxu) this.f31581c;
        int i = 4;
        wxu.mo29553a((int) C0126R.C0129id.gf_progress).setVisibility(!z ? 4 : 0);
        View a = wxu.mo29553a((int) C0126R.C0129id.gf_feedback_view);
        if (!z) {
            i = 0;
        }
        a.setVisibility(i);
    }
}
