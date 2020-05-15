package p000;

import android.util.Log;

/* renamed from: bftx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bftx {

    /* renamed from: a */
    private static bhda f115271a;

    /* renamed from: a */
    public static synchronized void m97876a(bhda bhda) {
        synchronized (bftx.class) {
            f115271a = bhda;
        }
    }

    /* renamed from: a */
    public static void m97877a(String str, Object... objArr) {
        bhda bhda = f115271a;
        if (bhda != null) {
            String format = String.format(str, objArr);
            Log.println(3, "GCoreFlp", format);
            bggo bggo = (bggo) bhda;
            if (bggo.f116398b != null) {
                String num = bggo.f116397a.length > 3 ? bggo.f116397a[3] : Integer.toString(3);
                bfor bfor = bggo.f116398b;
                bfor.mo62047a(new bgfn(bfos.LOG, bfor.mo62055b(), num, "GCoreFlp", format));
            }
        }
    }
}
