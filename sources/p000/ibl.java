package p000;

import com.android.volley.NetworkResponse;

/* renamed from: ibl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibl extends Exception {

    /* renamed from: a */
    public final int f20680a;

    /* renamed from: b */
    public final NetworkResponse f20681b;

    public ibl(String str, int i, NetworkResponse networkResponse) {
        super(str);
        this.f20680a = i;
        this.f20681b = networkResponse;
    }
}
