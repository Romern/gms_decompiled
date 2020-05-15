package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* renamed from: bbav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbav {

    /* renamed from: a */
    public final Context f102244a;

    /* renamed from: b */
    public final bbep f102245b;

    /* renamed from: c */
    public final bawt f102246c;

    /* renamed from: d */
    public final bbaz f102247d;

    /* renamed from: e */
    public final bbda f102248e;

    /* renamed from: f */
    public final ayte f102249f;

    /* renamed from: g */
    public final bmxv f102250g;

    /* renamed from: h */
    public final Executor f102251h;

    /* renamed from: i */
    public final bmxv f102252i;

    public bbav(Context context, bbep bbep, bawt bawt, bbaz bbaz, bbda bbda, ayte ayte, bmxv bmxv, Executor executor, bmxv bmxv2) {
        this.f102244a = context;
        this.f102245b = bbep;
        this.f102246c = bawt;
        this.f102247d = bbaz;
        this.f102248e = bbda;
        this.f102249f = ayte;
        this.f102250g = bmxv;
        this.f102251h = executor;
        this.f102252i = bmxv2;
    }

    /* renamed from: a */
    public static boolean m87739a(bavd bavd, bavd bavd2) {
        if (!m87740b(bavd, bavd2) || bavd2.f101875e != bavd.f101875e || bavd2.f101877g != bavd.f101877g || bavd2.f101878h != bavd.f101878h) {
            return false;
        }
        bavn bavn = bavd2.f101879i;
        if (bavn == null) {
            bavn = bavn.f101895f;
        }
        bavn bavn2 = bavd.f101879i;
        if (bavn2 == null) {
            bavn2 = bavn.f101895f;
        }
        if (!bavn.equals(bavn2)) {
            return false;
        }
        int a = bavb.m87594a(bavd2.f101876f);
        if (a == 0) {
            a = 1;
        }
        int a2 = bavb.m87594a(bavd.f101876f);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a != a2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m87740b(bavd bavd, bavd bavd2) {
        return bavd.f101880j.equals(bavd2.f101880j);
    }

    /* renamed from: a */
    public final bqgg mo56040a() {
        bbfh.m87928a(this.f102244a, "gms_icing_mdd_file_group_manager_metadata", this.f102252i).edit().clear().commit();
        return bqga.m112775a((Object) null);
    }

    /* renamed from: a */
    public final bqgg mo56041a(bavd bavd) {
        return mo56043a(bavd, false, false, 0, bavd.f101880j.size());
    }

    /* renamed from: a */
    public final bqgg mo56042a(bavd bavd, int i, int i2) {
        int i3 = 1;
        if (i >= i2) {
            return bqga.m112775a((Object) true);
        }
        bauy bauy = (bauy) bavd.f101880j.get(i);
        int a = bavb.m87594a(bavd.f101876f);
        if (a != 0) {
            i3 = a;
        }
        bavt a2 = bbdd.m87829a(bauy, i3);
        bbda bbda = this.f102248e;
        return bqdx.m112674a(bqdx.m112674a(bbda.f102393c.mo56079a(a2), new bbci(bbda, a2), bbda.f102401k), new bayv(this, bavd, i, i2), this.f102251h);
    }

    /* renamed from: a */
    public final bqgg mo56043a(bavd bavd, boolean z, boolean z2, int i, int i2) {
        if (i < i2) {
            bauy bauy = (bauy) bavd.f101880j.get(i);
            int a = bavb.m87594a(bavd.f101876f);
            if (a == 0) {
                a = 1;
            }
            try {
                return bqdx.m112674a(this.f102248e.mo56072a(bbdd.m87829a(bauy, a)), new bayl(this, bauy, bavd, z, z2, i, i2), this.f102251h);
            } catch (bbdb e) {
                bbev.m87906a("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", bavd.f101873c);
                this.f102246c.mo55999a("Shared file not found in getFileGroupDownloadStatus", e);
                return bqga.m112775a(bbau.FAILED);
            }
        } else if (z) {
            return bqga.m112775a(bbau.FAILED);
        } else {
            if (!z2) {
                return bqga.m112775a(bbau.DOWNLOADED);
            }
            return bqga.m112775a(bbau.PENDING);
        }
    }

    /* renamed from: a */
    public final bqgg mo56044a(bavr bavr) {
        return bqdx.m112674a(this.f102247d.mo56051a(bavr), new bbal(this, bavr), this.f102251h);
    }

    /* renamed from: a */
    public final bqgg mo56045a(bavr bavr, bauq bauq) {
        bxvd da = bpwz.f139594g.mo74144da();
        String str = bavr.f101919b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpwz bpwz = (bpwz) da.f164949b;
        str.getClass();
        int i = bpwz.f139596a | 1;
        bpwz.f139596a = i;
        bpwz.f139597b = str;
        String str2 = bavr.f101920c;
        str2.getClass();
        bpwz.f139596a = i | 4;
        bpwz.f139599d = str2;
        bbaz bbaz = this.f102247d;
        bxvd bxvd = (bxvd) bavr.mo74142c(5);
        bxvd.mo73625a((bxvk) bavr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bavr bavr2 = (bavr) bxvd.f164949b;
        bavr bavr3 = bavr.f101916f;
        bavr2.f101918a |= 8;
        bavr2.f101922e = false;
        return bqdx.m112674a(bbaz.mo56051a((bavr) bxvd.mo74062i()), new bayu(this, da, bauq), this.f102251h);
    }

    /* renamed from: a */
    public final bqgg mo56046a(bavr bavr, bavd bavd) {
        return bqdx.m112674a(mo56041a(bavd), new bayk(this, bavd, bavr), this.f102251h);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbav.a(bavr, boolean):bqgg
     arg types: [bavr, int]
     candidates:
      bbav.a(bavd, bavd):boolean
      bbav.a(bavr, bauq):bqgg
      bbav.a(bavr, bavd):bqgg
      bbav.a(bavr, bavn):bqgg
      bbav.a(bavr, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo56047a(bavr bavr, bavn bavn) {
        return bqdf.m112620a(bqdx.m112674a(mo56048a(bavr, false), new bbaq(this, bavr, bavn), this.f102251h), Exception.class, new bbar(this, bavr), this.f102251h);
    }

    /* renamed from: a */
    public final bqgg mo56048a(bavr bavr, boolean z) {
        bxvd bxvd = (bxvd) bavr.mo74142c(5);
        bxvd.mo73625a((bxvk) bavr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bavr bavr2 = (bavr) bxvd.f164949b;
        bavr bavr3 = bavr.f101916f;
        bavr2.f101918a |= 8;
        bavr2.f101922e = z;
        return this.f102247d.mo56051a((bavr) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final boolean mo56049a(String str) {
        try {
            this.f102244a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
