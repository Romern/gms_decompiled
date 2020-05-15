package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ezr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ezr extends fca {

    /* renamed from: a */
    public fdz f16118a;

    /* renamed from: b */
    public SwipeRefreshLayout f16119b;

    /* renamed from: c */
    public fgt f16120c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10583a(bsul bsul) {
        return (bsul.f147144a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    /* renamed from: aU */
    public final bsxn mo10584aU() {
        return ((fck) this.f16118a.f16353a).f16277a;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9) {
            fdz fdz = this.f16118a;
            fdz.f16354b.mo10680a(((fck) fdz.f16353a).f16277a);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        fdy a = fdy.m11537a(epr.m10932d(getArguments().getByteArray("screenKey")));
        ffg c = ((ffh) getActivity()).mo6340c();
        this.f16118a = new fdz(a, c.f16446a, c.f16447b);
        this.f16120c = ((eyn) activity).mo6339b().mo10587c();
        this.f16118a.f16356d.mo2445a(this, new ezn(this));
        this.f16118a.f16355c.mo2445a(this, new ezo(this));
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
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_message_screen_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.swipe_refresh_layout);
        this.f16119b = swipeRefreshLayout;
        adyg.m51403a(swipeRefreshLayout, eot.f15436a, 16842801);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f16119b;
        fdz fdz = this.f16118a;
        fdz.getClass();
        swipeRefreshLayout2.f1697a = new ezp(fdz);
        SwipeRefreshLayout swipeRefreshLayout3 = this.f16119b;
        swipeRefreshLayout3.mo2091a(true, swipeRefreshLayout3.f1705i);
        return inflate;
    }
}
