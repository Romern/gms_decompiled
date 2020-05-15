package p000;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.internal.EventListenerRequest;
import java.util.Map;
import java.util.Set;

/* renamed from: agtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtp extends aaab {

    /* renamed from: g */
    private static final srn f66503g = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final agrf f66504a;

    /* renamed from: b */
    private final EventListenerRequest f66505b;

    /* renamed from: c */
    private final agqu f66506c;

    /* renamed from: d */
    private final Object f66507d = new Object();

    /* renamed from: e */
    private volatile Context f66508e;

    /* renamed from: f */
    private agrl f66509f;

    public agtp(agrf agrf, EventListenerRequest eventListenerRequest) {
        super(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "AddEventListener");
        this.f66504a = agrf;
        if (cfmq.m140247r()) {
            if (eventListenerRequest != null && eventListenerRequest.f80299e == null) {
                agra agra = new agra(eventListenerRequest);
                Long valueOf = Long.valueOf(agrl.m54947b());
                EventListenerRequest eventListenerRequest2 = agra.f66309a;
                eventListenerRequest2.f80299e = valueOf;
                eventListenerRequest = eventListenerRequest2;
            }
            if (eventListenerRequest != null && eventListenerRequest.f80298d == null) {
                EventListenerRequest eventListenerRequest3 = new agra(eventListenerRequest).f66309a;
                eventListenerRequest3.f80298d = 0;
                eventListenerRequest = eventListenerRequest3;
            }
        }
        this.f66505b = eventListenerRequest;
        this.f66506c = new agqu();
    }

    /* renamed from: a */
    private final agrl m55109a() {
        agrl agrl;
        synchronized (this.f66507d) {
            if (this.f66509f == null) {
                this.f66509f = agrl.m54943a(this.f66508e);
            }
            agrl = this.f66509f;
        }
        return agrl;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        Status status;
        Status status2;
        this.f66508e = context;
        EventListenerRequest eventListenerRequest = this.f66505b;
        if (eventListenerRequest != null && !TextUtils.isEmpty(eventListenerRequest.f80296b)) {
            agrl a = m55109a();
            EventListenerRequest eventListenerRequest2 = this.f66505b;
            String str = eventListenerRequest2.f80296b;
            boot a2 = a.mo35978a(18, "GTAF_Server", str != null ? str.length() == 0 ? new String("CLIENT_") : "CLIENT_".concat(str) : "CLIENT_TestInvalid");
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((bxvk) a2);
            if (cfmq.m140238i()) {
                agrl.m54945a(bxvd, eventListenerRequest2.f80300f);
            }
            bxvd da = bopo.f134154d.mo74144da();
            int i = eventListenerRequest2.f80295a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bopo bopo = (bopo) da.f164949b;
            bopo.f134156a = i;
            String str2 = eventListenerRequest2.f80296b;
            if (str2 == null) {
                str2 = "";
            }
            str2.getClass();
            bopo.f134157b = str2;
            bopo.f134158c = eventListenerRequest2.f80297c;
            bopo bopo2 = (bopo) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            bopo2.getClass();
            ((boot) bxvd.f164949b).f134014q = bopo2;
            Long l = eventListenerRequest2.f80299e;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((boot) bxvd.f164949b).f134015r = j;
            a.mo35995a((boot) bxvd.mo74062i(), bygd.REGISTER_LISTENER_REQUEST, eventListenerRequest2.f80298d);
            EventListenerRequest eventListenerRequest3 = this.f66505b;
            if (!eventListenerRequest3.f80297c) {
                agqu agqu = this.f66506c;
                if (!agqg.m54834A().booleanValue()) {
                    status2 = new Status(27013, "Event Listener Not Enabled");
                } else {
                    sdo.m34959a(eventListenerRequest3);
                    String str3 = eventListenerRequest3.f80296b;
                    sdo.m34959a((Object) str3);
                    int b = agnt.m54674b(eventListenerRequest3.f80295a);
                    synchronized (agqu.f66286a) {
                        agqu.mo35955a();
                        Map map = agqu.f66288b;
                        String a3 = agnt.m54672a(b);
                        if (b == 0) {
                            throw null;
                        } else if (!((Set) map.get(a3)).remove(str3)) {
                            ((bnsl) agqu.f66287d.mo68388c()).mo68420a("%s hasn't registered for event listener before", str3);
                            status2 = new Status(27015, String.format("%s hasn't registered for event listener before", str3));
                        } else {
                            status2 = agqu.mo35956b();
                        }
                    }
                }
                if (!status2.equals(Status.f30107a)) {
                    mo6503a(status2);
                    return;
                }
            } else {
                agqu agqu2 = this.f66506c;
                if (!agqg.m54834A().booleanValue()) {
                    status = new Status(27013, "Event Listener Not Enabled");
                } else {
                    sdo.m34959a(eventListenerRequest3);
                    String str4 = eventListenerRequest3.f80296b;
                    if (!TextUtils.isEmpty(str4)) {
                        int b2 = agnt.m54674b(eventListenerRequest3.f80295a);
                        synchronized (agqu.f66286a) {
                            agqu2.mo35955a();
                            Map map2 = agqu2.f66288b;
                            String a4 = agnt.m54672a(b2);
                            if (b2 != 0) {
                                Set set = (Set) map2.get(a4);
                                if (!set.add(str4)) {
                                    ((bnsl) agqu.f66287d.mo68388c()).mo68420a("%s already registered for event listener before", str4);
                                    status = new Status(27014, String.format("%s already registered for event listener before", str4));
                                } else {
                                    Map map3 = agqu2.f66288b;
                                    String a5 = agnt.m54672a(b2);
                                    if (b2 != 0) {
                                        map3.put(a5, set);
                                        status = agqu2.mo35956b();
                                    } else {
                                        throw null;
                                    }
                                }
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        status = new Status(27016, "Empty Package Name");
                    }
                }
                if (!status.equals(Status.f30107a)) {
                    mo6503a(status);
                    return;
                }
            }
            try {
                this.f66504a.mo35969b(Status.f30107a);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f66503g.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Unable to complete UpdateEventListener callback for success. Error: %s", bryx.m114908a(e.getMessage()));
            }
        } else {
            mo6503a(new Status(27000, "Invalid Argument, need a non-empty package name request"));
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        String str;
        Integer num;
        Long l;
        f66503g.mo26019b(agyt.m55307c()).mo68405a("UpdateEventListenerOperation failed");
        agrl a = m55109a();
        bygd bygd = bygd.REGISTER_LISTENER_FAILURE;
        long j = (long) status.f30115i;
        EventListenerRequest eventListenerRequest = this.f66505b;
        if (eventListenerRequest != null) {
            String valueOf = String.valueOf(eventListenerRequest.f80296b);
            str = valueOf.length() == 0 ? new String("CLIENT_") : "CLIENT_".concat(valueOf);
        } else {
            str = "CLIENT_TestInvalid";
        }
        String str2 = str;
        EventListenerRequest eventListenerRequest2 = this.f66505b;
        if (eventListenerRequest2 != null) {
            num = eventListenerRequest2.f80298d;
        } else {
            num = null;
        }
        if (eventListenerRequest2 != null) {
            l = eventListenerRequest2.f80299e;
        } else {
            l = null;
        }
        a.mo36004a(bygd, j, str2, (String) null, num, l);
        try {
            this.f66504a.mo35969b(status);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66503g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api callback for failure: %s with status: {%s}", bryx.m114908a(e.getMessage()), bryx.m114908a(status));
        }
    }
}
