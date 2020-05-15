package p000;

import android.os.Message;

/* renamed from: sgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sgc extends snr {

    /* renamed from: a */
    final sns f44161a;

    public sgc(sns sns) {
        super(sns);
        this.f44161a = sns;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            bdgs.m90764a().f105605a.mo57997a(sfu.f44151a.f105583a);
            this.f44161a.quit();
        }
    }
}
