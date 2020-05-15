package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: awzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzr extends bkch {

    /* renamed from: a */
    public static final /* synthetic */ int f95435a = 0;

    /* renamed from: a */
    private final Button m81793a(int i, String str, int i2) {
        Button button = (Button) this.f123991c.findViewById(i);
        if (!TextUtils.isEmpty(str)) {
            button.setVisibility(0);
            button.setText(str);
            button.setOnClickListener(new awzq(this, i2));
        }
        return button;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo52907b() {
        return C0126R.C0128layout.wallet_view_confirmation_dialog_text;
    }

    public final void onStart() {
        super.onStart();
        TextView textView = (TextView) this.f123991c.findViewById(C0126R.C0129id.title);
        if (textView != null) {
            textView.setSingleLine(false);
            textView.setLineSpacing(getResources().getDimension(C0126R.dimen.wallet_confirmation_dialog_line_spacing_extra), 1.0f);
        }
    }

    /* renamed from: a */
    public static awzr m81794a(bmde bmde) {
        awzr awzr = new awzr();
        int a = bmdd.m107914a(bmde.f128791j);
        if (a != 0 && a != 1) {
            throw new IllegalArgumentException("ConfirmationDialogFragment should only be used for DEFAULT display type");
        } else if (bmde.f128787f.size() == 0 && (bmde.f128782a & 16) == 0) {
            throw new IllegalArgumentException("At least one message or extra warning text must be provided.");
        } else if (!bmde.f128789h.isEmpty() || !bmde.f128790i.isEmpty()) {
            Bundle bundle = new Bundle();
            bjvp.m104736a(bundle, "argDialogProto", bmde);
            awzr.setArguments(bundle);
            return awzr;
        } else {
            throw new IllegalArgumentException("At least one button must be provided.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.content.Context, android.widget.Button):void
     arg types: [com.google.android.chimera.Activity, android.widget.Button]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.content.Context, android.widget.Button):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Dialog mo9306a() {
        if (!chfz.f188577a.mo6606a().mo85206a()) {
            TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(new int[]{C0126R.attr.alertDialogTheme});
            int resourceId = obtainStyledAttributes.getResourceId(0, C0126R.style.Theme_Wallet_Material_Light_Alert_Dialog);
            obtainStyledAttributes.recycle();
            this.f123991c = new C1374te(getActivity(), resourceId);
            this.f123991c.setContentView((int) C0126R.C0128layout.wallet_fragment_confirmation_dialog);
            this.f123991c.setTitle(this.f123990b.f128786e);
            mo65835a((LinearLayout) this.f123991c.findViewById(C0126R.C0129id.dialog_message_container), LayoutInflater.from(getActivity()));
            Button a = m81793a((int) C0126R.C0129id.cancel_button, this.f123990b.f128790i, 2);
            Button a2 = m81793a((int) C0126R.C0129id.confirm_button, this.f123990b.f128789h, 1);
            int i = Build.VERSION.SDK_INT;
            a.setTextColor(bkfr.m105542a(getActivity(), (int) C0126R.attr.colorAccent));
            bkfr.m105560a((Context) getActivity(), a2);
            return this.f123991c;
        }
        LayoutInflater from = LayoutInflater.from(getActivity());
        View inflate = from.inflate((int) C0126R.C0128layout.wallet_fragment_confirmation_dialog, (ViewGroup) null);
        mo65835a((LinearLayout) inflate.findViewById(C0126R.C0129id.dialog_message_container), from);
        bkbj bkbj = new bkbj(getActivity());
        bkbj.mo65780a(this.f123990b.f128786e);
        bkbj.mo65783b(inflate);
        bkbj.mo65784b(this.f123990b.f128789h, this);
        bkbj.mo65781a(this.f123990b.f128790i, this);
        this.f123991c = (C1374te) bkbj.mo65776a();
        this.f123991c.setOnShowListener(this);
        return this.f123991c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo52906a(LinearLayout linearLayout, LayoutInflater layoutInflater, bmnr bmnr) {
        LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_confirmation_dialog_text_with_image, (ViewGroup) linearLayout, false);
        InfoMessageView infoMessageView = (InfoMessageView) linearLayout2.findViewById(C0126R.C0129id.info_message_text);
        infoMessageView.mo72002a((bkdw) this);
        infoMessageView.mo72003a(bmnr);
        infoMessageView.setId(this.f123994f.mo65614a());
        ((ImageWithCaptionView) linearLayout2.findViewById(C0126R.C0129id.info_message_image)).mo71992a((bmno) bmnr.f130157c.get(0), bjvn.m104721b(getActivity().getApplicationContext()), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
        return linearLayout2;
    }
}
