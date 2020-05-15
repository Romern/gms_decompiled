package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.p037ui.LinkSpan;
import com.google.android.gms.trustlet.onbody.discovery.ScreenLockFocusedPromotionComponent$1;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService;

/* renamed from: auvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auvn implements auut {

    /* renamed from: a */
    public static final /* synthetic */ int f92608a = 0;

    /* renamed from: b */
    private static final IntentFilter f92609b = new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED");

    /* renamed from: c */
    private BroadcastReceiver f92610c = null;

    /* renamed from: d */
    private boolean f92611d;

    /* renamed from: e */
    private final auus f92612e;

    /* renamed from: f */
    private final Context f92613f;

    public auvn(Context context, auus auus) {
        this.f92612e = auus;
        this.f92613f = context;
    }

    /* renamed from: a */
    public final View mo50951a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate((int) C0126R.xml.screenlock_focused_onbody_promotion_intro, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.onbody_promotion_desc_complete_screenlock)).setText(String.format("%s, %s", this.f92613f.getString(C0126R.string.onbody_promotion_phone_safer_detail), this.f92613f.getString(C0126R.string.onbody_promotion_phone_safer_detail_mention_smartlock)));
        this.f92610c = new ScreenLockFocusedPromotionComponent$1(this, "trustlet_onbody", inflate);
        aki.m919a(this.f92613f).mo873a(this.f92610c, f92609b);
        mo50976b(inflate);
        return inflate;
    }

    /* renamed from: b */
    public final void mo50954b() {
        if (!this.f92611d) {
            this.f92612e.mo50947d();
            this.f92612e.mo50949f();
            return;
        }
        this.f92612e.mo50945b();
    }

    /* renamed from: c */
    public final void mo50955c() {
        this.f92612e.mo50946c();
    }

    /* renamed from: d */
    public final void mo50956d() {
        this.f92612e.mo50947d();
        this.f92612e.mo50949f();
    }

    /* renamed from: e */
    public final void mo50957e() {
        if (this.f92610c != null) {
            aki.m919a(this.f92613f).mo872a(this.f92610c);
            this.f92610c = null;
        }
    }

    /* renamed from: f */
    public final String mo50958f() {
        return this.f92613f.getString(C0126R.string.onbody_promotion_summary);
    }

    /* renamed from: g */
    public final String mo50959g() {
        return this.f92613f.getString(C0126R.string.onbody_promotion_desc_smartlock_allset_title);
    }

    /* renamed from: h */
    public final String mo50960h() {
        return this.f92613f.getString(C0126R.string.onbody_promotion_phone_safer_detail);
    }

    /* renamed from: i */
    public final String mo50961i() {
        return this.f92613f.getString(C0126R.string.onbody_promotion_other_trustlets);
    }

    /* renamed from: b */
    public final void mo50976b(View view) {
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.onbody_promotion_desc);
        textView.setText((int) C0126R.string.onbody_detection_desc);
        LinkSpan.m22734a(textView, "onbody_learn_more");
        ((TextView) view.findViewById(C0126R.C0129id.onbody_promotion_more_desc)).setVisibility(8);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.onbody_promotion_folder_icon);
        imageView.setImageResource(C0126R.C0127drawable.quantum_ic_keyboard_arrow_down_grey600_36);
        imageView.setOnClickListener(new auvm(this, view));
    }

    /* renamed from: a */
    public final void mo50952a() {
        boolean g = this.f92612e.mo50950g();
        this.f92611d = g;
        if (g) {
            this.f92612e.mo50946c();
        } else {
            this.f92612e.mo50945b();
        }
    }

    /* renamed from: a */
    public final void mo50975a(View view) {
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.onbody_promotion_desc);
        SpannableString spannableString = new SpannableString(textView.getText());
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableString.setSpan(new RelativeSizeSpan(0.0f), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(spannableString);
        ((TextView) view.findViewById(C0126R.C0129id.onbody_promotion_more_desc)).setVisibility(0);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.onbody_promotion_folder_icon);
        imageView.setImageResource(C0126R.C0127drawable.quantum_ic_keyboard_arrow_up_grey600_36);
        imageView.setOnClickListener(new auvl(this, view));
    }

    /* renamed from: a */
    public final void mo50953a(boolean z) {
        if (!z || !PhonePositionTrustletChimeraService.m93537a(this.f92613f) || PhonePositionTrustletChimeraService.m93538a(this.f92613f.getSharedPreferences("coffee_preferences", 4))) {
            this.f92612e.mo50948e();
        } else {
            this.f92612e.mo50944a();
        }
    }
}
