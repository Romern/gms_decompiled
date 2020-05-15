package p000;

import org.json.JSONObject;

/* renamed from: cill */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cill implements Runnable {

    /* renamed from: a */
    private final brhc f190639a;

    /* renamed from: b */
    private final brep f190640b;

    /* renamed from: c */
    private final JSONObject f190641c;

    /* renamed from: d */
    private final String f190642d;

    /* renamed from: e */
    private final String f190643e;

    /* renamed from: f */
    private final brgl f190644f;

    public cill(JSONObject jSONObject, brhc brhc, brgl brgl, brep brep, String str, String str2) {
        this.f190641c = jSONObject;
        this.f190639a = brhc;
        this.f190644f = brgl;
        this.f190640b = brep;
        this.f190642d = str;
        this.f190643e = str2;
    }

    public final void run() {
        this.f190644f.mo69517a(this.f190642d, new ciku(this.f190641c, this.f190639a, this.f190640b, this.f190643e));
    }
}
