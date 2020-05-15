package com.google.android.gms.family.p042v2.manage;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.InvitationDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FamilyManagementChimeraActivity extends deu implements wor, wpc, wpf, wob, wpt, wmt, wnr, wpm, wgr, rka {

    /* renamed from: b */
    public String f31413b;

    /* renamed from: c */
    public wgj f31414c;

    /* renamed from: d */
    public wia f31415d;

    /* renamed from: e */
    public ProgressDialog f31416e = null;

    /* renamed from: f */
    public wgh f31417f;

    /* renamed from: g */
    private rkb f31418g;

    /* renamed from: h */
    private boolean f31419h;

    /* renamed from: i */
    private boolean f31420i = false;

    /* renamed from: j */
    private DashboardDataModel f31421j;

    /* renamed from: k */
    private PageDataMap f31422k;

    /* renamed from: l */
    private boolean f31423l = false;

    /* renamed from: m */
    private ContactPickerOptionsData f31424m;

    /* renamed from: b */
    private final void m23279b(Intent intent) {
        if (intent.getStringExtra("consistencyToken") != null) {
            this.f31414c.mo29097a(intent.getStringExtra("consistencyToken"), intent.getLongExtra("tokenExpirationTimeSecs", 0));
        }
    }

    /* renamed from: c */
    private final void m23280c(Intent intent) {
        m23279b(intent);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wpg) {
            supportFragmentManager.popBackStackImmediate();
        }
        mo18525g();
        m23284s();
    }

    /* renamed from: d */
    private final void m23282d(Intent intent) {
        if (this.f31414c.mo29096a() != null && !this.f31414c.mo29096a().isEmpty()) {
            intent.putExtra("consistencyToken", this.f31414c.mo29096a()).putExtra("tokenExpirationTimeSecs", this.f31414c.mo29098b());
        }
    }

    /* renamed from: r */
    private final void m23283r() {
        mo18525g();
        setResult(9, mo18530q());
        finish();
    }

    /* renamed from: s */
    private final void m23284s() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wot) {
            ((wot) supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container)).mo29247a();
        }
    }

    /* renamed from: t */
    private final void m23285t() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().findFragmentByTag("InvitationsPreconditions");
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(8192);
    }

    /* renamed from: u */
    private final void m23286u() {
        ProgressDialog progressDialog = new ProgressDialog(this, wgp.m41933b(getIntent()));
        this.f31416e = progressDialog;
        progressDialog.setIndeterminate(true);
        this.f31416e.setCancelable(false);
        this.f31416e.setMessage(getResources().getString(C0126R.string.fm_delete_family_progress));
        this.f31416e.show();
    }

    /* renamed from: v */
    private final boolean m23287v() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    /* renamed from: a */
    public final void mo18503a() {
        super.onBackPressed();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wpo) {
            this.f31415d.mo29109a(31);
            ((wpo) supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container)).mo29272e();
        }
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wot) {
            this.f31415d.mo29109a(27);
        }
    }

    /* renamed from: a */
    public final void mo18505a(DashboardDataModel dashboardDataModel) {
        this.f31421j = dashboardDataModel;
    }

    /* renamed from: a */
    public final void mo18510a(ContactPickerOptionsData contactPickerOptionsData) {
        this.f31424m = contactPickerOptionsData;
    }

    /* renamed from: a */
    public final void mo18513a(PageDataMap pageDataMap) {
        this.f31422k = pageDataMap;
    }

    /* renamed from: b */
    public final wia mo18443b() {
        return this.f31415d;
    }

    /* renamed from: br */
    public final int mo18495br() {
        return 5;
    }

    /* renamed from: bs */
    public final int mo18496bs() {
        return 1;
    }

    /* renamed from: bt */
    public final void mo18497bt() {
        this.f31420i = true;
        m23286u();
        getSupportLoaderManager().initLoader(0, null, new wpa(this));
    }

    /* renamed from: e */
    public final void mo18523e() {
        Intent intent = (Intent) getIntent().getParcelableExtra("createAccountIntent");
        if (intent == null) {
            mo18529p();
            return;
        }
        intent.putExtra("consistencyToken", this.f31414c.mo29096a());
        intent.putExtra("tokenExpirationTimeSecs", this.f31414c.mo29098b());
        startActivityForResult(intent, 5);
    }

    /* renamed from: f */
    public final void mo18524f() {
        this.f31415d.mo29109a(11);
        String str = this.f31413b;
        wof wof = new wof();
        Bundle bundle = new Bundle(1);
        bundle.putString("accountName", str);
        wof.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_management_fragment_container, wof).addToBackStack("Confirm delete family").commit();
    }

    /* renamed from: g */
    public final void mo18525g() {
        this.f31419h = true;
    }

    public final Activity getActivity() {
        return this;
    }

    /* renamed from: h */
    public final void mo18526h() {
        mo18525g();
        this.f31423l = true;
    }

    /* renamed from: i */
    public final void mo18527i() {
        this.f31415d.mo29111a(2, 8, "updaterequired");
        mo18504a(4);
    }

    /* renamed from: j */
    public final wgj mo18478j() {
        return this.f31414c;
    }

    /* renamed from: k */
    public final wgh mo18479k() {
        return this.f31417f;
    }

    /* renamed from: l */
    public final boolean mo18480l() {
        return false;
    }

    /* renamed from: m */
    public final void mo18481m() {
        m23285t();
    }

    /* renamed from: n */
    public final void mo18482n() {
        mo18529p();
        m23285t();
    }

    /* renamed from: o */
    public final void mo18528o() {
        if (!this.f31422k.mo18560b(31) || !this.f31422k.mo18558a(31).f31453a.containsKey(33)) {
            sbw sbw = wgn.f50624a;
            return;
        }
        this.f31415d.mo29109a(36);
        startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse((String) this.f31422k.mo18558a(31).f31453a.get(33))), 7);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1:
                mo18525g();
                m23279b(intent);
                if (intent.getIntExtra("num-invitations-sent", 0) > 0 || (cdst.m134852c() && m23287v() && intent.getParcelableArrayListExtra("direct-add-contacts-list") != null && !intent.getParcelableArrayListExtra("direct-add-contacts-list").isEmpty())) {
                    if (!this.f31422k.mo18560b(38) || !this.f31422k.mo18558a(38).f31453a.containsKey(34)) {
                        bhnh.m101201a(findViewById(C0126R.C0129id.fm_family_management_fragment_container), (int) C0126R.string.fm_invitations_sent, 0).mo64020c();
                    } else {
                        bhnh.m101202a(findViewById(C0126R.C0129id.fm_family_management_fragment_container), (String) this.f31422k.mo18558a(38).f31453a.get(34), 0).mo64020c();
                    }
                    m23284s();
                    return;
                }
                return;
            case 2:
                if (i2 == 6) {
                    m23280c(intent);
                    return;
                }
                return;
            case 3:
                if (i2 == 9) {
                    m23283r();
                    return;
                }
                return;
            case 4:
                if (i2 == 6) {
                    m23280c(intent);
                    return;
                } else if (i2 == 9) {
                    m23283r();
                    return;
                } else {
                    return;
                }
            case 5:
                if (i2 == 11) {
                    mo18525g();
                    m23279b(intent);
                    m23284s();
                    return;
                }
                return;
            case 6:
                if (i2 == 12) {
                    mo18525g();
                    m23279b(intent);
                    m23284s();
                    return;
                }
                return;
            case 7:
            case 8:
            case 9:
                m23284s();
                return;
            default:
                return;
        }
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            setResult(3, mo18530q());
            finish();
        } else if (!(getSupportFragmentManager().findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wns)) {
            super.onBackPressed();
            if (this.f31423l) {
                mo18525g();
                m23284s();
                this.f31423l = false;
            }
        } else {
            mo18503a();
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        DashboardDataModel dashboardDataModel;
        super.onCreate(bundle);
        this.f31415d = new wia(this);
        String a = spn.m35852a((Activity) this);
        if (!rfz.m33557a(this).mo24610b(a)) {
            this.f31415d.mo29110a(2, 8);
            mo18504a(-3);
            return;
        }
        wgp.m41932a(this, getIntent(), a);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.f31413b = stringExtra;
        if (stringExtra == null) {
            this.f31415d.mo29110a(2, 13);
            mo18504a(-2);
            return;
        }
        wgh wgh = new wgh(getIntent().getStringExtra("appId"), Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        this.f31417f = wgh;
        this.f31415d.mo29114a(this.f31413b, wgh.f50618b, wgh.f50617a);
        this.f31415d.mo29109a(2);
        getSupportLoaderManager();
        this.f31414c = new wgj();
        m23279b(getIntent());
        boolean z2 = true;
        if (getIntent().getBooleanExtra("familyChanged", false)) {
            z = true;
        } else {
            z = bundle != null && bundle.getBoolean("familyChanged", false);
        }
        this.f31419h = z;
        setContentView((int) C0126R.C0128layout.fm_activity_family_management);
        this.f31423l = bundle != null && bundle.getBoolean("FamilyRolesChanged", false);
        if (this.f31418g == null) {
            rjy rjy = new rjy(this);
            rjy.mo24778a(this.f31413b);
            rjo rjo = awbv.f94154a;
            awbt awbt = new awbt();
            awbt.f94148a = cdsw.m134870c() ^ true ? 1 : 0;
            rjy.mo24780a(rjo, awbt.mo51834a());
            rjy.mo24776a(this, this);
            this.f31418g = rjy.mo24784b();
        }
        boolean z3 = getIntent().getParcelableExtra("manageMemberIntent") != null;
        boolean z4 = getIntent().getParcelableExtra("manageSupervisedMemberIntent") != null;
        boolean z5 = getIntent().getParcelableExtra("manageKIntent") != null;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String str = this.f31413b;
        if (!cdst.m134852c() || !m23287v()) {
            z2 = false;
        }
        wot wot = new wot();
        Bundle bundle2 = new Bundle(5);
        bundle2.putString("accountName", str);
        bundle2.putBoolean("hasMemberIntent", z3);
        bundle2.putBoolean("hasSupervisedMemberIntent", z4);
        bundle2.putBoolean("hasKidIntent", z5);
        bundle2.putBoolean("directAdd", z2);
        wot.setArguments(bundle2);
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) == null) {
            supportFragmentManager.beginTransaction().add((int) C0126R.C0129id.fm_family_management_fragment_container, wot).commit();
        }
        PageDataMap pageDataMap = null;
        if (bundle != null && bundle.getBoolean("DeleteFamilyInProgress", false)) {
            m23286u();
            getSupportLoaderManager().initLoader(0, null, new wpa(this));
        }
        if (bundle != null) {
            dashboardDataModel = (DashboardDataModel) bundle.getParcelable("DashboardDataModel");
        } else {
            dashboardDataModel = null;
        }
        this.f31421j = dashboardDataModel;
        if (bundle != null) {
            pageDataMap = (PageDataMap) bundle.getParcelable("pageDataMap");
        }
        this.f31422k = pageDataMap;
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(14);
    }

    public final void onDestroy() {
        wia wia = this.f31415d;
        if (wia != null) {
            wia.mo29109a(3);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("familyChanged", this.f31419h);
        bundle.putBoolean("DeleteFamilyInProgress", this.f31420i);
        bundle.putBoolean("FamilyRolesChanged", this.f31423l);
        ProgressDialog progressDialog = this.f31416e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        bundle.putParcelable("DashboardDataModel", this.f31421j);
        bundle.putParcelable("pageDataMap", this.f31422k);
    }

    /* renamed from: p */
    public final void mo18529p() {
        wgm.m41914a((Activity) this).show();
    }

    /* renamed from: q */
    public final Intent mo18530q() {
        Intent putExtra = new Intent().putExtra("accountName", this.f31413b).putExtra("familyChanged", this.f31419h);
        m23282d(putExtra);
        return putExtra;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Intent mo18516b(MemberDataModel memberDataModel, String str, boolean z) {
        return new Intent().setClassName(this, "com.google.android.gms.family.v2.manage.DeleteMemberActivity").putExtra("accountName", this.f31413b).putExtra("memberId", memberDataModel.f31350a).putExtra("memberGivenName", memberDataModel.f31353d).putExtra("hohGivenName", str).putExtra("leaveFamily", z).putExtra("appId", this.f31417f.f50617a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", stm.m36299a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", spn.m35852a((Activity) this));
    }

    /* renamed from: c */
    private final void m23281c(MemberDataModel memberDataModel, String str, boolean z) {
        PageData a = this.f31422k.mo18558a(31);
        wpg wpg = new wpg();
        Bundle bundle = new Bundle(4);
        bundle.putParcelable("member_data", memberDataModel);
        bundle.putString("hoh_given_name", str);
        bundle.putParcelable("manage_member_pd", a);
        bundle.putBoolean("can_be_removed", z);
        wpg.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_management_fragment_container, wpg).addToBackStack(null).commit();
    }

    /* renamed from: d */
    public final void mo18522d() {
        wpu.m42156a(this.f31413b, getString(C0126R.string.fm_reauth_password_title_delete_family), getString(C0126R.string.fm_reauth_pin_title_delete_family)).show(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: a */
    public final void mo18504a(int i) {
        sbw sbw = wgn.f50624a;
        setResult(4, new Intent().putExtra("accountName", this.f31413b).putExtra("errorCode", i));
        finish();
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
    /* renamed from: a */
    public final void mo18471a(int i, int i2) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.f31413b).putExtra("consistencyToken", this.f31414c.mo29096a()).putExtra("tokenExpirationTimeSecs", this.f31414c.mo29098b()).putExtra("max-available-slots", i).putExtra("appId", this.f31417f.f50617a).putExtra("isDirectAddInvitations", m23287v()).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", stm.m36299a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", spn.m35852a((Activity) this)).putExtra("inviteeRole", i2).putExtra("invitesSendingPagedata", this.f31422k.mo18560b(23) ? this.f31422k.mo18558a(23) : new PageData(bree.f142590e)).putExtra("invitesRetryPagedata", this.f31422k.mo18560b(24) ? this.f31422k.mo18558a(24) : new PageData(bree.f142590e)).putExtra("invitesRetryLaterPagedata", this.f31422k.mo18560b(25) ? this.f31422k.mo18558a(25) : new PageData(bree.f142590e));
        DashboardDataModel dashboardDataModel = this.f31421j;
        if (dashboardDataModel != null && dashboardDataModel.f31342f) {
            putExtra.putExtra("disable-sms-invites", true);
        }
        ContactPickerOptionsData contactPickerOptionsData = this.f31424m;
        if (contactPickerOptionsData == null) {
            wgm.m41915a(this, new wov(this)).show();
            m23285t();
            return;
        }
        putExtra.putExtra("contactPickerOptions", contactPickerOptionsData);
        startActivityForResult(putExtra, 1);
        m23285t();
    }

    /* renamed from: c */
    public final void mo18521c() {
        this.f31415d.mo29109a(13);
        onBackPressed();
    }

    /* renamed from: b */
    public final void mo18517b(int i, int i2) {
        if (!cdtf.m134919b()) {
            getWindow().addFlags(8192);
        }
        wmu.m42044a(this.f31413b, i, i2).show(getSupportFragmentManager(), "InvitationsPreconditions");
    }

    /* renamed from: b */
    public final void mo18518b(InvitationDataModel invitationDataModel) {
        wgn.m41923c("FamilyManagementChimeraActivity", "show dashboard and delete invitation", new Object[0]);
        onBackPressed();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wot) {
            wot wot = (wot) supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container);
            wot.mo29248a(wot.getResources().getString(C0126R.string.fm_cancelling_invitation_message));
            wot.getActivity().getSupportLoaderManager().initLoader(3, null, new woj(wot, invitationDataModel));
        }
    }

    /* renamed from: b */
    public final void mo18519b(MemberDataModel memberDataModel) {
        if (((Intent) getIntent().getParcelableExtra("manageKIntent")) == null || memberDataModel.f31356g != 4) {
            this.f31415d.mo29109a(37);
            Intent className = new Intent().setClassName(this, "com.google.android.gms.family.webview.FamilyWebViewActivity");
            String valueOf = String.valueOf(memberDataModel.f31350a);
            startActivityForResult(className.putExtra("webviewUrl", valueOf.length() == 0 ? new String("https://families.google.com/familylink/kids/") : "https://families.google.com/familylink/kids/".concat(valueOf)).putExtra("accountName", this.f31413b), 9);
            return;
        }
        mo18507a(memberDataModel);
    }

    /* renamed from: b */
    public final void mo18520b(PageData pageData) {
        wgm.m41917a(this, pageData, this.f31413b, new woy(this), null, false).show();
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        wgm.m41915a(this, new wou(this)).show();
    }

    /* renamed from: a */
    public final void mo18506a(InvitationDataModel invitationDataModel) {
        wpd wpd = new wpd();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("invitation", invitationDataModel);
        wpd.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_management_fragment_container, wpd).addToBackStack("Manage Invitations").commit();
    }

    /* renamed from: a */
    public final void mo18507a(MemberDataModel memberDataModel) {
        Intent intent = (Intent) getIntent().getParcelableExtra("manageKIntent");
        if (intent != null) {
            intent.putExtra("memberId", memberDataModel.f31350a);
            m23282d(intent);
            startActivityForResult(intent, 6);
        }
    }

    /* renamed from: a */
    public final void mo18508a(MemberDataModel memberDataModel, String str, boolean z) {
        Intent b = mo18516b(memberDataModel, str, z);
        if (z) {
            this.f31415d.mo29109a(16);
            startActivityForResult(b, 3);
            return;
        }
        this.f31415d.mo29109a(7);
        startActivityForResult(b, 2);
    }

    /* renamed from: a */
    public final void mo18509a(MemberDataModel memberDataModel, String str, boolean z, boolean z2) {
        this.f31415d.mo29109a(5);
        if (cdsh.m134824c()) {
            Intent intent = (Intent) getIntent().getParcelableExtra("manageSupervisedMemberIntent");
            if (intent == null || !memberDataModel.mo18428a()) {
                Intent intent2 = (Intent) getIntent().getParcelableExtra("manageMemberIntent");
                if (intent2 != null) {
                    if (cdsh.m134823b() && !z2) {
                        intent2.removeExtra("removeMemberIntent");
                    } else {
                        intent2.putExtra("removeMemberIntent", mo18516b(memberDataModel, str, z));
                    }
                    intent2.putExtra("memberId", memberDataModel.f31350a);
                    m23282d(intent2);
                    startActivityForResult(intent2, 4);
                    return;
                }
                m23281c(memberDataModel, str, z2);
                return;
            }
            this.f31415d.mo29109a(5);
            intent.putExtra("memberId", memberDataModel.f31350a);
            m23282d(intent);
            startActivityForResult(intent, 8);
            return;
        }
        Intent intent3 = (Intent) getIntent().getParcelableExtra("manageMemberIntent");
        if (intent3 != null) {
            if (!cdsh.m134823b() || z2) {
                intent3.putExtra("removeMemberIntent", mo18516b(memberDataModel, str, z));
            }
            intent3.putExtra("memberId", memberDataModel.f31350a);
            m23282d(intent3);
            startActivityForResult(intent3, 4);
            return;
        }
        m23281c(memberDataModel, str, z2);
    }

    /* renamed from: a */
    public final void mo18511a(PageData pageData) {
        if (pageData == null) {
            C1349sg a = wgm.m41918a((Context) this);
            a.mo15912d(C0126R.string.fm_not_in_family_error);
            a.mo15906b((int) C0126R.string.close_button_label, new wow(this));
            a.mo15904b().show();
            return;
        }
        wgm.m41917a(this, pageData, this.f31413b, new wox(this), null, false).show();
    }

    /* renamed from: a */
    public final void mo18512a(PageData pageData, String str, int i) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wpo) {
            this.f31415d.mo29109a(29);
        }
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wot) {
            this.f31415d.mo29109a(25);
        }
        String str2 = this.f31413b;
        wns wns = new wns();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str2);
        bundle.putParcelable("pageData", pageData);
        bundle.putInt("desiredRole", i);
        bundle.putString("memberId", str);
        wns.setArguments(bundle);
        supportFragmentManager.beginTransaction().replace(C0126R.C0129id.fm_family_management_fragment_container, wns).addToBackStack("ChangeRoleConfirmation").commitAllowingStateLoss();
    }

    /* renamed from: a */
    public final void mo18514a(String str, int i) {
        super.onBackPressed();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        brcm a = brcm.m113875a(i);
        if (a == null) {
            a = brcm.UNKNOWN_FAMILY_ROLE;
        }
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wpo) {
            this.f31415d.mo29109a(30);
            wpo wpo = (wpo) supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container);
            wpo.mo29269b();
            wpo.getActivity().getSupportLoaderManager().restartLoader(7, null, new wpn(wpo, str, a));
        }
        if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container) instanceof wot) {
            this.f31415d.mo29109a(26);
            wot wot = (wot) supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_management_fragment_container);
            wot.mo29253f();
            wot.getActivity().getSupportLoaderManager().restartLoader(7, null, new wos(wot, str, a));
        }
    }

    /* renamed from: a */
    public final void mo18515a(ArrayList arrayList, PageData pageData) {
        String str = this.f31413b;
        PageData a = this.f31422k.mo18558a(33);
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putParcelableArrayList("MEMBERS", arrayList);
        bundle.putParcelable("mppd", pageData);
        bundle.putParcelable("mpnepd", a);
        wpo wpo = new wpo();
        wpo.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_management_fragment_container, wpo).addToBackStack("ManageParents").commit();
    }
}
