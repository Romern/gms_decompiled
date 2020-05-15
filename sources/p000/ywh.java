package p000;

import com.google.android.gms.fitness.data.MapValue;
import com.google.android.gms.fitness.data.Value;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ywh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywh {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public static bngx m44944a(Collection collection) {
        caaw caaw;
        boolean z;
        Map map;
        bngs b = bngx.m109371b(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Value value = (Value) it.next();
            caau caau = (caau) caaw.f172379i.mo74144da();
            if (value.f32182b) {
                int a = caak.m126415a(value.f32181a);
                if (a != 0) {
                    boolean z2 = true;
                    switch (a) {
                        case 1:
                            int a2 = value.mo18986a();
                            if (caau.f164950c) {
                                caau.mo74035c();
                                caau.f164950c = false;
                            }
                            caaw caaw2 = (caaw) caau.f164949b;
                            caaw2.f172381a |= 1;
                            caaw2.f172382b = a2;
                            break;
                        case 2:
                            if (value.f32181a != 2) {
                                z2 = false;
                            }
                            sdo.m34971a(z2, (Object) "Value is not in float format");
                            double d = (double) value.f32183c;
                            if (caau.f164950c) {
                                caau.mo74035c();
                                caau.f164950c = false;
                            }
                            caaw caaw3 = (caaw) caau.f164949b;
                            caaw3.f172381a |= 2;
                            caaw3.f172383c = d;
                            break;
                        case 3:
                            if (value.f32181a != 3) {
                                z2 = false;
                            }
                            sdo.m34971a(z2, (Object) "Value is not in string format");
                            String str = value.f32184d;
                            if (str != null) {
                                if (caau.f164950c) {
                                    caau.mo74035c();
                                    caau.f164950c = false;
                                }
                                caaw caaw4 = (caaw) caau.f164949b;
                                str.getClass();
                                caaw4.f172381a = 4 | caaw4.f172381a;
                                caaw4.f172384d = str;
                                break;
                            }
                            break;
                        case 4:
                            if (value.f32181a == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sdo.m34971a(z, (Object) "Value is not in float map format");
                            Map map2 = value.f32185e;
                            if (map2 == null || map2.isEmpty()) {
                                map = Collections.emptyMap();
                            } else {
                                HashMap hashMap = new HashMap(value.f32185e.size());
                                for (Map.Entry entry : value.f32185e.entrySet()) {
                                    hashMap.put((String) entry.getKey(), Float.valueOf(((MapValue) entry.getValue()).mo18955a()));
                                }
                                map = Collections.unmodifiableMap(hashMap);
                            }
                            bnha a3 = bnhe.m109406a(map.size());
                            for (Map.Entry entry2 : map.entrySet()) {
                                String str2 = (String) entry2.getKey();
                                bxvd da = caar.f172365c.mo74144da();
                                double floatValue = (double) ((Float) entry2.getValue()).floatValue();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                caar caar = (caar) da.f164949b;
                                caar.f172367a |= 1;
                                caar.f172368b = floatValue;
                                a3.mo67695b(str2, (caar) da.mo74062i());
                            }
                            bnhe b2 = a3.mo67618b();
                            if (caau.f164950c) {
                                caau.mo74035c();
                                caau.f164950c = false;
                            }
                            ((caaw) caau.f164949b).mo74604c().putAll(b2);
                            break;
                        case 5:
                            if (value.f32181a != 5) {
                                z2 = false;
                            }
                            sdo.m34971a(z2, (Object) "Value is not in int list format");
                            caau.mo74603b(bqcn.m112586b(value.f32186f));
                            break;
                        case 6:
                            if (value.f32181a != 6) {
                                z2 = false;
                            }
                            sdo.m34971a(z2, (Object) "Value is not in float list format");
                            caau.mo74601a(bqcl.m112573a(value.f32187g));
                            break;
                        default:
                            if (value.f32181a != 7) {
                                z2 = false;
                            }
                            sdo.m34971a(z2, (Object) "Value is not in blob format");
                            ByteString a4 = ByteString.m123261a(value.f32188h);
                            if (caau.f164950c) {
                                caau.mo74035c();
                                caau.f164950c = false;
                            }
                            caaw caaw5 = (caaw) caau.f164949b;
                            a4.getClass();
                            caaw5.f172381a |= 8;
                            caaw5.f172388h = a4;
                            break;
                    }
                    caaw = (caaw) caau.mo74062i();
                } else {
                    throw null;
                }
            } else {
                caaw = caaw.f172379i;
            }
            b.mo67668c(caaw);
        }
        return b.mo67664a();
    }
}
