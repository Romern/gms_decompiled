package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

/* renamed from: aygb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygb {

    /* renamed from: a */
    private final aygd f97517a;

    public aygb(aygd aygd) {
        sdo.m34959a(aygd);
        this.f97517a = aygd;
    }

    /* renamed from: a */
    public final void mo53998a(axue axue, axvz axvz, String str, String str2, int i, int i2) {
        if (Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", String.format("onChannelClosed(%s, %s, %s, %s, %s, %s)", axue, axvz, str, str2, Integer.valueOf(i), Integer.valueOf(i2)));
        }
        mo53999a(axue, axvz, str, str2, i, i2, 2, "onChannelClosed");
    }

    /* renamed from: a */
    public final void mo53999a(axue axue, axvz axvz, String str, String str2, int i, int i2, int i3, String str3) {
        ChannelEventParcelable channelEventParcelable = new ChannelEventParcelable(new ChannelImpl(axvz.mo53654a(), str2, str), i3, i, i2);
        Intent intent = new Intent("com.google.android.gms.wearable.CHANNEL_EVENT", ayao.m83709a("", str)).setPackage(axue.f96377a);
        aygd aygd = this.f97517a;
        aygd.f97519a.mo60325a(axue, new ayga(str3, intent, channelEventParcelable, axvz, str, str2, i, i2));
    }
}
