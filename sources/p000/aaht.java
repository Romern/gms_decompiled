package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C0317b;

/* renamed from: aaht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaht extends C0317b {

    /* renamed from: a */
    private final int f28150a;

    public aaht(Context context, Looper looper, sac sac, sad sad, int i) {
        super(context, looper, 116, sac, sad);
        this.f28150a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof aahy) {
            return (aahy) queryLocalInterface;
        }
        return new aahw(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.gass.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return this.f28150a;
    }

    /* renamed from: n */
    public final aahy mo16878n() {
        return (aahy) super.mo25289B();
    }
}
