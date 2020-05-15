package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: aqua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqua {

    /* renamed from: a */
    public final Context f86803a;

    /* renamed from: b */
    public final String f86804b;

    /* renamed from: c */
    public final Activity f86805c;

    /* renamed from: d */
    public final tim f86806d;

    /* renamed from: e */
    private final BaseCardView f86807e;

    /* renamed from: f */
    private final bzjh f86808f;

    /* renamed from: g */
    private final tie f86809g;

    /* renamed from: h */
    private int f86810h = 300;

    public aqua(Activity activity, Context context, BaseCardView baseCardView, bzjh bzjh, tie tie, String str, tim tim) {
        this.f86805c = activity;
        this.f86807e = baseCardView;
        this.f86803a = context;
        this.f86808f = bzjh;
        this.f86809g = tie;
        this.f86804b = str;
        this.f86806d = tim;
        if (bzjh.f170286a.size() != 0) {
            baseCardView.mo59007a((int) C0126R.string.profile_people_common_title);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f86803a).inflate((int) C0126R.C0128layout.related_people_row, (ViewGroup) null);
            int childCount = linearLayout.getChildCount();
            int i = childCount + childCount;
            int i2 = 0;
            while (i2 < i && i2 < this.f86808f.f170286a.size()) {
                if (i2 == childCount) {
                    this.f86807e.mo59009a(linearLayout);
                    linearLayout = (LinearLayout) LayoutInflater.from(this.f86803a).inflate((int) C0126R.C0128layout.related_people_row, (ViewGroup) null);
                }
                View childAt = linearLayout.getChildAt(i2 % childCount);
                bzjj bzjj = (bzjj) this.f86808f.f170286a.get(i2);
                childAt.setVisibility(0);
                if (!bzjj.f170295a.isEmpty()) {
                    TextView textView = (TextView) childAt.findViewById(C0126R.C0129id.display_name);
                    int i3 = Build.VERSION.SDK_INT;
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setText(bzjj.f170295a);
                }
                String str2 = bzjj.f170297c;
                str2 = TextUtils.isEmpty(str2) ? bzjj.f170298d : str2;
                String a = rzi.m34705a(tey.m36894b(TextUtils.isEmpty(str2) ? cgnq.m146307b() : str2), this.f86803a.getResources().getDimensionPixelSize(C0126R.dimen.profile_card_people_avatar_diameter));
                tie tie2 = this.f86809g;
                int i4 = this.f86810h;
                this.f86810h = i4 + 1;
                tie2.mo26557a(a, i4, new aqty(this, childAt));
                if (!bzjj.f170296b.isEmpty()) {
                    childAt.setOnClickListener(new aqtz(this, bzjj));
                }
                i2++;
            }
            this.f86807e.mo59009a(linearLayout);
            return;
        }
        baseCardView.setVisibility(8);
    }
}
