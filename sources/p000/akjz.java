package p000;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.netrec.scoring.client.wfa.WfaPackageChangedReceiver;
import com.google.android.gms.netrec.scoring.service.ClearDatabaseService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: akjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjz {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static final void m59905a(Context context) {
        boolean z;
        List list;
        eoa.m10826b("NetRec", "onConfigChanged()", new Object[0]);
        int i = spn.f44932a;
        if (soz.m35811h(context)) {
            aklx.m59991b(context);
            aklx.m59992c(context);
            if (aklx.m59989a(context)) {
                int i2 = Build.VERSION.SDK_INT;
                if (akmq.m60024b(context) && cfpd.m142364d()) {
                    WfaPackageChangedReceiver.m67653a(context);
                    if (aklx.m59989a(context)) {
                        aklx.m59987a();
                        if (akmq.m60024b(context) && cfpd.m142364d()) {
                            akll.m59971a(context);
                            aklc.m59952a();
                            akld.m59956c(context);
                            aklk.m59959a(context);
                            if (akmq.m60024b(context) || !cfpd.m142364d()) {
                                ClearDatabaseService.m67657a(context);
                                eoa.m10826b("NetRec", "Cancelling all NetRec GCM tasks", new Object[0]);
                                aeat.m51532a(context).mo33985a("com.google.android.gms.netrec.module.NetRecGcmTaskService");
                                if (akmi.m60010b(context)) {
                                    akmq.m60025c(context);
                                    return;
                                }
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            try {
                                sqy.m36057a(new BufferedReader(new StringReader(cfpd.f185332a.mo6606a().mo82435S())), arrayList);
                            } catch (IOException e) {
                                eoa.m10825a("NetRec", e, "Error parsing flag", new Object[0]);
                            }
                            bnic.m109495a((Collection) arrayList);
                            akni akni = new akni(context);
                            String N = cfpd.f185332a.mo6606a().mo82430N();
                            synchronized (akni.f72303a) {
                                long hashCode = (long) N.hashCode();
                                if (hashCode != akni.f72304b) {
                                    akni.f72304b = hashCode;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (!z) {
                                list = bngx.m109376e();
                            } else if (N.isEmpty()) {
                                list = bngx.m109376e();
                            } else {
                                byte[] decode = Base64.decode(N, 3);
                                try {
                                    list = ((akkq) GeneratedMessageLite.m124016a(akkq.f72175b, decode, bxus.m123744c())).f72177a;
                                } catch (bxwf e2) {
                                    try {
                                        list = aknc.m60070a(aknc.f72295c.mo66925c((CharSequence) N));
                                    } catch (IllegalArgumentException e3) {
                                        eoa.m10825a("NetRec", e3, "could not parse flag as protocol buffer or debug string", new Object[0]);
                                        list = bngx.m109376e();
                                    }
                                }
                            }
                            if (!list.isEmpty()) {
                                eoa.m10826b("NetRec", "Injecting %d networks", Integer.valueOf(list.size()));
                                akni.mo39584a(list);
                                return;
                            }
                            return;
                        }
                    }
                    akll.m59972b(context);
                    aklc.m59952a();
                    akld.m59956c(context);
                    aklk.m59959a(context);
                    if (akmq.m60024b(context)) {
                    }
                    ClearDatabaseService.m67657a(context);
                    eoa.m10826b("NetRec", "Cancelling all NetRec GCM tasks", new Object[0]);
                    aeat.m51532a(context).mo33985a("com.google.android.gms.netrec.module.NetRecGcmTaskService");
                    if (akmi.m60010b(context)) {
                    }
                }
            }
            WfaPackageChangedReceiver.m67654b(context);
            if (aklx.m59989a(context)) {
            }
            akll.m59972b(context);
            aklc.m59952a();
            akld.m59956c(context);
            aklk.m59959a(context);
            if (akmq.m60024b(context)) {
            }
            ClearDatabaseService.m67657a(context);
            eoa.m10826b("NetRec", "Cancelling all NetRec GCM tasks", new Object[0]);
            aeat.m51532a(context).mo33985a("com.google.android.gms.netrec.module.NetRecGcmTaskService");
            if (akmi.m60010b(context)) {
            }
        } else {
            eoa.m10826b("NetRec", "Early exit from onConfigChanged(), not the primary user.", new Object[0]);
        }
    }

    /* renamed from: b */
    public static final void m59906b(Context context) {
        eoa.m10826b("NetRec", "onAppUpdated()", new Object[0]);
        int i = spn.f44932a;
        if (!soz.m35811h(context)) {
            eoa.m10826b("NetRec", "Early exit from onAppUpdated(), not the primary user.", new Object[0]);
        } else {
            m59905a(context);
        }
    }
}
