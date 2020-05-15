package p000;

/* renamed from: bhzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhzd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhzk f119935a;

    public bhzd(bhzk bhzk) {
        this.f119935a = bhzk;
    }

    public final void run() {
        bhzk bhzk = this.f119935a;
        int i = bhzk.f119950a - 1;
        bhzk.f119950a = i;
        if (i == 0) {
            bhzk.f119951b = -1;
            bhzk.f119956g.mo64243b();
            bhzk.f119956g = null;
            bhzk.f119957h.mo64243b();
            bhzk.f119957h = null;
        }
        bhzk.f119950a = Math.max(0, bhzk.f119950a);
    }
}
