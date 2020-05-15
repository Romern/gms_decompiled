package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: artc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class artc extends ariv implements aaai {

    /* renamed from: a */
    private final arsi f88267a;

    /* renamed from: b */
    private final aaag f88268b;

    public artc(LifecycleSynchronizer lifecycleSynchronizer, Context context, String str, boolean z) {
        this.f88268b = aaag.m21014a(context, lifecycleSynchronizer, arpy.m73286a());
        armd armd = new armd(context);
        armd.mo48636a(str, z);
        this.f88267a = new arsi(context, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, armd);
    }

    /* renamed from: a */
    public final void mo48403a(arit arit) {
    }

    /* renamed from: a */
    public final void mo48404a(arit arit, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo48405a(arit arit, ariz ariz) {
    }

    /* renamed from: a */
    public final void mo48406a(arit arit, BootstrapConfigurations bootstrapConfigurations) {
    }

    /* renamed from: a */
    public final void mo48407a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arij arij) {
    }

    /* renamed from: a */
    public final void mo48408a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
    }

    /* renamed from: a */
    public final void mo48409a(arit arit, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, arin arin) {
    }

    /* renamed from: a */
    public final void mo48410a(arit arit, D2DDevice d2DDevice, String str, ariq ariq) {
    }

    /* renamed from: a */
    public final void mo48411a(arit arit, String str) {
    }

    /* renamed from: a */
    public final void mo48414a(ConnectParams connectParams) {
    }

    /* renamed from: b */
    public final void mo48416b(arit arit) {
    }

    /* renamed from: b */
    public final void mo48417b(arit arit, Bundle bundle) {
    }

    /* renamed from: c */
    public final void mo48420c(arit arit) {
    }

    /* renamed from: d */
    public final void mo48421d(arit arit) {
    }

    /* renamed from: b */
    public final void mo48418b(artk artk, HandshakeData handshakeData) {
        this.f88268b.mo16658a(new arsz(artk, this.f88267a, handshakeData));
    }

    /* renamed from: a */
    public final void mo48412a(artk artk) {
        this.f88268b.mo16658a(new arta(artk, this.f88267a));
    }

    /* renamed from: a */
    public final void mo48413a(artk artk, HandshakeData handshakeData) {
        this.f88268b.mo16658a(new artb(artk, handshakeData, this.f88267a));
    }
}
