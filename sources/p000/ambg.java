package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ambg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ambg extends amew {

    /* renamed from: b */
    public DataHolder f74618b;

    /* renamed from: c */
    public Cursor f74619c;

    /* renamed from: d */
    public anch f74620d;

    /* renamed from: e */
    public anch f74621e;

    /* renamed from: f */
    public ArrayList f74622f;

    /* renamed from: g */
    public HashMap f74623g;

    /* renamed from: h */
    public ambf f74624h;

    /* renamed from: i */
    public ambf f74625i;

    /* renamed from: j */
    public final boolean f74626j;

    /* renamed from: k */
    private volatile boolean f74627k;

    /* renamed from: l */
    private final int f74628l;

    /* renamed from: m */
    private Context f74629m;

    /* renamed from: a */
    public final int mo24660a() {
        mo41103d();
        return this.f74628l;
    }

    /* renamed from: c */
    public final void mo12460c() {
        if (!this.f74627k) {
            this.f74627k = true;
            this.f74618b.close();
            this.f74619c.close();
            this.f74618b = null;
            this.f74619c = null;
            this.f74620d = null;
            this.f74621e = null;
            this.f74622f = null;
            this.f74623g = null;
            this.f74629m = null;
            this.f74624h = null;
            this.f74625i = null;
        }
    }

    /* renamed from: d */
    public final void mo41103d() {
        if (this.f74627k) {
            throw new IllegalStateException("Already released");
        }
    }

    public ambg(DataHolder dataHolder, Cursor cursor, Context context, int i, anch anch, anch anch2, ArrayList arrayList, HashMap hashMap, Bundle bundle) {
        super(dataHolder);
        boolean z;
        boolean z2;
        sdo.m34959a(dataHolder);
        sdo.m34959a(cursor);
        sdo.m34959a(hashMap);
        boolean z3 = true;
        if (i == anch.mo41691a()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (i == anch2.mo41691a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34974b(z2);
        sdo.m34974b(i != arrayList.size() ? false : z3);
        this.f74618b = dataHolder;
        this.f74619c = cursor;
        this.f74628l = i;
        this.f74622f = arrayList;
        this.f74629m = context;
        this.f74623g = hashMap;
        this.f74624h = new ambc(this.f74629m.getResources());
        this.f74625i = new ambd(this.f74629m.getResources());
        this.f74620d = anch;
        this.f74621e = anch2;
        this.f74626j = false;
        new ambs(bundle);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24661a(int i) {
        mo41103d();
        return new ambe(this, i);
    }
}
