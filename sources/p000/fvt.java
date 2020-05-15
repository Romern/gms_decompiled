package p000;

import android.content.Context;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvt extends sji {

    /* renamed from: a */
    private final ClientContext f17375a;

    /* renamed from: d */
    private final fva f17376d;

    /* renamed from: e */
    private final fuu f17377e;

    /* renamed from: f */
    private List f17378f = new ArrayList();

    /* renamed from: g */
    private final List f17379g;

    public fvt(ClientContext clientContext, fva fva, fuu fuu, List list, List list2) {
        super(77, "AppInviteUpdateSms");
        new ArrayList();
        this.f17378f = list;
        this.f17379g = list2;
        this.f17375a = clientContext;
        this.f17376d = fva;
        this.f17377e = fuu;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        String[] strArr;
        String[] strArr2;
        int length;
        try {
            fva fva = this.f17376d;
            ClientContext clientContext = this.f17375a;
            List list = this.f17378f;
            bzgo bzgo = null;
            if (list != null) {
                strArr = (String[]) list.toArray(new String[list.size()]);
            } else {
                strArr = null;
            }
            List list2 = this.f17379g;
            if (list2 != null) {
                strArr2 = (String[]) list2.toArray(new String[list2.size()]);
            } else {
                strArr2 = null;
            }
            fuz fuz = fva.f17325a;
            bxvd da = bzgn.f169952f.mo74144da();
            bzex a = fuz.mo11383a(clientContext.f30215e);
            if (a != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzgn bzgn = (bzgn) da.f164949b;
                a.getClass();
                bzgn.f169956b = a;
                bzgn.f169955a |= 1;
                bzgm a2 = fuz.mo11384a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzgn bzgn2 = (bzgn) da.f164949b;
                a2.getClass();
                bzgn2.f169959e = a2;
                bzgn2.f169955a |= 2;
                if (strArr != null && (length = strArr.length) > 0) {
                    ArrayList arrayList = new ArrayList(length);
                    for (String str : strArr) {
                        bxvd da2 = bzfx.f169887d.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzfx bzfx = (bzfx) da2.f164949b;
                        str.getClass();
                        bzfx.f169889a |= 1;
                        bzfx.f169890b = str;
                        arrayList.add((bzfx) da2.mo74062i());
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzgn bzgn3 = (bzgn) da.f164949b;
                    if (!bzgn3.f169957c.mo73666a()) {
                        bzgn3.f169957c = bxvk.m124021a(bzgn3.f169957c);
                    }
                    bxsy.m123078a(arrayList, bzgn3.f169957c);
                }
                if (strArr2 != null) {
                    int length2 = strArr2.length;
                    if (length2 > 0) {
                        ArrayList arrayList2 = new ArrayList(length2);
                        for (String str2 : strArr2) {
                            bxvd da3 = bzfx.f169887d.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bzfx bzfx2 = (bzfx) da3.f164949b;
                            str2.getClass();
                            bzfx2.f169889a |= 1;
                            bzfx2.f169890b = str2;
                            arrayList2.add((bzfx) da3.mo74062i());
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzgn bzgn4 = (bzgn) da.f164949b;
                        if (!bzgn4.f169958d.mo73666a()) {
                            bzgn4.f169958d = bxvk.m124021a(bzgn4.f169958d);
                        }
                        bxsy.m123078a(arrayList2, bzgn4.f169958d);
                    }
                }
                fuy fuy = new fuy(fuz.f17322a, clientContext, bzgn.f169953g, (bzgn) da.mo74062i());
                try {
                    fuy.mo11377a();
                    if (fuy.mo11379c()) {
                        int e = fuy.mo11381e();
                        StringBuilder sb = new StringBuilder(60);
                        sb.append("Update Sms invitations failed due to error code: ");
                        sb.append(e);
                        Log.e("AppInviteAgent", sb.toString());
                    } else {
                        bzgo = (bzgo) fuy.mo11376a(bzgo.f169961c);
                    }
                } catch (gid e2) {
                    Log.e("AppInviteAgent", "Authentication Failed ", e2);
                } catch (VolleyError e3) {
                    String valueOf = String.valueOf(e3);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb2.append("Error communicating with server ");
                    sb2.append(valueOf);
                    Log.e("AppInviteAgent", sb2.toString());
                }
            }
            if (bzgo != null) {
                if (!bzgo.f169963a.isEmpty()) {
                    fjk a3 = this.f17377e.mo11370a();
                    for (bzft bzft : bzgo.f169963a) {
                        fuu.m12428a(a3, bzft);
                    }
                }
                Status status = Status.f30107a;
                return;
            }
            Status status2 = Status.f30107a;
        } catch (AuthFailureError | gid e4) {
            new Status(4);
        } catch (NetworkError e5) {
            new Status(7);
        } catch (VolleyError e6) {
            new Status(8);
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
    }
}
