package p000;

import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import java.util.List;

/* renamed from: ywe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywe {
    /* renamed from: a */
    public static cadp m44938a(DataSet dataSet) {
        cado b = yyl.m45033b(yvx.m44925a(dataSet.f31999b));
        boolean z = dataSet.f32001d;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        cadp cadp = (cadp) b.f164949b;
        cadp cadp2 = cadp.f172710f;
        cadp.f172712a |= 4;
        cadp.f172716e = z;
        List<DataPoint> b2 = dataSet.mo18904b();
        caae a = yvx.m44925a(dataSet.f31999b);
        bngs b3 = bngx.m109371b(b2.size());
        for (DataPoint dataPoint : b2) {
            cadm cadm = (cadm) cadn.f172699j.mo74144da();
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn = (cadn) cadm.f164949b;
            a.getClass();
            cadn.f172705e = a;
            cadn.f172701a |= 4;
            b3.mo67668c(ywd.m44936a(dataPoint, cadm));
        }
        b.mo74617a(b3.mo67664a());
        return (cadp) b.mo74062i();
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
    public static DataSet m44939a(cadp cadp, String str) {
        caae caae = cadp.f172713b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        ywo a = DataSet.m23672a(yvx.m44927a(caae, str));
        bngx a2 = ywd.m44934a(cadp.f172714c, str);
        sdo.m34971a(!a.f54711b, (Object) "Builder should not be mutated after calling #build.");
        DataSet dataSet = a.f54710a;
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            dataSet.mo18903a((DataPoint) a2.get(i));
        }
        a.mo30801a(cadp.f172716e);
        return a.mo30800a();
    }
}
