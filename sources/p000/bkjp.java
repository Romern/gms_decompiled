package p000;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.CallbackListenerScrollView;

/* renamed from: bkjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjp extends bkbq implements View.OnClickListener, bkbu {

    /* renamed from: a */
    private CallbackListenerScrollView f124439a;

    /* renamed from: b */
    private View f124440b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final TextView m106039a(String str, int i) {
        TextView textView = (TextView) mo65816c().inflate((int) C0126R.C0128layout.view_updatable_cart_dialog_cart_item, (ViewGroup) this.f124440b.findViewById(C0126R.C0129id.updatable_cart_items_container), false);
        textView.setGravity(8388613);
        textView.setText(str);
        C1334rs.m20104a(textView, i);
        return textView;
    }

    /* renamed from: ad */
    public final void mo52871ad() {
    }

    /* renamed from: e */
    public final void mo52893e(boolean z) {
        int i = !z ? 8 : 0;
        this.f124440b.findViewById(C0126R.C0129id.updatable_cart_top_divider).setVisibility(i);
        this.f124440b.findViewById(C0126R.C0129id.updatable_cart_bottom_divider).setVisibility(i);
    }

    /* renamed from: f */
    public final void mo52894f(int i) {
    }

    public void onClick(View view) {
        dismiss();
    }

    /* renamed from: a */
    public final Dialog mo9306a() {
        bmel bmel = (bmel) bjvp.m104730a(getArguments(), "argDialogProto", (bxxk) bmel.f128957f.mo74142c(7));
        bkbj bkbj = new bkbj(mo65815b());
        View inflate = mo65816c().inflate((int) C0126R.C0128layout.view_updatable_cart_dialog_title, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.updatable_cart_dialog_title);
        bmei bmei = bmel.f128962d;
        if (bmei == null) {
            bmei = bmei.f128941d;
        }
        bmeh bmeh = bmei.f128945c;
        if (bmeh == null) {
            bmeh = bmeh.f128936c;
        }
        textView.setText(bmeh.f128938a);
        bkbj.mo65779a(inflate);
        View inflate2 = mo65816c().inflate((int) C0126R.C0128layout.view_updatable_cart_dialog, (ViewGroup) null);
        this.f124440b = inflate2;
        bkbj.mo65783b(inflate2);
        GridLayout gridLayout = (GridLayout) this.f124440b.findViewById(C0126R.C0129id.updatable_cart_items_container);
        int size = bmel.f128961c.size() - 1;
        for (int i = 0; i < size; i++) {
            gridLayout.addView(m106039a(((bmek) bmel.f128961c.get(i)).f128955b, C0126R.style.UicDisplayTypeDetailText));
            gridLayout.addView(m106039a(((bmek) bmel.f128961c.get(i)).f128956c, C0126R.style.UicDisplayTypeDefaultText));
        }
        if (size >= 0) {
            gridLayout.addView(m106039a(((bmek) bmel.f128961c.get(size)).f128955b, C0126R.style.UicDisplayTypeEmphasisText));
            gridLayout.addView(m106039a(((bmek) bmel.f128961c.get(size)).f128956c, C0126R.style.UicDisplayTypeEmphasisText));
        }
        CallbackListenerScrollView callbackListenerScrollView = (CallbackListenerScrollView) this.f124440b.findViewById(C0126R.C0129id.updatable_cart_items_scroll_view);
        this.f124439a = callbackListenerScrollView;
        callbackListenerScrollView.f151920p = this;
        Button button = (Button) this.f124440b.findViewById(C0126R.C0129id.updatable_cart_dialog_button);
        bmei bmei2 = bmel.f128962d;
        if (bmei2 == null) {
            bmei2 = bmei.f128941d;
        }
        bmeh bmeh2 = bmei2.f128945c;
        if (bmeh2 == null) {
            bmeh2 = bmeh.f128936c;
        }
        String str = bmeh2.f128939b;
        if (!TextUtils.isEmpty(str)) {
            button.setVisibility(0);
            button.setText(str);
            button.setOnClickListener(this);
        }
        return bkbj.mo65776a();
    }
}
