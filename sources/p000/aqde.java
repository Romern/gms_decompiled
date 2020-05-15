package p000;

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aqde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqde {

    /* renamed from: a */
    private static final String f85759a = aqde.class.getSimpleName();

    aqde() {
    }

    /* renamed from: a */
    static SparseArray m71374a(aqco aqco) {
        int i;
        aqco aqco2 = aqco;
        if (aqco2 == null || aqco2.f85685b.size() == 0) {
            return null;
        }
        SparseArray sparseArray = new SparseArray();
        bxwc bxwc = aqco2.f85685b;
        int size = bxwc.size();
        int i2 = 0;
        while (i2 < size) {
            aqcn aqcn = (aqcn) bxwc.get(i2);
            int i3 = aqcn.f85675a;
            aqdd aqdd = new aqdd();
            int a = aqcm.m71355a(aqcn.f85676b);
            int i4 = 1;
            if (a != 0 && a == 3) {
                aqdd.f85758e = true;
            }
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            int i5 = 0;
            while (true) {
                if (i5 >= aqcn.f85677c.size()) {
                    i = i2;
                    break;
                }
                aqcy aqcy = (aqcy) aqcn.f85677c.get(i5);
                aqcf aqcf = aqcf.COMPRESSION_TYPE_UNSPECIFIED;
                aqcf a2 = aqcf.m71346a(aqcy.f85729b);
                if (a2 == null) {
                    a2 = aqcf.COMPRESSION_TYPE_UNSPECIFIED;
                }
                int ordinal = a2.ordinal();
                if (ordinal == 1) {
                    i = i2;
                    aqcs aqcs = aqcy.f85730c;
                    if (aqcs == null) {
                        aqcs = aqcs.f85699d;
                    }
                    if ((aqcs.f85701a & 2) != 0) {
                        aqcs aqcs2 = aqcy.f85730c;
                        if (aqcs2 == null) {
                            aqcs2 = aqcs.f85699d;
                        }
                        int i6 = aqcs2.f85702b;
                        aqcs aqcs3 = aqcy.f85730c;
                        if (aqcs3 == null) {
                            aqcs3 = aqcs.f85699d;
                        }
                        if (aqcs3.f85703c.mo73744a() % i6 == 0) {
                            int i7 = 0;
                            while (true) {
                                aqcs aqcs4 = aqcy.f85730c;
                                if (aqcs4 == null) {
                                    aqcs4 = aqcs.f85699d;
                                }
                                if (i7 >= aqcs4.f85703c.mo73744a()) {
                                    break;
                                }
                                try {
                                    aqcs aqcs5 = aqcy.f85730c;
                                    if (aqcs5 == null) {
                                        aqcs5 = aqcs.f85699d;
                                    }
                                    int i8 = i7 + i6;
                                    arrayList.add(new apgr(Arrays.copyOfRange(aqcs5.f85703c.mo73780k(), i7, i8)));
                                    i7 = i8;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    z = false;
                                }
                            }
                        } else {
                            Log.e(f85759a, "Additions bytes not multiple of prefix");
                            z = false;
                        }
                    }
                } else if (ordinal != 2) {
                    Log.e(f85759a, "Unrecognized compression type for additions");
                    i = i2;
                    z = false;
                } else if ((aqcy.f85728a & 8) != 0) {
                    aqcu aqcu = aqcy.f85732e;
                    if (aqcu == null) {
                        aqcu = aqcu.f85707e;
                    }
                    i = i2;
                    long j = aqcu.f85709a;
                    aqcu aqcu2 = aqcy.f85732e;
                    if (aqcu2 == null) {
                        aqcu2 = aqcu.f85707e;
                    }
                    int i9 = aqcu2.f85710b;
                    aqcu aqcu3 = aqcy.f85732e;
                    if (aqcu3 == null) {
                        aqcu3 = aqcu.f85707e;
                    }
                    int i10 = aqcu3.f85711c;
                    aqcu aqcu4 = aqcy.f85732e;
                    if (aqcu4 == null) {
                        aqcu4 = aqcu.f85707e;
                    }
                    List a3 = aqdj.m71384a(j, i9, i10, aqcu4.f85712d.mo73780k());
                    if (a3 != null) {
                        arrayList.addAll(a3);
                    } else {
                        z = false;
                    }
                } else {
                    i = i2;
                }
                if (!z) {
                    break;
                }
                i5++;
                i2 = i;
            }
            if (z) {
                PriorityQueue priorityQueue = new PriorityQueue();
                if (!aqdd.f85758e) {
                    int i11 = 0;
                    while (i11 < aqcn.f85678d.size()) {
                        aqcy aqcy2 = (aqcy) aqcn.f85678d.get(i11);
                        aqcf aqcf2 = aqcf.COMPRESSION_TYPE_UNSPECIFIED;
                        aqcf a4 = aqcf.m71346a(aqcy2.f85729b);
                        if (a4 == null) {
                            a4 = aqcf.COMPRESSION_TYPE_UNSPECIFIED;
                        }
                        int ordinal2 = a4.ordinal();
                        if (ordinal2 != i4) {
                            if (ordinal2 != 2) {
                                Log.e(f85759a, "Unrecognized compression type for removals");
                                z = false;
                            } else if ((aqcy2.f85728a & 16) != 0) {
                                aqcu aqcu5 = aqcy2.f85733f;
                                if (aqcu5 == null) {
                                    aqcu5 = aqcu.f85707e;
                                }
                                long j2 = aqcu5.f85709a;
                                aqcu aqcu6 = aqcy2.f85733f;
                                if (aqcu6 == null) {
                                    aqcu6 = aqcu.f85707e;
                                }
                                int i12 = aqcu6.f85710b;
                                aqcu aqcu7 = aqcy2.f85733f;
                                if (aqcu7 == null) {
                                    aqcu7 = aqcu.f85707e;
                                }
                                int i13 = aqcu7.f85711c;
                                aqcu aqcu8 = aqcy2.f85733f;
                                if (aqcu8 == null) {
                                    aqcu8 = aqcu.f85707e;
                                }
                                List b = aqdj.m71387b(j2, i12, i13, aqcu8.f85712d.mo73780k());
                                if (b != null) {
                                    priorityQueue.addAll(b);
                                } else {
                                    z = false;
                                }
                            }
                        } else if ((aqcy2.f85728a & 4) != 0) {
                            aqct aqct = aqcy2.f85731d;
                            if (aqct == null) {
                                aqct = aqct.f85704b;
                            }
                            priorityQueue.addAll(aqct.f85706a);
                        }
                        i11++;
                        i4 = 1;
                    }
                    if (!z) {
                    }
                }
                aqdd.f85754a = arrayList;
                if (priorityQueue.isEmpty()) {
                    priorityQueue = null;
                }
                aqdd.f85755b = priorityQueue;
                aqdd.f85757d = aqcn.f85679e.mo73780k();
                aqcc aqcc = aqcn.f85680f;
                if (aqcc == null) {
                    aqcc = aqcc.f85634b;
                }
                aqdd.f85756c = aqcc.f85636a.mo73780k();
                sparseArray.put(i3, aqdd);
            }
            i2 = i + 1;
        }
        return sparseArray;
    }

    /* renamed from: a */
    static Map m71375a(Set set, aqcr aqcr) {
        HashMap hashMap = new HashMap();
        bxwc bxwc = aqcr.f85696b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            aqdc aqdc = (aqdc) bxwc.get(i);
            if ((aqdc.f85749a & 8) != 0) {
                aqcv aqcv = aqdc.f85751c;
                if (aqcv == null) {
                    aqcv = aqcv.f85714c;
                }
                if (aqcv.f85717b.mo73744a() != 0) {
                    aqcv aqcv2 = aqdc.f85751c;
                    if (aqcv2 == null) {
                        aqcv2 = aqcv.f85714c;
                    }
                    apgr apgr = new apgr(aqcv2.f85717b.mo73780k());
                    if (hashMap.containsKey(apgr)) {
                        ((List) hashMap.get(apgr)).add(aqdc);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aqdc);
                        hashMap.put(apgr, arrayList);
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            apgr apgr2 = (apgr) entry.getKey();
            aqcq aqcq = (aqcq) aqcr.f85693e.mo74144da();
            aqcq.mo47755a((List) entry.getValue());
            aqcg aqcg = aqcr.f85697c;
            if (aqcg == null) {
                aqcg = aqcg.f85649b;
            }
            if (aqcq.f164950c) {
                aqcq.mo74035c();
                aqcq.f164950c = false;
            }
            aqcr aqcr2 = (aqcr) aqcq.f164949b;
            aqcg.getClass();
            aqcr2.f85697c = aqcg;
            aqcr2.f85695a |= 1;
            aqcg aqcg2 = aqcr.f85698d;
            if (aqcg2 == null) {
                aqcg2 = aqcg.f85649b;
            }
            if (aqcq.f164950c) {
                aqcq.mo74035c();
                aqcq.f164950c = false;
            }
            aqcr aqcr3 = (aqcr) aqcq.f164949b;
            aqcg2.getClass();
            aqcr3.f85698d = aqcg2;
            aqcr3.f85695a |= 2;
            hashMap2.put(apgr2, (aqcr) aqcq.mo74062i());
        }
        if (!(set == null || (aqcr.f85695a & 2) == 0)) {
            aqcg aqcg3 = aqcr.f85698d;
            if (aqcg3 == null) {
                aqcg3 = aqcg.f85649b;
            }
            if (aqcg3.f85651a != 0) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    apgr apgr3 = (apgr) it.next();
                    if (!hashMap2.containsKey(apgr3)) {
                        aqcq aqcq2 = (aqcq) aqcr.f85693e.mo74144da();
                        aqcg aqcg4 = aqcr.f85697c;
                        if (aqcg4 == null) {
                            aqcg4 = aqcg.f85649b;
                        }
                        if (aqcq2.f164950c) {
                            aqcq2.mo74035c();
                            aqcq2.f164950c = false;
                        }
                        aqcr aqcr4 = (aqcr) aqcq2.f164949b;
                        aqcg4.getClass();
                        aqcr4.f85697c = aqcg4;
                        aqcr4.f85695a |= 1;
                        aqcg aqcg5 = aqcr.f85698d;
                        if (aqcg5 == null) {
                            aqcg5 = aqcg.f85649b;
                        }
                        if (aqcq2.f164950c) {
                            aqcq2.mo74035c();
                            aqcq2.f164950c = false;
                        }
                        aqcr aqcr5 = (aqcr) aqcq2.f164949b;
                        aqcg5.getClass();
                        aqcr5.f85698d = aqcg5;
                        aqcr5.f85695a |= 2;
                        hashMap2.put(apgr3, (aqcr) aqcq2.mo74062i());
                    }
                }
            }
        }
        return hashMap2;
    }

    /* renamed from: a */
    static JSONObject m71376a(List list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                jSONObject2.put("threat_type", Integer.toString(((Integer) it.next()).intValue()));
                jSONArray.put(i, jSONObject2);
                i++;
            }
            if (i > 0) {
                jSONObject.put("matches", jSONArray);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static JSONObject m71377a(Set set, List list, Set set2) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (set2 != null) {
            int size = list.size();
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                aqdc aqdc = (aqdc) list.get(i2);
                if (set.contains(Integer.valueOf(aqdc.f85750b))) {
                    aqcv aqcv = aqdc.f85751c;
                    if (aqcv == null) {
                        aqcv = aqcv.f85714c;
                    }
                    if ((aqcv.f85716a & 1) != 0) {
                        aqcv aqcv2 = aqdc.f85751c;
                        if (aqcv2 == null) {
                            aqcv2 = aqcv.f85714c;
                        }
                        if (set2.contains(new apgr(aqcv2.f85717b.mo73780k()))) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("threat_type", Integer.toString(aqdc.f85750b));
                                if ((aqdc.f85749a & 16) != 0) {
                                    aqcx aqcx = aqdc.f85752d;
                                    if (aqcx == null) {
                                        aqcx = aqcx.f85723b;
                                    }
                                    bxwc bxwc = aqcx.f85725a;
                                    int size2 = bxwc.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        aqcw aqcw = (aqcw) bxwc.get(i3);
                                        try {
                                            jSONObject2.put(aqcw.f85720a.mo73781l(), aqcw.f85721b.mo73781l());
                                        } catch (JSONException e) {
                                        }
                                    }
                                }
                                try {
                                    jSONArray.put(i, jSONObject2);
                                    i++;
                                } catch (JSONException e2) {
                                }
                                z = true;
                            } catch (JSONException e3) {
                                z = true;
                            }
                        }
                    }
                }
            }
            if (z) {
                try {
                    jSONObject.put("matches", jSONArray);
                } catch (JSONException e4) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static boolean m71378a(aqcr aqcr) {
        return aqcr.f85696b.size() > 0;
    }
}
