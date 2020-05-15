package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: appy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class appy extends aplq {

    /* renamed from: a */
    private final abrv f84791a;

    public appy(abrv abrv, GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, abyy abyy) {
        super(bqbd.GET_GLOBAL_SEARCH_SOURCES, 1, 2, abrv.f58066b, getGlobalSearchSourcesCall$Request, abyy);
        this.f84791a = abrv;
    }

    /* renamed from: a */
    private static final void m70818a(Map map, String str, absr absr) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        GetGlobalSearchSourcesCall$CorpusInfo getGlobalSearchSourcesCall$CorpusInfo = new GetGlobalSearchSourcesCall$CorpusInfo();
        getGlobalSearchSourcesCall$CorpusInfo.f107412a = absr.f58138c;
        getGlobalSearchSourcesCall$CorpusInfo.f107413b = abzm.m48659g(absr);
        getGlobalSearchSourcesCall$CorpusInfo.f107414c = abzm.m48658f(absr);
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = new Bundle();
        bundle.putParcelable("USER_HANDLE_KEY", Process.myUserHandle());
        getGlobalSearchSourcesCall$CorpusInfo.f107415d = bundle;
        ((List) map.get(str)).add(getGlobalSearchSourcesCall$CorpusInfo);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abrv.a(abyy, com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification, boolean):java.util.List
     arg types: [abyy, ?[OBJECT, ARRAY], int]
     candidates:
      abrv.a(abyy, java.lang.String, java.lang.String):absr
      abrv.a(abyy, com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification, boolean):java.util.List */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x004c A[SYNTHETIC] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        int i;
        char c;
        char c2;
        GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = new GetGlobalSearchSourcesCall$Response();
        getGlobalSearchSourcesCall$Response.f107427a = Status.f30107a;
        abrv abrv = this.f84791a;
        abyx abyx = abrv.f58077m;
        synchronized (abrv.mo32298a().mo32525a()) {
            List<absr> a = this.f84791a.mo32300a(this.f84709o, (GlobalSearchQuerySpecification) null, true);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            boolean a2 = abyx.f58772a.mo32490a();
            if ("com.google.android.googlequicksearchbox".equals(this.f84709o.f58780f)) {
                i = this.f84791a.f58077m.mo32504c();
            } else {
                i = 0;
            }
            for (absr absr : a) {
                String str = absr.f58140e;
                String str2 = absr.f58138c;
                absg.m48186a("GetGlobalSearchSourcesTask: package=%s corpus=%s", str, str2);
                if ("com.google.android.googlequicksearchbox".equals(this.f84709o.f58780f)) {
                    if (i < ((Integer) abzt.f58888ac.mo58455c()).intValue()) {
                        if (abzm.m48657e(absr)) {
                            absg.m48186a("shouldIncludeSourceForGsaVersion gsaVersion:%d minVersion:%d", Integer.valueOf(i), abzt.f58888ac.mo58455c());
                        }
                    }
                    if ("com.google.android.gms".equals(absr.f58140e)) {
                        String str3 = absr.f58138c;
                        int hashCode = str3.hashCode();
                        if (hashCode != -645665530) {
                            if (hashCode == 3000946 && str3.equals("apps")) {
                                c2 = 0;
                                if (c2 == 0 || c2 == 1) {
                                    if (i < ((Integer) abzt.f58887ab.mo58455c()).intValue()) {
                                        continue;
                                    }
                                }
                            }
                        } else if (str3.equals("contacts_contact_id")) {
                            c2 = 1;
                            if (i < ((Integer) abzt.f58887ab.mo58455c()).intValue()) {
                            }
                        }
                        c2 = 65535;
                        if (i < ((Integer) abzt.f58887ab.mo58455c()).intValue()) {
                        }
                    }
                }
                if ("com.google.android.gms".equals(absr.f58140e)) {
                    String str4 = absr.f58138c;
                    switch (str4.hashCode()) {
                        case -1837328862:
                            if (str4.equals("internal.3p:MobileApplication")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1233788050:
                            if (str4.equals("internal.3p:Event")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -815233528:
                            if (str4.equals("internal.3p:Photograph")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114009:
                            if (str4.equals("sms")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2068688884:
                            if (str4.equals("internal.3p:Contact")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2072087515:
                            if (str4.equals("internal.3p:Message")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        if (c == 5) {
                                            if (this.f84709o.mo32513b() >= ((Integer) abzt.f58918bF.mo58455c()).intValue()) {
                                            }
                                        }
                                    } else if (this.f84709o.mo32513b() >= ((Integer) abzt.f58921bI.mo58455c()).intValue()) {
                                    }
                                } else if (this.f84709o.mo32513b() >= ((Integer) abzt.f58920bH.mo58455c()).intValue()) {
                                }
                            } else if (this.f84709o.mo32513b() >= ((Integer) abzt.f58922bJ.mo58455c()).intValue()) {
                            }
                        } else if (this.f84709o.mo32513b() >= ((Integer) abzt.f58923bK.mo58455c()).intValue()) {
                        }
                    } else if (this.f84709o.mo32513b() < ((Integer) abzt.f58919bG.mo58455c()).intValue()) {
                    }
                } else if ("com.google.android.gm".equals(absr.f58140e)) {
                    if (absr.f58138c.startsWith("messages")) {
                        if (this.f84709o.mo32513b() >= ((Integer) abzt.f58924bL.mo58455c()).intValue()) {
                        }
                    }
                }
                abyv d = abyx.mo32506d(str);
                sdo.m34959a(d);
                if (!((GetGlobalSearchSourcesCall$Request) this.f84708n).f107426a) {
                    if (!d.mo32468a(str2, a2)) {
                    }
                }
                if (!"com.google.android.gms".equals(str)) {
                    m70818a(hashMap, str, absr);
                } else if (abyv.f58760a.containsKey(str2)) {
                    m70818a(hashMap2, (String) abyv.f58760a.get(str2), absr);
                } else {
                    m70818a(hashMap2, str2, absr);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource = new GetGlobalSearchSourcesCall$GlobalSearchSource();
                getGlobalSearchSourcesCall$GlobalSearchSource.f107416a = (String) entry.getKey();
                abyv d2 = abyx.mo32506d((String) entry.getKey());
                sdo.m34959a(d2);
                GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) d2.mo32478g().mo32560c();
                sdo.m34959a(globalSearchApplicationInfo);
                getGlobalSearchSourcesCall$GlobalSearchSource.f107417b = globalSearchApplicationInfo.f9563b;
                getGlobalSearchSourcesCall$GlobalSearchSource.f107418c = globalSearchApplicationInfo.f9564c;
                getGlobalSearchSourcesCall$GlobalSearchSource.f107419d = globalSearchApplicationInfo.f9565d;
                getGlobalSearchSourcesCall$GlobalSearchSource.f107420e = globalSearchApplicationInfo.f9566e;
                getGlobalSearchSourcesCall$GlobalSearchSource.f107421f = globalSearchApplicationInfo.f9567f;
                getGlobalSearchSourcesCall$GlobalSearchSource.f107422g = globalSearchApplicationInfo.f9568g;
                getGlobalSearchSourcesCall$GlobalSearchSource.f107423h = globalSearchApplicationInfo.f9569h;
                getGlobalSearchSourcesCall$GlobalSearchSource.f107424i = (GetGlobalSearchSourcesCall$CorpusInfo[]) ((List) entry.getValue()).toArray(new GetGlobalSearchSourcesCall$CorpusInfo[((List) entry.getValue()).size()]);
                getGlobalSearchSourcesCall$GlobalSearchSource.f107425j = d2.mo32469a(a2);
                arrayList.add(getGlobalSearchSourcesCall$GlobalSearchSource);
            }
            abyv d3 = abyx.mo32506d("com.google.android.gms");
            sdo.m34959a(d3);
            for (GlobalSearchApplicationInfo globalSearchApplicationInfo2 : d3.mo32479h()) {
                if (hashMap2.containsKey(globalSearchApplicationInfo2.f9563b)) {
                    GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource2 = new GetGlobalSearchSourcesCall$GlobalSearchSource();
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107416a = "com.google.android.gms";
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107417b = globalSearchApplicationInfo2.f9563b;
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107418c = globalSearchApplicationInfo2.f9564c;
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107419d = globalSearchApplicationInfo2.f9565d;
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107420e = globalSearchApplicationInfo2.f9566e;
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107421f = globalSearchApplicationInfo2.f9567f;
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107422g = globalSearchApplicationInfo2.f9568g;
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107423h = globalSearchApplicationInfo2.f9569h;
                    List list = (List) hashMap2.get(globalSearchApplicationInfo2.f9563b);
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107424i = (GetGlobalSearchSourcesCall$CorpusInfo[]) list.toArray(new GetGlobalSearchSourcesCall$CorpusInfo[list.size()]);
                    getGlobalSearchSourcesCall$GlobalSearchSource2.f107425j = d3.mo32467a(globalSearchApplicationInfo2.f9563b);
                    arrayList.add(getGlobalSearchSourcesCall$GlobalSearchSource2);
                }
            }
            getGlobalSearchSourcesCall$Response.f107428b = (GetGlobalSearchSourcesCall$GlobalSearchSource[]) arrayList.toArray(new GetGlobalSearchSourcesCall$GlobalSearchSource[arrayList.size()]);
        }
        return getGlobalSearchSourcesCall$Response;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = new GetGlobalSearchSourcesCall$Response();
        getGlobalSearchSourcesCall$Response.f107427a = status;
        return getGlobalSearchSourcesCall$Response;
    }
}
