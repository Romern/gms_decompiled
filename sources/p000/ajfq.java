package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;
import java.util.Map;
import java.util.Set;

/* renamed from: ajfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfq extends rzu {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70533a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfq(NearbyMessagesChimeraService nearbyMessagesChimeraService) {
        super(nearbyMessagesChimeraService, 62, new int[0]);
        this.f70533a = nearbyMessagesChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return NearbyMessagesChimeraService.f80801b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo25274b() {
        return NearbyMessagesChimeraService.f80802c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0112  */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        ajgf a;
        boolean z;
        Bundle bundle = getServiceRequest.f30233g;
        bundle.setClassLoader(this.f70533a.getClassLoader());
        String str = getServiceRequest.f30230d;
        ClientAppContext clientAppContext = (ClientAppContext) bundle.getParcelable("ClientAppContext");
        if (clientAppContext == null) {
            clientAppContext = new ClientAppContext(str);
        } else if (str.equals("com.google.android.gms") && clientAppContext.f80724c == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajfq", "a", 720, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("A client from GMSCore attempted to connect, but didn't set a zero party identifier. Client, you need to replace your call to addApi(Nearby.MESSAGES_API) with addApi(Nearby.MESSAGES_API, new MessagesOptions.Builder().setZeroPartyPackageName(ZERO_PARTY_PACKAGE_NAME)). We use this to keep your state separate from other GMSCore clients.");
            sbj.mo16678a(2806, (IBinder) null, (Bundle) null);
            return;
        }
        ClientAppIdentifier a2 = ClientAppIdentifier.m67376a(str, clientAppContext);
        srn srn = ahfq.f67120a;
        int i = getServiceRequest.f30229c;
        Context baseContext = this.f70533a.getBaseContext();
        if (spn.m35869b()) {
            a2.f80670e = 1;
        } else if (rfz.m33557a(baseContext).mo24610b(a2.f80669d) || aixt.m58148a(baseContext, a2.f80669d)) {
            a2.f80670e = 2;
        } else {
            a2.f80670e = 4;
        }
        if (!a2.f80669d.equals("com.google.android.gms") && a2.f80669d.equals(a2.f80668c.f80723b)) {
            ClientAppContext clientAppContext2 = a2.f80668c;
            if (clientAppContext2.f80724c == null && !clientAppContext2.f80725d && clientAppContext2.f80727f == null) {
                if (a2.mo44296d()) {
                    z = a2.mo44292a(3);
                    if (!z) {
                        bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                        bnsl2.mo68432a("ajfq", "a", 747, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("%s attempted to connect, but we do not trust them. See verbose logs for why.", a2);
                        sbj.mo16678a(2806, (IBinder) null, (Bundle) null);
                        return;
                    }
                }
                a = this.f70533a.mo44370a(a2);
                int a3 = a.mo38594a(bundle.getInt("NearbyPermissions", -1));
                String c = a2.mo44294c();
                if (!a.mo38597a() || a.mo38598b().f70031e.mo38245a() || aiyd.m58181a(getServiceRequest.f30229c)) {
                    sbj.mo16678a(0, a, (Bundle) null);
                }
                NearbyMessagesChimeraService nearbyMessagesChimeraService = this.f70533a;
                Object obj = NearbyMessagesChimeraService.f80800a;
                if (nearbyMessagesChimeraService.f80808g.mo38610a(c)) {
                    a.mo38599b(a3);
                    PendingIntent a4 = NearbyMessagesAppOptInChimeraActivity.m67429a(this.f70533a, c);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("pendingIntent", a4);
                    sbj.mo16678a(2802, (IBinder) null, bundle2);
                    return;
                }
                a.mo38599b(a3);
                sbj.mo16678a(2802, (IBinder) null, (Bundle) null);
                return;
            }
        }
        z = a2.mo44292a(1);
        if (!z) {
        }
        a = this.f70533a.mo44370a(a2);
        int a32 = a.mo38594a(bundle.getInt("NearbyPermissions", -1));
        String c2 = a2.mo44294c();
        if (!a.mo38597a()) {
        }
        sbj.mo16678a(0, a, (Bundle) null);
    }
}
