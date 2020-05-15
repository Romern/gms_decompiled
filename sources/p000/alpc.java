package p000;

import android.content.Context;

/* renamed from: alpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpc extends alop {

    /* renamed from: b */
    private final alok f74001b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo40621d(Context context) {
        alok alok = this.f74001b;
        if (alok == null) {
            return super.mo40621d(context);
        }
        String str = this.f73969a;
        byte[] a = alok.mo40618a(str);
        if (a != null) {
            return a;
        }
        byte[] d = super.mo40621d(context);
        if (d != null) {
            alok alok2 = this.f74001b;
            amig.m62939a();
            alok2.mo40617a(str, d, ((Long) amhh.f74910a.mo41191a()).longValue());
        }
        return d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public alpc(Context context, String str, int i, alok alok, almp almp, String str2, int i2, int i3) {
        super(str, i, r3, almp, r5, "LoadAvatarByUrl");
        boolean z;
        String a = ancc.m63968a(context, str2, i2, i3);
        if ((i3 & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f74001b = alok;
    }
}
