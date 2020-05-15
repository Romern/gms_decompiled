package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesIntentOperation;

/* renamed from: aevh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aevh implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aevn f63885a;

    /* renamed from: b */
    final /* synthetic */ LocationShare f63886b;

    /* renamed from: c */
    final /* synthetic */ Context f63887c;

    /* renamed from: d */
    final /* synthetic */ String f63888d;

    public aevh(aevn aevn, LocationShare locationShare, Context context, String str) {
        this.f63885a = aevn;
        this.f63886b = locationShare;
        this.f63887c = context;
        this.f63888d = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aevn.a(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void
     arg types: [com.google.android.gms.locationsharing.common.model.LocationShare, int]
     candidates:
      aevn.a(android.view.ViewGroup, int):acm
      aevn.a(acm, int):void
      aevn.a(aeut, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      aevn.a(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void */
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
    public void onClick(View view) {
        this.f63885a.mo34608a(this.f63886b, false);
        Context context = this.f63887c;
        String str = this.f63888d;
        LocationShare locationShare = this.f63886b;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.locationsharing.UPDATE_COMPLETE"), 0);
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateSharesIntentOperation.class, "com.google.android.gms.locationsharing.update_shares");
        startIntent.putExtra("account_name", str);
        ShareTarget.m67011a(bnkn.m109665a(locationShare.f79627a), startIntent);
        sef.m35071a(locationShare.f79628b, startIntent, "sharing_condition");
        startIntent.putExtra("is_edit", true);
        startIntent.putExtra("enable_overwrite_all", true);
        startIntent.putExtra("pending_intent", broadcast);
        context.startService(startIntent);
    }
}
