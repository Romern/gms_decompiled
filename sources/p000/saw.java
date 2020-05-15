package p000;

import android.app.Activity;
import android.content.Intent;

/* renamed from: saw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class saw extends saz {

    /* renamed from: a */
    final /* synthetic */ Intent f43972a;

    /* renamed from: b */
    final /* synthetic */ Activity f43973b;

    /* renamed from: c */
    final /* synthetic */ int f43974c;

    public saw(Intent intent, Activity activity, int i) {
        this.f43972a = intent;
        this.f43973b = activity;
        this.f43974c = i;
    }

    /* renamed from: a */
    public final void mo25323a() {
        Intent intent = this.f43972a;
        if (intent != null) {
            this.f43973b.startActivityForResult(intent, this.f43974c);
        }
    }
}
