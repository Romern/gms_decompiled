package p000;

import androidx.slice.SliceItem;

/* renamed from: aqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqj implements aqp {

    /* renamed from: a */
    final /* synthetic */ String f2001a;

    /* renamed from: b */
    final /* synthetic */ String[] f2002b;

    public aqj(String str, String[] strArr) {
        this.f2001a = str;
        this.f2002b = strArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2302a(Object obj) {
        SliceItem sliceItem = (SliceItem) obj;
        return aqq.m1882b(sliceItem, this.f2001a) && aqq.m1883b(sliceItem, this.f2002b) && !aqq.m1878a(sliceItem, null);
    }
}
