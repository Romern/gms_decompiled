package p000;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: avhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avhq extends DialogFragment {

    /* renamed from: a */
    public static final srn f93185a = srn.m36124a();

    /* renamed from: b */
    protected boolean f93186b = false;

    /* renamed from: a */
    public static avhq m78519a(FragmentManager fragmentManager) {
        try {
            return (avhq) fragmentManager.findFragmentByTag("UdcDialog");
        } catch (ClassCastException e) {
            bnsl bnsl = (bnsl) f93185a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avhq", "a", 33, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error finding dialog fragment");
            return null;
        }
    }

    /* renamed from: a */
    public abstract View mo51236a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        if (bundle != null) {
            this.f93186b = bundle.getBoolean("UdcShownAsDialog", this.f93186b);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.f93186b) {
            return mo51236a(layoutInflater, viewGroup);
        }
        return null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f93186b) {
            bundle.putBoolean("UdcShownAsDialog", true);
        }
    }

    public final int show(FragmentTransaction fragmentTransaction, String str) {
        this.f93186b = true;
        return super.show(fragmentTransaction, str);
    }

    public final void show(FragmentManager fragmentManager, String str) {
        this.f93186b = true;
        super.show(fragmentManager, str);
    }

    /* renamed from: a */
    protected static void m78520a(View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) view.findViewById(i);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(Html.fromHtml(charSequence.toString()));
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
