package p000;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

/* renamed from: bjbo */
final /* synthetic */ class bjbo implements Callable {

    /* renamed from: a */
    private final bjbp f122477a;

    /* renamed from: b */
    private final byte[] f122478b;

    public bjbo(bjbp bjbp, byte[] bArr) {
        this.f122477a = bjbp;
        this.f122478b = bArr;
    }

    public final Object call() {
        CompletableFuture completableFuture;
        bjbp bjbp = this.f122477a;
        byte[] bArr = this.f122478b;
        Context context = bjbp.f122483d;
        bjbv.m103172a();
        if (bjbt.m103168a(context)) {
            completableFuture = CompletableFuture.completedFuture(null);
        } else {
            CompletableFuture completableFuture2 = new CompletableFuture();
            bjbs bjbs = new bjbs(context, completableFuture2);
            context.registerReceiver(bjbs, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            completableFuture = completableFuture2.whenComplete((BiConsumer) new bjbr(context, bjbs));
        }
        completableFuture.get();
        File file = bjbp.f122481b;
        if (file == null) {
            file = bjbp.f122482c;
        }
        bjbp.m103163a(file);
        bjbk.m103156a(new File(file, String.format(Locale.US, "event_%s.protobuf", UUID.randomUUID())), bArr);
        return null;
    }
}
