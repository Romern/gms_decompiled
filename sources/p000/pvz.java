package p000;

import com.google.android.gms.cast.ApplicationMetadata;

/* renamed from: pvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pvz implements Runnable {

    /* renamed from: a */
    private final String f40419a;

    /* renamed from: b */
    private final ApplicationMetadata f40420b;

    /* renamed from: c */
    private final pvw f40421c;

    public pvz(String str, ApplicationMetadata applicationMetadata, pvw pvw) {
        this.f40419a = str;
        this.f40420b = applicationMetadata;
        this.f40421c = pvw;
    }

    public final void run() {
        this.f40421c.mo23700a(this.f40419a, this.f40420b);
    }
}
