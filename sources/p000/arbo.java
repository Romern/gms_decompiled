package p000;

import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: arbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arbo extends ahin {

    /* renamed from: a */
    final /* synthetic */ arbr f87291a;

    /* renamed from: b */
    private final byte[] f87292b;

    public arbo(arbr arbr, byte[] bArr) {
        this.f87291a = arbr;
        this.f87292b = bArr;
    }

    /* renamed from: a */
    public final void mo20146a(String str) {
        arbr.f87299b.mo25416d("Lost connection to target endpoint: %s", str);
    }

    /* renamed from: a */
    public final void mo20147a(String str, ahij ahij) {
        arbr.f87299b.mo25412b("Found endpoint: %s", str);
        arnt a = arns.m73193a(ahij.f67242b);
        arnq b = a.mo48699b();
        byte[] c = b.mo48694c();
        arbr.f87299b.mo25409a("Device name: %s", a.mo48698a());
        if (!Arrays.equals(this.f87292b, c)) {
            arbr.f87299b.mo25412b("Ignoring device with fast pair code %s.", Arrays.toString(c));
            return;
        }
        this.f87291a.mo48373b();
        arbr.f87299b.mo25409a("Requesting connection to device: %s (%s)", ahij.f67242b, str);
        arbr arbr = this.f87291a;
        arbr.f87304g = str;
        arbr.f87306i = b.mo48692a();
        Status a2 = ascs.m73792a(this.f87291a.mo48370a(str, cgql.m146578c(), this.f87291a.f87310m));
        if (!a2.equals(Status.f30107a)) {
            sek sek = arbr.f87299b;
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Request Connection failed: ");
            sb.append(valueOf);
            sek.mo25416d(sb.toString(), new Object[0]);
            arbr arbr2 = this.f87291a;
            arbr2.f87304g = null;
            armu armu = arbr2.f87302e;
            if (armu != null) {
                armu.mo48348a(10584);
            }
        }
    }
}
