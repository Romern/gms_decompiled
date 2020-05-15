package p000;

/* renamed from: azim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azim implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Boolean f99483a;

    /* renamed from: b */
    final /* synthetic */ azio f99484b;

    public azim(azio azio, Boolean bool) {
        this.f99484b = azio;
        this.f99483a = bool;
    }

    public final void run() {
        azio azio = this.f99484b;
        Boolean bool = this.f99483a;
        azio.f99486a.setChecked(bool.booleanValue());
        azio.f99487b.f99497f = bool;
        azio.f99486a.mo26102a(new azin(azio));
    }
}
