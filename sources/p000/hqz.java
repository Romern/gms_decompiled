package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.DeleteRequest;
import com.google.android.gms.auth.api.credentials.internal.SaveRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: hqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hqz extends hin implements aaai {

    /* renamed from: a */
    public final String f20265a;

    /* renamed from: b */
    public final his f20266b;

    /* renamed from: c */
    private final Context f20267c;

    /* renamed from: d */
    private final aaag f20268d;

    /* renamed from: e */
    private final String f20269e;

    public hqz(Context context, String str, gsp gsp, aaag aaag, his his, qws qws) {
        String str2;
        this.f20267c = context;
        this.f20265a = str;
        sdo.m34959a(gsp);
        this.f20266b = his;
        sdo.m34959a(aaag);
        this.f20268d = aaag;
        if (TextUtils.isEmpty(gsp.f18962d)) {
            str2 = adbv.m50143a();
        } else {
            str2 = gsp.f18962d;
            sdo.m34959a((Object) str2);
        }
        this.f20269e = str2;
        String str3 = gsp.f18960b;
        bxvd da = bong.f133782r.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong = (bong) da.f164949b;
        bong.f133785b = 14;
        int i = bong.f133784a | 1;
        bong.f133784a = i;
        String str4 = this.f20269e;
        str4.getClass();
        bong.f133784a = i | 2;
        bong.f133786c = str4;
        bxvd da2 = bona.f133750c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bona bona = (bona) da2.f164949b;
        str3.getClass();
        bona.f133752a |= 1;
        bona.f133753b = str3;
        bona bona2 = (bona) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong2 = (bong) da.f164949b;
        bona2.getClass();
        bong2.f133798o = bona2;
        bong2.f133784a |= 8192;
        qws.mo24333a(da.mo74062i()).mo24327b();
    }

    /* renamed from: a */
    static Status m14766a(adbe adbe) {
        int i = adbe.f61236a;
        if (i == 7) {
            return new Status(7);
        }
        if (i == 11000) {
            return new Status(6, "Passphrase required.");
        }
        if (i == 28441) {
            return new Status(10, "Invalid credential data.");
        }
        if (i == 28442) {
            return new Status(10, "Invalid calling package.");
        }
        switch (i) {
            case 28421:
                return new Status(4, "Sign-in required.", (PendingIntent) adbe.f61237b.mo66814b());
            case 28422:
            case 28423:
                return new Status(6, "Resolution required.", (PendingIntent) adbe.f61237b.mo66814b());
            default:
                switch (i) {
                    case 28431:
                        return new Status(16, "Credentials API's save confirmation dialog has been disabled to avoid conflicts with the Android Autofill feature. This choice may be overridden via CredentialsOptions.");
                    case 28432:
                        return new Status(16, "Credentials API has been disabled.");
                    case 28433:
                        return new Status(16, "Cannot find a matching credential.");
                    case 28434:
                        return new Status(16, "No eligible accounts can be found.");
                    case 28435:
                        return new Status(16, "The save prompt is disabled for the current app. To restore, remove this app from the \"Never save\" list in the Smart Lock for Passwords settings for all accounts on this device.");
                    default:
                        return Status.f30109c;
                }
        }
    }

    /* renamed from: a */
    private final void m14767a(bqgg bqgg, String str) {
        bqga.m112781a(bqgg, new hqy(this, str, SystemClock.elapsedRealtime()), bqfb.INSTANCE);
    }

    /* renamed from: a */
    private final void m14768a(hep hep, String str, hii hii) {
        hew a = hex.m14288a(hep, 68, str, this.f20269e);
        this.f20268d.mo16658a(a);
        m14767a(a.f19623a, str.concat("Operation"));
        bqga.m112781a(a.f19623a, new hqx(hii), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12500a(hii hii) {
        m14768a(new hrf(this.f20265a), "DisableAutoSignIn", hii);
    }

    /* renamed from: a */
    public final void mo12501a(hii hii, CredentialRequest credentialRequest) {
        hew a = hex.m14288a(new hrr(this.f20267c, this.f20265a, credentialRequest, this.f20269e), 68, "Request", this.f20269e);
        this.f20268d.mo16658a(a);
        m14767a(a.f19623a, "RequestOperation");
        bqga.m112781a(a.f19623a, new hqw(hii), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo12502a(hii hii, DeleteRequest deleteRequest) {
        m14768a(new hre(this.f20267c, this.f20265a, deleteRequest.f10138a), "Delete", hii);
    }

    /* renamed from: a */
    public final void mo12503a(hii hii, SaveRequest saveRequest) {
        m14768a(new hsk(this.f20267c, this.f20265a, saveRequest.f10141a, this.f20269e), "Save", hii);
    }
}
