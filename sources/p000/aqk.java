package p000;

import androidx.slice.SliceItem;

/* renamed from: aqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqk implements aqp {

    /* renamed from: a */
    final /* synthetic */ String f2003a;

    /* renamed from: b */
    final /* synthetic */ String[] f2004b;

    /* renamed from: c */
    final /* synthetic */ String[] f2005c;

    public aqk(String str, String[] strArr, String[] strArr2) {
        this.f2003a = str;
        this.f2004b = strArr;
        this.f2005c = strArr2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2302a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return aqq.m1882b(sliceItem, this.f2003a) && aqq.m1883b(sliceItem, this.f2004b) && !aqq.m1878a(sliceItem, this.f2005c);
    }
}
