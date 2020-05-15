package p000;

import android.content.Context;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: fvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvo extends sji {

    /* renamed from: a */
    private final ClientContext f17337a;

    /* renamed from: d */
    private final fva f17338d;

    /* renamed from: e */
    private final fuu f17339e;

    /* renamed from: f */
    private final String f17340f;

    /* renamed from: g */
    private final fvd f17341g;

    public fvo(ClientContext clientContext, fva fva, fuu fuu, String str, fvd fvd) {
        super(77, "AppInviteCompleteInvitation");
        this.f17337a = clientContext;
        this.f17338d = fva;
        this.f17339e = fuu;
        this.f17340f = str;
        this.f17341g = fvd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        Status status;
        fvd fvd;
        fuy fuy;
        try {
            fva fva = this.f17338d;
            ClientContext clientContext = this.f17337a;
            String str = this.f17340f;
            fuz fuz = fva.f17325a;
            String str2 = clientContext.f30215e;
            bxvd da = bzey.f169745e.mo74144da();
            bzex a = fuz.mo11383a(str2);
            bzez bzez = null;
            if (a == null) {
                Log.e("AppInviteAgent", "Error creating ClientIdInfo");
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzey bzey = (bzey) da.f164949b;
                a.getClass();
                bzey.f169749b = a;
                bzey.f169748a |= 1;
                bxvd da2 = bzfx.f169887d.mo74144da();
                String a2 = stm.m36299a(str);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzfx bzfx = (bzfx) da2.f164949b;
                a2.getClass();
                bzfx.f169889a |= 1;
                bzfx.f169890b = a2;
                bzfx bzfx2 = (bzfx) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzey bzey2 = (bzey) da.f164949b;
                bzfx2.getClass();
                bzey2.f169750c = bzfx2;
                bzey2.f169748a |= 2;
                bzgm a3 = fuz.mo11384a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzey bzey3 = (bzey) da.f164949b;
                a3.getClass();
                bzey3.f169751d = a3;
                bzey3.f169748a |= 4;
                fuy = new fuy(fuz.f17322a, clientContext, bzey.f169746f, (bzey) da.mo74062i());
                fuy.mo11378b();
                bzez bzez2 = (bzez) fuy.mo11376a(bzez.f169753d);
                if (fuy.mo11379c()) {
                    int e = fuy.mo11381e();
                    StringBuilder sb = new StringBuilder(57);
                    sb.append("Complete invitation failed due to error code: ");
                    sb.append(e);
                    Log.e("AppInviteAgent", sb.toString());
                } else {
                    bzez = bzez2;
                }
            }
            if (bzez == null || (bzez.f169755a & 1) == 0) {
                status = Status.f30109c;
                fvd = this.f17341g;
                if (fvd == null) {
                    fvd.mo11389a(status);
                    return;
                }
                return;
            }
            fjk a4 = this.f17339e.mo11370a();
            bzft bzft = bzez.f169756b;
            if (bzft == null) {
                bzft = bzft.f169867c;
            }
            fuu.m12428a(a4, bzft);
            status = Status.f30107a;
            fvd = this.f17341g;
            if (fvd == null) {
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
            bzez bzez3 = (bzez) fuy.mo11376a(bzez.f169753d);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        fvd fvd = this.f17341g;
        if (fvd != null) {
            fvd.mo11389a(status);
        }
    }
}
