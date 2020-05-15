package com.google.android.gms.clearcut.service;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClearcutLoggerChimeraService extends zzx {

    /* renamed from: a */
    public static final bqgj f30052a = snp.m35704b(10);

    /* renamed from: b */
    public static final qwp f30053b = new rbl(rpr.m34216b());

    /* renamed from: l */
    private static final Set f30054l = bnic.m109491a("LB_C", "CL_C", "CL_DM");

    /* renamed from: k */
    private rdq f30055k;

    public ClearcutLoggerChimeraService() {
        super(new int[]{40}, new String[]{"com.google.android.gms.clearcut.service.START"}, Collections.emptySet(), 3, f30052a, null);
    }

    /* renamed from: a */
    public static void m22442a(Context context, String str, aaac aaac, LogEventParcelable logEventParcelable) {
        cafm cafm;
        if (logEventParcelable.f30030a != null) {
            if (!cdds.m132723c()) {
                if (spn.m35869b()) {
                    return;
                }
            } else if (aaac.f27823b == 2) {
                return;
            }
            int i = logEventParcelable.f30030a.f30044c;
            if (i == 24 || i == 493 || i == 494 || f30054l.contains(logEventParcelable.f30030a.f30048g)) {
                PlayLoggerContext playLoggerContext = logEventParcelable.f30030a;
                String str2 = playLoggerContext.f30048g;
                int i2 = playLoggerContext.f30044c;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 64);
                sb.append("Log source can only be written to from GmsCore: ");
                sb.append(str2);
                sb.append(" and ");
                sb.append(i2);
                throw new SecurityException(sb.toString());
            }
            cafp a = cdds.f180545a.mo6606a().mo77302a();
            int callingUid = Binder.getCallingUid();
            Map unmodifiableMap = Collections.unmodifiableMap(a.f172940c);
            int i3 = 0;
            if (!unmodifiableMap.isEmpty() && (cafm = (cafm) unmodifiableMap.get(str)) != null) {
                int i4 = logEventParcelable.f30030a.f30043b;
                bxwc bxwc = cafm.f172929a;
                int size = bxwc.size();
                for (int i5 = 0; i5 < size; i5++) {
                    cafl cafl = (cafl) bxwc.get(i5);
                    if (i4 <= cafl.f172925b && i4 >= cafl.f172924a) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31);
                        sb2.append("Log blocked: pkg=");
                        sb2.append(str);
                        sb2.append(" v=");
                        sb2.append(i4);
                        throw new SecurityException(sb2.toString());
                    }
                }
            }
            if (a.f172938a) {
                if (cdds.m132723c()) {
                    int i6 = aaac.f27823b;
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    } else if (i7 != 0) {
                        if (i7 != 1 && i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4 && i7 != 5) {
                                    throw new AssertionError();
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else if (rfz.m33557a(context).mo24608b(callingUid)) {
                    return;
                }
                PlayLoggerContext playLoggerContext2 = logEventParcelable.f30030a;
                int i8 = playLoggerContext2.f30044c;
                String str3 = playLoggerContext2.f30048g;
                bxwc bxwc2 = a.f172939b;
                int size2 = bxwc2.size();
                while (i3 < size2) {
                    cafo cafo = (cafo) bxwc2.get(i3);
                    if (cafo.f172934b != i8) {
                        i3++;
                        if (cafo.f172933a.equals(str3)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 42);
                sb3.append("Log source is restricted: ");
                sb3.append(str3);
                sb3.append(" and ");
                sb3.append(i8);
                throw new SecurityException(sb3.toString());
            }
        }
    }

    public final void onCreate() {
        this.f30055k = rds.m33429c();
    }

    public final void onDestroy() {
        srz.m36176b(this.f30055k);
    }

    /* renamed from: a */
    public static boolean m22443a(String str) {
        if (new sbe(str).mo25331a()) {
            return bmyx.m108640a(',').mo66925c(cdem.f180612a.mo77359b().mo77360a()).contains(str) || Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu") || Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys");
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new rbr(this, new aaag(this, this.f56354e, this.f56355f), this.f30055k, aaac, getServiceRequest.f30230d));
    }
}
