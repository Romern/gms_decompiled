package p000;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

/* renamed from: axtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axtn extends axru {

    /* renamed from: a */
    public rod f96326a;

    /* renamed from: b */
    public final IntentFilter[] f96327b;

    public axtn(IntentFilter[] intentFilterArr) {
        this.f96327b = (IntentFilter[]) sdo.m34959a(intentFilterArr);
    }

    /* renamed from: a */
    private static void m83174a(rod rod) {
        if (rod != null) {
            rod.mo24967a();
        }
    }

    /* renamed from: a */
    public final void mo53367a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
    }

    /* renamed from: a */
    public final void mo53368a(AncsNotificationParcelable ancsNotificationParcelable) {
    }

    /* renamed from: a */
    public final void mo53369a(CapabilityInfoParcelable capabilityInfoParcelable) {
    }

    /* renamed from: a */
    public final void mo53370a(ChannelEventParcelable channelEventParcelable) {
    }

    /* renamed from: a */
    public final void mo53372a(NodeParcelable nodeParcelable) {
    }

    /* renamed from: a */
    public final void mo53373a(List list) {
    }

    /* renamed from: b */
    public final void mo53374b(NodeParcelable nodeParcelable) {
    }

    /* renamed from: a */
    public final void mo53533a() {
        m83174a((rod) null);
        m83174a((rod) null);
        m83174a((rod) null);
        m83174a(this.f96326a);
        this.f96326a = null;
        m83174a((rod) null);
        m83174a((rod) null);
        m83174a((rod) null);
        m83174a((rod) null);
    }

    /* renamed from: a */
    public final void mo53366a(DataHolder dataHolder) {
        dataHolder.close();
    }

    /* renamed from: a */
    public final void mo53371a(MessageEventParcelable messageEventParcelable) {
        rod rod = this.f96326a;
        if (rod != null) {
            rod.mo24968a(new axtm(messageEventParcelable));
        }
    }
}
