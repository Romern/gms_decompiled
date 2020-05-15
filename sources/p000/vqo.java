package p000;

import android.util.Log;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: vqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class vqo extends Enum implements vqr {

    /* renamed from: a */
    public static final vqo f49804a;

    /* renamed from: b */
    private static final bnhe f49805b = bnhe.m109409a("=[]", vqn.IS_EMPTY, "*=", vqn.CONTAINS);

    /* renamed from: c */
    private static final /* synthetic */ vqo[] f49806c;

    static {
        vqm vqm = new vqm("PROFILE");
        f49804a = vqm;
        f49806c = new vqo[]{vqm};
    }

    public vqo(String str) {
    }

    public static vqo[] values() {
        return (vqo[]) f49806c.clone();
    }

    /* renamed from: a */
    public final bmxz mo28752a(vqu vqu) {
        bmwc bmwc = (bmwc) vqu.mo28753a(f49805b);
        Long l = null;
        if (bmwc != vqn.IS_EMPTY) {
            try {
                l = Long.valueOf(Long.parseLong(vqu.f49822a, 16));
            } catch (NumberFormatException e) {
                Log.w("CAR.BT", "Could not parse value", e);
            }
        }
        return new vql(this, bmwc, l);
    }
}
