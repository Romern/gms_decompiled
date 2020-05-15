package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.EmailAddressEntity;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: apey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apey extends aaab {

    /* renamed from: a */
    final aoyh f84277a = aoyh.m69805a("GetCachedBackedUpOp");

    /* renamed from: b */
    private final String f84278b;

    /* renamed from: c */
    private final String f84279c;

    /* renamed from: d */
    private final String[] f84280d;

    /* renamed from: e */
    private final apbn f84281e;

    public apey(apbn apbn, String str, String str2, String[] strArr) {
        super(135, "GetCachedBackedUpContacts");
        this.f84278b = str;
        this.f84281e = apbn;
        this.f84279c = str2;
        this.f84280d = strArr;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        ArrayList arrayList = new ArrayList();
        bmxv a = apfa.f84284a.mo47145a(this.f84278b, this.f84279c, this.f84280d);
        if (a.mo66813a()) {
            bxwc bxwc = ((btem) a.mo66814b()).f148534a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                btfi btfi = (btfi) bxwc.get(i);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                bxwc bxwc2 = btfi.f148661d;
                int size2 = bxwc2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    apbz apbz = new apbz();
                    apbz.f84121a = ((btfd) bxwc2.get(i2)).f148615a;
                    arrayList2.add(new EmailAddressEntity(apbz.mo47092a()));
                }
                bxwc bxwc3 = btfi.f148662e;
                int size3 = bxwc3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    apcb apcb = new apcb();
                    apcb.f84122a = ((btff) bxwc3.get(i3)).f148638a;
                    arrayList3.add(new PhoneNumberEntity(apcb.mo47095a()));
                }
                arrayList.add(new RawContactEntity(btfi.f148658a, arrayList2, arrayList3));
            }
        } else {
            this.f84277a.mo46986d("No contacts found in cache for account : %s, device id : %s ", this.f84278b, this.f84279c);
        }
        this.f84277a.mo46979a("Number of contacts found for account :  %s, deviceId : %s, Sources : %s is %d", this.f84278b, this.f84279c, Arrays.toString(this.f84280d), Integer.valueOf(arrayList.size()));
        this.f84281e.mo46967a(Status.f30107a, arrayList);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84281e.mo46967a(status, null);
    }
}
