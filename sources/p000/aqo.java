package p000;

import androidx.slice.SliceItem;

/* renamed from: aqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqo implements aqp {

    /* renamed from: a */
    final /* synthetic */ String f2013a;

    /* renamed from: b */
    final /* synthetic */ String[] f2014b;

    /* renamed from: c */
    final /* synthetic */ String[] f2015c;

    public aqo(String str, String[] strArr, String[] strArr2) {
        this.f2013a = str;
        this.f2014b = strArr;
        this.f2015c = strArr2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2302a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return aqq.m1882b(sliceItem, this.f2013a) && aqq.m1883b(sliceItem, this.f2014b) && !aqq.m1878a(sliceItem, this.f2015c);
    }
}
