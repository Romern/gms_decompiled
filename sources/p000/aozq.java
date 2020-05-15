package p000;

import android.content.ContentValues;
import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: aozq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aozq extends aozo {
    public aozq(Resources resources) {
        super(resources, "data1", "data2", "data3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo47040a(Resources resources, int i, String str) {
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
    public final void mo47041a(apaw apaw, long j, String str, int i, String str2, int i2) {
        boolean z;
        if (apaw.f84078f != -1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "contactId must be set");
        apar.m69974a(apaw.f84073a.f84056b, str);
        apas apas = apaw.f84075c;
        long j2 = apaw.f84078f;
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j2));
        Long valueOf = Long.valueOf(j);
        contentValues.put("data_id", valueOf);
        contentValues.put("email", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        apas.f84068a.put(valueOf, contentValues);
    }
}
