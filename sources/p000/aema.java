package p000;

import android.content.Context;

@Deprecated
/* renamed from: aema */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aema {

    /* renamed from: a */
    public static final rjo f63501a = new rjo("Places.GEO_DATA_API", new aend(), f63503c);

    /* renamed from: b */
    public static final rjo f63502b = new rjo("Places.PLACE_DETECTION_API", new aenz(), f63504d);

    /* renamed from: c */
    public static final rje f63503c = new rje();

    /* renamed from: d */
    public static final rje f63504d = new rje();
    @Deprecated

    /* renamed from: e */
    public static final aenc f63505e = new aenc();

    @Deprecated
    /* renamed from: a */
    public static aelm m52140a(Context context) {
        return m52141a(context, null);
    }

    @Deprecated
    /* renamed from: b */
    public static aeky m52142b(Context context, aemi aemi) {
        if (aemi == null) {
            aemi = new aemh().mo34328a();
        }
        return new aeky(context, aemi);
    }

    @Deprecated
    /* renamed from: a */
    public static aelm m52141a(Context context, aemi aemi) {
        if (aemi == null) {
            aemi = new aemh().mo34328a();
        }
        return new aelm(context, f63502b, aemi);
    }
}
