package p000;

import android.view.View;
import com.google.android.gms.walletp2p.internal.zeroparty.InstrumentCreationToken;

/* renamed from: axlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axlc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InstrumentCreationToken f96127a;

    /* renamed from: b */
    final /* synthetic */ axle f96128b;

    public axlc(axle axle, InstrumentCreationToken instrumentCreationToken) {
        this.f96128b = axle;
        this.f96127a = instrumentCreationToken;
    }

    public void onClick(View view) {
        this.f96128b.mo53198a(this.f96127a);
    }
}
