package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbp extends ahin {

    /* renamed from: a */
    final /* synthetic */ arbr f87293a;

    /* renamed from: b */
    private final String f87294b;

    /* renamed from: c */
    private final String f87295c;

    public arbp(arbr arbr, String str, String str2) {
        this.f87293a = arbr;
        this.f87294b = str;
        this.f87295c = str2;
    }

    /* renamed from: a */
    public final void mo20146a(String str) {
        arbr.f87299b.mo25416d("Lost connection to target endpoint: %s", str);
    }

    /* renamed from: a */
    public final void mo20147a(String str, ahij ahij) {
        aucb aucb;
        arbr.f87299b.mo25412b("Found endpoint: %s", str);
        arnt a = arns.m73193a(ahij.f67242b);
        arnq b = a.mo48699b();
        String b2 = b.mo48693b();
        arbr.f87299b.logVerbose("Device name: %s", a.mo48698a());
        if (this.f87294b.equals(b2)) {
            arbr.f87299b.logVerbose("Requesting connection to device: %s (%s)", ahij.f67242b, str);
            arbr arbr = this.f87293a;
            arbr.f87304g = str;
            arbr.mo48373b();
            String str2 = this.f87295c;
            if (str2 != null) {
                aucb = this.f87293a.mo48370a(str, cgql.m146578c(), new arbq(this.f87293a, str2));
            } else {
                this.f87293a.f87306i = b.mo48692a();
                aucb = this.f87293a.mo48370a(str, cgql.m146578c(), this.f87293a.f87310m);
            }
            Status a2 = ascs.m73792a(aucb);
            if (!a2.equals(Status.f30107a)) {
                Logger Logger = arbr.f87299b;
                String valueOf = String.valueOf(a2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("Request Connection failed: ");
                sb.append(valueOf);
                Logger.mo25416d(sb.toString(), new Object[0]);
                arbr arbr2 = this.f87293a;
                arbr2.f87304g = null;
                armu armu = arbr2.f87302e;
                if (armu != null) {
                    armu.mo48348a(10584);
                    return;
                }
                return;
            }
            return;
        }
        arbr.f87299b.mo25412b("Ignoring device with pairing code %s.", b2);
    }
}
