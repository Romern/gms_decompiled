package p000;

import android.app.PendingIntent;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjj {

    /* renamed from: a */
    public static final rjo f46189a = lrh.f26630a;

    static {
        rjo rjo = lrh.f26630a;
    }

    @Deprecated
    /* renamed from: a */
    public static rke m37074a(rkb rkb, PendingIntent pendingIntent) {
        sdo.m34959a(pendingIntent);
        tjg tjg = new tjg(rkb, pendingIntent);
        rkb.mo24787a((rle) tjg);
        return tjg;
    }

    @Deprecated
    /* renamed from: b */
    public static WriteBatchImpl m37080b() {
        return new WriteBatchImpl();
    }

    @Deprecated
    /* renamed from: a */
    public static rke m37075a(rkb rkb, tiu tiu) {
        tly tly = new tly(rkb, tiu);
        rkb.mo24787a((rle) tly);
        return tly;
    }

    @Deprecated
    /* renamed from: b */
    public static rke m37081b(rkb rkb, tiu tiu) {
        tlw tlw = new tlw(rkb, tiu);
        rkb.mo24787a((rle) tlw);
        return tlw;
    }

    @Deprecated
    /* renamed from: a */
    public static rke m37076a(rkb rkb, tiu tiu, PendingIntent pendingIntent) {
        sdo.m34959a(pendingIntent);
        tje tje = new tje(rkb, tiu, pendingIntent);
        rkb.mo24787a((rle) tje);
        return tje;
    }

    @Deprecated
    /* renamed from: a */
    public static rke m37077a(rkb rkb, tiu tiu, tjc tjc) {
        sdo.m34959a(tjc);
        return rkb.mo24787a((rle) new tjd(rkb, tiu, tjc));
    }

    @Deprecated
    /* renamed from: a */
    public static rke m37078a(rkb rkb, tjc tjc) {
        sdo.m34959a(tjc);
        return rkb.mo24787a((rle) new tjf(rkb, tjc));
    }

    @Deprecated
    /* renamed from: a */
    public static tjh m37079a() {
        return new InterestUpdateBatchImpl();
    }
}
