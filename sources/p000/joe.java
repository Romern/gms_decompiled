package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.HashSet;
import java.util.Set;

/* renamed from: joe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class joe extends aaab {

    /* renamed from: a */
    private final rnt f22926a;

    /* renamed from: b */
    private final String f22927b;

    /* renamed from: c */
    private final Role f22928c;

    /* renamed from: d */
    private final jsm f22929d;

    public joe(rnt rnt, String str, Role role, jsm jsm) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "AddChannelCallback");
        sdo.m34959a(rnt);
        this.f22926a = rnt;
        this.f22927b = str;
        this.f22928c = role;
        this.f22929d = jsm;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Status status;
        String str = this.f22927b;
        if (str != null && !str.isEmpty() && this.f22929d != null && jqd.m17110a(this.f22928c)) {
            rex rex = new rex();
            jpg a = FirstPartyDeviceRegistrationChimeraService.m6794a(rex, context);
            if (a == null) {
                this.f22926a.mo11797a(Status.f30109c);
                return;
            }
            rnt rnt = this.f22926a;
            String str2 = this.f22927b;
            Role role = this.f22928c;
            jsm jsm = this.f22929d;
            FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService = a.f22969a;
            Logger Logger = FirstPartyDeviceRegistrationChimeraService.f11168a;
            String valueOf = String.valueOf(role.f11146b);
            Logger.mo25412b(valueOf.length() == 0 ? new String("Adding callback for ") : "Adding callback for ".concat(valueOf), new Object[0]);
            if (firstPartyDeviceRegistrationChimeraService.f11169b.f22991b.mo13908b(str2, role.mo7789a())) {
                synchronized (firstPartyDeviceRegistrationChimeraService.f11170c) {
                    joh joh = firstPartyDeviceRegistrationChimeraService.f11171d;
                    sdo.m34974b(!"tqcf".equals(role.f11146b));
                    jrd b = joh.mo13939b(str2, role.mo7789a());
                    if (b != null) {
                        try {
                            String str3 = role.f11146b;
                            for (jrb jrb : b.f23113a) {
                                jrb.mo14015a(jsm, str3);
                            }
                        } catch (RemoteException e) {
                        }
                    }
                    jog jog = new jog(str2, role.f11146b, role.mo7789a());
                    Set hashSet = !joh.f22936a.containsKey(jog) ? new HashSet() : (Set) joh.f22936a.get(jog);
                    hashSet.add(jsm);
                    joh.f22936a.put(jog, hashSet);
                    status = Status.f30107a;
                }
            } else {
                status = Status.f30109c;
            }
            rnt.mo11797a(status);
            skh.m35531a().mo25689a(context, rex);
            return;
        }
        this.f22926a.mo11797a(Status.f30109c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22926a.mo11797a(status);
    }
}
