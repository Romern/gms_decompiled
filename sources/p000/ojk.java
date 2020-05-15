package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ojk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ojk {

    /* renamed from: a */
    public Bundle f37760a;

    /* renamed from: b */
    public List f37761b;

    /* renamed from: c */
    public ogs f37762c;

    /* renamed from: d */
    public Closeable f37763d;

    /* renamed from: e */
    public Context f37764e;

    /* renamed from: f */
    public bmzi f37765f;

    /* renamed from: g */
    public ohq f37766g;

    /* renamed from: h */
    public ofo f37767h;

    /* renamed from: i */
    public oba f37768i;

    /* renamed from: j */
    public InputStream f37769j;

    /* renamed from: k */
    public int f37770k;

    /* renamed from: l */
    public SparseArray f37771l;

    /* renamed from: m */
    public int f37772m;

    /* renamed from: n */
    public OutputStream f37773n;

    /* renamed from: o */
    public oha f37774o;

    /* renamed from: p */
    public String f37775p;

    /* renamed from: q */
    public ojo f37776q;

    /* renamed from: r */
    public ojp[] f37777r;

    /* renamed from: s */
    public int f37778s;

    /* renamed from: t */
    public int f37779t;

    /* renamed from: u */
    public ohk f37780u;

    /* renamed from: v */
    public ohv f37781v;

    /* renamed from: w */
    public final okk f37782w = new okk();

    /* renamed from: x */
    public final okz f37783x = new okz();

    /* renamed from: y */
    public ohu f37784y;

    /* renamed from: z */
    public int f37785z = 1;

    /* JADX WARN: Type inference failed for: r4v1, types: [ojo, ojv, java.lang.Object], assign insn: 0x00ae: IGET  (r4v1 ? I:ojo) = (r8v0 'this' ojk A[THIS]) ojk.q ojo */
    /* renamed from: a */
    public final ojq mo22211a() {
        Pair pair;
        Bundle bundle = this.f37760a;
        if (bundle != null) {
            ArrayList arrayList = (ArrayList) ojq.m28925a(ArrayList.class, bundle.getBinder("proto_services"));
            ArrayList parcelableArrayList = this.f37760a.getParcelableArrayList("end_points");
            if (this.f37777r == null) {
                this.f37777r = new ojp[(arrayList.size() + parcelableArrayList.size())];
                int i = 0;
                while (i < arrayList.size()) {
                    this.f37777r[i] = new ojp();
                    this.f37777r[i].f37786a = ((Integer) ((Pair) arrayList.get(i)).first).intValue();
                    try {
                        ojp ojp = this.f37777r[i];
                        bxvd da = bivb.f121921l.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bivb bivb = (bivb) da.f164949b;
                        bivb.f121923a |= 1;
                        bivb.f121924b = 0;
                        da.mo73635b((byte[]) ((Pair) arrayList.get(i)).second, bxus.m123744c());
                        ojp.f37787b = (bivb) da.mo74062i();
                        i++;
                    } catch (bxwf e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (this.f37771l == null) {
                this.f37771l = new SparseArray(parcelableArrayList.size());
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                    ? r4 = this.f37776q;
                    ojx a = ojx.m28967a(bundle2, (ojv) r4, ((nmv) r4).f36067e);
                    if (a != null) {
                        pair = new Pair(a, r4);
                    } else {
                        pair = null;
                    }
                    ojp ojp2 = new ojp();
                    this.f37777r[arrayList.size() + i2] = ojp2;
                    ojp2.f37786a = bundle2.getInt("end_point_service_id");
                    ojp2.f37788c = (ojh) pair.first;
                    ojp2.f37789d = (ofs) pair.second;
                    this.f37771l.put(ojp2.f37786a, ojp2.f37788c);
                }
            }
            if (this.f37763d == null) {
                this.f37763d = (Closeable) ojq.m28925a(Closeable.class, this.f37760a.getBinder("connection"));
            }
        }
        return new ojq(this);
    }
}
