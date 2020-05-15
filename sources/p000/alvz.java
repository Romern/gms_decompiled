package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: alvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alvz extends alvx {

    /* renamed from: b */
    private final List f74426b;

    /* renamed from: c */
    private final List f74427c;

    /* renamed from: d */
    private final List f74428d;

    /* renamed from: e */
    private final List f74429e;

    public alvz(alvw alvw, DataHolder dataHolder, DataHolder dataHolder2, DataHolder dataHolder3, DataHolder dataHolder4, int i) {
        super(alvw);
        ArrayList arrayList = new ArrayList();
        ArrayList a = alvx.m61959a(dataHolder4, i);
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new alvt((alvw) a.get(i2)));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList a2 = alvx.m61959a(dataHolder, i);
        int size2 = a2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            alvw alvw2 = (alvw) a2.get(i3);
            arrayList2.add(new alvs(alvw2.mo40818j("postal_address"), alvw2.mo40818j("type")));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList a3 = alvx.m61959a(dataHolder2, i);
        int size3 = a3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            alvw alvw3 = (alvw) a3.get(i4);
            arrayList3.add(new alvu(alvw3.mo40818j("email"), alvw3.mo40818j("type")));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList a4 = alvx.m61959a(dataHolder3, i);
        int size4 = a4.size();
        for (int i5 = 0; i5 < size4; i5++) {
            alvw alvw4 = (alvw) a4.get(i5);
            arrayList4.add(new alvv(alvw4.mo40818j("phone"), alvw4.mo40818j("type")));
        }
        this.f74426b = Collections.unmodifiableList(arrayList);
        this.f74427c = Collections.unmodifiableList(arrayList2);
        this.f74428d = Collections.unmodifiableList(arrayList3);
        this.f74429e = Collections.unmodifiableList(arrayList4);
    }

    /* renamed from: a */
    public final String mo40819a() {
        return mo40820a("name");
    }

    /* renamed from: b */
    public final String mo40821b() {
        return mo40820a("gaia_id");
    }

    /* renamed from: c */
    public final boolean mo40822c() {
        return this.f74422a.mo40816h("name_verified");
    }

    /* renamed from: d */
    public final String mo40823d() {
        return mo40820a("tagline");
    }

    /* renamed from: e */
    public final int mo40824e() {
        return this.f74422a.mo40817i("profile_type");
    }

    /* renamed from: f */
    public final String mo40825f() {
        return mo40820a("avatar");
    }

    /* renamed from: g */
    public final List mo40826g() {
        return this.f74426b;
    }

    /* renamed from: h */
    public final List mo40827h() {
        return this.f74427c;
    }

    /* renamed from: i */
    public final List mo40828i() {
        return this.f74429e;
    }

    /* renamed from: j */
    public final List mo40829j() {
        return this.f74428d;
    }
}
