package p000;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.google.android.chimera.Activity;
import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

/* renamed from: owv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class owv implements Formattable {

    /* renamed from: a */
    final /* synthetic */ ovx f38531a;

    /* renamed from: b */
    final /* synthetic */ oww f38532b;

    public owv(oww oww, ovx ovx) {
        this.f38532b = oww;
        this.f38531a = ovx;
    }

    public final void formatTo(Formatter formatter, int i, int i2, int i3) {
        try {
            Appendable out = formatter.out();
            ovx ovx = this.f38531a;
            Activity activity = this.f38532b.f38541i.getActivity();
            int lineHeight = this.f38532b.f38538f.getLineHeight();
            Drawable drawable = activity.getDrawable(ovx.f38513a.f38508a);
            drawable.setBounds(0, 0, lineHeight, lineHeight);
            ImageSpan imageSpan = new ImageSpan(drawable);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(ovx.f38513a.f38509b, imageSpan, 33);
            out.append(spannableStringBuilder);
        } catch (IOException e) {
            bnsi b = owx.f38544a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("owv", "formatTo", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("IOException thrown by SpannableStringBuilder.append()");
        }
    }
}
