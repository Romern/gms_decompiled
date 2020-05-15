package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: cifs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cifs implements ciew {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85859a() {
        return Executors.newCachedThreadPool(ciag.m149918c("grpc-okhttp-%d"));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85860a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
