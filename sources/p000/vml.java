package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* renamed from: vml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vml {

    /* renamed from: a */
    public final Intent f49526a;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public vml(Context context, String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.PICK");
        this.f49526a = intent;
        intent.setClassName(context, "com.google.android.gms.drive.ui.select.SelectFileActivity");
        sdo.m34969a(str, (Object) "Account Name not specified");
        sdo.checkIfNull((Object) str2, (Object) "Authorized app not specified");
        this.f49526a.putExtra("accountName", str);
        this.f49526a.putExtra("callerSdkAppId", str2);
        this.f49526a.putExtra("callerPackageName", str3);
    }

    /* renamed from: a */
    public final void mo28638a(DriveId driveId) {
        this.f49526a.putExtra("initialFolderId", driveId);
    }

    /* renamed from: a */
    public final void mo28639a(Filter filter) {
        this.f49526a.putExtra("filterHolder", new FilterHolder(filter));
    }

    /* renamed from: a */
    public final void mo28640a(String str) {
        this.f49526a.putExtra("dialogTitle", str);
    }

    /* renamed from: a */
    public final void mo28641a(boolean z) {
        this.f49526a.putExtra("authorizeResource", z);
    }
}
