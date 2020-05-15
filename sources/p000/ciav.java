package p000;

/* renamed from: ciav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciav implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibi f189685a;

    public ciav(cibi cibi) {
        this.f189685a = cibi;
    }

    public final void run() {
        this.f189685a.f189713d.mo85552a(2, "Terminated");
        cibi cibi = this.f189685a;
        cibb cibb = cibi.f189710a;
        cibb.f189697a.f189792i.f189846u.remove(cibi);
        chsc.m149478b(cibb.f189697a.f189792i.f189808F.f189084d, cibi);
        cibb.f189697a.f189792i.mo85964o();
    }
}
