package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wnb extends acm {

    /* renamed from: w */
    public static final /* synthetic */ int f50938w = 0;

    /* renamed from: s */
    public final View f50939s;

    /* renamed from: t */
    public final LinearLayout f50940t;

    /* renamed from: u */
    public boolean f50941u;

    /* renamed from: v */
    final /* synthetic */ wnc f50942v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnb(wnc wnc, View view) {
        super(view);
        this.f50942v = wnc;
        this.f50939s = view.findViewById(C0126R.C0129id.fm_cp_primary_contact_row);
        this.f50940t = (LinearLayout) view.findViewById(C0126R.C0129id.fm_cp_expandable_contact_rows_container);
    }

    /* renamed from: a */
    public static final ImageView m42050a(View view) {
        return (ImageView) view.findViewById(C0126R.C0129id.fm_cp_avatar);
    }

    /* renamed from: b */
    public static final ImageView m42051b(View view) {
        return (ImageView) view.findViewById(C0126R.C0129id.fm_cp_default_avatar);
    }

    /* renamed from: c */
    public static final TextView m42052c(View view) {
        return (TextView) view.findViewById(C0126R.C0129id.fm_cp_contact_row_line_1);
    }

    /* renamed from: d */
    public static final TextView m42053d(View view) {
        return (TextView) view.findViewById(C0126R.C0129id.fm_cp_contact_row_line_2);
    }

    /* renamed from: e */
    public static final RelativeLayout m42054e(View view) {
        return (RelativeLayout) view.findViewById(C0126R.C0129id.fm_cp_selected_avatar);
    }

    /* renamed from: v */
    public final ImageView mo29216v() {
        return (ImageView) this.f50939s.findViewById(C0126R.C0129id.fm_cp_method_expand_button);
    }
}
