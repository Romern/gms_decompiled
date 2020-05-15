package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.locationsharing.api.LocationSharingChimeraService;

/* renamed from: aeso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeso implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Intent f63738a;

    /* renamed from: b */
    final /* synthetic */ PendingIntent f63739b;

    /* renamed from: c */
    final /* synthetic */ LocationSharingChimeraService f63740c;

    public aeso(LocationSharingChimeraService locationSharingChimeraService, Intent intent, PendingIntent pendingIntent) {
        this.f63740c = locationSharingChimeraService;
        this.f63738a = intent;
        this.f63739b = pendingIntent;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        Intent intent = this.f63738a;
        boolean z = false;
        if (bmxv.mo66813a() && ((ReportingState) bmxv.mo66814b()).mo43731b() > 0) {
            z = true;
        }
        intent.putExtra("is_location_history_enabled", z);
        this.f63740c.mo43752a(this.f63739b, this.f63738a);
    }

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
    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f63738a.putExtra("is_location_history_enabled", false);
        this.f63740c.mo43752a(this.f63739b, this.f63738a);
    }
}
