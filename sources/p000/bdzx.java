package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: bdzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdzx extends BroadcastReceiver {

    /* renamed from: a */
    private static final Object f106707a = new Object();

    /* renamed from: b */
    private static final bnkd f106708b = bnnm.m109865a(bndu.m109109r());

    /* renamed from: c */
    private static volatile boolean f106709c;

    /* renamed from: a */
    public static void m91650a(Context context, String str, bdzw bdzw) {
        f106708b.mo67268a(str, bdzw);
        if (!f106709c) {
            synchronized (f106707a) {
                if (!f106709c) {
                    context.registerReceiver(new bdzx(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                    f106709c = true;
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            synchronized (f106708b) {
                arrayList = new ArrayList(f106708b.mo67124a(stringExtra));
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bdzw) arrayList.get(i)).mo58458a();
            }
        }
    }
}
