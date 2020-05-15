package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: nli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nli {
    /* renamed from: a */
    public static Intent m26724a(int i, bpdn bpdn, String str) {
        Intent intent = new Intent();
        intent.setComponent(nzg.f37005g);
        intent.addFlags(268435456);
        intent.putExtra("connection_type", i);
        intent.putExtra("error_code", bpdn.f136282v);
        if (!bmxx.m108577a(str)) {
            intent.putExtra("error_details", str);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m26725a(Context context, bpdn bpdn, int i, bpdo bpdo) {
        bmxy.m108582a(bpdn, "errorCode is necessary");
        if (bpdn != bpdn.PROTOCOL_IO_ERROR && bpdn != bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_USER && bpdn != bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_CAR && bpdo != bpdo.BYEBYE_TIMEOUT) {
            context.startActivity(m26724a(i, bpdn, null));
        }
    }
}
