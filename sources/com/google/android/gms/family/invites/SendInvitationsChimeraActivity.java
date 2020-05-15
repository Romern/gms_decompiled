package com.google.android.gms.family.invites;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.BuildConfig;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendInvitationsChimeraActivity extends deu implements View.OnClickListener, rka, who, wgr {

    /* renamed from: l */
    private static final int[] f31292l = {1, 2, 3, 4};

    /* renamed from: A */
    private int f31293A = 0;

    /* renamed from: B */
    private boolean f31294B = false;

    /* renamed from: C */
    private boolean f31295C = false;

    /* renamed from: D */
    private boolean f31296D = false;

    /* renamed from: E */
    private boolean f31297E;

    /* renamed from: F */
    private boolean f31298F;

    /* renamed from: G */
    private String f31299G;

    /* renamed from: H */
    private boolean f31300H = false;

    /* renamed from: I */
    private int f31301I = 0;

    /* renamed from: J */
    private int f31302J = 0;

    /* renamed from: K */
    private int f31303K = 0;

    /* renamed from: L */
    private int f31304L = 0;

    /* renamed from: M */
    private String f31305M = "2";

    /* renamed from: N */
    private PageData f31306N;

    /* renamed from: O */
    private PageData f31307O;

    /* renamed from: P */
    private PageData f31308P;

    /* renamed from: Q */
    private ContactPickerOptionsData f31309Q;

    /* renamed from: b */
    public WalletCustomTheme f31310b;

    /* renamed from: c */
    public String f31311c;

    /* renamed from: d */
    public ArrayList f31312d = new ArrayList();

    /* renamed from: e */
    public whw f31313e;

    /* renamed from: f */
    public ResultReceiver f31314f;

    /* renamed from: g */
    public wgj f31315g;

    /* renamed from: h */
    public wgh f31316h;

    /* renamed from: i */
    public wia f31317i;

    /* renamed from: j */
    public brcm f31318j = brcm.UNKNOWN_FAMILY_ROLE;

    /* renamed from: k */
    private int f31319k;

    /* renamed from: m */
    private rkb f31320m;

    /* renamed from: n */
    private allg f31321n;

    /* renamed from: o */
    private LoaderManager f31322o;

    /* renamed from: p */
    private SmsSentReceiver f31323p;

    /* renamed from: q */
    private whp f31324q;

    /* renamed from: r */
    private final SparseArray f31325r = new SparseArray();

    /* renamed from: s */
    private boolean f31326s = false;

    /* renamed from: t */
    private ArrayList f31327t = new ArrayList();

    /* renamed from: u */
    private ViewGroup f31328u;

    /* renamed from: v */
    private ViewGroup f31329v;

    /* renamed from: w */
    private ViewGroup f31330w;

    /* renamed from: x */
    private ViewGroup f31331x;

    /* renamed from: y */
    private int f31332y = 0;

    /* renamed from: z */
    private int f31333z = 0;

    /* renamed from: a */
    private final List m23162a(Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f31312d;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            Contact contact = (Contact) arrayList2.get(i);
            if (set.contains(Integer.valueOf(contact.f31291j))) {
                arrayList.add(contact);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final void m23165b(int i) {
        this.f31319k = i;
        int[] iArr = f31292l;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            (i3 != 2 ? i3 != 3 ? i3 != 4 ? this.f31328u : this.f31331x : this.f31330w : this.f31329v).setVisibility(i3 == i ? 0 : 8);
        }
    }

    /* renamed from: j */
    private final boolean m23168j() {
        return getIntent().getBooleanExtra("isOnboardInvitations", false);
    }

    /* renamed from: k */
    private final boolean m23169k() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    /* renamed from: l */
    private final void m23170l() {
        wgn.m41923c("SendInvChimeraActivity", "RetryView shown", new Object[0]);
        m23165b(3);
        HashMap hashMap = this.f31307O.f31453a;
        if (hashMap != null && hashMap.containsKey(2)) {
            m23163a(this.f31330w, (String) this.f31307O.f31453a.get(2));
        }
        RecyclerView recyclerView = (RecyclerView) this.f31330w.findViewById(C0126R.C0129id.fm_invitations_failed_list);
        recyclerView.setLayoutManager(new aah());
        List a = m23162a(new HashSet(Arrays.asList(7, 13)));
        HashMap hashMap2 = this.f31307O.f31453a;
        if (hashMap2 != null && hashMap2.containsKey(3)) {
            wgz.m41940a((TextView) this.f31330w.findViewById(C0126R.C0129id.fm_invitations_retry_error_title), (String) this.f31307O.f31453a.get(3), new wgt(this.f31307O, this, this.f31311c));
        }
        recyclerView.setAdapter(new whk(a, this.f31320m, this.f31321n, true, this));
        Button button = (Button) this.f31330w.findViewById(C0126R.C0129id.fm_invitations_skip_retry_button);
        HashMap hashMap3 = this.f31307O.f31453a;
        if (hashMap3 != null && hashMap3.containsKey(5)) {
            button.setText((CharSequence) this.f31307O.f31453a.get(5));
        }
        button.setOnClickListener(this);
        Button button2 = (Button) this.f31330w.findViewById(C0126R.C0129id.fm_invitations_retry_now_button);
        HashMap hashMap4 = this.f31307O.f31453a;
        if (hashMap4 != null && hashMap4.containsKey(4)) {
            button2.setText((CharSequence) this.f31307O.f31453a.get(4));
        }
        button2.setOnClickListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo18416e() {
        wgn.m41923c("SendInvChimeraActivity", "SendingView shown", new Object[0]);
        m23165b(2);
        HashMap hashMap = this.f31308P.f31453a;
        if (hashMap != null && hashMap.containsKey(2)) {
            m23163a(this.f31329v, (String) this.f31308P.f31453a.get(2));
        }
    }

    /* renamed from: g */
    public final void mo18417g() {
        wgn.m41923c("SendInvChimeraActivity", "Skip Failures View", new Object[0]);
        m23165b(4);
        HashMap hashMap = this.f31306N.f31453a;
        if (hashMap != null && hashMap.containsKey(2)) {
            m23163a(this.f31331x, (String) this.f31306N.f31453a.get(2));
        }
        RecyclerView recyclerView = (RecyclerView) this.f31331x.findViewById(C0126R.C0129id.fm_invitations_failed_list);
        recyclerView.setLayoutManager(new aah());
        List a = m23162a(new HashSet(Arrays.asList(8, 14, 16)));
        HashMap hashMap2 = this.f31306N.f31453a;
        if (hashMap2 != null && hashMap2.containsKey(3)) {
            wgz.m41940a((TextView) this.f31331x.findViewById(C0126R.C0129id.fm_invitations_text_skip_failures_title), (String) this.f31306N.f31453a.get(3), new wgt(this.f31306N, this, this.f31311c));
        }
        recyclerView.setAdapter(new whk(a, this.f31320m, this.f31321n, true, this));
        Button button = (Button) this.f31331x.findViewById(C0126R.C0129id.fm_invitations_skip_failures_button);
        TextView textView = (TextView) this.f31331x.findViewById(C0126R.C0129id.fm_invitations_skip_list_header);
        if (!m23169k() || !cdst.m134852c()) {
            textView.setText((int) C0126R.string.fm_invitations_text_invitations);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        HashMap hashMap3 = this.f31306N.f31453a;
        if (hashMap3 != null && hashMap3.containsKey(4)) {
            button.setText((CharSequence) this.f31306N.f31453a.get(4));
        }
        button.setOnClickListener(this);
    }

    public final Activity getActivity() {
        return this;
    }

    /* renamed from: h */
    public final void mo18419h() {
        mo18413a(this.f31312d);
    }

    /* renamed from: i */
    public final void mo18420i() {
        int i = this.f31332y;
        int i2 = this.f31333z;
        StringBuilder sb = new StringBuilder(50);
        sb.append(i);
        sb.append(" sent successfully, ");
        sb.append(i2);
        sb.append(" failed.");
        sb.toString();
        sbw sbw = wgn.f50624a;
        HashSet hashSet = new HashSet(Arrays.asList(1, 3, 4, 9, 10));
        ArrayList arrayList = this.f31312d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            if (!hashSet.contains(Integer.valueOf(((Contact) arrayList.get(i3)).f31291j))) {
                i3 = i4;
            } else {
                return;
            }
        }
        if (this.f31327t.isEmpty()) {
            wgn.m41923c("SendInvChimeraActivity", "All state update done, finishing.", new Object[0]);
            mo18408a(-1, this.f31293A);
        } else if (!this.f31294B) {
            wgn.m41923c("SendInvChimeraActivity", "All state update done, showing retry view", new Object[0]);
            m23170l();
        } else {
            wgn.m41923c("SendInvChimeraActivity", "All state update done, showing skip failures view", new Object[0]);
            mo18417g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        int i5 = 0;
        if (i3 != 1) {
            if (i3 == 3) {
                if (!cdst.m134852c()) {
                    return;
                }
            } else if (i3 == 2) {
                this.f31324q.mo29106a(false);
                return;
            } else {
                return;
            }
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Contact picker returned ");
        sb.append(i4);
        wgn.m41923c("SendInvChimeraActivity", sb.toString(), new Object[0]);
        if (i4 == -1) {
            if (cdsn.m134841b()) {
                ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("selectedContacts");
                ArrayList arrayList = new ArrayList();
                int size = parcelableArrayListExtra.size();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i6 < size) {
                    ContactPerson contactPerson = (ContactPerson) parcelableArrayListExtra.get(i6);
                    ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) contactPerson.f31436d.get(i5);
                    Contact contact = new Contact();
                    contact.f31283b = contactPerson.f31433a;
                    int i10 = i9 + 1;
                    contact.f31285d = i9;
                    contact.f31288g = contactPerson.f31435c;
                    int i11 = contactMethod.f31438a;
                    if (i11 == 1) {
                        contact.f31282a = contactMethod.f31439b;
                        i7++;
                    } else if (i11 == 0) {
                        contact.f31284c = contactMethod.f31439b;
                        i8++;
                    }
                    contact.f31291j = 1;
                    String valueOf = String.valueOf(contact);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    sb2.append("Adding a contact to the list: ");
                    sb2.append(valueOf);
                    sb2.toString();
                    arrayList.add(contact);
                    i6++;
                    i9 = i10;
                    i5 = 0;
                }
                this.f31301I = i7;
                this.f31302J = i8;
                this.f31312d = arrayList;
            } else {
                intent2.setExtrasClassLoader(com.google.android.gms.appinvite.model.ContactPerson.class.getClassLoader());
                ArrayList parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("com.google.android.gms.appinvite.CONTEXT_RESULT_SELECTED_PEOPLE");
                ArrayList arrayList2 = new ArrayList();
                int size2 = parcelableArrayListExtra2.size();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i12 < size2) {
                    com.google.android.gms.appinvite.model.ContactPerson contactPerson2 = (com.google.android.gms.appinvite.model.ContactPerson) parcelableArrayListExtra2.get(i12);
                    ContactPerson.ContactMethod a = contactPerson2.mo7263a();
                    Contact contact2 = new Contact();
                    contact2.f31283b = contactPerson2.f9749a;
                    int i16 = i15 + 1;
                    contact2.f31285d = i15;
                    contact2.f31288g = contactPerson2.f9752d;
                    int i17 = a.f9755a;
                    if (i17 == 2) {
                        contact2.f31282a = a.f9756b;
                        i13++;
                    } else if (i17 == 1) {
                        contact2.f31284c = a.f9756b;
                        i14++;
                    }
                    contact2.f31291j = 1;
                    String valueOf2 = String.valueOf(contact2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                    sb3.append("Adding a contact to the list: ");
                    sb3.append(valueOf2);
                    sb3.toString();
                    arrayList2.add(contact2);
                    i12++;
                    i15 = i16;
                }
                this.f31301I = i13;
                this.f31302J = i14;
                this.f31312d = arrayList2;
            }
            if (this.f31312d.isEmpty()) {
                mo18408a(-1, 0);
                return;
            }
            mo18416e();
            if (i3 == 1) {
                mo18412a(this.f31311c, 2000);
            } else {
                this.f31322o.initLoader(2000, null, new wht(this, this.f31299G, this.f31312d));
            }
        } else if (i4 == 0) {
            wgn.m41923c("SendInvChimeraActivity", "Handling RESULT_CANCELED for people selection", new Object[0]);
            mo18408a(0, 0);
        }
    }

    public final void onBackPressed() {
        int i = this.f31319k;
        if (i == 1) {
            super.onBackPressed();
        } else if (i != 2) {
            mo18408a(0, this.f31293A);
        } else {
            wgn.m41923c("SendInvChimeraActivity", "Suppressing back button", new Object[0]);
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.fm_invitations_skip_retry_button) {
            mo18408a(-1, this.f31293A);
        } else if (view.getId() == C0126R.C0129id.fm_invitations_skip_failures_button) {
            mo18408a(-1, this.f31293A);
        } else if (view.getId() == C0126R.C0129id.fm_invitations_retry_now_button) {
            wgn.m41923c("SendInvChimeraActivity", "Retry now clicked, starting flow again", new Object[0]);
            this.f31327t.clear();
            this.f31325r.clear();
            if (this.f31326s) {
                mo18412a(this.f31311c, 3000);
            } else {
                String str = this.f31311c;
                this.f31332y = 0;
                this.f31333z = 0;
                HashSet hashSet = new HashSet(Collections.singletonList(13));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.f31312d;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    Contact contact = (Contact) arrayList2.get(i);
                    if (hashSet.contains(Integer.valueOf(contact.f31291j)) && contact.mo18399b()) {
                        arrayList.add(contact);
                        contact.f31291j = 10;
                    }
                }
                this.f31313e.mo29108a(arrayList, str);
            }
            this.f31294B = true;
            wgn.m41923c("SendInvChimeraActivity", "ResendingView shown", new Object[0]);
            m23165b(2);
            HashMap hashMap = this.f31308P.f31453a;
            if (hashMap != null && hashMap.containsKey(2)) {
                m23163a(this.f31329v, (String) this.f31308P.f31453a.get(2));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("clientCallingPackage");
        if (stringExtra != null) {
            wgp.m41932a(this, getIntent(), stringExtra);
            this.f31305M = Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion);
        }
        this.f31322o = getSupportLoaderManager();
        setContentView((int) C0126R.C0128layout.fm_invitations_base);
        this.f31315g = new wgj();
        if (getIntent().getStringExtra("consistencyToken") != null) {
            this.f31315g.mo29097a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0126R.C0129id.fm_invitations_startup_page);
        this.f31328u = viewGroup;
        m23163a(viewGroup, getString(C0126R.string.fm_invitations_invite_family_title));
        this.f31329v = (ViewGroup) findViewById(C0126R.C0129id.fm_invitations_sending);
        this.f31330w = (ViewGroup) findViewById(C0126R.C0129id.fm_invitations_retry_error);
        this.f31331x = (ViewGroup) findViewById(C0126R.C0129id.fm_invitations_skip_failures);
        this.f31314f = new SendInvitationsResultReceiver(new adzt(Looper.getMainLooper()), new WeakReference(this));
        this.f31311c = getIntent().getStringExtra("accountName");
        this.f31299G = getIntent().getStringExtra("appId");
        this.f31318j = brcm.m113875a(getIntent().getIntExtra("inviteeRole", 3));
        this.f31316h = new wgh(this.f31299G, this.f31305M);
        this.f31308P = (PageData) getIntent().getParcelableExtra("invitesSendingPagedata");
        this.f31307O = (PageData) getIntent().getParcelableExtra("invitesRetryPagedata");
        this.f31306N = (PageData) getIntent().getParcelableExtra("invitesRetryLaterPagedata");
        this.f31309Q = (ContactPickerOptionsData) getIntent().getParcelableExtra("contactPickerOptions");
        int a = wgp.m41930a(getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.f110168a = qkj.m32287a(this, a);
        this.f31310b = walletCustomTheme;
        this.f31300H = m23168j();
        wia wia = new wia(this, this.f31311c, this.f31305M, this.f31299G);
        this.f31317i = wia;
        wia.mo29115a(this.f31300H, 2);
        this.f31323p = new SmsSentReceiver(this.f31314f);
        this.f31313e = new whw(this, SmsManager.getDefault());
        wgn.m41923c("SendInvChimeraActivity", "Registered broadcast receiver", new Object[0]);
        getApplicationContext().registerReceiver(this.f31323p, new IntentFilter("com.google.android.gms.family.invites"));
        if (this.f31320m == null) {
            allp a2 = allq.m61232a();
            a2.f73626a = 80;
            allq a3 = a2.mo40491a();
            rjy rjy = new rjy(this);
            rjy.mo24778a(this.f31311c);
            rjy.mo24780a(allr.f73629a, a3);
            rjo rjo = awbv.f94154a;
            awbt awbt = new awbt();
            awbt.f94148a = cdsw.m134870c() ^ true ? 1 : 0;
            rjy.mo24780a(rjo, awbt.mo51834a());
            rjy.mo24776a(this, this);
            this.f31320m = rjy.mo24784b();
        }
        allf allf = new allf();
        allf.f73618a = 0;
        allf.mo40485b();
        this.f31321n = allf.mo40484a();
        if (bundle != null) {
            this.f31319k = bundle.getInt("currentState");
            this.f31312d = bundle.getParcelableArrayList("selectedContacts");
            this.f31297E = bundle.getBoolean("selectionActivityLaunched");
            this.f31298F = bundle.getBoolean("permissionRecoveryLaunched");
            this.f31326s = bundle.getBoolean("creationFailed");
            this.f31327t = bundle.getParcelableArrayList("failedSendingContacts");
            this.f31332y = bundle.getInt("numInvitationsSentSuccessfully");
            this.f31333z = bundle.getInt("numInvitationsSendingFailures");
            this.f31293A = bundle.getInt("numInvited");
            this.f31294B = bundle.getBoolean("retried");
        } else {
            this.f31319k = 1;
            this.f31297E = false;
        }
        whp whp = new whp(this, this, getIntent().getBooleanExtra("disable-sms-invites", false));
        this.f31324q = whp;
        if (!this.f31298F) {
            whp.mo29106a(true);
            this.f31298F = true;
            return;
        }
        mo18414a(this.f31296D, this.f31295C);
    }

    public final void onDestroy() {
        wia wia = this.f31317i;
        if (wia != null) {
            wia.mo29115a(this.f31300H, 3);
        }
        wgn.m41923c("SendInvChimeraActivity", "Unregistered broadcast receiver", new Object[0]);
        getApplicationContext().unregisterReceiver(this.f31323p);
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("selectionActivityLaunched", this.f31297E);
        bundle.putBoolean("permissionRecoveryLaunched", this.f31298F);
        bundle.putInt("currentState", this.f31319k);
        bundle.putParcelableArrayList("selectedContacts", this.f31312d);
        bundle.putBoolean("creationFailed", this.f31326s);
        bundle.putParcelableArrayList("failedSendingContacts", this.f31327t);
        bundle.putInt("numInvitationsSentSuccessfully", this.f31332y);
        bundle.putInt("numInvitationsSendingFailures", this.f31333z);
        bundle.putInt("numInvited", this.f31293A);
        bundle.putBoolean("retried", this.f31294B);
    }

    /* renamed from: a */
    private final void m23163a(ViewGroup viewGroup, String str) {
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(C0126R.C0129id.fm_toolbar);
        toolbar.mo1679a(str);
        if (m23168j()) {
            toolbar.mo1680b(-16777216);
            toolbar.setBackgroundResource(17170443);
        }
    }

    /* renamed from: b */
    private final void m23166b(int i, boolean z) {
        Contact contact;
        ArrayList arrayList = this.f31312d;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                contact = null;
                break;
            }
            contact = (Contact) arrayList.get(i2);
            i2++;
            if (contact.f31285d == i) {
                break;
            }
        }
        if (contact == null) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Failed to find contact in array, contactId:");
            sb.append(i);
            wgn.m41925e("SendInvChimeraActivity", sb.toString(), new Object[0]);
            return;
        }
        int i3 = contact.f31291j;
        int i4 = 7;
        if (z) {
            i4 = i3 != 10 ? 11 : 12;
        } else if (i3 != 1) {
            if (i3 != 5) {
                if (!(i3 == 6 || i3 == 7)) {
                    if (i3 != 9) {
                        if (i3 != 10) {
                            return;
                        }
                    }
                }
                i4 = 14;
            }
            i4 = 13;
        }
        contact.f31291j = i4;
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("Updating state from: ");
        sb2.append(i3);
        sb2.append(" to: ");
        sb2.append(i4);
        wgn.m41923c("SendInvChimeraActivity", sb2.toString(), new Object[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
     arg types: [java.lang.String, java.lang.String]
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
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent} */
    /* renamed from: a */
    private static void m23164a(fut fut, ContactPickerOptionsData contactPickerOptionsData) {
        fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT", contactPickerOptionsData.f31445f);
        fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_GRID_HEADER_TEXT", contactPickerOptionsData.f31444e);
        fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_LIST_HEADER_TEXT", contactPickerOptionsData.f31443d);
        fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_HINT_TEXT", (CharSequence) contactPickerOptionsData.f31441b);
        fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT", (CharSequence) contactPickerOptionsData.f31442c);
        fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_TITLE", contactPickerOptionsData.f31440a);
    }

    /* renamed from: b */
    private final void m23167b(Contact contact, boolean z) {
        String valueOf = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
        sb.append("Scheduling task for updating status for: ");
        sb.append(valueOf);
        sb.append(" sendSuccess: ");
        sb.append(z);
        sb.toString();
        sbw sbw = wgn.f50624a;
        this.f31322o.initLoader(contact.f31285d + 10000, null, new whs(this, contact, z));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(com.google.android.gms.family.invites.Contact, boolean):void
     arg types: [com.google.android.gms.family.invites.Contact, int]
     candidates:
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(int, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(com.google.android.gms.family.invites.Contact, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(com.google.android.gms.family.invites.Contact, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(int, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18415b(Contact contact) {
        String valueOf = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Invitation sending failure received: ");
        sb.append(valueOf);
        sb.toString();
        sbw sbw = wgn.f50624a;
        this.f31333z++;
        this.f31327t.add(contact);
        if (!TextUtils.isEmpty(contact.f31287f)) {
            m23167b(contact, false);
            return;
        }
        m23166b(contact.f31285d, false);
        mo18420i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo18406a(int i) {
        whu whu;
        whu = (whu) this.f31325r.get(i, new whu());
        return whu.f50684a + whu.f50685b;
    }

    /* renamed from: a */
    public final void mo18407a() {
        mo18408a(0, this.f31293A);
    }

    /* renamed from: a */
    public final void mo18408a(int i, int i2) {
        Intent intent = new Intent();
        intent.putExtra("num-invitations-sent", i2);
        intent.putExtra("num-invitations-created", this.f31333z + this.f31332y);
        if (m23169k() && "agsa".equals(this.f31299G) && cdst.m134852c()) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("direct-add-contacts-list", new ArrayList(m23162a(new HashSet(Arrays.asList(15)))));
            intent.putExtras(bundle);
        }
        if (this.f31315g.mo29096a() != null) {
            intent.putExtra("consistencyToken", this.f31315g.mo29096a());
            intent.putExtra("tokenExpirationTimeSecs", this.f31315g.mo29098b());
        }
        setResult(i, intent);
        ArrayList arrayList = this.f31312d;
        if (arrayList != null && !arrayList.isEmpty()) {
            wia wia = this.f31317i;
            boolean z = this.f31300H;
            int i3 = this.f31301I;
            int i4 = this.f31302J;
            int i5 = this.f31303K;
            int i6 = this.f31304L;
            bxvd da = dcw.f12892g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            dcw dcw = (dcw) da.f164949b;
            dcw.f12895b = 3;
            int i7 = 1 | dcw.f12894a;
            dcw.f12894a = i7;
            int i8 = i7 | 2;
            dcw.f12894a = i8;
            dcw.f12896c = i3;
            int i9 = i8 | 4;
            dcw.f12894a = i9;
            dcw.f12897d = i4;
            int i10 = i9 | 8;
            dcw.f12894a = i10;
            dcw.f12898e = i5;
            dcw.f12894a = i10 | 16;
            dcw.f12899f = i6;
            dcw dcw2 = (dcw) da.mo74062i();
            if (z) {
                bxvd da2 = ddd.f12919d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ddd ddd = (ddd) da2.f164949b;
                dcw2.getClass();
                ddd.f12923c = dcw2;
                ddd.f12921a |= 2;
                wia.mo29113a((ddd) da2.mo74062i());
            } else {
                bxvd da3 = dcx.f12900d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                dcx dcx = (dcx) da3.f164949b;
                dcw2.getClass();
                dcx.f12904c = dcw2;
                dcx.f12902a |= 2;
                wia.mo29112a((dcx) da3.mo74062i());
            }
        }
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo18409a(int i, boolean z) {
        whu whu = (whu) this.f31325r.get(i, new whu());
        if (z) {
            whu.f50684a++;
        } else {
            whu.f50685b++;
        }
        this.f31325r.put(i, whu);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        wgm.m41915a(this, new whq(this)).show();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(android.view.ViewGroup, java.lang.String):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(fut, com.google.android.gms.family.v2.model.ContactPickerOptionsData):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(int, int):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(com.google.android.gms.family.invites.Contact, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(java.lang.String, int):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(boolean, boolean):void
      who.a(boolean, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(com.google.android.gms.family.invites.Contact, boolean):void
     arg types: [com.google.android.gms.family.invites.Contact, int]
     candidates:
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(int, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(com.google.android.gms.family.invites.Contact, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(com.google.android.gms.family.invites.Contact, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.b(int, boolean):void */
    /* renamed from: a */
    public final void mo18410a(Contact contact) {
        if (contact.mo18399b()) {
            mo18409a(contact.f31285d, true);
            if (mo18406a(contact.f31285d) >= contact.f31289h) {
                if (((whu) this.f31325r.get(contact.f31285d, new whu())).f50685b != 0) {
                    mo18415b(contact);
                    return;
                }
            } else {
                return;
            }
        }
        this.f31332y++;
        this.f31293A++;
        if (contact.mo18399b()) {
            this.f31303K++;
        } else {
            this.f31304L++;
        }
        if (contact.mo18399b()) {
            m23167b(contact, true);
            return;
        }
        m23166b(contact.f31285d, true);
        mo18420i();
    }

    /* renamed from: a */
    public final void mo18411a(Contact contact, boolean z) {
        String valueOf = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Invitation state updated for: ");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(z);
        sb.toString();
        sbw sbw = wgn.f50624a;
        m23166b(contact.f31285d, z);
        mo18420i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18412a(String str, int i) {
        int i2;
        this.f31332y = 0;
        this.f31333z = 0;
        ArrayList arrayList = this.f31312d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Contact contact = (Contact) arrayList.get(i3);
            int i4 = contact.f31291j;
            if (i4 == 1) {
                i2 = 3;
            } else if (i4 != 7) {
            } else {
                i2 = 4;
            }
            contact.f31291j = i2;
        }
        this.f31322o.initLoader(i, null, new whr(this, getIntent().getStringExtra("appId"), str));
    }

    /* renamed from: a */
    public final void mo18413a(List list) {
        int i;
        if (!list.isEmpty()) {
            sbw sbw = wgn.f50624a;
            this.f31326s = true;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Contact contact = (Contact) list.get(i2);
                String valueOf = String.valueOf(contact);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Invitation creation failed: ");
                sb.append(valueOf);
                wgn.m41922b("SendInvChimeraActivity", sb.toString(), new Object[0]);
                this.f31327t.add(contact);
                int i3 = contact.f31291j;
                if (i3 == 3) {
                    i = 7;
                } else if (i3 != 4) {
                } else {
                    i = 8;
                }
                contact.f31291j = i;
            }
            mo18420i();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
     arg types: [java.lang.String, java.lang.String]
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
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent} */
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
    public final void mo18414a(boolean z, boolean z2) {
        int i;
        Intent intent;
        int i2;
        int i3;
        this.f31296D = z;
        this.f31295C = z2;
        StringBuilder sb = new StringBuilder(39);
        sb.append("canReadContact: ");
        sb.append(z);
        sb.append(" canSendSms: ");
        sb.append(z2);
        wgn.m41922b("SendInvChimeraActivity", sb.toString(), new Object[0]);
        int i4 = this.f31319k;
        if (i4 != 1) {
            if (i4 == 2) {
                mo18416e();
            } else if (i4 == 3) {
                m23170l();
            } else if (i4 == 4) {
                mo18417g();
            }
        } else if (this.f31297E) {
        } else {
            if (cdsn.m134841b()) {
                this.f31297E = true;
                this.f31317i.mo29115a(this.f31300H, 10);
                this.f31309Q.f31449j = getIntent().getIntExtra("max-available-slots", 5);
                if (m23169k()) {
                    this.f31309Q.mo18549a(new int[]{0});
                } else if (this.f31295C) {
                    this.f31309Q.mo18549a(new int[]{0, 1});
                } else {
                    this.f31309Q.mo18549a(new int[]{0});
                }
                Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.contactpicker.ContactPickerActivity").putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", stm.m36299a(getIntent().getStringExtra("predefinedTheme"))).putExtra("contactPickerOptions", this.f31309Q);
                if (!cdst.m134852c() || !m23169k() || !this.f31299G.equals("agsa")) {
                    startActivityForResult(putExtra, 1);
                } else {
                    startActivityForResult(putExtra, 3);
                }
            } else {
                int intExtra = getIntent().getIntExtra("max-available-slots", 5);
                Resources resources = getResources();
                String stringExtra = getIntent().getStringExtra("sms-preview-text");
                TypedValue typedValue = new TypedValue();
                boolean resolveAttribute = getTheme().resolveAttribute(C0126R.attr.colorPrimary, typedValue, true);
                int parseColor = !resolveAttribute ? Color.parseColor("#1A73E8") : typedValue.data;
                if (!resolveAttribute) {
                    wgn.m41925e("SendInvChimeraActivity", "Primary color resolving failed for App Invite theming", new Object[0]);
                }
                TypedValue typedValue2 = new TypedValue();
                boolean resolveAttribute2 = getTheme().resolveAttribute(C0126R.attr.fmToolbarContentTint, typedValue2, true);
                if (resolveAttribute2) {
                    i = typedValue2.data;
                } else {
                    i = -1;
                }
                if (!resolveAttribute2) {
                    wgn.m41925e("SendInvChimeraActivity", "Toolbar text color resolving failed for App Invite theming", new Object[0]);
                }
                int parseColor2 = Color.parseColor("#0c000000");
                int parseColor3 = Color.parseColor("#42000000");
                if (!cdst.m134852c() || !m23169k() || !"agsa".equals(this.f31299G)) {
                    if (!m23168j()) {
                        i3 = resources.getColor(C0126R.color.fm_navbar_background);
                        i2 = Color.parseColor("#1A73E8");
                    } else {
                        i3 = parseColor;
                        i2 = i;
                        parseColor = -1;
                        i = -16777216;
                    }
                    fut fut = new fut();
                    fut.mo11361a(this.f31311c);
                    fut.mo11360a(i, parseColor);
                    fut.mo11358a();
                    fut.mo11365b(i3, parseColor2);
                    fut.mo11368c(i2, parseColor3);
                    boolean z3 = this.f31295C;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("email");
                    if (z3) {
                        arrayList.add("phone");
                    }
                    fut.mo11362a((String[]) arrayList.toArray(new String[arrayList.size()]));
                    fut.mo11363b();
                    fut.mo11369c("identityPeople");
                    fut.mo11367c();
                    fut.mo11359a(intExtra);
                    fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_MESSAGE", (CharSequence) stringExtra);
                    fut.mo11364b(qkj.m32287a(this, 2132018358));
                    if (cdst.f181659a.mo6606a().mo78260f() && cdsw.f181668a.mo6606a().mo78270h()) {
                        if (cdsw.f181668a.mo6606a().mo78269g() || !this.f31296D) {
                            fut.mo11366b("identityPeople");
                        } else {
                            fut.mo11366b("supplied");
                            sef.m35072a(whh.m41944a(this, this.f31295C), fut.f17305a, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_GRID_PEOPLE");
                        }
                        fut.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_DISPLAY_GRID_AS_A_LIST", true);
                    }
                    m23164a(fut, this.f31309Q);
                    intent = fut.f17305a;
                } else {
                    int color = resources.getColor(C0126R.color.fm_navbar_background);
                    int parseColor4 = Color.parseColor("#1A73E8");
                    fut fut2 = new fut();
                    fut2.mo11361a(this.f31311c);
                    fut2.mo11358a();
                    fut2.mo11360a(i, parseColor);
                    fut2.mo11365b(color, parseColor2);
                    fut2.mo11368c(parseColor4, parseColor3);
                    fut2.mo11362a(cdst.f181659a.mo6606a().mo78261g() ? new String[]{BuildConfig.FLAVOR_client, "google_no_icon"} : cdst.f181659a.mo6606a().mo78256b() ? new String[]{"email", "exclude_non_gaia"} : new String[]{BuildConfig.FLAVOR_client});
                    fut2.mo11363b();
                    fut2.mo11369c("identityPeople");
                    fut2.mo11367c();
                    fut2.mo11359a(intExtra);
                    fut2.mo11364b(qkj.m32287a(this, 2132018358));
                    m23164a(fut2, this.f31309Q);
                    intent = fut2.f17305a;
                }
                this.f31297E = true;
                wgn.m41923c("SendInvChimeraActivity", "Launching ContextualPeopleSelection activity.", new Object[0]);
                this.f31317i.mo29115a(this.f31300H, 10);
                if (!cdst.m134852c() || !m23169k() || !this.f31299G.equals("agsa")) {
                    startActivityForResult(intent, 1);
                } else {
                    startActivityForResult(intent, 3);
                }
            }
        }
    }
}
