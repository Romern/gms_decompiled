package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.libraries.rocket.impressions.Session;

/* renamed from: vdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vdv extends vdt implements vda {

    /* renamed from: c */
    public boolean f49095c;

    /* renamed from: d */
    private String f49096d;

    /* renamed from: e */
    private CallingAppInfo f49097e;

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
    /* renamed from: a */
    public final void mo28314a(vdk vdk) {
        sdo.m34971a(!this.f49095c, (Object) "Can't send log event when paused");
        super.mo28314a(vdk);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ vcy mo28312c() {
        throw null;
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
    /* renamed from: d */
    public final vdk mo28316d() {
        sdo.m34971a(!this.f49095c, (Object) "Can't create log event when paused");
        vdk d = super.mo28316d();
        d.mo28284a(this.f49096d);
        d.mo28281a(this.f49097e);
        return d;
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
    /* renamed from: e */
    public final Bundle mo28313e() {
        Session session;
        sdo.m34971a(!this.f49095c, (Object) "Can't pause an already paused session");
        this.f49095c = true;
        Bundle bundle = new Bundle();
        bebr bebr = this.f49093a;
        synchronized (bebr.f106877a) {
            bebr.mo58537a(bebu.IN_PROGRESS, "pauseSession");
            bebw bebw = bebr.f106880d;
            Session session2 = bebr.f106879c;
            bebr.mo58536a(bebq.m91736a(bebw, session2.f111423g, session2.f111424h));
            bebr.f106879c.f111419c = bebu.PAUSED;
            bebr.f106878b.mo58527b();
            session = bebr.f106879c;
        }
        bundle.putParcelable("impression-session", session);
        bundle.putString("account-name", this.f49096d);
        bundle.putParcelable("app-info", this.f49097e);
        return bundle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public vdv(Bundle bundle, vdu vdu, Context context) {
        super(r0, context);
        String string = bundle.getString("account-name");
        Parcelable parcelable = bundle.getParcelable("impression-session");
        bebr bebr = new bebr(new bebs().f106881a, vdu.mo28315a(string), (Session) parcelable);
        synchronized (bebr.f106877a) {
            bebr.mo58537a(bebu.PAUSED, "resumeSession");
            if (bebr.f106878b.mo58529c()) {
                throw new IllegalStateException("Cannot resume a paused session instance; recreate a new ImpressionLogger instance and call resumeSession() on that instead");
            } else if (!bebr.mo58539b()) {
                bebw bebw = bebr.f106880d;
                Session session = bebr.f106879c;
                bebr.mo58536a(bebq.m91736a(bebw, session.f111423g, session.f111424h));
                bebr.f106879c.f111419c = bebu.IN_PROGRESS;
            }
        }
        this.f49097e = (CallingAppInfo) bundle.getParcelable("app-info");
        this.f49096d = bundle.getString("account-name");
        this.f49095c = false;
    }

    public vdv(CallingAppInfo callingAppInfo, String str, vdu vdu, Context context) {
        super(new bebs().mo58540a(vdu.mo28315a(str), vdm.m40184a(16)), context);
        sdo.m34959a(callingAppInfo);
        this.f49097e = callingAppInfo;
        sdo.m34959a((Object) str);
        this.f49096d = str;
        this.f49095c = false;
    }
}
