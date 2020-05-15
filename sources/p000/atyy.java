package p000;

import android.os.Message;
import com.google.android.gms.tapandpay.wear.WearProxyChimeraActivity;

/* renamed from: atyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyy extends atyi {

    /* renamed from: a */
    public String f91186a;

    public atyy(WearProxyChimeraActivity wearProxyChimeraActivity) {
        super(wearProxyChimeraActivity);
    }

    public final void handleMessage(Message message) {
        WearProxyChimeraActivity wearProxyChimeraActivity = (WearProxyChimeraActivity) mo50318b();
        if (wearProxyChimeraActivity != null && this.f91186a != null) {
            wearProxyChimeraActivity.mo59503a(auaa.m76637c(message.what, message.getData()), this.f91186a);
        }
    }
}
