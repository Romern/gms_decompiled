package p000;

import android.content.pm.PackageInstaller;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import com.felicanetworks.mfc.C0126R;

/* renamed from: oqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oqw extends PackageInstaller.SessionCallback {

    /* renamed from: a */
    final /* synthetic */ oqx f38254a;

    /* renamed from: b */
    private final SparseArray f38255b = new SparseArray();

    /* renamed from: c */
    private final oxr f38256c;

    public oqw(oqx oqx, oxr oxr) {
        PackageInstaller.SessionInfo a;
        this.f38254a = oqx;
        this.f38256c = oxr;
        int i = oqx.f38257e;
        for (oyf oyf : oqx.f38261d) {
            if (!oyf.mo22779a(oqx.f38258a) && (a = oqx.mo22526a(oyf.f38609a)) != null) {
                this.f38255b.put(a.getSessionId(), oyf.f38609a);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oxr.a(java.lang.String, android.os.Parcelable):void
     arg types: [java.lang.String, android.os.Bundle]
     candidates:
      oxr.a(java.lang.String, java.lang.Object):void
      oxr.a(java.lang.String, android.os.Parcelable):void */
    public final void onActiveChanged(int i, boolean z) {
        if (this.f38255b.get(i) != null && !z) {
            int i2 = oqx.f38257e;
            Bundle bundle = new Bundle();
            bundle.putString("errorTitle", this.f38254a.f38258a.getString(C0126R.string.car_frx_no_connection_title));
            this.f38256c.mo22755a("EVENT_APPLICATION_INSTALLATION_FAILED", (Parcelable) bundle);
            oxr oxr = this.f38256c;
            bxvd da = bped.f137237x.mo74144da();
            int i3 = bpeb.FRX_DOWNLOAD_APPS.f137221cE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bped bped = (bped) da.f164949b;
            bped.f137239a |= 1;
            bped.f137240b = i3;
            int i4 = bpea.FRX_DOWNLOAD_FAIL_INACTIVE.f137033jW;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bped bped2 = (bped) da.f164949b;
            bped2.f137239a |= 2;
            bped2.f137241c = i4;
            oxr.mo22750a((bped) da.mo74062i());
            this.f38254a.f38259b.unregisterSessionCallback(this);
        }
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onCreated(int i) {
        oqx oqx = this.f38254a;
        int i2 = oqx.f38257e;
        PackageInstaller.SessionInfo sessionInfo = oqx.f38259b.getSessionInfo(i);
        if (sessionInfo != null) {
            for (oyf oyf : this.f38254a.f38261d) {
                if (oyf.f38609a.equals(sessionInfo.getAppPackageName())) {
                    this.f38255b.put(i, oyf.f38609a);
                }
            }
        }
    }

    public final void onFinished(int i, boolean z) {
        if (this.f38255b.get(i) != null) {
            if (z) {
                int i2 = oqx.f38257e;
                oyd oyd = (oyd) this.f38254a.f38260c.f38608a.get((String) this.f38255b.get(i));
                bmxy.m108581a(oyd);
                oyd.f38605a = 1;
                this.f38255b.remove(i);
                oxr oxr = this.f38256c;
                bxvd da = bped.f137237x.mo74144da();
                int i3 = bpeb.FRX_DOWNLOAD_APPS.f137221cE;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bped bped = (bped) da.f164949b;
                bped.f137239a = 1 | bped.f137239a;
                bped.f137240b = i3;
                int i4 = bpea.FRX_DOWNLOAD_SUCCESS.f137033jW;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bped bped2 = (bped) da.f164949b;
                bped2.f137239a |= 2;
                bped2.f137241c = i4;
                oxr.mo22750a((bped) da.mo74062i());
                this.f38256c.mo22754a("EVENT_APPLICATION_INSTALLED");
            } else {
                int i5 = oqx.f38257e;
                oxr oxr2 = this.f38256c;
                bxvd da2 = bped.f137237x.mo74144da();
                int i6 = bpeb.FRX_DOWNLOAD_APPS.f137221cE;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bped bped3 = (bped) da2.f164949b;
                bped3.f137239a = 1 | bped3.f137239a;
                bped3.f137240b = i6;
                int i7 = bpea.FRX_DOWNLOAD_FAILED_FINISH.f137033jW;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bped bped4 = (bped) da2.f164949b;
                bped4.f137239a |= 2;
                bped4.f137241c = i7;
                oxr2.mo22750a((bped) da2.mo74062i());
                this.f38256c.mo22754a("EVENT_APPLICATION_INSTALLATION_FAILED");
                this.f38254a.f38259b.unregisterSessionCallback(this);
            }
            if (this.f38255b.size() == 0 && this.f38254a.mo22527a().isEmpty()) {
                this.f38256c.mo22754a("EVENT_APPLICATIONS_UP_TO_DATE");
                this.f38254a.f38259b.unregisterSessionCallback(this);
            }
        }
    }

    public final void onProgressChanged(int i, float f) {
        String str = (String) this.f38255b.get(i);
        if (str != null) {
            oqx oqx = this.f38254a;
            int i2 = oqx.f38257e;
            oyd oyd = (oyd) oqx.f38260c.f38608a.get(str);
            bmxy.m108581a(oyd);
            oyd.mo22778a(f);
            this.f38256c.mo22754a("EVENT_APPLICATION_INSTALLATION_UPDATE");
        }
    }
}
