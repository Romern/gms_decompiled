package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: ariw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ariw extends IInterface {
    /* renamed from: a */
    void mo48403a(arit arit);

    /* renamed from: a */
    void mo48404a(arit arit, Bundle bundle);

    /* renamed from: a */
    void mo48405a(arit arit, ariz ariz);

    /* renamed from: a */
    void mo48406a(arit arit, BootstrapConfigurations bootstrapConfigurations);

    /* renamed from: a */
    void mo48407a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arij arij);

    /* renamed from: a */
    void mo48408a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik);

    /* renamed from: a */
    void mo48409a(arit arit, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, arin arin);

    /* renamed from: a */
    void mo48410a(arit arit, D2DDevice d2DDevice, String str, ariq ariq);

    /* renamed from: a */
    void mo48411a(arit arit, String str);

    /* renamed from: a */
    void mo48412a(artk artk);

    /* renamed from: a */
    void mo48413a(artk artk, HandshakeData handshakeData);

    /* renamed from: a */
    void mo48414a(ConnectParams connectParams);

    /* renamed from: b */
    void mo48416b(arit arit);

    /* renamed from: b */
    void mo48417b(arit arit, Bundle bundle);

    /* renamed from: b */
    void mo48418b(artk artk, HandshakeData handshakeData);

    /* renamed from: c */
    void mo48420c(arit arit);

    /* renamed from: d */
    void mo48421d(arit arit);
}
