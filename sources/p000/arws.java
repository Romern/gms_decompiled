package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;
import java.util.ArrayList;

/* renamed from: arws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arws extends Fragment {

    /* renamed from: a */
    public ArrayList f88375a;

    /* renamed from: b */
    public String f88376b;

    /* renamed from: c */
    public C1350sh f88377c;

    /* renamed from: d */
    public AccountChallengeWebView f88378d;

    /* renamed from: e */
    arwo f88379e;

    /* renamed from: f */
    private int f88380f;

    /* renamed from: a */
    public static arws m73628a(ArrayList arrayList, String str) {
        arws arws = new arws();
        arws.setArguments(m73629b(arrayList, str));
        return arws;
    }

    /* renamed from: b */
    public static Bundle m73629b(ArrayList arrayList, String str) {
        sdo.m34959a(arrayList);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accounts", arrayList);
        bundle.putString("restoreAccount", str);
        return bundle;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(getActivity() instanceof arwr)) {
            throw new RuntimeException("Parent activity should implement AccountChallengeFragment.Listener");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88375a = arguments.getParcelableArrayList("accounts");
            this.f88376b = arguments.getString("restoreAccount");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_account_challenge_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("accounts", this.f88375a);
    }

    public final void onStart() {
        super.onStart();
        Activity activity = getActivity();
        if (activity != null) {
            this.f88380f = activity.getRequestedOrientation();
            activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
        }
    }

    public final void onStop() {
        super.onStop();
        Activity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.f88380f);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        this.f88379e = new arwo(this);
        AccountChallengeWebView accountChallengeWebView = (AccountChallengeWebView) view.findViewById(C0126R.C0129id.account_challenge_webview);
        this.f88378d = accountChallengeWebView;
        accountChallengeWebView.f108255o = this.f88379e;
        String a = stn.m36304a("setupwizard.theme", "");
        boolean z2 = true;
        accountChallengeWebView.f108254n = !"glif".equals(a) ? "glif_light".equals(a) : true;
        AccountChallengeWebView accountChallengeWebView2 = this.f88378d;
        accountChallengeWebView2.f108245e = true;
        ArrayList arrayList = this.f88375a;
        if (accountChallengeWebView2.f108244d == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Cannot call AccountChallengeWebView#startChallenges more than once.");
        sdo.m34966a(arrayList, "accounts cannot be null.");
        accountChallengeWebView2.f108244d = arrayList;
        accountChallengeWebView2.f108249i = 0;
        accountChallengeWebView2.f108251k = null;
        if (arrayList.size() <= 0) {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "Must have at least one account.");
        accountChallengeWebView2.f108247g = accountChallengeWebView2.f108244d.size();
        accountChallengeWebView2.post(new asbd(accountChallengeWebView2));
        Activity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setSoftInputMode(16);
            if (!this.f88378d.mo59174a()) {
                Window window = activity.getWindow();
                int i = Build.VERSION.SDK_INT;
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                view.setSystemUiVisibility(1024);
                view.requestApplyInsets();
            }
        }
    }

    /* renamed from: a */
    public final void mo48886a(CharSequence charSequence) {
        Activity activity = getActivity();
        if (activity != null && activity.getContainerActivity() != null) {
            asbr.m73757a(activity.getContainerActivity(), charSequence);
        }
    }
}
