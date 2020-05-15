package p000;

import android.view.View;
import com.google.android.gms.fido.common.Transport;

/* renamed from: ycy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ycy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ yda f53638a;

    public ycy(yda yda) {
        this.f53638a = yda;
    }

    public void onClick(View view) {
        this.f53638a.f53617f.mo29786a(Transport.BLUETOOTH_LOW_ENERGY);
    }
}
