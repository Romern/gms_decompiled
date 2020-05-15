package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;

/* renamed from: bcbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcbw {
    /* renamed from: a */
    public static bmxv m88776a(HashMap hashMap) {
        try {
            bcsk f = ContactId.m94830f();
            f.mo57453b((String) hashMap.get("ID"));
            f.mo57454c((String) hashMap.get("TACHYON_APP_NAME"));
            f.mo57451a(ContactId.ContactType.m94837a(((Integer) hashMap.get("TYPE")).intValue()));
            f.mo57452a((String) hashMap.get("HANDLER_ID"));
            return bmxv.m108566b(f.mo57450a());
        } catch (Exception e) {
            bbos.m88294d("ContactIdConverters", "failed to convert HashMap to ContactId");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static HashMap m88777a(ContactId contactId) {
        HashMap hashMap = new HashMap();
        hashMap.put("ID", contactId.mo60492a());
        hashMap.put("TACHYON_APP_NAME", contactId.mo60493b());
        hashMap.put("TYPE", Integer.valueOf(contactId.mo60494c().f111365f));
        bmxv d = contactId.mo60495d();
        if (d.mo66813a()) {
            hashMap.put("HANDLER_ID", d.mo66814b());
        }
        return hashMap;
    }
}
