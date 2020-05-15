package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;

/* renamed from: wsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wsb extends acm {

    /* renamed from: s */
    public final ImageView f51228s;

    /* renamed from: t */
    private final TextView f51229t;

    /* renamed from: u */
    private final TextView f51230u;

    public wsb(View view) {
        super(view);
        this.f51229t = (TextView) view.findViewById(C0126R.C0129id.title);
        this.f51230u = (TextView) view.findViewById(C0126R.C0129id.description);
        this.f51228s = (ImageView) view.findViewById(16908294);
    }

    /* renamed from: a */
    public final String mo29342a(int i, Object... objArr) {
        return mo29346v().getString(i, objArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29345b(String str) {
        this.f51230u.setText(str);
    }

    /* renamed from: v */
    public final Context mo29346v() {
        return this.f201a.getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29343a(String str) {
        this.f51229t.setText(str);
    }

    /* renamed from: a */
    public final boolean mo29344a(DiscoveryListItem discoveryListItem) {
        return discoveryListItem.f191746l == bzbk.f169254f;
    }
}
