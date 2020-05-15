package p000;

/* renamed from: bhym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhym implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhyt f119897a;

    public bhym(bhyt bhyt) {
        this.f119897a = bhyt;
    }

    public final void run() {
        bhyt bhyt = this.f119897a;
        int i = bhyt.f119914a - 1;
        bhyt.f119914a = i;
        if (i == 0) {
            bhyt.f119916c = null;
            bhyt.f119917d = null;
        }
        bhyt.f119914a = Math.max(0, i);
    }
}
