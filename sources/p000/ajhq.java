package p000;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: ajhq */
final /* synthetic */ class ajhq implements aubw {

    /* renamed from: a */
    private final ConsentsChimeraActivity f70672a;

    public ajhq(ConsentsChimeraActivity consentsChimeraActivity) {
        this.f70672a = consentsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ConsentsChimeraActivity consentsChimeraActivity = this.f70672a;
        ajvr ajvr = (ajvr) obj;
        if (!consentsChimeraActivity.f70619g) {
            TransitionManager.beginDelayedTransition((ViewGroup) consentsChimeraActivity.findViewById(16908290));
        }
        consentsChimeraActivity.f80833i.setVisibility(8);
        consentsChimeraActivity.f80838n.setText(ajvr.f71375a);
        ajic ajic = new ajic(consentsChimeraActivity, ajvr);
        String str = ajvr.f71376b;
        String string = consentsChimeraActivity.getString(C0126R.string.sharing_consents_link_learn_more);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
        sb.append(str);
        sb.append(" ");
        sb.append(string);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(ajic, ajvr.f71376b.length() + 1, spannableString.length(), 33);
        consentsChimeraActivity.f80839o.setText(spannableString);
        consentsChimeraActivity.f80839o.setMovementMethod(LinkMovementMethod.getInstance());
        consentsChimeraActivity.f80840p.setText(ajvr.f71377c);
        consentsChimeraActivity.f80842r.setText(ajvr.f71380f);
        consentsChimeraActivity.f80843s.setText(ajvr.f71379e);
        consentsChimeraActivity.f80841q.setVisibility(8);
        consentsChimeraActivity.f80834j.setVisibility(0);
        consentsChimeraActivity.f80838n.setVisibility(0);
        consentsChimeraActivity.f80839o.setVisibility(0);
        consentsChimeraActivity.f80840p.setVisibility(0);
        consentsChimeraActivity.f80842r.setVisibility(0);
        consentsChimeraActivity.f80843s.setVisibility(0);
    }
}
