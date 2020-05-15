package p000;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class pil {

    /* renamed from: a */
    public final CastDevice f39230a;

    /* renamed from: b */
    protected final ScheduledExecutorService f39231b;

    public pil(CastDevice castDevice, ScheduledExecutorService scheduledExecutorService) {
        this.f39230a = castDevice;
        this.f39231b = scheduledExecutorService;
    }

    /* renamed from: a */
    public abstract void mo23198a();

    /* renamed from: a */
    public abstract void mo23199a(EqualizerSettings equalizerSettings);

    /* renamed from: a */
    public abstract void mo23200a(String str);

    /* renamed from: a */
    public abstract void mo23201a(String str, LaunchOptions launchOptions);

    /* renamed from: a */
    public abstract void mo23202a(String str, String str2);

    /* renamed from: a */
    public abstract void mo23203a(String str, String str2, long j);

    /* renamed from: a */
    public abstract void mo23204a(String str, String str2, long j, String str3);

    /* renamed from: a */
    public abstract void mo23205a(String str, String str2, JoinOptions joinOptions);

    /* renamed from: a */
    public abstract void mo23206a(String str, byte[] bArr, long j);

    /* renamed from: a */
    public abstract void mo23207a(boolean z);

    /* renamed from: a */
    public abstract boolean mo23208a(double d, double d2, boolean z);

    /* renamed from: a */
    public abstract boolean mo23209a(boolean z, double d, boolean z2);

    /* renamed from: b */
    public abstract void mo23210b(String str);

    /* renamed from: b */
    public abstract boolean mo23211b();

    /* renamed from: c */
    public abstract void mo23212c(String str);

    /* renamed from: c */
    public abstract boolean mo23213c();

    /* renamed from: d */
    public abstract boolean mo23214d();

    /* renamed from: e */
    public abstract void mo23215e();

    /* renamed from: f */
    public abstract void mo23216f();

    /* renamed from: g */
    public abstract String mo23217g();
}
