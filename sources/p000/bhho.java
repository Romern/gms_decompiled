package p000;

import android.os.Build;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* renamed from: bhho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhho extends acm {

    /* renamed from: s */
    final TextView f118680s;

    /* renamed from: t */
    final MaterialCalendarGridView f118681t;

    public bhho(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(C0126R.C0129id.month_title);
        this.f118680s = textView;
        int i = C1280ps.f26840a;
        Boolean bool = true;
        int i2 = Build.VERSION.SDK_INT;
        textView.setAccessibilityHeading(bool.booleanValue());
        this.f118681t = (MaterialCalendarGridView) linearLayout.findViewById(C0126R.C0129id.month_grid);
        if (!z) {
            this.f118680s.setVisibility(8);
        }
    }
}
