package p000;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: ambm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ambm {

    /* renamed from: a */
    public final DataHolder f74649a;

    /* renamed from: b */
    public final int f74650b;

    /* renamed from: c */
    public int f74651c = -1;

    public ambm(DataHolder dataHolder) {
        this.f74649a = dataHolder;
        this.f74650b = dataHolder.f30168h;
    }

    /* renamed from: a */
    public final String mo41109a(String str) {
        DataHolder dataHolder = this.f74649a;
        int i = this.f74651c;
        return dataHolder.mo17769c(str, i, dataHolder.mo17762a(i));
    }

    /* renamed from: a */
    public final boolean mo41110a() {
        int i = this.f74651c + 1;
        this.f74651c = i;
        return i >= 0 && i < this.f74650b;
    }
}
