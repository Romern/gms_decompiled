package p000;

import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;
import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import com.google.android.gms.nearby.internal.connection.StopAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams;
import com.google.android.gms.nearby.internal.connection.StopDiscoveryParams;

/* renamed from: aigl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aigl extends IInterface {
    /* renamed from: a */
    String mo36584a();

    /* renamed from: a */
    void mo36585a(long j);

    /* renamed from: a */
    void mo36586a(aigi aigi, String str, long j);

    /* renamed from: a */
    void mo36587a(aigi aigi, String str, long j, long j2);

    /* renamed from: a */
    void mo36588a(aigi aigi, String str, String str2, byte[] bArr, long j);

    /* renamed from: a */
    void mo36589a(aigi aigi, String str, byte[] bArr, long j);

    /* renamed from: a */
    void mo36590a(AcceptConnectionRequestParams acceptConnectionRequestParams);

    /* renamed from: a */
    void mo36591a(CancelPayloadParams cancelPayloadParams);

    /* renamed from: a */
    void mo36592a(ClientDisconnectingParams clientDisconnectingParams);

    /* renamed from: a */
    void mo36593a(DisconnectFromEndpointParams disconnectFromEndpointParams);

    /* renamed from: a */
    void mo36594a(InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams);

    /* renamed from: a */
    void mo36595a(RejectConnectionRequestParams rejectConnectionRequestParams);

    /* renamed from: a */
    void mo36596a(SendConnectionRequestParams sendConnectionRequestParams);

    /* renamed from: a */
    void mo36597a(SendPayloadParams sendPayloadParams);

    /* renamed from: a */
    void mo36598a(StartAdvertisingParams startAdvertisingParams);

    /* renamed from: a */
    void mo36599a(StartDiscoveryParams startDiscoveryParams);

    /* renamed from: a */
    void mo36600a(StopAdvertisingParams stopAdvertisingParams);

    /* renamed from: a */
    void mo36601a(StopAllEndpointsParams stopAllEndpointsParams);

    /* renamed from: a */
    void mo36602a(StopDiscoveryParams stopDiscoveryParams);

    /* renamed from: a */
    void mo36603a(String str, long j);

    /* renamed from: a */
    void mo36605a(String[] strArr, byte[] bArr, long j);

    /* renamed from: b */
    void mo36606b(long j);

    /* renamed from: b */
    void mo36607b(aigi aigi, String str, long j, long j2);

    /* renamed from: b */
    void mo36608b(String[] strArr, byte[] bArr, long j);

    /* renamed from: c */
    void mo36609c(long j);

    /* renamed from: d */
    String mo36610d(long j);

    /* renamed from: g */
    void mo36614g(long j);
}
