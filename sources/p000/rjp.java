package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: rjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rjp extends Exception {
    @Deprecated

    /* renamed from: a */
    public final Status f43152a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public rjp(Status status) {
        super(r3.toString());
        int i = status.f30115i;
        String str = status.f30116j;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.f43152a = status;
    }

    /* renamed from: a */
    public final int mo24655a() {
        return this.f43152a.f30115i;
    }

    @Deprecated
    /* renamed from: b */
    public final String mo24656b() {
        return this.f43152a.f30116j;
    }
}
