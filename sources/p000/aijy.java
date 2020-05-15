package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: aijy */
final /* synthetic */ class aijy implements Callable {

    /* renamed from: a */
    private final aijz f69003a;

    public aijy(aijz aijz) {
        this.f69003a = aijz;
    }

    public final Object call() {
        Object obj;
        aijz aijz = this.f69003a;
        Context context = aijz.f69004a;
        String str = aijz.f69005b;
        airj airj = aijz.f69006c;
        int i = aijz.f69007d;
        if (cfnv.m140746H()) {
            obj = aira.m57762a(context, str, airj, i);
        } else {
            obj = aiqy.m57748a(context, str, airj);
        }
        if (obj != null) {
            return obj;
        }
        throw new RuntimeException(String.format("Failed to create an outgoing MultiplexBleSocket to %s.", aijz.f69005b));
    }
}
