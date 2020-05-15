package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: rpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rpi extends sbi {
    public rpi(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean mo24988a(Thread thread, Throwable th) {
        String str;
        try {
            String c = sqd.m35970c(sqq.m35991a(ModuleManager.get(this.f43992a)).mo25982a());
            if (c == null) {
                str = "";
            } else {
                String a = bmxr.m108544a("\n").mo66874a(bmyx.m108641a(((Integer) rsv.f43635x.mo25081c()).intValue()).mo66918a((CharSequence) c));
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20);
                sb.append(a);
                sb.append("\n");
                sb.append("GCore-Chimera-Crash");
                str = sb.toString();
            }
            Log.i("GCore-Chimera-Crash", str);
            return false;
        } catch (RuntimeException e) {
            Log.e("GCore-Chimera-Crash", "Hit an exception while processing the UncaughtExceptionHandler:", e);
            return false;
        }
    }
}
