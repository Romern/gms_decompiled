package p000;

import android.content.ContentValues;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: aytn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytn implements ciwl, ciwn, ciwr, ciwt {

    /* renamed from: a */
    public final aytm f98453a;

    /* renamed from: b */
    public final aytq f98454b;

    /* renamed from: c */
    public final aytk f98455c;

    /* renamed from: d */
    private final ayto f98456d;

    public aytn(aytm aytm, ayto ayto, aytq aytq, aytk aytk) {
        this.f98453a = aytm;
        this.f98456d = ayto;
        this.f98454b = aytq;
        this.f98455c = aytk;
    }

    /* renamed from: a */
    public final civf mo54421a() {
        return this.f98455c.f98451b;
    }

    /* renamed from: b */
    public final boolean mo54425b(civo civo) {
        return this.f98456d.mo54426c(civo) != null;
    }

    /* renamed from: a */
    public final ciwo mo54423a(civo civo) {
        ciwo c = this.f98456d.mo54426c(civo);
        return c == null ? new ciwo() : c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final void mo54424a(civo civo, ciwo ciwo) {
        ayti ayti = this.f98456d.f98457a;
        String str = civo.f191537a;
        ayti.m84787a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_id", str);
        contentValues.put("device_id", (Integer) 0);
        LinkedList linkedList = new LinkedList();
        Iterator it = ciwo.f191603b.iterator();
        while (it.hasNext()) {
            linkedList.add(((ciwq) it.next()).f191608a);
        }
        bxvd da = ciwv.f191616d.mo74144da();
        cixb cixb = ciwo.f191602a.f191608a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciwv ciwv = (ciwv) da.f164949b;
        cixb.getClass();
        ciwv.f191619b = cixb;
        ciwv.f191618a |= 1;
        if (!ciwv.f191620c.mo73666a()) {
            ciwv.f191620c = GeneratedMessageLite.m124021a(ciwv.f191620c);
        }
        bxsy.m123078a(linkedList, ciwv.f191620c);
        contentValues.put("session_record", ((ciwv) da.mo74062i()).serializeToBytes());
        ayti.f98447a.insertWithOnConflict("crypto_sessions", null, contentValues, 5);
    }

    /* renamed from: a */
    public final void mo54422a(String str, cive cive) {
        ayti ayti = this.f98455c.f98450a;
        ayti.m84787a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("sender", str);
        contentValues.put("identity_key", cive.mo86588a());
        ayti.f98447a.insertWithOnConflict("crypto_identity_keys", null, contentValues, 5);
    }
}
