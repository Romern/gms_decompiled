package p000;

import android.content.Context;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: fvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvp extends sji {

    /* renamed from: a */
    private final ClientContext f17342a;

    /* renamed from: d */
    private final fva f17343d;

    /* renamed from: e */
    private final fuu f17344e;

    /* renamed from: f */
    private final String f17345f;

    /* renamed from: g */
    private final fvd f17346g;

    public fvp(ClientContext clientContext, fva fva, fuu fuu, String str, fvd fvd) {
        super(77, "AppInviteConvertInvitation");
        this.f17342a = clientContext;
        this.f17343d = fva;
        this.f17344e = fuu;
        this.f17345f = str;
        this.f17346g = fvd;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        Status status;
        fuy fuy;
        try {
            fva fva = this.f17343d;
            ClientContext clientContext = this.f17342a;
            String str = this.f17345f;
            fuz fuz = fva.f17325a;
            String str2 = clientContext.f30215e;
            bxvd da = bzfa.f169757e.mo74144da();
            bxvd da2 = bzfx.f169887d.mo74144da();
            String a = stm.m36299a(str);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzfx bzfx = (bzfx) da2.f164949b;
            a.getClass();
            bzfx.f169889a |= 1;
            bzfx.f169890b = a;
            bzfx bzfx2 = (bzfx) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzfa bzfa = (bzfa) da.f164949b;
            bzfx2.getClass();
            bzfa.f169762c = bzfx2;
            bzfa.f169760a |= 2;
            bzex a2 = fuz.mo11383a(str2);
            bzfb bzfb = null;
            if (a2 == null) {
                Log.e("AppInviteAgent", "Error creating ClientIdInfo");
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzfa bzfa2 = (bzfa) da.f164949b;
                a2.getClass();
                bzfa2.f169761b = a2;
                bzfa2.f169760a |= 1;
                bzgm a3 = fuz.mo11384a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzfa bzfa3 = (bzfa) da.f164949b;
                a3.getClass();
                bzfa3.f169763d = a3;
                bzfa3.f169760a |= 4;
                fuy = new fuy(fuz.f17322a, clientContext, bzfa.f169758f, (bzfa) da.mo74062i());
                fuy.mo11378b();
                bzfb bzfb2 = (bzfb) fuy.mo11376a(bzfb.f169765c);
                if (fuy.mo11379c()) {
                    int e = fuy.mo11381e();
                    StringBuilder sb = new StringBuilder(56);
                    sb.append("Convert invitation failed due to error code: ");
                    sb.append(e);
                    Log.e("AppInviteAgent", sb.toString());
                } else {
                    bzfb = bzfb2;
                }
            }
            if (bzfb != null) {
                fjk a4 = this.f17344e.mo11370a();
                bzft bzft = bzfb.f169767a;
                if (bzft == null) {
                    bzft = bzft.f169867c;
                }
                fuu.m12428a(a4, bzft);
                status = Status.f30107a;
            } else {
                status = Status.f30109c;
            }
        } catch (gid e2) {
            Log.e("AppInviteAgent", "Authentication Failed ", e2);
            throw e2;
        } catch (VolleyError e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append("Error communicating with server ");
            sb2.append(valueOf);
            Log.e("AppInviteAgent", sb2.toString());
            throw e3;
        } catch (AuthFailureError | gid e4) {
            status = new Status(4);
        } catch (NetworkError e5) {
            status = new Status(7);
        } catch (VolleyError e6) {
            status = new Status(8);
        } catch (Throwable th) {
            bzfb bzfb3 = (bzfb) fuy.mo11376a(bzfb.f169765c);
            throw th;
        }
        fvd fvd = this.f17346g;
        if (fvd != null) {
            fvd.mo11389a(status);
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        fvd fvd = this.f17346g;
        if (fvd != null) {
            fvd.mo11389a(status);
        }
    }
}
