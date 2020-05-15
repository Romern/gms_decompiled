package p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: owr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class owr implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ owx f38528a;

    public owr(owx owx) {
        this.f38528a = owx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, android.os.Parcelable):void
     arg types: [java.lang.String, android.os.Bundle]
     candidates:
      oxr.a(java.lang.String, java.lang.Object):void
      oxr.a(java.lang.String, android.os.Parcelable):void */
    public void onClick(View view) {
        owx owx = this.f38528a;
        if (owx.f38545b) {
            owx.mo22762a(bpea.FRX_SCREEN_EXIT);
            Bundle bundle = new Bundle();
            bundle.putString("errorTitle", this.f38528a.getString(C0126R.string.common_something_went_wrong));
            owx owx2 = this.f38528a;
            bundle.putString("errorMessage", owx2.getString(C0126R.string.car_frx_apps_installation_aborted_message, oyi.m29996a(owx2.getContext(), ((oxk) this.f38528a.mo22763b().f38582k).mo22677g())));
            this.f38528a.mo22763b().mo22755a("EVENT_APPLICATION_INSTALLATION_FAILED", (Parcelable) bundle);
            return;
        }
        owx.mo22762a(bpea.FRX_SCREEN_CANCELLED);
        this.f38528a.mo22763b().mo22754a("EVENT_APPLICATION_INSTALLATION_CANCELLED");
    }
}
