package p000;

import com.google.android.gms.fido.u2f.api.common.ResponseData;
import org.json.JSONObject;

/* renamed from: yae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yae {

    /* renamed from: a */
    public String f53517a;

    /* renamed from: b */
    public Integer f53518b;

    /* renamed from: c */
    private JSONObject f53519c;

    /* renamed from: a */
    public static yae m43716a() {
        return new yae();
    }

    /* renamed from: b */
    public final yaf mo30301b() {
        return new yaf(this.f53517a, this.f53518b, this.f53519c);
    }

    /* renamed from: a */
    public final void mo30300a(ResponseData responseData) {
        this.f53519c = responseData != null ? responseData.mo18664a() : null;
    }
}
