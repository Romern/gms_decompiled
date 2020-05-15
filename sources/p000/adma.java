package p000;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: adma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adma extends adms {

    /* renamed from: a */
    public String f62143a;

    /* renamed from: b */
    public ArrayList f62144b;

    /* renamed from: c */
    public rjx f62145c;

    /* renamed from: g */
    private TextView f62146g;

    /* renamed from: h */
    private View f62147h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f62148i = false;

    /* renamed from: a */
    private final void m50812a() {
        Resources resources = getResources();
        String str = this.f62143a;
        if (str == null) {
            this.f62146g.setText(resources.getString(C0126R.string.opt_in_account_null_state));
            return;
        }
        this.f62146g.setText(str);
        this.f62146g.setContentDescription(resources.getString(C0126R.string.opt_in_account_content_description, this.f62143a));
    }

    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        this.f62144b = getArguments().getParcelableArrayList("eligibleAccounts");
        if (bundle != null) {
            this.f62143a = bundle.getString("authAccount");
        } else if (this.f62143a == null) {
            String string = getArguments().getString("defaultAccount");
            this.f62143a = ((Account) this.f62144b.get(0)).name;
            if (!TextUtils.isEmpty(string)) {
                ArrayList arrayList = this.f62144b;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (TextUtils.equals(((Account) arrayList.get(i2)).name, string)) {
                        this.f62143a = string;
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        this.f62145c = adee.m50255b(getActivity());
        TextView textView = (TextView) this.f62147h.findViewById(C0126R.C0129id.account_picker);
        this.f62146g = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.f62146g.setOnClickListener(new adlt(this));
        m50812a();
        boolean z = getArguments().getBoolean("lastChance", false);
        this.f62171d.mo33664a(C0126R.string.opt_in_confirm, new adlu(this));
        if (!z) {
            i = C0126R.string.common_not_now;
        } else {
            i = C0126R.string.common_no_thanks;
        }
        this.f62171d.mo33665b(i, new adlx(this, z));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            this.f62173f.mo33659a("OptInFragment.accountChosen");
            this.f62143a = intent.getStringExtra("authAccount");
            m50812a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f62147h = layoutInflater.inflate((int) C0126R.C0128layout.setup_opt_in_fragment, viewGroup, false);
        int i = Build.VERSION.SDK_INT;
        ((TextView) this.f62147h.findViewById(C0126R.C0129id.description)).setText((int) C0126R.string.opt_in_description_m_plus);
        TextView textView = (TextView) this.f62147h.findViewById(C0126R.C0129id.agreement);
        String a = adln.m50800a("https://play.google.com/about/play-terms.html", getResources().getString(C0126R.string.play_terms_of_service));
        String a2 = adln.m50800a("https://support.google.com/googleplay/?p=instant_apps", getResources().getString(C0126R.string.common_learn_more));
        textView.setText(Html.fromHtml(getResources().getString(C0126R.string.opt_in_agreement, a, a2)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return this.f62147h;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (!this.f62148i) {
            this.f62173f.mo33659a("OptInFragment.noSelection");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f62148i = true;
        String str = this.f62143a;
        if (str != null) {
            bundle.putString("authAccount", str);
        }
    }
}
