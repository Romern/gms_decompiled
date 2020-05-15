package p000;

import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class mnj extends Fragment {

    /* renamed from: b */
    public String f34039b;

    /* renamed from: b */
    private final void mo20180b() {
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20177a() {
    }

    /* renamed from: a */
    public final void mo20181a(GlifLayout glifLayout, int i) {
        glifLayout.mo71365c(i);
        getActivity().setTitle(i);
        mo20180b();
    }

    /* renamed from: a */
    public final void mo20182a(GlifLayout glifLayout, CharSequence charSequence) {
        glifLayout.mo71363a(charSequence);
        getActivity().setTitle(charSequence);
        mo20180b();
    }

    /* renamed from: a */
    public final void mo20183a(String str) {
        this.f34039b = str;
        if (isAdded()) {
            mo20177a();
        }
    }
}
