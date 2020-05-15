package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aewr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewr implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63956a;

    public aewr(UpdateSharesChimeraActivity updateSharesChimeraActivity) {
        this.f63956a = updateSharesChimeraActivity;
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
    public final void mo34636a(LocationShare locationShare) {
        aexw.m52662a(this.f63956a);
        if (locationShare != null) {
            Toast.makeText(this.f63956a, (int) C0126R.string.location_sharing_link_created, 0).show();
            ActivityInfo activityInfo = this.f63956a.f79756g.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addCategory("android.intent.category.LAUNCHER");
            int i = Build.VERSION.SDK_INT;
            intent.setFlags(270565376);
            intent.setComponent(componentName);
            intent.putExtra("android.intent.extra.TEXT", this.f63956a.getString(C0126R.string.location_sharing_share_text, new Object[]{locationShare.mo43758e()}));
            intent.setType("text/plain");
            this.f63956a.startActivity(intent);
            Intent c = this.f63956a.mo43827c(bnkn.m109665a(locationShare.f79627a));
            c.putExtra("is_finished", true);
            sef.m35072a(bnkn.m109665a(locationShare), c, "target_location_shares");
            this.f63956a.setResult(-1, c);
            this.f63956a.finish();
            try {
                ((PendingIntent) this.f63956a.getIntent().getParcelableExtra("pending_intent")).send(this.f63956a, 2, c);
            } catch (PendingIntent.CanceledException e) {
                bqye.m113758a(e);
            }
            this.f63956a.finish();
        } else {
            aexq.m52658a(this.f63956a);
        }
        this.f63956a.f79756g = null;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String str;
        UpdateSharesChimeraActivity updateSharesChimeraActivity = this.f63956a;
        CharSequence loadLabel = updateSharesChimeraActivity.f79756g.loadLabel(updateSharesChimeraActivity.getPackageManager());
        if (loadLabel != null) {
            str = loadLabel.toString();
        } else {
            str = null;
        }
        UpdateSharesChimeraActivity updateSharesChimeraActivity2 = this.f63956a;
        return new aevp(updateSharesChimeraActivity2, updateSharesChimeraActivity2.f79750a, str, updateSharesChimeraActivity2.mo43824b());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mo34636a((LocationShare) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
