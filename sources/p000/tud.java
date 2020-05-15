package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.chromesync.ChromeSyncState;

/* renamed from: tud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tud extends tuv {

    /* renamed from: c */
    private static final srn f46672c = srn.m36127a(sgj.CREDENTIAL_MANAGER);

    /* renamed from: a */
    public tsf f46673a;

    /* renamed from: b */
    public tsh f46674b;

    /* renamed from: d */
    private tsb f46675d;

    /* renamed from: a */
    public static tql m37483a(C0034at atVar) {
        if (atVar.mo2448b() != null) {
            return tql.m37363a(((tql) atVar.mo2448b()).mo26737c(), null, ((tql) atVar.mo2448b()).mo26736b());
        }
        return null;
    }

    /* renamed from: b */
    public final void mo26805b() {
        if (((tsw) getChildFragmentManager().findFragmentByTag("password_list_fragment_tag_on_home")) == null) {
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.password_list_container, tsw.m37457a(getArguments().getString("pwm.DataFieldNames.accountName"), false), "password_list_fragment_tag_on_home").commitNow();
        }
    }

    /* renamed from: bq */
    public final boolean mo26806bq() {
        return true;
    }

    /* renamed from: c */
    public final void mo26807c() {
        this.f46673a.mo26759c().mo2445a(this, new tub(this));
    }

    /* renamed from: d */
    public final void mo26808d() {
        ((tsa) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsa.class)).mo26752a().mo2445a(this, new tuc(this));
    }

    /* renamed from: e */
    public final boolean mo26809e() {
        tsb tsb;
        if (!cdpu.m134637b() || (tsb = this.f46675d) == null || tsb.mo26753a().mo2448b() == null || ((tql) this.f46675d.mo26753a().mo2448b()).mo26735a() == null || ((ChromeSyncState) ((tql) this.f46675d.mo26753a().mo2448b()).mo26735a()).f30011b != 4) {
            return true;
        }
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (cdpu.m134637b() && i == 12345) {
            if (getView() != null) {
                m37485a(true, getView());
            }
            this.f46673a.mo26758b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void
     arg types: [int, int]
     candidates:
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(int, int):android.view.animation.Animation
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, boolean):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_home_screen, viewGroup, false);
        if (cdpx.m134644b()) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) getActivity().findViewById(C0126R.C0129id.main_swipe_refresh_layout);
            swipeRefreshLayout.mo2091a(false, tvc.m37515a(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED));
            swipeRefreshLayout.f1697a = new ttt(this);
            inflate.findViewById(C0126R.C0129id.progress_bar).setVisibility(8);
        }
        tuw.m37506a((TextView) inflate.findViewById(C0126R.C0129id.home_screen_description), C0126R.string.pwm_page_description, tuw.f46703a);
        inflate.findViewById(C0126R.C0129id.homescreen_settings_card).setOnClickListener(new ttu(this));
        inflate.findViewById(C0126R.C0129id.home_screen_settings_button).setOnClickListener(new ttv(this));
        inflate.findViewById(C0126R.C0129id.checkup_card_button).setOnClickListener(new ttw(this));
        C0060br a = adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName")));
        this.f46673a = (tsf) a.mo3444a(tsf.class);
        this.f46674b = (tsh) a.mo3444a(tsh.class);
        this.f46675d = (tsb) a.mo3444a(tsb.class);
        inflate.findViewById(C0126R.C0129id.search_passwords_card).setOnClickListener(new ttx(this));
        if (this.f46673a.mo26759c().mo2448b() == null || ((tql) this.f46673a.mo26759c().mo2448b()).mo26735a() == null || this.f46674b.mo26762a().mo2448b() == null || ((tql) this.f46674b.mo26762a().mo2448b()).mo26735a() == null) {
            m37485a(true, inflate);
            tsr tsr = (tsr) getChildFragmentManager().findFragmentByTag("custom_passphrase_fragment_tag");
            if (tsr == null) {
                String string = getArguments().getString("pwm.DataFieldNames.accountName");
                tsr = new tsr();
                Bundle bundle2 = new Bundle();
                bundle2.putString("pwm.DataFieldNames.accountName", string);
                tsr.setArguments(bundle2);
                getChildFragmentManager().beginTransaction().add(tsr, "custom_passphrase_fragment_tag").commitNow();
            } else {
                z = true;
            }
            tsr.f46604b.mo2444a(this);
            tsr.f46604b.mo2445a(this, new tty(this));
            if (!z) {
                tqr tqr = tsr.f46603a.f46574a;
                tqr.f46511b.mo2450b(tql.m37366d());
                aucb i = tqr.f46510a.mo24750i();
                i.mo50373a(new tqm(tqr));
                i.mo50372a(new tqn(tqr));
            }
        } else {
            m37485a(false, inflate);
            mo26805b();
            mo26807c();
            mo26808d();
        }
        return inflate;
    }

    @SafeVarargs
    /* renamed from: a */
    public static tql m37484a(tql... tqlArr) {
        for (int i = 0; i < 2; i++) {
            tql tql = tqlArr[i];
            if (tql != null && tql.mo26737c() == 3) {
                return tql.m37364a(tql.mo26736b());
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            tql tql2 = tqlArr[i2];
            if (tql2 != null && tql2.mo26737c() == 2) {
                return tql.m37366d();
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            tql tql3 = tqlArr[i3];
            if (tql3 != null && tql3.mo26737c() == 1) {
                return tql.m37365a((Object) null);
            }
        }
        throw new IllegalStateException("Progress merging should never happen on null objects only.");
    }

    /* renamed from: a */
    private final void m37485a(boolean z, View view) {
        int i = 0;
        if (cdpx.m134644b()) {
            ((SwipeRefreshLayout) getActivity().findViewById(C0126R.C0129id.main_swipe_refresh_layout)).mo2090a(z);
        } else {
            view.findViewById(C0126R.C0129id.progress_bar).setVisibility(!z ? 8 : 0);
        }
        if (z) {
            i = 8;
        }
        view.findViewById(C0126R.C0129id.home_screen_settings_button).setVisibility(i);
        view.findViewById(C0126R.C0129id.homescreen_settings_card).setVisibility(8);
        if (cdpu.m134637b()) {
            view.findViewById(C0126R.C0129id.search_passwords_card).setVisibility(i);
            view.findViewById(C0126R.C0129id.password_list_container).setVisibility(i);
            if (mo26809e()) {
                view.findViewById(C0126R.C0129id.checkup_card).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo26804a(tql tql) {
        int c = tql.mo26737c();
        if (c == 0) {
            throw null;
        } else if (c == 3) {
            Exception b = tql.mo26736b();
            if (b != null) {
                if (!(b instanceof rjp) || ((rjp) b).mo24655a() != 7) {
                    bnsl bnsl = (bnsl) f46672c.mo68388c();
                    bnsl.mo68437a(b);
                    bnsl.mo68405a("An unknown error occurred");
                    Toast.makeText(getContext(), (int) C0126R.string.common_something_went_wrong, 0).show();
                } else {
                    bnsl bnsl2 = (bnsl) f46672c.mo68388c();
                    bnsl2.mo68437a(b);
                    bnsl2.mo68405a("A network error occurred");
                    Toast.makeText(getContext(), (int) C0126R.string.common_no_network, 0).show();
                }
                getActivity().finish();
            }
        } else {
            int c2 = tql.mo26737c();
            if (c2 == 0) {
                throw null;
            } else if (c2 == 1) {
                m37485a(false, getView());
            }
        }
    }
}
