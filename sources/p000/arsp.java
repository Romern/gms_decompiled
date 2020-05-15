package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arsp extends artl implements aaai {

    /* renamed from: a */
    private final arsi f88248a;

    /* renamed from: b */
    private final arsi f88249b;

    /* renamed from: c */
    private final aaag f88250c;

    public arsp(LifecycleSynchronizer lifecycleSynchronizer, Context context, String str, boolean z) {
        this.f88250c = aaag.m21014a(context, lifecycleSynchronizer, arpy.m73286a());
        armd armd = new armd(context);
        armd.mo48636a(str, z);
        this.f88248a = new arsi(context, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, armd);
        this.f88249b = new arsi(context, 100, armd);
    }

    /* renamed from: a */
    public final void mo48806a(artk artk) {
        this.f88250c.mo16658a(new arsj(artk, this.f88249b));
    }

    /* renamed from: b */
    public final void mo48808b(artk artk) {
        this.f88250c.mo16658a(new arso(artk, this.f88249b));
    }

    /* renamed from: c */
    public final void mo48810c(artk artk, HandshakeData handshakeData) {
        this.f88250c.mo16658a(new arsl(artk, handshakeData, this.f88248a));
    }

    /* renamed from: d */
    public final void mo48811d(artk artk, HandshakeData handshakeData) {
        this.f88250c.mo16658a(new arsk(artk, this.f88248a, handshakeData));
    }

    /* renamed from: a */
    public final void mo48807a(artk artk, HandshakeData handshakeData) {
        this.f88250c.mo16658a(new arsn(artk, this.f88249b, handshakeData));
    }

    /* renamed from: b */
    public final void mo48809b(artk artk, HandshakeData handshakeData) {
        this.f88250c.mo16658a(new arsm(artk, this.f88249b, handshakeData));
    }
}
