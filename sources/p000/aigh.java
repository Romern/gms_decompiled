package p000;

import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: aigh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aigh extends IInterface {
    /* renamed from: a */
    void mo36554a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams);

    /* renamed from: a */
    void mo36555a(OnEndpointFoundParams onEndpointFoundParams);

    /* renamed from: a */
    void mo36556a(OnEndpointLostParams onEndpointLostParams);

    /* renamed from: a */
    void mo36557a(OnStoppedDiscoveryParams onStoppedDiscoveryParams);
}
