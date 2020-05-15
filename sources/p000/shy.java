package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* renamed from: shy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shy {

    /* renamed from: a */
    public final Intent f44517a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public shy(Context context) {
        this(new Intent("com.google.android.gms.plus.service.default.INTENT").putExtra("isLoggingIntent", true).setClassName(context, "com.google.android.gms.plus.service.DefaultIntentService"));
    }

    /* renamed from: a */
    public final String mo25572a() {
        return this.f44517a.getStringExtra("accountName");
    }

    /* renamed from: b */
    public final FavaDiagnosticsEntity mo25577b() {
        return (FavaDiagnosticsEntity) this.f44517a.getParcelableExtra("startView");
    }

    /* renamed from: c */
    public final FavaDiagnosticsEntity mo25580c() {
        return (FavaDiagnosticsEntity) this.f44517a.getParcelableExtra("endView");
    }

    /* renamed from: d */
    public final FavaDiagnosticsEntity mo25583d() {
        return (FavaDiagnosticsEntity) this.f44517a.getParcelableExtra("action");
    }

    /* renamed from: e */
    public final Intent mo25584e() {
        sdo.m34959a((Object) mo25572a());
        sdo.m34959a(mo25577b());
        if (mo25583d() == null) {
            sdo.m34959a(mo25580c());
        } else if (mo25580c() == null) {
            sdo.m34959a(mo25583d());
        }
        return this.f44517a;
    }

    /* renamed from: a */
    public final void mo25573a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        this.f44517a.putExtra("action", favaDiagnosticsEntity);
    }

    /* renamed from: b */
    public final void mo25578b(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        this.f44517a.putExtra("endView", favaDiagnosticsEntity);
    }

    /* renamed from: c */
    public final void mo25581c(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        this.f44517a.putExtra("startView", favaDiagnosticsEntity);
    }

    public shy(Intent intent) {
        this.f44517a = intent;
    }

    /* renamed from: a */
    public final void mo25574a(ActionTargetEntity actionTargetEntity) {
        this.f44517a.putExtra("actionTarget", actionTargetEntity);
    }

    /* renamed from: b */
    public final void mo25579b(String str) {
        this.f44517a.putExtra("callingPackage", str);
    }

    /* renamed from: c */
    public final void mo25582c(String str) {
        if (str != null) {
            this.f44517a.putExtra("plusPageId", str);
        }
    }

    /* renamed from: a */
    public final void mo25575a(ClientActionDataEntity clientActionDataEntity) {
        this.f44517a.putExtra("clientActionData", clientActionDataEntity);
    }

    /* renamed from: a */
    public final void mo25576a(String str) {
        this.f44517a.putExtra("accountName", str);
    }
}
