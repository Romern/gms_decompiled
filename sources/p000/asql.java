package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: asql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asql {

    /* renamed from: a */
    public static volatile WeakReference f89391a = new WeakReference(null);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public static void m74466a(Context context) {
        if (cgwn.m147267q()) {
            aeat a = aeat.m51532a(context);
            aebi aebi = new aebi();
            aebi.mo34004a(0L, 1L);
            aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
            aebi.f63099k = "globalactions.state";
            aebi.mo34023a(2);
            aebi.mo34024a(0, 0);
            aebi.mo34027b(0);
            a.mo33984a(aebi.mo33974b());
        }
    }

    /* renamed from: a */
    public static void m74467a(asqk asqk) {
        f89391a = new WeakReference(asqk);
    }
}
