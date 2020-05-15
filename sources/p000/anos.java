package p000;

import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anos extends aonn {

    /* renamed from: a */
    final /* synthetic */ anpb f77327a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anos(anpb anpb, rtp rtp) {
        super(rtp);
        this.f77327a = anpb;
    }

    /* renamed from: a */
    public final int mo11412a(int i) {
        return this.f77327a.f77361f;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo42056a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        char c;
        anps anps;
        int i;
        alzj alzj = (alzj) obj;
        anpb anpb = this.f77327a;
        if (!anpb.f77375t) {
            return anpb.mo42039a(alzj, view, viewGroup, z);
        }
        if (!anpb.m64913a(alzj, (alzj) anpb.f77378w.mo11416b(0))) {
            aonl aonl = this.f77327a.f77378w;
            c = anpb.m64913a(alzj, (alzj) aonl.mo11416b(aonl.mo42055d() + -1)) ? (char) 2 : 0;
        } else {
            c = 1;
        }
        anpb anpb2 = this.f77327a;
        if (view == null) {
            anps = new anps(anpb2.f78589M);
        } else {
            anps = (anps) view;
        }
        if (c == 0) {
            i = (int) anpb2.f77376u.getResources().getDimension(C0126R.dimen.plus_audience_selection_list_update_item_height);
        } else {
            i = (int) anpb2.f77376u.getResources().getDimension(C0126R.dimen.plus_audience_selection_list_update_item_height_extra);
        }
        int dimension = c == 1 ? (int) anpb2.f77376u.getResources().getDimension(C0126R.dimen.plus_audience_selection_list_update_item_padding_extra) : 0;
        int dimension2 = c == 2 ? (int) anpb2.f77376u.getResources().getDimension(C0126R.dimen.plus_audience_selection_list_update_item_padding_extra) : 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
        RelativeLayout relativeLayout = (RelativeLayout) anps.findViewById(C0126R.C0129id.audience_selection_update_circle_view);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setPadding(0, dimension, 0, dimension2);
        int i2 = Build.VERSION.SDK_INT;
        anps.mo42095a();
        anps.f77417d = alzj;
        String d = alzj.mo41057d();
        int h = alzj.mo41060h();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder(11);
        sb.append(h);
        String sb2 = sb.toString();
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(new ForegroundColorSpan(anps.getResources().getColor(C0126R.color.plus_audience_selection_update_text_light_color)), 0, sb2.length(), 0);
        if (!anps.f77423c) {
            spannableStringBuilder.append((CharSequence) d);
            if (h > 0) {
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            anps.f77421a.setGravity(19);
        } else {
            if (h > 0) {
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) d);
            anps.f77421a.setGravity(21);
        }
        anps.f77421a.setText(spannableStringBuilder);
        anps.setChecked(anpb2.f77367l.f77451a.f30287b.contains(sfh.m35161a(alzj)));
        anps.f77419f = anpb2;
        View.OnClickListener onClickListener = anpb2.f77360e;
        if (onClickListener == null) {
            return anps;
        }
        anps.f77422b = onClickListener;
        return anps;
    }
}
