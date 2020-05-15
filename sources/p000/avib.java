package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;

/* renamed from: avib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avib extends avia implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: m */
    private ScrollViewWithEvents f93208m;

    /* renamed from: a */
    private final void m78542a(int i) {
        View findViewById;
        if (getActivity() != null && (findViewById = getActivity().findViewById(C0126R.C0129id.udc_consent_button_bar_divider)) != null) {
            findViewById.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo51250a() {
        return C0126R.C0128layout.udc_consent_fragment_glif_v2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51258c() {
        if (this.f93206k || this.f93208m.mo17935a()) {
            super.mo51258c();
            return;
        }
        this.f93204i.mo51291a(this.f93205j);
        this.f93208m.pageScroll(130);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ScrollViewWithEvents scrollViewWithEvents = (ScrollViewWithEvents) onCreateView.findViewById(C0126R.C0129id.udc_consent_scroll_view);
        this.f93208m = scrollViewWithEvents;
        scrollViewWithEvents.getViewTreeObserver().addOnGlobalLayoutListener(this);
        return onCreateView;
    }

    public final void onGlobalLayout() {
        m78542a(!this.f93208m.mo17935a() ? 0 : 8);
    }

    /* renamed from: a */
    public final void mo26132a(ScrollView scrollView, boolean z) {
        super.mo26132a(scrollView, z);
        m78542a(!z ? 0 : 8);
    }
}
