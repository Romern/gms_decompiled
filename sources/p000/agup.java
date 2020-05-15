package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.p055ui.PurchaseDialogFragment$URLSpanMediumNoUnderline;

/* renamed from: agup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agup extends DialogFragment {

    /* renamed from: i */
    public static final Typeface f66587i = Typeface.create("sans-serif-medium", 0);

    /* renamed from: j */
    public static final srn f66588j = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public View.OnClickListener f66589a;

    /* renamed from: b */
    public View.OnClickListener f66590b;

    /* renamed from: c */
    public Context f66591c;

    /* renamed from: d */
    public MdpUpsellPlan f66592d;

    /* renamed from: e */
    public agtw f66593e;

    /* renamed from: f */
    public String f66594f;

    /* renamed from: g */
    public Button f66595g;

    /* renamed from: h */
    public Button f66596h;

    /* renamed from: a */
    private static Spannable m55145a(Spanned spanned) {
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = newSpannable.getSpanStart(uRLSpan);
            int spanEnd = newSpannable.getSpanEnd(uRLSpan);
            newSpannable.removeSpan(uRLSpan);
            newSpannable.setSpan(new PurchaseDialogFragment$URLSpanMediumNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return newSpannable;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        agug agug;
        View view;
        RecyclerView recyclerView;
        Spanned spanned;
        String str;
        int i = Build.VERSION.SDK_INT;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C0126R.style.MdpPurchaseDialog);
        if (cfnm.m140640k()) {
            View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.purchase_dialog_fragment, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.title_text_static);
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.price_text_static);
            if (agqg.m54838E().booleanValue()) {
                textView2.setTextColor(C1133kh.m17843b(this.f66591c, C0126R.color.google_blue_500));
            }
            textView.setText(this.f66592d.f80233b);
            textView2.setText(this.f66594f);
            view = inflate;
            recyclerView = null;
            agug = null;
        } else {
            recyclerView = new RecyclerView(this.f66591c);
            recyclerView.setLayoutManager(new aah());
            agug = new agug();
            recyclerView.setAdapter(agug);
            agug.mo36116a(new agye(this.f66592d.f80233b, this.f66594f, C0126R.color.google_blue_500));
            view = null;
        }
        String str2 = this.f66593e.f66545q;
        if (str2 == null) {
            str2 = agqg.m54851f();
        }
        if (agqg.m54838E().booleanValue()) {
            spanned = agze.m55328a(String.valueOf(this.f66592d.f80241j).concat(" "), str2);
        } else {
            spanned = agze.m55327a(String.format("%s %s", this.f66592d.f80241j, str2));
        }
        if (!TextUtils.isEmpty(this.f66593e.f66544p)) {
            str = this.f66593e.f66544p;
        } else {
            str = agqg.m54852g();
        }
        Spanned a = agze.m55327a(str);
        if (cfnm.m140640k()) {
            TextView textView3 = (TextView) view.findViewById(C0126R.C0129id.primary_text_static);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView4 = (TextView) view.findViewById(C0126R.C0129id.secondary_text_static);
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setText(m55145a(spanned));
            textView4.setText(m55145a(a));
            builder.setView(view);
        } else {
            agug.mo36116a(new agyd(spanned, a));
            builder.setView(recyclerView);
        }
        spanned.toString();
        a.toString();
        builder.setPositiveButton((int) C0126R.string.purchase_dialog_buy, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton((int) C0126R.string.dialog_cancel, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.setOnShowListener(new agun(this, create));
        return create;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException e) {
        }
    }
}
