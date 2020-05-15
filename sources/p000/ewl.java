package p000;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;

/* renamed from: ewl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ewl extends ewo {

    /* renamed from: s */
    final RelativeLayout f15930s;

    /* renamed from: t */
    final /* synthetic */ ewn f15931t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ewl(ewn ewn, View view) {
        super(view);
        this.f15931t = ewn;
        this.f15930s = (RelativeLayout) view.findViewById(C0126R.C0129id.error_banner);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        SpannableString spannableString;
        if (ewj.mo10503a() == 1) {
            RelativeLayout relativeLayout = this.f15930s;
            evk evk = ((ewm) ewj).f15932a;
            TextView textView = (TextView) relativeLayout.findViewById(C0126R.C0129id.error_summary);
            FadeInImageView fadeInImageView = (FadeInImageView) relativeLayout.findViewById(C0126R.C0129id.error_image);
            ((TextView) relativeLayout.findViewById(C0126R.C0129id.error_title)).setText(evk.f15878a);
            if (TextUtils.isEmpty(evk.f15880c)) {
                spannableString = new SpannableString(evk.f15879b);
            } else {
                SpannableString spannableString2 = new SpannableString(evk.f15880c);
                spannableString2.setSpan(new ForegroundColorSpan(adyg.m51405b(this.f15931t.f15937i, C0126R.attr.colorPrimaryGoogle, C0126R.color.google_blue600)), 0, evk.f15880c.length(), 33);
                spannableString = spannableString2;
                if (!TextUtils.isEmpty(evk.f15879b)) {
                    spannableString = (Spanned) TextUtils.concat(evk.f15879b, " ", spannableString2);
                }
            }
            textView.setText(spannableString);
            if (evk.f15882e || evk.f15883f != null) {
                relativeLayout.setOnClickListener(new ewk(this, evk));
                relativeLayout.setClickable(true);
            } else {
                relativeLayout.setOnClickListener(null);
                relativeLayout.setClickable(false);
            }
            evi.m11184a(this.f15931t.f15938j, fadeInImageView, evk.mo10529a(), evk.f15881d);
            evd.m11165a(fadeInImageView, adyg.m51405b(relativeLayout.getContext(), C0126R.attr.colorOnSurfaceVariant, C0126R.color.google_grey700));
            this.f15930s.setFocusable(true);
        }
    }
}
