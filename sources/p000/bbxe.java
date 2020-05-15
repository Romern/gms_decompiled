package p000;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: bbxe */
final /* synthetic */ class bbxe implements Callable {

    /* renamed from: a */
    private final bbxm f103654a;

    /* renamed from: b */
    private final bmxv f103655b;

    public bbxe(bbxm bbxm, bmxv bmxv) {
        this.f103654a = bbxm;
        this.f103655b = bmxv;
    }

    public final Object call() {
        boolean z;
        bbxm bbxm = this.f103654a;
        bmxv bmxv = this.f103655b;
        bctx c = bcty.m89986c();
        bbon.m88284a();
        c.mo57555a(Long.valueOf(System.currentTimeMillis()));
        c.mo57556a(bbpw.m88374a(bbxm.f103675a).mo56349a());
        bcty a = c.mo57554a();
        bdaw bdaw = bbxm.f103676b;
        ContactId e = ((bcoh) bmxv.mo66814b()).mo57058b().mo57074e();
        try {
            ContentValues contentValues = new ContentValues();
            HashMap hashMap = new HashMap();
            hashMap.put("last_reported_capabilities", new ArrayList(((bcry) a).f104767b));
            hashMap.put("last_reported_capabilities_time_ms", ((bcry) a).f104766a);
            contentValues.put("registration_properties", bbqu.m88422a((Serializable) hashMap));
            z = ((bcav) bdaw).mo56671a(e, contentValues);
        } catch (IOException e2) {
            bbos.m88294d("SQLiteRegStore", "Failed to update registration properties.");
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
