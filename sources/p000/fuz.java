package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Locale;

/* renamed from: fuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuz {

    /* renamed from: a */
    public final fux f17322a;

    /* renamed from: b */
    private final Context f17323b;

    public fuz(Context context, fux fux) {
        this.f17323b = context;
        this.f17322a = fux;
    }

    /* renamed from: a */
    public final bzet mo11382a(ClientContext clientContext, String str) {
        String str2 = clientContext.f30215e;
        bxvd da = bzes.f169712e.mo74144da();
        bzex a = mo11383a(str2);
        if (a == null) {
            Log.e("AppInviteAgent", "Error creating ClientIdInfo");
            return null;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzes bzes = (bzes) da.f164949b;
        a.getClass();
        bzes.f169716b = a;
        bzes.f169715a |= 1;
        bxvd da2 = bzfx.f169887d.mo74144da();
        if (str == null) {
            str = "";
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzfx bzfx = (bzfx) da2.f164949b;
        str.getClass();
        int i = bzfx.f169889a | 2;
        bzfx.f169889a = i;
        bzfx.f169891c = str;
        "".getClass();
        bzfx.f169889a = i | 1;
        bzfx.f169890b = "";
        bzfx bzfx2 = (bzfx) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzes bzes2 = (bzes) da.f164949b;
        bzfx2.getClass();
        bzes2.f169717c = bzfx2;
        bzes2.f169715a |= 4;
        bzgm a2 = mo11384a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzes bzes3 = (bzes) da.f164949b;
        a2.getClass();
        bzes3.f169718d = a2;
        bzes3.f169715a |= 8;
        fuy fuy = new fuy(this.f17322a, clientContext, bzes.f169713f, (bzes) da.mo74062i());
        try {
            fuy.mo11378b();
            bzet bzet = (bzet) fuy.mo11376a(bzet.f169720g);
            if (!fuy.mo11379c()) {
                return bzet;
            }
            int e = fuy.mo11381e();
            StringBuilder sb = new StringBuilder(55);
            sb.append("Accept invitation failed due to error code: ");
            sb.append(e);
            Log.e("AppInviteAgent", sb.toString());
            return null;
        } catch (gid e2) {
            Log.e("AppInviteAgent", "Authentication Failed ", e2);
            bzet bzet2 = (bzet) fuy.mo11376a(bzet.f169720g);
            return null;
        } catch (VolleyError e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append("Error communicating with server ");
            sb2.append(valueOf);
            Log.e("AppInviteAgent", sb2.toString());
            bzet bzet22 = (bzet) fuy.mo11376a(bzet.f169720g);
            return null;
        } catch (Throwable th) {
            bzet bzet3 = (bzet) fuy.mo11376a(bzet.f169720g);
            throw th;
        }
    }

    /* renamed from: a */
    public final bzex mo11383a(String str) {
        try {
            byte[] f = spn.getSHA1OfPackage(this.f17323b, str);
            if (f == null) {
                return null;
            }
            bxvd da = bzex.f169737g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzex bzex = (bzex) da.f164949b;
            str.getClass();
            bzex.f169739a |= 4;
            bzex.f169742d = str;
            String encodeToString = Base64.encodeToString(f, 2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzex bzex2 = (bzex) da.f164949b;
            encodeToString.getClass();
            int i = bzex2.f169739a | 8;
            bzex2.f169739a = i;
            bzex2.f169743e = encodeToString;
            bzex2.f169740b = 1;
            bzex2.f169739a = 1 | i;
            String language = Locale.getDefault().getLanguage();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzex bzex3 = (bzex) da.f164949b;
            language.getClass();
            bzex3.f169739a |= 32;
            bzex3.f169744f = language;
            return (bzex) da.mo74062i();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppInviteAgent", "Caller Package Name not found", e);
            return null;
        }
    }

    /* renamed from: a */
    public final bzgm mo11384a() {
        bxvd da = bzev.f169732c.mo74144da();
        rfi rfi = rfi.f42868a;
        int j = rfy.m33553j(this.f17323b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzev bzev = (bzev) da.f164949b;
        bzev.f169734a |= 1;
        bzev.f169735b = j;
        bzev bzev2 = (bzev) da.mo74062i();
        bxvd da2 = bzgm.f169948c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzgm bzgm = (bzgm) da2.f164949b;
        bzev2.getClass();
        bzgm.f169951b = bzev2;
        bzgm.f169950a |= 1;
        return (bzgm) da2.mo74062i();
    }
}
