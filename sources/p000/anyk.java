package p000;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: anyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyk extends anxz {

    /* renamed from: d */
    private TextView f77870d;

    public anyk(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return !this.f77854a ? C0126R.C0128layout.plus_oob_field_info : C0126R.C0128layout.plus_oob_field_info_setup_wizard;
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return true;
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        aodt h = mo42422h();
        h.mo42558a(new aodz().mo42582a());
        return h.mo42557a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final FavaDiagnosticsEntity mo42421g() {
        if ("domainInfo".equals(this.f77855b.mo42600g())) {
            return rim.f43060b;
        }
        if ("termsOfService".equals(this.f77855b.mo42600g())) {
            return rim.f43061c;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        super.mo42415a(aoed, anxy);
        TextView textView = (TextView) findViewWithTag(mo42414a(C0126R.string.plus_oob_field_view_tag_info));
        this.f77870d = textView;
        textView.setText(mo42423i());
        this.f77870d.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
