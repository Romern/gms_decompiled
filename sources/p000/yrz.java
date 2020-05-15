package p000;

import android.content.Context;
import android.os.Process;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: yrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yrz implements zuu {

    /* renamed from: a */
    public final yrc f54518a;

    /* renamed from: b */
    public final yrb f54519b;

    /* renamed from: c */
    public final ClientContext f54520c;

    /* renamed from: d */
    public final bqgj f54521d;

    /* renamed from: e */
    public final zre f54522e;

    /* renamed from: f */
    private final Context f54523f;

    static {
        zvt.m46581a();
    }

    public yrz(zre zre, Context context, String str) {
        bqgj a = sne.m35694a((int) ceab.f182124a.mo6606a().mo78669t(), 10);
        yrb yrb = new yrb(new yrn(context, cdyo.f181926a.mo6606a().mo78467f()));
        yrc yrc = new yrc(new yrn(context, cdyo.f181926a.mo6606a().mo78462a()));
        this.f54521d = a;
        this.f54522e = zre;
        this.f54518a = yrc;
        this.f54519b = yrb;
        this.f54523f = context;
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        clientContext.mo17806d(cdyo.f181926a.mo6606a().mo78468g());
        this.f54520c = clientContext;
    }

    /* renamed from: a */
    public final bqgg mo30701a(caae caae, long j, long j2) {
        StringBuilder sb = new StringBuilder(41);
        sb.append(j);
        sb.append("-");
        sb.append(j2);
        String sb2 = sb.toString();
        bxvd da = cadw.f172748g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadw cadw = (cadw) da.f164949b;
        "me".getClass();
        int i = cadw.f172750a | 1;
        cadw.f172750a = i;
        cadw.f172751b = "me";
        String str = caae.f172326b;
        str.getClass();
        int i2 = i | 2;
        cadw.f172750a = i2;
        cadw.f172752c = str;
        sb2.getClass();
        cadw.f172750a = i2 | 4;
        cadw.f172753d = sb2;
        return this.f54521d.mo25819b(new yrq(this, (cadw) da.mo74062i(), caae));
    }

    /* renamed from: b */
    public final int mo30709b() {
        return 2;
    }

    /* renamed from: b */
    public final bqgg mo30710b(List list) {
        list.size();
        if (list.isEmpty()) {
            return bqga.m112775a(cabb.f172405e);
        }
        return this.f54521d.mo25819b(new yrt(this, list));
    }

    /* renamed from: a */
    public final bqgg mo30702a(caae caae, String str) {
        bxvd da = cacd.f172516i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacd cacd = (cacd) da.f164949b;
        "me".getClass();
        int i = cacd.f172518a | 1;
        cacd.f172518a = i;
        cacd.f172519b = "me";
        String str2 = caae.f172326b;
        str2.getClass();
        cacd.f172518a = i | 2;
        cacd.f172520c = str2;
        if (!bmxx.m108577a(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cacd cacd2 = (cacd) da.f164949b;
            str.getClass();
            cacd2.f172518a |= 4;
            cacd2.f172521d = str;
        }
        return this.f54521d.mo25819b(new yro(this, da, caae));
    }

    /* renamed from: a */
    public final bqgg mo30703a(String str) {
        bxvd da = cadx.f172757h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadx cadx = (cadx) da.f164949b;
        "me".getClass();
        int i = cadx.f172759a | 1;
        cadx.f172759a = i;
        cadx.f172760b = "me";
        cadx.f172759a = i | 8;
        cadx.f172763e = true;
        if (!bmxx.m108577a(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cadx cadx2 = (cadx) da.f164949b;
            str.getClass();
            cadx2.f172759a |= 16;
            cadx2.f172764f = str;
        }
        return this.f54521d.mo25819b(new yrs(this, da));
    }

    /* renamed from: a */
    public final bqgg mo30704a(List list) {
        list.size();
        if (list.isEmpty()) {
            return bqga.m112775a(cabb.f172405e);
        }
        return this.f54521d.mo25819b(new yrr(this, list));
    }

    /* renamed from: a */
    public final bqgg mo30705a(List list, String str) {
        cabp cabp = (cabp) cabq.f172465b.mo74144da();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            caae caae = (caae) list.get(i);
            bxvd da = cabo.f172459e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cabo cabo = (cabo) da.f164949b;
            caae.getClass();
            cabo.f172464d = caae;
            cabo.f172461a |= 4;
            cabp.mo74607a(da);
        }
        bxvd da2 = cacq.f172595h.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cacq cacq = (cacq) da2.f164949b;
        "me".getClass();
        cacq.f172597a |= 1;
        cacq.f172598b = "me";
        long currentTimeMillis = System.currentTimeMillis();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cacq cacq2 = (cacq) da2.f164949b;
        cacq2.f172597a |= 2;
        cacq2.f172599c = currentTimeMillis;
        cabq cabq = (cabq) cabp.mo74062i();
        cabq.getClass();
        cacq2.f172600d = cabq;
        cacq2.f172597a |= 4;
        if (!bmxx.m108577a(str)) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cacq cacq3 = (cacq) da2.f164949b;
            str.getClass();
            cacq3.f172597a |= 16;
            cacq3.f172602f = str;
        }
        return this.f54521d.mo25819b(new yru(this, da2));
    }

    /* renamed from: a */
    public final void mo30706a() {
        zuw.m46537c(this.f54523f, this.f54520c.f30214d.name);
        bxvd da = cabx.f172486c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cabx cabx = (cabx) da.f164949b;
        "me".getClass();
        cabx.f172488a |= 1;
        cabx.f172489b = "me";
        cabx cabx2 = (cabx) da.mo74062i();
        try {
            yrb yrb = this.f54519b;
            ClientContext clientContext = this.f54520c;
            sgv sgv = yrb.f54472a;
            StringBuilder sb = new StringBuilder();
            String a = shd.m35267a(String.valueOf(cabx2.f172489b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 31);
            sb2.append("/users/");
            sb2.append(a);
            sb2.append("/deleteHistory?alt=proto");
            sb.append(sb2.toString());
            bxuo bxuo = (bxuo) sgv.mo25513a(clientContext, 1, sb.toString(), cabx2.mo73642k(), bxuo.f164865a);
        } catch (VolleyError | gid e) {
            throw new yqh(e);
        }
    }

    /* renamed from: a */
    public final void mo30707a(Collection collection) {
        bxvd da = cacj.f172559d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacj cacj = (cacj) da.f164949b;
        "me".getClass();
        cacj.f172561a |= 1;
        cacj.f172562b = "me";
        if (!cacj.f172563c.mo73666a()) {
            cacj.f172563c = bxvk.m124021a(cacj.f172563c);
        }
        bxsy.m123078a(collection, cacj.f172563c);
        cacj cacj2 = (cacj) da.mo74062i();
        try {
            yrb yrb = this.f54519b;
            ClientContext clientContext = this.f54520c;
            sgv sgv = yrb.f54472a;
            StringBuilder sb = new StringBuilder();
            String a = shd.m35267a(String.valueOf(cacj2.f172562b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 34);
            sb2.append("/users/");
            sb2.append(a);
            sb2.append("/purgeDataSources?alt=proto");
            sb.append(sb2.toString());
            bxuo bxuo = (bxuo) sgv.mo25513a(clientContext, 1, sb.toString(), cacj2.mo73642k(), bxuo.f164865a);
        } catch (VolleyError | gid e) {
            throw new yqh(e);
        }
    }

    /* renamed from: a */
    public final boolean mo30708a(long j) {
        bxvd da = cacc.f172510d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacc cacc = (cacc) da.f164949b;
        "me".getClass();
        cacc.f172512a |= 1;
        cacc.f172513b = "me";
        cacc cacc2 = (cacc) da.mo74062i();
        try {
            yrb yrb = this.f54519b;
            ClientContext clientContext = this.f54520c;
            sgv sgv = yrb.f54472a;
            StringBuilder sb = new StringBuilder();
            String a = shd.m35267a(String.valueOf(cacc2.f172513b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 31);
            sb2.append("/users/");
            sb2.append(a);
            sb2.append("/accountStatus?alt=proto");
            sb.append(sb2.toString());
            if (!(cacc2 == null || (cacc2.f172512a & 2) == 0)) {
                cack cack = cacc2.f172514c;
                if (cack == null) {
                    cack = cack.f172565d;
                }
                if ((cack.f172567a & 1) != 0) {
                    cack cack2 = cacc2.f172514c;
                    if (cack2 == null) {
                        cack2 = cack.f172565d;
                    }
                    String valueOf = String.valueOf(shd.m35267a(cack2.f172568b));
                    sb.append(valueOf.length() == 0 ? new String("&header.userAgent=") : "&header.userAgent=".concat(valueOf));
                }
            }
            if (!(cacc2 == null || (cacc2.f172512a & 2) == 0)) {
                cack cack3 = cacc2.f172514c;
                if (cack3 == null) {
                    cack3 = cack.f172565d;
                }
                if ((cack3.f172567a & 2) != 0) {
                    cack cack4 = cacc2.f172514c;
                    if (cack4 == null) {
                        cack4 = cack.f172565d;
                    }
                    String valueOf2 = String.valueOf(shd.m35267a(cack4.f172569c));
                    sb.append(valueOf2.length() == 0 ? new String("&header.serverToken=") : "&header.serverToken=".concat(valueOf2));
                }
            }
            return ((caax) sgv.mo25514a(clientContext, 0, sb.toString(), (byte[]) null, caax.f172389b, j)).f172391a;
        } catch (VolleyError | gid | TimeoutException e) {
            throw new yqh(e);
        }
    }
}
