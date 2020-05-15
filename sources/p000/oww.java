package p000;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.Formatter;

/* renamed from: oww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oww {

    /* renamed from: a */
    public final String f38533a;

    /* renamed from: b */
    public final ovx f38534b;

    /* renamed from: c */
    public final ImageView f38535c;

    /* renamed from: d */
    public final ProgressBar f38536d;

    /* renamed from: e */
    public final ImageView f38537e;

    /* renamed from: f */
    public final TextView f38538f;

    /* renamed from: g */
    public final TextView f38539g;

    /* renamed from: h */
    public boolean f38540h;

    /* renamed from: i */
    final /* synthetic */ owx f38541i;

    /* renamed from: j */
    private final TextView f38542j;

    /* renamed from: k */
    private final ImageView f38543k;

    /* JADX INFO: additional move instructions added (1) to help type inference */
    public oww(owx owx, oxy oxy, ovx ovx, ViewGroup viewGroup) {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        this.f38541i = owx;
        this.f38533a = oxy.f38589b;
        this.f38534b = ovx;
        this.f38535c = (ImageView) viewGroup.findViewById(C0126R.C0129id.app_icon);
        int i = oxy.f38591d;
        if (i != 0) {
            this.f38535c.setImageResource(i);
        } else {
            this.f38535c.setImageResource(C0126R.C0127drawable.car_frx_generic_app);
            this.f38540h = true;
        }
        this.f38537e = (ImageView) viewGroup.findViewById(C0126R.C0129id.app_icon_overlay);
        this.f38542j = (TextView) viewGroup.findViewById(C0126R.C0129id.title);
        int i2 = oxy.f38590c;
        if (i2 != 0) {
            this.f38542j.setText(i2);
        } else if (!TextUtils.isEmpty(oxy.f38592e)) {
            this.f38542j.setText(oxy.f38592e);
        } else {
            this.f38542j.setText(oxy.f38589b);
        }
        this.f38536d = (ProgressBar) viewGroup.findViewById(C0126R.C0129id.progress_bar);
        this.f38538f = (TextView) viewGroup.findViewById(C0126R.C0129id.subtitle_1);
        CharSequence charSequence2 = "";
        if (ovx != null) {
            owv owv = new owv(this, ovx);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            Formatter formatter = new Formatter(spannableStringBuilder2);
            String string = this.f38541i.getActivity().getString(C0126R.string.car_app_rating_string);
            Object[] objArr = new Object[3];
            objArr[0] = oxy.f38593f;
            objArr[1] = owv;
            Activity activity = this.f38541i.getActivity();
            int i3 = ovx.f38513a.f38510c;
            if (i3 != 0) {
                charSequence = activity.getString(i3);
            } else {
                charSequence = charSequence2;
            }
            objArr[2] = charSequence;
            formatter.format(string, objArr);
            spannableStringBuilder = spannableStringBuilder2;
        } else {
            spannableStringBuilder = charSequence2;
        }
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            this.f38538f.setVisibility(0);
            this.f38538f.setText(spannableStringBuilder);
        }
        TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.subtitle_2);
        this.f38539g = textView;
        textView.setText(ovx != null ? ovx.mo22710a(owx.getActivity()) : charSequence2);
        this.f38543k = (ImageView) viewGroup.findViewById(C0126R.C0129id.app_info_button);
        if (ccui.f179964a.mo6606a().mo76820d()) {
            this.f38543k.setVisibility(0);
            this.f38543k.setOnClickListener(new owu(this));
        }
    }
}
