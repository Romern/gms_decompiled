package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: zul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zul {

    /* renamed from: a */
    private final zsr f55937a;

    /* renamed from: b */
    private final zuk f55938b;

    /* renamed from: c */
    private final zui f55939c;

    /* renamed from: d */
    private final sqv f55940d;

    static {
        zvt.m46581a();
    }

    public zul(zsr zsr, SharedPreferences sharedPreferences, zum zum, caaq caaq, sqv sqv) {
        this.f55940d = sqv;
        this.f55937a = zsr;
        this.f55939c = new zui(zsr, zum, caaq, sqv);
        this.f55938b = new zuk(sharedPreferences, sqv, caaq);
    }

    /* renamed from: a */
    public static boolean m46500a(Context context, cadt cadt) {
        if (!((bnic) yvm.f54688a.mo30787a()).isEmpty()) {
            return (cadt.WIFI_CONNECTIVITY.equals(cadt) || cadt.BT_CONNECTIVITY.equals(cadt)) && yua.m44838c(context) && yua.m44839d(context);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo31526a(Context context, zuu zuu, zra zra) {
        zui zui = this.f55939c;
        int f = (int) ceab.m135733f();
        int w = (int) ceab.f182124a.mo6606a().mo78672w();
        long a = zui.f55926b.mo20505a();
        zui.f55926b.mo20506b();
        bngx a2 = zui.m46485a(zra, f, a);
        while (!a2.isEmpty()) {
            a2.size();
            zui.mo31521a(context, a2, zra, zuu, w);
            a2 = zui.m46485a(zra, f, a);
        }
        zui.f55926b.mo20506b();
        zui.f55926b.mo20505a();
    }

    /* renamed from: a */
    public final void mo31527a(Context context, zuu zuu, zre zre) {
        long b = this.f55940d.mo20506b();
        try {
            this.f55938b.mo31525a(context, zuu, zre);
        } finally {
            long b2 = this.f55940d.mo20506b();
            zsr zsr = this.f55937a;
            zuk zuk = this.f55938b;
            zsr.mo31453a(zuk.f55932a, zuk.f55933b, b2 - b);
        }
    }

    /* renamed from: a */
    public final void mo31528a(Context context, zuu zuu, zre zre, long j) {
        long b = this.f55940d.mo20506b();
        try {
            zui zui = this.f55939c;
            int f = (int) ceab.m135733f();
            int z = (int) ceab.f182124a.mo6606a().mo78675z();
            int e = yvq.m44912e(context) + 1;
            bmxz a = zui.m46483a();
            int i = 0;
            while (true) {
                if (i >= e) {
                    break;
                }
                bngs j2 = bngx.m109377j();
                bnre i2 = zre.mo31346a(f, j).listIterator();
                while (i2.hasNext()) {
                    cabc cabc = (cabc) i2.next();
                    if (a.mo6527a(cabc.f172416d)) {
                        j2.mo67668c(cabc);
                    }
                }
                bngx a2 = j2.mo67664a();
                if (a2.isEmpty()) {
                    break;
                }
                zui.mo31521a(context, a2, zre, zuu, z);
                i++;
            }
        } finally {
            this.f55937a.mo31466d(this.f55940d.mo20506b() - b);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zui.a(zre, zqx, boolean):bnic
     arg types: [zre, zqx, int]
     candidates:
      zui.a(zra, int, long):bngx
      zui.a(zra, java.util.List, java.util.List):void
      zui.a(zre, zqx, boolean):bnic */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0150, code lost:
        if ((r0.getCause() instanceof java.util.concurrent.TimeoutException) != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0157, code lost:
        throw new p000.yqh(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015e, code lost:
        throw ((java.util.concurrent.TimeoutException) r0.getCause());
     */
    /* renamed from: a */
    public final void mo31529a(Context context, zuu zuu, zre zre, zqx zqx) {
        zuu zuu2 = zuu;
        zre zre2 = zre;
        zqx zqx2 = zqx;
        long a = this.f55940d.mo20505a();
        mo31527a(context, zuu, zre);
        mo31528a(context, zuu, zre, a);
        zui zui = this.f55939c;
        yvq.m44915h(context);
        if (!ceab.f182124a.mo6606a().mo78653d()) {
            long b = zui.f55926b.mo20506b();
            bnrd a2 = zui.mo31520a(zre2, zqx2, false).iterator();
            while (a2.hasNext()) {
                yqi yqi = (yqi) a2.next();
                zui.mo31523a(zre, zuu, yqi.f54390a, yqi.f54393d, zui.f55925a);
            }
            zui.f55928d.mo31460b(zui.f55926b.mo20506b() - b);
        } else if (ceab.m135729b()) {
            long b2 = zui.f55926b.mo20506b();
            try {
                bngs j = bngx.m109377j();
                bnrd a3 = zui.mo31520a(zre2, zqx2, false).iterator();
                while (a3.hasNext()) {
                    yqi yqi2 = (yqi) a3.next();
                    j.mo67668c(bqga.m112773a(bqdx.m112673a(zuu2.mo30702a(yqi2.f54390a, yqi2.f54393d), new zuf(yqi2), bqfb.INSTANCE), (long) ((int) ceab.m135732e()), TimeUnit.SECONDS, zui.f55927c));
                }
                bngx a4 = j.mo67664a();
                while (true) {
                    bqga.m112787d(a4).get();
                    ArrayList<zuh> arrayList = new ArrayList();
                    bnre i = a4.listIterator();
                    ExecutionException e = null;
                    while (i.hasNext()) {
                        try {
                            arrayList.add((zuh) bqga.m112780a((Future) ((bqgg) i.next())));
                        } catch (ExecutionException e2) {
                            e = e2;
                        }
                    }
                    bngs j2 = bngx.m109377j();
                    for (zuh zuh : arrayList) {
                        yre b3 = zuh.mo31516b();
                        yqi a5 = zuh.mo31515a();
                        zui.f55928d.mo31459b(b3.f54482b.size() + b3.f54481a.size());
                        yqi yqi3 = a5;
                        zui.mo31522a(zre, a5.f54390a, a5.f54393d, zui.f55925a, b3);
                        String str = b3.f54486f;
                        if (e == null) {
                            if (zui.mo31524a(b3, yqi3.f54390a)) {
                                j2.mo67668c(bqdx.m112673a(zuu2.mo30702a(yqi3.f54390a, str), new zue(yqi3), bqfb.INSTANCE));
                            }
                        }
                    }
                    if (e != null) {
                        break;
                    }
                    a4 = j2.mo67664a();
                    if (a4.isEmpty()) {
                        zui.f55928d.mo31460b(zui.f55926b.mo20506b() - b2);
                        return;
                    }
                }
            } catch (InterruptedException | ExecutionException e3) {
                zvj.m46564a(zvk.DOWNLOAD_CHANGE_LOGS, e3);
                throw yqh.m44583a(e3);
            } catch (Throwable th) {
                zui.f55928d.mo31460b(zui.f55926b.mo20506b() - b2);
                throw th;
            }
        }
    }
}
