package p000;

import android.location.Location;
import java.util.concurrent.Callable;

/* renamed from: bfsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsp implements Callable {

    /* renamed from: a */
    final /* synthetic */ boolean f115154a;

    /* renamed from: b */
    final /* synthetic */ bfsr f115155b;

    public bfsp(bfsr bfsr, boolean z) {
        this.f115155b = bfsr;
        this.f115154a = z;
    }

    /* renamed from: a */
    public final Location call() {
        return this.f115155b.f114732e.mo62068a(this.f115154a);
    }
}
