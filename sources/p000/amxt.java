package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.List;

/* renamed from: amxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxt {

    /* renamed from: a */
    public static List f76343a;

    /* renamed from: b */
    public static amxn f76344b;

    /* renamed from: c */
    public static amxq f76345c;

    /* renamed from: d */
    public static amxp f76346d;

    /* renamed from: e */
    public final Account f76347e;

    /* renamed from: f */
    public final Bundle f76348f;

    /* renamed from: g */
    public final Context f76349g;

    /* renamed from: h */
    public final String f76350h;

    /* renamed from: i */
    public final amxr f76351i;

    /* renamed from: j */
    public final anaz f76352j;

    /* renamed from: k */
    public final SyncResult f76353k;

    /* renamed from: l */
    public final amvm f76354l;

    /* renamed from: m */
    public final String f76355m;

    /* renamed from: n */
    public final String f76356n;

    /* renamed from: o */
    public final bmxv f76357o;

    /* renamed from: p */
    public final anbu f76358p;

    /* renamed from: q */
    private final bmxv f76359q;

    /* renamed from: r */
    private final amwj f76360r;

    /* renamed from: s */
    private final alsj f76361s;

    public amxt(Account account, Bundle bundle, Context context, ContentResolver contentResolver, anaz anaz, amvm amvm, sqv sqv, ampm ampm, alsj alsj, btea btea, String str, String str2) {
        Account account2 = account;
        Context context2 = context;
        ContentResolver contentResolver2 = contentResolver;
        anaz anaz2 = anaz;
        alsj alsj2 = alsj;
        anbv anbv = anbv.f76601a;
        this.f76347e = account2;
        this.f76348f = bundle;
        this.f76349g = context2;
        this.f76350h = bundle.getString("feed");
        this.f76352j = anaz2;
        this.f76353k = ((anbh) anaz2).f76541a;
        this.f76354l = amvm;
        this.f76355m = str;
        this.f76356n = str2;
        this.f76361s = alsj2;
        amig.m62939a();
        amwl amwl = new amwl(new amwm(contentResolver2, account2));
        this.f76358p = anbv.mo41674a(context2);
        this.f76351i = new amxr(account2, amwl, this.f76358p);
        amyt amyt = new amyt(account2, contentResolver2);
        ClientContext a = Boolean.valueOf(cfvk.f185780a.mo6606a().mo83048y()).booleanValue() ? ampi.m63122a(context2, account2) : ampi.m63123a(context2, account2.name, "80");
        String a2 = ryv.m34679a(context);
        this.f76360r = new amwj(alsj2, anaz2, account2.name);
        if (cfyk.m143810b()) {
            amwj amwj = this.f76360r;
            int o = amwj.f76181a.mo40711o(amwj.f76183c);
            int i = o - 1;
            if (o != 0) {
                if (i == 0) {
                    amwj.f76181a.mo40699d(amwj.f76183c, 4);
                    alsj alsj3 = amwj.f76181a;
                    String str3 = amwj.f76183c;
                    sdo.m34973b((String) null);
                    SharedPreferences.Editor edit = alsj3.f74200a.edit();
                    String valueOf = String.valueOf(str3);
                    edit.remove(valueOf.length() == 0 ? new String("focus_first_full_sync_initial_timestamp_") : "focus_first_full_sync_initial_timestamp_".concat(valueOf)).commit();
                    amwj.f76181a.mo40705i(amwj.f76183c);
                    amwj.f76181a.mo40706j(amwj.f76183c);
                } else if (i == 1) {
                    amwj.f76181a.mo40699d(amwj.f76183c, 3);
                    alsj alsj4 = amwj.f76181a;
                    String str4 = amwj.f76183c;
                    long currentTimeMillis = System.currentTimeMillis();
                    sdo.m34973b((String) null);
                    SharedPreferences.Editor edit2 = alsj4.f74200a.edit();
                    String valueOf2 = String.valueOf(str4);
                    edit2.putLong(valueOf2.length() == 0 ? new String("focus_first_full_sync_start_timestamp_") : "focus_first_full_sync_start_timestamp_".concat(valueOf2), currentTimeMillis).commit();
                    amwj.f76182b.mo41640c();
                } else if (i == 2) {
                    amwj.f76182b.mo41640c();
                }
                amwj.mo41483a(o);
            } else {
                throw null;
            }
        }
        this.f76359q = amxe.m63599a(alsj2, anaz2, account2.name) ? bmxv.m108566b(new amxe(context2, account2, alsj2, anaz2)) : bmvz.f131120a;
        this.f76357o = amxh.m63628a(alsj2, anaz2, account2.name) ? bmxv.m108566b(new amxh(context2, account2, alsj2, anaz2)) : bmvz.f131120a;
        anav anav = new anav(context2, anaz2, bmza.m108657a(bmvy.f131119a));
        f76344b = new amxn(new amwu(context, a, ampm, a2, srb.f45012a, bmza.m108657a(bmvy.f131119a), anaz, btea, this.f76358p, this.f76359q), new amwr(context, a, ampm, a2, bmza.m108657a(bmvy.f131119a), anaz, btea, this.f76358p), amwl, contentResolver, amyt, account, anaz, amvm, sqv, anav, this.f76359q, this.f76357o);
        f76345c = new amxq(new amwt(context, a, ampm, a2, srb.f45012a, bmza.m108657a(bmvy.f131119a), anaz, btea, this.f76358p, this.f76359q), amwl, contentResolver, amyt, account, anaz, amvm, sqv, alsj, anav, this.f76359q, this.f76357o);
        amxp amxp = new amxp(context, new amwr(context, a, ampm, a2, bmza.m108657a(bmvy.f131119a), anaz, btea, this.f76358p), contentResolver, account, anaz, amvm, new amys(contentResolver2), anav, this.f76358p, this.f76359q, this.f76357o);
        f76346d = amxp;
        f76343a = Arrays.asList(f76344b, f76345c, amxp);
    }

    /* renamed from: a */
    public static void m63696a(amkb amkb) {
        for (amxs amxs : f76343a) {
            amxs.mo41549a(amkb);
        }
    }

    /* renamed from: a */
    private static void m63697a(anaz anaz, boolean z, alsj alsj, String str) {
        anbh anbh = (anbh) anaz;
        if (anbh.f76560t && !z && !anbh.f76562v) {
            String valueOf = String.valueOf(str);
            String str2 = valueOf.length() == 0 ? new String("focus_first_full_sync_failed_times_") : "focus_first_full_sync_failed_times_".concat(valueOf);
            alsj.f74200a.edit().putInt(str2, alsj.f74200a.getInt(str2, 0) + 1).apply();
        }
    }

    /* renamed from: a */
    public final void mo41555a(boolean z) {
        boolean z2;
        if (cfyk.m143810b()) {
            int i = 1;
            if (!z || ((anbh) this.f76352j).f76541a.hasError()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                amwj amwj = this.f76360r;
                int o = amwj.f76181a.mo40711o(amwj.f76183c);
                if (o == 3) {
                    amwj.f76181a.mo40699d(amwj.f76183c, 4);
                    alsj alsj = amwj.f76181a;
                    String str = amwj.f76183c;
                    long currentTimeMillis = System.currentTimeMillis();
                    sdo.m34973b((String) null);
                    SharedPreferences.Editor edit = alsj.f74200a.edit();
                    String valueOf = String.valueOf(str);
                    edit.putLong(valueOf.length() == 0 ? new String("focus_first_full_sync_finish_timestamp_") : "focus_first_full_sync_finish_timestamp_".concat(valueOf), currentTimeMillis).commit();
                }
                amwj.mo41483a(o);
                if (cfyk.m143812d()) {
                    alsj alsj2 = this.f76361s;
                    String valueOf2 = String.valueOf(this.f76347e.name);
                    alsj2.f74200a.edit().putInt(valueOf2.length() == 0 ? new String("focus_first_full_sync_failed_times_") : "focus_first_full_sync_failed_times_".concat(valueOf2), 0).apply();
                }
            }
            if (cfyk.m143812d()) {
                m63697a(this.f76352j, z2, this.f76361s, this.f76347e.name);
            }
            if (this.f76359q.mo66813a()) {
                if (!cfyk.m143812d()) {
                    m63697a(this.f76352j, z2, this.f76361s, this.f76347e.name);
                }
                amxe amxe = (amxe) this.f76359q.mo66814b();
                if (!((anbh) this.f76352j).f76560t) {
                    i = 2;
                }
                amxe.mo41519b(i, z2);
            }
        }
    }
}
