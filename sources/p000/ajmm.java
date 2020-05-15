package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.ProviderAcceptParams;
import com.google.android.gms.nearby.sharing.internal.ProviderCancelParams;
import com.google.android.gms.nearby.sharing.internal.ProviderDenyParams;
import com.google.android.gms.nearby.sharing.internal.ProviderOpenParams;
import com.google.android.gms.nearby.sharing.internal.ProviderSendParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStartAdvertisingParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStartDiscoveryParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStopAdvertisingParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStopDiscoveryParams;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: ajmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajmm implements akcb {

    /* renamed from: a */
    final /* synthetic */ String f70921a;

    /* renamed from: b */
    final /* synthetic */ ajmt f70922b;

    /* renamed from: c */
    final /* synthetic */ ajyk f70923c;

    public ajmm(ajmt ajmt, String str, ajyk ajyk) {
        this.f70922b = ajmt;
        this.f70921a = str;
        this.f70923c = ajyk;
    }

    /* renamed from: e */
    private final void m58792e(ShareTarget shareTarget) {
        if (shareTarget.f81036i) {
            NearbySharingChimeraService nearbySharingChimeraService = this.f70922b.f70935c;
            TransferMetadata a = new ajub(7).mo38916a();
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44423a(shareTarget, a);
            return;
        }
        NearbySharingChimeraService nearbySharingChimeraService2 = this.f70922b.f70935c;
        TransferMetadata a2 = new ajub(7).mo38916a();
        Charset charset2 = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService2.mo44433b(shareTarget, a2);
    }

    /* renamed from: a */
    public final int mo38779a(Contact contact) {
        return 13;
    }

    /* renamed from: a */
    public final void mo38782a(int i) {
    }

    /* renamed from: a */
    public final void mo38784a(PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final int mo38787b(Contact contact) {
        return 13;
    }

    /* renamed from: c */
    public final int mo38790c(ShareTarget shareTarget) {
        try {
            ajyk ajyk = this.f70923c;
            ProviderOpenParams providerOpenParams = new ajzy().f71533a;
            providerOpenParams.f81101a = shareTarget;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerOpenParams);
            ajyk.mo8530c(9, bj);
            return 0;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider open for %s", this.f70923c);
            m58792e(shareTarget);
            return 13;
        }
    }

    /* renamed from: c */
    public final List mo38791c() {
        return akca.m59322a();
    }

    /* renamed from: d */
    public final int mo38792d(ShareTarget shareTarget) {
        try {
            ajyk ajyk = this.f70923c;
            ProviderCancelParams providerCancelParams = new ajzu().f71531a;
            providerCancelParams.f81099a = shareTarget;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerCancelParams);
            ajyk.mo8530c(8, bj);
            return 0;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider cancel for %s", this.f70923c);
            m58792e(shareTarget);
            return 13;
        }
    }

    /* renamed from: d */
    public final void mo38793d() {
    }

    /* renamed from: e */
    public final void mo38794e() {
    }

    /* renamed from: f */
    public final List mo38795f() {
        return akca.m59323b();
    }

    /* renamed from: g */
    public final void mo38796g() {
    }

    /* renamed from: h */
    public final void mo38797h() {
    }

    /* renamed from: a */
    public final int mo38780a(ShareTarget shareTarget) {
        try {
            ajyk ajyk = this.f70923c;
            ProviderAcceptParams providerAcceptParams = new ajzs().f71530a;
            providerAcceptParams.f81098a = shareTarget;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerAcceptParams);
            ajyk.mo8530c(6, bj);
            return 0;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider accept for %s", this.f70923c);
            m58792e(shareTarget);
            return 13;
        }
    }

    /* renamed from: b */
    public final int mo38788b(ShareTarget shareTarget) {
        try {
            ajyk ajyk = this.f70923c;
            ProviderDenyParams providerDenyParams = new ajzw().f71532a;
            providerDenyParams.f81100a = shareTarget;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerDenyParams);
            ajyk.mo8530c(7, bj);
            return 0;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider deny for %s", this.f70923c);
            m58792e(shareTarget);
            return 13;
        }
    }

    /* renamed from: a */
    public final void mo38781a() {
        try {
            ajyk ajyk = this.f70923c;
            ProviderStopDiscoveryParams providerStopDiscoveryParams = new akai().f71538a;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerStopDiscoveryParams);
            ajyk.mo8530c(2, bj);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("External sharing provider has stopped discovery");
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider stopDiscovery for %s", this.f70923c);
        }
    }

    /* renamed from: b */
    public final void mo38789b() {
        try {
            ajyk ajyk = this.f70923c;
            ProviderStopAdvertisingParams providerStopAdvertisingParams = new akag().f71537a;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerStopAdvertisingParams);
            ajyk.mo8530c(4, bj);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("External sharing provider has stopped advertising");
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider stopAdvertising for %s", this.f70923c);
        }
    }

    /* renamed from: a */
    public final void mo38783a(ajsn ajsn, akbz akbz) {
        ajmi ajmi = new ajmi(this, ajsn);
        ProviderStartDiscoveryParams providerStartDiscoveryParams = new akae().f71536a;
        providerStartDiscoveryParams.f81107a = ajmi;
        try {
            ajyk ajyk = this.f70923c;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerStartDiscoveryParams);
            ajyk.mo8530c(1, bj);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("External sharing provider has started discovery");
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider startDiscovery for %s", this.f70923c);
        }
    }

    /* renamed from: a */
    public final void mo38785a(String str, ajud ajud, akbw akbw) {
        try {
            ajyk ajyk = this.f70923c;
            akac akac = new akac();
            akac.f71535a.f81105a = str;
            ajmk ajmk = new ajmk(this, ajud);
            ProviderStartAdvertisingParams providerStartAdvertisingParams = akac.f71535a;
            providerStartAdvertisingParams.f81106b = ajmk;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerStartAdvertisingParams);
            ajyk.mo8530c(3, bj);
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("External sharing provider has started advertising");
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider stopAdvertising for %s", this.f70923c);
        }
    }

    /* renamed from: a */
    public final void mo38786a(String str, ShareTarget shareTarget, ajud ajud) {
        List list = shareTarget.f81034g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ajmt ajmt = this.f70922b;
            NearbySharingChimeraService nearbySharingChimeraService = ajmt.f70935c;
            String str2 = ajmt.f70933a;
            Uri uri = ((FileAttachment) list.get(i)).f80884d;
            Charset charset = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService.mo44426a(str2, uri);
        }
        try {
            ajyk ajyk = this.f70923c;
            akaa akaa = new akaa();
            ProviderSendParams providerSendParams = akaa.f71534a;
            providerSendParams.f81102a = str;
            providerSendParams.f81103b = shareTarget;
            ajml ajml = new ajml(ajud);
            ProviderSendParams providerSendParams2 = akaa.f71534a;
            providerSendParams2.f81104c = ajml;
            Parcel bj = ajyk.mo8529bj();
            dcl.m8165a(bj, providerSendParams2);
            ajyk.mo8530c(5, bj);
        } catch (RemoteException e) {
            NearbySharingChimeraService nearbySharingChimeraService2 = this.f70922b.f70935c;
            TransferMetadata a = new ajub(7).mo38916a();
            Charset charset2 = NearbySharingChimeraService.f80888a;
            nearbySharingChimeraService2.mo44433b(shareTarget, a);
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to call external provider send for %s", this.f70923c);
        }
    }
}
