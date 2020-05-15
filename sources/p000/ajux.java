package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ajux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajux extends ajuj {

    /* renamed from: s */
    final /* synthetic */ ajuy f71341s;

    /* renamed from: t */
    private final TextView f71342t;

    /* renamed from: u */
    private final ImageView f71343u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajux(ajuy ajuy, View view) {
        super(view);
        this.f71341s = ajuy;
        this.f71342t = (TextView) view.findViewById(C0126R.C0129id.title);
        this.f71343u = (ImageView) view.findViewById(C0126R.C0129id.icon);
    }

    /* renamed from: a */
    private static final Drawable m59087a(Context context, int i) {
        return new ajwz(new C1416ut(context, i));
    }

    /* renamed from: c */
    private final boolean m59088c(int i) {
        int i2 = this.f71341s.f71344f;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1) {
            i3 = i2 != 2 ? -1 : 0;
        }
        return i3 == i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38926a(Context context, Object obj) {
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            this.f71342t.setText((int) C0126R.string.sharing_visibility_option_hidden);
            if (m59088c(0)) {
                this.f71343u.setImageDrawable(m59087a(context, 2132018134));
                this.f71342t.setTextColor(context.getColor(C0126R.color.sharing_color_accent));
                return;
            }
            this.f71343u.setImageDrawable(m59087a(context, 2132018125));
            this.f71342t.setTextColor(context.getResources().getColor(C0126R.color.sharing_text_color_visibility_unselected));
        } else if (intValue == 1) {
            this.f71342t.setText((int) C0126R.string.sharing_visibility_option_all_contacts);
            if (m59088c(1)) {
                this.f71343u.setImageDrawable(m59087a(context, 2132018133));
                this.f71342t.setTextColor(context.getColor(C0126R.color.sharing_color_accent));
                return;
            }
            this.f71343u.setImageDrawable(m59087a(context, 2132018124));
            this.f71342t.setTextColor(context.getResources().getColor(C0126R.color.sharing_text_color_visibility_unselected));
        } else if (intValue == 2) {
            this.f71342t.setText((int) C0126R.string.sharing_visibility_option_some_contacts);
            if (m59088c(2)) {
                this.f71343u.setImageDrawable(m59087a(context, 2132018135));
                this.f71342t.setTextColor(context.getColor(C0126R.color.sharing_color_accent));
                return;
            }
            this.f71343u.setImageDrawable(m59087a(context, 2132018126));
            this.f71342t.setTextColor(context.getResources().getColor(C0126R.color.sharing_text_color_visibility_unselected));
        }
    }
}
