package p000;

import com.google.android.gms.cast.service.CastRemoteControlNotificationIntentOperation;

/* renamed from: pxk */
public final /* synthetic */ class pxk implements aubq {

    /* renamed from: a */
    private final CastRemoteControlNotificationIntentOperation f40571a;

    public pxk(CastRemoteControlNotificationIntentOperation castRemoteControlNotificationIntentOperation) {
        this.f40571a = castRemoteControlNotificationIntentOperation;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        CastRemoteControlNotificationIntentOperation castRemoteControlNotificationIntentOperation = this.f40571a;
        if (!aucb.mo50384b() || !((Boolean) aucb.mo50386d()).booleanValue()) {
            CastRemoteControlNotificationIntentOperation.f29922a.mo23861b("RCN is disabled on this network.");
            castRemoteControlNotificationIntentOperation.stopService(castRemoteControlNotificationIntentOperation.f29923b);
            return;
        }
        CastRemoteControlNotificationIntentOperation.f29922a.mo23861b("RCN is enabled on this network.");
        castRemoteControlNotificationIntentOperation.startService(castRemoteControlNotificationIntentOperation.f29923b);
    }
}
