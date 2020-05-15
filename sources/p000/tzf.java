package p000;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import java.util.Formatter;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: tzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzf extends txn {

    /* renamed from: h */
    public static final /* synthetic */ int f47001h = 0;

    /* renamed from: i */
    private static final sbw f47002i = new sbw("SetTrashedAction", "");

    /* renamed from: g */
    public final ung f47003g;

    /* renamed from: j */
    private final long f47004j = ((Long) twy.f46818aB.mo58455c()).longValue();

    public tzf(uih uih, AppIdentity appIdentity, ukk ukk, ung ung) {
        super(txr.TRASH, uih, appIdentity, ukk, tyq.NORMAL);
        boolean z = true;
        if (!ung.mo27698a() && !ung.mo27699b()) {
            z = false;
        }
        sdo.m34974b(z);
        this.f47003g = ung;
    }

    /* renamed from: a */
    private static void m37800a(uhn uhn, long j, ujx ujx, ung ung) {
        ukt a = vpb.m40984a(uhn, ujx);
        vpb.m40989a(ujx, a, ung, j);
        ujx.mo27627m(true);
        a.mo27725t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final txp mo26918b(txu txu, uey uey, ujx ujx) {
        uhn uhn = txu.f46958a;
        long j = txu.f46959b;
        uih uih = uey.f47394a;
        AppIdentity appIdentity = uey.f47396c;
        tzd tzd = new tzd(this, uhn, uih, uey);
        mo26917a(ujx, txu.f46960c, tzd);
        Set<ujx> a = tzd.mo28728a();
        if (a.size() == 0) {
            return new typ(uih, appIdentity, tyq.NONE);
        }
        if (this.f47003g.mo27699b()) {
            for (ujx ujx2 : a) {
                m37800a(uhn, j, ujx2, this.f47003g);
            }
        } else {
            ukk a2 = ujx.mo27551a();
            for (ujx ujx3 : a) {
                if (!ujx3.mo27551a().equals(a2)) {
                    m37800a(uhn, j, ujx3, ung.IMPLICITLY_TRASHED);
                }
            }
            m37800a(uhn, j, ujx, this.f47003g);
        }
        return new tzr(uih, appIdentity, ujx.mo27551a());
    }

    /* renamed from: c */
    public final void mo26893c(txv txv) {
        try {
            if (!mo26916e(txv.f46961a.f49757d).mo27640w()) {
                return;
            }
        } catch (uaa e) {
            return;
        } catch (tzu e2) {
            f47002i.mo25373b("SetTrashedAction", "App has no longer access, so sleeping just in case", e2);
        }
        SystemClock.sleep(this.f47004j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            tzf tzf = (tzf) obj;
            return mo26884a(tzf) && this.f47003g.equals(tzf.f47003g);
        }
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("trashedState", this.f47003g.f48312d);
        return h;
    }

    public final int hashCode() {
        return (mo26905n() * 31) + this.f47003g.hashCode();
    }

    public final String toString() {
        return String.format(Locale.US, "SetTrashedAction [%s, mTrashedState=%s]", mo26904m(), this.f47003g);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uhc.a(uhn, vkr, ujx, java.lang.String):void
     arg types: [uhn, vkt, ujx, java.lang.String]
     candidates:
      uhc.a(uhm, vkr, ujx, java.lang.String):void
      uhc.a(uhn, vkr, ujx, java.lang.String):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vkt vkt;
        ClientContext clientContext2 = clientContext;
        vpu vpu = txv.f46961a;
        uhn uhn = vpu.f49757d;
        String str2 = mo26895d(uhn).f47395b;
        long j = txv.f46962b;
        if (!ung.IMPLICITLY_TRASHED.equals(this.f47003g)) {
            if (this.f47003g.mo27698a()) {
                vld vld = new vld(vpu.f49762i.mo28605a(clientContext2, 2830));
                try {
                    shc shc = new shc();
                    shc.mo25530a(vkv.m40740a(File.class, vkv.m40744a(clientContext)));
                    StringBuilder sb = new StringBuilder();
                    new Formatter(sb).format("files/%1$s/trash", shd.m35267a(str));
                    shc.mo25531a(sb);
                    vkt = new vkt((File) vld.f49433a.mo25536a(clientContext, 1, sb.toString(), (Object) null, File.class), clientContext2, null);
                } catch (VolleyError e) {
                    vpg.m41006a(e);
                    throw e;
                }
            } else {
                vld vld2 = new vld(vpu.f49762i.mo28605a(clientContext2, 2831));
                try {
                    shc shc2 = new shc();
                    shc2.mo25530a(vkv.m40740a(File.class, vkv.m40744a(clientContext)));
                    StringBuilder sb2 = new StringBuilder();
                    new Formatter(sb2).format("files/%1$s/untrash", shd.m35267a(str));
                    shc2.mo25531a(sb2);
                    vkt = new vkt((File) vld2.f49433a.mo25536a(clientContext, 1, sb2.toString(), (Object) null, File.class), clientContext2, null);
                } catch (VolleyError e2) {
                    vpg.m41006a(e2);
                    throw e2;
                }
            }
            uhn.mo27435d();
            try {
                ujx e3 = mo26916e(uhn);
                if (e3 != null && !e3.mo27537O()) {
                    uhc.m38506a(uhn, (vkr) vkt, e3, str2);
                    e3.mo27629n(false);
                    if (!e3.mo27640w()) {
                        vpb.m40991b(uhn, this.f46915b, j, false);
                        uhn.mo27442f();
                    }
                }
                uih uih = this.f46915b;
                txr txr = this.f46914a;
                sqv sqv = vpu.f49747F;
                uhn.mo27413a(uih, txr, j, System.currentTimeMillis());
                vpu.f49759f.mo27003d();
                uhn.mo27442f();
            } finally {
                uhn.mo27439e();
            }
        } else {
            throw new IllegalStateException("Cannot apply an implicit trash action on the server");
        }
    }

    public tzf(uih uih, JSONObject jSONObject) {
        super(txr.TRASH, uih, jSONObject);
        ung a = ung.m38978a(jSONObject.getLong("trashedState"));
        this.f47003g = a;
        boolean z = true;
        if (!a.mo27698a() && !this.f47003g.mo27699b()) {
            z = false;
        }
        sdo.m34974b(z);
    }
}
