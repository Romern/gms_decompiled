package p000;

import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.MapValue;
import com.google.android.gms.fitness.data.RawDataPoint;
import com.google.android.gms.fitness.data.Value;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: ywd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywd {
    /* renamed from: a */
    public static bngx m44934a(Collection collection, String str) {
        boolean z;
        DataSource dataSource;
        bngs b = bngx.m109371b(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            cadn cadn = (cadn) it.next();
            if ((cadn.f172701a & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "Only standalone protos can be converted");
            caae caae = cadn.f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            DataSource a = yvx.m44927a(caae, str);
            if ((cadn.f172701a & 8) != 0) {
                caae caae2 = cadn.f172706f;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                dataSource = yvx.m44927a(caae2, str);
            } else {
                dataSource = null;
            }
            b.mo67668c(m44937a(cadn, a, dataSource));
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    public static cadn m44935a(DataPoint dataPoint) {
        cadm cadm = (cadm) cadn.f172699j.mo74144da();
        caae a = yvx.m44925a(dataPoint.f31992a);
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        a.getClass();
        cadn.f172705e = a;
        cadn.f172701a |= 4;
        return m44936a(dataPoint, cadm);
    }

    /* renamed from: a */
    public static cadn m44936a(DataPoint dataPoint, cadm cadm) {
        boolean z;
        if ((((cadn) cadm.f164949b).f172701a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Full data point must have data source");
        DataSource dataSource = dataPoint.f31996e;
        if (dataSource != null) {
            caae a = yvx.m44925a(dataSource);
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn = (cadn) cadm.f164949b;
            cadn cadn2 = cadn.f172699j;
            a.getClass();
            cadn.f172706f = a;
            cadn.f172701a |= 8;
        }
        long j = dataPoint.f31997f;
        if (j != 0) {
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn3 = (cadn) cadm.f164949b;
            cadn cadn4 = cadn.f172699j;
            cadn3.f172701a |= 16;
            cadn3.f172707g = j;
        }
        long j2 = dataPoint.f31994c;
        if (j2 != 0) {
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn5 = (cadn) cadm.f164949b;
            cadn cadn6 = cadn.f172699j;
            cadn5.f172701a |= 2;
            cadn5.f172703c = j2;
        }
        long a2 = dataPoint.mo18894a(TimeUnit.NANOSECONDS);
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn7 = (cadn) cadm.f164949b;
        cadn cadn8 = cadn.f172699j;
        cadn7.f172701a = 1 | cadn7.f172701a;
        cadn7.f172702b = a2;
        cadm.mo74614a(ywh.m44944a(Arrays.asList(dataPoint.f31995d)));
        return (cadn) cadm.mo74062i();
    }

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
    public static DataPoint m44937a(cadn cadn, DataSource dataSource, DataSource dataSource2) {
        long j;
        int i;
        Value value;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        cadn cadn2 = cadn;
        DataSource dataSource3 = dataSource;
        bngx a = ywc.m44932a(dataSource3.f32005a.f32065b);
        long j2 = cadn2.f172702b;
        long j3 = cadn2.f172703c;
        bxwc bxwc = cadn2.f172704d;
        Value[] valueArr = new Value[a.size()];
        int i2 = 0;
        while (i2 < a.size()) {
            if (i2 < bxwc.size()) {
                caal caal = (caal) a.get(i2);
                caaw caaw = (caaw) bxwc.get(i2);
                if (caaw != null) {
                    int a2 = caak.m126415a(caal.f172343c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    value = new Value(a2);
                    int a3 = caak.m126415a(caal.f172343c);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    switch (a3) {
                        case 1:
                            j = j3;
                            if ((caaw.f172381a & 1) != 0) {
                                int i3 = caaw.f172382b;
                                if (value.f32181a == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sdo.m34971a(z, (Object) "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
                                value.f32182b = true;
                                value.f32183c = Float.intBitsToFloat(i3);
                                break;
                            }
                            break;
                        case 2:
                            j = j3;
                            if ((caaw.f172381a & 2) != 0) {
                                float f = (float) caaw.f172383c;
                                if (value.f32181a == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                sdo.m34971a(z2, (Object) "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
                                value.f32182b = true;
                                value.f32183c = f;
                                break;
                            }
                            break;
                        case 3:
                            j = j3;
                            if ((caaw.f172381a & 4) != 0) {
                                String str = caaw.f172384d;
                                if (value.f32181a == 3) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                sdo.m34971a(z3, (Object) "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
                                value.f32182b = true;
                                value.f32184d = str;
                                break;
                            }
                            break;
                        case 4:
                            if (caaw.f172385e.size() <= 0) {
                                j = j3;
                                break;
                            } else {
                                Map unmodifiableMap = Collections.unmodifiableMap(caaw.f172385e);
                                bnha a4 = bnhe.m109406a(unmodifiableMap.size());
                                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                                    a4.mo67695b((String) entry.getKey(), Float.valueOf((float) ((caar) entry.getValue()).f172368b));
                                    j3 = j3;
                                }
                                j = j3;
                                bnhe b = a4.mo67618b();
                                if (value.f32181a == 4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                sdo.m34971a(z4, (Object) "Attempting to set a float map value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
                                value.f32182b = true;
                                value.f32185e = new HashMap();
                                for (Map.Entry entry2 : b.entrySet()) {
                                    value.f32185e.put((String) entry2.getKey(), new MapValue(2, ((Float) entry2.getValue()).floatValue()));
                                }
                                break;
                            }
                        case 5:
                            if (caaw.f172386f.size() > 0) {
                                int[] a5 = bqcn.m112584a(caaw.f172386f);
                                if (value.f32181a == 5) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                sdo.m34971a(z5, (Object) "Attempting to set an int array value to a field that is not in INT32_LIST format. Please check the data type definition and use the right format.");
                                value.f32182b = true;
                                value.f32186f = a5;
                            }
                            j = j3;
                            break;
                        case 6:
                            if (caaw.f172387g.size() > 0) {
                                float[] a6 = bqcl.m112574a(caaw.f172387g);
                                if (value.f32181a == 6) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                sdo.m34971a(z6, (Object) "Attempting to set an float array value to a field that is not in FLOAT_LIST format. Please check the data type definition and use the right format.");
                                value.f32182b = true;
                                value.f32187g = a6;
                            }
                            j = j3;
                            break;
                        default:
                            j = j3;
                            if (!((caaw.f172381a & 8) == 0 || caaw.f172388h.mo73744a() == 0)) {
                                byte[] k = caaw.f172388h.mo73780k();
                                sdo.m34971a(value.f32181a == 7, (Object) "Attempting to set an blob value to a field that is not in BLOB format. Please check the data type definition and use the right format.");
                                value.f32182b = true;
                                value.f32188h = k;
                                break;
                            }
                    }
                } else {
                    j = j3;
                    value = null;
                }
                valueArr[i2] = value;
            } else {
                j = j3;
                int a7 = caak.m126415a(((caal) a.get(i2)).f172343c);
                if (a7 != 0) {
                    i = a7;
                } else {
                    i = 1;
                }
                valueArr[i2] = new Value(i);
            }
            i2++;
            j3 = j;
        }
        return new DataPoint(dataSource3, dataSource2, new RawDataPoint(j2, j3, valueArr, -1, -1, cadn2.f172707g));
    }
}
