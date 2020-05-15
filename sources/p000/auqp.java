package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: auqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auqp extends dck implements auqq {

    /* renamed from: a */
    private final String f92300a;

    /* renamed from: b */
    private final aurl f92301b;

    public auqp() {
        super("com.google.android.gms.trustagent.internal.ITrustletServiceCallback");
    }

    /* renamed from: a */
    public final void mo50809a(Bundle bundle) {
        String str;
        aurl aurl = this.f92301b;
        aumv a = aumv.m77337a(bundle);
        if (cgzt.m147783h()) {
            try {
                auox a2 = auox.m77526a();
                a2.f92240e.execute(new auow(a2, a));
            } catch (aumn e) {
                aurl.f92332a.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
            }
            String str2 = (String) a.mo50671a(aumv.f92111h);
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) aumv.m77338a(str2).get("trustlet_source");
            if (str3 != null) {
                String b = a.mo50681b();
                StringBuilder sb = new StringBuilder(b.length() + 1 + str3.length());
                sb.append(b);
                sb.append(" ");
                sb.append(str3);
                str = sb.toString();
            } else {
                str = a.mo50681b();
            }
            aurl.mo50831a((String) a.mo50671a(aumv.f92110g), str);
        }
    }

    public auqp(String str, aurl aurl) {
        super("com.google.android.gms.trustagent.internal.ITrustletServiceCallback");
        sdo.m34959a((Object) str);
        this.f92300a = str;
        sdo.m34959a(aurl);
        this.f92301b = aurl;
    }

    /* renamed from: a */
    public final void mo50810a(boolean z, boolean z2, boolean z3, String str, String str2) {
        aurl aurl = this.f92301b;
        String str3 = this.f92300a;
        aurl.f92332a.mo50711a("onTrustConfigurationChanged. trustletName: %s, isConfigured: %s, canProvideTrust: %s, isTrusted: %s, reason: %s, extra: %s", str3, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), str, str2);
        synchronized (aurl.f92336e) {
            if (z3) {
                aurl.f92341j.put(str3, str2);
            } else {
                aurl.f92341j.remove(str3);
            }
        }
        aurl.mo50837c();
        aurl.mo50836b(str);
    }

    /* renamed from: a */
    public final boolean mo50811a() {
        return this.f92301b.mo50840e();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo50810a(dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel), parcel.readString(), parcel.readString());
        } else if (i == 2) {
            boolean a = mo50811a();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a);
        } else if (i != 3) {
            return false;
        } else {
            mo50809a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
