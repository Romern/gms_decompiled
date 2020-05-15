package p000;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bfuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfuo {

    /* renamed from: f */
    protected final Set f115363f = new HashSet();

    /* renamed from: g */
    protected final rjx f115364g;

    public bfuo(Context context) {
        this.f115364g = aeie.m51878c(context);
    }

    /* renamed from: a */
    public abstract float mo62268a();

    /* renamed from: a */
    public abstract void mo62269a(Location location);

    /* renamed from: a */
    public final void mo62288a(DeviceOrientationRequestInternal deviceOrientationRequestInternal) {
        this.f115363f.add(deviceOrientationRequestInternal);
        mo62272c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62270a(PrintWriter printWriter);

    /* renamed from: b */
    public final void mo62289b(DeviceOrientationRequestInternal deviceOrientationRequestInternal) {
        this.f115363f.remove(deviceOrientationRequestInternal);
        mo62272c();
    }

    /* renamed from: b */
    public abstract boolean mo62271b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo62272c();
}
