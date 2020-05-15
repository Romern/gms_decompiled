package p000;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.List;

/* renamed from: bfsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfsl implements bfrz {

    /* renamed from: a */
    public int f115126a = 0;

    /* renamed from: b */
    public int f115127b = 0;

    /* renamed from: c */
    public final bfvq f115128c;

    /* renamed from: d */
    public final Looper f115129d;

    /* renamed from: e */
    public final bfsa f115130e;

    /* renamed from: f */
    public final bfsf f115131f = new bfsg(this);

    /* renamed from: g */
    public final bfsf f115132g = new bfsj(this);

    /* renamed from: h */
    public final bfsf f115133h = new bfsh(this);

    /* renamed from: i */
    public final bfsf f115134i = new bfsi(this);

    /* renamed from: j */
    public bfsk f115135j;

    /* renamed from: k */
    public bfsf f115136k = this.f115131f;

    /* renamed from: l */
    public boolean f115137l = false;

    /* renamed from: m */
    public long f115138m = -1;

    /* renamed from: n */
    public long f115139n = 0;

    public bfsl(Context context, Looper looper) {
        bfsa bfsa = new bfsa(looper, context);
        int i = Build.VERSION.SDK_INT;
        bfvq bfvq = new bfvq(new bgod((SensorManager) context.getSystemService("sensor"), cese.m138166o()));
        this.f115130e = bfsa;
        this.f115128c = bfvq;
        this.f115129d = looper;
    }

    /* renamed from: a */
    public static final boolean m97720a(Location location) {
        return ((double) location.getSpeed()) >= cewd.m138341d();
    }

    /* renamed from: a */
    public final void mo62153a(List list) {
    }

    /* renamed from: a */
    public final void mo62154a(NetworkLocationStatus[] networkLocationStatusArr) {
    }

    /* renamed from: b */
    public final void mo62211b(List list) {
        if (!list.isEmpty()) {
            this.f115136k.mo62206a(list);
        }
    }

    /* renamed from: d */
    public final void mo62159d() {
    }

    /* renamed from: a */
    public final void mo62150a(ActivityRecognitionResult activityRecognitionResult) {
        this.f115136k.mo62205a(activityRecognitionResult);
    }
}
