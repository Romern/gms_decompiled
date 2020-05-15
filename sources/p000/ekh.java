package p000;

import java.util.Map;

/* renamed from: ekh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ekh {
    /* renamed from: a */
    public final long mo10235a(eie eie, long j, int i) {
        long a = mo10216a().mo10275a();
        ekf ekf = (ekf) mo10217b().get(eie);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * ekf.mo10222a(), j - a), ekf.mo10223b());
    }

    /* renamed from: a */
    public abstract eme mo10216a();

    /* renamed from: b */
    public abstract Map mo10217b();
}
