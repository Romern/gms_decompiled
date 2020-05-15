package p000;

import android.view.View;
import com.google.android.gms.fido.common.Transport;

/* renamed from: ydc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ydc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ydf f53645a;

    public ydc(ydf ydf) {
        this.f53645a = ydf;
    }

    public void onClick(View view) {
        this.f53645a.f53617f.mo29786a(Transport.BLUETOOTH_LOW_ENERGY);
    }
}
