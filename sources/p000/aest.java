package p000;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;

/* renamed from: aest */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aest {

    /* renamed from: a */
    public final Activity f63743a;

    /* renamed from: b */
    public String f63744b;

    /* renamed from: c */
    public final aess f63745c;

    /* renamed from: d */
    public LocationSharingSettings f63746d;

    /* renamed from: e */
    private final aesz f63747e;

    /* renamed from: f */
    private boolean f63748f;

    /* renamed from: g */
    private boolean f63749g;

    /* renamed from: h */
    private aeus f63750h;

    /* renamed from: i */
    private final rjx f63751i;

    public aest(Activity activity, aess aess, aesz aesz, Bundle bundle, rjx rjx) {
        this.f63743a = activity;
        this.f63745c = aess;
        this.f63747e = aesz;
        this.f63751i = rjx;
        if (bundle != null) {
            LocationSharingSettings locationSharingSettings = (LocationSharingSettings) bundle.getParcelable("settings_read");
            this.f63746d = locationSharingSettings;
            if (locationSharingSettings != null) {
                this.f63749g = bundle.getBoolean("state_has_connected");
            }
        }
    }

    /* renamed from: f */
    private final void m52511f() {
        this.f63750h = new aeus(this.f63743a, this.f63744b, new aesq(this), this.f63751i);
    }

    /* renamed from: a */
    public final void mo34517a() {
        if (this.f63750h != null) {
            aess aess = this.f63745c;
            boolean z = false;
            if (mo34522c() && mo34523d()) {
                z = true;
            }
            aess.mo34516a(z);
        }
        if (!this.f63748f && mo34521b()) {
            this.f63748f = true;
            this.f63745c.mo34515a(this.f63746d);
        }
    }

    /* renamed from: b */
    public final boolean mo34521b() {
        LocationSharingSettings locationSharingSettings = this.f63746d;
        return (locationSharingSettings == null || locationSharingSettings.mo43767b() || this.f63750h == null) ? false : true;
    }

    /* renamed from: c */
    public final boolean mo34522c() {
        ReportingState reportingState;
        aeus aeus = this.f63750h;
        if (aeus == null || (reportingState = aeus.f63861c) == null) {
            return false;
        }
        if (aeus.f63862d) {
            bnsl bnsl = (bnsl) aeus.f63859a.mo68388c();
            bnsl.mo68437a(aeus.f63863e);
            bnsl.mo68432a("aeus", "b", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Illegal to call this method when the status is failure");
            throw new IllegalStateException("Illegal to call this method when status is failure: ", aeus.f63863e);
        } else if (reportingState.mo43731b() == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo34523d() {
        aeus aeus = this.f63750h;
        if (aeus != null) {
            LocationManager locationManager = (LocationManager) aeus.f63860b.getSystemService("location");
            int size = locationManager.getProviders(true).size();
            boolean equals = locationManager.getProviders(true).size() == 1 ? locationManager.getProviders(true).get(0).equals("passive") : false;
            if (size == 0 || equals) {
                return false;
            }
            return true;
        }
        return false;
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
    /* renamed from: e */
    public final void mo34524e() {
        if (!mo34522c() && !cfaz.m138553b()) {
            Intent className = new Intent().setClassName(this.f63743a, "com.google.android.gms.locationsharing.activity.OnboardingActivity");
            className.putExtra("account_name", this.f63744b);
            className.putExtra("has_signed_tos", true);
            className.putExtra("is_location_history_enabled", false);
            className.putExtra("is_korean", this.f63746d.f79636f);
            this.f63743a.startActivityForResult(className, 4);
        } else if (!mo34523d()) {
            LocationRequest a = LocationRequest.m66854a();
            a.mo43553c(100);
            aerj aerj = new aerj();
            aerj.mo34489a(a);
            aerj.mo34490b();
            this.f63743a.startActivityForResult(aerj.mo34488a(), 4);
        }
    }

    /* renamed from: a */
    public final void mo34518a(Bundle bundle) {
        bundle.putBoolean("state_has_connected", this.f63748f);
        bundle.putParcelable("settings_read", this.f63746d);
        this.f63747e.mo34533a(bundle);
    }

    /* renamed from: a */
    public final void mo34519a(String str) {
        this.f63744b = str;
        this.f63748f = false;
        if (!this.f63749g) {
            this.f63745c.mo34513a();
            this.f63746d = null;
            this.f63747e.mo34532a(0, null, new aesr(this), false);
        } else {
            this.f63749g = false;
        }
        m52511f();
    }

    /* renamed from: a */
    public final void mo34520a(String str, LocationSharingSettings locationSharingSettings) {
        if (locationSharingSettings != null) {
            this.f63744b = str;
            this.f63748f = false;
            this.f63746d = locationSharingSettings;
            mo34517a();
            this.f63749g = false;
            m52511f();
            return;
        }
        mo34519a(str);
    }
}
