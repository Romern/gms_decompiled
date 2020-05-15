package p000;

import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

/* renamed from: axpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axpo extends axru {

    /* renamed from: a */
    final /* synthetic */ axpp f96251a;

    /* renamed from: b */
    private volatile int f96252b = -1;

    public axpo(axpp axpp) {
        this.f96251a = axpp;
    }

    /* renamed from: a */
    private final boolean m82861a(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.f96251a.f96254b.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f96252b) {
            if (axto.m83185a(this.f96251a).mo53534a("com.google.android.wearable.app.cn") && str.m36311a(this.f96251a, callingUid, "com.google.android.wearable.app.cn")) {
                this.f96252b = callingUid;
            } else if (str.m36310a(this.f96251a, callingUid)) {
                this.f96252b = callingUid;
            } else {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Caller is not GooglePlayServices; caller UID: ");
                sb.append(callingUid);
                Log.e("WearableLS", sb.toString());
                return false;
            }
        }
        synchronized (this.f96251a.f96257e) {
            axpp axpp = this.f96251a;
            if (axpp.f96258f) {
                return false;
            }
            axpp.f96255c.post(runnable);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo53374b(NodeParcelable nodeParcelable) {
        m82861a(new axpi(this, nodeParcelable), "onPeerDisconnected", nodeParcelable);
    }

    /* renamed from: a */
    public final void mo53366a(DataHolder dataHolder) {
        axpf axpf = new axpf(this, dataHolder);
        try {
            String valueOf = String.valueOf(dataHolder);
            int i = dataHolder.f30168h;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append(valueOf);
            sb.append(", rows=");
            sb.append(i);
            if (m82861a(axpf, "onDataItemChanged", sb.toString())) {
            }
        } finally {
            dataHolder.close();
        }
    }

    /* renamed from: a */
    public final void mo53367a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        m82861a(new axpm(), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    /* renamed from: a */
    public final void mo53368a(AncsNotificationParcelable ancsNotificationParcelable) {
        m82861a(new axpl(), "onNotificationReceived", ancsNotificationParcelable);
    }

    /* renamed from: a */
    public final void mo53369a(CapabilityInfoParcelable capabilityInfoParcelable) {
        m82861a(new axpk(this, capabilityInfoParcelable), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    /* renamed from: a */
    public final void mo53370a(ChannelEventParcelable channelEventParcelable) {
        m82861a(new axpn(this, channelEventParcelable), "onChannelEvent", channelEventParcelable);
    }

    /* renamed from: a */
    public final void mo53371a(MessageEventParcelable messageEventParcelable) {
        m82861a(new axpg(this, messageEventParcelable), "onMessageReceived", messageEventParcelable);
    }

    /* renamed from: a */
    public final void mo53372a(NodeParcelable nodeParcelable) {
        m82861a(new axph(this, nodeParcelable), "onPeerConnected", nodeParcelable);
    }

    /* renamed from: a */
    public final void mo53373a(List list) {
        m82861a(new axpj(), "onConnectedNodes", list);
    }
}
