package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: agum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agum extends dnw {

    /* renamed from: a */
    public final Activity f66578a;

    /* renamed from: b */
    public boolean f66579b = false;

    /* renamed from: c */
    public final int f66580c;

    /* renamed from: d */
    private final Intent f66581d;

    /* renamed from: e */
    private agug f66582e;

    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    public agum() {
        Activity activity = getActivity();
        this.f66578a = activity;
        Intent intent = activity.getIntent();
        this.f66581d = intent;
        this.f66580c = intent.getIntExtra("EventFlowId", agrl.m54949c());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1341rz aW;
        String str;
        agrl a = agrl.m54942a();
        Intent intent = this.f66581d;
        if (intent == null || !"com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY".equals(intent.getAction())) {
            Intent intent2 = this.f66581d;
            if (intent2 != null) {
                str = intent2.getStringExtra("ComeFrom");
            } else {
                str = null;
            }
            if (str == null) {
                ComponentName callingActivity = this.f66578a.getCallingActivity();
                if (callingActivity != null) {
                    str = callingActivity.flattenToString();
                } else {
                    int i = Build.VERSION.SDK_INT;
                    Uri referrer = this.f66578a.getReferrer();
                    if (referrer != null) {
                        str = referrer.toString();
                    }
                }
                a.mo35987a(68, str, "R.layout.settings_fragment", bygd.ENTER_SETTINGS_VIA_OTHER, System.currentTimeMillis(), Integer.valueOf(this.f66580c));
            } else if (str.equals("com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity")) {
                this.f66579b = true;
                a.mo35987a(62, str, "R.layout.settings_fragment", bygd.ENTER_SETTINGS_VIA_MDP, System.currentTimeMillis(), Integer.valueOf(this.f66580c));
            } else {
                a.mo35987a(68, str, "R.layout.settings_fragment", bygd.ENTER_SETTINGS_VIA_OTHER, System.currentTimeMillis(), Integer.valueOf(this.f66580c));
            }
        } else {
            a.mo35990a(this.f66581d, boox.NOTIFICATION_ACTION_TAKEN, "MDP_UiAction", bygd.NOTIFICATION_ACTION_TAKEN);
            a.mo35990a(this.f66581d, boox.JUMP_TO_SETTINGS, "MDP_UiAction", bygd.JUMP_TO_SETTINGS);
            a.mo35987a(63, "com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY", "R.layout.settings_fragment", bygd.ENTER_SETTINGS_VIA_NOTIFICATION, System.currentTimeMillis(), Integer.valueOf(this.f66580c));
        }
        Activity activity = this.f66578a;
        if ((activity instanceof deu) && (aW = ((deu) activity).mo8628aW()) != null) {
            aW.mo15855c((int) C0126R.string.common_settings);
        }
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.settings_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.settings_recyclerview);
        recyclerView.setLayoutManager(new aah());
        agug agug = new agug();
        this.f66582e = agug;
        recyclerView.setAdapter(agug);
        if (cfmj.m140160i()) {
            this.f66582e.mo36116a(new agyi(getString(C0126R.string.common_notifications)));
        } else {
            this.f66582e.mo36116a(new agxw(getString(C0126R.string.common_notifications)));
        }
        agvg[] values = agvg.values();
        for (agvg agvg : values) {
            if (agvg.mo36129a()) {
                this.f66582e.mo36116a(new agyc(agvg.f66645l, getString(agvg.f66646m), getString(agvg.f66647n)));
            }
        }
        agpk a2 = agpk.m54726a();
        if (agpk.m54727d() && cfmj.m140160i()) {
            bygb a3 = bygb.m124774a(a2.mo35843c().f165204f);
            if (a3 == null) {
                a3 = bygb.UNRECOGNIZED;
            }
            if (a3 != bygb.OPT_OUT) {
                this.f66582e.mo36116a(new agyh(new agul(this)));
                a2.mo35828a(bygb.OPT_IN, "CLIENT_MdpUx");
            }
        }
        return inflate;
    }

    public agum(Activity activity, Intent intent) {
        this.f66578a = activity;
        this.f66581d = intent;
        this.f66580c = intent.getIntExtra("EventFlowId", agrl.m54949c());
    }
}
