package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingChimeraSettings;

/* renamed from: aukk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukk extends dns {

    /* renamed from: c */
    public static final aunx f91980c = new aunx("TrustAgent", "CheckTrustAgentStartedFragment");

    /* renamed from: d */
    final /* synthetic */ GoogleTrustAgentPersonalUnlockingChimeraSettings f91981d;

    /* renamed from: e */
    private final aukj f91982e = new aukj(this);

    public aukk() {
    }

    /* renamed from: c */
    public final void mo9322c() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.auth_trustagent_check_if_started, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        if (getLoaderManager().getLoader(0) == null) {
            getLoaderManager().initLoader(0, new Bundle(), this.f91982e);
        } else {
            getLoaderManager().restartLoader(0, new Bundle(), this.f91982e);
        }
    }

    public aukk(GoogleTrustAgentPersonalUnlockingChimeraSettings googleTrustAgentPersonalUnlockingChimeraSettings) {
        this.f91981d = googleTrustAgentPersonalUnlockingChimeraSettings;
    }
}
