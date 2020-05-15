package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: brhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class brhj {

    /* renamed from: a */
    private static WeakReference f142853a;

    /* renamed from: a */
    public static synchronized brhj m114016a(Context context) {
        brhj brhj;
        synchronized (brhj.class) {
            sdo.m34959a(context);
            if (f142853a != null) {
                brhj = (brhj) f142853a.get();
            } else {
                brhj = null;
            }
            if (brhj == null) {
                brhj = new brin(context.getApplicationContext());
                f142853a = new WeakReference(brhj);
            }
        }
        return brhj;
    }

    /* renamed from: a */
    public abstract aucb mo32869a(brhy... brhyArr);

    /* renamed from: a */
    public abstract aucb mo32870a(String... strArr);

    /* renamed from: b */
    public abstract aucb mo32872b(brhy... brhyArr);

    /* renamed from: b */
    public abstract aucb mo32873b(String... strArr);
}
