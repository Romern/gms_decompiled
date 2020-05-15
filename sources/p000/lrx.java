package p000;

import android.location.Location;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: lrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lrx {

    /* renamed from: a */
    public ActivityRecognitionResult f26656a;

    /* renamed from: b */
    public BeaconStateImpl f26657b;

    /* renamed from: c */
    public DataHolder f26658c;

    /* renamed from: d */
    public HeadphoneStateImpl f26659d;

    /* renamed from: e */
    public Location f26660e;

    /* renamed from: f */
    public WeatherImpl f26661f;

    /* renamed from: g */
    public TimeIntervalsImpl f26662g;

    /* renamed from: h */
    private ContextData f26663h;

    /* renamed from: i */
    private boolean f26664i = false;

    /* renamed from: a */
    public final Snapshot mo15413a() {
        return new Snapshot(this.f26656a, this.f26657b, this.f26659d, this.f26660e, null, this.f26658c, null, null, this.f26661f, this.f26662g, this.f26663h);
    }

    /* renamed from: a */
    public final void mo15414a(ContextData contextData) {
        if (this.f26663h != null) {
            dst.m9253a("Snapshot", "overwriting context data");
        }
        this.f26663h = contextData;
    }

    /* renamed from: a */
    public final boolean mo15415a(Object obj) {
        boolean z = this.f26664i;
        if (z) {
            dst.m9254a("Snapshot", "Failed to set %s", obj);
        }
        this.f26664i = true;
        return z;
    }
}
