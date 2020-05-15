package com.google.android.gms.plus.sharebox;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.model.posts.PlusPage;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShareBoxChimeraActivity extends FragmentActivity implements aomt, aomg, aomx, aolf, aolc, aokp, aolh, anpf, anqf {

    /* renamed from: a */
    protected aomh f83457a;

    /* renamed from: b */
    protected aoma f83458b;

    /* renamed from: c */
    aomv f83459c;

    /* renamed from: d */
    protected final Handler f83460d = new aome(this);

    /* renamed from: e */
    private aomu f83461e;

    /* renamed from: f */
    private aomy f83462f;

    /* renamed from: g */
    private Audience f83463g;

    /* renamed from: h */
    private anqg f83464h;

    /* renamed from: i */
    private AddToCircleData f83465i;

    /* renamed from: j */
    private String f83466j;

    /* renamed from: k */
    private PlusCommonExtras f83467k;

    /* renamed from: a */
    private static final ActionTargetEntity m69374a(List list) {
        aoen aoen = new aoen();
        aoen.mo42637a(list.size());
        aoer aoer = new aoer();
        aoer.mo42644a(aoen.mo42636a());
        return (ActionTargetEntity) aoer.mo42642a();
    }

    /* renamed from: b */
    private static final ClientActionDataEntity m69378b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        aogk aogk = new aogk();
        aogk.mo42712a(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aogk.mo42711a());
        aofy aofy = new aofy();
        aogh aogh = new aogh();
        aogh.mo42708a(arrayList);
        aofy.mo42694a(aogh.mo42707a());
        return (ClientActionDataEntity) aofy.mo42692a();
    }

    /* renamed from: c */
    private final int m69380c(int i) {
        aoma aoma = this.f83458b;
        if (aoma == null) {
            return 0;
        }
        if (i == 0) {
            return ((anpb) aoma.f78448b.getListAdapter()).f77343C;
        }
        if (i != 1) {
            return ((anpb) aoma.f78448b.getListAdapter()).f77342B;
        }
        return ((anpb) aoma.f78448b.getListAdapter()).f77341A;
    }

    /* renamed from: t */
    private final void m69382t() {
        if (((aonf) getSupportFragmentManager().findFragmentByTag("post_error_dialog")) == null) {
            aonf.m66133a((int) C0126R.string.plus_sharebox_post_error_message).show(getSupportFragmentManager(), "post_error_dialog");
        }
    }

    /* renamed from: u */
    private final void m69383u() {
        m69376a((int) C0126R.string.plus_sharebox_internal_error);
    }

    /* renamed from: v */
    private final void m69384v() {
        setResult(0);
        finish();
    }

    /* renamed from: w */
    private final void m69385w() {
        SharedPreferences.Editor edit = getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).edit();
        edit.putBoolean("pref_dont_ask_again", true);
        edit.apply();
    }

    /* renamed from: a */
    public final boolean mo42089a() {
        return false;
    }

    /* renamed from: d */
    public final void mo42955d() {
        this.f83457a.mo43022e();
    }

    /* renamed from: e */
    public final Audience mo42997e() {
        return this.f83463g;
    }

    /* renamed from: f */
    public final AddToCircleData mo42998f() {
        return this.f83465i;
    }

    /* renamed from: g */
    public final aomu mo42999g() {
        return this.f83461e;
    }

    public final String getCallingPackage() {
        return this.f83466j;
    }

    /* renamed from: h */
    public final aomy mo43001h() {
        return this.f83462f;
    }

    /* renamed from: i */
    public final PlusCommonExtras mo43002i() {
        return this.f83467k;
    }

    /* renamed from: j */
    public final aomv mo43003j() {
        return this.f83459c;
    }

    /* renamed from: k */
    public final void mo43009k() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        aolg aolg = (aolg) supportFragmentManager.findFragmentByTag("create_circle_fragment");
        if (aolg == null) {
            ArrayList arrayList = this.f83465i.f83436f;
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("circles", arrayList);
            aolg = new aolg();
            aolg.setArguments(bundle);
        }
        aolg.show(supportFragmentManager, "create_circle_fragment");
    }

    /* renamed from: l */
    public final void mo43010l() {
        AddToCircleData addToCircleData;
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.plus.sharebox.AddToCircleActivity");
        aokw aokw = this.f83457a.f78460e;
        if (aokw != null) {
            addToCircleData = aokw.f78370a;
        } else {
            addToCircleData = null;
        }
        intent.putExtra("add_to_circle_data", addToCircleData);
        intent.putExtra("calling_package_name", this.f83466j);
        intent.putExtra("client_application_id", this.f83459c.f78541m);
        startActivityForResult(intent, 5);
    }

    /* renamed from: m */
    public final anqg mo43004m() {
        return this.f83464h;
    }

    /* renamed from: n */
    public final void mo43011n() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.hide(this.f83457a);
        beginTransaction.show(this.f83458b);
        beginTransaction.addToBackStack("com.google.android.gms.plus.sharebox.show_acl_picker");
        beginTransaction.commit();
    }

    /* renamed from: o */
    public final void mo43012o() {
        if (((aokq) getSupportFragmentManager().findFragmentByTag("underage_warning_dialog")) == null) {
            String string = getString(C0126R.string.plus_sharebox_under_age_warning_title);
            String string2 = getString(C0126R.string.plus_sharebox_under_age_warning_message);
            Bundle bundle = new Bundle();
            bundle.putString("title", string);
            bundle.putString("message", string2);
            aokq aokq = new aokq();
            aokq.setArguments(bundle);
            aokq.show(getSupportFragmentManager(), "underage_warning_dialog");
            this.f83461e.mo43043a(riw.f43135c, riw.f43139g);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 2) {
            if (i2 == -1) {
                aomu aomu = this.f83461e;
                aomu.f78511i = soz.m35792a(soz.m35801d(aomu.getActivity(), aomu.f78510h));
                aomu.f78504b.mo42332x();
                return;
            }
            setResult(i2);
            finish();
        } else if (i == 3) {
            if (i2 != -1) {
                this.f83461e.mo43047b(riv.f43126t, riw.f43137e);
            } else {
                this.f83461e.mo43047b(riv.f43125s, riw.f43137e);
            }
            this.f83461e.mo43043a(riw.f43137e, riz.f43143a);
            setResult(i2);
            finish();
        } else if (i != 4) {
            if (i == 5 && i2 == -1 && intent != null) {
                AddToCircleData addToCircleData = (AddToCircleData) intent.getParcelableExtra("add_to_circle_data");
                this.f83465i = addToCircleData;
                this.f83457a.mo43018a(addToCircleData, true);
            }
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 || i2 == 1 || i2 == 1) {
            this.f83461e.mo43040a(Status.f30107a, new AddToCircleConsentData(false, null, null, null));
            mo43059q();
        } else {
            aokw aokw = this.f83457a.f78460e;
            if (aokw != null) {
                aokw.f78374e.setChecked(false);
            }
            this.f83457a.mo43024g();
        }
    }

    public final void onBackPressed() {
        FragmentManager.BackStackEntry backStackEntry;
        aoma aoma;
        anon anon;
        if (this.f83458b.isHidden() || (anon = (aoma = this.f83458b).f78449c) == null || anon.isHidden()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int backStackEntryCount = supportFragmentManager.getBackStackEntryCount();
            if (backStackEntryCount > 0) {
                backStackEntry = supportFragmentManager.getBackStackEntryAt(backStackEntryCount - 1);
            } else {
                backStackEntry = null;
            }
            if (backStackEntry == null || (!"com.google.android.gms.plus.sharebox.show_compose".equals(backStackEntry.getName()) && !"com.google.android.gms.plus.sharebox.show_acl_picker".equals(backStackEntry.getName()))) {
                this.f83461e.mo43042a(riv.f43107a);
                if (this.f83457a.f78457b) {
                    this.f83460d.sendEmptyMessage(1);
                    return;
                }
            } else if ("com.google.android.gms.plus.sharebox.show_acl_picker".equals(backStackEntry.getName())) {
                this.f83464h.mo42124a(this.f83463g, this);
            }
            super.onBackPressed();
            return;
        }
        aoma.mo42990a();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f83466j = aomi.m66051a(this);
        if (!ssk.m36235a(this)) {
            m69376a((int) C0126R.string.plus_sharebox_no_network_connection);
            return;
        }
        PlusCommonExtras b = PlusCommonExtras.m68418b(getIntent());
        this.f83467k = b;
        anku.m64689a(this, b, "gpsb0");
        this.f83459c = new aomv(getIntent());
        boolean z2 = true;
        if (aomi.m66057c(getIntent())) {
            String a = spn.m35852a((Activity) this);
            Intent intent = getIntent();
            if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(intent.getAction())) {
                if (intent.hasExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) {
                    Log.e("ShareBox", "Cannot override the calling package when using the action: com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
                } else if (TextUtils.isEmpty(a)) {
                    Log.e("ShareBox", "Must use startActivityForResult when using the action: com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
                } else if (rfz.m33557a(this).mo24610b(a)) {
                    aomv aomv = this.f83459c;
                    Intent intent2 = getIntent();
                    String stringExtra = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_ID");
                    String stringExtra2 = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_IMAGE_URL");
                    String stringExtra3 = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_DISPLAY_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        aomv.f78530b = new PlusPage(stringExtra, stringExtra3, stringExtra2);
                    }
                    aomv.f78531c = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_APP_NAME");
                    aomv.f78532d = intent2.getIntExtra("com.google.android.gms.plus.intent.extra.INTERNAL_APP_ICON_RESOURCE", -1);
                    aomv.f78533e = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_SHARE_BUTTON_NAME");
                    aomv.f78534f = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.SHARE_CONTEXT_TYPE");
                    boolean a2 = aomi.m66054a(this, aomv.f78534f);
                    aomv.f78537i = intent2.getIntExtra("com.google.android.gms.plus.intent.extra.OVERRIDE_FIRST_VIEW", a2 ? 1 : 0);
                    boolean z3 = !a2;
                    aomv.f78538j = intent2.getBooleanExtra("com.google.android.gms.plus.intent.extra.SHOW_ACL_SUGGESTED_SECTION", z3);
                    aomv.f78539k = intent2.getBooleanExtra("com.google.android.gms.plus.intent.extra.INCLUDE_SUGGESTIONS_WITH_PEOPLE", z3);
                    aomv.f78540l = intent2.getBooleanExtra("com.google.android.gms.plus.intent.extra.SHOW_ADD_TO_CIRCLE", z3);
                    aomv.f78541m = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_APPLICATION_ID");
                }
            }
            Log.e("ShareBox", "Invalid share action");
            m69384v();
            return;
        }
        if (aomi.m66056b(getIntent())) {
            Intent intent3 = getIntent();
            if (aomi.m66056b(intent3)) {
                aona a3 = aona.m66118a(intent3.getExtras());
                if (a3 == null || (a3.mo43072d() && !a3.mo43070b() && !a3.mo43074f())) {
                    Log.e("GooglePlusPlatform", "Mobile deep-link IDs must specify metadata.");
                }
            }
            Log.e("ShareBox", "Invalid deep link");
            m69384v();
            return;
        }
        if (aomi.m66053a(getIntent())) {
            Intent intent4 = getIntent();
            if (aomi.m66053a(intent4)) {
                String a4 = spn.m35852a((Activity) this);
                String a5 = aomi.m66051a(this);
                if (TextUtils.isEmpty(a4) || TextUtils.isEmpty(a5)) {
                    Log.e("GooglePlusPlatform", "Must use startActivityForResult when creating an interactive post.");
                } else {
                    aona a6 = aona.m66118a(intent4.getExtras());
                    if (a6 == null || !a6.mo43070b()) {
                        Log.e("GooglePlusPlatform", "The contentUrl is required when creating an interactive post.");
                    } else if (aomz.m66116a(intent4.getBundleExtra("com.google.android.apps.plus.CALL_TO_ACTION")) == null) {
                        Log.e("GooglePlusPlatform", "Call to action data is required when creating an interactive post.");
                    }
                }
            }
            Log.e("ShareBox", "Invalid interactive post");
            m69384v();
            return;
        }
        setContentView((int) C0126R.C0128layout.plus_sharebox_activity);
        View findViewById = findViewById(C0126R.C0129id.post_container);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.plus_sharebox_container_margin);
        if (getResources().getBoolean(C0126R.bool.plus_is_tablet)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            findViewById.setLayoutParams(marginLayoutParams);
        }
        if (bundle != null) {
            this.f83463g = (Audience) bundle.getParcelable("audience");
            this.f83465i = (AddToCircleData) bundle.getParcelable("addToCircleData");
            z2 = bundle.getBoolean("share_box_hidden");
            z = bundle.getBoolean("acl_hidden");
        } else {
            this.f83463g = sfd.f44109a;
            this.f83465i = new AddToCircleData(1, aokz.m65975a(this), getResources().getString(C0126R.string.plus_sharebox_circles_following_circle), null, null, null, null, null, null);
            z = true;
        }
        anqg anqg = new anqg(this.f83463g);
        this.f83464h = anqg;
        anqg.mo42123a(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        aomu aomu = (aomu) supportFragmentManager.findFragmentByTag("share_worker_fragment");
        this.f83461e = aomu;
        if (aomu == null) {
            aomu a7 = aomu.m66086a(this.f83459c.f78529a);
            this.f83461e = a7;
            beginTransaction.add(a7, "share_worker_fragment");
        }
        aomy aomy = (aomy) supportFragmentManager.findFragmentByTag("title_fragment");
        this.f83462f = aomy;
        if (aomy == null) {
            aomy aomy2 = new aomy();
            this.f83462f = aomy2;
            beginTransaction.add(C0126R.C0129id.title_container, aomy2, "title_fragment");
        }
        aomh aomh = (aomh) supportFragmentManager.findFragmentByTag("share_fragment");
        this.f83457a = aomh;
        if (aomh == null) {
            aomh aomh2 = new aomh();
            this.f83457a = aomh2;
            beginTransaction.add(C0126R.C0129id.post_container, aomh2, "share_fragment");
        }
        aoma aoma = (aoma) supportFragmentManager.findFragmentByTag("acl_fragment");
        this.f83458b = aoma;
        if (aoma == null) {
            aoma aoma2 = new aoma();
            this.f83458b = aoma2;
            beginTransaction.add(C0126R.C0129id.post_container, aoma2, "acl_fragment");
        }
        if (!z2) {
            beginTransaction.show(this.f83457a);
        } else {
            beginTransaction.hide(this.f83457a);
        }
        if (!z) {
            beginTransaction.show(this.f83458b);
        } else {
            beginTransaction.hide(this.f83458b);
        }
        beginTransaction.commit();
        if (bundle == null) {
            if (this.f83459c.mo43054f() && this.f83459c.f78543o.mo43072d()) {
                this.f83461e.mo43042a(riv.f43120n);
            }
            if (this.f83459c.mo43055g()) {
                this.f83461e.mo43042a(riv.f43119m);
            }
            Audience audience = this.f83459c.f78545q;
            if (audience != null && !sfi.m35164a(audience)) {
                this.f83461e.mo43042a(riv.f43121o);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        aold aold = (aold) getSupportFragmentManager().findFragmentByTag("confirm_action_dialog");
        if (aold != null) {
            aold.f78384a = this;
        }
        if (this.f83461e.f78516n != null) {
            findViewById(C0126R.C0129id.loading).setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("audience", this.f83463g);
        bundle.putParcelable("addToCircleData", this.f83465i);
        bundle.putBoolean("share_box_hidden", this.f83457a.isHidden());
        bundle.putBoolean("acl_hidden", this.f83458b.isHidden());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View findViewById = findViewById(C0126R.C0129id.post_container);
        if (motionEvent.getAction() != 0 || !spa.m35816a(motionEvent, findViewById)) {
            return super.onTouchEvent(motionEvent);
        }
        onBackPressed();
        ssc.m36197a(this, findViewById);
        return true;
    }

    /* renamed from: p */
    public final void mo43013p() {
        if (!this.f83457a.mo43020c()) {
            return;
        }
        if (!this.f83457a.mo43023f() || this.f83461e.f78517o != null) {
            this.f83457a.mo43024g();
        }
    }

    /* renamed from: q */
    public final void mo43059q() {
        boolean z;
        if (this.f83457a.mo43023f()) {
            aomu aomu = this.f83461e;
            AddToCircleConsentData addToCircleConsentData = aomu.f78517o;
            if (addToCircleConsentData.f82336a) {
                startActivityForResult(ansi.m65104a(aomu.f78512j, this.f83459c.mo43050b(), addToCircleConsentData.f82337b, addToCircleConsentData.f82338c, addToCircleConsentData.f82339d, 80), 4);
                return;
            }
            aokw aokw = this.f83457a.f78460e;
            if (aokw != null) {
                String str = ((Circle) aokw.f78377h.getSelectedItem()).f83445d;
                aomu g = aokw.f78378i.mo42999g();
                Audience f = aokw.f78370a.mo46777f();
                if (!g.f78523u) {
                    rjo rjo = allr.f73629a;
                    amdg.m62648a(g.f78506d, g.f78507e);
                    g.f78523u = true;
                    g.f78524v = str;
                    g.f78525w = f;
                    if (g.f78504b.mo24648p()) {
                        g.mo43046b();
                    } else if (!g.f78504b.mo24649q()) {
                        g.f78504b.mo42332x();
                    }
                } else {
                    throw new IllegalStateException("Add people to circle request already initiated");
                }
            }
        }
        if (sfi.m35164a(this.f83463g)) {
            mo43011n();
            return;
        }
        aomh aomh = this.f83457a;
        Post post = null;
        if (!aomh.mo43020c()) {
            aomh.f78459d.mo42999g().mo43042a(riv.f43112f);
        } else {
            ssc.m36197a(aomh.getActivity(), aomh.f78464i);
            Uri parse = aomh.f78459d.mo43003j().mo43053e() ? Uri.parse(aomh.f78459d.mo43003j().f78542n) : null;
            String a = aomi.m66050a(aomh.f78464i.getText());
            Bundle bundle = aomh.f78459d.mo43003j().mo43055g() ? aomh.f78459d.mo43003j().f78544p.f78560a : null;
            Bundle bundle2 = aomh.f78459d.mo43003j().mo43054f() ? aomh.f78459d.mo43003j().f78543o.f78561a : null;
            if (aomh.f78467l) {
                aomh.f78459d.mo42999g().mo43044a(riv.f43111e, null, rij.m33634a(aomh.f78463h), null);
                z = aomh.f78466k.isChecked();
            } else {
                z = true;
            }
            post = new Post(null, null, parse, a, null, null, bundle, bundle2, aomh.f78459d.mo43003j().f78534f, Boolean.valueOf(z), aomh.f78459d.mo43003j().mo43050b(), aomh.f78463h);
            if (post.mo46616b()) {
                aomh.f78459d.mo42999g().mo43042a(riv.f43117k);
            }
            if (post.mo46615a()) {
                aomh.f78459d.mo42999g().mo43042a(riv.f43109c);
            }
            if (post.mo46617c()) {
                aomh.f78459d.mo42999g().mo43042a(riv.f43128v);
            }
            if (!aomh.f78458c && post.f82562l.f30288c == 1) {
                aomh.f78459d.mo42999g().mo43042a(riv.f43099C);
            }
            if (!aomh.f78458c && post.f82562l.f30288c == 2) {
                aomh.f78459d.mo42999g().mo43042a(riv.f43100D);
            }
            if (aomh.f78459d.mo43003j().mo43054f() && aomh.f78459d.mo43003j().f78543o.mo43072d()) {
                aomh.f78459d.mo42999g().mo43042a(riv.f43129w);
            }
        }
        if (post != null) {
            aoni a2 = aoni.m66138a(getString(C0126R.string.plus_sharebox_post_pending));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(a2, "progress_dialog");
            beginTransaction.commitAllowingStateLoss();
            aomu aomu2 = this.f83461e;
            if (!aomu2.f78514l) {
                aomu2.f78514l = true;
                aomu2.f78515m = post;
                if (aomu2.f78504b.mo24648p()) {
                    aomu2.f78505c.mo7257g(Bundle.EMPTY);
                } else if (!aomu2.f78504b.mo24649q()) {
                    aomu2.f78504b.mo42332x();
                }
            } else {
                throw new IllegalStateException("One post at a time please");
            }
        } else {
            m69382t();
        }
    }

    /* renamed from: r */
    public final void mo43060r() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.hide(this.f83458b);
        beginTransaction.show(this.f83457a);
        if (supportFragmentManager.getBackStackEntryCount() <= 0 || !"com.google.android.gms.plus.sharebox.show_acl_picker".equals(supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1).getName())) {
            beginTransaction.addToBackStack("com.google.android.gms.plus.sharebox.show_compose");
        } else {
            supportFragmentManager.popBackStack("com.google.android.gms.plus.sharebox.show_acl_picker", 1);
        }
        beginTransaction.commit();
        mo42995a(this.f83464h.f77451a);
        aomh aomh = this.f83457a;
        aomh.f78458c = true;
        aomh.mo43019b();
    }

    /* renamed from: s */
    public final void mo43061s() {
        this.f83458b.mo42990a();
    }

    /* renamed from: a */
    private final List m69375a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Audience audience = this.f83463g;
        if (audience != null) {
            int size = audience.f30287b.size();
            for (int i3 = 0; i3 < size; i3++) {
                AudienceMember audienceMember = (AudienceMember) this.f83463g.f30287b.get(i3);
                Bundle bundle = audienceMember.f30298h;
                int i4 = bundle.getInt("selectionSource");
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                int i5 = bundle.getInt("contactType");
                                if (i2 == 1 && i5 == 1) {
                                    m69377a(arrayList, audienceMember);
                                }
                            } else if (i4 == 3) {
                                m69377a(arrayList, audienceMember);
                            }
                        } else if (i4 == 2) {
                            m69377a(arrayList, audienceMember);
                        }
                    } else if (i4 == 1) {
                        m69377a(arrayList, audienceMember);
                    }
                } else if (i4 == 0) {
                    m69377a(arrayList, audienceMember);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static final aogf m69381c(String str) {
        String e = ancm.m64016e(str);
        String g = ancm.m64018g(str);
        aoge aoge = new aoge();
        if (!TextUtils.isEmpty(e)) {
            aoge.mo42704b(e);
        } else if (TextUtils.isEmpty(g)) {
            return null;
        } else {
            aoge.mo42703a(g);
        }
        return aoge.mo42702a();
    }

    /* renamed from: b */
    private final void m69379b(int i) {
        Toast.makeText(this, i, 0).show();
    }

    /* renamed from: b */
    public final void mo42924b() {
        this.f83461e.mo43047b(riv.f43127u, riw.f43139g);
    }

    /* renamed from: c */
    public final void mo42949c() {
        this.f83461e.mo43042a(riv.f43107a);
        m69384v();
    }

    /* renamed from: b */
    public final void mo42996b(Audience audience) {
        AddToCircleData addToCircleData = this.f83465i;
        addToCircleData.mo46771a(audience, addToCircleData.f83435e);
        if (this.f83465i.mo46772a()) {
            mo43036a(Status.f30107a, this.f83465i);
        }
    }

    /* renamed from: b */
    public final void mo43058b(String str) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.remove(this.f83457a);
        aomh aomh = new aomh();
        this.f83457a = aomh;
        beginTransaction.add(C0126R.C0129id.post_container, aomh, "share_fragment");
        beginTransaction.hide(this.f83457a);
        beginTransaction.remove(this.f83458b);
        aoma aoma = new aoma();
        this.f83458b = aoma;
        beginTransaction.add(C0126R.C0129id.post_container, aoma, "acl_fragment");
        beginTransaction.hide(this.f83458b);
        beginTransaction.remove(this.f83461e);
        aomu a = aomu.m66086a(str);
        this.f83461e = a;
        beginTransaction.add(a, "share_worker_fragment");
        aomi.m66052a(this, str, this.f83466j);
        beginTransaction.commit();
        while (supportFragmentManager.getBackStackEntryCount() > 0) {
            String name = supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1).getName();
            if (!name.equals("com.google.android.gms.plus.sharebox.show_compose") && !name.equals("com.google.android.gms.plus.sharebox.show_acl_picker")) {
                break;
            }
            supportFragmentManager.popBackStackImmediate();
        }
        findViewById(C0126R.C0129id.loading).setVisibility(0);
        this.f83462f.mo43062a(0);
    }

    /* renamed from: a */
    private final void m69376a(int i) {
        m69379b(i);
        m69384v();
    }

    /* renamed from: a */
    private static final void m69377a(List list, AudienceMember audienceMember) {
        aogf c = m69381c(audienceMember.f30295e);
        if (c != null) {
            list.add(c);
        }
    }

    /* renamed from: a */
    public final void mo42958a(Intent intent, boolean z) {
        this.f83461e.mo43047b(riv.f43122p, riw.f43136d);
        if (z) {
            this.f83461e.mo43047b(riv.f43124r, riw.f43136d);
            m69385w();
        }
        try {
            startActivityForResult(intent, 3);
            this.f83461e.mo43043a(riw.f43136d, riw.f43137e);
        } catch (ActivityNotFoundException e) {
        }
    }

    /* renamed from: a */
    public final void mo43030a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f83457a.mo43014a(bitmap);
        }
    }

    /* renamed from: a */
    public final void mo43031a(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            m69383u();
        } else if (connectionResult.mo17670a()) {
            try {
                connectionResult.mo17669a(getContainerActivity(), 1);
            } catch (IntentSender.SendIntentException e) {
                Log.e("ShareBox", "Failed to start connection resolution");
                m69383u();
            }
        } else if (!rfx.m33535a(connectionResult.f30065c, getContainerActivity(), 1)) {
            m69383u();
            Log.e("ShareBox", "Failed to get GooglePlayServices dialog");
        }
    }

    /* renamed from: a */
    public final void mo43032a(ConnectionResult connectionResult, ansz ansz) {
        aomh aomh = this.f83457a;
        if (!connectionResult.mo17671b()) {
            ansz = null;
        }
        aomh.mo43015a(ansz);
    }

    /* renamed from: a */
    public final void mo43033a(ConnectionResult connectionResult, Post post) {
        aoli aoli;
        Post post2 = post;
        aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (aoni != null) {
            aoni.dismissAllowingStateLoss();
        }
        if (connectionResult.mo17671b()) {
            m69379b((int) C0126R.string.plus_sharebox_post_success);
            List a = m69375a(1, -1);
            int c = m69380c(1);
            if (!a.isEmpty()) {
                aomu aomu = this.f83461e;
                FavaDiagnosticsEntity favaDiagnosticsEntity = riv.f43102F;
                FavaDiagnosticsEntity favaDiagnosticsEntity2 = riw.f43133a;
                ClientActionDataEntity b = m69378b(a);
                aoen aoen = new aoen();
                aoen.mo42637a(a.size());
                if (c > 0) {
                    aoen.f78251d = ((float) a.size()) / ((float) c);
                    aoen.f78256i.add(9);
                }
                aoer aoer = new aoer();
                aoer.mo42644a(aoen.mo42636a());
                aomu.mo43044a(favaDiagnosticsEntity, favaDiagnosticsEntity2, b, (ActionTargetEntity) aoer.mo42642a());
            }
            List a2 = m69375a(2, -1);
            int c2 = m69380c(2);
            if (!a2.isEmpty()) {
                aomu aomu2 = this.f83461e;
                FavaDiagnosticsEntity favaDiagnosticsEntity3 = riv.f43103G;
                FavaDiagnosticsEntity favaDiagnosticsEntity4 = riw.f43133a;
                ClientActionDataEntity b2 = m69378b(a2);
                aoen aoen2 = new aoen();
                aoen2.mo42637a(a2.size());
                if (c2 > 0) {
                    aoen2.f78253f = ((float) a2.size()) / ((float) c2);
                    aoen2.f78256i.add(11);
                }
                aoer aoer2 = new aoer();
                aoer2.mo42644a(aoen2.mo42636a());
                aomu2.mo43044a(favaDiagnosticsEntity3, favaDiagnosticsEntity4, b2, (ActionTargetEntity) aoer2.mo42642a());
            }
            List a3 = m69375a(0, -1);
            int c3 = m69380c(0);
            if (!a3.isEmpty()) {
                aomu aomu3 = this.f83461e;
                FavaDiagnosticsEntity favaDiagnosticsEntity5 = riv.f43104H;
                FavaDiagnosticsEntity favaDiagnosticsEntity6 = riw.f43133a;
                ClientActionDataEntity b3 = m69378b(a3);
                aoen aoen3 = new aoen();
                aoen3.mo42637a(a3.size());
                if (c3 > 0) {
                    aoen3.f78249b = ((float) a3.size()) / ((float) c3);
                    aoen3.f78256i.add(7);
                }
                aoer aoer3 = new aoer();
                aoer3.mo42644a(aoen3.mo42636a());
                aomu3.mo43044a(favaDiagnosticsEntity5, favaDiagnosticsEntity6, b3, (ActionTargetEntity) aoer3.mo42642a());
            }
            List a4 = m69375a(3, -1);
            if (!a4.isEmpty()) {
                this.f83461e.mo43044a(riv.f43105I, riw.f43133a, m69378b(a4), m69374a(a4));
            }
            List a5 = m69375a(-1, 1);
            if (!a5.isEmpty()) {
                this.f83461e.mo43044a(riv.f43106J, riw.f43133a, m69378b(a5), m69374a(a5));
            }
            aomu aomu4 = this.f83461e;
            FavaDiagnosticsEntity favaDiagnosticsEntity7 = riv.f43110d;
            ClientActionDataEntity a6 = rij.m33634a(this.f83463g);
            String str = post2 != null ? post2.f82552b : null;
            int size = a.size();
            int size2 = a2.size();
            int size3 = a3.size();
            aoer aoer4 = new aoer();
            aoer4.f78258a = str;
            aoer4.f78260c.add(5);
            aoer4.mo42643a(c3);
            aoen aoen4 = new aoen();
            aoen4.f78248a = size3;
            aoen4.f78256i.add(6);
            aoen4.f78250c = size;
            aoen4.f78256i.add(8);
            aoen4.f78252e = size2;
            aoen4.f78256i.add(10);
            aoen4.f78254g = c;
            aoen4.f78256i.add(13);
            aoen4.f78255h = c2;
            aoen4.f78256i.add(14);
            aoen4.mo42637a(size + size2 + size3);
            aoer4.mo42644a(aoen4.mo42636a());
            aomu4.mo43044a(favaDiagnosticsEntity7, null, a6, (ActionTargetEntity) aoer4.mo42642a());
            if (getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).getBoolean("pref_dont_ask_again", false) || spn.m35892g(this, "com.google.android.apps.plus")) {
                setResult(-1);
                finish();
                return;
            }
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("install_app_dialog");
            if (findFragmentByTag == null) {
                int i = aoli.f78393a;
                sdo.m34974b(!spn.m35892g(this, "com.google.android.apps.plus"));
                Bundle bundle = new Bundle();
                bundle.putString("dialog_title", getString(C0126R.string.plus_install_app_dialog_title));
                bundle.putString("dialog_message", getString(C0126R.string.plus_install_app_dialog_message));
                bundle.putString("target_package", "com.google.android.apps.plus");
                aoli = new aoli();
                aoli.setArguments(bundle);
            } else {
                aoli = (aoli) findFragmentByTag;
            }
            aoli.show(getSupportFragmentManager(), "install_app_dialog");
            return;
        }
        this.f83461e.mo43042a(riv.f43112f);
        m69382t();
    }

    /* renamed from: a */
    public final void mo43034a(ConnectionResult connectionResult, Settings settings) {
        boolean z;
        int i;
        int i2;
        List list;
        Settings settings2 = settings;
        if (connectionResult.mo17671b() && settings2 != null) {
            findViewById(C0126R.C0129id.loading).setVisibility(8);
            this.f83457a.mo43017a(settings2);
            aoma aoma = this.f83458b;
            FragmentManager childFragmentManager = aoma.getChildFragmentManager();
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            aoma.f78448b = (anob) childFragmentManager.findFragmentByTag("selection");
            if (aoma.f78448b == null) {
                if (aoma.f78447a.mo42999g().f78516n.f82569f > 0) {
                    i2 = aoma.f78447a.mo42999g().f78516n.f82570g;
                    i = 0;
                } else {
                    i = aoma.f78447a.mo42999g().f78516n.f82570g;
                    i2 = 0;
                }
                if (aoma.f78447a.mo43003j().f78545q != null) {
                    list = aoma.f78447a.mo43003j().f78545q.f30287b;
                } else {
                    list = null;
                }
                aoma.f78448b = anob.m64855a(aoma.f78447a.mo42999g().f78512j, aoma.f78447a.mo43003j().mo43050b(), aoma.f78447a.mo43003j().f78538j, true, true, true, null, null, aoma.f78447a.mo43003j().f78541m, aoma.f78447a.getCallingPackage(), aoma.f78447a.mo42997e().f30288c, aoma.f78447a.mo43003j().f78539k, i2, i, 0, list);
                anob anob = aoma.f78448b;
                anob.f77267d = true;
                boolean z2 = settings2.f82567d;
                anob.f77266c = z2;
                AudienceView audienceView = anob.f77265b;
                if (audienceView != null) {
                    audienceView.mo17754a(z2);
                }
                beginTransaction.add(C0126R.C0129id.acl_fragment_container, aoma.f78448b, "selection");
            }
            aoma.f78449c = (anon) childFragmentManager.findFragmentByTag("search");
            if (aoma.f78449c == null) {
                String str = aoma.f78447a.mo42999g().f78512j;
                String b = aoma.f78447a.mo43003j().mo43050b();
                boolean a = aomi.m66054a(aoma.getActivity(), aoma.f78447a.mo43003j().f78534f);
                String str2 = aoma.f78447a.mo43003j().f78541m;
                String callingPackage = aoma.f78447a.getCallingPackage();
                aomc aomc = new aomc();
                aomc.setArguments(anon.m64877a(str, b, false, true, true, true, !a, true, str2, callingPackage));
                aoma.f78449c = aomc;
                beginTransaction.add(C0126R.C0129id.acl_fragment_container, aoma.f78449c, "search");
            }
            beginTransaction.show(aoma.f78448b);
            beginTransaction.hide(aoma.f78449c);
            beginTransaction.commitAllowingStateLoss();
            if (aoma.f78447a.mo42997e().f30288c != 0) {
                aoma.getLoaderManager().restartLoader(0, null, aoma);
            }
            int i3 = this.f83459c.f78537i;
            if (i3 != 1) {
                z = i3 != 2 ? settings2.f82568e : true;
            } else {
                z = false;
            }
            FragmentTransaction beginTransaction2 = getSupportFragmentManager().beginTransaction();
            beginTransaction2.show(!z ? this.f83457a : this.f83458b);
            beginTransaction2.commitAllowingStateLoss();
            if (z) {
                this.f83461e.mo43042a(riv.f43101E);
                return;
            }
            return;
        }
        if (Log.isLoggable("ShareBox", 5)) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Failed to load settings: ");
            sb.append(valueOf);
            Log.w("ShareBox", sb.toString());
        }
        this.f83461e.mo43042a(riv.f43112f);
        m69383u();
    }

    /* renamed from: a */
    public final void mo43035a(Status status) {
        if (!status.mo17710c()) {
            this.f83457a.mo43021d();
        }
        mo43013p();
    }

    /* renamed from: a */
    public final void mo43036a(Status status, AddToCircleData addToCircleData) {
        if (status.mo17710c() && addToCircleData != null) {
            this.f83457a.mo43018a(addToCircleData, false);
            return;
        }
        Log.e("ShareBox", "Failed to load add-to-circle data");
        this.f83457a.mo43021d();
    }

    /* renamed from: a */
    public final void mo43037a(Status status, Circle circle) {
        int i;
        if (status.mo17710c()) {
            aokw aokw = this.f83457a.f78460e;
            if (aokw != null) {
                aola aola = aokw.f78376g;
                aola.f78381a.add(circle);
                aola.notifyDataSetChanged();
                aola aola2 = aokw.f78376g;
                if (!aola2.f78381a.isEmpty() && aola2.mo42941a()) {
                    i = aola2.f78381a.size() - 1;
                } else {
                    i = aola2.f78381a.size();
                }
                aokw.f78371b = i;
                aokw.f78377h.setSelection(i);
                if (aokw.f78374e.isEnabled()) {
                    aokw.f78374e.setChecked(true);
                }
            }
            aomu aomu = this.f83461e;
            FavaDiagnosticsEntity favaDiagnosticsEntity = rjb.f43147a;
            String str = circle.f83445d;
            ArrayList arrayList = new ArrayList();
            aogb aogb = new aogb();
            aogb.mo42699a(str);
            arrayList.add(aogb.mo42698a());
            aofy aofy = new aofy();
            aofv aofv = new aofv();
            aofv.mo42688a(arrayList);
            aofy.mo42693a(aofv.mo42687a());
            aomu.mo43044a(favaDiagnosticsEntity, null, (ClientActionDataEntity) aofy.mo42692a(), null);
            return;
        }
        this.f83457a.mo43022e();
        m69379b((int) C0126R.string.plus_sharebox_circles_create_failed);
    }

    /* renamed from: a */
    public final void mo43038a(Status status, String str, String[] strArr) {
        int i;
        int i2;
        int i3;
        if (status.mo17710c()) {
            aomu aomu = this.f83461e;
            FavaDiagnosticsEntity favaDiagnosticsEntity = rjb.f43148b;
            ArrayList arrayList = new ArrayList();
            aogb aogb = new aogb();
            aogb.mo42699a(str);
            arrayList.add(aogb.mo42698a());
            ArrayList arrayList2 = new ArrayList();
            if (strArr != null) {
                i = strArr.length;
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < i; i4++) {
                aogf c = m69381c(strArr[i4]);
                if (c != null) {
                    arrayList2.add(c);
                }
            }
            aofy aofy = new aofy();
            aofy.mo42695a(arrayList);
            if (!arrayList2.isEmpty()) {
                aofy.f78291a = arrayList2;
                aofy.f78292b.add(8);
            }
            aofz a = aofy.mo42692a();
            aoer aoer = new aoer();
            aoer.mo42643a(m69380c(0));
            aoen aoen = new aoen();
            if (strArr != null) {
                i2 = strArr.length;
            } else {
                i2 = 0;
            }
            aoen.mo42637a(i2);
            aoer.mo42644a(aoen.mo42636a());
            aomu.mo43044a(favaDiagnosticsEntity, null, (ClientActionDataEntity) a, (ActionTargetEntity) aoer.mo42642a());
            aomu aomu2 = this.f83461e;
            FavaDiagnosticsEntity favaDiagnosticsEntity2 = ris.f43087a;
            ArrayList arrayList3 = new ArrayList();
            aogb aogb2 = new aogb();
            aogb2.mo42699a(str);
            arrayList3.add(aogb2.mo42698a());
            ArrayList arrayList4 = new ArrayList();
            if (strArr != null) {
                i3 = strArr.length;
            } else {
                i3 = 0;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                aogf c2 = m69381c(strArr[i5]);
                if (c2 != null) {
                    arrayList4.add(c2);
                }
            }
            aogk aogk = new aogk();
            aogk.f78303a = arrayList3;
            aogk.f78304b.add(2);
            if (!arrayList4.isEmpty()) {
                aogk.mo42712a(arrayList4);
            }
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(aogk.mo42711a());
            aofy aofy2 = new aofy();
            aogh aogh = new aogh();
            aogh.mo42708a(arrayList5);
            aofy2.mo42694a(aogh.mo42707a());
            aomu2.mo43044a(favaDiagnosticsEntity2, null, (ClientActionDataEntity) aofy2.mo42692a(), null);
            return;
        }
        m69379b((int) C0126R.string.plus_sharebox_circles_add_to_circle_failed);
    }

    /* renamed from: a */
    public final void mo42995a(Audience audience) {
        this.f83464h.mo42124a(audience, this);
    }

    /* renamed from: a */
    public final void mo42031a(Object obj) {
        Audience audience = this.f83464h.f77451a;
        this.f83463g = audience;
        this.f83457a.mo43016a(audience);
        mo42996b(this.f83463g);
    }

    /* renamed from: a */
    public final void mo42954a(String str) {
        aomu aomu = this.f83461e;
        if (!aomu.f78521s) {
            rjo rjo = allr.f73629a;
            amdg.m62648a(aomu.f78506d, aomu.f78507e);
            aomu.f78521s = true;
            aomu.f78522t = str;
            if (aomu.f78506d.mo24805i()) {
                amcp.m62615a(aomu.f78506d, aomu.f78512j, aomu.f78509g.mo43050b(), aomu.f78522t).mo9458a(aomu.f78501D);
            } else if (!aomu.f78506d.mo24806j()) {
                aomu.f78506d.mo24801e();
            }
        } else {
            throw new IllegalStateException("Create circle request already initiated");
        }
    }

    /* renamed from: a */
    public final void mo42959a(boolean z) {
        this.f83461e.mo43047b(riv.f43123q, riw.f43136d);
        if (z) {
            this.f83461e.mo43047b(riv.f43124r, riw.f43136d);
            m69385w();
        }
        this.f83461e.mo43043a(riw.f43136d, riz.f43143a);
        setResult(-1);
        finish();
    }

    /* renamed from: a */
    public final void mo43039a(String[] strArr, int i) {
        aomy aomy = this.f83462f;
        if (aomy != null) {
            aomy.mo43064a(strArr, i);
        }
    }
}
