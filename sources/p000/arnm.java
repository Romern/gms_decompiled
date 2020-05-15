package p000;

import android.os.Handler;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: arnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arnm extends ahir {

    /* renamed from: a */
    public final Handler f87973a;

    /* renamed from: b */
    public final ahir f87974b;

    public arnm(Handler handler, ahir ahir) {
        this.f87973a = handler;
        this.f87974b = ahir;
    }

    /* renamed from: a */
    public final void mo20150a(String str, ahiq ahiq) {
        this.f87973a.post(new arnk(this, str, ahiq));
    }

    /* renamed from: a */
    public final void mo20151a(String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.f87973a.post(new arnl(this, str, payloadTransferUpdate));
    }
}
