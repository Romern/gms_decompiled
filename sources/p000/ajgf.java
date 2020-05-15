package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: ajgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgf extends ajci {

    /* renamed from: a */
    public final ajge f70562a;

    /* renamed from: b */
    public final buqh f70563b;

    /* renamed from: c */
    private final ajat f70564c;

    public ajgf(Context context, ClientAppIdentifier clientAppIdentifier, aiwj aiwj) {
        ajge ajge = new ajge(context, clientAppIdentifier, aiwj);
        this.f70564c = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70563b = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70562a = ajge;
    }

    /* renamed from: a */
    private final void m58646a(ClientAppContext clientAppContext, String str) {
        this.f70563b.mo72987c(new ajgb(this, str.length() == 0 ? new String("handleClientLifecycleEvent#") : "handleClientLifecycleEvent#".concat(str), clientAppContext));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo38597a() {
        return this.f70562a.f70558a == null;
    }

    /* renamed from: b */
    public final aixw mo38598b() {
        ajge ajge = this.f70562a;
        int i = ajge.f70556e;
        return ajge.f70558a;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajgf", "onTransact", 259, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error on binder transaction.");
            throw e;
        }
    }

    /* renamed from: a */
    public final int mo38594a(int i) {
        if (!mo38597a()) {
            return mo38598b().mo38233a(i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo38599b(int i) {
        if (!mo38597a()) {
            aiyd aiyd = mo38598b().f70031e;
            int i2 = aiyd.f70050c;
            if ((i2 | i) == i2) {
                aiyd.f70050c = i ^ i2;
                return;
            }
            throw new IllegalArgumentException("Cannot remove permissions that aren't there");
        }
    }

    /* renamed from: a */
    public final aixw mo38595a(ClientAppContext clientAppContext) {
        ajge ajge = this.f70562a;
        aixw aixw = ajge.f70558a;
        if (aixw == null) {
            if (clientAppContext.f80724c == null) {
                clientAppContext = new ClientAppContext(clientAppContext.f80723b, "0p:com.google.android.gms", clientAppContext.f80725d, 0);
            }
            ClientAppIdentifier a = ClientAppIdentifier.m67376a("com.google.android.gms", clientAppContext);
            aixw = (aixw) ajge.f70559b.get(a);
            if (aixw == null) {
                aixw aixw2 = new aixw(ajge.f70560c, a, ajge.f70561d);
                aixw2.mo38233a(-1);
                ajge.f70559b.put(a, aixw2);
                return aixw2;
            }
        }
        return aixw;
    }

    /* renamed from: a */
    public final void mo38482a(GetPermissionStatusRequest getPermissionStatusRequest) {
        this.f70563b.mo72987c(new ajfz(this, "getPermissionStatus", getPermissionStatusRequest));
    }

    /* renamed from: a */
    public final void mo38483a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest) {
        byyf byyf = this.f70564c.f70278f.f168930n;
        if (byyf == null) {
            byyf = byyf.f168912c;
        }
        if (byyf.f168915b) {
            int i = handleClientLifecycleEventRequest.f80737c;
            if (i == 1) {
                m58646a(handleClientLifecycleEventRequest.f80736b, "ACTIVITY_STOPPED");
            } else if (i != 2) {
                srn srn = ahfq.f67120a;
                ClientAppContext clientAppContext = handleClientLifecycleEventRequest.f80736b;
            } else {
                m58646a(handleClientLifecycleEventRequest.f80736b, "CLIENT_DISCONNECTED");
            }
        }
    }

    /* renamed from: a */
    public final void mo38484a(PublishRequest publishRequest) {
        this.f70563b.mo72987c(new ajfv(this, "publish", publishRequest));
    }

    /* renamed from: a */
    public final void mo38485a(RegisterStatusCallbackRequest registerStatusCallbackRequest) {
        this.f70563b.mo72987c(new ajga(this, "registerStatusCallback", registerStatusCallbackRequest));
    }

    /* renamed from: a */
    public final void mo38486a(SubscribeRequest subscribeRequest) {
        this.f70563b.mo72987c(new ajfx(this, "subscribe", subscribeRequest));
    }

    /* renamed from: a */
    public final void mo38487a(UnpublishRequest unpublishRequest) {
        this.f70563b.mo72987c(new ajfw(this, "unpublish", unpublishRequest));
    }

    /* renamed from: a */
    public final void mo38488a(UnsubscribeRequest unsubscribeRequest) {
        this.f70563b.mo72987c(new ajfy(this, "unsubscribe", unsubscribeRequest));
    }

    /* renamed from: a */
    public final void mo38596a(boolean z, boolean z2) {
        this.f70563b.mo72987c(new ajfu(this, "clearPublishesAndSubscribes", z2, z));
    }
}
