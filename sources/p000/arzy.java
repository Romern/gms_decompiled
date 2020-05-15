package p000;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: arzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arzy extends Fragment implements arzj {

    /* renamed from: a */
    public static final Logger f88554a = ascp.m73787a("Setup", "UI", "SelectAccountFragment");

    /* renamed from: b */
    public arzw f88555b;

    /* renamed from: c */
    public boolean f88556c;

    /* renamed from: d */
    public GlifLayout f88557d;

    /* renamed from: e */
    public List f88558e;

    /* renamed from: f */
    public Set f88559f = new HashSet();

    /* renamed from: g */
    public Set f88560g = new HashSet();

    /* renamed from: h */
    public Set f88561h = new HashSet();

    /* renamed from: i */
    public boolean f88562i = false;

    /* renamed from: j */
    public aqzm f88563j = aqzm.UNKNOWN;

    /* renamed from: k */
    public boolean f88564k = false;

    /* renamed from: l */
    public boolean f88565l = false;

    /* renamed from: m */
    private boolean f88566m;

    /* renamed from: n */
    private String f88567n;

    /* renamed from: o */
    private boolean f88568o;

    /* renamed from: p */
    private arzk f88569p;

    /* renamed from: q */
    private arwj f88570q;

    /* renamed from: r */
    private arzu f88571r;

    /* renamed from: a */
    public static arzy m73719a(String str, boolean z, boolean z2, aqzm aqzm) {
        arzy arzy = new arzy();
        Bundle bundle = new Bundle();
        bundle.putBoolean("smartdevice.accountRequired", true);
        bundle.putString("smartdevice.title", str);
        bundle.putBoolean("isMagicWand", z);
        bundle.putBoolean("singleAccount", z2);
        bundle.putString("device_type", aqzm.name());
        arzy.setArguments(bundle);
        return arzy;
    }

    /* renamed from: b */
    public final void mo48984b() {
        arzv arzv;
        boolean z;
        int count = this.f88571r.getCount();
        for (int i = 0; i < this.f88558e.size(); i++) {
            Account account = (Account) this.f88558e.get(i);
            Logger Logger = f88554a;
            String valueOf = String.valueOf(account.name);
            Logger.mo25412b(valueOf.length() == 0 ? new String("Display account ") : "Display account ".concat(valueOf), new Object[0]);
            if (count > 0) {
                arzv = (arzv) this.f88571r.getItem(i);
            } else {
                arzv = new arzv();
            }
            arzv.f88544a = account.name;
            arzk arzk = this.f88569p;
            String str = account.name;
            ascu.m73796a();
            arzv.f88545b = (String) arzk.f88523a.get(str);
            arzk arzk2 = this.f88569p;
            String str2 = account.name;
            ascu.m73796a();
            arzv.f88546c = (Bitmap) arzk2.f88524b.get(str2);
            if (!cgou.m146378c() || this.f88563j != aqzm.AUTO || !this.f88559f.contains(account)) {
                z = false;
            } else {
                z = true;
            }
            arzv.f88547d = z;
            if (count <= 0) {
                this.f88571r.add(arzv);
            }
        }
        this.f88571r.notifyDataSetChanged();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88555b = (arzw) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement SelectAccountFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f88564k = bundle.getBoolean("smartdevice.selectAccountFragment.accountSelected", false);
            this.f88565l = bundle.getBoolean("smartdevice.selectAccountFragment.triedToSelectUnsupported", false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88566m = arguments.getBoolean("smartdevice.accountRequired", false);
            this.f88563j = aqzm.m72294a(arguments.getString("device_type"));
            this.f88567n = arguments.getString("smartdevice.title", getString(C0126R.string.common_choose_account_label));
            this.f88556c = arguments.getBoolean("isMagicWand", false);
            this.f88568o = arguments.getBoolean("singleAccount", false);
        }
        if (getActivity() != null) {
            this.f88569p = new arzk();
        }
        Context context = getContext();
        sdo.m34959a(context);
        this.f88570q = new arwj(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = this.f88556c;
        int i = C0126R.C0128layout.smartdevice_account_list;
        if (z) {
            i = this.f88568o ? C0126R.C0128layout.magicwand_account_confirmation : C0126R.C0128layout.magicwand_account_list;
        } else if (cgou.m146380e() && this.f88563j == aqzm.AUTO) {
            i = C0126R.C0128layout.smartdevice_account_list_v2;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i, viewGroup, false);
        this.f88557d = glifLayout;
        if (this.f88556c && this.f88568o) {
            biyo biyo = new biyo(this.f88557d.getContext());
            biyo.mo64883a(C0126R.string.common_sign_in);
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            ((biyn) glifLayout.mo71342a(biyn.class)).mo52733a(biyo.mo64882a());
        }
        return this.f88557d;
    }

    public final void onPause() {
        arzk arzk = this.f88569p;
        ascu.m73796a();
        arzk.f88525c.remove(this);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        arzk arzk = this.f88569p;
        Context context = getContext();
        sdo.m34959a(context);
        allp allp = new allp();
        allp.f73626a = 80;
        allq a = allp.mo40491a();
        rjx rjx = new rjx(context, a, (byte[]) null);
        rjx rjx2 = new rjx(context, a);
        alkx alkx = new alkx();
        alkx.f73614c = 1;
        rjx2.mo24710a(alkx).mo9458a(new arzg(arzk, rjx));
        arzk arzk2 = this.f88569p;
        ascu.m73796a();
        arzk2.f88525c.add(this);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("smartdevice.selectAccountFragment.accountSelected", this.f88564k);
        bundle.putBoolean("smartdevice.selectAccountFragment.triedToSelectUnsupported", this.f88565l);
    }

    public final void onStop() {
        Activity activity;
        f88554a.mo25412b("onStop", new Object[0]);
        if (!cgrh.m146741b() && (activity = getActivity()) != null && !activity.isChangingConfigurations() && !this.f88564k) {
            f88554a.mo25412b("User is leaving select account screen", new Object[0]);
            this.f88555b.mo48979b(mo48983a((Account) null));
        }
        super.onStop();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.ListView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f88557d.mo71363a(this.f88567n);
        Activity activity = getActivity();
        if (activity != null) {
            this.f88558e = asbt.m73759a(activity);
            boolean e = cgou.m146380e();
            int i = C0126R.C0128layout.smartdevice_account_list_item;
            if (e && this.f88563j == aqzm.AUTO) {
                i = C0126R.C0128layout.smartdevice_account_list_item_v2;
            }
            this.f88571r = new arzu(activity, i);
            ListView listView = (ListView) view.findViewById(C0126R.C0129id.account_list);
            listView.setAdapter((ListAdapter) this.f88571r);
            if (!cgou.m146380e() || this.f88563j != aqzm.AUTO) {
                listView.setDivider(null);
            } else {
                TextView textView = (TextView) view.findViewById(C0126R.C0129id.message);
                if (textView != null) {
                    textView.setText(getResources().getString(C0126R.string.smartdevice_auto_selectaccount_description));
                    textView.setVisibility(0);
                }
            }
            if (this.f88556c && this.f88568o) {
                ((biyn) this.f88557d.mo71342a(biyn.class)).f122314f.f122336f = new arzm(this);
            } else {
                listView.setOnItemClickListener(new arzn(this));
            }
            if (cgou.m146377b() && this.f88563j == aqzm.AUTO) {
                View inflate = activity.getLayoutInflater().inflate((int) C0126R.C0128layout.smartdevice_account_list_add_account_footer, (ViewGroup) listView, false);
                ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(getString(C0126R.string.smartdevice_use_another_account));
                inflate.setOnClickListener(new arzo(this));
                listView.addFooterView(inflate);
            }
            if (!this.f88566m) {
                View inflate2 = activity.getLayoutInflater().inflate((int) C0126R.C0128layout.smartdevice_account_list_footer, (ViewGroup) listView, false);
                inflate2.setOnClickListener(new arzt(this));
                listView.addFooterView(inflate2);
            }
            if (!cgou.m146378c() || this.f88563j != aqzm.AUTO) {
                mo48984b();
                return;
            }
            this.f88562i = true;
            bqgg a = bqga.m112773a(m73720a("service_HOSTED"), cgou.m146381f(), TimeUnit.MILLISECONDS, snp.m35703a(1, 9));
            bqgg a2 = bqga.m112773a(m73720a("service_usm"), cgou.m146381f(), TimeUnit.MILLISECONDS, snp.m35703a(1, 9));
            bqga.m112783b(a, a2).mo69215a(new arzp(this, a, a2), bqfb.INSTANCE).mo741a(new arzq(this), bqfb.INSTANCE);
        }
    }

    /* renamed from: a */
    private final bqgg m73720a(String str) {
        arwj arwj = this.f88570q;
        List list = this.f88558e;
        HashMap a = bnmt.m109795a(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) list.get(i);
            a.put(account, arwj.mo48874a(account, str));
        }
        return bqga.m112782b(a.values()).mo69216a(new arzr(a, str), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final arzx mo48983a(Account account) {
        return new arzx(account, this.f88558e.size(), this.f88560g.size(), this.f88561h.size(), this.f88565l, false);
    }

    /* renamed from: a */
    public final void mo48967a() {
        if (!cgou.m146378c() || !this.f88562i) {
            mo48984b();
        } else {
            f88554a.mo25412b("Waiting on unsupported accounts to be populated", new Object[0]);
        }
    }
}
