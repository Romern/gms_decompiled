package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ddh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddh {

    /* renamed from: a */
    public final int f12929a;

    /* renamed from: b */
    public final bujf f12930b;

    /* renamed from: c */
    public List f12931c = new ArrayList();

    /* renamed from: d */
    public List f12932d = new ArrayList();

    /* renamed from: e */
    public long f12933e;

    /* renamed from: f */
    public final int[] f12934f;

    /* renamed from: g */
    public int f12935g = 0;

    public ddh(int i, long j, bujf bujf) {
        this.f12929a = i;
        this.f12933e = j;
        this.f12930b = bujf;
        this.f12934f = new int[(i + 1)];
    }

    /* renamed from: a */
    public final List mo8539a(int i) {
        ArrayList arrayList = new ArrayList();
        List list = this.f12931c;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            i--;
            arrayList.add(((ddg) list.get(i2)).f12926a);
            i2++;
            if (i <= 0) {
                break;
            }
        }
        return arrayList;
    }
}
