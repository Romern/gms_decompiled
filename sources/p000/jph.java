package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: jph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jph extends jsl {

    /* renamed from: a */
    final /* synthetic */ FirstPartyDeviceRegistrationChimeraService f22970a;

    public jph(FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService) {
        this.f22970a = firstPartyDeviceRegistrationChimeraService;
    }

    /* renamed from: a */
    public final void mo13884a(String str, int i, int i2, int i3) {
        if (i3 == 3) {
            FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService = this.f22970a;
            sek sek = FirstPartyDeviceRegistrationChimeraService.f11168a;
            jpo jpo = firstPartyDeviceRegistrationChimeraService.f11169b;
            firstPartyDeviceRegistrationChimeraService.mo7800a(jpo.f22995f.mo25819b(new jpj(jpo, str, i, firstPartyDeviceRegistrationChimeraService)));
        }
        if (cchi.f178978a.mo6606a().mo75961k()) {
            String format = String.format(Locale.US, "id:%s|mode:%d", str, Integer.valueOf(i));
            int i4 = 4;
            if (i3 == 0 && i2 == 4) {
                FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService2 = this.f22970a;
                sek sek2 = FirstPartyDeviceRegistrationChimeraService.f11168a;
                int intValue = firstPartyDeviceRegistrationChimeraService2.f11172e.containsKey(format) ? ((Integer) this.f22970a.f11172e.get(format)).intValue() + 1 : 1;
                if (((long) intValue) == cchi.f178978a.mo6606a().mo75960j()) {
                    FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService3 = this.f22970a;
                    jpo jpo2 = firstPartyDeviceRegistrationChimeraService3.f11169b;
                    if (i != 1) {
                        if (i != 2) {
                            i4 = i != 4 ? -1 : 64;
                        } else {
                            i4 = 16;
                        }
                    }
                    RemoteDevice b = jpo2.f22991b.mo13906b(str);
                    for (Role role : jpo2.f22991b.mo13902a(str)) {
                        if ((role.f11147c & i4) > 0) {
                            jpo2.f22991b.mo13905a(str, new Role(role.f11146b, i4));
                            jkf.m16838a(rpr.m34216b(), jpo2.f22991b);
                        }
                    }
                    firstPartyDeviceRegistrationChimeraService3.mo7800a(jpo2.f22995f.mo25819b(new jpn(jpo2, b, i4)));
                    this.f22970a.f11172e.remove(format);
                } else {
                    this.f22970a.f11172e.put(format, Integer.valueOf(intValue));
                }
            } else if (!(i3 == 4 || i3 == 2)) {
                FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService4 = this.f22970a;
                sek sek3 = FirstPartyDeviceRegistrationChimeraService.f11168a;
                firstPartyDeviceRegistrationChimeraService4.f11172e.remove(format);
            }
        }
        FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService5 = this.f22970a;
        sek sek4 = FirstPartyDeviceRegistrationChimeraService.f11168a;
        synchronized (firstPartyDeviceRegistrationChimeraService5.f11170c) {
            for (jsm jsm : this.f22970a.f11171d.mo13937a(str, i)) {
                try {
                    jsm.mo13884a(str, i, i2, i3);
                } catch (RemoteException e) {
                    this.f22970a.f11171d.mo13938a(jsm);
                }
            }
        }
        if (i3 == 3) {
            synchronized (this.f22970a.f11170c) {
                joh joh = this.f22970a.f11171d;
                jrd b2 = joh.mo13939b(str, i);
                if (b2 == null) {
                    jrd jrd = new jrd(snp.m35703a(1, 10), new jof(joh, str, i));
                    jog jog = new jog(str, "tqcf", i);
                    HashSet hashSet = new HashSet();
                    hashSet.add(jrd);
                    joh.f22936a.put(jog, hashSet);
                    jrd.mo14016a();
                } else {
                    b2.mo14016a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r7 != 3567520) goto L_0x0044;
     */
    /* renamed from: a */
    public final void mo13885a(String str, String str2, byte[] bArr) {
        Role role = new Role(str2, 0);
        FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService = this.f22970a;
        sek sek = FirstPartyDeviceRegistrationChimeraService.f11168a;
        synchronized (firstPartyDeviceRegistrationChimeraService.f11170c) {
            joh joh = this.f22970a.f11171d;
            String str3 = role.f11146b;
            HashSet<jsm> hashSet = new HashSet();
            for (jog jog : joh.f22936a.keySet()) {
                if (str.hashCode() == jog.f22933a) {
                    int hashCode = str3.hashCode();
                    int i = jog.f22934b;
                    if (hashCode == i) {
                        hashSet.addAll((Collection) joh.f22936a.get(jog));
                    }
                }
            }
            for (jsm jsm : hashSet) {
                try {
                    jsm.mo13885a(str, str2, bArr);
                } catch (RemoteException e) {
                    this.f22970a.f11171d.mo13938a(jsm);
                }
            }
        }
    }
}
