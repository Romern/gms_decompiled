package p000;

import android.animation.AnimatorListenerAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fai {

    /* renamed from: a */
    final /* synthetic */ fak f16149a;

    /* renamed from: b */
    private int f16150b = 0;

    public fai(fak fak, JSONObject jSONObject) {
        this.f16149a = fak;
        try {
            this.f16150b = jSONObject.getInt("op") - jSONObject.getInt("ip");
            fak.f16159g.mo4055b(jSONObject.toString());
        } catch (JSONException e) {
            this.f16150b = 0;
        }
    }

    /* renamed from: a */
    public final float mo10632a(int i) {
        int i2 = this.f16150b;
        if (i2 != 0) {
            return ((float) i) / ((float) i2);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo10633a(bsus bsus, AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.f16150b != 0) {
            float a = mo10632a(bsus.f147184a);
            float a2 = mo10632a(bsus.f147185b);
            this.f16149a.f16159g.mo4059d();
            this.f16149a.f16159g.mo4044a(a, a2);
            this.f16149a.f16159g.mo4052b(a);
            this.f16149a.f16159g.mo4047a(animatorListenerAdapter);
            this.f16149a.f16159g.mo4042a();
        }
    }
}
