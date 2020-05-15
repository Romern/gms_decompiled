package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aayu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayu extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    TextView f56847a;

    /* renamed from: b */
    HelpChimeraActivity f56848b;

    /* renamed from: c */
    public aasm f56849c;

    /* renamed from: d */
    boolean f56850d = false;

    /* renamed from: a */
    static final void m47298a(HelpChimeraActivity helpChimeraActivity, int i, String str, String str2) {
        abcx.m47473a(helpChimeraActivity, i, str, 0, str2);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f56848b = (HelpChimeraActivity) getActivity();
        mo31915a();
    }

    public void onClick(View view) {
        this.f56848b.mo43351m();
        m47298a(this.f56848b, 30, this.f56849c.f56497g, "");
        abgx.m47704a(this.f56848b, this.f56849c, 30, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.gh_browse_all_articles_button, viewGroup, false);
        this.f56847a = (TextView) inflate.findViewById(C0126R.C0129id.gh_browse_all_articles_title);
        return inflate;
    }

    /* renamed from: a */
    private final void m47299a(boolean z) {
        if (getActivity() != null) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (z) {
                beginTransaction.show(this);
            } else {
                beginTransaction.hide(this);
            }
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public final void mo31915a() {
        aasm aasm;
        HelpChimeraActivity helpChimeraActivity = this.f56848b;
        if (helpChimeraActivity != null) {
            HelpConfig helpConfig = helpChimeraActivity.f56986y;
            String v = helpConfig.mo43247v();
            aasm aasm2 = this.f56849c;
            if (aasm2 == null || !aasm2.f56497g.equals(v)) {
                if (!TextUtils.isEmpty(v)) {
                    aasm = aasm.m46882a(v, aasw.m46952a(), helpConfig);
                } else {
                    aasm = null;
                }
                this.f56849c = aasm;
                if (aasm != null) {
                    m47299a(true);
                    this.f56847a.setOnClickListener(this);
                    if (!this.f56848b.f56986y.mo43252z() && this.f56850d) {
                        m47298a(this.f56848b, 27, this.f56849c.f56497g, "");
                        return;
                    }
                    return;
                }
                m47299a(false);
            } else if (!this.f56848b.f56986y.mo43252z() && this.f56850d) {
                m47298a(this.f56848b, 27, this.f56849c.f56497g, "");
            }
        }
    }
}
