package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.EmailAddressEntity;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;

/* renamed from: apex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apex extends aaab {

    /* renamed from: a */
    final aoyh f84272a = aoyh.m69805a("GetBackedUpOp");

    /* renamed from: b */
    private final apbn f84273b;

    /* renamed from: c */
    private final String f84274c;

    /* renamed from: d */
    private final String f84275d;

    /* renamed from: e */
    private final String[] f84276e;

    public apex(apbn apbn, String str, String str2, String[] strArr) {
        super(135, "GetBackedUpDeviceContacts");
        this.f84274c = str;
        this.f84273b = apbn;
        this.f84275d = str2;
        this.f84276e = strArr;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        apbn apbn;
        aoyo aoyo = new aoyo(context);
        ArrayList arrayList = new ArrayList();
        try {
            for (btfi btfi : new apbv(context).mo47087a(apbs.m70036a(context, this.f84274c), this.f84275d, this.f84276e, "").f148534a) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (btfd btfd : btfi.f148661d) {
                    apbz apbz = new apbz();
                    apbz.f84121a = btfd.f148615a;
                    arrayList2.add(new EmailAddressEntity(apbz.mo47092a()));
                }
                for (btff btff : btfi.f148662e) {
                    apcb apcb = new apcb();
                    apcb.f84122a = btff.f148638a;
                    arrayList3.add(new PhoneNumberEntity(apcb.mo47095a()));
                }
                arrayList.add(new RawContactEntity(btfi.f148658a, arrayList2, arrayList3));
            }
            this.f84273b.mo46967a(Status.f30107a, arrayList);
            return;
        } catch (gid e) {
            aoyo.mo47009a(e, cgjy.m145765l());
            this.f84272a.mo46985d("Auth Exception when fetching contacts from server");
            apbn = this.f84273b;
        } catch (chuw e2) {
            aoyo.mo47009a(e2, cgjy.m145765l());
            this.f84272a.mo46985d("Operation Exception when fetching contacts from server");
            apbn = this.f84273b;
        } catch (Throwable th) {
            this.f84273b.mo46967a(Status.f30109c, null);
            throw th;
        }
        apbn.mo46967a(Status.f30109c, null);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84273b.mo46967a(status, null);
    }
}
