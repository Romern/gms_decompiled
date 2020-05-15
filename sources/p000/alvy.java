package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: alvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alvy extends alvx {

    /* renamed from: b */
    private final List f74423b;

    /* renamed from: c */
    private final List f74424c;

    /* renamed from: d */
    private final List f74425d;

    public alvy(alvw alvw, DataHolder dataHolder, DataHolder dataHolder2, DataHolder dataHolder3, int i) {
        super(alvw);
        ArrayList arrayList = new ArrayList();
        ArrayList a = alvx.m61959a(dataHolder, i);
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            alvw alvw2 = (alvw) a.get(i2);
            arrayList.add(new alvs(alvw2.mo40818j("postal_address"), alvw2.mo40818j("type")));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList a2 = alvx.m61959a(dataHolder2, i);
        int size2 = a2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            alvw alvw3 = (alvw) a2.get(i3);
            arrayList2.add(new alvu(alvw3.mo40818j("email"), alvw3.mo40818j("type")));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList a3 = alvx.m61959a(dataHolder3, i);
        int size3 = a3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            alvw alvw4 = (alvw) a3.get(i4);
            arrayList3.add(new alvv(alvw4.mo40818j("phone"), alvw4.mo40818j("type")));
        }
        this.f74423b = Collections.unmodifiableList(arrayList);
        this.f74424c = Collections.unmodifiableList(arrayList2);
        this.f74425d = Collections.unmodifiableList(arrayList3);
    }

    /* renamed from: a */
    public final String mo40819a() {
        return mo40820a("display_name");
    }

    /* renamed from: b */
    public final String mo40821b() {
        return mo40820a("gaia_id");
    }

    /* renamed from: c */
    public final boolean mo40822c() {
        return false;
    }

    /* renamed from: d */
    public final String mo40823d() {
        return null;
    }

    /* renamed from: e */
    public final int mo40824e() {
        return 0;
    }

    /* renamed from: f */
    public final String mo40825f() {
        return null;
    }

    /* renamed from: g */
    public final List mo40826g() {
        return null;
    }

    /* renamed from: h */
    public final List mo40827h() {
        return this.f74423b;
    }

    /* renamed from: i */
    public final List mo40828i() {
        return this.f74425d;
    }

    /* renamed from: j */
    public final List mo40829j() {
        return this.f74424c;
    }
}
