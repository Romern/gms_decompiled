package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: bigb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bigb {

    /* renamed from: a */
    public final rkb f120491a;

    /* renamed from: b */
    public bhtr f120492b = null;

    /* renamed from: c */
    public boolean f120493c = false;

    /* renamed from: d */
    public boolean f120494d = false;

    /* renamed from: e */
    public final aeja f120495e;

    /* renamed from: f */
    private final Context f120496f;

    /* renamed from: g */
    private final Intent f120497g;

    public bigb(Context context, rkb rkb, aeja aeja) {
        this.f120496f = context;
        this.f120491a = rkb;
        this.f120495e = aeja;
        Intent intent = new Intent("com.google.android.places.signals.action.activity_recognition");
        this.f120497g = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* renamed from: a */
    public final void mo64585a() {
        mo64586a(false);
    }

    /* renamed from: b */
    public final PendingIntent mo64587b() {
        return PendingIntent.getBroadcast(this.f120496f, 0, this.f120497g, 134217728);
    }

    /* renamed from: a */
    public final void mo64586a(boolean z) {
        if (!this.f120494d) {
            return;
        }
        if (this.f120493c) {
            this.f120491a.mo24801e();
            rkb rkb = this.f120491a;
            rkb.mo24790a((rjz) new biga(this, rkb, z));
        } else if (z) {
            this.f120491a.mo24803g();
        }
    }
}
