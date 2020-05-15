package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.gms.cast.CastDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pvd implements pvi {

    /* renamed from: a */
    public final qav f40336a = new qav("CastRemoteDisplayProvider");

    /* renamed from: b */
    public final qam f40337b;

    /* renamed from: c */
    public final pmx f40338c;

    /* renamed from: d */
    public final pvh f40339d;

    /* renamed from: e */
    public String f40340e;

    /* renamed from: f */
    public String f40341f;

    /* renamed from: g */
    public pvj f40342g;

    /* renamed from: h */
    public PendingIntent f40343h;

    /* renamed from: i */
    public final Map f40344i;

    /* renamed from: j */
    public pwv f40345j;

    /* renamed from: k */
    public pwv f40346k;

    /* renamed from: l */
    public pwv f40347l;

    /* renamed from: m */
    public pwy f40348m;

    /* renamed from: n */
    private final Context f40349n;

    /* renamed from: o */
    private final String f40350o = ccxs.f180178a.mo6606a().mo76999g();

    public pvd(Context context, pmx pmx, pvh pvh) {
        this.f40349n = context;
        this.f40338c = pmx;
        this.f40339d = pvh;
        this.f40344i = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(this.f40350o);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i = jSONObject.getInt(next);
                this.f40344i.put(next, pwd.m31503a(i));
                this.f40336a.mo23670a("Overriding appId=%s with config %s", next, pwd.m31504b(i));
            }
        } catch (JSONException e) {
            this.f40336a.mo23675c("Malformed configuration_by_appid_overrides value ignoring. e=%s", e.getMessage());
        }
        this.f40337b = new qam(context, "CastRemoteDisplayProvider");
    }

    /* renamed from: a */
    public final void mo23727a(CastDevice castDevice, int i, int i2, Surface surface) {
        pwv pwv;
        qav qav = this.f40336a;
        String valueOf = String.valueOf(castDevice);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("onDeviceStartedRemoteDisplay: ");
        sb.append(valueOf);
        qav.mo23670a(sb.toString(), new Object[0]);
        this.f40337b.mo23842a();
        if (castDevice.mo17494a().equals(this.f40340e) && (pwv = this.f40345j) != null) {
            try {
                Parcel bj = pwv.mo8529bj();
                bj.writeInt(i);
                bj.writeInt(i2);
                dcl.m8165a(bj, surface);
                pwv.mo8528b(1, bj);
            } catch (RemoteException | IllegalStateException e) {
                this.f40336a.mo23670a("Unable to call startCallback onConnected ", new Object[0]);
            }
            this.f40345j = null;
        }
    }

    /* renamed from: a */
    public final void mo23728a(CastDevice castDevice, boolean z) {
        int i;
        this.f40336a.mo23670a(String.format("onDeviceStoppedRemoteDisplay: %s %b", castDevice, Boolean.valueOf(z)), new Object[0]);
        this.f40336a.mo23856a("Unprovisioning virtual display on device %s", castDevice.f29715c);
        this.f40338c.mo23462b(castDevice.mo17494a(), -1);
        this.f40337b.mo23843b();
        pwv pwv = this.f40347l;
        if (pwv != null) {
            if (z) {
                try {
                    pwv.mo23796a(2204);
                } catch (RemoteException e) {
                    if (!z) {
                        this.f40336a.mo23670a("Unable to call stopCallback onDisconnected", new Object[0]);
                    } else {
                        this.f40336a.mo23670a("Unable to call stopCallback onError", new Object[0]);
                    }
                }
            } else {
                pwv.mo23795a();
            }
            this.f40347l = null;
        } else if (this.f40345j != null) {
            this.f40336a.mo23670a("Existing remote display session cancelled", new Object[0]);
        }
        if (!z) {
            i = 0;
        } else {
            i = 2206;
        }
        pwy pwy = this.f40348m;
        if (pwy != null) {
            try {
                Parcel bj = pwy.mo8529bj();
                bj.writeInt(i);
                pwy.mo8530c(1, bj);
            } catch (RemoteException e2) {
                this.f40336a.mo23670a("Unable to call sessionCallbacks onRemoteDisplayEnded", new Object[0]);
            }
        }
        if (this.f40343h != null) {
            try {
                Intent intent = new Intent();
                intent.putExtra("extra_int_session_ended_status_code", i);
                this.f40343h.send(this.f40349n, 0, intent);
            } catch (PendingIntent.CanceledException e3) {
            }
        }
        pvj pvj = this.f40342g;
        pvj.f40384s.execute(new pvf(pvj, this));
    }
}
