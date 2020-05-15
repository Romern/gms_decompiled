package p000;

import android.content.Intent;

/* renamed from: ansi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansi {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static final Intent m65104a(String str, String str2, String str3, String str4, String str5, int i) {
        Intent intent = new Intent("com.google.android.gms.plus.circles.ACTION_ADD_TO_CIRCLE_CONSENT").setPackage("com.google.android.gms");
        sdo.m34969a(str, (Object) "accountName");
        Intent putExtra = intent.putExtra("com.google.android.gms.plus.circles.EXTRA_ACCOUNT_NAME", str).putExtra("com.google.android.gms.plus.circles.EXTRA_PAGE_ID", str2);
        sdo.m34969a(str3, (Object) "consentHtml");
        Intent putExtra2 = putExtra.putExtra("com.google.android.gms.plus.circles.EXTRA_CONSENT_HTML", str3);
        sdo.m34969a(str4, (Object) "titleText");
        Intent putExtra3 = putExtra2.putExtra("com.google.android.gms.plus.circles.EXTRA_TITLE_TEXT", str4);
        sdo.m34969a(str5, (Object) "buttonText");
        return putExtra3.putExtra("com.google.android.gms.plus.circles.EXTRA_BUTTON_TEXT", str5).putExtra("com.google.android.gms.plus.circles.EXTRA_APPLICATION_ID", i);
    }
}
