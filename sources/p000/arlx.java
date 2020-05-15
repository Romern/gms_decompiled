package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arlx implements auca {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aucb mo13157a(Object obj) {
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        if (str.endsWith("@google.com")) {
            return aucu.m76778a(str);
        }
        throw new rjp(new Status(10501));
    }
}
