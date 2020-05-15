package p000;

import java.io.PrintWriter;

/* renamed from: bfoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfoq extends bfop {
    public bfoq(bfos bfos, long j, String str, Object obj, int i, int i2, int i3) {
        super(bfos, j, str, obj, i, i2, i3);
    }

    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        String str;
        Object obj = this.f114572i;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = "";
        }
        String str2 = this.f114574k;
        if (str2 != null) {
            printWriter.print(String.format(str2, str, Integer.valueOf(this.f114569f), Integer.valueOf(this.f114570g), Integer.valueOf(this.f114571h)));
            return;
        }
        printWriter.print(str);
    }
}
