package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.model.AccountMetadata;
import com.google.android.gms.plus.audience.AudienceSelectionScrollView;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anpc extends anqe implements LoaderManager.LoaderCallbacks, View.OnClickListener, anpf {

    /* renamed from: b */
    public String f77382b;

    /* renamed from: c */
    public String f77383c;

    /* renamed from: d */
    public String f77384d;

    /* renamed from: e */
    public String f77385e;

    /* renamed from: f */
    public boolean f77386f;

    /* renamed from: g */
    public anqg f77387g;

    /* renamed from: x */
    private boolean f77388x;

    /* renamed from: y */
    private String f77389y;

    /* renamed from: z */
    private boolean f77390z;

    /* renamed from: a */
    private final void m64932a(Status status) {
        if (!this.f77388x) {
            try {
                status.mo17708a(getContainerActivity(), 0);
                this.f77388x = true;
            } catch (IntentSender.SendIntentException e) {
                getSupportLoaderManager().restartLoader(0, null, this);
            }
        }
    }

    /* renamed from: c */
    private final void m64933c(Intent intent) {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("audienceSelectionList");
        anpn a = mo42070a(intent, findFragmentByTag);
        if (a != findFragmentByTag) {
            getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, a, "audienceSelectionList").commit();
        }
    }

    /* renamed from: r */
    private final boolean mo46556r() {
        return !getPackageName().equals(this.f77384d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract anpn mo42070a(Intent intent, Fragment fragment);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42072a(alzr alzr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42073a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42077b(Intent intent) {
        mo42071a(-1, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo42078e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo42079g() {
        mo42077b(mo42082j().f43513a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo42080h() {
        mo42071a(0, (Intent) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract FavaDiagnosticsEntity mo42081i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public rqa mo42082j() {
        rqa rqa = new rqa(new Intent());
        ArrayList arrayList = new ArrayList(rqa.m34230e(getIntent()));
        Audience audience = this.f77387g.f77451a;
        ArrayList arrayList2 = new ArrayList(audience.f30287b);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(audience.f30287b);
        rqa.mo25013b((List) arrayList);
        rqa.mo25008a(arrayList2);
        rqa.mo25012b(arrayList3);
        rqa.mo25005a(audience.f30288c);
        return rqa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo42083k() {
        mo42071a(0, (Intent) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo42084l() {
        return true;
    }

    /* renamed from: m */
    public final anqg mo42085m() {
        return this.f77387g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final ClientActionDataEntity mo42086n() {
        return rij.m33635a(new ArrayList(this.f77387g.f77451a.f30287b), false, false);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 != -1) {
            this.f77390z = true;
            mo42080h();
        }
    }

    public final void onBackPressed() {
        mo42080h();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0126R.C0129id.f7440ok) {
            mo42079g();
        } else if ((id == C0126R.C0129id.audience_selection_update_circle_view || id == C0126R.C0129id.audience_selection_checkbox || id == C0126R.C0129id.add_to_circles_top_blank_view || id == C0126R.C0129id.add_to_circles_left_blank_view || id == C0126R.C0129id.add_to_circles_right_blank_view) && this.f77442o && mo42117c(-1)) {
            mo42079g();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [android.widget.FrameLayout, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        Intent intent = getIntent();
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON") || intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON_ID")) {
            str = rqa.m34228c(intent).f30295e;
        } else {
            str = null;
        }
        boolean z = !TextUtils.isEmpty(str);
        rqa.m34228c(intent);
        String d = rqa.m34229d(intent);
        this.f77386f = false;
        int i4 = 8;
        if (!getWindow().hasFeature(8)) {
            requestWindowFeature(1);
        } else if (!TextUtils.isEmpty(d) && !z) {
            mo8628aW().mo15858c(true);
            this.f77386f = true;
        } else {
            requestWindowFeature(1);
        }
        super.onCreate(bundle);
        if (!soz.m35807f(this)) {
            try {
                this.f77384d = spn.m35870c((Activity) this);
                this.f77382b = intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_ACCOUNT_NAME");
                this.f77383c = intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_PLUS_PAGE_ID");
                this.f77385e = rqa.m34227b(intent);
                this.f77389y = intent.getStringExtra("OK_TEXT");
                if (TextUtils.isEmpty(this.f77385e)) {
                    this.f77385e = "80";
                }
                if (TextUtils.isEmpty(this.f77382b)) {
                    Log.e("AudienceSelectionActivi", "Account name must not be empty.");
                    mo42083k();
                    return;
                }
                if (bundle == null && mo46556r()) {
                    mo42075a(riz.f43143a, mo42081i());
                }
                Intent intent2 = getIntent();
                this.f77442o = false;
                if (z) {
                    this.f77444q = 0;
                    this.f77440m = false;
                    this.f77441n = false;
                    overridePendingTransition(0, 0);
                    setContentView((int) C0126R.C0128layout.plus_add_to_circles_activity);
                    this.f77435h = (AudienceSelectionScrollView) findViewById(C0126R.C0129id.audience_selection_container_view);
                    AudienceSelectionScrollView audienceSelectionScrollView = this.f77435h;
                    audienceSelectionScrollView.f82292a = this;
                    audienceSelectionScrollView.f82293b = this;
                    if (this.f77443p) {
                        i4 = 0;
                    }
                    audienceSelectionScrollView.setVisibility(i4);
                    this.f77448u = getResources().getInteger(C0126R.integer.maximum_showing_circles);
                    this.f77438k = (int) (getResources().getDimension(C0126R.dimen.plus_add_to_circles_header_height) + getResources().getDimension(C0126R.dimen.plus_add_to_circles_header_divider));
                    this.f77439l = (FrameLayout) findViewById(C0126R.C0129id.add_to_circles_top_blank_view);
                    android.app.Activity containerActivity = getContainerActivity();
                    Resources resources = containerActivity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int identifier2 = resources.getIdentifier("navigation_bar_height_landscape", "dimen", "android");
                    boolean hasPermanentMenuKey = ViewConfiguration.get(containerActivity).hasPermanentMenuKey();
                    if (identifier <= 0) {
                        i = 0;
                    } else {
                        i = !hasPermanentMenuKey ? resources.getDimensionPixelSize(identifier) : 0;
                    }
                    if (identifier2 <= 0) {
                        i2 = 0;
                    } else {
                        i2 = !hasPermanentMenuKey ? resources.getDimensionPixelSize(identifier2) : 0;
                    }
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    Display defaultDisplay = ((WindowManager) containerActivity.getSystemService("window")).getDefaultDisplay();
                    int i5 = Build.VERSION.SDK_INT;
                    defaultDisplay.getRealMetrics(displayMetrics);
                    int i6 = displayMetrics.widthPixels;
                    int i7 = displayMetrics.heightPixels;
                    if (i6 > i7 && i2 == i) {
                        i3 = i7 - spa.m35814a(containerActivity);
                    } else {
                        i3 = (i7 - i) - spa.m35814a(containerActivity);
                    }
                    this.f77439l.setLayoutParams(new LinearLayout.LayoutParams(-1, i3));
                    this.f77439l.setOnClickListener(this);
                    View findViewById = findViewById(C0126R.C0129id.add_to_circles_left_blank_view);
                    findViewById.setOnClickListener(this);
                    View findViewById2 = findViewById(C0126R.C0129id.add_to_circles_right_blank_view);
                    findViewById2.setOnClickListener(this);
                    C1280ps.m19906b((View) this.f77439l, 2);
                    C1280ps.m19906b(findViewById, 2);
                    C1280ps.m19906b(findViewById2, 2);
                    this.f77436i = (FrameLayout) findViewById(C0126R.C0129id.fragment_container);
                    String string = getResources().getString(C0126R.string.plus_add_to_circles_title_default);
                    String d2 = rqa.m34229d(intent2);
                    if (TextUtils.isEmpty(d2)) {
                        String str2 = rqa.m34228c(intent2).f30296f;
                        if (!TextUtils.isEmpty(str2)) {
                            string = getResources().getString(C0126R.string.plus_add_to_circles_title_with_user_name, str2);
                        }
                    } else {
                        string = d2;
                    }
                    int a = rqa.m34222a(intent2, getResources().getColor(C0126R.color.plus_add_to_circles_header_text));
                    TextView textView = (TextView) findViewById(C0126R.C0129id.add_to_circles_title);
                    textView.setText(string);
                    textView.setTextColor(anqe.m64977d(a));
                    int b = rqa.m34226b(intent2, getResources().getColor(C0126R.color.plus_add_to_circles_header_grey));
                    GradientDrawable gradientDrawable = (GradientDrawable) ((LinearLayout) findViewById(C0126R.C0129id.add_to_circles_header)).getBackground();
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(anqe.m64977d(b));
                    }
                    this.f77446s = 0;
                    this.f77445r = 0;
                    this.f77449v = false;
                    super.mo42121p();
                    this.f77442o = true;
                } else {
                    setContentView((int) C0126R.C0128layout.plus_audience_selection_activity);
                    if (this.f77386f) {
                        findViewById(C0126R.C0129id.plus_auth_title).setVisibility(8);
                    }
                    spa.m35815a(getContainerActivity(), 0.67d);
                    Button button = (Button) findViewById(C0126R.C0129id.f7440ok);
                    button.setOnClickListener(this);
                    if (!TextUtils.isEmpty(this.f77389y)) {
                        button.setText(this.f77389y);
                    }
                }
                if (bundle == null) {
                    this.f77388x = false;
                    sfd sfd = new sfd();
                    sfd.mo25467a(rqa.m34230e(getIntent()));
                    sfd.mo25466a(rqa.m34234i(getIntent()));
                    this.f77387g = new anqg(sfd.mo25465a());
                } else {
                    this.f77388x = bundle.getBoolean("resolvingError", false);
                    this.f77387g = new anqg((Audience) bundle.getParcelable("audience"));
                }
                m64933c(intent);
                if (!TextUtils.isEmpty(d)) {
                    setTitle(d);
                } else if (this.f77386f) {
                    setTitle(mo42078e());
                }
                getSupportLoaderManager().initLoader(0, null, this);
                mo42073a(bundle);
            } catch (SecurityException e) {
                mo42083k();
            }
        } else {
            Log.w("AudienceSelectionActivi", "This activity is not available for restricted profile.");
            mo42083k();
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 0) {
            return new anrl(this, this.f77382b, this.f77383c, this.f77385e, this.f77384d);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        if (this.f77388x && !this.f77390z) {
            getSupportLoaderManager().restartLoader(0, null, this);
            m64933c(getIntent());
            this.f77388x = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("audience", this.f77387g.f77451a);
        bundle.putBoolean("resolvingError", this.f77388x);
    }

    public final void setTitle(int i) {
        setTitle(getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        if (this.f77442o) {
            return;
        }
        if (this.f77386f) {
            mo8628aW().mo15845a(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42071a(int i, Intent intent) {
        if (!TextUtils.isEmpty(this.f77382b) && mo46556r()) {
            mo42075a(mo42081i(), riz.f43143a);
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public void onLoadFinished(Loader loader, amey amey) {
        AccountMetadata accountMetadata;
        if (loader.getId() == 0) {
            Status status = ((anrl) loader).f76571f;
            if (status.mo17710c() && amey != null && amey.mo24660a() == 1) {
                alzr b = amey.mo24661a(0);
                if (mo42084l() && b.mo41070k() == null) {
                    Bundle bundle = (Bundle) b.f43672a.f30166f.getParcelable("account_metadata");
                    if (bundle != null) {
                        bundle.setClassLoader(b.getClass().getClassLoader());
                        accountMetadata = (AccountMetadata) bundle.getParcelable(b.mo41063c());
                    } else {
                        accountMetadata = null;
                    }
                    if (accountMetadata == null || !accountMetadata.f81935a) {
                        if (!this.f77388x) {
                            int myUid = Process.myUid();
                            String str = this.f77382b;
                            anui anui = new anui(this, new ClientContext(myUid, str, str, this.f77384d, getPackageName()));
                            anui.f77744a = 1;
                            Intent a = anui.mo42290a();
                            this.f77390z = false;
                            startActivityForResult(a, 0);
                            this.f77388x = true;
                            return;
                        }
                        return;
                    }
                }
                mo42072a(b);
            } else if (status.mo17709b()) {
                m64932a(status);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42075a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        shz.m35338a(this, this.f77382b, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.f77384d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42076a(FavaDiagnosticsEntity favaDiagnosticsEntity, ClientActionDataEntity clientActionDataEntity) {
        shz.m35340a(this, this.f77382b, this.f77383c, favaDiagnosticsEntity, mo42081i(), this.f77384d, clientActionDataEntity);
    }
}
