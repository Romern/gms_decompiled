package p000;

import android.view.View;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;

/* renamed from: axlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axlb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Instrument f96125a;

    /* renamed from: b */
    final /* synthetic */ axle f96126b;

    public axlb(axle axle, Instrument instrument) {
        this.f96126b = axle;
        this.f96125a = instrument;
    }

    public void onClick(View view) {
        this.f96126b.mo53197a(this.f96125a);
    }
}
