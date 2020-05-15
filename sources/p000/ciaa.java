package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ciaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciaa implements ciew {
    public final String toString() {
        return "grpc-default-executor";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85859a() {
        return Executors.newCachedThreadPool(ciag.m149918c("grpc-default-executor-%d"));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85860a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
