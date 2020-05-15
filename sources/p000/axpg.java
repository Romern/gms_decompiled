package p000;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: axpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axpg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MessageEventParcelable f96241a;

    /* renamed from: b */
    final /* synthetic */ axpo f96242b;

    public axpg(axpo axpo, MessageEventParcelable messageEventParcelable) {
        this.f96242b = axpo;
        this.f96241a = messageEventParcelable;
    }

    public final void run() {
        this.f96242b.f96251a.mo7590a(this.f96241a);
    }
}
