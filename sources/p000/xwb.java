package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Fragment;
import com.google.android.gms.fido.fido2.p044ui.PolluxChimeraActivity;
import com.google.android.material.chip.Chip;

/* renamed from: xwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xwb extends Fragment implements View.OnClickListener {

    /* renamed from: c */
    public static final Logger f53263c = new Logger(new String[]{"PolluxNoFragment"}, (short[]) null);

    /* renamed from: a */
    public String f53264a;

    /* renamed from: b */
    public boolean f53265b;

    /* renamed from: d */
    private PolluxChimeraActivity f53266d;

    /* renamed from: a */
    public static final void m43495a(View view) {
        ScrollView scrollView = (ScrollView) view.findViewById(C0126R.C0129id.fido_paask_scrollview);
        if (scrollView != null) {
            int i = 0;
            if (scrollView.getChildAt(0).getBottom() - 100 <= scrollView.getHeight() + scrollView.getScrollY()) {
                i = 8;
            }
            view.findViewById(C0126R.C0129id.fido_paask_footer_top).setVisibility(i);
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.fido_paask_change_password_button) {
            PolluxChimeraActivity polluxChimeraActivity = this.f53266d;
            polluxChimeraActivity.f31867f = 6;
            Intent putExtra = new Intent().setPackage("com.google.android.gms").putExtra("extra.screenId", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE).putExtra("extra.accountName", polluxChimeraActivity.f31862a);
            if (cbro.m128210n()) {
                putExtra.setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").putExtra("extra.utmSource", "fido2");
            } else {
                putExtra.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
            }
            polluxChimeraActivity.f31864c.mo30194a(polluxChimeraActivity.f31865d, xaj.TYPE_USER_VISITS_ACCOUNT_SETTINGS);
            polluxChimeraActivity.startActivityForResult(putExtra, 0);
            return;
        }
        f53263c.mo25418e("View %d is not handled in onClick", Integer.valueOf(view.getId()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        PolluxChimeraActivity polluxChimeraActivity = (PolluxChimeraActivity) getActivity();
        sdo.m34959a(polluxChimeraActivity);
        this.f53266d = polluxChimeraActivity;
        if (this.f53265b) {
            view = layoutInflater.inflate((int) C0126R.C0128layout.paask_approval_prompt_no_for_strongbox, viewGroup, false);
        } else {
            view = layoutInflater.inflate((int) C0126R.C0128layout.paask_approval_prompt_no, viewGroup, false);
        }
        view.findViewById(C0126R.C0129id.fido_paask_change_password_button).setOnClickListener(this);
        xvj.m43484a(this.f53266d, this.f53264a, (Chip) view.findViewById(C0126R.C0129id.fido_paask_user));
        ScrollView scrollView = (ScrollView) view.findViewById(C0126R.C0129id.fido_paask_scrollview);
        if (scrollView != null) {
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new xvz(view));
            Looper.myQueue().addIdleHandler(new xwa(view));
        }
        return view;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getText(C0126R.string.fido_paask_header));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }
}
