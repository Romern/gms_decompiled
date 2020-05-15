package p000;

import android.view.View;
import com.google.android.gms.fido.common.Transport;

/* renamed from: ycg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ycg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ yci f53596a;

    public ycg(yci yci) {
        this.f53596a = yci;
    }

    public void onClick(View view) {
        this.f53596a.f53617f.mo29786a(Transport.NFC);
    }
}
