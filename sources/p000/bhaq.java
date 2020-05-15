package p000;

import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.location.settings.LocationSettingsCheckerChimeraActivity;
import java.util.List;

/* renamed from: bhaq */
final /* synthetic */ class bhaq implements View.OnClickListener {

    /* renamed from: a */
    private final LocationSettingsCheckerChimeraActivity f118204a;

    /* renamed from: b */
    private final SpannableString f118205b;

    /* renamed from: c */
    private final ImageSpan f118206c;

    /* renamed from: d */
    private final TextView f118207d;

    /* renamed from: e */
    private final LinearLayout f118208e;

    /* renamed from: f */
    private final List f118209f;

    /* renamed from: g */
    private final View f118210g;

    public bhaq(LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity, SpannableString spannableString, ImageSpan imageSpan, TextView textView, LinearLayout linearLayout, List list, View view) {
        this.f118204a = locationSettingsCheckerChimeraActivity;
        this.f118205b = spannableString;
        this.f118206c = imageSpan;
        this.f118207d = textView;
        this.f118208e = linearLayout;
        this.f118209f = list;
        this.f118210g = view;
    }

    public void onClick(View view) {
        LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity = this.f118204a;
        SpannableString spannableString = this.f118205b;
        ImageSpan imageSpan = this.f118206c;
        TextView textView = this.f118207d;
        LinearLayout linearLayout = this.f118208e;
        List list = this.f118209f;
        View view2 = this.f118210g;
        locationSettingsCheckerChimeraActivity.mo70948a(spannableString, imageSpan, textView, linearLayout, list);
        LocationSettingsCheckerChimeraActivity.m117378a(view2);
    }
}
