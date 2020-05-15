package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OneoffRebuildIndexChimeraService extends abwj {

    /* renamed from: a */
    static final aebo f79065a;

    static {
        aebn aebn = new aebn();
        aebn.f63074a = 0;
        aebn.f63075b = (int) TimeUnit.MINUTES.toSeconds(30);
        aebn.f63076c = (int) TimeUnit.DAYS.toSeconds(1);
        f79065a = aebn.mo34011a();
    }

    /* renamed from: a */
    public static void m66669a(Context context, acrl acrl, Intent intent) {
        if (!((Boolean) abzt.f58865aF.mo58455c()).booleanValue()) {
            absg.m48184a("UPDATE_INDEX OneOff Scheduling Disabled.");
            return;
        }
        sdo.m34959a(context);
        sdo.m34959a(intent);
        if (intent.getData() == null) {
            absg.m48186a("Empty data in intent %s from %s.", intent.getAction(), intent.getPackage());
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            absg.m48184a("Couldn't find package name from rebuild index intent.");
            return;
        }
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (acrl.mo33045p(schemeSpecificPart) != 0) {
            absg.m48185a("Already sent rebuild index request to %s.", schemeSpecificPart);
        } else {
            m66670a(context, schemeSpecificPart, bpzu.ONE_OFF_REASON_INSTALL);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (((java.lang.Boolean) p000.abzt.f58871aL.mo58455c()).booleanValue() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (p000.abvs.m48363b(r7, r0) == false) goto L_0x002a;
     */
    /* renamed from: a */
    public static void m66670a(Context context, String str, bpzu bpzu) {
        long j;
        long j2;
        sdo.m34959a((Object) str);
        if (!"com.google.android.gms".equals(str)) {
            Intent a = abvs.m48359a(str);
            if (!abvs.m48362a(context, a)) {
            }
            int i = 0;
            String valueOf = String.valueOf(str.substring(Math.max(0, str.length() - 119)));
            String str2 = valueOf.length() == 0 ? new String("OneoffIndexRebuild-") : "OneoffIndexRebuild-".concat(valueOf);
            Bundle bundle = new Bundle();
            bundle.putString("packageName", str);
            bundle.putInt("sourceValue", bpzu.mo3214a());
            aeat a2 = aeat.m51532a(context);
            if (!abzt.m48726a(context)) {
                j2 = ((Long) abzt.f58928bP.mo58455c()).longValue();
                j = ((Long) abzt.f58929bQ.mo58455c()).longValue();
            } else {
                j2 = 30;
                j = 60;
            }
            aebi aebi = new aebi();
            aebi.mo34004a(j2, j);
            aebi.f63106r = f79065a;
            aebi.f63107s = bundle;
            aebi.f63099k = str2;
            aebi.f63102n = true;
            aebi.mo34026a(((Boolean) abzt.f58984d.mo58455c()).booleanValue());
            aebi.mo34023a(((Integer) abzt.f58931bS.mo58455c()).intValue());
            boolean booleanValue = ((Boolean) abzt.f58930bR.mo58455c()).booleanValue();
            if (cdny.m134338c() || ((Boolean) abzt.f58930bR.mo58455c()).booleanValue()) {
                i = 1;
            }
            aebi.mo34024a(booleanValue ? 1 : 0, i);
            aebi.f63097i = "com.google.android.gms.icing.indexapi.OneoffRebuildIndexService";
            aebi.mo34027b(1);
            a2.mo33984a(aebi.mo33974b());
            absg.m48185a("Scheduled oneoff index rebuild for %s.", str);
            return;
        }
        absg.m48185a("Rebuild index intent missing for package %s.", str);
    }

    /* renamed from: a */
    public final int mo32383a(aecc aecc, abvs abvs) {
        if (((Boolean) abzt.f58866aG.mo58455c()).booleanValue()) {
            Bundle bundle = aecc.f63129b;
            sdo.m34959a(bundle);
            String string = bundle.getString("packageName");
            int i = bundle.getInt("sourceValue", 0);
            if (string == null || stm.m36302d(string)) {
                absg.m48192b("%s: package name is null or empty.", aecc.f63128a);
                return 2;
            }
            if (abvs.mo32366a(string, System.currentTimeMillis(), (bpzu) bmxu.m108565a(bpzu.m112450a(i), bpzu.UNKNOWN), true)) {
                return 0;
            }
            absg.m48185a("Failed to send index request to package %s; will reschedule.", string);
            return 1;
        }
        absg.m48184a("UPDATE_INDEX OneOff Task Disabled.");
        return 0;
    }
}
