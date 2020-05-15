package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zlx {

    /* renamed from: a */
    public final List f55418a;

    /* renamed from: b */
    public final List f55419b;

    /* renamed from: c */
    public final List f55420c = new ArrayList();

    /* renamed from: d */
    public final List f55421d = new ArrayList();

    /* renamed from: e */
    public Bucket f55422e = null;

    /* renamed from: f */
    public final List f55423f = new ArrayList();

    /* renamed from: g */
    public int f55424g = 0;

    /* renamed from: h */
    private final List f55425h = new ArrayList();

    static {
        zvt.m46581a();
    }

    public zlx(List list, List list2) {
        this.f55419b = list2;
        this.f55418a = list;
    }

    /* renamed from: a */
    private final int m45717a(DataSet dataSet) {
        int i = 0;
        if (dataSet.mo18904b().isEmpty()) {
            return this.f55424g + 24 < 100000 ? 1 : 0;
        }
        Bucket bucket = this.f55422e;
        if (bucket != null) {
            i = bucket.mo18889c();
        }
        return ((100000 - (i + 24)) - this.f55424g) / dataSet.mo18905c();
    }

    /* renamed from: b */
    public final void mo31230b() {
        if (this.f55422e != null && !this.f55423f.isEmpty()) {
            Bucket bucket = this.f55422e;
            ywl a = Bucket.m23663a();
            a.mo30794a(bucket.mo18886a(TimeUnit.MILLISECONDS), bucket.mo18887b(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS);
            a.f54703a = bucket.f31987c;
            a.f54704b = bucket.f31988d;
            a.f54705c = bucket.f31990f;
            this.f55424g += bucket.mo18889c();
            a.f54706d = bucket.mo18888b();
            List list = this.f55423f;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DataSet dataSet = (DataSet) list.get(i);
                a.mo30795a(dataSet);
                this.f55424g += (dataSet.mo18905c() * dataSet.mo18904b().size()) + 24;
            }
            this.f55425h.add(a.mo30793a());
            this.f55423f.clear();
        }
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
    private final void m45718a(DataSet dataSet, int i, int i2, List list) {
        ywo a = DataSet.m23672a(dataSet.f31999b);
        a.mo30801a(dataSet.f32001d);
        for (int i3 = i; i3 < i2; i3++) {
            sdo.m34971a(!a.f54711b, (Object) "Builder should not be mutated after calling #build.");
            a.f54710a.mo18903a((DataPoint) dataSet.mo18904b().get(i3));
        }
        list.add(a.mo30800a());
        this.f55424g += (dataSet.mo18905c() * (i2 - i)) + 24;
    }

    /* renamed from: a */
    public final void mo31228a() {
        mo31230b();
        this.f55420c.add(new DataReadResult(new ArrayList(this.f55421d), new ArrayList(this.f55425h), Status.f30107a));
        this.f55425h.clear();
        this.f55421d.clear();
        this.f55424g = 0;
    }

    /* renamed from: a */
    public final void mo31229a(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DataSet dataSet = (DataSet) it.next();
            int a = m45717a(dataSet);
            if (a <= 0) {
                mo31228a();
                a = m45717a(dataSet);
            }
            int size = dataSet.mo18904b().size();
            int i = 0;
            while (a < size - i) {
                int i2 = a + i;
                m45718a(dataSet, i, i2, list2);
                mo31228a();
                i = i2;
                a = m45717a(dataSet);
            }
            m45718a(dataSet, i, size, list2);
        }
    }
}
