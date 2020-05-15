package p000;

import com.google.android.gms.asterism.GetAsterismConsentResponse;

/* renamed from: gbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbf {

    /* renamed from: a */
    public int f17817a;

    /* renamed from: b */
    public int f17818b;

    /* renamed from: a */
    public final GetAsterismConsentResponse mo11614a() {
        int i = this.f17818b;
        if (!(i == 0 || i == 1)) {
            i = 2;
        }
        return new GetAsterismConsentResponse(this.f17817a, i);
    }
}
