package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.fido.fido2.p044ui.PolluxChimeraActivity;
import com.google.android.material.chip.Chip;

/* renamed from: xvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvy extends Fragment implements View.OnClickListener {

    /* renamed from: d */
    private static final sek f53257d = new sek(new String[]{"PolluxApprovalPromptFragment"}, (short[]) null);

    /* renamed from: a */
    private PolluxChimeraActivity f53258a;

    /* renamed from: b */
    private boolean f53259b;

    /* renamed from: c */
    private String f53260c;

    /* renamed from: a */
    public static xvy m43493a(boolean z, String str) {
        xvy xvy = new xvy();
        xvy.f53259b = z;
        xvy.f53260c = str;
        return xvy;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.fido_paask_yes_button) {
            this.f53258a.mo18791a();
        } else if (view.getId() == C0126R.C0129id.fido_paask_no_button) {
            PolluxChimeraActivity polluxChimeraActivity = this.f53258a;
            polluxChimeraActivity.f31864c.mo30194a(polluxChimeraActivity.f31865d, xaj.TYPE_USER_DENIES_AUTHENTICATION);
            polluxChimeraActivity.f31867f = 5;
            Bundle bundle = new Bundle();
            bundle.putBoolean("UserApprovalExtra", false);
            polluxChimeraActivity.f31863b.send(-1, bundle);
            polluxChimeraActivity.f31864c.mo30194a(polluxChimeraActivity.f31865d, xaj.TYPE_USER_SHOWN_AUTHENTICATION_DENIED_VIEW);
            String str = polluxChimeraActivity.f31862a;
            boolean z = polluxChimeraActivity.f31866e;
            xwb xwb = new xwb();
            xwb.f53264a = str;
            xwb.f53265b = z;
            polluxChimeraActivity.mo18792a(xwb);
        } else {
            f53257d.mo25418e("View %d is not handled in onClick", Integer.valueOf(view.getId()));
        }
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
        this.f53258a = polluxChimeraActivity;
        int i = 0;
        if (this.f53259b) {
            view = layoutInflater.inflate((int) C0126R.C0128layout.paask_approval_prompt_for_strongbox, viewGroup, false);
            int identifier = this.f53258a.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = getResources().getDimensionPixelSize(identifier) - ((int) cdxk.f181871a.mo6606a().mo78418b());
            }
            long c = cdxk.f181871a.mo6606a().mo78419c();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.findViewById(C0126R.C0129id.top_layout).getLayoutParams());
            layoutParams.height = ((int) c) - i;
            view.findViewById(C0126R.C0129id.top_layout).setLayoutParams(layoutParams);
            view.findViewById(C0126R.C0129id.fido_paask_vol_down_complete).setTranslationY((float) ((int) cdxk.f181871a.mo6606a().mo78417a()));
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) ((ImageView) view.findViewById(C0126R.C0129id.vol_down_indicator)).getDrawable();
            animatedVectorDrawable.registerAnimationCallback(new xvx());
            animatedVectorDrawable.start();
        } else {
            view = layoutInflater.inflate((int) C0126R.C0128layout.paask_approval_prompt, viewGroup, false);
            view.findViewById(C0126R.C0129id.fido_paask_yes_button).setOnClickListener(this);
        }
        view.findViewById(C0126R.C0129id.fido_paask_no_button).setOnClickListener(this);
        xvj.m43484a(this.f53258a, this.f53260c, (Chip) view.findViewById(C0126R.C0129id.fido_paask_user));
        ScrollView scrollView = (ScrollView) view.findViewById(C0126R.C0129id.fido_paask_scrollview);
        if (scrollView != null) {
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new xvv(view));
            Looper.myQueue().addIdleHandler(new xvw(view));
        }
        return view;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getText(C0126R.string.fido_paask_header));
        getActivity().getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    /* renamed from: a */
    public static final void m43494a(View view) {
        ScrollView scrollView = (ScrollView) view.findViewById(C0126R.C0129id.fido_paask_scrollview);
        if (scrollView != null) {
            int i = 0;
            if (scrollView.getChildAt(0).getBottom() - 100 <= scrollView.getHeight() + scrollView.getScrollY()) {
                i = 8;
            }
            view.findViewById(C0126R.C0129id.fido_paask_footer_top).setVisibility(i);
        }
    }
}
