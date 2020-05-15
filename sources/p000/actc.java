package p000;

import android.content.Context;

/* renamed from: actc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actc {

    /* renamed from: a */
    private static final Object f60718a = new Object();

    /* renamed from: b */
    private static volatile actc f60719b;

    /* renamed from: c */
    private final beju f60720c;

    private actc(Context context) {
        befa befa = new befa(bngx.m109356a(new befu()));
        bejv bejv = new bejv();
        bejv.f111685a = snp.m35702a(10);
        bejv.f111686b = befa;
        bejv.mo60768a(bejj.f111648a);
        long r = cema.f182934a.mo6606a().mo79316r();
        if (r != 0) {
            bely a = belz.m95285a(context);
            belr a2 = bels.m95262a(context);
            a2.f111790b = snp.m35704b(10);
            a2.f111791c = batx.m87540a(new aytg(), a.mo60792a(), (int) r);
            bejv.mo60767a(a2.mo60784a(), a);
        }
        this.f60720c = bejv.mo60766a();
    }

    /* renamed from: a */
    public static beju m49832a(Context context) {
        if (f60719b == null) {
            synchronized (f60718a) {
                if (f60719b == null) {
                    f60719b = new actc(context.getApplicationContext());
                }
            }
        }
        return f60719b.f60720c;
    }
}
