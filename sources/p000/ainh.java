package p000;

import java.util.concurrent.Callable;

/* renamed from: ainh */
final /* synthetic */ class ainh implements Callable {

    /* renamed from: a */
    private final aiof f69252a;

    /* renamed from: b */
    private final ains f69253b;

    /* renamed from: c */
    private final String f69254c;

    /* renamed from: d */
    private final int f69255d;

    public ainh(aiof aiof, ains ains, String str, int i) {
        this.f69252a = aiof;
        this.f69253b = ains;
        this.f69254c = str;
        this.f69255d = i;
    }

    public final Object call() {
        aiof aiof = this.f69252a;
        ains ains = this.f69253b;
        String str = this.f69254c;
        int i = this.f69255d;
        if (airr.SUCCESS == aiof.f69325f.mo37908b(ains)) {
            return airr.SUCCESS;
        }
        throw new RuntimeException(String.format("Failed to connect to Wifi hotspot (%s, %s).", str, Integer.valueOf(i)));
    }
}
