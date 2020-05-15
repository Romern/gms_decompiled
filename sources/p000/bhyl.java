package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bhyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhyt f119896a;

    public bhyl(bhyt bhyt) {
        this.f119896a = bhyt;
    }

    public final void run() {
        bhyt bhyt = this.f119896a;
        int i = bhyt.f119914a;
        if (i == 0) {
            if (bhyt.f119916c == null) {
                bhyt.f119916c = new sbc((int) cgfr.m145048c(), cgfr.m145047b(), cgfr.m145047b(), TimeUnit.MILLISECONDS);
            }
            if (bhyt.f119917d == null) {
                bhyt.f119917d = new sbc((int) cgfr.m145049d(), cgfr.m145047b(), cgfr.m145047b(), TimeUnit.MILLISECONDS);
            }
            bhyt.f119914a = 1;
            return;
        }
        bhyt.f119914a = i + 1;
    }
}
