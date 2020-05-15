package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alvx {

    /* renamed from: a */
    protected final alvw f74422a;

    public alvx(alvw alvw) {
        this.f74422a = alvw;
    }

    /* renamed from: a */
    public static Object m61958a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean z = true;
        if (arrayList.size() != 1) {
            z = false;
        }
        sdo.m34970a(z);
        return arrayList.get(0);
    }

    /* renamed from: a */
    public abstract String mo40819a();

    /* renamed from: b */
    public abstract String mo40821b();

    /* renamed from: c */
    public abstract boolean mo40822c();

    /* renamed from: d */
    public abstract String mo40823d();

    /* renamed from: e */
    public abstract int mo40824e();

    /* renamed from: f */
    public abstract String mo40825f();

    /* renamed from: g */
    public abstract List mo40826g();

    /* renamed from: h */
    public abstract List mo40827h();

    /* renamed from: i */
    public abstract List mo40828i();

    /* renamed from: j */
    public abstract List mo40829j();

    /* renamed from: a */
    public static ArrayList m61959a(DataHolder dataHolder, int i) {
        ArrayList arrayList = new ArrayList();
        if (dataHolder != null) {
            for (int i2 = 0; i2 < dataHolder.f30168h; i2++) {
                if (i == dataHolder.mo17767b("ordinal", i2, dataHolder.mo17762a(i2))) {
                    arrayList.add(new alvw(dataHolder, i2));
                } else if (!arrayList.isEmpty()) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo40820a(String str) {
        return this.f74422a.mo40818j(str);
    }
}
