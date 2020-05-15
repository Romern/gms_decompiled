package p000;

import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: acma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acma extends acly {
    public acma(Resources resources) {
        super(resources, "data1", "data2", "data3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo32876a(Resources resources, int i, String str) {
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
    public final void mo32877a(acmz acmz, long j, String str, int i, String str2, int i2) {
        boolean z;
        acmz acmz2 = acmz;
        if (acmz2.f60214f != -1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "contactId must be set");
        acmu.m49482a(acmz2.f60209a.f60192b, str);
        acmv acmv = acmz2.f60211c;
        acmv.f60204a.put(Long.valueOf(j), acms.m49463a(acmz2.f60214f, j, str, i, str2, i2));
    }
}
