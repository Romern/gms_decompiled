package p000;

import android.util.Log;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: bhqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqc implements bhqa {

    /* renamed from: a */
    private sbc f119303a = null;

    /* renamed from: a */
    public final synchronized PlaceEntity mo64151a(String str, long j) {
        sbc sbc = this.f119303a;
        if (sbc == null) {
            if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "lookup() invoked on closed place cache");
            }
            return null;
        }
        return (PlaceEntity) sbc.mo25325a(str);
    }

    /* renamed from: a */
    public final synchronized void mo64152a() {
        this.f119303a = null;
    }

    /* renamed from: b */
    public final synchronized void mo64155b(long j) {
        if (this.f119303a == null) {
            this.f119303a = new sbc((int) cggp.m145342c(), cggp.m145341b(), cggp.m145341b(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo64153a(long j) {
        sbc sbc = this.f119303a;
        if (sbc != null) {
            sbc.mo25326a();
        } else if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "clear() invoked on closed place cache");
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final synchronized void mo64154a(Collection r4, long j) {
        if (this.f119303a != null) {
            int size = r4.size();
            for (int i = 0; i < size; i++) {
                PlaceEntity placeEntity = (PlaceEntity) r4.get(i);
                this.f119303a.mo25327a(placeEntity.f79535a, placeEntity);
            }
        } else if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "insert() invoked on closed place cache");
        }
    }
}
