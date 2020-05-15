package p000;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: eex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eex {
    /* renamed from: a */
    public static String m10264a(ContextDataFilterImpl contextDataFilterImpl) {
        int i;
        QueryFilterParameters queryFilterParameters = contextDataFilterImpl.f30672c;
        int[] iArr = queryFilterParameters != null ? queryFilterParameters.f30698c : null;
        eeq.m10251b();
        eep a = eeq.m10250a();
        if (contextDataFilterImpl.mo18052b()) {
            int size = contextDataFilterImpl.f30670a.size();
            if (size > 1) {
                a.mo10050e();
            }
            ArrayList arrayList = contextDataFilterImpl.f30670a;
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ContextDataFilterImpl.Inclusion inclusion = (ContextDataFilterImpl.Inclusion) arrayList.get(i2);
                a.mo10049d();
                inclusion.mo18059a();
                if (inclusion.mo18060b()) {
                    a.mo10044a("context_name", Integer.valueOf(inclusion.f30674b), false);
                }
                if (inclusion.mo18061c()) {
                    TimeFilterImpl timeFilterImpl = inclusion.f30675c;
                    ArrayList arrayList2 = timeFilterImpl.f30699a;
                    if (arrayList2.size() > 1) {
                        a.mo10050e();
                    }
                    int[] iArr2 = timeFilterImpl.f30700b;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        if (length > 1) {
                            a.mo10050e();
                            i = 0;
                        } else {
                            i = 0;
                        }
                        while (i < length) {
                            a.mo10044a("time_type", Integer.valueOf(iArr2[i]), false);
                            i++;
                        }
                        if (iArr2.length > 1) {
                            a.mo10048c();
                        }
                    }
                    int size3 = arrayList2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        TimeFilterImpl.Interval interval = (TimeFilterImpl.Interval) arrayList2.get(i3);
                        a.mo10049d();
                        if (interval.mo18094a()) {
                            a.mo10043a("end_time", Long.valueOf(interval.f30701a));
                        }
                        if (interval.mo18095b()) {
                            a.mo10047b("start_time", Long.valueOf(interval.f30702b));
                        }
                        a.mo10048c();
                    }
                    if (arrayList2.size() > 1) {
                        a.mo10048c();
                    }
                }
                if (inclusion.mo18062d()) {
                    m10268a(a, inclusion.f30676d);
                }
                if (iArr != null) {
                    a.mo10042a();
                    a.f14788a.append(" sync_state");
                    a.f14788a.append(" IN (");
                    int length2 = iArr.length;
                    int i4 = 0;
                    boolean z = true;
                    while (i4 < length2) {
                        int i5 = iArr[i4];
                        if (!z) {
                            a.f14788a.append(',');
                        }
                        a.f14788a.append(i5);
                        i4++;
                        z = false;
                    }
                    a.f14788a.append(')');
                }
                a.mo10048c();
            }
            if (size > 1) {
                a.mo10048c();
            }
        }
        if (contextDataFilterImpl.mo18053c()) {
            a.mo10050e();
            ArrayList arrayList3 = contextDataFilterImpl.f30671b;
            int size4 = arrayList3.size();
            for (int i6 = 0; i6 < size4; i6++) {
                a.mo10044a("module_id", (String) arrayList3.get(i6), true);
            }
            a.mo10048c();
        }
        return a.mo10046b();
    }

    /* renamed from: a */
    public static String m10265a(tjt tjt) {
        eeq.m10251b();
        eep a = eeq.m10250a();
        if (tjt.mo26601b()) {
            int size = tjt.f46217c.size();
            if (size > 1) {
                a.mo10050e();
            }
            int i = tjt.f46216b;
            ArrayList arrayList = tjt.f46217c;
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                tjs tjs = (tjs) arrayList.get(i2);
                a.mo10049d();
                if (i == 0) {
                    a.mo10042a();
                    a.f14788a.append(" (account_id");
                    a.f14788a.append(" IS NULL OR account_id");
                    a.f14788a.append(" = '')");
                } else if (i == 1) {
                    a.mo10044a("account_id", tjt.f46215a.f13690b, true);
                }
                a.mo10044a("type", Integer.valueOf(tjs.f46212a), false);
                ArrayList arrayList2 = tjs.f46213b.f30699a;
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    TimeFilterImpl.Interval interval = (TimeFilterImpl.Interval) arrayList2.get(i3);
                    if (interval.mo18094a()) {
                        a.mo10043a("end_time", Long.valueOf(interval.f30701a));
                    }
                    if (interval.mo18095b()) {
                        a.mo10047b("start_time", Long.valueOf(interval.f30702b));
                    }
                }
                KeyFilterImpl keyFilterImpl = tjs.f46214c;
                if (keyFilterImpl != null) {
                    m10268a(a, keyFilterImpl);
                }
                a.mo10048c();
            }
            if (size > 1) {
                a.mo10048c();
            }
        }
        return a.mo10046b();
    }

    /* renamed from: a */
    public static String m10266a(tmx tmx) {
        int i;
        QueryFilterParameters a = tmx.mo18050a();
        if (a == null || (i = a.f30697b) == -1) {
            return null;
        }
        if (i > 0) {
            return Integer.toString(i);
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("eex", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("[ContextFilterSqlBuilder] Limit is invalid value: %s", i);
        return null;
    }

    /* renamed from: a */
    public static String m10267a(tmx tmx, String str) {
        int i;
        QueryFilterParameters a = tmx.mo18050a();
        if (a == null || (i = a.f30696a) == 0) {
            return null;
        }
        if (i != 1) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("eex", "a", 233, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("[ContextFilterSqlBuilder] Unknown order by value: %s", i);
            return null;
        }
        eeq.m10251b();
        return String.valueOf(str).concat(" DESC");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eep.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      eep.a(java.lang.String, java.lang.Object):void
      eep.a(java.lang.String, java.lang.Object[]):void */
    /* renamed from: a */
    private static void m10268a(eep eep, KeyFilterImpl keyFilterImpl) {
        if (!keyFilterImpl.f30692a.isEmpty()) {
            eep.mo10050e();
            ArrayList arrayList = keyFilterImpl.f30692a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                KeyFilterImpl.Inclusion inclusion = (KeyFilterImpl.Inclusion) arrayList.get(i);
                eep.mo10049d();
                String[] strArr = inclusion.f30693a;
                if (strArr != null) {
                    eep.mo10045a("string_key1", (Object[]) strArr);
                }
                String[] strArr2 = inclusion.f30694b;
                if (strArr2 != null) {
                    eep.mo10045a("string_key2", (Object[]) strArr2);
                }
                String[] strArr3 = inclusion.f30695c;
                if (strArr3 != null) {
                    eep.mo10045a("string_key3", (Object[]) strArr3);
                }
                eep.mo10048c();
            }
            eep.mo10048c();
        }
    }
}
