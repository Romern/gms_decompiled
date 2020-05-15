package p000;

import android.content.ContentValues;
import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: alpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alpq extends alpo {
    public alpq(Resources resources) {
        super(resources, "data1", "data2", "data3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo40632a(Resources resources, int i, String str) {
        return ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, i, str).toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40633a(alqk alqk, long j, String str, int i, String str2, int i2) {
        boolean z;
        if (alqk.f74101f != -1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "contactId must be set");
        alqf.m61514a(alqk.f74096a.f74078b, str);
        alqg alqg = alqk.f74098c;
        long j2 = alqk.f74101f;
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j2));
        Long valueOf = Long.valueOf(j);
        contentValues.put("data_id", valueOf);
        contentValues.put("email", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        alqg.f74091a.put(valueOf, contentValues);
    }
}
