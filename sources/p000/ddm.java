package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ddm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddm extends dck implements IInterface {

    /* renamed from: a */
    private final Context f12937a;

    /* renamed from: b */
    private final azat f12938b;

    /* renamed from: c */
    private LocalEntityId f12939c;

    public ddm() {
        super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
    }

    /* renamed from: a */
    private static Bundle m8194a(String str, Map map) {
        Bundle bundle = (Bundle) map.get(str);
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        map.put(str, bundle2);
        return bundle2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ddm(Context context) {
        super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
        azat a = azat.m85170a(context);
        this.f12939c = null;
        this.f12937a = context.getApplicationContext();
        this.f12938b = a;
    }

    /* renamed from: a */
    private final void m8195a(int i, String str) {
        String str2;
        Object[] objArr = new Object[1];
        switch (i) {
            case 558:
                str2 = "TACHYSTICK_REACHABILITY_QUERY_REQUEST_BEGIN";
                break;
            case 559:
                str2 = "TACHYSTICK_REACHABILITY_QUERY_REQUEST_END";
                break;
            case 560:
                str2 = "TACHYSTICK_REACHABILITY_QUERY_DISABLED";
                break;
            case 561:
                str2 = "TACHYSTICK_REACHABILITY_QUERY_EMPTY_NUMBER_LIST";
                break;
            case 562:
                str2 = "TACHYSTICK_REACHABILITY_QUERY_EXCEED_MAX_NUMBER_COUNT";
                break;
            case 563:
                str2 = "TACHYSTICK_REACHABILITY_QUERY_CALLBACK_SUCCESS";
                break;
            case 564:
                str2 = "TACHYSTICK_REACHABILITY_QUERY_CALLBACK_FAILURE";
                break;
            case 565:
                str2 = "TACHYSTICK_REACHABILITY_LOCAL_QUERY_BEGIN";
                break;
            case 566:
                str2 = "TACHYSTICK_REACHABILITY_LOCAL_QUERY_SUCCESS";
                break;
            case 567:
                str2 = "TACHYSTICK_REACHABILITY_LOCAL_QUERY_FAILURE";
                break;
            case 568:
                str2 = "TACHYSTICK_REACHABILITY_SERVER_QUERY_BEGIN";
                break;
            case 569:
                str2 = "TACHYSTICK_REACHABILITY_SERVER_QUERY_SUCCESS";
                break;
            case 570:
                str2 = "TACHYSTICK_REACHABILITY_SERVER_QUERY_FAILURE";
                break;
            case 571:
                str2 = "TACHYSTICK_REACHABILITY_SERVER_QUERY_DISABLED";
                break;
            case 572:
                str2 = "TACHYSTICK_PROMO_SHOWN";
                break;
            case 573:
                str2 = "TACHYSTICK_PROMO_CLICK_INSTALL";
                break;
            case 574:
                str2 = "TACHYSTICK_PROMO_CLICK_NOTHANKS";
                break;
            case 575:
                str2 = "TACHYSTICK_PROMO_CLICK_BLOCK";
                break;
            case 576:
                str2 = "TACHYSTICK_INCOMING_CALL";
                break;
            case 577:
                str2 = "TACHYSTICK_CALL_ACCEPTED";
                break;
            case 578:
                str2 = "TACHYSTICK_CALL_REJECTED";
                break;
            case 579:
                str2 = "TACHYSTICK_CALL_MISSED_CLICKED";
                break;
            case 580:
                str2 = "TACHYSTICK_CALL_ENDED_REMOTE";
                break;
            case 581:
                str2 = "TACHYSTICK_CALL_ENDED_USER";
                break;
            case 582:
                str2 = "TACHYSTICK_CALL_ENDED_NETWORK";
                break;
            case 583:
                str2 = "TACHYSTICK_CALL_ENDED_WEBRTC";
                break;
            case 584:
                str2 = "TACHYSTICK_CALL_ENDED_OTHER";
                break;
            case 585:
                str2 = "TACHYSTICK_CALL_RATING_GOOD";
                break;
            case 586:
                str2 = "TACHYSTICK_CALL_RATING_BAD";
                break;
            case 587:
                str2 = "TACHYSTICK_CALL_RATING_SKIP";
                break;
            case 588:
                str2 = "TACHYSTICK_CALL_RATING_SHOWN";
                break;
            case 589:
                str2 = "TACHYSTICK_CALL_SERVICE_DISCONNECTED";
                break;
            case 590:
                str2 = "TACHYSTICK_NO_CAMERA_OR_MICROPHONE_PERMISSION";
                break;
            case 591:
                str2 = "TACHYSTICK_CALL_MISSED_SHOWN";
                break;
            case 592:
                str2 = "TACHYSTICK_CALL_ENDED_INVITATION_CANCELED";
                break;
            case 593:
                str2 = "TACHYSTICK_CALL_ENDED_ICE_DISCONNECT";
                break;
            case 594:
                str2 = "TACHYSTICK_CALL_ENDED_APP_EXIT_ABNORMAL";
                break;
            case 595:
                str2 = "TACHYSTICK_CALL_ENDED_APP_EXIT_NORMAL";
                break;
            case 596:
                str2 = "TACHYSTICK_CALL_ENDED_CALL_ERROR";
                break;
            case 597:
                str2 = "TACHYSTICK_CALL_ENDED_AUTH_ERROR";
                break;
            case 598:
                str2 = "TACHYSTICK_CALL_ENDED_BACKEND_ERROR";
                break;
            case 599:
                str2 = "TACHYSTICK_CALL_ENDED_CELL_CALL";
                break;
            case 600:
                str2 = "TACHYSTICK_CALL_ENDED_USER_REJECTED";
                break;
            default:
                str2 = "TACHYSTICK_REACHABILITY_SERVER_QUERY_UNAUTHORIZED";
                break;
        }
        objArr[0] = str2;
        try {
            azph.m85998a(this.f12937a).mo55143a(i, this.f12939c, str);
        } catch (SecurityException e) {
            azoj.m85931a("TSReachabilitySvr", e, "Failed to log event", new Object[0]);
        }
    }

    /* renamed from: a */
    private final void m8196a(String str, ddl ddl) {
        m8195a(564, str);
        try {
            ddl.mo8543a(new HashMap());
        } catch (RemoteException e) {
            azoj.m85931a("TSReachabilitySvr", e, "Got an exception in callback.onFinished()", new Object[0]);
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ddl ddl;
        boolean z;
        if (i != 1) {
            return false;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        IBinder readStrongBinder = parcel.readStrongBinder();
        String str = null;
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback");
            ddl = queryLocalInterface instanceof ddl ? (ddl) queryLocalInterface : new ddl(readStrongBinder);
        } else {
            ddl = null;
        }
        try {
            azcv a = azcv.m85357a(this.f12937a);
            LocalEntityId a2 = a.mo54692a(false);
            this.f12939c = a2;
            if (a2 == null) {
                this.f12939c = a.mo54691a();
            }
        } catch (SecurityException e) {
            azoj.m85931a("TSReachabilitySvr", e, "Error while getting default user", new Object[0]);
            this.f12939c = null;
        }
        azat azat = this.f12938b;
        int callingUid = Binder.getCallingUid();
        String[] packagesForUid = azat.f98882a.getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            azoj.m85932b("ServiceAuthorizer", "Unable to find packages for %s", Integer.valueOf(callingUid));
        } else {
            str = packagesForUid[0];
        }
        new Object[1][0] = str;
        m8195a(558, str);
        if (createStringArrayList == null || createStringArrayList.isEmpty()) {
            azoj.m85933c("TSReachabilitySvr", "queryReachability: unable to query due to empty list.", new Object[0]);
            m8195a(561, str);
            azbi.m85189a("Empty number list.");
        }
        if (((long) createStringArrayList.size()) > cfeo.f183719a.mo6606a().mo81063co()) {
            azoj.m85933c("TSReachabilitySvr", "exceeds the max allowed query size. (%s)", Integer.valueOf(createStringArrayList.size()));
            m8195a(562, str);
            azbi.m85189a("Too many numbers in the request.");
        }
        if (!this.f12938b.mo54557a(str, cfeo.f183719a.mo6606a().mo81061cm(), cfeo.f183719a.mo6606a().mo81062cn())) {
            azoj.m85930a("TSReachabilitySvr", "Unauthorized caller.", new Object[0]);
            m8195a(601, str);
            if (!cfeo.f183719a.mo6606a().mo81064cp()) {
                m8196a(str, ddl);
                return true;
            }
            String valueOf = String.valueOf(str);
            azbi.m85189a(valueOf.length() == 0 ? new String("Unauthorized package ") : "Unauthorized package ".concat(valueOf));
        }
        new Object[1][0] = str;
        if (cfeo.f183719a.mo6606a().mo81060cl()) {
            azbi.m85188a(this.f12937a, "from reachability query");
            new Object[1][0] = createStringArrayList;
            bnic a3 = bnic.m109495a((Collection) createStringArrayList);
            try {
                HashMap hashMap = new HashMap();
                if (this.f12939c != null || azpi.m86078b(this.f12937a, "com.google.android.apps.tachyon")) {
                    z = true;
                } else {
                    z = false;
                }
                bnrd a4 = a3.iterator();
                while (a4.hasNext()) {
                    String str2 = (String) a4.next();
                    if (!hashMap.containsKey(str2)) {
                        if (!z) {
                            m8194a(str2, hashMap).putString("STATUS", "SETUP_AND_CALL");
                        } else {
                            Bundle a5 = m8194a(str2, hashMap);
                            a5.putString("STATUS", "CALL");
                            a5.putBoolean("VIDEO_CALLABLE", true);
                            a5.putBoolean("AUDIO_CALLABLE", true);
                        }
                    }
                }
                ddl.mo8543a(hashMap);
                m8195a(563, str);
            } catch (RemoteException e2) {
                azoj.m85931a("TSReachabilitySvr", e2, "Got an exception in callback.onFinished()", new Object[0]);
                m8195a(564, str);
            }
        } else {
            m8195a(560, str);
            azoj.m85932b("TSReachabilitySvr", "Reachability service is disabled", new Object[0]);
            m8196a(str, ddl);
        }
        return true;
    }
}
