package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdiSyncBackgroundTaskChimeraService extends aeah {

    /* renamed from: a */
    private static final bnsn f80037a = afvx.m53604b();

    /* renamed from: b */
    private final bmzi f80038b;

    public MdiSyncBackgroundTaskChimeraService() {
        this(afwq.f64880a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, afyf, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        afyd afyd;
        afyf afyf;
        boolean z;
        afye afye;
        if (!cfgy.m139569f()) {
            bnsi d = f80037a.mo68390d();
            d.mo68432a("com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskChimeraService", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Disabled - skipping handling of task '%s'.", aecc.f63128a);
            return 2;
        }
        afwu afwu = (afwu) this.f80038b.mo6606a();
        String str = aecc.f63128a;
        bnsi d2 = afwu.f64886a.mo68390d();
        d2.mo68432a("afwu", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68420a("Dispatching task '%s'...", str);
        int lastIndexOf = str.lastIndexOf(95);
        int i = 0;
        if (lastIndexOf == -1) {
            afyd = afyd.UNKNOWN;
        } else {
            try {
                afyd = afyd.m53664a(Integer.parseInt(str.substring(0, lastIndexOf)));
                if (afyd == null) {
                    afyd = afyd.UNKNOWN;
                }
            } catch (NumberFormatException e) {
                afyd = afyd.UNKNOWN;
            }
        }
        if (afyd != afyd.UNKNOWN) {
            afye[] values = afye.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    afye = null;
                    break;
                }
                afye = values[i2];
                if (str.endsWith(afye.f64963c)) {
                    break;
                }
                i2++;
            }
            if (afye != null) {
                afyf = afyf.m53667a(afyd, afye);
                if (afyf != null) {
                    bnsi c = afvx.m53603a().mo68388c();
                    c.mo68402a((int) cfgy.m139565b());
                    c.mo68432a("afwu", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("Invalid task tag '%s'!", str);
                    return 2;
                }
                afxx afxx = (afxx) afyf;
                afxz afxz = (afxz) afwu.f64887b.get(afxx.f64951a);
                if (afxz != null) {
                    bnsi d3 = afwu.f64886a.mo68390d();
                    d3.mo68432a("afwu", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68420a("Running singleton-scoped task '%s'...", afyf);
                    i = afwu.m53626a(0, afwu.mo35051a(afyf, afxz, null));
                    bnsi d4 = afwu.f64886a.mo68390d();
                    d4.mo68432a("afwu", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d4.mo68422a("Singleton-scoped task '%s' finished with result '%d'!", (Object) afyf, i);
                    z = true;
                } else {
                    z = false;
                }
                for (Account account : (List) afwu.f64889d.mo6606a()) {
                    afxz afxz2 = (afxz) ((Map) afwu.f64888c.apply(account)).get(afxx.f64951a);
                    if (afxz2 != null) {
                        bnsi d5 = afwu.f64886a.mo68390d();
                        d5.mo68432a("afwu", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d5.mo68420a("Running account-scoped task '%s'...", afyf);
                        i = afwu.m53626a(i, afwu.mo35051a(afyf, afxz2, account));
                        z = true;
                    }
                }
                if (!z) {
                    bnsi c2 = afvx.m53603a().mo68388c();
                    c2.mo68402a((int) cfgy.m139565b());
                    c2.mo68432a("afwu", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68420a("Task '%s' has no registered task handlers!", afyf);
                    return 2;
                }
                bnsi d6 = afwu.f64886a.mo68390d();
                d6.mo68432a("afwu", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d6.mo68422a("Task '%s' finished with result '%d'!", (Object) afyf, i);
                return i;
            }
        }
        afyf = null;
        if (afyf != null) {
        }
    }

    public MdiSyncBackgroundTaskChimeraService(bmzi bmzi) {
        this.f80038b = bmzn.m108681a(bmzi);
    }
}
