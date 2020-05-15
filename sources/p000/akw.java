package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: akw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akw extends Handler {

    /* renamed from: a */
    final /* synthetic */ akz f800a;

    public akw(akz akz) {
        this.f800a = akz;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            akz akz = this.f800a;
            akz.f809h = false;
            akq akq = akz.f805d;
            if (akq != null) {
                akq.mo925a(akz, akz.f808g);
            }
        } else if (i == 2) {
            akz akz2 = this.f800a;
            akz2.f807f = false;
            akz2.mo951b(akz2.f806e);
        }
    }
}
