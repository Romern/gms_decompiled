package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

/* renamed from: amwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class amwr {

    /* renamed from: a */
    public final ClientContext f76213a;

    /* renamed from: b */
    public final ampm f76214b;

    /* renamed from: c */
    public final String f76215c;

    /* renamed from: d */
    public final anav f76216d;

    /* renamed from: e */
    public final anaz f76217e;

    /* renamed from: f */
    public final btea f76218f;

    /* renamed from: g */
    public final anbu f76219g;

    public amwr(Context context, ClientContext clientContext, ampm ampm, String str, bmza bmza, anaz anaz, btea btea, anbu anbu) {
        String str2;
        this.f76213a = clientContext;
        this.f76214b = ampm;
        this.f76219g = anbu;
        if (!TextUtils.isEmpty(str)) {
            str2 = "AID_".concat(str);
        } else {
            str2 = "";
        }
        this.f76215c = str2;
        this.f76218f = btea;
        this.f76217e = anaz;
        this.f76216d = new anav(context, anaz, bmza);
    }

    /* renamed from: a */
    public static btdi m63562a() {
        btdg btdg = (btdg) btdi.f148400b.mo74144da();
        btdg.mo70746a(btdh.GDATA_COMPATIBILITY);
        return (btdi) btdg.mo74062i();
    }

    /* renamed from: a */
    public static void m63563a(String str) {
        amdk.m62659b("FSA2_PhotoSyncGrpc", "writePhoto() failed since %s", str);
    }

    /* renamed from: a */
    public static void m63564a(List list, int i) {
        if (list.size() != i) {
            throw new amxx(3);
        }
    }

    /* renamed from: a */
    public final byte[] mo41502a(String str, int i) {
        if (i != 2) {
            i = 1;
        }
        bmxy.m108588a(true);
        if (str != null) {
            amig.m62939a();
            bxvd da = btde.f148384e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btde) da.f164949b).f148386a = btee.m116473a(5);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((btde) da.f164949b).f148387b = str;
            bxvd da2 = bted.f148495c.mo74144da();
            if (i != 2) {
                int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82961aY()).intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bted) da2.f164949b).f148498b = intValue;
                int intValue2 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82962aZ()).intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bted) da2.f164949b).f148497a = intValue2;
            } else {
                int intValue3 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82959aW()).intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bted) da2.f164949b).f148498b = intValue3;
                int intValue4 = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82960aX()).intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bted) da2.f164949b).f148497a = intValue4;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bted bted = (bted) da2.mo74062i();
            bted.getClass();
            ((btde) da.f164949b).f148388c = bted;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btde) da.f164949b).f148390f = true;
            btea btea = this.f76218f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btea.getClass();
            ((btde) da.f164949b).f148389d = btea;
            try {
                this.f76216d.mo41626a();
                btdd a = this.f76214b.mo41250a(this.f76213a, (btde) da.mo74062i());
                this.f76216d.mo41628a("FSA_getPersonPhotoEncoded", 1, amwy.m63594a(a));
                if (a != null) {
                    return a.f148383b.mo73780k();
                }
                throw new amxy(3);
            } catch (chuw | gid e) {
                Log.e("FSA2_PhotoSyncGrpc", "readPhoto error", e);
                throw e;
            }
        } else {
            Log.e("FSA2_PhotoSyncGrpc", "readPhoto() failed since contactID was null.");
            throw new amxy(2);
        }
    }
}
