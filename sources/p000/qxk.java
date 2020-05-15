package p000;

import com.google.android.gms.phenotype.GenericDimension;
import java.util.Arrays;

/* renamed from: qxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxk implements Comparable {

    /* renamed from: a */
    public final GenericDimension[] f42368a;

    /* renamed from: b */
    public final byte[] f42369b;

    public qxk(GenericDimension[] genericDimensionArr, byte[] bArr) {
        this.f42368a = genericDimensionArr == null ? qxq.f42376a.f42368a : genericDimensionArr;
        this.f42369b = bArr == null ? qxq.f42376a.f42369b : bArr;
        Arrays.sort(this.f42368a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qxk qxk = (qxk) obj;
        int compare = qxq.f42379n.compare(this.f42368a, qxk.f42368a);
        return compare == 0 ? qxq.f42378m.compare(this.f42369b, qxk.f42369b) : compare;
    }
}
