package p000;

import android.os.Handler;
import com.google.android.gms.constellation.GcmChimeraBroadcastReceiver;
import java.util.Map;
import java.util.UUID;

/* renamed from: sxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxv extends tdl {

    /* renamed from: a */
    final /* synthetic */ UUID f45403a;

    /* renamed from: b */
    final /* synthetic */ GcmChimeraBroadcastReceiver f45404b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sxv(GcmChimeraBroadcastReceiver gcmChimeraBroadcastReceiver, Handler handler, UUID uuid) {
        super(handler);
        this.f45404b = gcmChimeraBroadcastReceiver;
        this.f45403a = uuid;
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        GcmChimeraBroadcastReceiver.f30470b.mo25411b("Verification failed", tdw, new Object[0]);
        this.f45404b.f30471c.mo26404a(this.f45403a, 9, tdw);
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        GcmChimeraBroadcastReceiver.f30470b.mo25412b("Completed sync", new Object[0]);
        this.f45404b.f30471c.mo26405a(this.f45403a, 9, z);
    }
}
