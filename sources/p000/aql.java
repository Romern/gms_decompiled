package p000;

import androidx.slice.SliceItem;

/* renamed from: aql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aql implements aqp {

    /* renamed from: a */
    final /* synthetic */ String f2006a;

    /* renamed from: b */
    final /* synthetic */ String[] f2007b;

    /* renamed from: c */
    final /* synthetic */ String[] f2008c;

    public aql(String str, String[] strArr, String[] strArr2) {
        this.f2006a = str;
        this.f2007b = strArr;
        this.f2008c = strArr2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2302a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return aqq.m1882b(sliceItem, this.f2006a) && aqq.m1883b(sliceItem, this.f2007b) && !aqq.m1878a(sliceItem, this.f2008c);
    }
}
