package com.google.android.gms.family.p042v2.create;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;
import com.google.android.gms.family.p042v2.model.ProfileData;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FamilyInvitationChimeraActivity extends deu implements wll, wmt, wmh, rka {

    /* renamed from: b */
    public wia f31390b;

    /* renamed from: c */
    private String f31391c;

    /* renamed from: d */
    private wgj f31392d;

    /* renamed from: e */
    private rkb f31393e;

    /* renamed from: f */
    private PageDataMap f31394f;

    /* renamed from: g */
    private ContactPickerOptionsData f31395g;

    /* renamed from: h */
    private wgh f31396h;

    /* renamed from: i */
    private boolean f31397i = false;

    /* renamed from: j */
    private int f31398j = 0;

    /* renamed from: k */
    private int f31399k;

    /* renamed from: a */
    private final void m23238a(boolean z, ArrayList arrayList) {
        int i;
        String str;
        mo18477i();
        String str2 = this.f31391c;
        PageDataMap pageDataMap = this.f31394f;
        if (!z) {
            i = 7;
        } else {
            i = 6;
        }
        FragmentTransaction replace = getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fm_family_invitation_fragment_container, wmi.m42033a(str2, pageDataMap.mo18558a(i), arrayList));
        if (cdst.m134851b()) {
            str = "backStackTagSuccessFragment";
        } else {
            str = null;
        }
        replace.addToBackStack(str).commit();
    }

    /* renamed from: t */
    private final void m23239t() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().findFragmentByTag("invite-preconditions");
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        getWindow().clearFlags(8192);
    }

    /* renamed from: u */
    private final void m23240u() {
        setResult(3, m23241w());
        finish();
        if (getIntent().getBooleanExtra("fromCreate", false)) {
            overridePendingTransition(0, 0);
        }
    }

    /* renamed from: w */
    private final Intent m23241w() {
        Intent putExtra = new Intent().putExtra("accountName", this.f31391c);
        putExtra.putExtra("familyChanged", this.f31397i);
        if (this.f31392d.mo29096a() != null && !this.f31392d.mo29096a().isEmpty()) {
            putExtra.putExtra("consistencyToken", this.f31392d.mo29096a()).putExtra("tokenExpirationTimeSecs", this.f31392d.mo29098b());
        }
        return putExtra;
    }

    /* renamed from: x */
    private final boolean m23242x() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    /* renamed from: a */
    public final void mo18472a(ContactPickerOptionsData contactPickerOptionsData) {
        this.f31395g = contactPickerOptionsData;
    }

    /* renamed from: a */
    public final void mo18473a(PageDataMap pageDataMap) {
        this.f31394f = pageDataMap;
    }

    /* renamed from: b */
    public final wia mo18443b() {
        return this.f31390b;
    }

    /* renamed from: e */
    public final void mo18475e() {
        this.f31390b.mo29111a(4, 8, "updaterequired");
        mo18474b(-3);
    }

    /* renamed from: g */
    public final void mo18450g() {
        mo18483o();
    }

    /* renamed from: h */
    public final void mo18476h() {
        findViewById(C0126R.C0129id.fm_family_invitation_loading_screen).setVisibility(0);
    }

    /* renamed from: i */
    public final void mo18477i() {
        findViewById(C0126R.C0129id.fm_family_invitation_loading_screen).setVisibility(8);
    }

    /* renamed from: j */
    public final wgj mo18478j() {
        return this.f31392d;
    }

    /* renamed from: k */
    public final wgh mo18479k() {
        return this.f31396h;
    }

    /* renamed from: l */
    public final boolean mo18480l() {
        return getIntent().getBooleanExtra("isOnboardInvitations", true);
    }

    /* renamed from: m */
    public final void mo18481m() {
        m23239t();
    }

    /* renamed from: n */
    public final void mo18482n() {
        wgm.m41914a((Activity) this).show();
        m23239t();
    }

    /* renamed from: o */
    public final void mo18483o() {
        setResult(1, m23241w());
        finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity.a(boolean, java.util.ArrayList):void
     arg types: [int, java.util.ArrayList]
     candidates:
      com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity.a(int, int):void
      wll.a(int, int):void
      wmt.a(int, int):void
      com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity.a(boolean, java.util.ArrayList):void */
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 1) {
            if (intent.getStringExtra("consistencyToken") != null) {
                this.f31392d.mo29097a(intent.getStringExtra("consistencyToken"), intent.getLongExtra("tokenExpirationTimeSecs", 0));
            }
            int intExtra = this.f31398j + intent.getIntExtra("num-invitations-created", 0);
            this.f31398j = intExtra;
            if (intExtra > 0) {
                this.f31397i = true;
            }
            if (i2 != 0) {
                if (!this.f31394f.mo18560b(6) && !this.f31394f.mo18560b(7)) {
                    mo18483o();
                } else if (!cdst.m134852c() || !m23242x()) {
                    if (intent.getIntExtra("num-invitations-sent", 0) == 0) {
                        z = false;
                    }
                    m23238a(z, (ArrayList) null);
                } else {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("direct-add-contacts-list");
                    boolean z2 = !parcelableArrayListExtra.isEmpty();
                    if (cdst.m134851b()) {
                        this.f31397i = z2;
                    }
                    m23238a(z2, parcelableArrayListExtra);
                }
            } else if (cdst.m134852c() && m23242x() && this.f31394f.mo18560b(7)) {
                m23238a(false, new ArrayList());
            } else if (this.f31394f.mo18560b(5) || this.f31394f.mo18560b(17)) {
                mo18477i();
            } else {
                m23240u();
            }
        }
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            m23240u();
        } else if (!cdst.m134851b() || !getSupportFragmentManager().getBackStackEntryAt(0).getName().equals("backStackTagSuccessFragment")) {
            super.onBackPressed();
        } else {
            mo18483o();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        this.f31390b = new wia(this);
        String a = spn.m35852a((Activity) this);
        if (!rfz.m33557a(this).mo24610b(a)) {
            this.f31390b.mo29110a(4, 8);
            mo18474b(-3);
            return;
        }
        wgp.m41932a(this, getIntent(), a);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.f31391c = stringExtra;
        if (stringExtra == null) {
            this.f31390b.mo29110a(4, 13);
            mo18474b(-2);
            return;
        }
        Account[] a2 = adyd.m51363a(this).mo33916a("com.google");
        PageDataMap pageDataMap = null;
        Account account = null;
        for (Account account2 : a2) {
            if (account2.name.equals(this.f31391c)) {
                account = account2;
            }
        }
        if (account != null) {
            wgh wgh = new wgh(getIntent().getStringExtra("appId"), Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
            this.f31396h = wgh;
            this.f31390b.mo29114a(this.f31391c, wgh.f50618b, wgh.f50617a);
            this.f31399k = getIntent().getIntExtra("inviteeRole", 3);
            this.f31392d = new wgj();
            if (bundle != null && bundle.getString("consistencyToken") != null) {
                this.f31392d.mo29097a(bundle.getString("consistencyToken"), bundle.getLong("tokenExpirationTimeSecs", 0));
            } else if (getIntent().getStringExtra("consistencyToken") != null) {
                this.f31392d.mo29097a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
            }
            if (bundle != null) {
                pageDataMap = (PageDataMap) bundle.getParcelable("pageDataMap");
            }
            this.f31394f = pageDataMap;
            if (bundle == null) {
                this.f31397i = getIntent().getBooleanExtra("familyChanged", false);
            } else {
                this.f31397i = bundle.getBoolean("familyChanged");
            }
            if (this.f31393e == null) {
                allp a3 = allq.m61232a();
                a3.f73626a = 80;
                allq a4 = a3.mo40491a();
                rjy rjy = new rjy(this);
                rjy.f43172a = account;
                rjy.mo24780a(allr.f73629a, a4);
                rjo rjo = awbv.f94154a;
                awbt awbt = new awbt();
                awbt.f94148a = true ^ cdsw.m134870c() ? 1 : 0;
                rjy.mo24780a(rjo, awbt.mo51834a());
                rjy.mo24776a(this, this);
                this.f31393e = rjy.mo24784b();
            }
            setContentView((int) C0126R.C0128layout.fm_activity_family_invitation_v2);
            mo18477i();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.findFragmentById(C0126R.C0129id.fm_family_invitation_fragment_container) == null) {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                String str = this.f31391c;
                int i = this.f31399k;
                boolean x = m23242x();
                wlp wlp = new wlp();
                Bundle bundle2 = new Bundle(3);
                bundle2.putString("accountName", str);
                bundle2.putInt("inviteeRole", i);
                bundle2.putBoolean("isDirectAddInvitations", x);
                wlp.setArguments(bundle2);
                beginTransaction.add((int) C0126R.C0129id.fm_family_invitation_fragment_container, wlp).commit();
                return;
            }
            return;
        }
        this.f31390b.mo29110a(4, 14);
        String str2 = this.f31391c;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 42);
        sb.append("Selected account: ");
        sb.append(str2);
        sb.append(" doesn't exist on device");
        sb.toString();
        mo18474b(-2);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pageDataMap", this.f31394f);
        if (this.f31392d.mo29096a() != null && !this.f31392d.mo29096a().isEmpty()) {
            bundle.putString("consistencyToken", this.f31392d.mo29096a());
            bundle.putLong("tokenExpirationTimeSecs", this.f31392d.mo29098b());
        }
        bundle.putBoolean("familyChanged", this.f31397i);
    }

    /* renamed from: p */
    public final ProfileData mo18484p() {
        return (ProfileData) getIntent().getParcelableExtra("profileData");
    }

    /* renamed from: q */
    public final int mo18485q() {
        return this.f31398j;
    }

    /* renamed from: r */
    public final void mo18486r() {
        m23240u();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity.a(boolean, java.util.ArrayList):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity.a(int, int):void
      wll.a(int, int):void
      wmt.a(int, int):void
      com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity.a(boolean, java.util.ArrayList):void */
    /* renamed from: s */
    public final void mo18487s() {
        PageDataMap pageDataMap = this.f31394f;
        if (pageDataMap == null || pageDataMap.mo18560b(7)) {
            m23238a(false, (ArrayList) null);
        } else {
            m23240u();
        }
    }

    /* renamed from: v */
    public final rkb mo18465v() {
        return this.f31393e;
    }

    /* renamed from: b */
    public final void mo18474b(int i) {
        sbw sbw = wgn.f50624a;
        setResult(4, new Intent().putExtra("accountName", this.f31391c).putExtra("errorCode", i));
        finish();
    }

    /* renamed from: a */
    public final void mo18470a(int i) {
        if (i <= 0) {
            C1349sg a = wgm.m41918a((Context) this);
            a.mo15905b((int) C0126R.string.fm_family_is_full);
            a.mo15912d(C0126R.string.fm_cant_invite_more_members);
            a.mo15906b((int) C0126R.string.common_continue, new wke(this));
            a.mo15910c();
            return;
        }
        getWindow().addFlags(8192);
        wmu.m42044a(this.f31391c, i, this.f31399k).show(getSupportFragmentManager(), "invite-preconditions");
    }

    /* renamed from: a */
    public final void mo18471a(int i, int i2) {
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.invites.SendInvitationsActivity").putExtra("accountName", this.f31391c).putExtra("consistencyToken", this.f31392d.mo29096a()).putExtra("tokenExpirationTimeSecs", this.f31392d.mo29098b()).putExtra("max-available-slots", i).putExtra("appId", this.f31396h.f50617a).putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", stm.m36299a(getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", spn.m35852a((Activity) this)).putExtra("isOnboardInvitations", mo18480l()).putExtra("inviteeRole", this.f31399k).putExtra("invitesSendingPagedata", this.f31394f.mo18560b(23) ? this.f31394f.mo18558a(23) : new PageData(bree.f142590e)).putExtra("invitesRetryPagedata", this.f31394f.mo18560b(24) ? this.f31394f.mo18558a(24) : new PageData(bree.f142590e)).putExtra("invitesRetryLaterPagedata", this.f31394f.mo18560b(25) ? this.f31394f.mo18558a(25) : new PageData(bree.f142590e));
        if (cdst.m134852c()) {
            putExtra.putExtra("isDirectAddInvitations", m23242x());
        }
        putExtra.putExtra("contactPickerOptions", this.f31395g);
        startActivityForResult(putExtra, 1);
        m23239t();
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        wgm.m41915a(this, new wkd(this)).show();
    }
}
