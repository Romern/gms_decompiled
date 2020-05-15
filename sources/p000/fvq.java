package p000;

import android.content.Context;
import android.text.Html;
import com.android.volley.VolleyError;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: fvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvq extends sji {

    /* renamed from: a */
    private final ClientContext f17347a;

    /* renamed from: d */
    private final fva f17348d;

    /* renamed from: e */
    private final String f17349e;

    /* renamed from: f */
    private final String f17350f;

    /* renamed from: g */
    private final String f17351g;

    /* renamed from: h */
    private final String f17352h;

    /* renamed from: i */
    private final String f17353i;

    /* renamed from: j */
    private final Map f17354j;

    /* renamed from: k */
    private final String f17355k;

    /* renamed from: l */
    private final String f17356l;

    /* renamed from: m */
    private final List f17357m = new ArrayList();

    /* renamed from: n */
    private final String f17358n;

    /* renamed from: o */
    private final String f17359o;

    /* renamed from: p */
    private final String f17360p;

    /* renamed from: q */
    private final String f17361q;

    /* renamed from: r */
    private final byte[] f17362r;

    /* renamed from: s */
    private final int f17363s;

    /* renamed from: t */
    private final int f17364t;

    /* renamed from: u */
    private final String f17365u;

    /* renamed from: v */
    private final String f17366v;

    /* renamed from: w */
    private final int f17367w;

    /* renamed from: x */
    private final String f17368x;

    /* renamed from: y */
    private final fve f17369y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fvq(ClientContext clientContext, fva fva, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, List list, String str8, String str9, String str10, String str11, byte[] bArr, int i, int i2, String str12, String str13, int i3, String str14, fve fve) {
        super(106, "AppInviteCreateInvitations");
        this.f17347a = clientContext;
        this.f17348d = fva;
        this.f17349e = str;
        this.f17350f = str2;
        this.f17351g = str3;
        this.f17352h = str4;
        this.f17353i = str5;
        this.f17354j = map;
        this.f17355k = str6;
        this.f17356l = str7;
        this.f17358n = str8;
        this.f17359o = str9;
        this.f17360p = str10;
        this.f17361q = str11;
        this.f17362r = bArr;
        this.f17363s = i;
        this.f17364t = i2;
        this.f17365u = str12;
        this.f17366v = str13;
        this.f17367w = i3;
        this.f17368x = str14;
        this.f17369y = fve;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f17357m.add(new SourcedContactPerson((ContactPerson) list.get(i4), 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        ArrayList arrayList;
        Status status;
        fve fve;
        try {
            bzfd a = this.f17348d.mo11385a(this.f17347a, this.f17349e, this.f17350f, this.f17351g, this.f17352h, this.f17353i, this.f17354j, this.f17355k, this.f17356l, this.f17357m, this.f17358n, this.f17359o, this.f17360p, this.f17361q, this.f17362r, this.f17363s, this.f17364t, this.f17365u, this.f17366v, this.f17367w, this.f17368x);
            if (a == null || a.f169788a.isEmpty()) {
                status = Status.f30109c;
                arrayList = null;
                fve = this.f17369y;
                if (fve == null) {
                    fve.mo11391a(status, arrayList);
                    return;
                }
                return;
            }
            status = Status.f30107a;
            arrayList = new ArrayList();
            try {
                for (bzfr bzfr : a.f169788a) {
                    bzgf bzgf = bzfr.f169861c;
                    if (bzgf == null) {
                        bzgf = bzgf.f169924e;
                    }
                    bzfx bzfx = bzfr.f169860b;
                    if (bzfx == null) {
                        bzfx = bzfx.f169887d;
                    }
                    if ((bzfx.f169889a & 1) != 0) {
                        bzfx bzfx2 = bzfr.f169860b;
                        if (bzfx2 == null) {
                            bzfx2 = bzfx.f169887d;
                        }
                        arrayList.add(bzfx2.f169890b);
                    }
                    if ((bzfr.f169859a & 4) != 0 && (bzgf.f169926a & 2) != 0) {
                        bzfg bzfg = bzgf.f169928c;
                        if (bzfg == null) {
                            bzfg = bzfg.f169792f;
                        }
                        int a2 = bzff.m125739a(bzfg.f169795b);
                        if (a2 != 0 && a2 == 4) {
                            bzfg bzfg2 = bzgf.f169928c;
                            if (bzfg2 == null) {
                                bzfg2 = bzfg.f169792f;
                            }
                            if (!bzfg2.f169798e.isEmpty()) {
                                bzgc bzgc = bzfr.f169862d;
                                if (bzgc == null) {
                                    bzgc = bzgc.f169907b;
                                }
                                if (!bzgc.f169909a.isEmpty() && (bzfr.f169859a & 1) != 0) {
                                    bzfg bzfg3 = bzgf.f169928c;
                                    if (bzfg3 == null) {
                                        bzfg3 = bzfg.f169792f;
                                    }
                                    String str = bzfg3.f169798e;
                                    bzgc bzgc2 = bzfr.f169862d;
                                    if (bzgc2 == null) {
                                        bzgc2 = bzgc.f169907b;
                                    }
                                    String obj = Html.fromHtml(bzgc2.f169909a).toString();
                                    bzfx bzfx3 = bzfr.f169860b;
                                    if (bzfx3 == null) {
                                        bzfx3 = bzfx.f169887d;
                                    }
                                    String str2 = bzfx3.f169890b;
                                    fvv fvv = new fvv(context.getApplicationContext());
                                    fvv.f17384a = str;
                                    fvv.f17385b = obj;
                                    fvv.f17386c = str2;
                                    fvv.f17387d = this.f17347a.f30214d.name;
                                    fvv.f17388e = this.f17368x;
                                    context.startService(fvv.mo11405a());
                                }
                            }
                        }
                    }
                }
            } catch (gid e) {
                status = new Status(4);
                fve = this.f17369y;
                if (fve == null) {
                }
            } catch (VolleyError | fup e2) {
                status = new Status(8);
                fve = this.f17369y;
                if (fve == null) {
                }
            }
            fve = this.f17369y;
            if (fve == null) {
            }
        } catch (gid e3) {
            arrayList = null;
            status = new Status(4);
            fve = this.f17369y;
            if (fve == null) {
            }
        } catch (VolleyError | fup e4) {
            arrayList = null;
            status = new Status(8);
            fve = this.f17369y;
            if (fve == null) {
            }
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        fve fve = this.f17369y;
        if (fve != null) {
            fve.mo11391a(status, (List) null);
        }
    }
}
