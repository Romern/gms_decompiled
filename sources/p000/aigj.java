package p000;

import android.os.IBinder;
import android.os.Parcel;
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

/* renamed from: aigj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aigj extends dcj implements aigl {
    public aigj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    /* renamed from: a */
    public final String mo36584a() {
        throw null;
    }

    /* renamed from: a */
    public final void mo36585a(long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36586a(aigi aigi, String str, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36587a(aigi aigi, String str, long j, long j2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36588a(aigi aigi, String str, String str2, byte[] bArr, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36589a(aigi aigi, String str, byte[] bArr, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36603a(String str, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36605a(String[] strArr, byte[] bArr, long j) {
        throw null;
    }

    /* renamed from: b */
    public final void mo36606b(long j) {
        throw null;
    }

    /* renamed from: b */
    public final void mo36607b(aigi aigi, String str, long j, long j2) {
        throw null;
    }

    /* renamed from: b */
    public final void mo36608b(String[] strArr, byte[] bArr, long j) {
        throw null;
    }

    /* renamed from: c */
    public final void mo36609c(long j) {
        throw null;
    }

    /* renamed from: d */
    public final String mo36610d(long j) {
        throw null;
    }

    /* renamed from: g */
    public final void mo36614g(long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36590a(AcceptConnectionRequestParams acceptConnectionRequestParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, acceptConnectionRequestParams);
        mo8528b(2006, bj);
    }

    /* renamed from: a */
    public final void mo36591a(CancelPayloadParams cancelPayloadParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, cancelPayloadParams);
        mo8528b(2012, bj);
    }

    /* renamed from: a */
    public final void mo36592a(ClientDisconnectingParams clientDisconnectingParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, clientDisconnectingParams);
        mo8528b(2011, bj);
    }

    /* renamed from: a */
    public final void mo36593a(DisconnectFromEndpointParams disconnectFromEndpointParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, disconnectFromEndpointParams);
        mo8528b(2009, bj);
    }

    /* renamed from: a */
    public final void mo36594a(InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, initiateBandwidthUpgradeParams);
        mo8528b(2013, bj);
    }

    /* renamed from: a */
    public final void mo36595a(RejectConnectionRequestParams rejectConnectionRequestParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, rejectConnectionRequestParams);
        mo8528b(2007, bj);
    }

    /* renamed from: a */
    public final void mo36596a(SendConnectionRequestParams sendConnectionRequestParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sendConnectionRequestParams);
        mo8528b(2005, bj);
    }

    /* renamed from: a */
    public final void mo36597a(SendPayloadParams sendPayloadParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sendPayloadParams);
        mo8528b(2008, bj);
    }

    /* renamed from: a */
    public final void mo36598a(StartAdvertisingParams startAdvertisingParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, startAdvertisingParams);
        mo8528b(2001, bj);
    }

    /* renamed from: a */
    public final void mo36599a(StartDiscoveryParams startDiscoveryParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, startDiscoveryParams);
        mo8528b(2003, bj);
    }

    /* renamed from: a */
    public final void mo36600a(StopAdvertisingParams stopAdvertisingParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, stopAdvertisingParams);
        mo8528b(2002, bj);
    }

    /* renamed from: a */
    public final void mo36601a(StopAllEndpointsParams stopAllEndpointsParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, stopAllEndpointsParams);
        mo8528b(2010, bj);
    }

    /* renamed from: a */
    public final void mo36602a(StopDiscoveryParams stopDiscoveryParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, stopDiscoveryParams);
        mo8528b(2004, bj);
    }
}
